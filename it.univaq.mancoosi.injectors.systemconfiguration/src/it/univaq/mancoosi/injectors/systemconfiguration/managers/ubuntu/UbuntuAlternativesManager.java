package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import it.univaq.mancoosi.mancoosimm.Alternative;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.AlternativesManager;

public class UbuntuAlternativesManager extends AlternativesManager{
	   	   

		public static AlternativesManager getInstance() {
			if (INSTANCE == null)
					INSTANCE = new UbuntuAlternativesManager();
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
		   String line,line2;
			
			try {
			      String[] cmd = {"/bin/sh","-c","ls --time-style=long-iso -l /etc/alternatives | awk '{print $8 \" -> \"  $10}'"};
			      Process p = Runtime.getRuntime().exec(cmd);
			      BufferedReader input =
			        new BufferedReader
			          (new InputStreamReader(p.getInputStream()));
			      
			    //  line = input.readLine(); //This is to do not consider the first line which is something like "total 32"
			      while ((line = input.readLine()) != null) {
			    	  String[] elements = line.split(" -> ");
			    	  if  (elements.length > 1) {
				    	  newAlternative = factory.createAlternative();
				    	  newAlternative.setName(elements[0]);
				    	  newAlternative.setCurrent(UbuntuFileSystemManager.getInstance().createFile(elements[1]));
				    	  
				    	  String[] cmd2 = {"/bin/sh","-c","which " + elements[0]};
						  Process p2 = Runtime.getRuntime().exec(cmd2);
					      BufferedReader input2 =
					        new BufferedReader
					          (new InputStreamReader(p2.getInputStream()));
				    	  line2 = input2.readLine();
				    	  
				    	  if (line2 != null)
				    	  	newAlternative.setLocation(UbuntuFileSystemManager.getInstance().createFile(line2));
				    	  
				    	  UbuntuEnvironmentManager.getInstance().getEnvironment().getAlternatives().add(newAlternative);
			    	  }
			      }

				  input.close();

			} catch (Exception err) {
			      err.printStackTrace();
		    }
			
			
	   }

}

