
package it.univaq.mancoosi.simulator.controller;

import java.io.File;
import java.util.ArrayList;

import it.univaq.mancoosi.mancoosimm.ConfigFilesPackage;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.simulator.controller.managers.ErrorModelManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.controller.states.SimulatorContext;
import it.univaq.mancoosi.simulator.exceptions.ErrorFoundException;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;
import it.univaq.mancoosi.simulator.exceptions.SelectionStateNotFoundException;
import it.univaq.mancoosi.simulator.exceptions.SelectionStateNotPermittedException;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.exceptions.WarningFoundException;
import it.univaq.mancoosi.simulator.util.CurrentModelsFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.PackageSequence;
import it.univaq.mancoosi.simulator.util.PackageModelRetrieval;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;


public class SimulatorController {


	private SimulatorConfig config;
	private static SimulatorController instance;
	private long start;
	private long end;

	
	/**
	 * Singleton
	 * @return instance
	 * @throws SimulatorException
	 */
	public static SimulatorController getInstance() throws Exception {
		if (instance == null)
			instance = new SimulatorController();
		return instance;
	}

	
	/**
	 * Private constructor
	 * 
	 * @throws SimulatorException
	 */
	private SimulatorController() throws Exception {
		
		config = SimulatorConfig.getInstance();
		
		// delete archives older than N days
		FileManagement.deleteFilesOlderThanNdays(config.getDeleteFilesOlderThanNdays(),
				config.getDirBackup());
		
        // remove the output of a previous simulation.
        this.deleteOldModel();
		
	}

	
	/**
	 * 
	 * @param args
	 */
	public void setArgs(String[] args) {
		for (int i = 0; i < args.length; i++) {		
			if (args[i].endsWith(".xml")) {
				config.setFilePackageSequence(args[i]);
			} else if (args[i].endsWith(".mancoosimm") && (new File(args[i]).exists())) {
				config.setFileInputSystemModel(args[i]);
			} else if (args[i].endsWith(".mancoosimm") && !(new File(args[i]).exists())) {
				config.setFileOutputSystemModel(args[i]);
			} else if (args[i].endsWith(".errormm")) {
				config.setFileErrorModel(args[i]);
			}
		}
	}
	

