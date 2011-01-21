package mancoosi.injectors.managers;

import java.io.IOException;

import mancoosi.Configuration;
import mancoosi.Environment;
import mancoosi.MancoosiFactory;


public abstract class EnvironmentManager {
	   protected static EnvironmentManager INSTANCE;
	 
	   private Environment environment;
	   
	   // Private constructor prevents instantiation from other classes
	   protected EnvironmentManager() {
		   MancoosiFactory factory = MancoosiFactory.eINSTANCE; 
		   environment = factory.createEnvironment();
	   }
	 
	   public static EnvironmentManager getInstance() {
	      return INSTANCE;
	   }
	   
	   public Environment getEnvironment() {
		   return environment;
	   }
	   
	   public void setEnvironment(Environment environment) {
		   this.environment = environment;
	   }
	   
	   public abstract void synchronize() throws IOException;
		


}