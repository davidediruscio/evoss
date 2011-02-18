package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

public class ErrorExitState extends SimulatorState {

	
	public void install(SimulatorContext fsm) throws Exception {
		
		fsm.logger.info("Installed - errorExit");	
		
		throw new ErrorModelFoundException();

	}
	
	
	public void notInstalled(SimulatorContext fsm) throws Exception {

		fsm.logger.info("NotInstalled - errorExit");	
		
		throw new ErrorModelFoundException();

	}
	
	
	public void halfInstalled(SimulatorContext fsm) throws Exception {
		fsm.logger.info("HalfInstalled - errorExit");
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setHalfInstalledPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion(), fsm.pkgModel.getArchitecture());
		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
	}
	
	
	public void failedConfig(SimulatorContext fsm) throws Exception {
		fsm.logger.info("FailedConfig - errorExit");		
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setFailedConfigPackage(fsm.pkgModel.getName(),
				fsm.pkgModel.getVersion(), fsm.pkgModel.getConfFiles(),
				fsm.pkgModel.getMaintainer(),
				fsm.pkgModel.getArchitecture(), fsm.pkgModel.getSection(),
				fsm.pkgModel.getPriority());
		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
	}
	
	
	public void unpacked(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("Unpacked - errorExit");

		SystemModelManager sysModel = new SystemModelManager();
		
		sysModel.setUnpackedPackage(installedPkgModel.getName(),
				installedPkgModel.getVersion(), installedPkgModel.getConfFiles(), 
				installedPkgModel.getMaintainer(), installedPkgModel.getArchitecture(),
				installedPkgModel.getSection(), installedPkgModel.getPriority());
		
		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
	}
	
	
	public void configFiles(SimulatorContext fsm) throws Exception {
		fsm.logger.info("ConfigFiles - errorExit");
		
		SystemModelManager sysModel = new SystemModelManager();

		sysModel.setConfigFilesPackage(fsm.pkgModel.getName(), fsm.pkgModel.getVersion(), fsm.pkgModel.getArchitecture());

		sysModel.saveModel();
		
		throw new ErrorModelFoundException();
	}
}
