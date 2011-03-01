package it.univaq.mancoosi.simulator.controller.states;

import java.util.ArrayList;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.entity.StatementScript;

public class PostinstState extends SimulatorState {

	public void configure(SimulatorContext fsm) throws Exception {
		
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostinstScript()) {

			fsm.logger.info("Postinst - configure");
			
			String[] initParams = {"configure"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}

		if (!errorExist) {
			fsm.setState(fsm.SUCCESSFUL_EXIT);
			fsm.install();
		} else {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.failedConfig();
		}
	}
	
	public void configure(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostinstScript()) {

			fsm.logger.info("Postinst - configure "+configStatePackageVersion);
			
			String[] initParams = {"configure", configStatePackageVersion};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.SUCCESSFUL_EXIT);
			fsm.install();
		} else {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.failedConfig();
		}
	}
	
	
	public void abortRemove(SimulatorContext fsm) throws Exception {
		
		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPostinstScript()) {
			
			fsm.logger.info("Postinst - abort-remove");

			String[] initParams = {"abort_remove"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.install();
		} else {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.failedConfig();
		}
	}
	
	
	public void abortUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {

		Boolean errorExist = false;
		
		if (installedPkgModel.hasPostinstScript()) {

			fsm.logger.info("Postinst - "+ installedPkgModel.getVersion()+"->abort-upgrade "+ fsm.pkgModel.getVersion());
			
			String[] initParams = {"abort_upgrade", fsm.pkgModel.getVersion()};
			errorExist = this.execute(installedPkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.ERROR_EXIT);
			fsm.install();
		} else {
			if (fsm.getPreviousState() == fsm.POSTRM) {
				fsm.setState(fsm.ERROR_EXIT);
				fsm.unpacked(installedPkgModel);
			} else {
				fsm.setState(fsm.ERROR_EXIT_REINST_REQUIRED);
				fsm.failedConfig(installedPkgModel);
			}
		}
	}
		
	
	private Boolean execute(PackageModelManager pkgModel, String[] initParams) throws Exception {

		Boolean errorExists = false;

		ArrayList<StatementScript> statementList = pkgModel.getStatementPostinstScript();

		if (statementList.size() > 0) {
			String pathPkgModel = pkgModel.setInitParamsPostinst(initParams);

			OrchestrationManager orchestrationPostinstScript = new OrchestrationManager(
					pkgModel.getName(), "PostinstScript", pathPkgModel,
					statementList);
			errorExists = orchestrationPostinstScript.runOrchestrationModel();
		}
		return errorExists;
	}
}
