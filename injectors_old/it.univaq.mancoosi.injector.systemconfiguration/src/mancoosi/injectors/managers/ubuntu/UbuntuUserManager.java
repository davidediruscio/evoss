package mancoosi.injectors.managers.ubuntu;


import java.io.IOException;
import java.util.HashMap;

import mancoosi.injectors.managers.UserManager;

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

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	 
}
