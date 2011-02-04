package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class FailedConfigState extends SimulatorState {
	
	public void errorExit(SimulatorContext fsm) throws Exception {
		fsm.logger.info("FailedConfigState - errorExit");		
		
		this.execute(fsm.pkgModel);
		
		throw new ErrorModelFoundException();
	}


	public void errorExitReinstRequired(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("FailedConfigState - errorExitReinstRequired");	
		
		this.execute(installedPkgModel);
		
		throw new ErrorModelFoundException();
	}

	
	private void execute(PackageModelManager pkgModel) throws Exception {
		System.gc();
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setFailedConfigPackage(pkgModel.getName(),
				pkgModel.getVersion(), pkgModel.getConfFiles(),
				pkgModel.getMaintainer(),
				pkgModel.getArchitecture(), pkgModel.getSection(),
				pkgModel.getPriority());
		sysModel.saveModel();
		
	}

}
