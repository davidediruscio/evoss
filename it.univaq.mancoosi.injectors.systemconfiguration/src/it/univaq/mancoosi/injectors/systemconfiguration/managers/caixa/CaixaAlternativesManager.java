package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

import it.univaq.mancoosi.mancoosimm.Alternative;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.AlternativesManager;

public class CaixaAlternativesManager extends AlternativesManager{
	   	   

		public static AlternativesManager getInstance() {
			if (INSTANCE == null)
					INSTANCE = new CaixaAlternativesManager();
			return INSTANCE;
		}

		   
	   public Alternative getAlternative(String alternativeName){
		   //TODO
		   return null;
	   };
		   
	   public Boolean exists(String alternativeName){
		   //TODO
		   return false;
	   };
		
	   public  void sychronize() {
		   //TODO
	   };
		
	   public void createAlternativesFromSystem() {
		   Alternative newAlternative;
		   String line;
			
			try {
			      String[] cmd = {"/bin/sh","-c","ls -l /etc/alternatives | awk '{print $8 \" -> \"  $10}'"};
			      Process p = Runtime.getRuntime().exec(cmd);
			      BufferedReader input =
			        new BufferedReader
			          (new InputStreamReader(p.getInputStream()));
			      
			      line = input.readLine(); //This is to do not consider the first line which is something like "total 32"
			      while ((line = input.readLine()) != null) {
			    	  String[] elements = line.split(" -> ");
			    	  if  (elements.length > 1) {
				    	  newAlternative = factory.createAlternative();
				    	  newAlternative.setName(elements[0]);
				    	  newAlternative.setCurrent(CaixaFileSystemManager.getInstance().createFile(elements[1]));
				    	  CaixaEnvironmentManager.getInstance().getEnvironment().getAlternatives().add(newAlternative);
			    	  }
			      }

				  input.close();

			} catch (Exception err) {
			      err.printStackTrace();
		    }
			
			
	   }

}
