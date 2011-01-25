package it.univaq.mancoosi.injectors.packages.managers.debian;

import it.univaq.mancoosi.injectors.packages.util.FileManagement;
import it.univaq.mancoosi.injectors.packages.util.debian.DebianInjectorConfig;
import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;
import it.univaq.mancoosi.injectors.packages.managers.PackageManager;
import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.AndDep;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.OrConflict;
import it.univaq.mancoosi.packagemm.OrDep;
import it.univaq.mancoosi.packagemm.SingleConflict;
import it.univaq.mancoosi.packagemm.SingleDep;
import it.univaq.mancoosi.packagemm.VersionType;
import it.univaq.mancoosi.packagemm.PriorityType;
import it.univaq.mancoosi.packagemm.Package;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DebianPackageManager extends PackageManager {

	public static PackageManager getInstance() throws InjectorException {
		if (INSTANCE == null)
			INSTANCE = new DebianPackageManager();
		return INSTANCE;
	}

	protected DebianPackageManager() throws InjectorException {
		super();
		config = DebianInjectorConfig.getInstance();
	}
	
	protected void createSingleDeps(String[] singleDeps, Dependence owner){
		
		SingleDep singleDep = factory.createSingleDep();
		singleDep.setPkg(singleDeps[0]);
		
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
		
		singleConflict.setPkg(singleConflicts[0]);	
		
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

	
	
	protected void processPackageMetadataLine(String aLine, Package pkg){
		
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
					
					singleDep.setPkg(singleDeps[0]);		
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

					singleConflict.setPkg(singleConflicts[0]);	
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
	
	
	protected void processPackageMetadata(BufferedReader packageInfo, Package pkg) throws IOException {
		
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
	    		  processPackageMetadataLine(line, pkg);
	    	  } else  {
	    
	    		  // A list of configuration files is create
	    		  List<String> conffilesBlock = new ArrayList<String>();

	    		  while (scanner.hasNextLine() ) {
	    			  line = scanner.nextLine();
	    			  conffile = (line.split(":"))[0];
	    			  if (! (conffile.equals("Description")) ){
	    				  auxConffile = conffile.split(" ");
	    				  
	    				  if (auxConffile.length>2 && !auxConffile[2].equals("newconffile")) {
	    					  conffile = auxConffile[1];
	    					  conffilesBlock.add(conffile);
	    				  }
	    			  } else {
	    				  break;
	    			  }
	    		  }
	    		  
	    		 // The files contained in the list previously created are now processed
	    		 processConfFiles(conffilesBlock, pkg);	    		  
	    	  }	  
	      }
	    }
	    finally {
	      //ensure the underlying stream is always closed
	      scanner.close();
	    }

	}

	
	public void createModelFromInstalledPackages() throws Exception {
			
			String line;
			String[] cmd = {"/bin/sh","-c"," dpkg -l | awk '/ii/' | awk '{print $2}'"};
			Process p = Runtime.getRuntime().exec(cmd);
			BufferedReader input = new BufferedReader (new InputStreamReader(p.getInputStream()));
		      	      
	    	while ((line = input.readLine()) != null) {
	    		createModelFromInstalledPackage (line);
	    	}
	    	input.close();			
	    	p.destroy();
    		
    }

	protected String unpackPackageFile(String pathPackage, String name) throws Exception {

		String tmpDir = (new File (config.getTempLocation())).getAbsolutePath();
		
		String dirDest = tmpDir+"/"+name;

		String[] cmd = {"/bin/sh","-c"," dpkg -e "+ pathPackage+" "+dirDest};
		Process p = Runtime.getRuntime().exec(cmd);
		p.waitFor();
		return dirDest;
	}
	
	
	public void createModelFromPackageFile(String pathPackage) throws Exception {
		
		String[] spl = pathPackage.split("/");

		System.out.println("Processing the file '" + spl[spl.length - 1] + "'");

		String nameModel = spl[spl.length - 1];

		String name = (nameModel.split("_"))[0];

		String pathTemp = unpackPackageFile(pathPackage, name);

		Package pkg = factory.createPackage();

		List<String> listScript = retrieveScriptsPathTemp(pathTemp, name);

		String version = "";

		String architecture = "";

		String line;
		FileInputStream fstream = new FileInputStream(pathTemp + "/control");
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		while ((line = br.readLine()) != null) {
			String[] lin = line.split(": ");

			if (lin[0].equals("Version")) {
				version = lin[1].trim();
			}

			if (lin[0].equals("Architecture")) {
				architecture = lin[1];
			}
		}

		String result = config.getResultLocation() + name + "_" + version + "_"	+ architecture + "." + config.getMetamodelMainPackage();

		if (listScript.size() > 0) {
			createMaintainerScriptModel(result, listScript);
			pkg = loadModelPackage(result);
		}

		// set name
		pkg.setName(name);

		BufferedReader infoPkg = new BufferedReader(new InputStreamReader(in));
		processPackageMetadata(infoPkg, pkg);
		infoPkg.close();
		in.close();

		if ((new File(pathTemp + "/md5sums")).exists()) {
			// set all files
			String[] cmdFiles = { "/bin/sh", "-c", " cat " + pathTemp + "/md5sums | awk '{print $2}'" };
			Process pgFiles = Runtime.getRuntime().exec(cmdFiles);
			BufferedReader infoFile = new BufferedReader(new InputStreamReader(pgFiles.getInputStream()));
			processAllFiles(infoFile, pkg);
			infoFile.close();
			// pgFiles.destroy();
		}

		if ((new File(pathTemp + "/conffiles")).exists()) {
			// set confiles
			FileInputStream fstreamConf = new FileInputStream(pathTemp
					+ "/conffiles");
			DataInputStream inConf = new DataInputStream(fstreamConf);
			BufferedReader infoConfFile = new BufferedReader(new InputStreamReader(inConf));
			String lineConfFiles;
			List<String> confBlock = new ArrayList<String>();
			while ((lineConfFiles = infoConfFile.readLine()) != null) {
				confBlock.add(lineConfFiles);
			}
			processConfFiles(confBlock, pkg);
			infoConfFile.close();
		}
		saveModel(result, pkg);

		FileManagement.deleteDir(new File(pathTemp));
	}

	
	public void createModelFromInstalledPackage(String name) throws Exception {
	    // Installed package list
		
		System.out.println("Processing the package '"+name+"'");
		
		String linePkg;
		String version="";
		String architecture="";
		String[] cmdPkg = {"/bin/sh","-c"," dpkg -s " + name};
		Process pPkg = Runtime.getRuntime().exec(cmdPkg);
		BufferedReader info = new BufferedReader (new InputStreamReader(pPkg.getInputStream()));
		while ((linePkg = info.readLine()) != null) {
			String[] lin = linePkg.split(": ");
			
		    if (lin[0].equals("Version")) {
		    	version = lin[1].trim();
		    }
			
		    if (lin[0].equals("Architecture")) {
		    	architecture = lin[1];
		    }
		}
		
		info.close();
		pPkg.destroy();
		
		String result = config.getResultLocation() + name + "_" + version + "_" + architecture + "." + config.getMetamodelMainPackage();
		
		List<String> listScript = retrieveScriptsPath(name);
		
		Package pkg = factory.createPackage();
		
		if (listScript.size() > 0) { 
			createMaintainerScriptModel(result, listScript);
			pkg = loadModelPackage(result);
		}
		
		Process proPkg = Runtime.getRuntime().exec(cmdPkg);
		BufferedReader pkgInfo = new BufferedReader (new InputStreamReader(proPkg.getInputStream()));
		pkg.setName(name);
		processPackageMetadata(pkgInfo, pkg);
		
		
		String[] c = {"/bin/sh","-c"," dpkg -L " + pkg.getName()};
		Process pg = Runtime.getRuntime().exec(c);
		
		BufferedReader infoFile = new BufferedReader (new InputStreamReader(pg.getInputStream()));
		processAllFiles(infoFile, pkg);
    	saveModel(result, pkg);
    	
    	infoFile.close();
		pg.destroy();
		pkgInfo.close();
    	proPkg.destroy();
	}

	
	private List<String> retrieveScriptsPath(String name) {
		List<String> listScript = new ArrayList<String>();
		
		String preinst = config.getMaintainerScriptsLocation()+ name +".preinst";
		String postinst = config.getMaintainerScriptsLocation()+ name +".postinst";
		String prerm = config.getMaintainerScriptsLocation()+ name +".prerm";
		String postrm = config.getMaintainerScriptsLocation()+ name +".postrm";
		
		if ((new File(preinst)).exists()) listScript.add(preinst);
		if ((new File(postinst)).exists()) listScript.add(postinst);
		if ((new File(prerm)).exists()) listScript.add(prerm);
		if ((new File(postrm)).exists()) listScript.add(postrm);
		
		return listScript;
	}


	private List<String> retrieveScriptsPathTemp(String path, String name) throws InjectorException {
		List<String> listScript = new ArrayList<String>();
		
		String preinst = path +"/"+"preinst";
		String postinst = path +"/"+"postinst";
		String prerm = path +"/"+"prerm";
		String postrm = path +"/"+"postrm";
		
		File fPreinst = new File(preinst);
		File fPostinst = new File(postinst);
		File fPrerm = new File(prerm);
		File fPostrm = new File(postrm);
		
		String preinstNew = path +"/"+name+".preinst";
		String postinstNew = path +"/"+name+".postinst";
		String prermNew = path +"/"+name+".prerm";
		String postrmNew = path +"/"+name+".postrm";
		
		if (fPreinst.exists()) {
			FileManagement.copyFile(fPreinst, new File(preinstNew));
			listScript.add(preinstNew);
		}
		if (fPostinst.exists()) {
			FileManagement.copyFile(fPostinst, new File(postinstNew));
			listScript.add(postinstNew);
		}
		if (fPrerm.exists()) {
			FileManagement.copyFile(fPrerm, new File(prermNew));
			listScript.add(prermNew);
		}
		if (fPostrm.exists()) {
			FileManagement.copyFile(fPostrm, new File(postrmNew));
			listScript.add(postrmNew);
		}
		
		return listScript;
	}
	
	
	@Override
	protected void processConfFiles(List<String> conffilesBlock, Package pkg) {
		
		for (int i = 0; i< conffilesBlock.size(); i++) {
				if (!conffilesBlock.get(i).equals("/.")) {
					it.univaq.mancoosi.packagemm.File f = factory.createFile();
					f.setLocation(conffilesBlock.get(i));
					String[] fSplit = conffilesBlock.get(i).split("/");
					f.setName(fSplit[fSplit.length-1]);
					pkg.getConffiles().add(f);
			}
		}
	}
	
	@Override
	protected void processAllFiles(BufferedReader info, Package pkg) throws Exception {
		
		String lineFile;
		while (((lineFile = info.readLine()) != null)) {
			if (!lineFile.equals("/.")) {
				it.univaq.mancoosi.packagemm.File f = factory.createFile();
				f.setLocation(lineFile);
				String[] fSplit = lineFile.split("/");
				f.setName(fSplit[fSplit.length-1]);
				pkg.getFiles().add(f);
			}
		}
	}

	@Override
	public void createModelFromCacheDirectory() throws Exception {
		
		 List<File> files = FileManagement.getFileListing(new File(config.getPackagesLocation()));
		 
		 for (int i=0; i<files.size(); i++) {
			 File pkg = files.get(i);
			 if (pkg.getName().endsWith(".deb")) {
				 createModelFromPackageFile(pkg.getAbsolutePath());
			 }
		 }
		
	}
}
