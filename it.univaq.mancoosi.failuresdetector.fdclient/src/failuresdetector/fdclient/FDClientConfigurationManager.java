package failuresdetector.fdclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import failuresdetector.exceptions.LoadConfigurationException;

//This class manages client configuration
public class FDClientConfigurationManager {

	//parameters to read from the configuration file
	private static final String FDSERVER_URI_PARAMETER = "fdServerUri";
	private static final String ECORE_MODEL_DIR_PARAMETER = "ecoreModelDir";
	private static final String ECORE_MODEL_FILENAME_PARAMETER = "ecoreModelFileName";
	private static final String JARS_DIR_PARAMETER = "jarsDir";
	private static final String JARS_LIST_FILENAME_PARAMETER = "jarsListFile";
	private static final String TMP_DIR_PARAMETER = "tmpDir";
	private static final String OCLQUERIES_DIR_PARAMETER = "oclQueriesDir";
	private static final String OCLQUERIES_FILENAME_PARAMETER = "oclQueriesFileName";
	
	//default values for configuration parameters
	private static final String DEFAULT_FDSERVER_URI = "localhost";
	private static final String DEFAULT_ECORE_MODEL_DIR = "model";
	private static final String DEFAULT_ECORE_MODEL_FILENAME = "systemModel.ecore";
	public static final String DEFAULT_TMP_DIR = "tmp";
	public static final String DEFAULT_JARS_DIR = "jars";
	public static final String DEFAULT_JARS_LIST_FILENAME = "jarsList.txt";
	public static final String DEFAULT_OCLQUERIES_DIR = "oclqueries";
	public static final String DEFAULT_OCLQUERIES_FILENAME = "queries.ocl";
	
	public static final String CONFIG_FILE_PATH = "conf/config.txt";
	public static final int DEFAULT_PORT = 6793;
	public static final int CONTROL_PORT = 6794;
	public static final int FILE_PORT = 6795;
	
	//This method retrieves the value of the parameter given in input from the configuration file
	public static String getConfigurationParameter(String configurationFilePath, String parameter) throws LoadConfigurationException, FileNotFoundException, IOException {
		if(!removeSpaces(parameter).equals("")) {
				File configurationFile = new File(configurationFilePath);
				FileInputStream fstream = new FileInputStream(configurationFile);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String strLine;
				String parameterValue = null;
				boolean found = false;
				//Read File Line By Line
				while(((strLine = br.readLine()) != null) && !found)   {
					String line = removeSpaces(strLine);
					
					if(!line.startsWith("#")) {
						if(line.startsWith(parameter)) {
							parameterValue = line.substring(parameter.length() + 1);
							found = true;
							System.out.println("Found value " + parameterValue + " for " + parameter + ".");
						}
					}										
				}
				if(!found) {
					throw new LoadConfigurationException("Configuration parameter " + parameter + " not found.");
				}
				//Close the input stream
				in.close();
				return parameterValue;
		} else
			throw new LoadConfigurationException("Void configuration parameter.");
	}
	
	//This method loads the client configuration reading parameters values from the configuration file
	public static void loadConfiguration(FDClient fd, String configurationFilePath) throws LoadConfigurationException, FileNotFoundException, IOException {
		if(fd != null) {
			
				try {
					String oclServerUri = getConfigurationParameter(configurationFilePath, FDSERVER_URI_PARAMETER);
					fd.setOclServerUri(oclServerUri);
				} catch (LoadConfigurationException e) {
					fd.setOclServerUri(DEFAULT_FDSERVER_URI);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_FDSERVER_URI + ".");
					System.out.println(e.getMessage());
				}
			
				try {
					String ecoreModelDir = getConfigurationParameter(configurationFilePath, ECORE_MODEL_DIR_PARAMETER);
					fd.setEcoreModelDir(ecoreModelDir);
				} catch (LoadConfigurationException e) {
					fd.setEcoreModelDir(DEFAULT_ECORE_MODEL_DIR);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_ECORE_MODEL_DIR + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String ecoreModelFileName = getConfigurationParameter(configurationFilePath, ECORE_MODEL_FILENAME_PARAMETER);
					if(ecoreModelFileName.endsWith(".mancoosimm"))
						fd.setEcoreModelFileName(ecoreModelFileName);
					else
						throw new LoadConfigurationException("");
				} catch (LoadConfigurationException e) {
					fd.setEcoreModelFileName(DEFAULT_ECORE_MODEL_FILENAME);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_ECORE_MODEL_FILENAME + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String jarsDir = getConfigurationParameter(configurationFilePath, JARS_DIR_PARAMETER);
					fd.setJarsDir(jarsDir);
				} catch (LoadConfigurationException e) {
					fd.setJarsDir(DEFAULT_JARS_DIR);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_JARS_DIR + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String jarsListFileName = getConfigurationParameter(configurationFilePath, JARS_LIST_FILENAME_PARAMETER);
					fd.setJarsListFileName(jarsListFileName);
				} catch (LoadConfigurationException e) {
					fd.setJarsListFileName(DEFAULT_JARS_LIST_FILENAME);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_JARS_LIST_FILENAME + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String tmpDir = getConfigurationParameter(configurationFilePath, TMP_DIR_PARAMETER);
					fd.setTmpDir(tmpDir);
				} catch (LoadConfigurationException e) {
					fd.setTmpDir(DEFAULT_TMP_DIR);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_TMP_DIR + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String oclQueriesDir = getConfigurationParameter(configurationFilePath, OCLQUERIES_DIR_PARAMETER);
					fd.setOclQueriesDir(oclQueriesDir);
				} catch (LoadConfigurationException e) {
					fd.setOclQueriesDir(DEFAULT_OCLQUERIES_DIR);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_OCLQUERIES_DIR + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String oclQueriesFileName = getConfigurationParameter(configurationFilePath, OCLQUERIES_FILENAME_PARAMETER);
					fd.setOclQueriesFileName(oclQueriesFileName);
				} catch (LoadConfigurationException e) {
					fd.setOclQueriesFileName(DEFAULT_OCLQUERIES_FILENAME);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_OCLQUERIES_FILENAME + ".");
					System.out.println(e.getMessage());
				}
			
		} else {
			throw new LoadConfigurationException("Invalid FailureDetector instance.");
		}
	}
	
	//This method removes blank spaces from the input String removeFrom
	private static String removeSpaces(String removeFrom) {
		if(removeFrom != null) {
			String res = "";
			for(int i = 0; i < removeFrom.length(); i++) {
				if(removeFrom.charAt(i) != ' ') {
					res = res + removeFrom.charAt(i);
				}
			}
			return res;
		}
		return null;
	}	
}
