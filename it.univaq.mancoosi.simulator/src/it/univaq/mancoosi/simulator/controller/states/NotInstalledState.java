package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class NotInstalledState extends SimulatorState {

	public void successfulExit(SimulatorContext fsm) throws Exception {

		fsm.logger.info("NotInstalledState - successfulExit");
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setNotInstalledPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion(), fsm.pkgModel.getArchitecture());

		sysModel.saveModel();

	}
	
	
	public void errorExit(SimulatorContext fsm) throws Exception {

		fsm.logger.info("NotInstalledState - errorExit");	
		
		throw new ErrorModelFoundException();

	}
		
	

	public void install(SimulatorContext fsm) throws Exception {
		fsm.logger.info("NotInstalledState - install");
		fsm.setState(fsm.PREINST);
		fsm.install();
	}
}