	/**
	 * 
	 * 
	 * @throws Exception 
	 * @throws SimulatorException
	 */
	public void start() throws Exception {
		
		start = System.currentTimeMillis();
		
		CurrentModelsFile.getInstance().setSystemModelCurrent(new File(config.getFileInputSystemModel()));
		
		PackageSequence sequencePkg = PackageSequence.getInstance();
		
		ArrayList<String> usedModels = new ArrayList<String>();
		
		try {
			
			for (int i = 0; i < sequencePkg.getSizePackageSequence(); i++) {
	
				String action = sequencePkg.getPackageAction(i);
				
				SystemModelManager sysModel = new SystemModelManager();
				
				SimulatorContext p;
				
				if (i>0) System.out.println("-------");
				
				if (action.equals("install")) {

					if (sysModel.isInstalledPackage(sequencePkg.getPackageName(i))) {
						// upgrade + reinstall
						
						InstalledPackage old = sysModel.getInstalledPackage(sequencePkg.getPackageName(i));
						
						String pathPackageOldModel = PackageModelRetrieval.getPath(config, old.getName(),
								old.getVersion(), old.getArchitecture());
						
						usedModels.add(pathPackageOldModel);
						
						System.out.println("Upgrade of "+sequencePkg.getPackageName(i)+" "
								+old.getVersion()+" to "+sequencePkg.getPackageVersion(i));
						
						String pathPackageModel = PackageModelRetrieval.getPath(config, sequencePkg.getPackageName(i),
								  sequencePkg.getPackageVersion(i),
								  sequencePkg.getPackageArchitecture(i));
						
						usedModels.add(pathPackageModel);
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						PackageModelManager installedPkgManager = new PackageModelManager(pathPackageOldModel);
						p = new SimulatorContext(newPkgManager);
						p.upgrade(installedPkgManager);
					
					} else if (sysModel.isConfigFilesPackage(sequencePkg.getPackageName(i))) { 
						// install from configFiles state
						
						ConfigFilesPackage old = sysModel.getConfigFilesPackage(sequencePkg.getPackageName(i));
						System.out.println("Installation of "+sequencePkg.getPackageName(i)+" "+sequencePkg.getPackageVersion(i)
											+" (Config-files "+ old.getVersion()+")");
						
						String pathPackageModel = PackageModelRetrieval.getPath(config, sequencePkg.getPackageName(i),
								  sequencePkg.getPackageVersion(i),
								  sequencePkg.getPackageArchitecture(i));
						
						usedModels.add(pathPackageModel);
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.install(old.getVersion());
	
					} else if (!(sysModel.isHalfConfiguredPackage(sequencePkg.getPackageName(i))
								|| sysModel.isHalfInstalledPackage(sequencePkg.getPackageName(i))
								|| sysModel.isUnpackedPackage(sequencePkg.getPackageName(i)))) {
						
						// simple case: install from NotInstalledState
						System.out.println("Installation of "+sequencePkg.getPackageName(i)+" "
								+sequencePkg.getPackageVersion(i)+" (Not-installed)");
						
						String pathPackageModel = PackageModelRetrieval.getPath(config, sequencePkg.getPackageName(i),
								  sequencePkg.getPackageVersion(i),
								  sequencePkg.getPackageArchitecture(i));
						
						usedModels.add(pathPackageModel);
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.install();	
					} else {
						throw new SelectionStateNotPermittedException("The requested selection-state '"+action
								+"' is not allowed on the current status of the package "+sequencePkg.getPackageName(i)
								+" "+sequencePkg.getPackageVersion(i));
					}
	
				} else if (action.equals("remove")) {
					// Remove from Installed state
					if (sysModel.isInstalledPackage(sequencePkg.getPackageName(i))) {
						System.out.println("Remove of "+sequencePkg.getPackageName(i)+" "
								+sequencePkg.getPackageVersion(i)+" (Installed)");
						
						String name = sequencePkg.getPackageName(i);
						String version = sequencePkg.getPackageVersion(i);
						String architecture = sequencePkg.getPackageArchitecture(i);						
						if (architecture == null) {
							architecture = sysModel.getInstalledPackage(name, version).getArchitecture();
						}

						String pathPackageModel = PackageModelRetrieval.getPath(config, name, version, architecture);
						usedModels.add(pathPackageModel);
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.remove();
					} else {
						throw new SelectionStateNotPermittedException("The requested selection-state '"+action
								+"' is not allowed on the current status of the package "+sequencePkg.getPackageName(i)
								+" "+sequencePkg.getPackageVersion(i));
					}
				
				} else if (action.equals("purge")) {
					
					if (sysModel.isInstalledPackage(sequencePkg.getPackageName(i))) {
						// Purge from Installed state
						
						System.out.println("Purge of "+sequencePkg.getPackageName(i)+" "
								+sequencePkg.getPackageVersion(i)+" (Installed)");
						
						String name = sequencePkg.getPackageName(i);
						String version = sequencePkg.getPackageVersion(i);
						String architecture = sequencePkg.getPackageArchitecture(i);						
						if (architecture == null) {
							architecture = sysModel.getInstalledPackage(name, version).getArchitecture();
						}

						String pathPackageModel = PackageModelRetrieval.getPath(config, name, version, architecture);
						usedModels.add(pathPackageModel);
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.purgeInstalled();
						
					} else if (sysModel.isConfigFilesPackage(sequencePkg.getPackageName(i))) {
						// Purge from ConfigFiles state
						System.out.println("Remove of "+sequencePkg.getPackageName(i)+" "
								+sequencePkg.getPackageVersion(i)+" (Config-Files)");
						
						String name = sequencePkg.getPackageName(i);
						String version = sequencePkg.getPackageVersion(i);
						String architecture = sequencePkg.getPackageArchitecture(i);						
						if (architecture == null) {
							architecture = sysModel.getConfigFilesPackage(name, version).getArchitecture();
						}

						String pathPackageModel = PackageModelRetrieval.getPath(config, name, version, architecture);
						usedModels.add(pathPackageModel);
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.purgeConfFiles();
						
					} else {
						throw new SelectionStateNotPermittedException("The requested selection-state '"+action
								+"' is not allowed on the current status of the package "+sequencePkg.getPackageName(i)
								+" "+sequencePkg.getPackageVersion(i));
					}
					
				} else {
					throw new SelectionStateNotFoundException("The requested selection-state '"
							+action+"' is not manageable.");
				}
			}
			
			// Generate final error model
			ArrayList<File> errorModels = CurrentModelsFile.getInstance().getErrorModels();
			
			ErrorModelManager errorManager = new ErrorModelManager();
			
			for (int i=0; i< errorModels.size(); i++) {
				errorManager.appendModel(errorModels.get(i).getPath());
			}
			
			if (errorManager.existsWarnings()) {
				String finalModel = config.getFileErrorModel();
				errorManager.saveModel(finalModel);
				errorManager.printModel();
				generateFinalConfigurationModel(usedModels);
				throw new WarningFoundException("Simulation completed with warnings.");
			} else {
				generateFinalConfigurationModel(usedModels);
			}

		} catch (ErrorModelFoundException e) {
			
			// Generate final error model
			ArrayList<File> errorModels = CurrentModelsFile.getInstance().getErrorModels();
			
			ErrorModelManager errorManager = new ErrorModelManager();
			
			for (int i=0; i< errorModels.size(); i++) {
				errorManager.appendModel(errorModels.get(i).getPath());
			}
			
			String finalModel = config.getFileErrorModel();
			errorManager.printModel();
			errorManager.saveModel(finalModel);
			generateFinalConfigurationModel(usedModels);

			throw new ErrorFoundException("Simulation failed.");
		}
	}

	
    private void generateFinalConfigurationModel(ArrayList<String> usedModels) throws Exception {
		// Generate final configuration model
		File finalSystemModelFile = new File(config.getFileOutputSystemModel());
		FileManagement.copyFile(CurrentModelsFile.getInstance().getSystemModelCurrent(),
				finalSystemModelFile);
		
		// Create tar.gz archive
		createArchive(usedModels, finalSystemModelFile);
		
		end = System.currentTimeMillis();
		
		double tot = (end-start)/1000.0;
		System.out.println("Time: "+tot+" seconds.");
		
	}


