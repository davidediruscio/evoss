package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;


import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.EnvironmentManager;


public class UbuntuEnvironmentManager extends EnvironmentManager {
	
	public static EnvironmentManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuEnvironmentManager();
		return INSTANCE;
	}
	 
	public void synchronize() throws IOException {
		// TODO	
	};
		


}