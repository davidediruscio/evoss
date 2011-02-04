package it.univaq.mancoosi.simulator.controller.states;

import java.util.ArrayList;
import java.util.List;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.util.SimulatorLogger;

public class SimulatorContext {

	public final int NOT_INSTALLED = 0;
	public final int PREINST = 1;
	public final int UNPACK = 2;
	public final int POSTINST = 3;
	public final int INSTALLED = 4;
	public final int PRERM = 5;
	public final int POSTRM = 6;
	public final int CONFIG_FILES = 7;
	public final int DELETE_CONFFILES = 8;
	public final int DELETE_FILES = 9;
	public final int FAILED_CONFIG = 10;
	public final int HALF_INSTALLED = 11;

	protected String pathPackageModel;
	protected SimulatorLogger logger;
	protected PackageModelManager pkgModel;
	protected PackageModelManager installedPkgModel;
	
	// history
	private List<Integer> oldStates;
	
	// Current state
	private int currentState;
	

	public SimulatorContext(String pathPackageModel) throws Exception {
		this.pathPackageModel = pathPackageModel;
		pkgModel = new PackageModelManager(pathPackageModel);
		logger = SimulatorLogger.getInstance();
		oldStates = new ArrayList<Integer>();
	}
	
	
	public SimulatorContext(String pathPackageModelNew, String pathInstalledPackageModel) throws Exception {
		this.pathPackageModel = pathPackageModelNew;
		pkgModel = new PackageModelManager(pathPackageModel);
		installedPkgModel = new PackageModelManager(pathInstalledPackageModel);
		logger = SimulatorLogger.getInstance();
		oldStates = new ArrayList<Integer>();
	}

	// States array
	private SimulatorState[] states = { 
			new NotInstalledState(), // NOT_INSTALLED = 0
			new PreinstState(), // PREINST = 1
			new UnpackedState(), // UNPACK = 2
			new PostinstState(),// POSTINST = 3
			new InstalledState(), // INSTALLED = 4
			new PrermState(), // PRERM = 5
			new PostrmState(), // POSTRM = 6
			new ConfigFilesState(), // CONFIG_FILES = 7;
			new DeleteConffilesState(), // DELETE_CONFFILES = 8;
			new DeleteFilesState(), // DELETE_FILES = 9;
			new FailedConfigState(), // FAILED_CONFIG = 10;
			new HalfInstalledState(), // HALF_INSTALLED = 11;
	};


	public void install() throws Exception {
		states[currentState].install(this);
	}
	
	public void install(String configStatePackageVersion) throws Exception {
		states[currentState].install(this, configStatePackageVersion);
	}
	
	public void remove() throws Exception {
		states[currentState].remove(this);
	}
	
	public void purge() throws Exception {
		states[currentState].purge(this);
	}
	
	public void configure() throws Exception {
		states[currentState].configure(this);
	}
	
	public void configure(String configStatePackageVersion) throws Exception {
		states[currentState].configure(this, configStatePackageVersion);
	}
	
	public void abortInstall() throws Exception {
		states[currentState].abortInstall(this);
	}
	
	public void abortInstall(String configStatePackageVersion) throws Exception {
		states[currentState].abortInstall(this, configStatePackageVersion);
	}

	public void successfulExit() throws Exception {
		states[currentState].successfulExit(this);
	}
	
	public void errorExit() throws Exception {
		states[currentState].errorExit(this);
	}
	
	public void errorExitReinstRequired() throws Exception {
		states[currentState].errorExitReinstRequired(this);
	}
	
	public void errorExitReinstRequired(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].errorExitReinstRequired(this, installedPkgModel);
	}

	public void errorExit(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].errorExit(this, installedPkgModel);
	}
	
	public void configFiles() throws Exception {
		states[currentState].configFiles(this);
	}
	
	public void abortRemove() throws Exception {
		states[currentState].abortRemove(this);
	}
	
	public void upgrade() throws Exception {
		states[currentState].upgrade(this);
	}
	
	public void upgrade(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].upgrade(this, installedPkgModel);
	}

	public void failedUpgrade(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].failedUpgrade(this, installedPkgModel);
	}

	public void abortUpgrade(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].abortUpgrade(this, installedPkgModel);
	}

	public void setState(int newState) {
		oldStates.add(currentState);
		currentState = newState;
	}
	
	public Integer getPreviousState() {
		return oldStates.get(oldStates.size()-1);
	}
	
	public List<Integer> getHistory() {
		return oldStates;
	}
}
