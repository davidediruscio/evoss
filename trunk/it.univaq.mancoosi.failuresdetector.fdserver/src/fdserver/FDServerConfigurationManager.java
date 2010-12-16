package fdserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import failuresdetector.exceptions.LoadConfigurationException;

//This class manages server configuration
public class FDServerConfigurationManager {

	//default values for configuration parameters
	private static final String DB_DRIVER_NAME_PARAMETER = "dbDriverName";
	private static final String DB_URI_PARAMETER = "dbUri";
	private static final String DB_USER_PARAMETER = "dbUser";
	private static final String DB_PASSWORD_PARAMETER = "dbPassword";
	private static final String JARS_DIR_PARAMETER = "jarsDir";
	private static final String JARS_LIST_FILENAME_PARAMETER = "jarsListFile";
	private static final String TMP_DIR_PARAMETER = "tmpDir";
	private static final String OCLQUERIES_FILENAME_PARAMETER = "oclQueriesFileName";
	
	//default values for configuration parameters
	public static final String DEFAULT_DB_DRIVER_NAME = "com.mysql.jdbc.Driver";
	public static final String DEFAULT_DB_URI = "jdbc:mysql://localhost/failuresdetector";
	public static final String DEFAULT_DB_USER = "root";
	public static final String DEFAULT_DB_PASSWORD = "";
	public static final String DEFAULT_JARS_DIR = "jars";
	public static final String DEFAULT_JARS_LIST_FILENAME = "jarsList.txt";
	public static final String DEFAULT_TMP_DIR = "tmp";
	public static final String DEFAULT_OCL_QUERIES_FILENAME = "queries.ocl";
	
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
	
	//This method loads the server configuration reading parameters values from the configuration file
	public static void loadConfiguration(FDServer qes, String configurationFilePath) throws LoadConfigurationException, FileNotFoundException, IOException {
		if(qes != null) {
			
				try {
					String dbDriverName = getConfigurationParameter(configurationFilePath, DB_DRIVER_NAME_PARAMETER);
					qes.setDbDriverName(dbDriverName);
				} catch (LoadConfigurationException e) {
					qes.setDbDriverName(DEFAULT_DB_DRIVER_NAME);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_DB_DRIVER_NAME + ".");
					System.out.println(e.getMessage());
				}
			
				try {
					String dbUri = getConfigurationParameter(configurationFilePath, DB_URI_PARAMETER);
					qes.setDbUri(dbUri);
				} catch (LoadConfigurationException e) {
					qes.setDbUri(DEFAULT_DB_URI);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_DB_URI + ".");
					System.out.println(e.getMessage());
				}
			
				try {
					String dbUser = getConfigurationParameter(configurationFilePath, DB_USER_PARAMETER);
					qes.setDbUser(dbUser);
				} catch (LoadConfigurationException e) {
					qes.setDbUser(DEFAULT_DB_USER);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_DB_USER + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String dbPassword = getConfigurationParameter(configurationFilePath, DB_PASSWORD_PARAMETER);
					qes.setDbPassword(dbPassword);
				} catch (LoadConfigurationException e) {
					qes.setDbPassword(DEFAULT_DB_PASSWORD);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_DB_PASSWORD + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String jarsDir = getConfigurationParameter(configurationFilePath, JARS_DIR_PARAMETER);
					qes.setJarsDir(jarsDir);
				} catch (LoadConfigurationException e) {
					qes.setJarsDir(DEFAULT_JARS_DIR);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_JARS_DIR + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String jarsListFileName = getConfigurationParameter(configurationFilePath, JARS_LIST_FILENAME_PARAMETER);
					qes.setJarsListFileName(jarsListFileName);
				} catch (LoadConfigurationException e) {
					qes.setJarsListFileName(DEFAULT_JARS_LIST_FILENAME);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_JARS_LIST_FILENAME + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String tmpDir = getConfigurationParameter(configurationFilePath, TMP_DIR_PARAMETER);
					qes.setTmpDir(tmpDir);
				} catch (LoadConfigurationException e) {
					qes.setTmpDir(DEFAULT_TMP_DIR);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_TMP_DIR + ".");
					System.out.println(e.getMessage());
				}
				
				try {
					String oclQueriesFileName = getConfigurationParameter(configurationFilePath, OCLQUERIES_FILENAME_PARAMETER);
					qes.setOclQueriesFileName(oclQueriesFileName);
				} catch (LoadConfigurationException e) {
					qes.setOclQueriesFileName(DEFAULT_OCL_QUERIES_FILENAME);
					e.setMessage(e.getMessage() + " It will have the default value " + DEFAULT_OCL_QUERIES_FILENAME + ".");
					System.out.println(e.getMessage());
				}
			
		} else {
			throw new LoadConfigurationException("Invalid OCL Queries Executor Server instance.");
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
