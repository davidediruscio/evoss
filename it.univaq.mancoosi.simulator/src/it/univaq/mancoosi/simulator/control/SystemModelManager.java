/**
 * 
 */
package it.univaq.mancoosi.simulator.control;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;

import it.univaq.mancoosi.mancoosimm.Package;
import it.univaq.mancoosi.mancoosimm.AndConflict;
import it.univaq.mancoosi.mancoosimm.AndDep;
import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Conflict;
import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.NotInstalledPackage;
import it.univaq.mancoosi.mancoosimm.OrConflict;
import it.univaq.mancoosi.mancoosimm.OrDep;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.PriorityType;
import it.univaq.mancoosi.mancoosimm.SingleConflict;
import it.univaq.mancoosi.mancoosimm.SingleDep;
import it.univaq.mancoosi.mancoosimm.VersionType;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import it.univaq.mancoosi.simulator.entity.DepConfl;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.CurrentSystemModelFile;
import it.univaq.mancoosi.simulator.util.FileManagement;
import it.univaq.mancoosi.simulator.util.SimulatorConfig;

/**
 * @author max
 * 
 */
public class SystemModelManager {


	private Configuration configuration = null;
	private SimulatorConfig config;
	
	/**
	 * Constructor
	 * 
	 * @throws SimulatorException
	 */
	public SystemModelManager() throws Exception {
		config = SimulatorConfig.getInstance();
		loadModel();
	}

	/**
	 * @throws SimulatorException 
	 * 
	 */
	private void loadModel() throws SimulatorException {

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("mancoosimm", new XMIResourceFactoryImpl());

		resourceSet.getPackageRegistry().put("mancoosimm",
				MancoosiPackage.eINSTANCE);

		java.io.File file =  CurrentSystemModelFile.getInstance().getSystemModelCurrent();

		URI uri = URI.createFileURI(file.getAbsolutePath());

		Resource resource = resourceSet.getResource(uri, true);

		configuration = (Configuration) resource.getContents().get(0);
	}

	
	/**
	 * 
	 * @throws SimulatorException
	 */
	public void saveModel() throws Exception {
		try {
			String inputSystemModel = config.getFileInputSystemModel();

			String nameFileModel = inputSystemModel.substring(inputSystemModel
					.lastIndexOf("/") + 1, inputSystemModel.length());

			java.io.File newTempFile = FileManagement.createTempFile(nameFileModel
					.substring(0, nameFileModel.lastIndexOf(".")),
					nameFileModel.substring(nameFileModel.lastIndexOf(".") + 1,
							nameFileModel.length()));

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("mancoosimm", new EcoreResourceFactoryImpl());

			URI fileURI = URI.createFileURI(newTempFile.getAbsolutePath());

			Resource poResource = resourceSet.createResource(fileURI);
			
			configuration.setCreationTime((new GregorianCalendar()).getTime().toString());
			
			poResource.getContents().add(configuration);

			CurrentSystemModelFile.getInstance().setSystemModelCurrent(newTempFile);

			poResource.save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			throw new SimulatorException("Error saving System Model", e);
		}
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isInstalledPackage(String packageName, String version) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getVersion()).equals(version)
						&& (pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}

	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public Boolean isInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return found;
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public InstalledPackage getInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return pkgElem;
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return Boolean
	 */
	public NotInstalledPackage getNotInstalledPackage(String packageName) {
		
		Boolean found = false;
		Iterator<NotInstalledPackage> packIterator = configuration.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
		}
		
