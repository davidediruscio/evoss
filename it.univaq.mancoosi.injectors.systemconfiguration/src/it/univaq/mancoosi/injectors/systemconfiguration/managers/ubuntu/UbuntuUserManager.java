package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;


import it.univaq.mancoosi.injectors.systemconfiguration.managers.UserManager;
import java.io.IOException;

public class UbuntuUserManager extends UserManager {

	protected UbuntuUserManager(){
		this.configuration = UbuntuConfigurationManager.getInstance().getConfiguration();
		this.groupManager = UbuntuGroupManager.getInstance();
	}

	public static UserManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuUserManager();
		return INSTANCE;
	}

	//mirco
	@Override
	public void synchronize() throws IOException {

		configuration.getEnvironment().getUsers().clear();
		configuration.getEnvironment().getGroups().clear();

		UserManager.getInstance().createUsersFromSystem();
	}

}
