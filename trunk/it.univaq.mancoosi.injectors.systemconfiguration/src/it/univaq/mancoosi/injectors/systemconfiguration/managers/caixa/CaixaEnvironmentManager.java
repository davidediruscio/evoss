package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;


import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.EnvironmentManager;


public class CaixaEnvironmentManager extends EnvironmentManager {
	
	public static EnvironmentManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaEnvironmentManager();
		return INSTANCE;
	}
	 
	public void synchronize() throws IOException {
		// TODO	
	};
		


}