package it.univaq.mancoosi.validator.helper;



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import it.univaq.mancoosi.validator.exceptions.ValidatorException;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.entity.StatementScript;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.*;



public class UpgradePlan {
	
	private String operation;
	private String packageName;

	private ArrayList<Operation> sequence;
	private TransformationRuleFilesMapping transformationRuleFulesMapping;
	private PackageModelManager pkgModelManager;
	

	public ArrayList<Operation> getSequence() {
		return this.sequence;
	}
	
	public UpgradePlan(String params) throws IOException, InterruptedException, ValidatorException, SimulatorException {
		String line;
		String[] cmd = {"/bin/sh","-c","apt-get --simulate "+params+" | awk '/Inst/ || /Purg/ || /Remv/'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));

		this.sequence = new ArrayList<Operation>();
		this.transformationRuleFulesMapping = TransformationRuleFilesMapping.getInstance();
	
	
		int numPkg = 0;
		
		while ((line = input.readLine()) != null) {
			
			numPkg = numPkg + 1;
			
			String[] elements = line.split(" ");
			String[] upInfo = params.split(" ");
			
			System.out.println(" --> "+line);

			if (elements[0].equals("Inst")) {
				this.operation = "install";
				this.packageName = upInfo[1];
				
				/*if (elements.length > 5) {
					this.createInstallSelection(elements[1], elements[3].substring(1), 
							elements[5].substring(1, elements[5].length()-2));
				} else {
					this.createInstallSelection(elements[1], elements[2].substring(1), 
							elements[4].substring(1, elements[4].length()-2));
				}*/
				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				if (architecture != null) {
					this.createRemoveSelection(name, version, architecture);
				} else {
					this.createRemoveSelection(name, version);
				}
			}

			if (elements[0].equals("Purg")) {
				this.operation = "purge";
				this.packageName = upInfo[1];

				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				if (architecture != null) {
					this.createPurgeSelection(name, version, architecture);
				} else {
					this.createPurgeSelection(name, version);
				}
			}

			if (elements[0].equals("Remv")) {
				this.operation = "remove";
				this.packageName = upInfo[1];

				String name = elements[1];
				String version = elements[2].substring(1, elements[2].length()-1);
				String architecture = getArchitecture(name, version);
				
				if (architecture != null) {
					this.createRemoveSelection(name, version, architecture);
				} else {
					this.createRemoveSelection(name, version);
				}
			}
		}
		p.waitFor();
		input.close();
		if (p.exitValue() != 0) {
			throw new ValidatorException("Error in the UpgradePlan creation.");
		}
		
		if (numPkg == 0) {
			throw new ValidatorException("None of the requested operations is feasible.");
		}
		
		p.destroy();

		
	}
	
	private String getArchitecture(String name, String version) throws IOException {
		String linePkg;
		String ver="";
		String arch="";

		String[] cmdPkg = {"/bin/sh","-c"," dpkg -s " + name};
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
		this.pkgModelManager = new PackageModelManager(pkgModelPath);		
	
	//	System.out.println("Verifico la copertura semantica di " + pkgModelManager.getName() + " ...");

		
		ArrayList<StatementScript> preInstStatement = new ArrayList<StatementScript>(); 
		ArrayList<StatementScript> postInstStatement = new ArrayList<StatementScript>();
		ArrayList<StatementScript> preRmStatement = new ArrayList<StatementScript>();
		ArrayList<StatementScript> postRmStatement = new ArrayList<StatementScript>(); 
		ArrayList<StatementScript> allStatements = new ArrayList<StatementScript>();
		
		if (pkgModelManager.hasPreinstScript()){
//System.out.println(pkgModelManager.getStatementPreinstScript()); 
			
			preInstStatement = pkgModelManager.getStatementPreinstScript();			
			allStatements.addAll(preInstStatement);
		}
	
		if (pkgModelManager.hasPostinstScript()){

			postInstStatement = pkgModelManager.getStatementPostinstScript();
			allStatements.addAll(postInstStatement);
		}
		
		if (pkgModelManager.hasPrermScript()){
	
			preRmStatement  = pkgModelManager.getStatementPrermScript();
			allStatements.addAll(preRmStatement);
		}
		
		if (pkgModelManager.hasPostrmScript()){
	
			postRmStatement  = pkgModelManager.getStatementPostrmScript();
			allStatements.addAll(postRmStatement);
		}
		
		Iterator<StatementScript> allStatementsIterator = allStatements.iterator();

	
//		System.out.println(allStatements.toString());
		
		while (allStatementsIterator.hasNext()){
			StatementScript statement = allStatementsIterator.next();
//System.out.println("statement " + transformationRuleFulesMapping.existsTransformationRule(statement.getType()));
			if (! transformationRuleFulesMapping.existsTransformationRule(statement.getType())){
				return false;
			}
		}
		
		return true;
	}
	
	public boolean isCoveredPackage(Operation operation) {
		String correctPackageWithScriptFile;
		String correctPackageNoScriptFile;
		String packageModelPath = "/home/mancoosi/Desktop/eclipseGanymede/eclipse/workspace/it.univaq.mancoosi.injectors.packages/out/";


		
		try {
			correctPackageWithScriptFile = "/home/mancoosi/Desktop/eclipseGanymede/eclipse/workspace/it.univaq.mancoosi.injectors.packages/correctPackageWithScriptFile.txt";
			correctPackageNoScriptFile = "/home/mancoosi/Desktop/eclipseGanymede/eclipse/workspace/it.univaq.mancoosi.injectors.packages/correctPackageNoScriptFile.txt";
			
			
			
			FileReader file = new FileReader(correctPackageWithScriptFile);
			BufferedReader input = new BufferedReader(file);
			String line;
			
			while((line = input.readLine()) != null) {
				if (line.contains(operation.getName()) )
					return true;
			}
			
			file = new FileReader(correctPackageNoScriptFile);
			input = new BufferedReader(file);
			
			while((line = input.readLine()) != null) {	
				if ( line.contains(operation.getName()) )
					return true;
			}
			
	/*		packageModelPath = packageModelPath.concat(operation.getName() + "_" + operation.getVersion() + "_" + operation.getArchitecture() + ".packagemm");			
			if (! this.isSemanticallyCovered(packageModelPath) ){
				return false;
			}
	*/			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		return false;
	}
	
	public boolean isCompletelyCovered(){
		
		Iterator<Operation> i = this.sequence.iterator();
		
		while (i.hasNext()) {
			if (! (this.isCoveredPackage(i.next()))) {
				return false;
			}
			
		}

		return true;
	}
	
	public int getLenght(){
		return this.sequence.size();
	}
	
	public String getOperation(){
		return this.operation;
	}
	
	public String getPackageName() {
		return this.packageName;
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
