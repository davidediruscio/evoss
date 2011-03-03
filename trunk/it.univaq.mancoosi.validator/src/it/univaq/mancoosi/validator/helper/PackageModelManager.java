
package it.univaq.mancoosi.validator.helper;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.Package;
import it.univaq.mancoosi.packagemm.PackagemmPackage;



public class PackageModelManager {

	private String pathPackageModel;
	private Package packContent;

	/**
	 * Constructor
	 * 
	 * @param pathPackageModel
	 * @throws SimulatorException
	 */
	public PackageModelManager(String pathPackageModel) throws Exception {
		
		this.pathPackageModel = pathPackageModel;
		packContent = loadModelPackage();

	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException
	 */
	private Package loadModelPackage() throws Exception {

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new EcoreResourceFactoryImpl());

		resourceSet.getPackageRegistry().put("packagemm",
				PackagemmPackage.eINSTANCE);

		java.io.File modelPackageFile = new java.io.File(this.pathPackageModel);

		if (!modelPackageFile.exists())
				throw new Exception("The Package model '"
						+ this.pathPackageModel + "' does not exist!");


		URI fileURI = URI.createFileURI(modelPackageFile.getAbsolutePath());

		Resource poResource = resourceSet.getResource(fileURI, true);

		Package pkg = (Package) poResource.getContents().get(0);

		return pkg;
	}

	

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getAllStatementPostinstScript() throws Exception {

		TreeIterator<EObject> tree = packContent.getPostinstScript().eAllContents();

		ArrayList<StatementScript> statements = getAllStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getAllStatementPostrmScript() throws Exception {

		TreeIterator<EObject> tree = packContent.getPostrmScript().eAllContents();

		ArrayList<StatementScript> statements = getAllStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getAllStatementPreinstScript() throws Exception {

		TreeIterator<EObject> tree = packContent.getPreinstScript().eAllContents();

		ArrayList<StatementScript> statements = getAllStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getAllStatementPrermScript() throws Exception {

		TreeIterator<EObject> tree = packContent.getPrermScript().eAllContents();

		ArrayList<StatementScript> statements = getAllStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @param tree
	 * @return
	 * @throws SimulatorException 
	 */
	private ArrayList<StatementScript> getAllStatementsScript(TreeIterator<EObject> tree) throws Exception {

		ArrayList<StatementScript> statements = new ArrayList<StatementScript>();

		HashMap<String, Integer> posMap = new HashMap<String, Integer>();

		while (tree.hasNext()) {

			EObject elem = tree.next();
			int position;

			if (posMap.containsKey(elem.eClass().getName())) {
				position = posMap.get(elem.eClass().getName()) + 1;
			} else {
				position = 1;
			}

			posMap.put(elem.eClass().getName(), position);
			statements.add(new StatementScript(elem.eClass().getName(),
						elem.eContainer().eClass().getName(), elem
								.eContainingFeature().getName(), position));
		}
		return statements;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Boolean hasPostinstScript() {
		Boolean exist = false;
		if (packContent != null && packContent.getPostinstScript() != null) {
			exist = true;
		}
		
		return exist;
	}

	/**
	 * 
	 * @return
	 */
	public Boolean hasPostrmScript() {
		Boolean exist = false;
		if (packContent != null && packContent.getPostrmScript() != null) {
			exist = true;
		}
		
		return exist;
	}

	/**
	 * 
	 * @return
	 */
	public Boolean hasPreinstScript() {
		Boolean exist = false;
		if (packContent != null && packContent.getPreinstScript() != null) {
			exist = true;
		}
		
		return exist;
	}

	/**
	 * 
	 * @return
	 */
	public Boolean hasPrermScript() {
		Boolean exist= false;
		if (packContent != null && packContent.getPrermScript() != null) {
			exist = true;
		}
		
		return exist;
	}

	/**
	 * @return the Name
	 */
	public String getName() {
		return packContent.getName();
	}
	
	/**
	 * @return the versionPackage
	 */
	public String getVersion() {
		return packContent.getVersion();
	}
	
	/**
	 * 
	 * @return
	 */
	public EList<File> getListfiles() {
		return packContent.getFiles();
	}
	
	/**
	 * 
	 * @return Boolean
	 */
	public Boolean hasFiles() {
		Boolean has = false;
		if (packContent.getFiles().size() != 0) {
			has = true;
		}
		return has;
	}

	/**
	 * 
	 * @return Boolean
	 */
	public Boolean hasConfFiles() {
		Boolean has = false;
		if (packContent.getConffiles().size() != 0) {
			has = true;
		}
		return has;
	}
	

	
	/**
	 * 
	 * @return
	 */
	public Integer getInstalledSize() {
		return packContent.getInstalledSize();
	}
	
	
	/**
	 * 
	 * @return
	 */
	public String getMaintainer() {
		return packContent.getMaintainer();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return packContent.getDescription();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getArchitecture() {
		return packContent.getArchitecture();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSection() {
		return packContent.getSection();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPriority() {
		return packContent.getPriority().getLiteral();
	}
}
