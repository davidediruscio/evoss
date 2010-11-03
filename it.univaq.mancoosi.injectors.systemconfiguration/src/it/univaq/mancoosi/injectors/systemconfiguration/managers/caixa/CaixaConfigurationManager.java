package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;

import java.io.IOException;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.ConfigurationManager;

public class CaixaConfigurationManager extends ConfigurationManager {

	 
	   public static ConfigurationManager getInstance() {
	      if (INSTANCE == null)
	    	  INSTANCE = new CaixaConfigurationManager();
	      return INSTANCE;
	   }
	   
		
		public void synchronize() throws IOException {
			// TODO	
		}
		
}
