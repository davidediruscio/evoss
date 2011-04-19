package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.GroupManager;

public class UbuntuGroupManager extends GroupManager {

	public static GroupManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuGroupManager();
		return INSTANCE;
	}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		//Mirco: we don't need to implement this method cause UserManager synchronize() provides
		//this sinchronize() by itself
	}

}
