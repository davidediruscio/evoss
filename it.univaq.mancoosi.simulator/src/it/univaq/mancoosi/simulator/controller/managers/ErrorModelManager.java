/**
 * 
 */
package it.univaq.mancoosi.simulator.controller.managers;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;
import it.univaq.mancoosi.errormm.ErrormmFactory;
import it.univaq.mancoosi.errormm.Error;


/**
 * Manages the creation and saving the model error.
 * This model is created when there is an error condition
 * such that the simulation fails.
 */
public class ErrorModelManager {
	
	private Error error = null;
	
	private SimulatorConfig config = null;

	/**
	 * Constructor
	 * 
	 * @param type
	 * @param description
	 * @throws SimulatorException
	 */
	public ErrorModelManager(String type, String description) throws Exception {
		
		error = ErrormmFactory.eINSTANCE.createError();
		config = SimulatorConfig.getInstance();
		
		error.setType(type);
		error.setDescription(description);
		
		saveModel();

	}

	/**
	 * Method for saving the model
	 * 
	 * @throws SimulatorException
	 */
	private void saveModel() throws Exception {
		try {

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("errormm", new EcoreResourceFactoryImpl());

			URI fileURI = URI.createFileURI(config.getDirOutput() + config.getFileErrorModel());

			Resource poResource = resourceSet.createResource(fileURI);
			poResource.getContents().add(error);

			poResource.save(null);

		} catch (IOException e) {
			throw new SimulatorException("Error saving the model error: " + config.getFileErrorModel(), e);
		}

	}
}
