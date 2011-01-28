package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.File;

public class PackageModelRetrieval {

	
	/**
	 * 
	 * @param packageName
	 * @param packageVersion
	 * @param packageArchitecture
	 * @return pathPackageModel
	 * @throws SimulatorException 
	 */
	public static String getPath (String packageName, String packageVersion, String packageArchitecture) throws SimulatorException {
		
		String pathPackageModel = SimulatorConfig.getInstance().getDirInputPackageModels() 
									+ packageName + "_" + packageVersion + "_" + packageArchitecture
									+ "." + SimulatorConfig.getInstance().getFileExtensionPackageModel();
		
		if (!(new File(pathPackageModel)).exists()) {
			// Run package Injector.....
		}
		
		return pathPackageModel;
	}
}