		return pkgElem;
	}
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @return
	 */
	public Boolean removeInstalledPackage(String packageName, String version) {
		Boolean found = false;
		Iterator<InstalledPackage> packIterator = configuration.getInstalledPackages().iterator();
		InstalledPackage pkgElem = null;
		
		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
				if ((pkgElem.getVersion()).equals(version)
						&& (pkgElem.getName()).equals(packageName)) {
				found = true;
			}
		}

		if (found) {

			PackageSetting pkgSet = MancoosiFactory.eINSTANCE
					.createPackageSetting();

			if (pkgElem.getPackageSettings() != null) {
				for (int i = 0; i < pkgElem.getPackageSettings().getFiles().size(); i++) {
					pkgSet.getFiles().add(pkgElem.getPackageSettings().getFiles().get(i));
				}
			}
			NotInstalledPackage pkgNotInst = MancoosiFactory.eINSTANCE.createNotInstalledPackage();
			pkgNotInst.setName(packageName);
			if (version != null) pkgNotInst.setVersion(version);
			if (pkgSet != null && pkgSet.getFiles().size() > 0)
				pkgNotInst.setPackageSettings(pkgSet);

			EcoreUtil.delete(pkgElem, true);

			configuration.getNotInstalledPackages().add(pkgNotInst);

		}
		return found;
	}
	
	
	/**
	 * 
	 * @param packageName
	 * @param version
	 * @param listDep
	 * @param listConfl
	 * @param listFiles
	 * @param installedSize
	 * @param maintainer
	 * @param architecture
	 * @param section
	 * @param priority
	 * @return
	 */
	public Boolean installNotInstalledPackage(String packageName, String version, 
			ArrayList<DepConfl> listDep, ArrayList<DepConfl> listConfl,
			ArrayList<String> listFiles, Integer installedSize, String maintainer, 
			String architecture, String section, String priority) {
		Boolean found = false;

		Iterator<NotInstalledPackage> packIterator = configuration
				.getNotInstalledPackages().iterator();
		NotInstalledPackage pkgElem = null;

		while ((packIterator.hasNext()) && (!found)) {
			pkgElem = packIterator.next();
			if (pkgElem.getVersion() != null) {
				if ((pkgElem.getName()).equals(packageName)
						&& (pkgElem.getVersion()).equals(version)) {
					found = true;
				}
			} else {
				if ((pkgElem.getName()).equals(packageName)) {
					found = true;
				}
			}
		}

		if (found) {
			EcoreUtil.delete(pkgElem, true);
		}
			InstalledPackage pkgInst = MancoosiFactory.eINSTANCE
					.createInstalledPackage();
			pkgInst.setName(packageName);
			if (version != null) pkgInst.setVersion(version);
		
			if (installedSize != null) pkgInst.setInstalledSize(installedSize);
			if (maintainer != null) pkgInst.setMaintainer(maintainer);
			if (architecture != null) pkgInst.setArchitecture(architecture);
			if (section != null) pkgInst.setSection(section);
			if (priority != null) pkgInst.setPriority(PriorityType.get(priority));
			
			if (listDep != null && listDep.size()>0) pkgInst.setDepends(setDependences(listDep));
			if (listConfl != null && listConfl.size()>0) pkgInst.setConflict(setConflicts(listConfl));
			if (listFiles != null && listFiles.size()>0) pkgInst.setPackageSettings(setPackageSetting(listFiles));
			
			configuration.getInstalledPackages().add(pkgInst);

		
		return found;
	}

	
	/**
	 * 
	 * @param listFiles
	 * @return
	 */
	private PackageSetting setPackageSetting(ArrayList<String> listFiles) {
		
		PackageSetting pkgSet = MancoosiFactory.eINSTANCE.createPackageSetting();
		
		FileSystem fs = configuration.getFileSystem();

		for (int i = 0; i<listFiles.size(); i++) {
			Iterator<File> fileIterator = fs.getAllFiles().iterator();
			File file = null;
			Boolean found = false;
			while ((fileIterator.hasNext()) && (!found)) {
				file = fileIterator.next();
				if (file.getLocation().equals(listFiles.get(i)))
					found = true;
			}
			pkgSet.getFiles().add(file);
		}
		return pkgSet;
	}

	/**
	 * 
	 * @param listDep
	 * @return
	 */
	private Dependence setDependences(ArrayList<DepConfl> listDep) {
		
		ArrayList<Dependence> appList = new ArrayList<Dependence>();
		
		for (int i=0; i< listDep.size(); i++) {
			DepConfl elem = listDep.get(i);
			
			Dependence dep = null;
			
			if (elem.getType().equals("SingleDep")) {
				
				dep = MancoosiFactory.eINSTANCE.createSingleDep();
				if (elem.getValue() != null) ((SingleDep)dep).setValue(elem.getValue());
				if (elem.getVersion() != null) ((SingleDep)dep).setVersion(VersionType.get(elem.getVersion()));
				
				Package pkg = getInstalledPackage(elem.getPkg());
				if (pkg == null) pkg = getNotInstalledPackage(elem.getPkg());
				
				((SingleDep)dep).setPkg(pkg);
				appList.add(dep);
				
			} else if (elem.getType().equals("AndDep")) {
				
				dep = MancoosiFactory.eINSTANCE.createAndDep();
				appList.add(dep);
				
			} else if (elem.getType().equals("OrDep")) {
				dep = MancoosiFactory.eINSTANCE.createOrDep();
				appList.add(dep);
			}
			
			if (i != 0) {	
				Dependence elemParent = appList.get(elem.getParentPosition());

				if (elemParent instanceof OrDep) {
					((OrDep) elemParent).getOps().add(dep);
				}
				
				if (elemParent instanceof AndDep) {
					((AndDep) elemParent).getOps().add(dep);
					
				}
			}
		}

		return appList.get(0);
	}

	/**
	 * 
	 * @param listConfl
	 * @return
	 */
	private Conflict setConflicts(ArrayList<DepConfl> listConfl) {
		
		ArrayList<Conflict> appList = new ArrayList<Conflict>();
		
		for (int i=0; i< listConfl.size(); i++) {
			DepConfl elem = listConfl.get(i);
			
			Conflict confl = null;
			
			if (elem.getType().equals("SingleConflict")) {
				
				confl = MancoosiFactory.eINSTANCE.createSingleConflict();
				if (elem.getValue() !=null) ((SingleConflict)confl).setValue(elem.getValue());
				if (elem.getVersion() !=null) ((SingleConflict)confl).setVersion(VersionType.get(elem.getVersion()));
				
				Package notPkg = getNotInstalledPackage(elem.getPkg());
				if (notPkg == null) notPkg = getInstalledPackage(elem.getPkg());
				
				((SingleConflict)confl).setPkg(notPkg);
				
				appList.add(confl);
				
			} else if (elem.getType().equals("AndConflict")) {
				
				confl = MancoosiFactory.eINSTANCE.createAndConflict();
				appList.add(confl);
				
			} else if (elem.getType().equals("OrConflict")) {
				confl = MancoosiFactory.eINSTANCE.createOrConflict();
				appList.add(confl);
			}
			
			if (i != 0) {	
				Conflict elemParent = appList.get(elem.getParentPosition());

				if (elemParent instanceof OrConflict) {
					((OrConflict) elemParent).getOps().add(confl);
				}
				
				if (elemParent instanceof AndConflict) {
					((AndConflict) elemParent).getOps().add(confl);
					
				}
			}
		}

		return appList.get(0);
	}
	
	
	/**
	 * 
	 * @param path
	 * @return
	 */
	public Boolean existFile(String path) {

		FileSystem fs = configuration.getFileSystem();
		Iterator<File> fileIterator = fs.getAllFiles().iterator();
		File file = null;
		Boolean found = false;

		while ((fileIterator.hasNext()) && (!found)) {
			file = fileIterator.next();
			if (file.getLocation().equals(path))
				found = true;
		}
		return found;
	}

	
	/**
	 * 
	 * @param location
	 * @return
	 */
	public File getFile(String location) {
		Iterator<File> fileIterator = configuration.getFileSystem().getAllFiles().iterator();
		File fileParent = null;
		Boolean found = false;

		while ((fileIterator.hasNext()) && (!found)) {
			fileParent = fileIterator.next();
			if (fileParent.getLocation().equals(location))
				found = true;
		}

		return fileParent;
	}
	

	/**
	 * 
	 * @param location
	 * @return
	 */
	public Boolean deleteFile(String location) {
		
		Iterator<File> allFilesIterator = configuration.getFileSystem().getAllFiles().iterator();
		File fileToBeDeleted= null;
		Boolean found = false;
		
		while (allFilesIterator.hasNext() && !found) {
			fileToBeDeleted = allFilesIterator.next();
			if (fileToBeDeleted.getLocation().equals(location)) {
				found = true;
				EcoreUtil.delete(fileToBeDeleted, true);
			}
		}
		return found;
	}

	/**
	 * 
	 * @param path
	 */
	public Boolean addFile(String path) {

		Boolean isDirectory = true;
		Boolean added = false;
		String[] pathElements = path.split("/");
		String location = "";

		for (int i = 1; i < pathElements.length; i++) {

			String parentLocation = location;

			if (parentLocation.equals(""))
				parentLocation = "/";

			location = location.concat("/".concat(pathElements[i]));

			if (!existFile(location)) {

				if (i == pathElements.length - 1)
					isDirectory = false;

				File file = MancoosiFactory.eINSTANCE.createFile();

				file.setName(pathElements[i]);
				file.setIsDirectory(isDirectory);
				file.setLocation(location);
				file.setParent(getFile(parentLocation));

				configuration.getFileSystem().getAllFiles().add(file);
				added = true;
			}
		}
		return added;
	}
}
