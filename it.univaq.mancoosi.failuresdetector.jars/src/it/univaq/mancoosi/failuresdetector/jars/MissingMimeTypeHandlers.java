package it.univaq.mancoosi.failuresdetector.jars;


import java.io.IOException;
import java.util.Iterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.mancoosimm.impl.MancoosiPackageImpl;
import it.univaq.mancoosi.injectors.systemconfiguration.managers.ubuntu.UbuntuConfigurationManager;


public class MissingMimeTypeHandlers {
	
	static 	Configuration configuration = null;
	
	public static void checkMissingMimeTypeHandlers() {
		
		System.out.println("Cheking for missing MimeTypeHandlers....");
		
		Iterator<MimeTypeHandler> mthit = configuration.getEnvironment().getMimeTypeHandlerCache().getHandlers().iterator();
		
		MimeTypeHandler mth = null;
		java.io.File aux = null;
		
		while ( mthit.hasNext() ) {
			
			mth = mthit.next();
			aux = new java.io.File(mth.getHandler().getLocation());
			if ( ! aux.exists() ) {
				System.out.println("WARNING: L'handler " +mth.getHandler().getLocation() + " is missing and it is necessary to manage the "  + mth.getType().getName() + " MimeType");
			}
			
		}
		System.out.println("Cheking for missing MimeTypeHandlers....DONE");
		
	}
	
	
	public static void main(String[] args) throws IOException{
		MancoosiPackageImpl.init();
		
		URI fileURI = URI.createFileURI(args[0]);
		Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);
		resource.load(null);
		UbuntuConfigurationManager.getInstance().setConfiguration( (Configuration) resource.getContents().get(0) );
		configuration = UbuntuConfigurationManager.getInstance().getConfiguration();
		
		checkMissingMimeTypeHandlers();
	}
}
