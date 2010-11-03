package it.univaq.mancoosi.injectors.systemconfiguration.managers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;



public abstract class PackageSettingDependenciesManager {
	   protected static PackageSettingDependenciesManager INSTANCE ;
	   protected	BufferedWriter out;
	   protected 	HashMap<String, String> pkgSettingDepsMap;
	   
	   // Private constructor prevents instantiation from other classes
	   protected PackageSettingDependenciesManager() {
		   pkgSettingDepsMap = new HashMap<String,String>();
		   try {
			out  = new BufferedWriter(new FileWriter("tmp/pkgSettingsDependencies.txt"));
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }   
	   }
	   
	 
	   public static PackageSettingDependenciesManager getInstance() {
	      return INSTANCE;
	   }
	   
	   /*
	    * This methods returns all the packages settings which are used by the one passed as parameter
	    */
	   //public List<PackageSetting> getRequiredPackageSettings(PackageSetting pkgSetting) {
	   //   return null;
	   //}
	   
	   /*
	    * This methods returns all the configuration files which are used in the one passed as parameter
	    */
	   public List<File> getRequiredFiles(File confFile, InstalledPackage installedPackagePar){
		  PackageManager pkgManager = PackageManager.getInstance();
		  File processingConfFile;
		  List<File> installedPackageConfFiles;

		
		  Iterator<InstalledPackage> installedPackagesIterator = ConfigurationManager.getInstance().getConfiguration().getInstalledPackages().iterator();
		  InstalledPackage installedPackage;
			
		  while ( installedPackagesIterator.hasNext() ) {
			  installedPackage = installedPackagesIterator.next();	

			  if (installedPackage != installedPackagePar ) {
			  	installedPackageConfFiles = pkgManager.getConfFiles(installedPackage);
					
				  if (installedPackageConfFiles != null) { 
					  Iterator<File> installedPackageConfFilesIterator = installedPackageConfFiles.iterator();
						
					  while (installedPackageConfFilesIterator.hasNext()) {
						  processingConfFile = installedPackageConfFilesIterator.next();
						  if (processingConfFile != confFile) {
		
							  if ( (pkgSettingDepsMap.get(installedPackagePar.getName()) == null) || ! (pkgSettingDepsMap.get(installedPackagePar.getName()).equals(installedPackage.getName()))  ) {
								  
								  java.io.File f = new java.io.File(processingConfFile.getLocation());								  
								  if (f.exists()) {
									  try {
										  
										  BufferedReader bf = new BufferedReader(new FileReader(processingConfFile.getLocation()));
					                                     
										  
										  // Start a line count and declare a string to hold our current line.
										  int linecount = 0;
										  String line;
					
										  // Let the user know what we are searching for processingConfFile
			//							  System.out.println("Searching for " + confFile.getName() + " in file " + processingConfFile.getName());
					
										  // Loop through each line, stashing the line into our line variable.
										  while (( line = bf.readLine()) != null)
					                        {
											  // Increment the count and find the index of the word
											  linecount++;
											  int indexfound = line.indexOf(confFile.getLocation());
					
											  // If greater than -1, means we found the word
											  if (indexfound > -1) {
												  System.out.println("	The package settings of " + installedPackagePar.getName() + " are required by the package setting of "+ installedPackage.getName());									
												  System.out.println("	see for instance the configuration file " + confFile.getLocation() + " ( " + installedPackagePar.getName() + " ) which is is required in the configuration file  " + processingConfFile.getLocation() + " ( "+ installedPackage.getName() + " ) ");								
												  out.write("The configuration file " + confFile.getLocation() + " ( " + installedPackagePar.getName() + " ) is required in the configuration file  " + processingConfFile.getLocation() + " ( "+ installedPackage.getName() + " ) \n");
												  pkgSettingDepsMap.put(installedPackagePar.getName(),  installedPackage.getName());
												  break;
											  }
					                        }
					
										  // Close the file after done searching
										  bf.close();
									  }
									  catch (IOException e) {
										  System.out.println("IO Error Occurred: " + e.toString());
									  }
								  }
							  }
						  }
					  }
				  }
			  }
		  }
		  return null;
	   }


	   /*
	    * This method updates the dependencies between the package settings already created in the system model
	    */
	   public void updatePackageSettingDependencies(){
		   PackageManager pkgManager = PackageManager.getInstance();
		   Iterator<InstalledPackage> installedPackagesIterator = ConfigurationManager.getInstance().getConfiguration().getInstalledPackages().iterator();
		   InstalledPackage installedPackage;
		   List<File> installedPackageConfFiles;
		   File processingConfFile;

System.out.println("Finding package setting dependencies...");
		   while ( installedPackagesIterator.hasNext() ) {
			   installedPackage = installedPackagesIterator.next();	
//System.out.println("I'm considering the package " + installedPackage.getName());
			   installedPackageConfFiles = pkgManager.getConfFiles(installedPackage);

			   if (installedPackageConfFiles != null) {

				   Iterator<File> installedPackageConfFilesIterator = installedPackageConfFiles.iterator();
				
				   while (installedPackageConfFilesIterator.hasNext()) {
					   processingConfFile = installedPackageConfFilesIterator.next();
					   getRequiredFiles(processingConfFile, installedPackage);
				  }
			
			   }
		   }
		   try {
			   out.close();
		   } catch (IOException e) {
			// TODO Auto-generated catch block
			   e.printStackTrace();
		   }
//System.out.println("updatePackageSettingDependencies ended");
		   
	   }


}