package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

public class InstalledState extends SimulatorState {
	
	public void successfulExit(SimulatorContext fsm) throws Exception {
		
		fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName() + "- Final.");

		SystemModelManager sysModel = new SystemModelManager();

		sysModel.installNotInstalledPackage(fsm.pkgModel.getName(),
				fsm.pkgModel.getVersion(), fsm.pkgModel.getDependences(),
				fsm.pkgModel.getConflicts(), fsm.pkgModel.getConfFiles(),
				fsm.pkgModel.getInstalledSize(), fsm.pkgModel.getMaintainer(),
				fsm.pkgModel.getArchitecture(), fsm.pkgModel.getSection(),
				fsm.pkgModel.getPriority());
		sysModel.saveModel();
	}

	public void remove(SimulatorContext fsm) throws Exception {
		fsm.setState(fsm.PRERM);
		fsm.remove();
	}
	
	public void purge(SimulatorContext fsm) throws Exception {
		fsm.setState(fsm.PRERM);
		fsm.purge();
	}

}
