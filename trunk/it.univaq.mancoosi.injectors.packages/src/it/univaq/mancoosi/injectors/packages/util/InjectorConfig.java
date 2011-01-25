package it.univaq.mancoosi.injectors.packages.util;


import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public abstract class InjectorConfig {

	protected static InjectorConfig INSTANCE = null;

	private String grammarName;
	private String grammarMainRule;
	protected String maintainerScriptsLocation;
	private String transformationLocation;
	private String metamodelLocation;
	protected String packagesLocation;
	protected String resultLocation;
	private String metamodelMainPackage;
	protected String tempLocation;


	/**
	 * Singleton
	 * @return instance
	 * @throws InjectorException
	 */
	public static InjectorConfig getInstance() throws InjectorException {
		return INSTANCE;
	}

	/**
	 * Private constructor
	 * @throws InjectorException
	 */
	protected InjectorConfig() throws InjectorException {

		Properties props = new Properties();
		try {
			props.load(new FileInputStream("config/settings.properties"));
		} catch (FileNotFoundException e) {
			throw new InjectorException("Error properties file not found", e);
		} catch (IOException e) {
			throw new InjectorException("IO Error in properties file", e);
		}
		
		grammarName = props.getProperty("grammarName");
		grammarMainRule = props.getProperty("grammarMainRule");
		transformationLocation = props.getProperty("transformationLocation");
		metamodelLocation = props.getProperty("metamodelLocation");
		metamodelMainPackage = props.getProperty("metamodelMainPackage");
	}


	public void setGrammarName(String grammarName) {
		this.grammarName = grammarName;
	}

	public String getGrammarName() {
		return grammarName;
	}


	public void setGrammarMainRule(String grammarMainRule) {
		this.grammarMainRule = grammarMainRule;
	}

	public String getGrammarMainRule() {
		return grammarMainRule;
	}

	public abstract void setMaintainerScriptsLocation(String maintainerScriptsLocation);

	public abstract String getMaintainerScriptsLocation();

	public void setTransformationLocation(String transformationLocation) {
		this.transformationLocation = transformationLocation;
	}

	public String getTransformationLocation() {
		return transformationLocation;
	}

	public void setMetamodelLocation(String metamodelLocation) {
		this.metamodelLocation = metamodelLocation;
	}

	public String getMetamodelLocation() {
		return metamodelLocation;
	}

	public abstract void setPackagesLocation(String packagesLocation);

	public abstract String getPackagesLocation();
	
	public abstract void setResultLocation(String resultLocation);

	public abstract String getResultLocation();
	
	public abstract String getTempLocation();

	public abstract void setTempLocation(String tempLocation);

	public void setMetamodelMainPackage(String metamodelMainPackage) {
		this.metamodelMainPackage = metamodelMainPackage;
	}

	public String getMetamodelMainPackage() {
		return metamodelMainPackage;
	}
}
