package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;

public class PreinstState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {
		fsm.logger.info("PreinstState - install");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPreinstScript()) {

			String[] initParams = {"install"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.UNPACK);
			fsm.install();
		} else {
			fsm.setState(fsm.POSTRM);
			fsm.abortInstall();
		}
	}
	
	public void install(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		fsm.logger.info("PreinstState - install");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPreinstScript()) {

			String[] initParams = {"install", configStatePackageVersion};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.UNPACK);
			fsm.install(configStatePackageVersion);
		} else {
			fsm.setState(fsm.POSTRM);
			fsm.abortInstall(configStatePackageVersion);
		}
	}
	
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {

		fsm.logger.info("PreinstState - upgrade");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPreinstScript()) {
			
			String[] initParams = {"upgrade", installedPkgModel.getVersion()};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.UNPACK);
			fsm.upgrade(installedPkgModel);
		} else {
			fsm.setState(fsm.POSTRM);
			fsm.abortUpgrade(installedPkgModel);
		}
	}
	
	
	public void abortUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("PreinstState - abortUpgrade");
		Boolean errorExist = false;
		
		if (installedPkgModel.hasPreinstScript()) {
			
			String[] initParams = {"abort_upgrade", fsm.pkgModel.getVersion()};	
		    errorExist = this.execute(installedPkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.POSTRM);
			fsm.abortUpgrade(installedPkgModel);
		} else {
			fsm.setState(fsm.HALF_INSTALLED);
			fsm.errorExitReinstRequired(installedPkgModel);
		}
	}

	
	private Boolean execute(PackageModelManager pkgModel, String[] initParams) throws Exception {
		
		System.gc();
		
		OrchestrationManager orchestrationPreinstScript = new OrchestrationManager(
				pkgModel.getName(), 
				"PreinstScript",
				pkgModel.setInitParamsPreinst(initParams),
				pkgModel.getStatementPreinstScript());
		Boolean errorExists = orchestrationPreinstScript.runOrchestrationModel();
		return errorExists;
	}

}
