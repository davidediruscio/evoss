package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class InstalledState extends SimulatorState {
	
	public void successfulExit(SimulatorContext fsm) throws Exception {
		
		System.gc();
		
		fsm.logger.info("InstalledState - successfulExit");	
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setInstalledPackage(fsm.pkgModel.getName(),
				fsm.pkgModel.getVersion(), fsm.pkgModel.getDependences(),
				fsm.pkgModel.getConflicts(), fsm.pkgModel.getConfFiles(),
				fsm.pkgModel.getInstalledSize(), fsm.pkgModel.getMaintainer(),
				fsm.pkgModel.getArchitecture(), fsm.pkgModel.getSection(),
				fsm.pkgModel.getPriority());
		sysModel.saveModel();
	}
	
	
	public void errorExit(SimulatorContext fsm) throws Exception {
		System.gc();
		
		fsm.logger.info("InstalledState - errorExit");	
		
		throw new ErrorModelFoundException();

	}
	

	public void remove(SimulatorContext fsm) throws Exception {
		fsm.logger.info("InstalledState - remove");	
		fsm.setState(fsm.PRERM);
		fsm.remove();
	}
	
	public void purge(SimulatorContext fsm) throws Exception {
		fsm.logger.info("InstalledState - purge");	
		fsm.setState(fsm.PRERM);
		fsm.purge();
	}
	
	public void upgrade(SimulatorContext fsm) throws Exception {
		fsm.setState(fsm.PRERM);
		fsm.upgrade(fsm.installedPkgModel);
	}

}
