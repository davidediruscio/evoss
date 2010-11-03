package it.univaq.mancoosi.injectors.systemconfiguration.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;


public class FailureDetector {

	private static final FailureDetector INSTANCE = new FailureDetector();
	 
	   
	   // Private constructor prevents instantiation from other classes
	private FailureDetector() {
		 
	}
	
	
	public static FailureDetector getInstance() {
		return INSTANCE;
	}
	
	
	public List<File> getMissingFiles() {
		   
		FileSystem fileSystem = FileSystemManager.getInstance().getFileSystem();
		File file;
		List<File> missingFiles = new ArrayList<File>();
		   
		Iterator<File> fileIterator = fileSystem.getAllFiles().iterator();   
		while (fileIterator.hasNext()) {
			file =  fileIterator.next();
			if (file.isIsMissing()) {
				missingFiles.add(file);
			}
		}		   
		return missingFiles;
	}
	
	
	public void checkMissingFiles() {
		
		// Checking for missing files
		System.out.println("Cheking for missing files....");
		List<File> missingFiles = getMissingFiles();
		Iterator<File> missingFilesIterator = missingFiles.iterator();
		File missingFile;
		PackageSetting pkgSetting;
		Iterator<PackageSetting> pkgSettingIterator;
		
		while ( missingFilesIterator.hasNext() ) {
			missingFile = missingFilesIterator.next();
			System.out.println("WARNING: the file " + missingFile.getLocation() + " required by the packages :");
			
			pkgSettingIterator = missingFile.getPkgSettings().iterator();
	
			while ( pkgSettingIterator.hasNext() ) {
				pkgSetting = pkgSettingIterator.next();
				System.out.println("	" + pkgSetting.getPkg().getName());
			}
			
			System.out.println("is missing.");
		}
		System.out.println("Cheking for missing files....DONE");
		
	}
	   

	public void start() {
		System.out.println("FAILURE DETECTION STARTED");
		checkMissingFiles();
		System.out.println("FAILURE DETECTION ENDED");
	}


}
