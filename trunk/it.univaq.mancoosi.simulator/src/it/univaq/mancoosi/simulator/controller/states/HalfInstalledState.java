package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class HalfInstalledState extends SimulatorState {

	public void errorExitReinstRequired(SimulatorContext fsm) throws Exception {
		fsm.logger.info("HalfInstalledState - errorExitReinstRequired");
		
		this.execute(fsm.pkgModel);
		
		throw new ErrorModelFoundException();
		
	}


	public void errorExitReinstRequired(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("HalfInstalledState - errorExitReinstRequired");
		
		this.execute(installedPkgModel);
		
		throw new ErrorModelFoundException();
		
	}
	
	
	public void errorExit(SimulatorContext fsm) throws Exception {
		fsm.logger.info("HalfInstalledState - errorExit");
		
		this.execute(fsm.pkgModel);
		
	}

	
	
	private void execute(PackageModelManager pkgModel) throws Exception {
		
		System.gc();
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setHalfInstalledPackage(pkgModel.getName(),
				pkgModel.getVersion());
		sysModel.saveModel();
		
	}
	
}
