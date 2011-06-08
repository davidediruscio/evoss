package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.UsageCrossReferencer;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;
import it.univaq.mancoosi.mancoosimm.File;

public class UbuntuFileSystemManager extends FileSystemManager {

	public  UbuntuFileSystemManager(){	
		this.userManager = UbuntuUserManager.getInstance();
		this.groupManager = UbuntuGroupManager.getInstance();
	}
	
	public static FileSystemManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuFileSystemManager();
		return INSTANCE;
	}
	
   public void synchronize() throws IOException {
	   //TODO
	   EList<File> allFiles = this.fileSystem.getAllFiles();
	   Iterator<File> fileIt = allFiles.iterator();
	   
	   File aux = null;
	   
	   System.out.println("Synchronizing the configuration files...");
	  

	   for (int i=0; i< allFiles.size(); i++) { 
	   
		  aux= allFiles.get(i);
		  if (!aux.isIsDirectory()){ 
			  String[] cmd = {"/bin/sh","-c"," ls " + aux.getLocation()};
			  Process p = Runtime.getRuntime().exec(cmd);
			  BufferedReader input =
					new BufferedReader
					(new InputStreamReader(p.getInputStream()));
			  
			  String line = input.readLine();
			  if (line == null) {
				System.out.println("File " + aux.getLocation() + " no longer existing in the system, updating the configuration model...");
				
				Collection usages = UsageCrossReferencer.find(aux, EcoreUtil.getRootContainer(aux) );
				
				for (Iterator it = usages.iterator(); it.hasNext(); )
				{
					EStructuralFeature.Setting setting = (EStructuralFeature.Setting)it.next();
					if (setting.getEStructuralFeature().isChangeable())
					{
				//		System.out.println(setting.getEStructuralFeature());					
						EcoreUtil.remove(setting,aux);
					}
				} 
				EcoreUtil.delete(aux);
			  }
		  }
	   }
	   
   };
		

}
