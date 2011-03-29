package it.univaq.mancoosi.injectors.systemconfiguration.ubuntu;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.PackageManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuAlternativesManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuConfigurationManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuEnvironmentManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuFileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuIconCacheManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuMimeTypeHandlerCacheManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuPackageManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuPackageSettingDependenciesManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuUserManager;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.GregorianCalendar;

import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache;
import it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Injector {
	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
	
		// initialize model and dependencies
		MancoosiPackageImpl.init();
					
		Configuration configuration = null;
	
		URI fileURI = URI.createFileURI("model/systemModel.mancoosimm");
		java.io.File systemModel = new java.io.File("model/systemModel.mancoosimm");
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("model/data.txt")));
		
		Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);

		if (systemModel.exists()) {
			
			resource.load(null);
			UbuntuConfigurationManager.getInstance().setConfiguration( (Configuration) resource.getContents().get(0) );

			configuration = UbuntuConfigurationManager.getInstance().getConfiguration();
			UbuntuFileSystemManager.getInstance().setFileSystem(configuration.getFileSystem());
			UbuntuEnvironmentManager.getInstance().setEnvironment(configuration.getEnvironment());

			//UbuntuPackageManager.getInstance().removePackage("yelp");
			
			UbuntuPackageManager.getInstance().synchronize();
			
			System.out.println("Synchronization completed !");		
			
		} else {
	
			// The configuration element is initialized 
			configuration = UbuntuConfigurationManager.getInstance().getConfiguration();
			resource.getContents().add(configuration);
			
			Environment environment = UbuntuEnvironmentManager.getInstance().getEnvironment();
			FileSystem fileSystem = UbuntuFileSystemManager.getInstance().getFileSystem();
			MimeTypeHandlerCache mimeTypeHandlerCache = UbuntuMimeTypeHandlerCacheManager.getInstance().getMimeTypeHandlerCache();
			environment.setMimeTypeHandlerCache(mimeTypeHandlerCache);
			configuration.setEnvironment(environment);
			configuration.setFileSystem(fileSystem);
			
			// System users are added in the model
			out.println("* Retrieving users and groups...");
			out.println((new GregorianCalendar()).getTime());
			UbuntuUserManager userManager = (UbuntuUserManager) UbuntuUserManager.getInstance();
			userManager.createUsersFromSystem();
			out.println("* Users and groups created !");
			out.println((new GregorianCalendar()).getTime());
					
			PackageManager pkgManager = UbuntuPackageManager.getInstance();
			out.println("* Creating package elements...");
			out.println((new GregorianCalendar()).getTime());
			pkgManager.createPackageElementsFromSystem();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Package elements created !");
			
			out.println("* Retrieving package setting dependencies...");
			out.println((new GregorianCalendar()).getTime());
			UbuntuPackageSettingDependenciesManager.getInstance().updatePackageSettingDependencies();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Package settings retrieved !");
			
			out.println("* Retrieving Mime Type Handler Cache...");
			out.println((new GregorianCalendar()).getTime());
			UbuntuMimeTypeHandlerCacheManager.getInstance().createMimeTypeHandlerCacheFromSystem();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Mime Type Handler retrieved !");
			
			out.println("* Retrieving Alternatives...");
			out.println((new GregorianCalendar()).getTime());
			UbuntuAlternativesManager.getInstance().createAlternativesFromSystem();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Alternatives retrieved !");
			
			out.println("* Retrieving IconCache...");
			out.println((new GregorianCalendar()).getTime());
			UbuntuIconCacheManager.getInstance().createIconCacheFromSystem();
			out.println((new GregorianCalendar()).getTime());
			out.println("* IconCache retrieved !");
			
			out.println((new GregorianCalendar()).getTime());
			configuration.setCreationTime((new GregorianCalendar()).getTime().toString());
			configuration.setSystemType("Ubuntu");	
			out.println("Model injection completed !");
		}
		
		out.close();
		
 

		resource.save(Collections.EMPTY_MAP);
		
	}


}
