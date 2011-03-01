package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

public class SuccessfulExitState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {
		
		fsm.logger.info("Installed - successfulExit");	
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setInstalledPackage(fsm.pkgModel.getName(),
				fsm.pkgModel.getVersion(), fsm.pkgModel.getDependences(),
				fsm.pkgModel.getConflicts(), fsm.pkgModel.getConfFiles(),
				fsm.pkgModel.getInstalledSize(), fsm.pkgModel.getMaintainer(),
				fsm.pkgModel.getArchitecture(), fsm.pkgModel.getSection(),
				fsm.pkgModel.getPriority(), fsm.pkgModel.getDescription());
		sysModel.saveModel();
	}
	
	
	public void purge(SimulatorContext fsm) throws Exception {

		fsm.logger.info("NotInstalled - successfulExit");
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setNotInstalledPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion(), fsm.pkgModel.getArchitecture());

		sysModel.saveModel();

	}
	
	
	public void configFiles(SimulatorContext fsm) throws Exception {
		fsm.logger.info("ConfigFiles - successfulExit");
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setConfigFilesPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion(), fsm.pkgModel.getArchitecture());

		sysModel.saveModel();
	}
	
}
