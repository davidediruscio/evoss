/**
 * 
 */

package it.univaq.mancoosi.simulator.control;

import java.io.File;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.exceptions.WrongActionException;
import it.univaq.mancoosi.simulator.util.CurrentSystemModelFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.PackageSequence;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;
import it.univaq.mancoosi.simulator.util.SimulatorLogger;

/**
 * 
 * @author max
 */
public class SimulatorManager {

	private PackageSequence sequencePkg = null;

	private CurrentSystemModelFile systemModelCurrent;

	private SimulatorConfig config;

	private static SimulatorManager instance = null;

	/**
	 * Singleton
	 * @return instance
	 * @throws SimulatorException
	 */
	public static SimulatorManager getInstance() throws Exception {
		if (instance == null)
			instance = new SimulatorManager();
		return instance;
	}

	/**
	 * Private constructor
	 * 
	 * @throws SimulatorException
	 */
	private SimulatorManager() throws Exception {
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
			String pkgNameInput = sequencePkg.getPackageNameInput(i);
			
			SimulationPackageManager p;
			
			if (action.equals("install")) {
				p = new SimulationInstallingPackage(pkgNameInput);
			} else if (action.equals("remove")) {
				p = new SimulationRemovingPackage(pkgNameInput);
			} else {
				throw new WrongActionException("Wrong action: " + action);
			}

			p.execute();

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
