package it.univaq.mancoosi.injectors.packages.managers;

import java.io.*;
import java.util.*;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;
import it.univaq.mancoosi.injectors.packages.util.CheckErrorParsing;
import it.univaq.mancoosi.injectors.packages.util.Gra2MoLDinamicInterpreter;
import it.univaq.mancoosi.injectors.packages.util.InjectorConfig;
import it.univaq.mancoosi.injectors.packages.util.InjectorStatistics;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.PackagemmFactory;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.Package;


 public abstract class PackageManager {

	protected static  PackageManager INSTANCE ;
	
	protected HashMap<String, String> versionTypeMap;
	
	protected PackagemmFactory factory;
	
	protected InjectorConfig config;
	
	protected InjectorStatistics stats;

	public static PackageManager getInstance() throws InjectorException  {
		   return INSTANCE;
	}
	
	protected PackageManager() {
		
		this.versionTypeMap =  new HashMap<String, String>();
		versionTypeMap.put("=", "eq");
		versionTypeMap.put(">=", "ge");
		versionTypeMap.put(">", "gt");
		versionTypeMap.put(">>", "ggt");
		versionTypeMap.put("<", "lt");
		versionTypeMap.put("<=", "le");
		versionTypeMap.put("<<", "llt");
		
		factory = PackagemmFactory.eINSTANCE;
		
		stats = InjectorStatistics.getInstance();
		
	}

	
	protected Package loadModelPackage(String pathPackageModel) throws Exception {

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("*", new EcoreResourceFactoryImpl());

		resourceSet.getPackageRegistry().put("packagemm",
				PackagemmPackage.eINSTANCE);

		java.io.File modelPackageFile = new java.io.File(pathPackageModel);

		if (!modelPackageFile.exists())
				throw new InjectorException("Model Package not found!");


		URI fileURI = URI.createFileURI(modelPackageFile.getAbsolutePath());

		Resource poResource = resourceSet.getResource(fileURI, true);

		Package pkg = (Package) poResource.getContents().get(0);

		return pkg;
	}
	

	protected void saveModel(String pathPackageModel, Package pkg) throws Exception {
		try {

			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
					.put("packagemm", new EcoreResourceFactoryImpl());

			URI fileURI = URI.createFileURI(pathPackageModel);

			Resource poResource = resourceSet.createResource(fileURI);
			poResource.getContents().add(pkg);

			poResource.save(null);

		} catch (IOException e) {
			throw new InjectorException("Error saving the package model", e);
		}
	}
	
	protected Package createModelScript(String result, Package pkg,
			List<String> listScript) throws Exception {

		List<String> listOut = new ArrayList<String>();

		if (listScript.size() > 0) {

			for (int i = 0; i < listScript.size(); i++) {

				Integer numberError = CheckErrorParsing.check(listScript.get(i));

				if (numberError > 0 || numberError ==-1) {
					System.err.println("    The script '" + listScript.get(i) + "' is not parsed correctly (" + numberError
										+ " error/s)...");
				} else {
					listOut.add(listScript.get(i));
				}
			}

			if (listOut.size() == listScript.size()) {
				
				createMaintainerScriptModel(result, listScript);
				pkg = loadModelPackage(result);
				stats.incrementCorrectPackageWithScript();
				stats.appendCorrectPackageWithScript(result);
				
			} else {
				
				stats.incrementErrorPackageWithScript();
				stats.appendErrorPackageWithScript(result);
				
				if (config.isSkipFilesWithError()) {
					createMaintainerScriptModel(result, listOut);
					pkg = loadModelPackage(result);
				} else {
					createMaintainerScriptModel(result, listScript);
					pkg = loadModelPackage(result);
				}
			}

		} else {
			stats.incrementCorrectPackageNoScript();
			stats.appendCorrectPackageNoScript(result);
		}
		return pkg;
	}

	private void createMaintainerScriptModel (String result, List<String> sourceFilesFilter) {
		
		String pathSourceView = config.getTransformationLocation();
		String pathMetamodel = config.getMetamodelLocation();
		String targetMetamodel = config.getMetamodelMainPackage();
		String grammar = config.getGrammarName();
		String mainRule = config.getGrammarMainRule();
		Gra2MoLDinamicInterpreter inpt = new Gra2MoLDinamicInterpreter(
				pathSourceView, pathMetamodel, targetMetamodel, result,
				grammar, mainRule, sourceFilesFilter);
		inpt.execute();
	}
	
	protected abstract void processPackageMetadata(BufferedReader packageInfo, Package pkg) throws IOException;
	
	protected abstract void createSingleDeps(String[] singleDeps, Dependence owner);
	
	protected abstract void createSingleConflicts(String[] singleConflicts, Conflict owner);
	
	protected abstract void processPackageMetadataLine(String aLine, Package pkg);

	protected abstract void processConfFiles(List<String> conffilesBlock, Package pkg);
	
	public abstract void createModelFromInstalledPackages() throws Exception;
	
	public abstract void createModelFromInstalledPackage(String name) throws Exception;
	
	public abstract void createModelFromPackageFile(String path) throws Exception;
	
	protected abstract String unpackPackageFile(String path, String name) throws Exception;

	protected abstract void processAllFiles(BufferedReader info, Package pkg) throws Exception;
	
	protected abstract void processAllFilesFile(BufferedReader info, Package pkg) throws Exception;

	public abstract void createModelFromCacheDirectory() throws Exception;

	public abstract void createModelFromPackageData(String name, String version, String architecture) throws Exception;
	
}
