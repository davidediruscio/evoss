package it.univaq.mancoosi.injectors.packages.util;


import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public abstract class InjectorConfig {

	protected static InjectorConfig INSTANCE = null;

	protected String grammarName;
	protected String grammarMainRule;
	protected String maintainerScriptsLocation;
	protected String transformationLocation;
	private String metamodelLocation;
	protected String packagesLocation;
	protected String resultLocation;
	private String metamodelMainPackage;
	protected String tempLocation;
	private Boolean skipFilesWithError;
	private Boolean overwriteModels;


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
			props.load(new FileInputStream("config"+File.separator+"pkginj_settings.properties"));
		} catch (FileNotFoundException e) {
			throw new InjectorException("Error properties file not found", e);
		} catch (IOException e) {
			throw new InjectorException("IO Error in properties file", e);
		}
		
		metamodelLocation = props.getProperty("metamodelLocation");
		metamodelMainPackage = props.getProperty("metamodelMainPackage");
		
		if (props.getProperty("skipFilesWithError").equals("true")) {
			this.skipFilesWithError = true;
		} else {
			this.skipFilesWithError = false;
		}
		
		if (props.getProperty("overwriteModels").equals("true")) {
			this.overwriteModels = true;
		} else {
			this.overwriteModels = false;
		}
	}


	public abstract void setGrammarName(String grammarName);

	public abstract String getGrammarName();

	public abstract void setGrammarMainRule(String grammarMainRule);

	public abstract String getGrammarMainRule();

	public abstract void setMaintainerScriptsLocation(String maintainerScriptsLocation);

	public abstract String getMaintainerScriptsLocation();

	public abstract void setTransformationLocation(String transformationLocation);

	public abstract String getTransformationLocation();

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

	public void setSkipFilesWithError(Boolean skipFilesWithError) {
		this.skipFilesWithError = skipFilesWithError;
	}

	public Boolean isSkipFilesWithError() {
		return skipFilesWithError;
	}

	public void setOverwriteModels(Boolean overwriteModels) {
		this.overwriteModels = overwriteModels;
	}

	public Boolean isOverwriteModels() {
		return overwriteModels;
	}
}
