package it.univaq.mancoosi.simulator.controller.states;

import java.util.ArrayList;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.entity.StatementScript;

public class PrermState extends SimulatorState {

	public void remove(SimulatorContext fsm) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPrermScript()) {
			
			fsm.logger.info("Prerm - remove");
			
			String[] initParams = {"remove"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.DELETE_FILES);
			fsm.remove();
		} else {
			fsm.setState(fsm.POSTINST);
			fsm.abortRemove();
		}
	}
	
	public void purge(SimulatorContext fsm) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPrermScript()) {
			
			fsm.logger.info("Prerm - purge");
			
			String[] initParams = {"remove"};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.DELETE_FILES);
			fsm.purge();
		} else {
			fsm.setState(fsm.POSTINST);
			fsm.abortRemove();
		}
	}
	
	
	public void failedUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPrermScript()) {
			
			fsm.logger.info("Prerm - "+fsm.pkgModel.getVersion()+"->failed-upgrade "+installedPkgModel.getVersion());
			
			String[] initParams = {"failed_upgrade", installedPkgModel.getVersion()};
			errorExist = this.execute(fsm.pkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.PREINST);
			fsm.upgrade(installedPkgModel);
		} else {
			fsm.setState(fsm.POSTINST);
			fsm.abortUpgrade(installedPkgModel);
		}
	}
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {

		Boolean errorExist = false;
		
		if (installedPkgModel.hasPrermScript()) {
			
			fsm.logger.info("Prerm - "+installedPkgModel.getVersion()+"->upgrade "+fsm.pkgModel.getVersion());
			
			String[] initParams = {"upgrade", fsm.pkgModel.getVersion()};
			errorExist = this.execute(installedPkgModel, initParams);
		}
		
		if (!errorExist) {
			fsm.setState(fsm.PREINST);
			fsm.upgrade(installedPkgModel);
		} else {
			fsm.setState(fsm.PRERM);
			fsm.failedUpgrade(installedPkgModel);
		}
	}
	
	
	private Boolean execute(PackageModelManager pkgModel, String[] initParams) throws Exception {

		Boolean errorExists = false;

		ArrayList<StatementScript> statementList = pkgModel.getStatementPrermScript();

		if (statementList.size() > 0) {
			String pathPkgModel = pkgModel.setInitParamsPrerm(initParams);

			OrchestrationManager orchestrationPrermScript = new OrchestrationManager(
					pkgModel.getName(), "PrermScript", pathPkgModel,
					statementList);
			errorExists = orchestrationPrermScript.runOrchestrationModel();
		}
		
		return errorExists;
	}
}
