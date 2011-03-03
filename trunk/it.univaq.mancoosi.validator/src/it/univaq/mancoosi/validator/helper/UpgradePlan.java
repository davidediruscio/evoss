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
		
		missingStatements = new Hashtable<String, Integer>();
		scriptsNum=0;
		
		FileReader f = new FileReader("../it.univaq.mancoosi.simulator/transformationRepository/missingStatements.txt");
		BufferedReader i = new BufferedReader(f);
		String l;
		
		while((l = i.readLine()) != null) {
			missingStatements.put(l, 0);
		}
		
		i.close();
		f.close();
		String[] ps = params.split(" ");
		
		operation = ps[0];
		packageName = ps[1];

		
		String line;
		String[] cmd = {"/bin/sh","-c","apt-get -s "+params+" | awk '/Inst/ || /Purg/ || /Remv/'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		this.sequence = new ArrayList<Operation>();
		
		while ((line = input.readLine()) != null) {
			
			String[] elements = line.split(" ");
			
			System.out.println(" --> "+line);

			if (elements[0].equals("Inst")) {
				String name = elements[1];
				String version = null;
				if (elements[2].startsWith("[")) {
					version = elements[3].substring(1);
				} else {
					version = elements[2].substring(1);
				}
				
				if (version == null) throw new Exception("Version not found. Package: "+ name);
				String architecture = getArchitecture(name, version);
				
				this.createPackageModel(name, version, architecture);
				this.createInstallSelection(name, version, architecture);
			}

			if (elements[0].equals("Purg")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				this.createPackageModel(name, version, architecture);
				this.createPurgeSelection(name, version, architecture);
			}

			if (elements[0].equals("Remv")) {
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				this.createPackageModel(name, version, architecture);
				this.createRemoveSelection(name, version, architecture);
			}
			
		}
		p.waitFor();
		input.close();
		if (p.exitValue() != 0) {
			throw new ValidatorException("Error in apt-get --simulate.");
		}
		
		p.destroy();

		
	}
	
	
	private void createPackageModel(String name, String version, String architecture) throws Exception {

		String pathPackageModel = "../it.univaq.mancoosi.simulator/packageModels/"
				+ name + "_" + version + "_" + architecture + ".packagemm";

		if (!(new File(pathPackageModel)).exists()) {

			String[] cmd = { "/bin/sh", "-c", "apt-get -d -y -q " + name };
			Process ps = Runtime.getRuntime().exec(cmd);

			ps.waitFor();
			if (ps.exitValue() != 0) {
				throw new Exception(
						"An error has occurred during the download of the "+name+" package.");
			}
			ps.destroy();

			File jarFile = new File(
					"../it.univaq.mancoosi.injectors.packages/pkginj.jar");

			if (!jarFile.exists()) {
				throw new Exception("File"
						+ "../it.univaq.mancoosi.injectors.packages/pkginj.jar"
						+ " not found");
			}

			String nameComponent = jarFile.getName();
			String pathWorkDir = jarFile.getParent();

			ProcessBuilder pb = new ProcessBuilder("java", "-jar",
					nameComponent, "--package", name, version, architecture);
			pb.directory(new File(pathWorkDir));

			System.out.println(" The package model '" + pathPackageModel
					+ "' has not been generated yet.");
			System.out.println(" --> Generating the package model ...");

			Process p;
			try {
				p = pb.start();
				String line;
				BufferedReader input = new BufferedReader(
						new InputStreamReader(p.getInputStream()));
				while ((line = input.readLine()) != null) {
					System.out.println(" --> " + line);
				}
				input.close();

				p.waitFor();

			} catch (IOException e) {
				throw new Exception(
						" <-- Invocation of package injector failed.");
			} catch (InterruptedException e) {
				throw new Exception(" <-- Model generation failed.");
			}

			if ((new File(pathPackageModel)).exists()) {
				System.out
						.println(" <-- Model generation completed successfully.");
			} else {
				throw new Exception(" <-- Model generation failed.");
			}
		}
	}

	private String getArchitecture(String name, String version) throws IOException {
		String linePkg;
		String ver="";
		String arch="";

		String[] cmdPkg = {"/bin/sh","-c"," apt-cache show " + name};
		Process pPkg = Runtime.getRuntime().exec(cmdPkg);
		BufferedReader info = new BufferedReader (new InputStreamReader(pPkg.getInputStream()));
		while ((linePkg = info.readLine()) != null) {
			String[] lin = linePkg.split(": ");

			if (lin[0].equals("Version")) {
				ver = lin[1].trim();
			}

			if (lin[0].equals("Architecture")) {
				arch = lin[1];
			}
		}
		info.close();
		pPkg.destroy();
		
		if (ver.equals(version)) {
			return arch;
		} else return null;
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

			FileReader file = new FileReader(correctPackageWithScriptFile);
			BufferedReader input = new BufferedReader(file);
			String line;

			while ((line = input.readLine()) != null) {
				if (line.contains(operation.getName()))
					correctWithScript = true;
			}

			if (!correctWithScript) {

				file = new FileReader(correctPackageNoScriptFile);
				input = new BufferedReader(file);

				while ((line = input.readLine()) != null) {
					if (line.contains(operation.getName()))
						correctNoScript = true;
				}

			}

			packageModelPath = packageModelPath.concat(operation.getName()
					+ "_" + operation.getVersion() + "_"
					+ operation.getArchitecture() + ".packagemm");
			
			if (this.isSemanticallyCovered(packageModelPath) && (correctNoScript || correctWithScript)) {
				return true;
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
