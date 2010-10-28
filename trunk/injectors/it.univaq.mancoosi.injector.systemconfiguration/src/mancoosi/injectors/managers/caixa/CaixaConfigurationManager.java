package mancoosi.injectors.managers.caixa;

import java.io.IOException;

import mancoosi.injectors.managers.ConfigurationManager;

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
