/**
 * 
 */

package it.univaq.mancoosi.simulator.control;

import java.util.ArrayList;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * 
 * @author max
 */
class SimulationRemovingPackage extends SimulationPackageManager {

	/**
	 * Constructor
	 * 
	 * @param packageNameInput
	 * @throws SimulatorException
	 */
	SimulationRemovingPackage(String packageNameInput) throws Exception {
		super(packageNameInput);
	}

	@Override
	public void finalSimul() throws Exception {
		
		logger.info("-Simulator- Package: " + packageNameInput + "- Final.");
		
		Runtime.getRuntime().gc();
		
		SystemModelManager sysModel = new SystemModelManager();
		
		sysModel.removeInstalledPackage(pkgModel.getName(), pkgModel.getVersion());
		
		sysModel.saveModel();
	}


	@Override
	public void unpacking() throws Exception {

		Runtime.getRuntime().gc();
		
		if (pkgModel.hasFiles()) {
			logger.info("-Simulator- Package: " + packageNameInput + "- Unpacking.");
			SystemModelManager sysModel = new SystemModelManager();
			
			ArrayList<String> list = pkgModel.getNotConfFiles();

			for (int i=0; i<list.size(); i++) {
				sysModel.deleteFile(list.get(i));
			}

			sysModel.saveModel();

		} else {
			logger.info("-Simulator- Package: " + packageNameInput
					+ " has no files to delete.");
		}
	}

	@Override
	public void post() throws Exception {
		
		if (pkgModel.hasPostrmScript()) {

			logger.info("-Simulator- Package: " + packageNameInput
					+ "- Script: Postrm.");

			String[] initParams = {"remove"};
			
			OrchestrationManager orchestrationPostrmScript = new OrchestrationManager(packageNameInput,
					"PostrmScript", pkgModel.setInitParamsPostrm(initParams), pkgModel.getStatementPostrmScript());
			orchestrationPostrmScript.runOrchestrationModel();

		} else {
			logger.info("-Simulator- Package: " + packageNameInput
					+ "- has not Postrm script.");
		}
	}

	@Override
	public void pre() throws Exception {
		
		if (pkgModel.hasPrermScript()) {

			logger.info("-Simulator- Package: " + packageNameInput
					+ "- Script: Prerm.");

			String[] initParams = {"remove"};
			
			OrchestrationManager orchestrationPrermScript = new OrchestrationManager(packageNameInput,
					"PrermScript", pkgModel.setInitParamsPostrm(initParams), pkgModel.getStatementPrermScript());
			orchestrationPrermScript.runOrchestrationModel();

		} else {
			logger.info("-Simulator- Package: " + packageNameInput
					+ "- has not Prerm script.");
		}
	}

}
