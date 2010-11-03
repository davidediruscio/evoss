package it.univaq.mancoosi.injectors.systemconfiguration.caixa;

import it.univaq.mancoosi.injectors.systemconfiguration.managers.PackageManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaAlternativesManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaConfigurationManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaEnvironmentManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaFileSystemManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaMimeTypeHandlerCacheManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaPackageManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaPackageSettingDependenciesManager;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.caixa.CaixaUserManager;
import it.univaq.mancoosi.injectors.systemconfiguration.utils.FailureDetector;

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
					
		// retrieve the default Mancoosi factory singleton
		Configuration configuration = null;
	
		URI fileURI = URI.createFileURI("model/systemModel.mancoosimm");
		java.io.File systemModel = new java.io.File("model/systemModel.mancoosimm");
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("model/data.txt")));
		
		Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);

		if (systemModel.exists()) {
			resource.load(null);
			CaixaConfigurationManager.getInstance().setConfiguration( (Configuration) resource.getContents().get(0) );

			configuration = CaixaConfigurationManager.getInstance().getConfiguration();
			CaixaFileSystemManager.getInstance().setFileSystem(configuration.getFileSystem());
			CaixaEnvironmentManager.getInstance().setEnvironment(configuration.getEnvironment());

			
			CaixaPackageManager.getInstance().synchronize();
			
			System.out.println("Synchronization completed !");		
			
		} else {

			// The configuration element is initialized 
			configuration = CaixaConfigurationManager.getInstance().getConfiguration();
			resource.getContents().add(configuration);
			
			Environment environment = CaixaEnvironmentManager.getInstance().getEnvironment();
			FileSystem fileSystem = CaixaFileSystemManager.getInstance().getFileSystem();
			MimeTypeHandlerCache mimeTypeHandlerCache = CaixaMimeTypeHandlerCacheManager.getInstance().getMimeTypeHandlerCache();
			environment.setMimeTypeHandlerCache(mimeTypeHandlerCache);
			configuration.setEnvironment(environment);
			configuration.setFileSystem(fileSystem);
			
			// System users are added in the model
			out.println("* Retrieving users and groups...");
			out.flush();
			out.println((new GregorianCalendar()).getTime());
			CaixaUserManager userManager = (CaixaUserManager) CaixaUserManager.getInstance();
			userManager.createUsersFromSystem();
			out.println("* Users and groups created !");
			out.flush();
			out.println((new GregorianCalendar()).getTime());
					
			PackageManager pkgManager = CaixaPackageManager.getInstance();
			out.println("* Creating package elements...");
			out.flush();
			out.println((new GregorianCalendar()).getTime());

			pkgManager.createPackageElementsFromSystem();
			out.println((new GregorianCalendar()).getTime());

			out.println("* Package elements created !");
			out.println("* Retrieving package setting dependencies...");
			out.flush();
			out.println((new GregorianCalendar()).getTime());
			CaixaPackageSettingDependenciesManager.getInstance().updatePackageSettingDependencies();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Package settings retrieved !");
			
			out.println("* Retrieving Mime Type Handler Cache...");
			out.flush();
			out.println((new GregorianCalendar()).getTime());
			CaixaMimeTypeHandlerCacheManager.getInstance().createMimeTypeHandlerCacheFromSystem();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Mime Type Handler retrieved !");
			
			out.println("* Retrieving Alternatives...");
			out.flush();
			out.println((new GregorianCalendar()).getTime());
			CaixaAlternativesManager.getInstance().createAlternativesFromSystem();
			out.println((new GregorianCalendar()).getTime());
			out.println("* Alternatives retrieved !");
			out.flush();
			
			out.println((new GregorianCalendar()).getTime());
			configuration.setCreationTime((new GregorianCalendar()).getTime().toString());
			configuration.setSystemType("Caixa");	
			out.println("Model injection completed !");
			out.flush();
		}
		
		out.close();
		
		FailureDetector.getInstance().start();	

		resource.save(Collections.EMPTY_MAP);
		
	}


}
