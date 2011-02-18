package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;

public class InitState extends SimulatorState {

	
	public void purgeConfFiles(SimulatorContext fsm) throws Exception {
		fsm.logger.info("ConfigFiles - purge");
		fsm.setState(fsm.DELETE_CONFFILES);
		fsm.purge();
	}
	
	
	public void install(SimulatorContext fsm, String versionPkgInstalled) throws Exception {
		fsm.logger.info("ConfigFiles - install");
		fsm.setState(fsm.PREINST);
		fsm.install(versionPkgInstalled);
	}
	
	public void install(SimulatorContext fsm) throws Exception {
		fsm.logger.info("NotInstalled - install");
		fsm.setState(fsm.PREINST);
		fsm.install();
	}

	public void remove(SimulatorContext fsm) throws Exception {
		fsm.logger.info("Installed - remove");	
		fsm.setState(fsm.PRERM);
		fsm.remove();
	}
	
	public void purgeInstalled(SimulatorContext fsm) throws Exception {
		fsm.logger.info("Installed - purge");	
		fsm.setState(fsm.PRERM);
		fsm.purge();
	}
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("Installed - upgrade");
		fsm.setState(fsm.PRERM);
		fsm.upgrade(installedPkgModel);
	}
}
