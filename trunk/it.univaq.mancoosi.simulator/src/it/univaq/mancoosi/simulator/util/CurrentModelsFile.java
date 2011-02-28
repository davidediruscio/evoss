/**
 *
 */
package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.File;
import java.util.ArrayList;

/**
 * Class used to track changes made to the configuration model.
 * 
 * @author max
 */
public class CurrentModelsFile {

	private static CurrentModelsFile instance = null;
	private File systemModelCurrentFile;
	private ArrayList<File> errorModels;

	/**
	 * Singleton
	 * 
	 * @return CurrentSystemModelFile
	 * @throws SimulatorException 
	 */
	public static CurrentModelsFile getInstance() throws SimulatorException {
		if (instance == null)
			instance = new CurrentModelsFile();
		return instance;
	}

	/**
	 * Private constructor
	 * @throws SimulatorException 
	 */
	private CurrentModelsFile() throws SimulatorException {
		errorModels = new ArrayList<File>();
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

	public void addErrorModel(File last) {
		errorModels.add(last);
	}
	
	public void setErrorModels(ArrayList<File> errorModels) {
		this.errorModels = errorModels;
	}

	public ArrayList<File> getErrorModels() {
		return errorModels;
	}
}
