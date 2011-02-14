package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class PackageModelRetrieval {

	
	/**
	 * 
	 * @param packageName
	 * @param packageVersion
	 * @param packageArchitecture
	 * @return pathPackageModel
	 * @throws SimulatorException 
	 */
	public static String getPath (SimulatorConfig config, String packageName, String packageVersion, String packageArchitecture) throws SimulatorException {
		
		String pathPackageModel = config.getDirInputPackageModels() 
									+ packageName + "_" + packageVersion + "_" + packageArchitecture
									+ "." + config.getFileExtensionPackageModel();
		
		if (!(new File(pathPackageModel)).exists()) {

			String nameInj = config.getInjectorPackageName();
			String workingDirInj = config.getInjectorPackageDirectory();

			ProcessBuilder pb = new ProcessBuilder("java", "-jar", nameInj,	"--package", packageName, packageVersion, packageArchitecture);
			pb.directory(new File(workingDirInj));

			System.out.println(" The package model '"+pathPackageModel+"' has not yet been generated.");
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

			} catch (IOException e) {
				throw new SimulatorException("Invocation of package injector failed.");
			}

			if ((new File(pathPackageModel)).exists()) {
				System.out.println(" <-- Model generation completed successfully.");
			} else {
				throw new SimulatorException(" <-- Model generation failed.");
			}
		}
		return pathPackageModel;
	}
}
