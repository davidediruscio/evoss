package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

import java.util.Iterator;

public class UnpackFilesState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {
		fsm.logger.info("UnpackFiles - install");
		this.unpack(fsm.pkgModel);
		
		fsm.setState(fsm.POSTINST);
		fsm.configure();
	}
	
	
	public void install(SimulatorContext fsm, String configFilesPkgVersion) throws Exception {
		fsm.logger.info("UnpackFiles - install");
		this.unpack(fsm.pkgModel);
		
		fsm.setState(fsm.POSTINST);
		fsm.configure(configFilesPkgVersion);
	}
	
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("UnpackFiles - upgrade");
		this.unpack(fsm.pkgModel);
		
		fsm.setState(fsm.POSTRM);
		fsm.upgrade(installedPkgModel);
	}
	
	
	private void unpack(PackageModelManager pkgModel) throws Exception {

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
