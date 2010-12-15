/**
 * 
 */

package it.univaq.mancoosi.simulator.control;

import java.util.Iterator;
import it.univaq.mancoosi.packagemm.File;


/**
 * 
 * @author max
 */
class SimulationInstallingPackage extends SimulationPackageManager {

	/**
	 * Constructor
	 * 
	 * @param packageNameInput
	 * @throws SimulatorException
	 */
	SimulationInstallingPackage(String packageNameInput) throws Exception{
		super(packageNameInput);
	}

	@Override
	public void finalSimul() throws Exception {
		
		Runtime.getRuntime().gc();
		
		logger.info("-Simulator- Package: " + packageNameInput + "- Final.");
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.installNotInstalledPackage(pkgModel.getName(), pkgModel.getVersion(),
											pkgModel.getDependences(), pkgModel.getConflicts(),
											pkgModel.getConfFiles(), pkgModel.getInstalledSize(),
											pkgModel.getMaintainer(), pkgModel.getArchitecture(),
											pkgModel.getSection(), pkgModel.getPriority());
		sysModel.saveModel();
	}

	
	@Override
	public void unpacking() throws Exception {
		
		Runtime.getRuntime().gc();
		
		if (pkgModel.hasFiles()) {
			logger.info("-Simulator- Package: " + packageNameInput + "- Unpacking.");
			SystemModelManager sysModel = new SystemModelManager();
			Iterator<File> listFilesPackage = pkgModel.getListfiles().iterator();
			while (listFilesPackage.hasNext()) {
				File file = listFilesPackage.next();
				sysModel.addFile(file.getLocation());
			}
			sysModel.saveModel();
		} else {
			logger.info("-Simulator- Package: " + packageNameInput + " has no files to install.");
		}
	}

	@Override
	public void post() throws Exception {
		
		if (pkgModel.hasPostinstScript()) {
			
			logger.info("-Simulator- Package: " + packageNameInput
					+ "- Script: Postinst.");
			
			String[] initParams = {"configure"};
			
			OrchestrationManager orchestrationPostinstScript = new OrchestrationManager(packageNameInput,
					"PostinstScript", pkgModel.setInitParamsPostinst(initParams), pkgModel.getStatementPostinstScript());
			orchestrationPostinstScript.runOrchestrationModel();

		} else {
			logger.info("-Simulator- Package: " + packageNameInput
					+ "- has no Postinst script.");
		}
	}

	@Override
	public void pre() throws Exception {
		if (pkgModel.hasPreinstScript()) {
			logger.info("-Simulator- Package: " + packageNameInput
					+ "- Script: Preinst.");

			String[] initParams = {"install"};
			
			OrchestrationManager orchestrationPreinstScript = new OrchestrationManager(packageNameInput,
					"PreinstScript", pkgModel.setInitParamsPreinst(initParams), pkgModel.getStatementPreinstScript());
			orchestrationPreinstScript.runOrchestrationModel();

		} else {
			logger.info("-Simulator- Package: " + packageNameInput
					+ "- has no Preinst script.");
		}
	}

}
