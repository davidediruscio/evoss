package it.univaq.mancoosi.simulator.controller.states;

import java.util.ArrayList;
import java.util.List;

import it.univaq.mancoosi.simulator.controller.managers.PackageModelManager;
import it.univaq.mancoosi.simulator.util.SimulatorLogger;

public class SimulatorContext {

	public final int INIT = 0;
	public final int PREINST = 1;
	public final int UNPACK = 2;
	public final int POSTINST = 3;
	public final int PRERM = 4;
	public final int POSTRM = 5;
	public final int DELETE_CONFFILES = 6;
	public final int DELETE_FILES = 7;
	public final int SUCCESSFUL_EXIT = 8;
	public final int ERROR_EXIT = 9;
	public final int ERROR_EXIT_REINST_REQUIRED = 10;

	protected SimulatorLogger logger;
	protected PackageModelManager pkgModel;
	
	// history
	private List<Integer> oldStates;
	
	// Current state
	private int currentState;
	

	public SimulatorContext(PackageModelManager pkgModel) throws Exception {
		this.currentState = INIT; // INIT_STATE - default
		this.pkgModel = pkgModel;
		logger = SimulatorLogger.getInstance();
		oldStates = new ArrayList<Integer>();
	}

	
	// States array
	private SimulatorState[] states = { 
			new InitState(), // INIT = 0
			new PreinstState(), // PREINST = 1
			new UnpackFilesState(), // UNPACK = 2
			new PostinstState(),// POSTINST = 3
			new PrermState(), // PRERM = 4
			new PostrmState(), // POSTRM = 5
			new DeleteConffilesState(), // DELETE_CONFFILES = 6;
			new DeleteFilesState(), // DELETE_FILES = 7;
			new SuccessfulExitState(), // SUCCESSFUL_EXIT = 8;
			new ErrorExitState(), // ERROR_EXIT = 9;
			new ErrorExitReinstRequiredState(), // ERROR_EXIT_REINST_REQUIRED = 10;
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
	
	public void purgeConfFiles() throws Exception {
		states[currentState].purgeConfFiles(this);
	}
	
	public void purgeInstalled() throws Exception {
		states[currentState].purgeInstalled(this);
	}
	
	public void notInstalled() throws Exception {
		states[currentState].notInstalled(this);
	}
	
	public void configure() throws Exception {
		states[currentState].configure(this);
	}
	
	public void failedConfig() throws Exception {
		states[currentState].failedConfig(this);
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
	
	public void configFiles() throws Exception {
		states[currentState].configFiles(this);
	}
	
	public void abortRemove() throws Exception {
		states[currentState].abortRemove(this);
	}
	
	public void halfInstalled() throws Exception {
		states[currentState].halfInstalled(this);
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
	
	public void halfInstalled(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].halfInstalled(this, installedPkgModel);
	}
	
	public void failedConfig(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].failedConfig(this, installedPkgModel);
	}
	
	public void unpacked(PackageModelManager installedPkgModel) throws Exception {
		states[currentState].unpacked(this, installedPkgModel);
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
