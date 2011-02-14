package it.univaq.mancoosi.simulator.controller.states;


import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;

public class PreinstState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPreinstScript()) {

			fsm.logger.info("Preinst - install");
			
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

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPreinstScript()) {

			fsm.logger.info("Preinst - install "+configStatePackageVersion);
			
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

		Boolean errorExist = false;
		
		if (fsm.pkgModel.hasPreinstScript()) {
			
			fsm.logger.info("Preinst - "+fsm.pkgModel.getVersion()+"->upgrade "+installedPkgModel.getVersion());
			
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

		Boolean errorExist = false;
		
		if (installedPkgModel.hasPreinstScript()) {
			
			fsm.logger.info("Preinst - "+installedPkgModel.getVersion()+"->abort-upgrade "+fsm.pkgModel.getVersion());
			
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

		String pathPkgModel = pkgModel.setInitParamsPreinst(initParams);
		
		OrchestrationManager orchestrationPreinstScript = new OrchestrationManager(
				pkgModel.getName(), 
				"PreinstScript",
				pathPkgModel,
				pkgModel.getStatementPreinstScript());
		Boolean errorExists = orchestrationPreinstScript.runOrchestrationModel();
		
		return errorExists;
	}

}
