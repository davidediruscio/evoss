package it.univaq.mancoosi.injectors.packages.util.debian;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import it.univaq.mancoosi.injectors.packages.exceptions.InjectorException;
import it.univaq.mancoosi.injectors.packages.util.InjectorConfig;


public class DebianInjectorConfig extends InjectorConfig {

	public static InjectorConfig getInstance() throws InjectorException {
		if (INSTANCE == null)
				INSTANCE = new DebianInjectorConfig();
		return INSTANCE;
	}

	
	private DebianInjectorConfig() throws InjectorException {
		super();

		Properties props = new Properties();
		try {
			props.load(new FileInputStream("config/settings-debian.properties"));
		} catch (FileNotFoundException e) {
			throw new InjectorException("Error properties file not found", e);
		} catch (IOException e) {
			throw new InjectorException("IO Error in properties file", e);
		}

		maintainerScriptsLocation = props
				.getProperty("maintainerScriptsLocation");
		grammarName = props.getProperty("grammarName");
		grammarMainRule = props.getProperty("grammarMainRule");
		packagesLocation = props.getProperty("packagesLocation");
		resultLocation = props.getProperty("resultLocation");
		tempLocation = props.getProperty("tempLocation");
	}

	@Override
	public void setMaintainerScriptsLocation(String maintainerScriptsLocation) {
		this.maintainerScriptsLocation = maintainerScriptsLocation;
	}

	@Override
	public String getMaintainerScriptsLocation() {
		return maintainerScriptsLocation;
	}

	@Override
	public void setPackagesLocation(String packagesLocation) {
		this.packagesLocation = packagesLocation;
	}

	@Override
	public String getPackagesLocation() {
		return packagesLocation;
	}

	@Override
	public void setResultLocation(String resultLocation) {
		this.resultLocation = resultLocation;
	}

	@Override
	public String getResultLocation() {
		return resultLocation;
	}


	@Override
	public void setTempLocation(String tempLocation) {
		this.tempLocation = tempLocation;
		
	}


	@Override
	public String getTempLocation() {
		return tempLocation;
	}


	@Override
	public void setGrammarName(String grammarName) {
		this.grammarName = grammarName;
	}


	@Override
	public String getGrammarName() {
		return grammarName;
	}


	@Override
	public void setGrammarMainRule(String grammarMainRule) {
		this.grammarMainRule = grammarMainRule;
	}


	@Override
	public String getGrammarMainRule() {
		return grammarMainRule;
	}
}
