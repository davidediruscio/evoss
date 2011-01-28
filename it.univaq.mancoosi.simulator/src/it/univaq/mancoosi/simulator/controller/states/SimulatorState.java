package it.univaq.mancoosi.simulator.controller.states;

public abstract class SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {
	}
	
	public void abortInstall(SimulatorContext fsm) throws Exception {
	}
	
	public void configure(SimulatorContext fsm) throws Exception {
	}
	
	public void successfulExit(SimulatorContext fsm) throws Exception {
	}
	
	public void errorExit(SimulatorContext fsm) throws Exception {
	}
	
	public void remove(SimulatorContext fsm) throws Exception {
	}
	
	public void purge(SimulatorContext fsm) throws Exception {
	}
	
	public void configFiles(SimulatorContext fsm) throws Exception {
	}
	
	public void abortRemove(SimulatorContext fsm) throws Exception {
	}
	
	public void upgrade(SimulatorContext fsm) throws Exception {
	}
	
	public void failedUpgrade(SimulatorContext fsm) throws Exception {
	}
	
	public void abortUpgrade(SimulatorContext fsm) throws Exception {
	}
}
