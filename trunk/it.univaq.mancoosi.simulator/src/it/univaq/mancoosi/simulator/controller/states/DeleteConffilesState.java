package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

import java.util.ArrayList;

public class DeleteConffilesState extends SimulatorState {
	
	
	public void purge(SimulatorContext fsm) throws Exception {
		fsm.logger.info("DeleteConffilesState - purge");
		this.execute(fsm.pkgModel);
		
		fsm.setState(fsm.POSTRM);
		fsm.purge();
	}
	
	
	private void execute(PackageModelManager pkgModel) throws Exception {

		if (pkgModel.hasConfFiles()) {
			SystemModelManager sysModel = new SystemModelManager();
			ArrayList<String> list = pkgModel.getConfFiles();

			for (int i = 0; i < list.size(); i++) {
				sysModel.deleteFile(list.get(i));
			}
			sysModel.saveModel();
		}
	}
}
