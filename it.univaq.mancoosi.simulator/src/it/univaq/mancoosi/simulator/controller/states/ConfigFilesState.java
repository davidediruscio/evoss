package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class ConfigFilesState extends SimulatorState {

	public void purge(SimulatorContext fsm) throws Exception {
		fsm.logger.info("ConfigFilesState - purge");
		fsm.setState(fsm.DELETE_CONFFILES);
		fsm.purge();
	}
	
	
	public void install(SimulatorContext fsm, String versionPkgInstalled) throws Exception {
		fsm.logger.info("ConfigFilesState - install");
		fsm.setState(fsm.PREINST);
		fsm.install(versionPkgInstalled);
	}
	
	
	public void successfulExit(SimulatorContext fsm) throws Exception {
		fsm.logger.info("ConfigFilesState - successfulExit");
		this.execute(fsm.pkgModel);
	}
	
	public void errorExit(SimulatorContext fsm) throws Exception {
		fsm.logger.info("ConfigFilesState - errorExit");
		this.execute(fsm.pkgModel);
		
		throw new ErrorModelFoundException();
	}
	
	
	
	private void execute (PackageModelManager pkgModel) throws Exception {
		System.gc();
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setConfigFilesPackage(pkgModel.getName(), pkgModel.getVersion());

		sysModel.saveModel();
	}
}
