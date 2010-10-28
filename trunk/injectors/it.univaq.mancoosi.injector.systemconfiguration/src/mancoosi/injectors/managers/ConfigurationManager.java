package mancoosi.injectors.managers;

import java.io.IOException;

import mancoosi.Configuration;
import mancoosi.MancoosiFactory;



public abstract class ConfigurationManager {
	   protected static  ConfigurationManager INSTANCE ;
	 
	   private Configuration configuration;
	   
	   // Private constructor prevents instantiation from other classes
	   protected ConfigurationManager() {
		   MancoosiFactory factory = MancoosiFactory.eINSTANCE; 
		   configuration = factory.createConfiguration();
	   }
	 
	   public static ConfigurationManager getInstance() {
	      return INSTANCE;
	   }
	   
	   public Configuration getConfiguration() {  
		   return configuration;
	   }
	   
	   public void setConfiguration(Configuration configuration) {
		   this.configuration = configuration;
	   }
	   
		
	   public abstract void synchronize() throws IOException;
		

}
