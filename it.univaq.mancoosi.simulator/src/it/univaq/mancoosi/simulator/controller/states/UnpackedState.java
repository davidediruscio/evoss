package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

import java.util.Iterator;

public class UnpackedState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {

		if (fsm.pkgModel.hasFiles()) {
			fsm.logger.info("Package: " + fsm.pkgModel.getName() + "- Unpacking.");
			SystemModelManager sysModel = new SystemModelManager();
			Iterator<File> listFilesPackage = fsm.pkgModel.getListfiles().iterator();
			while (listFilesPackage.hasNext()) {
				File file = listFilesPackage.next();
				sysModel.addFile(file.getLocation());
			}
			sysModel.saveModel();
		} else {
			fsm.logger.info("Package: " + fsm.pkgModel.getName() + " has no files to install.");
		}
		fsm.setState(fsm.POSTINST);
		fsm.configure();
	}
}
