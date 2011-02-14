
package it.univaq.mancoosi.simulator.controller.managers;

import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.errormm.ErrormmFactory;
import it.univaq.mancoosi.errormm.Error;
import it.univaq.mancoosi.errormm.ErrormmPackage;
import it.univaq.mancoosi.errormm.Report;
import it.univaq.mancoosi.errormm.Warning;


/**
 * Manages the creation and saving of the error model.
 */
public class ErrorModelManager {

	private Report report;
	
	/**
	 * Constructor
	 * 
	 * @throws SimulatorException
	 */
	public ErrorModelManager() throws Exception {
		report = ErrormmFactory.eINSTANCE.createReport();
	}
	
	
	/**
	 * Constructor
	 * 
	 * @throws SimulatorException
	 */
	public ErrorModelManager(String pathModel) throws Exception {
		report = loadModel(pathModel);
	}
	
	
	/**
	 * 
	 * @param path
	 * @return
	 * @throws SimulatorException
	 */
	private Report loadModel(String path) throws SimulatorException {

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("errormm", new XMIResourceFactoryImpl());

		resourceSet.getPackageRegistry().put("errormm", ErrormmPackage.eINSTANCE);

		URI uri = URI.createFileURI(path);

		Resource resource = resourceSet.getResource(uri, true);
		
		Report rep = null;
		
		if (!resource.getContents().isEmpty()) {
			rep = (Report)resource.getContents().get(0);
		} 
		return rep;
	}


	/**
	 * 
	 * @return
	 */
	public Boolean existsWarnings() {
		Boolean exist = false;
		if (report.getWarnings().size() > 0) {
			exist = true;
		}
		return exist;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Boolean existsErrors() {
		Boolean exist = false;
		if (report.getErrors().size() > 0) {
			exist = true;
		}
		return exist;
	}
	
	
	/**
	 * 
	 * @return boolean
	 */
	public Boolean isEmpty() {
		Boolean empty = false;
		if ((report.getErrors().size()==0) 
			&& (report.getWarnings().size()==0)) {
			empty= true;
		}
		return empty;
	}
	
	/**
	 * 
	 * @param pathModelAppended
	 * @throws SimulatorException
	 */
	public void appendModel (String pathModelAppended) throws SimulatorException {
		Report modelIn = loadModel(pathModelAppended);

		report.getErrors().addAll(modelIn.getErrors());
		report.getWarnings().addAll(modelIn.getWarnings());
	}
	
	
	/**
	 * 
	 * @param models
	 * @throws SimulatorException
	 */
	public void appendModel (ArrayList<String> models) throws SimulatorException {
		
		for (int i=0; i<models.size(); i++) {
			if ((new java.io.File(models.get(i)).exists()) 
					&& ((new java.io.File(models.get(i))).length()>0)) {
				Report modelIn = loadModel(models.get(i));
				if (modelIn != null) {
					report.getErrors().addAll(modelIn.getErrors());
					report.getWarnings().addAll(modelIn.getWarnings());
				}
			}
		}
	}
	
	
	/**
	 * 
	 * @param description
	 * @param name
	 * @param pkg
	 * @param type
	 */
	public void addErrorMessage (String description, String name, String pkg, String type) {
		Error errorMsg = ErrormmFactory.eINSTANCE.createError();
		errorMsg.setDescription(description);
		errorMsg.setPackage(pkg);
		errorMsg.setType(type);
		report.getErrors().add(errorMsg);
	}

	
	/**
	 * 
	 * @param description
	 * @param name
	 * @param pkg
	 * @param type
	 */
	public void addWarningMessage (String description, String name, String pkg, String type) {
		Warning warningMsg = ErrormmFactory.eINSTANCE.createWarning();
		warningMsg.setDescription(description);
		warningMsg.setPackage(pkg);
		warningMsg.setType(type);
		report.getWarnings().add(warningMsg);
	}
	

	/**
	 * 
	 * @param warningMsg
	 */
	public void addWarningObject (Warning warningMsg) {
		report.getWarnings().add(warningMsg);
	}
	
	
	/**
	 * 
	 * @param errorMsg
	 */
	public void addErrorObject (Error errorMsg) {
		report.getErrors().add(errorMsg);
	}

	
	/**
	 * Method for saving the model
	 * 
	 * @throws SimulatorException
	 */
	public void saveModel(String path) throws Exception {
		try {

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("errormm", new EcoreResourceFactoryImpl());

			URI fileURI = URI.createFileURI(path);

			Resource poResource = resourceSet.createResource(fileURI);
			poResource.getContents().add(report);

			poResource.save(null);

		} catch (IOException e) {
			throw new SimulatorException("Error saving the model error: " + path, e);
		}
	}

	
	/**
	 * 
	 */
	public void printModel() {
		
		int numberError = report.getErrors().size();
		
		if (numberError > 0) {
			System.out.println("Errors:");
		}
		
		for(int i=0; i< numberError; i++) {
			Error err = report.getErrors().get(i);
			if (err.getDescription() != null) System.out.println(err.getDescription());
		}
		
		int numberWarning = report.getWarnings().size();
		
		if (numberWarning > 0) {
			System.out.println("Warnings:");
			System.out.println();
		}
		
		for(int i=0; i< numberWarning; i++) {
			Warning warn = report.getWarnings().get(i);
			if (warn.getDescription() != null) System.out.println(warn.getDescription());
		}
	}
}