	/**
     * 
     */
    private void deleteOldModel() {

            File finalSystemModelFile = new File(config.getFileOutputSystemModel());
            if (finalSystemModelFile.exists()) finalSystemModelFile.delete();
            File finalErrorModelFile = new File(config.getFileErrorModel());
            if (finalErrorModelFile.exists()) finalErrorModelFile.delete();
    }
	
	
	/**
	 * 
	 * @param usedModels
	 * @param finalSystemModelFile
	 * @throws Exception
	 */
	private void createArchive(ArrayList<String> usedModels, File finalSystemModelFile) throws Exception {
		File tmpDir = FileManagement.createTempDirectory();
		
		for (int i=0; i<usedModels.size(); i++) {
			File f = new File(usedModels.get(i));
			File copy = new File(tmpDir.getPath()+File.separator+f.getName());
			if (!copy.exists()) {
				FileManagement.copyFile(f, copy);
			}
		}
		
		File sequence = new File(config.getFilePackageSequence());
		File sequenceCopy = new File(tmpDir.getPath()+File.separator+sequence.getName());
		FileManagement.copyFile(sequence, sequenceCopy);
		
		File input = new File(config.getFileInputSystemModel());
		File inputCopy = new File(tmpDir.getPath()+File.separator+"input_"+input.getName());
		FileManagement.copyFile(input, inputCopy);
		
		File outputCopy = new File(tmpDir.getPath()+File.separator+"output_"+finalSystemModelFile.getName());
		FileManagement.copyFile(finalSystemModelFile, outputCopy);
		
		
		File outputError = new File(config.getFileErrorModel());
		
		if (outputError.exists()) {
			String nameModelError = new File(config.getFileErrorModel()).getName();
			File outputErrorCopy = new File(tmpDir.getPath()+File.separator+nameModelError);
			FileManagement.copyFile(outputError, outputErrorCopy);
		}
		
		FileManagement.renameFilesDir(config.getDirBackup());
		
		FileManagement.createZipDirectory(tmpDir.getPath(), config.getDirBackup()+"simulation.zip");
		
		FileManagement.deleteDir(tmpDir);
		
		
	}
}
