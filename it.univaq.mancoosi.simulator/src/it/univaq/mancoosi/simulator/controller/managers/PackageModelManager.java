
package it.univaq.mancoosi.simulator.controller.managers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;


import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.AndDep;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.InputParameter;
import it.univaq.mancoosi.packagemm.OrConflict;
import it.univaq.mancoosi.packagemm.OrDep;
import it.univaq.mancoosi.packagemm.Package;
import it.univaq.mancoosi.packagemm.PackagemmFactory;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.SingleConflict;
import it.univaq.mancoosi.packagemm.SingleDep;
import it.univaq.mancoosi.simulator.entity.DepConfl;
import it.univaq.mancoosi.simulator.entity.StatementScript;
import it.univaq.mancoosi.simulator.exceptions.PackageModelFileNotFoundException;
import it.univaq.mancoosi.simulator.exceptions.RuleNotFoundException;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.TransformationRuleFilesMapping;



public class PackageModelManager {

	private String pathPackageModel;
	private TransformationRuleFilesMapping mapElementTransformation;
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
		mapElementTransformation = TransformationRuleFilesMapping.getInstance();

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
				throw new PackageModelFileNotFoundException("The Package model '"
						+ this.pathPackageModel + "' does not exist!");


		URI fileURI = URI.createFileURI(modelPackageFile.getAbsolutePath());

		Resource poResource = resourceSet.getResource(fileURI, true);

		Package pkg = (Package) poResource.getContents().get(0);

