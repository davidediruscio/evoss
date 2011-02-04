
package it.univaq.mancoosi.simulator.controller;

import java.io.File;
import java.util.ArrayList;

import it.univaq.mancoosi.mancoosimm.ConfigFilesPackage;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.simulator.controller.managers.ErrorModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.controller.states.SimulatorContext;
import it.univaq.mancoosi.simulator.exceptions.ErrorFoundException;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.exceptions.WarningFoundException;
import it.univaq.mancoosi.simulator.util.CurrentModelsFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.PackageSequence;
import it.univaq.mancoosi.simulator.util.PackageModelRetrieval;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;
//import it.univaq.mancoosi.simulator.util.SimulatorLogger;


public class SimulatorController {

	private PackageSequence sequencePkg;
	private CurrentModelsFile systemModelCurrent;
	private SimulatorConfig config;
	private static SimulatorController instance;

	
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
		
		try {
		//(SimulatorLogger.getInstance()).info("Simulation started.");
		
		for (int i = 0; i < sequencePkg.getSizePackageSequence(); i++) {

			String action = sequencePkg.getPackageAction(i);
			
			String pathPackageModel = PackageModelRetrieval.getPath(sequencePkg.getPackageName(i),
														 sequencePkg.getPackageVersion(i),
														 sequencePkg.getPackageArchitecture(i));
			
			SystemModelManager sysModel = new SystemModelManager();
			
			SimulatorContext p;
			
			if (action.equals("install")) {
				// TODO version compare...
				if (sysModel.isInstalledPackage(sequencePkg.getPackageName(i))) {
					// upgrade + reinstall
					
					InstalledPackage old = sysModel.getInstalledPackage(sequencePkg.getPackageName(i));
					
					String pathPackageOldModel = PackageModelRetrieval.getPath(old.getName(),
							old.getVersion(), old.getArchitecture());
					
					System.out.println("Upgrate of '"+sequencePkg.getPackageName(i)+"' "
							+old.getVersion()+" to "+sequencePkg.getPackageVersion(i));
					
					p = new SimulatorContext(pathPackageModel, pathPackageOldModel);
					p.setState(p.INSTALLED);
					p.upgrade();
				
				} else if (sysModel.isConfigFilesPackage(sequencePkg.getPackageName(i))) { 
					// install from configFiles state
					
					ConfigFilesPackage old = sysModel.getConfigFilesPackage(sequencePkg.getPackageName(i));
					System.out.println("Installation of '"+sequencePkg.getPackageName(i)+"' "+sequencePkg.getPackageVersion(i)
										+"(Config-files "+ old.getVersion()+")");
					
					p = new SimulatorContext(pathPackageModel);
					p.setState(p.CONFIG_FILES);
					p.install(old.getVersion());

				} else {
					// simple case: install from NotInstalledState
					
					System.out.println("Installation of "+sequencePkg.getPackageName(i)+" "
							+sequencePkg.getPackageVersion(i)+" (Not-installed)");
					
					p = new SimulatorContext(pathPackageModel);
					p.setState(p.NOT_INSTALLED);
					p.install();	
				}

			} else if (action.equals("remove")) {
				// Remove from Installed state

				System.out.println("Remove of "+sequencePkg.getPackageName(i)+" "
						+sequencePkg.getPackageVersion(i)+" (Installed)");
				
				p = new SimulatorContext(pathPackageModel);
				p.setState(p.INSTALLED);
				p.remove();
			
			} else if (action.equals("purge")) {
				
				if (sysModel.isInstalledPackage(sequencePkg.getPackageName(i))) {
					// Purge from Installed state
					
					System.out.println("Purge of "+sequencePkg.getPackageName(i)+" "
							+sequencePkg.getPackageVersion(i)+" (Installed)");
					
					p = new SimulatorContext(pathPackageModel);
					p.setState(p.INSTALLED);
					p.purge();
				} else {
					// Purge from ConfigFiles state
					
					System.out.println("Remove of "+sequencePkg.getPackageName(i)+" "
							+sequencePkg.getPackageVersion(i)+" (Config-Files)");
					
					p = new SimulatorContext(pathPackageModel);
					p.setState(p.CONFIG_FILES);
					p.purge();
				}

			}
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

			if (errorManager.existsErrors()) {
				//(SimulatorLogger.getInstance()).severe("Simulation failed.");
				throw new ErrorFoundException();
			} else {
				//(SimulatorLogger.getInstance()).severe("Simulation completed with warnings.");
				throw new WarningFoundException();
			}
			
		} finally {
			// Generate final configuration model
			String inputSystemModel = config.getFileInputSystemModel();
			String nameFileModel = inputSystemModel.substring(inputSystemModel
					.lastIndexOf("/") + 1, inputSystemModel.length());
			File finalSystemModelFile = new File(config.getDirOutput()
					+ nameFileModel);
			FileManagement.copyFile(systemModelCurrent.getSystemModelCurrent(),
					finalSystemModelFile);
		}
		
		//(SimulatorLogger.getInstance()).info("Simulation succeeded.");
		
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
}
