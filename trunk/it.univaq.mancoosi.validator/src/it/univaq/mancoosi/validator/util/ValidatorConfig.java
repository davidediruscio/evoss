package it.univaq.mancoosi.validator.util;


import it.univaq.mancoosi.validator.exceptions.ValidatorException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ValidatorConfig {

	private static ValidatorConfig INSTANCE = null;

	//private String pkginjJarPath;

	private String sysinjJarPath;

	private String simulatorJarPath;


	/**
	 * Singleton
	 * @return instance
	 * @throws ValidatorException
	 */
	public static ValidatorConfig getInstance() throws ValidatorException {
		if (INSTANCE == null)
			INSTANCE = new ValidatorConfig();
		return INSTANCE;
	}

	/**
	 * Private constructor
	 * @throws ValidatorException
	 */
	private ValidatorConfig() throws ValidatorException {

		Properties props = new Properties();
		try {
			props.load(new FileInputStream("config/validator_settings.properties"));
		} catch (FileNotFoundException e) {
			throw new ValidatorException("Error properties file not found", e);
		} catch (IOException e) {
			throw new ValidatorException("IO Error in properties file", e);
		}
		
		//setPkginjJarPath(props.getProperty("pkginjJarPath"));
		setSysinjJarPath(props.getProperty("sysinjJarPath"));
		setSimulatorJarPath(props.getProperty("simulatorJarPath"));
	}

	/*public void setPkginjJarPath(String pkginjJarPath) {
		this.pkginjJarPath = pkginjJarPath;
	}

	public String getPkginjJarPath() {
		return pkginjJarPath;
	}*/

	public void setSysinjJarPath(String sysinjJarPath) {
		this.sysinjJarPath = sysinjJarPath;
	}

	public String getSysinjJarPath() {
		return sysinjJarPath;
	}

	public void setSimulatorJarPath(String simulatorJarPath) {
		this.simulatorJarPath = simulatorJarPath;
	}

	public String getSimulatorJarPath() {
		return simulatorJarPath;
	}
}
