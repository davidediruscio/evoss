package it.univaq.mancoosi.failuresdetector.jars;


import java.io.IOException;
import java.util.Iterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuConfigurationManager;


public class MissingConfigurationFiles {
	
	static 	Configuration configuration = null;
	
	public static void checkMissingConfigurationFiles() {
		
		System.out.println("Cheking for missing Configuration files....");
		
		Iterator<InstalledPackage> ipi = configuration.getInstalledPackages().iterator();
		
		while (ipi.hasNext()){
			
			InstalledPackage ip = ipi.next();
			PackageSetting ps = ip.getPackageSettings();
			
			if (ps != null){
				Iterator<File> fi = ps.getFiles().iterator();			
				while (fi.hasNext()){
					java.io.File aux = new java.io.File( ((File)fi.next()).getLocation() );
					if ( ! aux.exists() ) {
						System.out.println("WARNING: The configuration file " + aux.getPath()  + " is missing and it is required by the package "  + ip.getName());
					}
				}
			}
		}	
		System.out.println("Cheking for missing Configuration files....DONE");
	}
	
	
	public static void main(String[] args) throws IOException{
		MancoosiPackageImpl.init();

		URI fileURI = URI.createFileURI("model/systemModel.ecore");
		Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);
		resource.load(null);
		UbuntuConfigurationManager.getInstance().setConfiguration( (Configuration) resource.getContents().get(0) );
		configuration = UbuntuConfigurationManager.getInstance().getConfiguration();
		
		checkMissingConfigurationFiles();
	}
}
