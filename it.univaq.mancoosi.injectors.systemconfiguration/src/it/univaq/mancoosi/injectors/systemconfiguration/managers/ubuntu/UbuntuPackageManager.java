package it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import it.univaq.mancoosi.mancoosimm.AndConflict;
import it.univaq.mancoosi.mancoosimm.AndDep;
import it.univaq.mancoosi.mancoosimm.Conflict;
import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.NotInstalledPackage;
import it.univaq.mancoosi.mancoosimm.OrConflict;
import it.univaq.mancoosi.mancoosimm.OrDep;
import it.univaq.mancoosi.mancoosimm.Package;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.PriorityType;
import it.univaq.mancoosi.mancoosimm.SingleConflict;
import it.univaq.mancoosi.mancoosimm.SingleDep;
import it.univaq.mancoosi.mancoosimm.VersionType;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ConfigurationManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.PackageManager;

public class UbuntuPackageManager extends PackageManager {

	public static PackageManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new UbuntuPackageManager();
		return INSTANCE;
	}
	
	protected void createSingleDeps(String[] singleDeps, Dependence owner){
		
		SingleDep singleDep = factory.createSingleDep();
		singleDep.setPkg(pkgMap.get(singleDeps[0]));
		
		if (singleDeps.length != 1) {
				singleDep.setValue(singleDeps[2].substring(0, singleDeps[2].length()-1));
				String op = singleDeps[1].substring(1, singleDeps[1].length());
				singleDep.setVersion(VersionType.getByName(versionTypeMap.get(op)));
		}

		if (owner instanceof AndDep){
			((AndDep) owner).getOps().add(singleDep);
		}
		
		if (owner instanceof OrDep){
			((OrDep) owner).getOps().add(singleDep);
		}
	}

	
	protected void createSingleConflicts(String[] singleConflicts, Conflict owner){
		
		SingleConflict singleConflict = factory.createSingleConflict();
		
		Package aux = pkgMap.get(singleConflicts[0]);
		if (aux == null) {
			aux = (NotInstalledPackage) factory.createNotInstalledPackage();
			aux.setName(singleConflicts[0]);
			if (singleConflicts.length != 1) {
				singleConflict.setValue(singleConflicts[2].substring(0, singleConflicts[2].length()-1));
				String op = singleConflicts[1].substring(1, singleConflicts[1].length());
				singleConflict.setVersion(VersionType.getByName(versionTypeMap.get(op)));
			}
			configuration.getNotInstalledPackages().add((NotInstalledPackage) aux);
		} 
		singleConflict.setPkg(aux);	
		
		if (singleConflicts.length != 1) {
				singleConflict.setValue(singleConflicts[2].substring(0, singleConflicts[2].length()-1));
				String op = singleConflicts[1].substring(1, singleConflicts[1].length());
				singleConflict.setVersion(VersionType.getByName(versionTypeMap.get(op)));
		}

		if (owner instanceof AndConflict){
			((AndConflict) owner).getOps().add(singleConflict);
		}
		
		if (owner instanceof OrConflict){
			((OrConflict) owner).getOps().add(singleConflict);
		}
	}
	
	protected void processPackageMetadataLine(String aLine, InstalledPackage pkg){
		
		String[] line = aLine.split(": ");
		   	

	    if (line[0].equals("Description")) {
	    	pkg.setDescription(line[1]);
	    }
	    
	    if (line[0].equals("Version")) {
	    	pkg.setVersion(line[1].trim());
	    }
	    
	    if (line[0].equals("Installed-Size")) {
	    	pkg.setInstalledSize(new Integer(line[1].trim()).intValue());
	    }
	    
	    if (line[0].equals("Maintainer")) {
	    	pkg.setMaintainer(line[1]);
	    }
	   
	    if (line[0].equals("Architecture")) {
	    	pkg.setArchitecture(line[1]);
	    } 
	    
	    if (line[0].equals("Section")) {
	    	pkg.setSection(line[1]);
	    }
	    
	    if (line[0].equals("Priority")) {
	    	pkg.setPriority(PriorityType.getByName(line[1]));
	    }
	    
	    if (line[0].equals("Depends")) {
	    	String[] orDependences = line[1].split(" \\| ");   		    
	    	if (orDependences.length != 1){	
	    		OrDep orDep = factory.createOrDep();	
	    		for (int i=0; i< orDependences.length; i++){
	    			
	    			String[] andDependences = orDependences[i].split(", ");
	    			if (andDependences.length != 1){
	    				AndDep andDep = factory.createAndDep();
	    				for (int j=0; j < andDependences.length; j++) {	    				
	    					String[] singleDeps = andDependences[j].split(" ");    					
	    					createSingleDeps(singleDeps,andDep);	    					
	    				}	    				
	    				orDep.getOps().add(andDep);
	    			} else {	    		
	    				String[] singleDeps = andDependences[0].split(" ");				
	    				createSingleDeps(singleDeps,orDep);	    				
	    			}    			
	    		}
	    		pkg.setDepends(orDep);
	    	} else {    		
	    		String[] andDependences = orDependences[0].split(", ");
    			if (andDependences.length != 1){
    				AndDep andDep = factory.createAndDep();
    				for (int j=0; j < andDependences.length; j++) {
    					String[] singleDeps = andDependences[j].split(" ");					
    					createSingleDeps(singleDeps,andDep);
    				}
    				pkg.setDepends(andDep);			
    			} else {
    				
    				SingleDep singleDep = factory.createSingleDep();
    				String[] singleDeps = andDependences[0].split(" ");
					
					singleDep.setPkg(pkgMap.get(singleDeps[0]));		
					if (singleDeps.length != 1) {
							singleDep.setValue(singleDeps[2].substring(0, singleDeps[2].length()-1));
					}
					pkg.setDepends(singleDep);
    			}	
	    	}
	    }
	    
	    
	    if (line[0].equals("Conflicts")) {
	    	String[] orConflicts = line[1].split(" \\| ");		    
	    	if (orConflicts.length != 1){	
	    		OrConflict orConflict = factory.createOrConflict();	
	    		for (int i=0; i< orConflicts.length; i++){
	    			
	    			String[] andConflicts = orConflicts[i].split(", ");
	    			if (andConflicts.length != 1){
	    				AndConflict andConflict = factory.createAndConflict();
	    				for (int j=0; j < andConflicts.length; j++) {	    				
	    					String[] singleConflicts = andConflicts[j].split(" ");    					
	    					createSingleConflicts(singleConflicts,andConflict);	    					
	    				}	    				
	    				orConflict.getOps().add(andConflict);
	    			} else {	    		
	    				String[] singleConflicts = andConflicts[0].split(" ");				
	    				createSingleConflicts(singleConflicts,orConflict);	    				
	    			}    			
	    		}
	    		pkg.setConflict(orConflict);
	    	} else {	    		
	    		String[] andConflicts = orConflicts[0].split(", ");
    			if (andConflicts.length != 1){
    				AndConflict andConflict = factory.createAndConflict();
    				for (int j=0; j < andConflicts.length; j++) {
    					String[] singleConflicts = andConflicts[j].split(" ");					
    					createSingleConflicts(singleConflicts,andConflict);
    				}
    				pkg.setConflict(andConflict);   				
    			} else {		
    				SingleConflict singleConflict = factory.createSingleConflict();
    				String[] singleConflicts = andConflicts[0].split(" ");
					
					Package aux = pkgMap.get(singleConflicts[0]);
					if (aux == null) {
						aux = (NotInstalledPackage) factory.createNotInstalledPackage();
						aux.setName(singleConflicts[0]);
						if (singleConflicts.length != 1) {
							aux.setVersion(singleConflicts[2].substring(0, singleConflicts[2].length()-1));
						}
						configuration.getNotInstalledPackages().add((NotInstalledPackage) aux);
					} 
					singleConflict.setPkg(aux);	
					if (singleConflicts.length != 1) {
						singleConflict.setValue(singleConflicts[2].substring(0, singleConflicts[2].length()-1));
						String op = singleConflicts[1].substring(1, singleConflicts[1].length());
						singleConflict.setVersion(VersionType.getByName(versionTypeMap.get(op)));
					}
					pkg.setConflict(singleConflict);
    			}	
	    	}
	    }	
	}
	
	protected void processConfFiles(List<String> conffilesBlock, InstalledPackage installedPackage){
		Iterator<String> conffilesIterator = conffilesBlock.iterator();
		String conffile;
		File file;
		
		pkgSettingsMap.put(installedPackage, new ArrayList<File>());
		while (conffilesIterator.hasNext()){
			conffile = conffilesIterator.next();
			file = fileSystemManager.createFile(conffile);

			if ( ! installedPackage.getPackageSettings().getFiles().contains(file) ) {
				installedPackage.getPackageSettings().getFiles().add(file);
				file.getPkgSettings().add(installedPackage.getPackageSettings());
				pkgSettingsMap.get(installedPackage).add(file);
			}	
		}
	}
	
	
	protected void processPackageMetadata(BufferedReader packageInfo, InstalledPackage installedPackage) throws IOException {
		
		Scanner scanner = new Scanner(packageInfo);
		String line = new String();
		String[] lineFragments;
		String conffile;
		String[] auxConffile;
	    try {
	      //first use a Scanner to get each line
	      while ( scanner.hasNextLine() ){
	    	  
	    	  // we have to check if the considered line refers to "Conffiles"
	    	  line = scanner.nextLine();
	    	  lineFragments = line.split(":");
	    	  if (! (lineFragments[0].equals("Conffiles")) )  {
	    		  processPackageMetadataLine( line, installedPackage );
	    	  } else  {
	    
	    		  // A list of configuration files is create
	    		  List<String> conffilesBlock = new ArrayList();
	    		  PackageSetting pkgSetting = factory.createPackageSetting();
	    		  installedPackage.setPackageSettings(pkgSetting);
	    
	    		  while (scanner.hasNextLine() ) {
	    			  line = scanner.nextLine();
	    			  conffile = (line.split(":"))[0];
	    			  if (! (conffile.equals("Description")) ){
	    				  auxConffile = conffile.split(" ");
	    				  
	    				  if (auxConffile.length>2 && !auxConffile[2].equals("newconffile") )  { 	// This condition is necessary to do not add twice files in situation like the following:
	    					  												//     /etc/defoma/csetenc-xenc.data2 9c531837b77b5aa1eccda5908b3e52c0
	    				  									  			  	//     /etc/defoma/csetenc-xenc.data2 newconffile
	    				  
	    					  conffile = auxConffile[1];					// This is to extract the right file path from strings like " /etc/default/acpi-support aa46fcd708d0bc25ac3c53fd2c0daa15"
	    				  
	    					  conffilesBlock.add(conffile);
	    				  }
	    			  } else {
	    				  break;
	    			  }
	    		  }
	    		  
	    		 // The files contained in the list previously created are now processed
	    		 processConfFiles(conffilesBlock, installedPackage);	    		  
	    	  }	  
	      }
	    }
	    finally {
	      //ensure the underlying stream is always closed
	      scanner.close();
	    }

	}
	
	public void setFeaturesOfInstalledPackages() throws IOException {
		String cmd;
		InstalledPackage pkg;

		//Set attributes and references for all the installed packages
    	Iterator<InstalledPackage> i = ConfigurationManager.getInstance().getConfiguration().getInstalledPackages().iterator();
    	
    	while (i.hasNext()) {
    		pkg = i.next();

    		cmd = "dpkg -s " + pkg.getName();	
    		Process p2 = Runtime.getRuntime().exec(cmd);
    		BufferedReader pkgInfo =
    			new BufferedReader
    			(new InputStreamReader(p2.getInputStream()));
    		System.out.println("Processing the package " + pkg.getName());
    		System.out.println("	processing configuration files...");
    		processPackageMetadata(pkgInfo, pkg);
    		
    		pkgInfo.close();
    		p2.destroy();
    	}
	}
	
	public void setFeaturesOfInstalledPackagesFoundBySync() throws IOException {
		String cmd;
		InstalledPackage pkg;
		
		//Set attributes and references for all the installed packages
    	Iterator<InstalledPackage> i = pkgFromSyncMap.values().iterator();
    	
    	while (i.hasNext()) {
    		pkg = i.next();

    		cmd = "dpkg -s " + pkg.getName();	
    		Process p2 = Runtime.getRuntime().exec(cmd);
    		BufferedReader pkgInfo =
    			new BufferedReader
    			(new InputStreamReader(p2.getInputStream()));
    		System.out.println("Processing the new found package " + pkg.getName());
    		System.out.println("	processing configuration files...");
    		processPackageMetadata(pkgInfo, pkg);
    		
    		pkgInfo.close();
    		p2.destroy();
    	}
	}
	
	public void createPackageElementsFromSystem() throws IOException {
	    String line;
	    
		String[] cmd = {"/bin/sh","-c"," dpkg -l | awk '/ii/' | awk '{print $2}'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input =
			new BufferedReader
			(new InputStreamReader(p.getInputStream()));
	      	      
    	while ((line = input.readLine()) != null) {
    		createPackage(line);
    	}	
    	input.close();			
    	p.destroy();
    	
    	setFeaturesOfInstalledPackages();		  
	}
	
	public void synchronize() throws IOException {
		String packageName;
		
		System.out.println("Synchronizing the installed packages...");
		String[] cmd = {"/bin/sh","-c"," dpkg -l | awk '/ii/' | awk '{print $2}'"};
		Process p = Runtime.getRuntime().exec(cmd);
		BufferedReader input =
			new BufferedReader
			(new InputStreamReader(p.getInputStream()));
	      	      
    	while ((packageName = input.readLine()) != null) {
    		if ( ! existsPackage(packageName) ){
    			System.out.println("Found the new package " + packageName);    			
    			pkgFromSyncMap.put(packageName, createPackage(packageName));
    		};
    	}	
    	input.close();			
    	p.destroy();
    	
    	setFeaturesOfInstalledPackagesFoundBySync();
		
	}
	
}
