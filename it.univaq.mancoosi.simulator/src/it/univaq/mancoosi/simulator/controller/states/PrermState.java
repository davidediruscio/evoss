package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;

public class PrermState extends SimulatorState {

	public void remove(SimulatorContext fsm) throws Exception {

		if (fsm.pkgModel.hasPrermScript()) {

			fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName()
					+ "- Script: Prerm.");

			String[] initParams = {"remove"};
			
			OrchestrationManager orchestrationPrermScript = new OrchestrationManager(fsm.pkgModel.getName(),
					"PrermScript", fsm.pkgModel.setInitParamsPostrm(initParams), fsm.pkgModel.getStatementPrermScript());
			orchestrationPrermScript.runOrchestrationModel();

		} else {
			fsm.logger.info("-Simulator- Package: " + fsm.pathPackageModel
					+ "- has not Prerm script.");
		}
		
		fsm.setState(fsm.UNPACK);
		fsm.remove();
	}
}