		return pkg;
	}

	
	/**
	 * 
	 * @param tree
	 * @return
	 * @throws SimulatorException 
	 */
	private ArrayList<StatementScript> getStatementsScript(
			TreeIterator<EObject> tree) throws SimulatorException {

		ArrayList<StatementScript> statements = new ArrayList<StatementScript>();

		HashMap<String, Integer> posMap = new HashMap<String, Integer>();

		while (tree.hasNext()) {

			EObject elem = tree.next();
			
			if (!(elem.eContainingFeature().getName().equals("condition")
					|| elem.eContainingFeature().getName().equals("exps")
					|| elem.eContainingFeature().getName().equals("master")
					|| elem.eContainingFeature().getName().equals("file")
					|| elem.eClass().getName().equals("InputParameter"))) {

			if (mapElementTransformation.existsTransformationRule(elem.eClass().getName())) {

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
			} else {
				throw new RuleNotFoundException("The rule for '"
						+ elem.eClass().getName() + "' does not exist!");
			}
		}
	}

		return statements;
	}

	
	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getStatementPostinstScript() throws SimulatorException {

		TreeIterator<EObject> tree = packContent.getPostinstScript().eAllContents();

		ArrayList<StatementScript> statements = getStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getStatementPostrmScript() throws SimulatorException {

		TreeIterator<EObject> tree = packContent.getPostrmScript().eAllContents();

		ArrayList<StatementScript> statements = getStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getStatementPreinstScript() throws SimulatorException {

		TreeIterator<EObject> tree = packContent.getPreinstScript().eAllContents();

		ArrayList<StatementScript> statements = getStatementsScript(tree);
		
		return statements;
	}

	/**
	 * 
	 * @return
	 * @throws SimulatorException 
	 */
	public ArrayList<StatementScript> getStatementPrermScript() throws SimulatorException {

		TreeIterator<EObject> tree = packContent.getPrermScript().eAllContents();

		ArrayList<StatementScript> statements = getStatementsScript(tree);
		
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
	public ArrayList<DepConfl> getDependences() {
		
		Dependence p = packContent.getDepends();
		
		if (p == null) return null;
		
		ArrayList<DepConfl> list = new ArrayList<DepConfl>();
		HashMap<Dependence, Integer> app = new HashMap<Dependence, Integer>();
		
		list.add(new DepConfl(-1, p.eClass().getName(), null, null, null));
		app.put(p, 0);
		
		TreeIterator<EObject> tree = packContent.getDepends().eAllContents();
		
		for (int i=1; tree.hasNext(); i++){
			Dependence next = (Dependence)tree.next();
			if (next instanceof SingleDep) {
			list.add(new DepConfl(app.get((Dependence)next.eContainer()), next.eClass().getName(), ((SingleDep)next).getPkg(), ((SingleDep)next).getValue(), ((SingleDep)next).getVersion().getLiteral()));
			}
			if ((next instanceof OrDep) || (next instanceof AndDep)) {
				list.add(new DepConfl(app.get((Dependence)next.eContainer()), next.eClass().getName()));
			}
			
			app.put(next, i);
		}

		return list;
	}
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<DepConfl> getConflicts() {
		
		Conflict p = packContent.getConflict();
		
		if (p == null) return null;
		
		ArrayList<DepConfl> list = new ArrayList<DepConfl>();
		HashMap<Conflict, Integer> app = new HashMap<Conflict, Integer>();
		
		list.add(new DepConfl(-1, p.eClass().getName(), null, null, null));
		app.put(p, 0);
		
		TreeIterator<EObject> tree = packContent.getConflict().eAllContents();
		
		for (int i=1; tree.hasNext(); i++){
			Conflict next = (Conflict)tree.next();
			if (next instanceof SingleConflict) {
			list.add(new DepConfl(app.get((Conflict)next.eContainer()), next.eClass().getName(), ((SingleConflict)next).getPkg(), ((SingleConflict)next).getValue(), ((SingleConflict)next).getVersion().getLiteral()));
			}
			if ((next instanceof OrConflict) || (next instanceof AndConflict)) {
				list.add(new DepConfl(app.get((Conflict)next.eContainer()), next.eClass().getName()));
			}
			
			app.put(next, i);
		}

		return list;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getConfFiles() {
		ArrayList<String> listLocation = new ArrayList<String>();
		EList<File> listFile = packContent.getConffiles();
		
		if (listFile == null) return null;
		
		for (int i=0; i< listFile.size(); i++) {
			listLocation.add(listFile.get(i).getLocation());
		}
		return listLocation;
	}
	
	
	/**
	 * 
	 * @return
	 */
	public ArrayList<String> getNotConfFiles() {
		ArrayList<String> listLocation = new ArrayList<String>();
		EList<File> listConfFile = packContent.getConffiles();

		EList<File> listAllFile = packContent.getFiles();

		if (listAllFile == null)
			return null;

		for (int i = 0; i < listAllFile.size(); i++) {
			Boolean found = false;

			for (int j = 0; j < listConfFile.size() && !found; j++) {

				if (listAllFile.get(i).getLocation().equals(
						listConfFile.get(j).getLocation())
					|| listConfFile.get(j).getLocation().startsWith(listAllFile.get(i).getLocation())) {
					found = true;
				}
			}

			if (!found)
				listLocation.add(listAllFile.get(i).getLocation());
		}

		return listLocation;
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

	
	/**
	 * 
	 * @throws SimulatorException
	 */
	public String saveModel() throws Exception {
		try {
			String inputPackageModel = this.pathPackageModel;
			

			String nameFileModel = inputPackageModel.substring(inputPackageModel
					.lastIndexOf("/") + 1, inputPackageModel.length());

			java.io.File newTempFile = FileManagement.createTempFile(nameFileModel
					.substring(0, nameFileModel.lastIndexOf(".")),
					nameFileModel.substring(nameFileModel.lastIndexOf(".") + 1,
							nameFileModel.length()));

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("packagemm", new EcoreResourceFactoryImpl());

			URI fileURI = URI.createFileURI(newTempFile.getAbsolutePath());

			Resource poResource = resourceSet.createResource(fileURI);
			
			poResource.getContents().add(packContent);

			poResource.save(Collections.EMPTY_MAP);
			
			return newTempFile.getPath();

		} catch (IOException e) {
			throw new SimulatorException("Error saving Package model", e);
		}
	}
	
	/**
	 * 
	 * @param initParams
	 * @return path temp script 
	 * @throws Exception 
	 */
	public String setInitParamsPrerm (String[] initParams) throws Exception {
		
		// delete old initParams
		for (int i=0; i < packContent.getPrermScript().getInputParameters().size(); i++) {
			packContent.getPrermScript().getInputParameters().remove(i);
		}
		
		for (int i=0; i< initParams.length; i++) {
			InputParameter inputParam = PackagemmFactory.eINSTANCE.createInputParameter();
			inputParam.setName(initParams[i]);
			inputParam.setScript(packContent.getPrermScript());
			packContent.getPrermScript().getInputParameters().add(inputParam);
		}
		
		String path = saveModel();
		return path;
	}
	
	
	/**
	 * 
	 * @param initParams
	 * @return path temp script 
	 * @throws Exception 
	 */
	public String setInitParamsPostrm (String[] initParams) throws Exception {
		
		// delete old initParams
		for (int i=0; i < packContent.getPostrmScript().getInputParameters().size(); i++) {
			packContent.getPostrmScript().getInputParameters().remove(i);
		}
		
		for (int i=0; i< initParams.length; i++) {
			InputParameter inputParam = PackagemmFactory.eINSTANCE.createInputParameter();
			inputParam.setName(initParams[i]);
			inputParam.setScript(packContent.getPostrmScript());
			packContent.getPostrmScript().getInputParameters().add(inputParam);
		}
		
		String path = saveModel();
		return path;
	}
	
	/**
	 * 
	 * @param initParams
	 * @return path temp script 
	 * @throws Exception 
	 */
	public String setInitParamsPreinst (String[] initParams) throws Exception {
		
		// delete old initParams
		for (int i=0; i < packContent.getPreinstScript().getInputParameters().size(); i++) {
			packContent.getPreinstScript().getInputParameters().remove(i);
		}
		
		for (int i=0; i< initParams.length; i++) {
			InputParameter inputParam = PackagemmFactory.eINSTANCE.createInputParameter();
			inputParam.setName(initParams[i]);
			inputParam.setScript(packContent.getPreinstScript());
			packContent.getPreinstScript().getInputParameters().add(inputParam);
		}
		
		String path = saveModel();
		return path;
	}
	
	/**
	 * 
	 * @param initParams
	 * @return path temp script 
	 * @throws Exception 
	 */
	public String setInitParamsPostinst (String[] initParams) throws Exception {
		
		// delete old initParams
		for (int i=0; i < packContent.getPostinstScript().getInputParameters().size(); i++) {
			packContent.getPostinstScript().getInputParameters().remove(i);
		}
		
		for (int i=0; i< initParams.length; i++) {
			InputParameter inputParam = PackagemmFactory.eINSTANCE.createInputParameter();
			inputParam.setName(initParams[i]);
			inputParam.setScript(packContent.getPostinstScript());
			packContent.getPostinstScript().getInputParameters().add(inputParam);
		}
		
		String path = saveModel();
		return path;
	}
}
