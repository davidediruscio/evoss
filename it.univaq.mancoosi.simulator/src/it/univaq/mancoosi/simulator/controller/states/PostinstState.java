package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;

public class PostinstState extends SimulatorState {

	public void configure(SimulatorContext fsm) throws Exception {

		if (fsm.pkgModel.hasPostinstScript()) {

			fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName() + "- Script: Postinst.");

			String[] initParams = {"configure"};

			OrchestrationManager orchestrationPostinstScript = new OrchestrationManager(fsm.pkgModel.getName(),
					"PostinstScript", fsm.pkgModel.setInitParamsPostinst(initParams), fsm.pkgModel.getStatementPostinstScript());
			orchestrationPostinstScript.runOrchestrationModel();

		} else {
			fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName() + "- has no Postinst script.");
		}
		fsm.setState(fsm.INSTALLED);
		fsm.successfulExit();
	}
}
