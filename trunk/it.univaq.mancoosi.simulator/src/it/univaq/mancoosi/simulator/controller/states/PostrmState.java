package it.univaq.mancoosi.simulator.controller.states;

import java.util.ArrayList;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.entity.StatementScript;

public class PostrmState extends SimulatorState {

	public void abortInstall(SimulatorContext fsm) throws Exception {
		
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
		
			fsm.logger.info("Postrm - abort-install");
			
			String[] initParams = {"abort_install"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.notInstalled();
		} else {
			fsm.setState(fsm.ERROR_EXIT_REINST_REQUIRED);
			fsm.halfInstalled();
		}
	}
	
	public void abortInstall(SimulatorContext fsm, String configStatePackageVersion) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {

			fsm.logger.info("Postrm - abort-install "+configStatePackageVersion);
			
			String[] initParams = {"abort_install", configStatePackageVersion};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.configFiles();
		} else {
			fsm.setState(fsm.ERROR_EXIT_REINST_REQUIRED);
			fsm.halfInstalled();
		}
	}
	
	public void remove(SimulatorContext fsm) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {

			fsm.logger.info("Postrm - remove");
			
			String[] initParams = {"remove"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.SUCCESSFUL_EXIT);
			fsm.configFiles();
		} else {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.halfInstalled();
		}
	}
	
	
	public void purge(SimulatorContext fsm) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {
			
			if (fsm.DELETE_CONFFILES == fsm.getPreviousState()) {
				fsm.logger.info("Postrm - purge");
				String[] initParams = {"purge"};
				errorExist = this.execute(fsm.pkgModel, initParams);
			} else {
				fsm.logger.info("Postrm - remove");
				String[] initParams = {"remove"};
				errorExist = this.execute(fsm.pkgModel, initParams);
			}
			
		}
		
		if (!errorExist) {
			if (fsm.DELETE_CONFFILES == fsm.getPreviousState()) {
				fsm.setState(fsm.SUCCESSFUL_EXIT);
				fsm.purge();
			} else {
				fsm.setState(fsm.DELETE_CONFFILES);
				fsm.purge();
			}

		} else {
			if (fsm.DELETE_CONFFILES == fsm.getPreviousState()) {
				fsm.setState(fsm.ERROR_EXIT);
				fsm.configFiles();
			} else {
				fsm.setState(fsm.ERROR_EXIT);
				fsm.halfInstalled();
			}
		}
	}
	
	
	public void abortUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {

			fsm.logger.info("Postrm - "+fsm.pkgModel.getVersion()+"->abort-upgrade "+installedPkgModel.getVersion());
			
			String[] initParams = {"abort_upgrade", installedPkgModel.getVersion()};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.POSTINST);
			fsm.abortUpgrade(installedPkgModel);
		} else {
				fsm.setState(fsm.ERROR_EXIT_REINST_REQUIRED);
				fsm.halfInstalled(installedPkgModel);
		}
	}
	
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {

		Boolean errorExist = false;
		
		if (installedPkgModel.hasPostrmScript()) {

			fsm.logger.info("Postrm - "+installedPkgModel.getVersion()+"->upgrade "+fsm.pkgModel.getVersion());
			
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

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostrmScript()) {

			fsm.logger.info("PostrmState - failed-upgrade "+fsm.pkgModel.getVersion());
			
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

		Boolean errorExists = false;

		ArrayList<StatementScript> statementList = pkgModel.getStatementPostrmScript();

		if (statementList.size() > 0) {
			String pathPkgModel = pkgModel.setInitParamsPostrm(initParams);

			OrchestrationManager orchestrationPostrmScript = new OrchestrationManager(
					pkgModel.getName(), "PostrmScript", pathPkgModel,
					statementList);
			errorExists = orchestrationPostrmScript.runOrchestrationModel();
		}
		return errorExists;
	}
}
