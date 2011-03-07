package it.univaq.mancoosi.validator.helper;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import it.univaq.mancoosi.validator.exceptions.ValidatorException;



public class UpgradePlan {
	
	private String operation;
	private String packageName;
	private Integer scriptsNum;
	private ArrayList<Operation> sequence;
	private PackageModelManager pkgModelManager;
	private Hashtable<String, Integer> missingStatements;
	

	public ArrayList<Operation> getSequence() {
		return this.sequence;
	}
	
	public UpgradePlan(String params) throws Exception {
		
		this.setMissingStatements();

		String[] ps = params.split(" ");
		
		operation = ps[0];
		packageName = ps[1];
		scriptsNum = 0;
		this.sequence = new ArrayList<Operation>();
		
		this.getUpgradePlan(params);
	}
	
	
	private void setMissingStatements() throws IOException {
		
		missingStatements = new Hashtable<String, Integer>();

		
		FileReader f = new FileReader("../it.univaq.mancoosi.simulator/transformationRepository/missingStatements.txt");
		BufferedReader i = new BufferedReader(f);
		String l;
		
		while((l = i.readLine()) != null) {
			if (!l.startsWith("#")) {
				missingStatements.put(l, 0);
			}
		}

		f.close();
	}
	
	
	private void getUpgradePlan(String params) throws IOException, ValidatorException {
		
		ArrayList<String> actions = new ArrayList<String>();
		
		String line;
		int numPkg = 0;
		String[] cmd = {"/bin/sh","-c","apt-get -q -y -s "+params};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));
		
		while ((line = input.readLine()) != null) {
			if(line.startsWith("Remv ") || line.startsWith("Inst ") || line.startsWith("Purg ")) {
				numPkg += 1;
				System.out.println(" --> "+line);
				actions.add(line);
			}
		}
		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("Error in apt-get --simulate.", e);
		}
		input.close();

		if (p.exitValue()!=0) {
			throw new ValidatorException("Error in apt-get --simulate.");
		}
		
		p.destroy();
		
		if (numPkg == 0) {
			throw new ValidatorException("None of the requested operations is feasible.");
		}
		
		this.downloadPackage(params);
		
		for (String action : actions) {

			String[] elements = action.split(" ");

			if (elements[0].equals("Inst")) {
				String name = elements[1];
				String version = null;
				if (elements[2].startsWith("[")) {
					version = elements[3].substring(1);
				} else {
					version = elements[2].substring(1);
				}
				
				if (version == null) throw new ValidatorException("Version not found. Package: "+ name);
				String architecture = getArchitecture(name, version);
				
				String pathPackageModel = "../it.univaq.mancoosi.simulator/packageModels/"
					+ name + "_" + version + "_" + architecture + ".packagemm";

				if (!(new File(pathPackageModel)).exists()) {
					this.createPackageModel(name, version, architecture);
				}	
				
				this.createInstallSelection(name, version, architecture);
			}

			if (elements[0].equals("Purg")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				String pathPackageModel = "../it.univaq.mancoosi.simulator/packageModels/"
					+ name + "_" + version + "_" + architecture + ".packagemm";

				if (!(new File(pathPackageModel)).exists()) {
					this.createPackageModel(name, version, architecture);
				}
				
				this.createPurgeSelection(name, version, architecture);
			}

			if (elements[0].equals("Remv")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				String pathPackageModel = "../it.univaq.mancoosi.simulator/packageModels/"
					+ name + "_" + version + "_" + architecture + ".packagemm";

				if (!(new File(pathPackageModel)).exists()) {
					this.createPackageModel(name, version, architecture);
				}
				
				this.createRemoveSelection(name, version, architecture);
			}

		}
	}
	
	
	private void createPackageModel(String name, String version, String architecture) throws ValidatorException {

		String pathPackageModel = "../it.univaq.mancoosi.simulator/packageModels/"
			+ name + "_" + version + "_" + architecture + ".packagemm";
		
			File jarFile = new File("../it.univaq.mancoosi.injectors.packages/pkginj.jar");
			
			if (!jarFile.exists()) {
				throw new ValidatorException("File ../it.univaq.mancoosi.injectors.packages/pkginj.jar"
						+ " not found");
			}

			String nameComponent = jarFile.getName();
			String pathWorkDir = jarFile.getParent();

			ProcessBuilder pb = new ProcessBuilder("java", "-jar", nameComponent, "--package", name, version, architecture);
			pb.directory(new File(pathWorkDir));

			System.out.println(" The package model '" + new File(pathPackageModel).getName()
					+ "' has not been generated yet.");
			System.out.println(" --> Generating the package model ...");

			Process p;
			try {
				p = pb.start();
				String line;
				BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
				
				while ((line = input.readLine()) != null) {
					System.out.println(" --> " + line);
				}
				p.waitFor();
				input.close();

			} catch (IOException e) {
				throw new ValidatorException(" <-- Invocation of package injector failed.");
			} catch (InterruptedException e) {
				throw new ValidatorException(" <-- Model generation failed.");
			}
			
			p.destroy();
			
			if ((new File(pathPackageModel)).exists()) {
				System.out.println(" <-- Model generation completed successfully.");
			} else {
				throw new ValidatorException(" <-- Model generation failed.");
			}
	}

	
	
	private void downloadPackage(String params) throws IOException, ValidatorException {

		String[] cmd = {"/bin/sh","-c","apt-get -d -y -q "+params};
		Process p = Runtime.getRuntime().exec(cmd);

		try {
			p.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("An error has occurred during the download.", e);
		}
		
		if (p.exitValue()!=0) {
			throw new ValidatorException("An error has occurred during the download.");
		}
		
		p.destroy();
	}

	
	private String getArchitecture(String name, String version) throws ValidatorException, IOException {
		String linePkg;

		ArrayList<String> values = new ArrayList<String>();
		String[] cmdPkg = {"/bin/sh","-c","apt-cache -q show " + name};
		Process pPkg = Runtime.getRuntime().exec(cmdPkg);
		BufferedReader info = new BufferedReader (new InputStreamReader(pPkg.getInputStream()));
		while ((linePkg = info.readLine()) != null) {
			String[] lin = linePkg.split(": ");
			if (lin[0].equals("Version")) {
				values.add(lin[1].trim());
			}

			if (lin[0].equals("Architecture")) {
				values.add(lin[1]);
			}
		}
		try {
			pPkg.waitFor();
		} catch (InterruptedException e) {
			throw new ValidatorException("Error 'apt-cache show' command", e);
		}
		
		if (pPkg.exitValue()!=0) {
			throw new ValidatorException("Error 'apt-cache show' command");
		}
		
		pPkg.destroy();
		info.close();
		
		String arch="";
		Boolean found = false;
		for (int i=0; i<values.size() && !found; i++) {
			if (i>0 && values.get(i).equals(version)) {
				found = true;
				arch = values.get(i-1);
			}
		}
		if (arch.equals("")) {
			throw new ValidatorException("Architecture field not found for package "+name+" "+version);
		}
		return arch;
	}
	

	public boolean isSemanticallyCovered(String pkgModelPath) throws Exception{
		
		if (!(new java.io.File(pkgModelPath).exists())) {
			System.out.println("File "+pkgModelPath+" not found");
			return false;
		}
		
		this.pkgModelManager = new PackageModelManager(pkgModelPath);
		
		ArrayList<StatementScript> preInstStatement = new ArrayList<StatementScript>(); 
		ArrayList<StatementScript> postInstStatement = new ArrayList<StatementScript>();
		ArrayList<StatementScript> preRmStatement = new ArrayList<StatementScript>();
		ArrayList<StatementScript> postRmStatement = new ArrayList<StatementScript>(); 
		ArrayList<StatementScript> allStatements = new ArrayList<StatementScript>();
		
		if (pkgModelManager.hasPreinstScript()) {
			scriptsNum+=1;
			preInstStatement = pkgModelManager.getAllStatementPreinstScript();			
			allStatements.addAll(preInstStatement);
		}
	
		if (pkgModelManager.hasPostinstScript()) {
			scriptsNum+=1;
			postInstStatement = pkgModelManager.getAllStatementPostinstScript();
			allStatements.addAll(postInstStatement);
		}
		
		if (pkgModelManager.hasPrermScript()) {
			scriptsNum+=1;
			preRmStatement  = pkgModelManager.getAllStatementPrermScript();
			allStatements.addAll(preRmStatement);
		}
		
		if (pkgModelManager.hasPostrmScript()) {
			scriptsNum+=1;
			postRmStatement  = pkgModelManager.getAllStatementPostrmScript();
			allStatements.addAll(postRmStatement);
		}
		
		Iterator<StatementScript> allStatementsIterator = allStatements.iterator();
		
		while (allStatementsIterator.hasNext()) {
			StatementScript statement = allStatementsIterator.next();
			
			if (missingStatements.containsKey(statement.getType())){
				System.out.println("First missing statement found: "+ statement.getType());
				return false;
			}
		}
		
		return true;
	}

	
	public boolean isCoveredPackage(Operation operation) throws Exception {

		try {

			String packageModelPath = "../it.univaq.mancoosi.simulator/packageModels/";
			String correctPackageWithScriptFile = "../it.univaq.mancoosi.injectors.packages/correctPackageWithScriptFile.txt";
			String correctPackageNoScriptFile = "../it.univaq.mancoosi.injectors.packages/correctPackageNoScriptFile.txt";

			Boolean correctNoScript = false;
			Boolean correctWithScript = false;

			if (new File(correctPackageWithScriptFile).exists()) {
				FileReader file = new FileReader(correctPackageWithScriptFile);
				BufferedReader input = new BufferedReader(file);
				String line;

				while ((line = input.readLine()) != null) {
					if (line.contains(operation.getName()))
						correctWithScript = true;
				}
			}

			if (!correctWithScript) {
				if (new File(correctPackageNoScriptFile).exists()) {
					FileReader file = new FileReader(correctPackageNoScriptFile);
					BufferedReader input = new BufferedReader(file);
					String line;

					while ((line = input.readLine()) != null) {
						if (line.contains(operation.getName()))
							correctNoScript = true;
					}
				}
			}

			packageModelPath = packageModelPath.concat(operation.getName()
					+ "_" + operation.getVersion() + "_"
					+ operation.getArchitecture() + ".packagemm");
			
			if (correctNoScript || correctWithScript) {
				if (this.isSemanticallyCovered(packageModelPath)) {
					return true;
				} else {
					System.out.println("The package '"+operation.getName()+"' is not semantically covered.");
				}
			} else {
				System.out.println("The scripts of the package '"+operation.getName()+"' are not correctly parsed.");
			}

		} catch (Exception e1) {
			throw new Exception (e1.getMessage());
		}

		return false;
	}
	
	
	/**
	 * 
	 * @return
	 * @throws Exception 
	 */
	public boolean isCompletelyCovered() throws Exception {
		
		Iterator<Operation> i = this.sequence.iterator();
		
		while (i.hasNext()) {
			if (!(this.isCoveredPackage(i.next()))) {
				return false;
			}
		}
		return true;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public int getLenght(){
		return this.sequence.size();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getOperation(){
		return this.operation;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPackageName() {
		return this.packageName;
	}

	
	
	public Integer getScriptsNum() {
		return scriptsNum;
	}

	public void createInstallSelection(String name, String version, String architecture) {
		Operation operation = new Operation();
		operation.setType("install");
		operation.setName(name);
		operation.setVersion(version);
		operation.setArchitecture(architecture);
		this.sequence.add(operation);
	}

	public void createRemoveSelection(String name, String version, String architecture) {
		Operation operation = new Operation();
		operation.setType("remove");
		operation.setArchitecture(architecture);
		operation.setName(name);
		operation.setVersion(version);
		this.sequence.add(operation);
	}

	public void createRemoveSelection(String name, String version) {
		Operation operation = new Operation();
		operation.setType("remove");
		operation.setName(name);
		operation.setVersion(version);
		this.sequence.add(operation);
	}

	public void createPurgeSelection(String name, String version, String architecture) {
		Operation operation = new Operation();
		operation.setType("purge");
		operation.setName(name);
		operation.setArchitecture(architecture);
		operation.setVersion(version);
		this.sequence.add(operation);
	}
	
	public void createPurgeSelection(String name, String version) {
		Operation operation = new Operation();
		operation.setType("purge");
		operation.setName(name);
		operation.setVersion(version);
		this.sequence.add(operation);
	}

}
