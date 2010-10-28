package mancoosi.injectors.managers.ubuntu;

import java.io.IOException;

import mancoosi.injectors.managers.ConfigurationManager;

public class UbuntuConfigurationManager extends ConfigurationManager {

	 
	   public static ConfigurationManager getInstance() {
	      if (INSTANCE == null)
	    	  INSTANCE = new UbuntuConfigurationManager();
	      return INSTANCE;
	   }
	   
		
		public void synchronize() throws IOException {
			// TODO	
		}
		
}
