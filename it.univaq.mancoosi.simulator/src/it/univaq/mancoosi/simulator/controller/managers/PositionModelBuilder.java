/**
 * 
 */
package it.univaq.mancoosi.simulator.controller.managers;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.positionmm.Counter;
import it.univaq.mancoosi.positionmm.PositionmmFactory;
import it.univaq.mancoosi.positionmm.TypeScript;

/**
 * @author max
 * 
 */
public class PositionModelBuilder {

	private Counter counterPosition = null;

	private File fileModelPosition = null;

	/**
	 * Constructor
	 * 
	 * @param statementName
	 * @param scriptType
	 * @param positionStatement
	 * @throws SimulatorException
	 */
	public PositionModelBuilder(String statementName, String scriptType, int positionStatement) throws Exception {
		counterPosition = PositionmmFactory.eINSTANCE.createCounter();
		counterPosition.setPosition(positionStatement);
		counterPosition.setName(statementName);
		counterPosition.setScript(TypeScript.getByName(scriptType));
		saveModel();
	}

	/**
	 * 
	 * @throws SimulatorException
	 */
	private void saveModel() throws Exception {

			fileModelPosition = FileManagement.createTempFile("positionScript",
					"positionmm");

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("positionmm", new EcoreResourceFactoryImpl());

			URI fileURI = URI
					.createFileURI(fileModelPosition.getAbsolutePath());

			Resource poResource = resourceSet.createResource(fileURI);
			poResource.getContents().add(counterPosition);

			try {
				poResource.save(null);
			} catch (IOException e) {
				throw new SimulatorException("Error creation Position Model", e);
			}


	}

	/**
	 * 
	 * @return
	 */
	public String getPathPositionScriptModel() {
		return fileModelPosition.getPath();
	}
}
