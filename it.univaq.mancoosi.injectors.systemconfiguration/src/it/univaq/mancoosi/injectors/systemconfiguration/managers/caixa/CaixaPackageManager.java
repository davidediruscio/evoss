package it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa;

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

public class CaixaPackageManager extends PackageManager {
	

	public static PackageManager getInstance(){
		if (INSTANCE == null)
			INSTANCE = new CaixaPackageManager();
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
	
	protected void processPackageMetadataLine(Scanner buffer, String aLine, InstalledPackage pkg){
		
		String[] line = aLine.split(": ");
		   	

	    if (line[0].equals("Description")) {
	    	String Desc = "";
	    	if (line.length > 1) Desc = line[1];
	    	while (buffer.hasNextLine()){
	    		String nextLine = buffer.nextLine();
	    		line = nextLine.split(":");
	    		if (line.length > 1) // || line[0].equals("Version")
	    			break;
	    		Desc += line[0];
	    	}
	    	pkg.setDescription(Desc);
	    	System.out.println("Description = " + Desc);
	    }
	    
	    if (line[0].equals("Version")) {
	    	pkg.setVersion(line[1].trim());
	    	System.out.println("Version = " + line[1].trim());
	    }
	    
	    if (line[0].equals("Installed-Size")) {
	    	pkg.setInstalledSize(new Integer(line[1].trim()).intValue());
	    	System.out.println("Installed-size = " + (new Integer(line[1].trim()).intValue()));
	    }
	    
	    if (line[0].equals("Maintainer")) {
	    	pkg.setMaintainer(line[1]);
	    	System.out.println("Maintainer = " + line[1]);
	    }
	   
	    if (line[0].equals("Architecture")) {
	    	pkg.setArchitecture(line[1]);
	    	System.out.println("Architecture = " + line[1]);
	    } 
	    
	    if (line[0].equals("Section")) {
	    	pkg.setSection(line[1]);
	    	System.out.println("Section = " + line[1]);
	    }
	    
	    if (line[0].equals("Priority")) {
	    	pkg.setPriority(PriorityType.getByName(line[1]));
	    	System.out.println("Priority = " + line[1]);
	    }
	    
	    if (line[0].equals("Depends")) {
	    	if (line.length == 2){
	    		System.out.println("Dependencies of package: "+pkg.getName());
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
	    					for (int k=0; k<singleDeps.length; k++){
	    						System.out.print(singleDeps[k]+" ");
	    						if (k ==(singleDeps.length-1))
	    							System.out.println("");
	    					}
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
	    }
	    
	    
	    if (line[0].equals("Conflicts")) {
	    	if (line.length == 2)
		    	{
	    		System.out.println("Conflicts of package: "+pkg.getName());
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
	    					for (int k=0; k<singleConflicts.length; k++){
	    						System.out.print(singleConflicts[k]+" ");
	    						if (k ==(singleConflicts.length-1))
	    							System.out.println("");
	    					}
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
	
	protected void processPackageConfig(BufferedReader packageInfo, InstalledPackage installedPackage) throws IOException {
		Scanner scanner = new Scanner(packageInfo);
		String line = new String();
		String[] lineFragments;
		String conffile;
		String[] auxConffile;
		
		try{
		      while ( scanner.hasNextLine() ){		    	
		    	  // we have to check if the considered line refers to "Conffiles"
		    	  line = scanner.nextLine();
		    	  
	    		  // A list of configuration files is create
	    		  List<String> conffilesBlock = new ArrayList();
	    		  PackageSetting pkgSetting = factory.createPackageSetting();
	    		  installedPackage.setPackageSettings(pkgSetting);
	    
	    		  while (scanner.hasNextLine() ) {
	    			  line = scanner.nextLine();
//	    			  conffile = (line.split(":"))[0];

    				  auxConffile = line.split(" ");
    				  
    				  if (! auxConffile[2].equals("newconffile") )  {	// This check is irrelevant for Caixa Magica
    					  												// This condition is necessary to do not add twice files in situation like the following:
    					  												//     /etc/defoma/csetenc-xenc.data2 9c531837b77b5aa1eccda5908b3e52c0
    				  									  			  	//     /etc/defoma/csetenc-xenc.data2 newconffile    				  
    					  conffile = auxConffile[1];					// This is to extract the right file path from strings like " /etc/default/acpi-support aa46fcd708d0bc25ac3c53fd2c0daa15"
    				  
    					  conffilesBlock.add(conffile);
    				  }

	    		  }
	    		  
	    		 // The files contained in the list previously created are now processed
	    		  //JT: Not sure if the processConfFiles fn could be outside of the container while block as it is is still in the try.
	    		  //Otherwise it will not process the conf-files of other packages if no new package is synchronised
	    		 processConfFiles(conffilesBlock, installedPackage);	    		  
		      }
		}
	    finally {
		      //ensure the underlying stream is always closed
		      scanner.close();
	    }
	}
	
	protected void processPackageOtherdata(BufferedReader packageInfo, InstalledPackage installedPackage) throws IOException {
		Scanner scanner = new Scanner(packageInfo);
		String line = new String();
		System.out.println("Reached here: RPM return is");
	    try {
	      //first use a Scanner to get each line
	      while ( scanner.hasNextLine() ){
	    	  line = scanner.nextLine();
	    	  System.out.println(line);
    		  processPackageMetadataLine( line, installedPackage ); 	    
	      }
	    }
	    finally {
	      //ensure the underlying stream is always closed
	      scanner.close();
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
	    		  processPackageMetadataLine( scanner, line, installedPackage );
	    	  } else if (lineFragments[0].equals("Conffiles")) {
	    
	    		  // A list of configuration files is create
	    		  List<String> conffilesBlock = new ArrayList();
	    		  PackageSetting pkgSetting = factory.createPackageSetting();
	    		  installedPackage.setPackageSettings(pkgSetting);
	    
	    		  while (scanner.hasNextLine() ) {
	    			  line = scanner.nextLine();
	    			  conffile = (line.split(":"))[0];
	    			  if (! (conffile.equals("Description")) ){
	    				  auxConffile = conffile.split(" ");
	    				  if (auxConffile.length == 2){
		    				  if (! auxConffile[1].equals("newconffile") )  { 	// This condition is necessary to do not add twice files in situation like the following:
		    					  												//     /etc/defoma/csetenc-xenc.data2 9c531837b77b5aa1eccda5908b3e52c0
		    				  									  			  	//     /etc/defoma/csetenc-xenc.data2 newconffile
		    				  
		    					  conffile = auxConffile[0];					// This is to extract the right file path from strings like " /etc/default/acpi-support aa46fcd708d0bc25ac3c53fd2c0daa15"
		    					  System.out.println("Config file: "+conffile);
		    					  conffilesBlock.add(conffile);
		    				  }
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

//    		cmd = "dpkg -s " + pkg.getName();
//    		cmd = "rpm -qi " + pkg.getName();
    		String[] cmd2 = {"/bin/sh","-c","rpm -qa "+ pkg.getName()+ " --qf='Description: %{DESCRIPTION}\nVersion: %{VERSION}\nInstalled-Size: %{SIZE}\nMaintainer: %{PACKAGER}\nArchitecture: %{ARCH}\nSection: %{GROUP}\nDepends: [%{REQUIRES}%|REQUIREVERSION?{ %{REQUIREFLAGS:depflags}}:{}|%|REQUIREVERSION?{ %{REQUIREVERSION}}:{}|, ]\nConflicts: [%{CONFLICTS}%|CONFLICTVERSION?{ %{CONFLICTFLAGS:depflags}}:{}|%|CONFLICTVERSION?{ %{CONFLICTVERSION}}:{}|, ]'"};
    		Process p3 = Runtime.getRuntime().exec(cmd2);
    		BufferedReader pkgInfo =
    			new BufferedReader
    			(new InputStreamReader(p3.getInputStream()));
//    		String lets_debug = pkgInfo.readLine();
    		System.out.println("Processing the package " + pkg.getName());
    		System.out.println("	processing package meta-data...");
    		System.out.println("-------------------------------");
    		processPackageMetadata(pkgInfo, pkg);
    		System.out.println("Completed processing package meta-data for pkg "+pkg.getName());
    		pkgInfo.close();
    		p3.destroy();
    		
    		String[] cmd3 = {"/bin/sh","-c","echo \"Conffiles:\"; rpm -qc "+ pkg.getName()+ " --dump | awk '{print $1 \" \" $4}'"};
    		Process p4 = Runtime.getRuntime().exec(cmd3);
    		pkgInfo =
    			new BufferedReader
    			(new InputStreamReader(p4.getInputStream()));
    		System.out.println("	processing package conf-files...");
    		System.out.println("-------------------------------");
    		processPackageMetadata(pkgInfo, pkg);
    		System.out.println("Completed processing package meta-data "+pkg.getName());
    		System.out.println();	
    		pkgInfo.close();
    		p4.destroy();
    	}
	}
	
	public void setFeaturesOfInstalledPackagesFoundBySync() throws IOException {

		InstalledPackage pkg;
		
		//Set attributes and references for all the installed packages
    	Iterator<InstalledPackage> i = pkgFromSyncMap.values().iterator();
    	
    	while (i.hasNext()) {
    		pkg = i.next();

//    		cmd = "dpkg -s " + pkg.getName();	

    		String pkgName = pkg.getName();
    		System.out.println("Processing the new found package " + pkgName);
    		System.out.println("	processing configuration files...");
    		String[] cmd = {"rpm", " -qc ", pkgName, " --dump | awk '{print $1 \" \" $4}'"};    		
    		Process p2 = Runtime.getRuntime().exec(cmd);
    		BufferedReader pkgInfo =
    			new BufferedReader
    			(new InputStreamReader(p2.getInputStream()));
    		String templine = pkgInfo.readLine();
    		if (pkgInfo != null){
    			processPackageConfig(pkgInfo, pkg);	
    		}
    		
    		String[] cmd2 = {"rpm", " -qa " , pkgName , " --qf='Description: %{DESCRIPTION}\nVersion: %{VERSION}\nInstalled-Size: %{SIZE}\nMaintainer: %{PACKAGER}\nArchitecture: %{ARCH}\nSection: %{GROUP}\nDepends: [%{REQUIRES}%|REQUIREVERSION?{ %{REQUIREFLAGS:depflags}}:{}|%|REQUIREVERSION?{ %{REQUIREVERSION}}:{}|, ]\nConflicts: [%{CONFLICTS}%|CONFLICTVERSION?{ %{CONFLICTFLAGS:depflags}}:{}|%|CONFLICTVERSION?{ (%{CONFLICTVERSION})}:{}|, ]'"}; 
//    		System.out.println(cmd2);
    		for (int j=0; j<cmd2.length; j++)
    		{
    			System.out.println("here we go " + cmd2[j]);
    		}
    		p2 = Runtime.getRuntime().exec(cmd2);
    		BufferedReader pkgInfo2 =
    			new BufferedReader
    			(new InputStreamReader(p2.getInputStream()));
    		
    		processPackageOtherdata(pkgInfo2, pkg);
//    		processPackageMetadata(pkgInfo, pkg);
    		
    		pkgInfo.close();
    		pkgInfo2.close();
    		p2.destroy();
    	}
	}
	
	public void createPackageElementsFromSystem() throws IOException {
	    String line;
	    
//		String[] cmd = {"/bin/sh","-c"," dpkg -l | awk '/ii/' | awk '{print $2}'"};
		String[] cmd = {"/bin/sh","-c", "rpm -qa --qf='%{NAME}\n'"};
		for (int i=0; i<cmd.length; i++)
		{
			System.out.println(cmd[i]);
		}
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
		System.out.println("Caixa Mágica process...");
		System.out.println("Synchronizing the installed packages...");
//		String[] cmd = {"/bin/sh","-c"," dpkg -l | awk '/ii/' | awk '{print $2}'"};
		String[] cmd = {"rpm","-qa","--qf=%{NAME}\n"};
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

	@Override
	protected void processPackageMetadataLine(String aLine, InstalledPackage pkg) {
		// TODO Auto-generated method stub
		
	}
	
}
