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
	
	public void halfInstalled(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'halfInstalled' is not permitted in the current state.");
	}

	public void failedConfig(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'failedConfig' is not permitted in the current state.");
	}
	
	public void configure(SimulatorContext fsm, String configStatePackageVersion) throws Exception {
		throw new SimulatorException("The transaction 'configure' is not permitted in the current state.");
	}
	
	public void remove(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'remove' is not permitted in the current state.");
	}
	
	public void purge(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'purge' is not permitted in the current state.");
	}
	
	public void purgeInstalled(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'purgeInstalled' is not permitted in the current state.");
	}
	
	public void purgeConfFiles(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'purgeConfFiles' is not permitted in the current state.");
	}
	
	public void configFiles(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'configFiles' is not permitted in the current state.");
	}
	
	public void abortRemove(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'abortRemove' is not permitted in the current state.");
	}
	
	public void notInstalled(SimulatorContext fsm) throws Exception {
		throw new SimulatorException("The transaction 'notInstalled' is not permitted in the current state.");
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
	
	public void halfInstalled(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'halfInstalled' is not permitted in the current state.");
	}
	
	public void failedConfig(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'failedConfig' is not permitted in the current state.");
	}
	
	public void unpacked(SimulatorContext fsm, PackageModelManager installedPkgModel) throws Exception {
		throw new SimulatorException("The transaction 'unpacked' is not permitted in the current state.");
	}
}
