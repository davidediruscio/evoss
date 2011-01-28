/**
 *
 */
package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.File;

/**
 * Class used to track changes made to the configuration model.
 * 
 * @author max
 */
public class CurrentSystemModelFile {

	private static CurrentSystemModelFile instance = null;
	private File systemModelCurrentFile;

	/**
	 * Singleton
	 * 
	 * @return CurrentSystemModelFile
	 * @throws SimulatorException 
	 */
	public static CurrentSystemModelFile getInstance() throws SimulatorException {
		if (instance == null)
			instance = new CurrentSystemModelFile();
		return instance;
	}

	/**
	 * Private constructor
	 * @throws SimulatorException 
	 */
	private CurrentSystemModelFile() throws SimulatorException {
		systemModelCurrentFile = new File(SimulatorConfig.getInstance().getFileInputSystemModel());
		//System.out.println("SET: "+systemModelCurrentFile.getPath());
	}

	/**
	 * @param systemModelFile
	 *            the systemModelFile to set
	 */
	public void setSystemModelCurrent(File systemModelFile) {
		//System.out.println("SET: "+systemModelFile.getPath());
		systemModelCurrentFile = systemModelFile;
	}

	/**
	 * @return the systemModelFile
	 */
	public File getSystemModelCurrent() {
		//System.out.println("GET: "+systemModelCurrentFile.getPath());
		return systemModelCurrentFile;
	}
}
