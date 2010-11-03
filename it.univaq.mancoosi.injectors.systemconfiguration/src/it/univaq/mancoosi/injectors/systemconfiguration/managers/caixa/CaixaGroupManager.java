package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;

import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.GroupManager;


public class CaixaGroupManager extends GroupManager {

	public static GroupManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaGroupManager();
		return INSTANCE;
	}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
