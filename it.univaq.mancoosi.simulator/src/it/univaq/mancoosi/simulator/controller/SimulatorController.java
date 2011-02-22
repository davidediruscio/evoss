
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

	private PackageSequence sequencePkg;
	private CurrentModelsFile systemModelCurrent;
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
		
		sequencePkg = PackageSequence.getInstance();
		systemModelCurrent = CurrentModelsFile.getInstance();
		config = SimulatorConfig.getInstance();
		
		// delete archives older than N days
		FileManagement.deleteFilesOlderThanNdays(config.getDeleteFilesOlderThanNdays(),
				config.getDirBackup());
		
        // remove the output of a previous simulation.
        this.deleteOldModel();
		
	}


	/**
	 * 
	 * 
	 * @throws Exception 
	 * @throws SimulatorException
	 */
	public void start() throws Exception {
		
		start = System.currentTimeMillis();
		
		ArrayList<String> usedModels = new ArrayList<String>();
		
		try {
			
			for (int i = 0; i < sequencePkg.getSizePackageSequence(); i++) {
	
				String action = sequencePkg.getPackageAction(i);
				
				String pathPackageModel = PackageModelRetrieval.getPath(config, sequencePkg.getPackageName(i),
						  sequencePkg.getPackageVersion(i),
						  sequencePkg.getPackageArchitecture(i));
				
				usedModels.add(pathPackageModel);
				
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
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						PackageModelManager installedPkgManager = new PackageModelManager(pathPackageOldModel);
						p = new SimulatorContext(newPkgManager);
						p.upgrade(installedPkgManager);
					
					} else if (sysModel.isConfigFilesPackage(sequencePkg.getPackageName(i))) { 
						// install from configFiles state
						
						ConfigFilesPackage old = sysModel.getConfigFilesPackage(sequencePkg.getPackageName(i));
						System.out.println("Installation of "+sequencePkg.getPackageName(i)+" "+sequencePkg.getPackageVersion(i)
											+" (Config-files "+ old.getVersion()+")");
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.install(old.getVersion());
	
					} else if (!(sysModel.isHalfConfiguredPackage(sequencePkg.getPackageName(i))
								|| sysModel.isHalfInstalledPackage(sequencePkg.getPackageName(i))
								|| sysModel.isUnpackedPackage(sequencePkg.getPackageName(i)))) {
						
						// simple case: install from NotInstalledState
						System.out.println("Installation of "+sequencePkg.getPackageName(i)+" "
								+sequencePkg.getPackageVersion(i)+" (Not-installed)");
						
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
						
						PackageModelManager newPkgManager = new PackageModelManager(pathPackageModel);
						p = new SimulatorContext(newPkgManager);
						p.purgeInstalled();
						
					} else if (sysModel.isConfigFilesPackage(sequencePkg.getPackageName(i))) {
						// Purge from ConfigFiles state
						System.out.println("Remove of "+sequencePkg.getPackageName(i)+" "
								+sequencePkg.getPackageVersion(i)+" (Config-Files)");
						
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
				
				System.gc();
			}
			
			// Generate final error model
			ArrayList<File> errorModels = CurrentModelsFile.getInstance().getErrorModels();
			
			ErrorModelManager errorManager = new ErrorModelManager();
			
			for (int i=0; i< errorModels.size(); i++) {
				errorManager.appendModel(errorModels.get(i).getPath());
			}
			
			if (errorManager.existsWarnings()) {
				String finalModel = config.getDirOutput() + config.getFileErrorModel();
				errorManager.saveModel(finalModel);
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
			
			String finalModel = config.getDirOutput() + config.getFileErrorModel();
			errorManager.saveModel(finalModel);
			generateFinalConfigurationModel(usedModels);

			throw new ErrorFoundException("Simulation failed.");
		}
	}

	
    private void generateFinalConfigurationModel(ArrayList<String> usedModels) throws Exception {
		// Generate final configuration model
		String inputSystemModel = config.getFileInputSystemModel();
		String nameFileModel = inputSystemModel.substring(inputSystemModel
				.lastIndexOf("/") + 1, inputSystemModel.length());
		File finalSystemModelFile = new File(config.getDirOutput()
				+ nameFileModel);
		FileManagement.copyFile(systemModelCurrent.getSystemModelCurrent(),
				finalSystemModelFile);
		
		// Create tar.gz archive
		createArchive(usedModels, finalSystemModelFile);
		
		end = System.currentTimeMillis();
		
		double tot = (end-start);

		if (tot != 0) {
			tot = tot/1000.0;
		}
		
		System.out.println("Time: "+tot+" seconds.");
		
	}


	/**
     * 
     */
    private void deleteOldModel() {
            String inputSystemModel = config.getFileInputSystemModel();
            String nameFileModel = inputSystemModel.substring(inputSystemModel
                            .lastIndexOf("/") + 1, inputSystemModel.length());
            File finalSystemModelFile = new File(config.getDirOutput()
                            + nameFileModel);
            if (finalSystemModelFile.exists()) finalSystemModelFile.delete();
            File finalErrorModelFile = new File(config.getDirOutput()
                            + config.getFileErrorModel());
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
			File copy = new File(tmpDir.getPath()+"/"+f.getName());
			if (!copy.exists()) {
				FileManagement.copyFile(f, copy);
			}
		}
		
		File sequence = new File(config.getFilePackageSequence());
		File sequenceCopy = new File(tmpDir.getPath()+"/"+sequence.getName());
		FileManagement.copyFile(sequence, sequenceCopy);
		
		File input = new File(config.getFileInputSystemModel());
		File inputCopy = new File(tmpDir.getPath()+"/"+"input_"+input.getName());
		FileManagement.copyFile(input, inputCopy);
		
		File outputCopy = new File(tmpDir.getPath()+"/"+"output_"+finalSystemModelFile.getName());
		FileManagement.copyFile(finalSystemModelFile, outputCopy);
		
		
		File outputError = new File(config.getDirOutput() + config.getFileErrorModel());
		
		if (outputError.exists()) {
			File outputErrorCopy = new File(tmpDir.getPath()+"/"+config.getFileErrorModel());
			FileManagement.copyFile(outputError, outputErrorCopy);
		}
		
		FileManagement.renameFilesDir(config.getDirBackup());
		
		FileManagement.createTarGzOfDirectory(tmpDir.getPath(), config.getDirBackup()+"simulation.tar.gz");
		
		FileManagement.deleteDir(tmpDir);
		
		
	}
}
