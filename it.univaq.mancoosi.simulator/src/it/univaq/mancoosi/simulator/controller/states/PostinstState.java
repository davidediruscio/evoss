package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;

public class PostinstState extends SimulatorState {

	public void configure(SimulatorContext fsm) throws Exception {
		fsm.logger.info("PostinstState - configure");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostinstScript()) {

			String[] initParams = {"configure"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}

		if (!errorExist) {
			fsm.setState(fsm.INSTALLED);
			fsm.successfulExit();
		} else {
			fsm.setState(fsm.FAILED_CONFIG);
			fsm.errorExit();
		}
	}
	
	public void configure(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		fsm.logger.info("PostinstState - configure");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostinstScript()) {

			String[] initParams = {"configure", configStatePackageVersion};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.INSTALLED);
			fsm.successfulExit();
		} else {
			fsm.setState(fsm.FAILED_CONFIG);
			fsm.errorExit();
		}
	}
	
	
	public void abortRemove(SimulatorContext fsm) throws Exception {
		fsm.logger.info("PostinstState - abortRemove");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostinstScript()) {

			String[] initParams = {"abort_remove"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.INSTALLED);
			fsm.errorExit();
		} else {
			fsm.setState(fsm.FAILED_CONFIG);
			fsm.errorExit();
		}
	}
	
	
	public void abortUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("PostinstState - abortUpgrade");
		Boolean errorExist = false;
		
		if (installedPkgModel.hasPostinstScript()) {

			String[] initParams = {"abort_upgrade", fsm.pkgModel.getVersion()};
			errorExist = this.execute(installedPkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.INSTALLED);
			fsm.errorExit();
		} else {
			if (fsm.getPreviousState() == fsm.POSTRM) {
				fsm.setState(fsm.UNPACK);
				fsm.errorExit(installedPkgModel);
			} else {
				fsm.setState(fsm.FAILED_CONFIG);
				fsm.errorExitReinstRequired(installedPkgModel);
			}
		}
	}
		
	
	private Boolean execute(PackageModelManager pkgModel, String[] initParams) throws Exception {
		
		System.gc();
		
		OrchestrationManager orchestrationPostinstScript = new OrchestrationManager(
				pkgModel.getName(),
				"PostinstScript",
				pkgModel.setInitParamsPostinst(initParams),
				pkgModel.getStatementPostinstScript());
		Boolean errorExists = orchestrationPostinstScript.runOrchestrationModel();
		return errorExists;
	}
}
