package mancoosi.injectors.ubuntu;

import mancoosi.injectors.managers.PackageManager;
import mancoosi.injectors.managers.UserManager;
import mancoosi.injectors.managers.ubuntu.UbuntuAlternativesManager;
import mancoosi.injectors.managers.ubuntu.UbuntuConfigurationManager;
import mancoosi.injectors.managers.ubuntu.UbuntuEnvironmentManager;
import mancoosi.injectors.managers.ubuntu.UbuntuFileSystemManager;
import mancoosi.injectors.managers.ubuntu.UbuntuMimeTypeHandlerCacheManager;
import mancoosi.injectors.managers.ubuntu.UbuntuPackageManager;
import mancoosi.injectors.managers.ubuntu.UbuntuPackageSettingDependenciesManager;
import mancoosi.injectors.managers.ubuntu.UbuntuUserManager;
import mancoosi.injectors.utils.FailureDetector;
import mancoosi.injectors.utils.ubuntu.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.GregorianCalendar;

import mancoosi.Configuration;
import mancoosi.Environment;
import mancoosi.FileSystem;
import mancoosi.MancoosiFactory;
import mancoosi.MimeTypeHandlerCache;
import mancoosi.impl.MancoosiPackageImpl;


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
					
		// retrieve the default Mancoosi factory singleton
		MancoosiFactory factory = MancoosiFactory.eINSTANCE; 
		Configuration configuration = null;
	
		URI fileURI = URI.createFileURI("model/systemModel.ecore");
		java.io.File systemModel = new java.io.File("model/systemModel.ecore");
		
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
			
			out.println((new GregorianCalendar()).getTime());
			configuration.setCreationTime((new GregorianCalendar()).getTime().toString());
			configuration.setSystemType("Ubuntu");	
			out.println("Model injection completed !");
		}
		
		
		//FileSystemManager.getInstance().deleteFile("/etc/acpi/always-mute.sh");
	
		

	//	if (PackageManager.getInstance().removePackageElement("apturl"))
	//		System.out.println("PackageDeleted");
		out.close();
		
		FailureDetector.getInstance().start();	

		resource.save(Collections.EMPTY_MAP);
		
	}


}
