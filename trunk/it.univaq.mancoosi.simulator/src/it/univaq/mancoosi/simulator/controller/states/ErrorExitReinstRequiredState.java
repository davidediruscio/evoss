package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class ErrorExitReinstRequiredState extends SimulatorState {

	
	public void halfInstalled(SimulatorContext fsm) throws Exception {
		fsm.logger.info("HalfInstalled - errorExitReinstRequired");
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setHalfInstalledReinstRequiredPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion(), fsm.pkgModel.getArchitecture());
		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
		
	}
	
	
	public void halfInstalled(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("HalfInstalled - errorExitReinstRequired");
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setHalfInstalledReinstRequiredPackage(installedPkgModel.getName(), installedPkgModel.getVersion(), installedPkgModel.getArchitecture());
		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
		
	}
	
	
	public void failedConfig(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("FailedConfig - errorExitReinstRequired");	

		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setHalfConfiguredReinstRequiredPackage(installedPkgModel.getName(),
				installedPkgModel.getVersion(), installedPkgModel.getConfFiles(),
				installedPkgModel.getMaintainer(),
				installedPkgModel.getArchitecture(), installedPkgModel.getSection(),
				installedPkgModel.getPriority(), installedPkgModel.getDescription());
		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
	}
	
}
