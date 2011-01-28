/**
 * 
 */

package it.univaq.mancoosi.simulator.controller;

import java.io.File;

import it.univaq.mancoosi.simulator.controller.states.SimulatorContext;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.exceptions.WrongActionException;
import it.univaq.mancoosi.simulator.util.CurrentSystemModelFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.PackageSequence;
import it.univaq.mancoosi.simulator.util.PackageModelRetrieval;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;
import it.univaq.mancoosi.simulator.util.SimulatorLogger;

/**
 * 
 * @author max
 */
public class SimulatorController {

	private PackageSequence sequencePkg;
	private CurrentSystemModelFile systemModelCurrent;
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
		systemModelCurrent = CurrentSystemModelFile.getInstance();
		config = SimulatorConfig.getInstance();
		// The output directory must be empty
		FileManagement.cleanDirectory(config.getDirOutput());
	}

	/**
	 * 
	 * 
	 * @throws SimulatorException
	 */
	public void start() throws Exception {
		
		(SimulatorLogger.getInstance()).info("Simulation started.");
		
		for (int i = 0; i < sequencePkg.getSizePackageSequence(); i++) {

			String action = sequencePkg.getPackageAction(i);
			
			String pathPackageModel = PackageModelRetrieval.getPath(sequencePkg.getPackageName(i),
														 sequencePkg.getPackageVersion(i),
														 sequencePkg.getPackageArchitecture(i));
			
			SimulatorContext p;
			
			if (action.equals("install")) {
				p = new SimulatorContext(pathPackageModel);
				p.setState(p.NOT_INSTALLED);
				p.install();
			} else if (action.equals("remove")) {
				p = new SimulatorContext(pathPackageModel);
				p.setState(p.INSTALLED);
				p.remove();
			} else {
				throw new WrongActionException("Wrong action: " + action);
			}
		}

		String inputSystemModel = config.getFileInputSystemModel();
		String nameFileModel = inputSystemModel.substring(inputSystemModel
				.lastIndexOf("/") + 1, inputSystemModel.length());
		File finalSystemModelFile = new File(config.getDirOutput()
				+ nameFileModel);
		FileManagement.copyFile(systemModelCurrent.getSystemModelCurrent(),
				finalSystemModelFile);
		
		(SimulatorLogger.getInstance()).info("Simulation succeeded.");
	}
}
