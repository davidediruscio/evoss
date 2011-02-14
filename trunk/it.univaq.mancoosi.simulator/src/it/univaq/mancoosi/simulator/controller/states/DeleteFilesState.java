package it.univaq.mancoosi.simulator.controller.states;

import java.util.ArrayList;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.controller.managers.SystemModelManager;

public class DeleteFilesState extends SimulatorState {

	public void remove(SimulatorContext fsm) throws Exception {
		fsm.logger.info("DeleteFilesState - remove");
		this.execute(fsm.pkgModel);
		
		fsm.setState(fsm.POSTRM);
		fsm.remove();
	}

	
	public void purge(SimulatorContext fsm) throws Exception {
		fsm.logger.info("DeleteFilesState - purge");
		this.execute(fsm.pkgModel);
		
		fsm.setState(fsm.POSTRM);
		fsm.purge();
	}

	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		fsm.logger.info("DeleteFilesState - upgrade");
		this.execute(fsm.pkgModel, installedPkgModel);
		
		fsm.setState(fsm.POSTINST);
		fsm.configure(installedPkgModel.getVersion());
	}
	
	
	private void execute(PackageModelManager pkgModel) throws Exception {

		if (pkgModel.hasFiles()) {
			SystemModelManager sysModel = new SystemModelManager();
			ArrayList<String> list = pkgModel.getNotConfFiles();

			for (int i = list.size()-1; i >= 0; i--) {
				sysModel.deleteFile(list.get(i));
			}
			sysModel.saveModel();
		}
	}
	
	
	private void execute(PackageModelManager newpkgModel, PackageModelManager oldPkgModel) throws Exception {

		if (oldPkgModel.hasFiles()) {
			SystemModelManager sysModel = new SystemModelManager();
			
			ArrayList<String> listOld = oldPkgModel.getNotConfFiles();
			
			ArrayList<String> listNew = newpkgModel.getNotConfFiles();
			
			ArrayList<String> listOldButNotNew = new ArrayList<String>();
			
			for (int i=0; i<listOld.size(); i++) {
				Boolean found = false;
				for (int j=0; j<listNew.size() && !found; j++) {
					if (listOld.get(i).equals(listNew.get(j))) {
						found = true;
					}
				}
				
				if (!found) listOldButNotNew.add(listOld.get(i));
			}

			for (int i = listOldButNotNew.size()-1; i >=0 ; i--) {
				sysModel.deleteFile(listOldButNotNew.get(i));
			}
			sysModel.saveModel();
		}
	}
}
