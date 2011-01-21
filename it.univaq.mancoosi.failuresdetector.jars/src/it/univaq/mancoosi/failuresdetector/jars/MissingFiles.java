package it.univaq.mancoosi.failuresdetector.jars;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.FileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuConfigurationManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuEnvironmentManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuFileSystemManager;


   



public class MissingFiles {
	
	public static List<File> getMissingFiles() {
		   
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


	public static void checkMissingFiles() {
		
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
	
	public static void main(String[] args) throws IOException {
		
		// initialize model and dependencies
		MancoosiPackageImpl.init();
					
		Configuration configuration = null;
	
		URI fileURI = URI.createFileURI("model/systemModel.ecore");
		java.io.File systemModel = new java.io.File("model/systemModel.ecore");
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("model/data.txt")));
		
		Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);
		resource.load(null);
		UbuntuConfigurationManager.getInstance().setConfiguration( (Configuration) resource.getContents().get(0) );

		configuration = UbuntuConfigurationManager.getInstance().getConfiguration();
		UbuntuFileSystemManager.getInstance().setFileSystem(configuration.getFileSystem());
		UbuntuEnvironmentManager.getInstance().setEnvironment(configuration.getEnvironment());
		
		checkMissingFiles();
	}
}
