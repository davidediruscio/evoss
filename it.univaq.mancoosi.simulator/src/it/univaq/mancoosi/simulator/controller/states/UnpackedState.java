package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;
import it.univaq.mancoosi.simulator.exceptions.ErrorModelFoundException;

import java.util.Iterator;

public class UnpackedState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {
		fsm.logger.info("UnpackedState - install");
		this.unpack(fsm.pkgModel);
		
		fsm.setState(fsm.POSTINST);
		fsm.configure();
	}
	
	
	public void install(SimulatorContext fsm, String configFilesPkgVersion) throws Exception {
		fsm.logger.info("UnpackedState - install");
		this.unpack(fsm.pkgModel);
		
		fsm.setState(fsm.POSTINST);
		fsm.configure(configFilesPkgVersion);
	}
	
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("UnpackedState - upgrade");
		this.unpack(fsm.pkgModel);
		
		fsm.setState(fsm.POSTRM);
		fsm.upgrade(installedPkgModel);
	}
	
	
	public void errorExit(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("UnpackedState - errorExit");
		
		System.gc();
		
		SystemModelManager sysModel = new SystemModelManager();
		
		sysModel.setUnpackedPackage(installedPkgModel.getName(),
				installedPkgModel.getVersion(), installedPkgModel.getConfFiles(), 
				installedPkgModel.getMaintainer(), installedPkgModel.getArchitecture(),
				installedPkgModel.getSection(), installedPkgModel.getPriority());
		
		sysModel.saveModel();
		
		
		throw new ErrorModelFoundException();
	}
	
	private void unpack(PackageModelManager pkgModel) throws Exception {
		
		System.gc();
		
		if (pkgModel.hasFiles()) {

			SystemModelManager sysModel = new SystemModelManager();
			Iterator<File> listFilesPackage = pkgModel.getListfiles().iterator();
			while (listFilesPackage.hasNext()) {
				File file = listFilesPackage.next();
				sysModel.addFile(file.getLocation());
			}
			sysModel.saveModel();
		}
	}
}
