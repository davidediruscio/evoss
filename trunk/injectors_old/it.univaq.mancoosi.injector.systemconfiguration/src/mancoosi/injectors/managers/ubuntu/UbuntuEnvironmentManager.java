package mancoosi.injectors.managers.ubuntu;


import java.io.IOException;

import mancoosi.injectors.managers.EnvironmentManager;


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