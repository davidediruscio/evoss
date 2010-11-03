package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.ConfigurationManager;

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
