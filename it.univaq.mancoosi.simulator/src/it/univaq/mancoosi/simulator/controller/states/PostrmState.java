package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;

public class PostrmState extends SimulatorState {

	public void abortInstall(SimulatorContext fsm) throws Exception {
		fsm.logger.info("PostrmState - abortInstall");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
			String[] initParams = {"abort_install"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.NOT_INSTALLED);
			fsm.errorExit();
		} else {
			fsm.setState(fsm.HALF_INSTALLED);
			fsm.errorExitReinstRequired();
		}
	}
	
	public void abortInstall(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		fsm.logger.info("PostrmState - abortInstall");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
			String[] initParams = {"abort_install", configStatePackageVersion};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.CONFIG_FILES);
			fsm.errorExit();
		} else {
			fsm.setState(fsm.HALF_INSTALLED);
			fsm.errorExitReinstRequired();
		}
	}
	
	public void remove(SimulatorContext fsm) throws Exception {
		fsm.logger.info("PostrmState - remove");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
			String[] initParams = {"remove"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.CONFIG_FILES);
			fsm.successfulExit();
		} else {
			fsm.setState(fsm.HALF_INSTALLED);
			fsm.errorExit();
		}
	}
	
	
	public void purge(SimulatorContext fsm) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
			
			if (fsm.DELETE_CONFFILES == fsm.getPreviousState()) {
				fsm.logger.info("PostrmState - purge - purge");
				String[] initParams = {"purge"};
				errorExist = this.execute(fsm.pkgModel, initParams);
			} else {
				fsm.logger.info("PostrmState - purge - remove");
				String[] initParams = {"remove"};
				errorExist = this.execute(fsm.pkgModel, initParams);
			}
			
		}
		
		if (!errorExist) {
			if (fsm.DELETE_CONFFILES == fsm.getPreviousState()) {
				fsm.setState(fsm.NOT_INSTALLED);
				fsm.successfulExit();
			} else {
				fsm.setState(fsm.DELETE_CONFFILES);
				fsm.purge();
			}

		} else {
			if (fsm.DELETE_CONFFILES == fsm.getPreviousState()) {
				fsm.setState(fsm.CONFIG_FILES);
				fsm.errorExit();
			} else {
				fsm.setState(fsm.HALF_INSTALLED);
				fsm.errorExit();
			}
		}
	}
	
	
	public void abortUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("PostrmState - abortUpgrade");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {

			String[] initParams = {"abort_upgrade", installedPkgModel.getVersion()};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.POSTINST);
			fsm.abortUpgrade(installedPkgModel);
		} else {
				fsm.setState(fsm.HALF_INSTALLED);
				fsm.errorExitReinstRequired(installedPkgModel);
		}
	}
	
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("PostrmState - upgrade");
		Boolean errorExist = false;
		
		if (installedPkgModel.hasPostrmScript()) {

			String[] initParams = {"upgrade", fsm.pkgModel.getVersion()};
			errorExist = this.execute(installedPkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.DELETE_FILES);
			fsm.upgrade(installedPkgModel);
		} else {
			fsm.setState(fsm.POSTRM);
			fsm.failedUpgrade(installedPkgModel);
		}
	}
	
	
	public void failedUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("PostrmState - failedUpgrade");
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
			String[] initParams = {"failed_upgrade", fsm.pkgModel.getVersion()};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.POSTINST);
			fsm.configure(installedPkgModel.getVersion());
		} else {
			fsm.setState(fsm.PREINST);
			fsm.abortUpgrade(installedPkgModel);
		}
	}

	
	private Boolean execute(PackageModelManager pkgModel, String[] initParams) throws Exception {
		
		System.gc();
		
		OrchestrationManager orchestrationPostrmScript = new OrchestrationManager(
				pkgModel.getName(),
				"PostrmScript",
				pkgModel.setInitParamsPostrm(initParams),
				pkgModel.getStatementPostrmScript());
		Boolean errorExists = orchestrationPostrmScript.runOrchestrationModel();
		return errorExists;
	}
}
