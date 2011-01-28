package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.OrchestrationManager;

public class PreinstState extends SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {

		if (fsm.pkgModel.hasPreinstScript()) {
			fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName() + "- Script: Preinst.");

			String[] initParams = { "install" };

			this.execute(fsm, initParams);
			
		} else {
			fsm.logger.info("-Simulator- Package: " + fsm.pkgModel.getName() + "- has no Preinst script.");
		}
		fsm.setState(fsm.UNPACK);
		fsm.install();
	}
	
	private void execute(SimulatorContext fsm, String[] initParams) throws Exception {
		OrchestrationManager orchestrationPreinstScript = new OrchestrationManager(
				fsm.pkgModel.getName(), "PreinstScript",
				fsm.pkgModel.setInitParamsPreinst(initParams),
				fsm.pkgModel.getStatementPreinstScript());
		orchestrationPreinstScript.runOrchestrationModel();
	}

}
