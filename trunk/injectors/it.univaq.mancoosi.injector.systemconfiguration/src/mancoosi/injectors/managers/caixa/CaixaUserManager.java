package mancoosi.injectors.managers.caixa;


import java.io.IOException;
import java.util.HashMap;

import mancoosi.injectors.managers.UserManager;

public class CaixaUserManager extends UserManager {
	
	protected CaixaUserManager(){
			this.configuration = CaixaConfigurationManager.getInstance().getConfiguration();
			this.groupManager = CaixaGroupManager.getInstance();
		}
	
	public static UserManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaUserManager();
		return INSTANCE;
	}

	@Override
	public void synchronize() throws IOException {
		// TODO Auto-generated method stub
		
	}
	 
}
