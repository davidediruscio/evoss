package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

public class NotInstalledState extends SimulatorState {

	public void successfulExit(SimulatorContext fsm) throws Exception {

		fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName() + "- Final.");

		SystemModelManager sysModel = new SystemModelManager();

		sysModel.removeInstalledPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion());

		sysModel.saveModel();

	}

	public void install(SimulatorContext fsm) throws Exception {
		fsm.setState(fsm.PREINST);
		fsm.install();
	}
}
