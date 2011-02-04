package it.univaq.mancoosi.simulator.controller.states;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

public abstract class SimulatorState {

	public void install(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'install' is not permitted in the current state.");
	}
	
	public void install(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		throw new SimulatorException("The transaction 'install' is not permitted in the current state.");
	}
	
	public void abortInstall(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'abortInstall' is not permitted in the current state.");
	}

	public void abortInstall(SimulatorContext fsm,  String configStatePackageVersion) throws Exception {
		throw new SimulatorException("The transaction 'abortInstall' is not permitted in the current state.");
	}

	public void configure(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'configure' is not permitted in the current state.");
	}

	public void configure(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		throw new SimulatorException("The transaction 'configure' is not permitted in the current state.");
	}
	
	public void successfulExit(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'successfulExit' is not permitted in the current state.");
	}
	
	public void errorExit(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'errorExit' is not permitted in the current state.");
	}
	
	public void errorExitReinstRequired(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'errorExitReinstRequired' is not permitted in the current state.");
	}
	
	public void errorExitReinstRequired(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'errorExitReinstRequired' is not permitted in the current state.");
	}
	
	public void errorExit(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'errorExit' is not permitted in the current state.");
	}
	
	public void remove(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'remove' is not permitted in the current state.");
	}
	
	public void purge(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'purge' is not permitted in the current state.");
	}
	
	public void configFiles(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'configFiles' is not permitted in the current state.");
	}
	
	public void abortRemove(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'abortRemove' is not permitted in the current state.");
	}
	
	public void upgrade(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'upgrade' is not permitted in the current state.");
	}
	
	public void upgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'upgrade' is not permitted in the current state.");
	}
	
	public void failedUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'failedUpgrade' is not permitted in the current state.");
	}
	
	public void abortUpgrade(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'abortUpgrade' is not permitted in the current state.");
	}
}
