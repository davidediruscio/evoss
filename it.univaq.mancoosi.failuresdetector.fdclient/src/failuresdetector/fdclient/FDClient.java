package failuresdetector.fdclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import failuresdetector.FileReceiverManager;
import failuresdetector.FileSenderManager;
import failuresdetector.JarExecutor;
import failuresdetector.QueryExecutor;
import failuresdetector.exceptions.InvalidFDClientOptionException;
import failuresdetector.exceptions.LoadConfigurationException;


public class FDClient {
	private static final FDClient INSTANCE = new FDClient();
	
	private FDClientOptionsManager optionsManager = new FDClientOptionsManager();
	
	private String oclServerUri;
	private String ecoreModelDir;
	private String ecoreModelFileName;
	private String jarsDir;
	private String jarsListFileName;
	private String tmpDir;
	private String oclQueriesDir;
	private String oclQueriesFileName;
	
	Socket socket = null;
	   
    // Private constructor prevents instantiation from other classes
	private FDClient() {
		 
	}
	
	public static FDClient getInstance() {
		return INSTANCE;
	}
	
	public FDClientOptionsManager getOptionsManager() {
		return this.optionsManager;
	}
	
	public String getOclServerUri() {
		return oclServerUri;
	}
	
	public void setOclServerUri(String oclServerUri) {
		this.oclServerUri = oclServerUri;
	}
	
	public String getEcoreModelDir() {
		return ecoreModelDir;
	}
	
	public void setEcoreModelDir(String ecoreModelDir) {
		this.ecoreModelDir = ecoreModelDir;
	}
	
	public String getEcoreModelFileName() {
		return ecoreModelFileName;
	}
	
	public void setEcoreModelFileName(String ecoreModelFileName) {
		this.ecoreModelFileName = ecoreModelFileName;
	}
	
	public String getJarsDir() {
		return jarsDir;
	}
	
	public void setJarsDir(String jarsDir) {
		this.jarsDir = jarsDir;
	}
	
	public String getJarsListFileName() {
		return jarsListFileName;
	}
	
	public void setJarsListFileName(String jarsListFileName) {
		this.jarsListFileName = jarsListFileName;
	}	
	
	public String getTmpDir() {
		return tmpDir;
	}
	
	public void setTmpDir(String tmpDir) {
		this.tmpDir = tmpDir;
	}
	
	public String getOclQueriesDir() {
		return this.oclQueriesDir;
	}
	
	public void setOclQueriesDir(String oclQueriesDir) {
		this.oclQueriesDir = oclQueriesDir;
	}
	
	public String getOclQueriesFileName() {
		return oclQueriesFileName;
	}
	
	public void setOclQueriesFileName(String oclQueriesFileName) {
		this.oclQueriesFileName = oclQueriesFileName;
	}
	
	public Socket getSocket() {
		return this.socket;
	}
	
	//This method loads client configuration defined in the configuration file
	private static void loadConfiguration() throws FileNotFoundException, LoadConfigurationException, IOException {
		FDClientConfigurationManager.loadConfiguration(getInstance(), FDClientConfigurationManager.CONFIG_FILE_PATH);
	}
	
    //This method is used for connecting to the server
	private boolean connectToServer() {
		try {
            socket = new Socket(oclServerUri, FDClientConfigurationManager.DEFAULT_PORT);
            System.out.println("Connection with the OCL server estabilished.");
            return true;
        } catch (UnknownHostException e) {
            System.out.println("Could not determine the OCL Server IP address.");
        	return false;
        } catch (IOException e) {
        	System.out.println("Error occurred when trying to create the connection socket.");
        	return false;
        }
	}
	
	//This method checks if the client is connected to the server
	private boolean isConnectedToServer() {
		if(socket != null && socket.isConnected())
			return true;
		else
			return false;
	}
	
	//Given the path of a .ocl file, this method returns all the queries contained in it
	public String[] getQueriesFromFile(String oclFilePath) throws IOException {
		File queriesFile = new File(oclFilePath);
		String[] queries = null;
		if(queriesFile.exists()) {
  	  		FileInputStream fstream = new FileInputStream(queriesFile);
  	  		DataInputStream in = new DataInputStream(fstream);
  	  		BufferedReader br = new BufferedReader(new InputStreamReader(in));
  	  		String strLine;
  	  		while ((strLine = br.readLine()) != null) {
  	  			queries = addToArray(queries, strLine);
  	  		}
  	  		in.close();
  	  	} else {
  	  		System.out.println("The queries file " + oclFilePath + " doesn't exists.");
  	  	}
		return queries;
	}
	
	//This method updates client's known queries, receiving the server's queries file
	private void updateQueries(Socket connectionSocket) throws IOException {
		ServerSocket appSs = new ServerSocket(FDClientConfigurationManager.FILE_PORT);
		Socket appConnectionSocket = appSs.accept();
		System.out.println("Updating OCL queries...");
		new FileReceiverManager(appConnectionSocket, getOclQueriesDir(), getOclQueriesFileName()).run();
		appConnectionSocket.close();
		appSs.close();
		System.out.println("OCL queries updated!");
	}
	
	//This method updates client's jar files list, receiving the server's jars list file 
	//and differencing the two lists for retrieving missing jar files
	private void updateJars(Socket connectionSocket) throws IOException {
		ServerSocket appSs = new ServerSocket(FDClientConfigurationManager.FILE_PORT);
		Socket appConnectionSocket = appSs.accept();
		System.out.println("Updating jar files...");
		System.out.println("Retrieving server jar files list...");
		new FileReceiverManager(appConnectionSocket, getTmpDir(), getJarsListFileName()).run();
		appConnectionSocket.close();
		appSs.close();
		System.out.println("Server jar files list retrieved!");
		System.out.println("Checking missing jars...");
		String[] serverJarsList = getJarsList(getTmpDir() + "/" + getJarsListFileName());
		String[] clientJarsList = getJarsList(getJarsDir() + "/" + getJarsListFileName());
		if(serverJarsList != null && clientJarsList != null) {
			//deletes jars on the client filesystem that aren't present on server's one
			String[] difference = compareJarsLists(serverJarsList, clientJarsList);
			if(difference != null && difference.length > 0) {
				System.out.println(difference.length + " obsolete jar(s) to delete:");
				for(int i = 0; i < difference.length; i++) {
					if(new File(getJarsDir() + "/" + difference[i]).exists()) {
						deleteFile(getJarsDir() + "/" + difference[i]);
						System.out.println("Obsolete jar " + difference[i] + " deleted.");
					}
					System.out.println("All obsolete jars deleted.");
				}
			} else {
				System.out.println("No obsolete jars to delete.");
			}
			//checks if there are some jars to download and if there are, it downloads them
			difference = compareJarsLists(clientJarsList, serverJarsList);
			DataOutputStream outToServer = new DataOutputStream(connectionSocket.getOutputStream());
			BufferedReader inFromServer = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			if(difference != null && difference.length > 0) {
				System.out.println(difference.length + " jar(s) to download:");
				outToServer.writeBytes("GET_JARS\n");
				if(inFromServer.readLine().equals("GET_JARS_ACK")) {
					downloadJars(connectionSocket, difference);
				} else {
					System.out.println("Error occurred when trying to download missing jars.");
				}
			} else {
				System.out.println("Jar files list is already updated.");
				outToServer.writeBytes("NO_JARS\n");
			}
		} else {
			System.out.println("Error occurred when trying to update jars list.");
		}
		deleteFile(getTmpDir() + "/" + getJarsListFileName());
		System.out.println("Jar files updating process complete!");
	}

	//Given the path of a .txt file, this method returns all the jar files names contained in it
	private String[] getJarsList(String jarsListFilePath) {
		String[] jarsList = new String[0];
		try {
			File jarsFile = new File(jarsListFilePath);
  	  		if(jarsFile.exists()) {
  	  			FileInputStream fstream = new FileInputStream(jarsFile);
  	  			DataInputStream in = new DataInputStream(fstream);
  	  			BufferedReader br = new BufferedReader(new InputStreamReader(in));
  	  			String strLine;
  	  			while ((strLine = br.readLine()) != null) {
  	  				jarsList = addToArray(jarsList, strLine);
  	  			}
  	  			in.close();
  	  		} else {
  	  			System.out.println("The jars file list " + jarsListFilePath + " doesn't exists.");
  	  		}
		} catch(NullPointerException e) {
  	  		System.out.println("The jars file list " + jarsListFilePath + " doesn't exists.");
  	  	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
  	  		System.out.println("The jars file list " + jarsListFilePath + " doesn't exists.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read from file " + jarsListFilePath + ". Please, check file permission.");
		}
		return jarsList;
	}
	
	//Given two jar files lists, this method compares them and collects the set of jar files that are 
	//in the second list and not in the first one
	private String[] compareJarsLists(String[] clientJarsList, String[] serverJarsList) {
		String[] diff = null;
		if(serverJarsList != null)
			for(int i = 0; i < serverJarsList.length; i++) {
				if(!findJar(clientJarsList, serverJarsList[i]))
					diff = addToArray(diff, serverJarsList[i]);
			}
		return diff;
	}
	
	//This method returns true if the jar named jarName is contained in the jar files list jarsList, false otherwise
	private boolean findJar(String[] jarsList, String jarName) {
		int i = 0;
		boolean found = false;
		while(i < jarsList.length && !found) {
			if(jarsList[i].equals(jarName))
				found = true;
			i++;
		}
		return found;
	}	
	
	//This method deletes from the local jars list all the jars that are not present on the client filesystem and 
	//also deletes from the client's filesystem all the jars that are not present in the local jars list
	public boolean checkJarsConsistency() {
		File jarFilesList = new File(getJarsDir() + "/" + getJarsListFileName());
		try {
			//deletes from the local jars list all the jars that are not present on the client filesystem
			if(jarFilesList.exists()) {
				FileInputStream fstream = new FileInputStream(jarFilesList);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String[] obsoleteJars = null;
				String strLine;
				//Read File Line By Line
				while((strLine = br.readLine()) != null) {
					if(strLine.endsWith(".jar")) {
						File correspJar = new File(getJarsDir() + "/" + strLine);
						if(!correspJar.exists()) {
							obsoleteJars = addToArray(obsoleteJars, strLine);
						}
					}
				}
				in.close();
				fstream.close();
				if(obsoleteJars != null && obsoleteJars.length > 0) {
					for(int i = 0; i < obsoleteJars.length; i++) {
						deleteLineFromFile(jarFilesList, obsoleteJars[i]);
					}
				}
			}
			
			File jarsDir = new File(getJarsDir());
			if(jarsDir.exists() && jarsDir.isDirectory()) {
				String[] jars = jarsDir.list(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.endsWith(".jar"); 
					}
				});
				String[] jarsToDelete = compareJarsLists(getJarsList(getJarsDir() + "/" + getJarsListFileName()), jars);
				if(jarsToDelete != null && jarsToDelete.length > 0) {
					for(int i = 0; i < jarsToDelete.length; i++) {
						deleteFile(getJarsDir() + "/" + jarsToDelete[i]);
					}
				}
			}
			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Error occurred when checking consistency between jars list file and jars on the " + getJarsDir() + " directory. File not found.");
			return false;
		} catch (IOException e) {
			System.out.println("Error occurred when checking consistency between jars list file and jars on the " + getJarsDir() + " directory.");
			return false;
		}
	}
	
	//This method is used for downloading missing jar files. 
	//More in general, it tries to download all the files listed in the jarsToDownload input parameter 
	private void downloadJars(Socket connSocket, String[] jarsToDownload) throws IOException {
		System.out.println("Downloading missing jars...");
		Socket connectionSocket = new Socket(getOclServerUri(), FDClientConfigurationManager.CONTROL_PORT);
		System.out.println("Connection over port " +  FDClientConfigurationManager.CONTROL_PORT + " estabilished...");
		DataOutputStream outToServer = new DataOutputStream(connectionSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		if(jarsToDownload != null && jarsToDownload.length > 0) {
			outToServer.writeBytes("GET_JARS\n");
			if(inFromServer.readLine().equals("GET_JARS_ACK")) {
				ServerSocket appSs = new ServerSocket(FDClientConfigurationManager.FILE_PORT);
				for(int i = 0; i < jarsToDownload.length; i++) {
					System.out.println("Downloading " + jarsToDownload[i] + "...");
					outToServer.writeBytes(jarsToDownload[i] + "\n");
					if(inFromServer.readLine().equals("SENDING_JAR")) {
	        	    	Socket appConnectionSocket = appSs.accept();
						new FileReceiverManager(appConnectionSocket, getJarsDir(), jarsToDownload[i]).run();
						appConnectionSocket.close();
						outToServer.writeBytes(jarsToDownload[i] + "_ACK\n");
						appendToFile(new File(getJarsDir() + "/" + getJarsListFileName()), jarsToDownload[i]);
						System.out.println("" + jarsToDownload[i] + " downloaded.");
					} else {
						System.out.println("Error downloading requested jar " + jarsToDownload[i]);
					}
				}
				outToServer.writeBytes("GET_JARS_END\n");
				if(inFromServer.readLine().equals("GET_JARS_END_ACK")) {
					appSs.close();
					outToServer.close();
					inFromServer.close();
				}
				System.out.println("Download of missing jars complete!");
			} else {
				System.out.println("Could not download missing jars.");
			}
		} else {
			outToServer.writeBytes("NO_JARS\n");
			System.out.println("Jars list is already updated.");
		}
	}
	
	//This method implements a remote OCL queries execution procedure in which the client itself  
	//asks to the server the execution of some specific OCL queries
	private void remoteQueriesExecution(Socket connSocket, String[] queriesToExecute) throws IOException {
		System.out.println("Estabilishing connection over port " + FDClientConfigurationManager.CONTROL_PORT + " for executing queries...");
		Socket connectionSocket = new Socket(getOclServerUri(), FDClientConfigurationManager.CONTROL_PORT);
		System.out.println("Connection over port " + FDClientConfigurationManager.CONTROL_PORT + " estabilished...");
		DataOutputStream outToServer = new DataOutputStream(connectionSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		outToServer.writeBytes("EXEC_QUERIES\n");
		if(inFromServer.readLine().equals("EXEC_QUERIES_ACK")) {
			outToServer.writeBytes("MANCOOSI_MODEL\n");
			if(inFromServer.readLine().equals("SEND_ECORE_FILENAME")) {
				outToServer.writeBytes(getEcoreModelFileName() + "\n");
				if(inFromServer.readLine().equals("SEND_ECORE_FILENAME_ACK")) {
					Socket appConnectionSocket = new Socket(getOclServerUri(), FDClientConfigurationManager.FILE_PORT);
					System.out.println("Estabilishing connection over port " + FDClientConfigurationManager.FILE_PORT + " for sending mancoosi ecore model...");
					new FileSenderManager(appConnectionSocket, getEcoreModelDir(), getEcoreModelFileName()).run();
					appConnectionSocket.close();
					if(inFromServer.readLine().equals("MANCOOSI_MODEL_ACK")) {
						
						for(int i = 0; i < queriesToExecute.length; i++) {
							System.out.println("\nExecuting " + queriesToExecute[i]);
				
							outToServer.writeBytes(queriesToExecute[i] + "\n");
							if(inFromServer.readLine().equals("EXECUTING_QUERY")) {
								outToServer.writeBytes("WAITING_RESULT\n");
								String queryRes = inFromServer.readLine(); 
								System.out.println("Query result: " + queryRes);
								System.out.println(queriesToExecute[i] + " executed.");
								outToServer.writeBytes("WAITING_FAILURE\n");
								String strLine = inFromServer.readLine();
								if(strLine.equals("FAILURE")) {
									System.out.println("Failure detected for the query " + queriesToExecute[i] + "!");
									outToServer.writeBytes("WAITING_SOLUTIONS\n");
									System.out.println("Possible solutions:");
									strLine = inFromServer.readLine();
									if(strLine.equals("SOLUTIONS")) {
										strLine = inFromServer.readLine();
										while(!strLine.equals("SOLUTIONS_END")) {
											System.out.println("- " + strLine);
											outToServer.writeBytes("SOLUTION_ACK\n");
											strLine = inFromServer.readLine();
										}
									} else {
										if(strLine.equals("NO_SOLUTIONS")) {
											System.out.println("No solutions for the failure of the query " + queriesToExecute[i] + ".");
										} else {
											System.out.println("Protocol error! Server seems to be disconnected.");
										}
									}
								}
							} else {
								System.out.println("Error executing query " + queriesToExecute[i]);
							}
						}
						outToServer.writeBytes("EXEC_QUERIES_END\n");
						if(inFromServer.readLine().equals("EXEC_QUERIES_END_ACK")) {
							outToServer.close();
							inFromServer.close();
							//connectionSocket.close();
						}
					} else {
						System.out.println("\nInvalid mancoosi model file!");
					}
					System.out.println("\nRemote OCL Queries execution complete!");
				} else {
					System.out.println("\nCould not remotely execute queries. Invalid ecore filename!");
				}
			} else {
				System.out.println("\nCould not remotely execute queries.");
			}
		} else {
			System.out.println("\nCould not remotely execute queries.");
		}
		
	}
	
	//This method implements a remote OCL queries execution procedure in which the client itself  
	//asks to the server the execution of all the OCL queries in the database
	private void remoteQueriesInDbExecution(Socket connSocket) throws IOException {
		System.out.println("Estabilishing connection over port " + FDClientConfigurationManager.CONTROL_PORT + " for executing queries...");
		Socket connectionSocket = new Socket(getOclServerUri(), FDClientConfigurationManager.CONTROL_PORT);
		System.out.println("Connection over port " + FDClientConfigurationManager.CONTROL_PORT + " estabilished...");
		DataOutputStream outToServer = new DataOutputStream(connectionSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		outToServer.writeBytes("EXEC_QUERIES\n");
		if(inFromServer.readLine().equals("EXEC_QUERIES_ACK")) {
			outToServer.writeBytes("MANCOOSI_MODEL\n");
			if(inFromServer.readLine().equals("SEND_ECORE_FILENAME")) {
				outToServer.writeBytes(getEcoreModelFileName() + "\n");
				if(inFromServer.readLine().equals("SEND_ECORE_FILENAME_ACK")) {
					Socket appConnectionSocket = new Socket(getOclServerUri(), FDClientConfigurationManager.FILE_PORT);
					System.out.println("Estabilishing connection over port " + FDClientConfigurationManager.FILE_PORT + " for sending mancoosi ecore model...");
					new FileSenderManager(appConnectionSocket, getEcoreModelDir(), getEcoreModelFileName()).run();///////////////
					appConnectionSocket.close();
					if(inFromServer.readLine().equals("MANCOOSI_MODEL_ACK")) {
						boolean execFinished = false;
	    				String strLine = null;
	    				while(!execFinished) {
	    					strLine = inFromServer.readLine();
	    					if(!strLine.equals("EXEC_QUERIES_END")) {
	    						if(strLine.equals("EXECUTING_QUERY")) {
	    							outToServer.writeBytes("EXECUTING_QUERY_ACK\n");
	    							String actualQuery = inFromServer.readLine();
	    							System.out.println("\nServer is executing the following OCL query: " + actualQuery);
	    							outToServer.writeBytes("WAITING_RESULT\n");
	    							String queryRes = inFromServer.readLine(); 
	    							System.out.println("Query result: " + queryRes);
									System.out.println(actualQuery + " executed.");
									outToServer.writeBytes("WAITING_FAILURE\n");
									strLine = inFromServer.readLine();
									if(strLine.equals("FAILURE")) {
										System.out.println("Failure detected for the query " + actualQuery + "!");
										outToServer.writeBytes("WAITING_SOLUTIONS\n");
										System.out.println("Possible solutions:");
										strLine = inFromServer.readLine();
										if(strLine.equals("SOLUTIONS")) {
											strLine = inFromServer.readLine();
											while(!strLine.equals("SOLUTIONS_END")) {
												System.out.println("- " + strLine);
												outToServer.writeBytes("SOLUTION_ACK\n");
												strLine = inFromServer.readLine();
											}
										} else {
											if(strLine.equals("NO_SOLUTIONS")) {
												System.out.println("No solutions for the failure of the query " + actualQuery + ".");
											} else {
												System.out.println("Protocol error! Server seems to be disconnected.");
											}
										}
									} else {
										if(strLine.equals("NO_FAILURE")) {
											System.out.println("No failures detected for the query " + actualQuery + ".");
										} else {
											System.out.println("Protocol error! Server seems to be disconnected.");
										}
									}
	    						} else {
	    							System.out.println("Protocol error! Server seems to be disconnected.");
	    						}
	    					} else {
	    						if(strLine.equals("EXEC_QUERIES_END")) {
	    							execFinished = true;
	    						}
	    					}
	    				}
	    				outToServer.writeBytes("EXEC_QUERIES_END_ACK");
	    				inFromServer.close();
	    				outToServer.close();
					} else {
						System.out.println("Invalid mancoosi model file!");
					}
				} else {
					System.out.println("\nCould not remotely execute queries. Invalid ecore filename!");
				}
			} else {
				System.out.println("\nCould not remotely execute queries.");
			}
		} else {
			System.out.println("\nCould not remotely execute queries.");
		}
		
	}
	
	//This method writes the String str on to the File file
	public static void writeToFile(File file, String str) throws IOException {
 		FileWriter fw = new FileWriter(file, false);
 		if (file.exists()) {
 			fw.write(str + "\n");
 			fw.flush();
 		} else {
 			file.createNewFile();
 			fw.write(str + "\n");
 			fw.flush();
 		}
 		fw.close();
	}
 
	//This method appends the String str to the and of the File file
	public static void appendToFile(File file, String str) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		if (file.exists()) {
			fw.append(str + "\n");
			fw.flush();
		} else {
			file.createNewFile();
			fw.append(str + "\n");
			fw.flush();
		}
		fw.close();
	}
	
	//This method deletes the line lineToRemove from the File file
	public static void deleteLineFromFile(File inFile, String lineToRemove) throws IOException, FileNotFoundException {
		if (!inFile.exists()) {
			throw new FileNotFoundException();
		}
		       
		//Construct the new file that will later be renamed to the original filename. 
		File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
		      
		BufferedReader br = new BufferedReader(new FileReader(inFile));
		PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
		String line = null;

		//Read from the original file and write to the new 
		//unless content matches data to be removed.
		while ((line = br.readLine()) != null) {
			if (!line.trim().equals(lineToRemove)) {
				pw.println(line);
				pw.flush();
			}
		}
		pw.close();
		br.close();
		      
		//Delete the original file
		if (!inFile.delete()) {
			throw new IOException();
		} 
		      	
		//Rename the new file to the filename the original file had.
		if (!tempFile.renameTo(inFile))
			throw new IOException();
	}
	
	//This method deletes from the filesystem the file having path filePath
	public static boolean deleteFile(String filePath) {
    	File file = new File(filePath);
    	if(file.exists() && !file.isDirectory()) {
    		if(file.delete())
    			return true;
    		else
    			return false;
    	} else
    		throw new IllegalArgumentException("Error occurred when deleting the file " + filePath);
    }
	
	//Given a String[] strings and a String stringToAdd, this method returns a new String[] that is 
	//the copy of strings at which stringToAdd is appended
	public String[] addToArray(String[] strings, String stringToAdd) {
		if(strings == null || strings.length == 0)
			return new String[] {stringToAdd};
		String[] res = new String[strings.length + 1];
		for(int i = 0; i < strings.length; i++) {
			res[i] = strings[i];
		}
		res[res.length - 1] = stringToAdd;
		return res;
	}
	
	//Given the args array, this method retrieves the OCL queries given in input explicitly or 
	//specifying the path of the .ocl file in which they are contained
	private String[] getQueriesFromCmdLine(String[] args) throws InvalidFDClientOptionException, IOException {
		String[] queries = null;
		if(args != null && args.length > 1) {
			int scenario = FDClientOptionsManager.getScenario(args);
			if(scenario == FDClientOptionsManager.LOCAL_QUERIES_EXECUTION_SCENARIO ||
				scenario == FDClientOptionsManager.REMOTE_QUERIES_EXECUTION_SCENARIO) {
				if(args[1].endsWith(".ocl")) {
					queries = getQueriesFromFile(getOclQueriesDir() + "/" + args[1]);
				} else {
					for(int i = 1; i < args.length; i++) {
						queries = addToArray(queries, args[i]);
					}
				}
			}
		} else
			throw new InvalidFDClientOptionException(null);
		
		return queries;
	}
	
	//Given the args array, this method retrieves the jar files list given in input explicitly or 
	//specifying the path of the .txt file in which they are contained
	private String[] getJarsFromCmdLine(String[] args) throws InvalidFDClientOptionException, IOException {
		String[] jars = null;
		if(args != null && args.length > 1) {
			int scenario = FDClientOptionsManager.getScenario(args);
			if(scenario == FDClientOptionsManager.LOCAL_JARS_EXECUTION_SCENARIO) {
				if(args[1].endsWith(".txt")) {
					jars = getJarsList(getJarsDir() + "/" + args[1]);
				} else {
					for(int i = 1; i < args.length; i++) {
						jars = addToArray(jars, args[i]);
					}
				}
			}
		} else
			throw new InvalidFDClientOptionException(null);
		
		return jars;
	}
	
	//This method is used for synchronizing the client with the server, communicating to this last the scenario to execute
	private boolean sendScenarioToServer(Socket connectionSocket, int scenario) throws IOException {
		DataOutputStream outToServer = new DataOutputStream(connectionSocket.getOutputStream());
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
		outToServer.writeBytes(String.valueOf(scenario) + "\n");
		if(inFromServer.readLine().equals("GET_SCENARIO_ACK")) {
			return true;
		} else
			return false;
    }
	
	//This method detects if the executed OCL query result given in input produced a failure.
	private static boolean detectFailure(String queryResult) {
		if(queryResult.equals("[false]"))
			return true;
		return false;
	}
	
	//This method is used for disconnecting the client from the server
	private void disconnectFromServer(Socket connectionSocket) throws IOException {
		System.out.println("\nDisconnected from the server " + connectionSocket.getInetAddress() + ".");
		if(!connectionSocket.isClosed())
			connectionSocket.close();
	}
	
	public static void main(String[] args) {
		String pathSep = File.separator;
		FDClient fd = FDClient.getInstance();
		try {
			System.out.println("Loading configuration...");
    		loadConfiguration();
    		System.out.println("Configuration loaded!");
			if(fd.checkJarsConsistency()) {
				System.out.println("Consistency checked.");
			} else {
				System.out.println("Error occurred when checking consistency.");
			}
			
			int scenario = FDClientOptionsManager.getScenario(args);
			
			switch(scenario) {
				case FDClientOptionsManager.LOCAL_SCENARIO:
					System.out.println("\nLOCAL SCENARIO");
					if(!fd.isConnectedToServer()) {
						if(fd.connectToServer()) {
							if(fd.sendScenarioToServer(fd.getSocket(), FDClientOptionsManager.UPDATEONLY_SCENARIO)) {
								System.out.println("\nUPDATE PROCESS");
								fd.updateQueries(fd.getSocket());
								fd.updateJars(fd.getSocket());
							} else {
								System.out.println("Error occurred when trying to communicate with server. Queries and jars will not be updated and the execution " +
										"will follow with not updated local copies of queries and jars list file.");
							}
							
							//local queries execution
							System.out.println("\nOCL QUERIES LOCAL EXECUTION PROCESS");
							String[] localQueriesLS = fd.getQueriesFromFile(fd.getOclQueriesDir() + pathSep + fd.getOclQueriesFileName());
							if(localQueriesLS != null) {
								System.out.println(localQueriesLS.length + " queries will be executed.");
								Object[] results = QueryExecutor.executeQueries(fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName(), localQueriesLS);
								System.out.println("\nFAILURES DETECTION");
								for(int i = 0; i < results.length; i++) {
									if(detectFailure(results[i].toString())) {
										System.out.println("Failure detected for the query " + localQueriesLS[i] + "!");
									} else {
										System.out.println("No failures detected for the query " + localQueriesLS[i] + ".");
									}
								}
								
							} else
								System.out.println("No queries to execute.");
						}
					} else {
						System.out.println("Could not estabilish a connection with the OCL server. Please, check configuration file and correct mistakes.");
					}
					if(fd.getSocket() != null) {
						fd.disconnectFromServer(fd.getSocket());
					}
					
					//local jars execution
					System.out.println("\nJAR FILES EXECUTION PROCESS");
					String[] jarsToExecLS = fd.getJarsList(fd.getJarsDir() + pathSep + fd.getJarsListFileName());
					for(int i = 0; i < jarsToExecLS.length; i++) {
						jarsToExecLS[i] = fd.getJarsDir() + pathSep + jarsToExecLS[i];
					}
					JarExecutor.executeJars(jarsToExecLS, fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName());
					break;
				case FDClientOptionsManager.REMOTE_SCENARIO:
					System.out.println("\nREMOTE SCENARIO");
					//if(fd.connectToServer()) {
					if(!fd.isConnectedToServer()) {
						if(fd.connectToServer()) {
							if(fd.sendScenarioToServer(fd.getSocket(), scenario)) {						
								fd.updateQueries(fd.getSocket());
								fd.updateJars(fd.getSocket());
								//remote queries execution
								System.out.println("\nREMOTE OCL QUERIES EXECUTION PROCESS");
								if(new File(fd.getOclQueriesDir() + "/" + fd.getOclQueriesFileName()).exists() &&
										fd.getQueriesFromFile(fd.getOclQueriesDir() + "/" + fd.getOclQueriesFileName()) != null) {
									fd.remoteQueriesInDbExecution(fd.getSocket());
								} else {
									System.out.println("No OCL queries stored on the file system.");
								}
							} else {
								System.out.println("Error occurred when trying to communicate with server. Queries and jars will not be updated." +
										"So, local copies of queries and jars list file will not be updated and the remote queries execution is not possible for communication problems, " +
										"but the local jar files execution will proceed with not updated jars list file.");
							}
						} else {
							System.out.println("Could not estabilish a connection with the OCL server. Please, check configuration file and correct mistakes.");
						}
					}
					if(fd.getSocket() != null) {
						fd.disconnectFromServer(fd.getSocket());
					}
					
					//local jars execution
					System.out.println("\nJAR FILES EXECUTION PROCESS");
					String[] jarsToExecRS = fd.getJarsList(fd.getJarsDir() + "/" + fd.getJarsListFileName());
					for(int i = 0; i < jarsToExecRS.length; i++) {
						jarsToExecRS[i] = fd.getJarsDir() + "/" + jarsToExecRS[i];
					}
					JarExecutor.executeJars(jarsToExecRS, fd.getEcoreModelDir() + "/" + fd.getEcoreModelFileName());
					break;
				case FDClientOptionsManager.OFFLINE_SCENARIO:
					System.out.println("\nOFFLINE SCENARIO");
					//local queries execution
					System.out.println("\nLOCAL OCL QUERIES EXECUTION PROCESS");
					String[] localQueriesOS = fd.getQueriesFromFile(fd.getOclQueriesDir() + pathSep + fd.getOclQueriesFileName());
					if(localQueriesOS != null) {
						System.out.println(localQueriesOS.length + " queries will be executed.");
						Object[] results = QueryExecutor.executeQueries(fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName(), localQueriesOS);
						System.out.println("\nFAILURES DETECTION");
						for(int i = 0; i < results.length; i++) {
							if(detectFailure(results[i].toString())) {
								System.out.println("Failure detected for the query " + localQueriesOS[i] + "!");
							} else {
								System.out.println("No failures detected for the query " + localQueriesOS[i] + ".");
							}
						}
					} else
						System.out.println("No queries to execute.");
					
					//local jars execution
					System.out.println("\nJAR FILES EXECUTION PROCESS");
					String[] jarsToExecOS = fd.getJarsList(fd.getJarsDir() + pathSep + fd.getJarsListFileName());
					for(int i = 0; i < jarsToExecOS.length; i++) {
						jarsToExecOS[i] = fd.getJarsDir() + pathSep + jarsToExecOS[i];
					}
					JarExecutor.executeJars(jarsToExecOS, fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName());
					break;
				case FDClientOptionsManager.UPDATEONLY_SCENARIO:
					System.out.println("\nUPDATEONLY SCENARIO");
					if(!fd.isConnectedToServer()) {
						if(fd.connectToServer()) {
							if(fd.sendScenarioToServer(fd.getSocket(), scenario)) {
								fd.updateQueries(fd.getSocket());
								fd.updateJars(fd.getSocket());
							} else {
								System.out.println("Error occurred when trying to communicate with server. Queries and jars will not be updated.");
							}
						} else {
							System.out.println("Could not estabilish a connection with the OCL server. Please, check configuration file and correct mistakes.");
						}
					}
					if(fd.getSocket() != null) {
						fd.disconnectFromServer(fd.getSocket());
					}
					break;
				case FDClientOptionsManager.LOCAL_QUERIES_EXECUTION_SCENARIO:
					System.out.println("\nLOCAL OCL QUERIES EXECUTION SCENARIO");
					//local queries execution
					String[] localQueriesLQES = fd.getQueriesFromCmdLine(args);
					if(localQueriesLQES != null) {
						System.out.println(localQueriesLQES.length + " queries will be executed.");
						QueryExecutor.executeQueries(fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName(), localQueriesLQES);
					} else
						System.out.println("No queries to execute.");
					break;
				case FDClientOptionsManager.REMOTE_QUERIES_EXECUTION_SCENARIO:
					System.out.println("\nREMOTE OCL QUERIES EXECUTION SCENARIO");
					String[] localQueriesRQES = fd.getQueriesFromCmdLine(args);
					if(!fd.isConnectedToServer()) {
						if(fd.connectToServer()) {
							if(fd.sendScenarioToServer(fd.getSocket(), scenario)) {
								//remote queries execution
								if(localQueriesRQES != null) {
									fd.remoteQueriesExecution(fd.getSocket(), localQueriesRQES);
								} else {
									System.out.println("No OCL queries stored on the file system.");
								}
							} else {
								System.out.println("Error occurred when trying to communicate with server. " +
										"So, the remote queries execution is not possible for communication problems.");
							}
						} else {
							System.out.println("Could not estabilish a connection with the OCL server. Please, check configuration file and correct mistakes.");
						}
					}
					if(fd.getSocket() != null) {
						fd.disconnectFromServer(fd.getSocket());
					}
					break;
				case FDClientOptionsManager.LOCAL_JARS_EXECUTION_SCENARIO:
					System.out.println("\nLOCAL JARS EXECUTION SCENARIO");
					//local jars execution
					String[] jarsToExecLJES = (fd.getJarsFromCmdLine(args));
					for(int i = 0; i < jarsToExecLJES.length; i++) {
						jarsToExecLJES[i] = fd.getJarsDir() + pathSep + jarsToExecLJES[i];
					}
					JarExecutor.executeJars(jarsToExecLJES,fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName());
					break;
				case FDClientOptionsManager.DEFAULT_SCENARIO:
					System.out.println("\nDEFAULT SCENARIO (LOCAL SCENARIO)");
					if(!fd.isConnectedToServer()) {
						if(fd.connectToServer()) {
							if(fd.sendScenarioToServer(fd.getSocket(), FDClientOptionsManager.UPDATEONLY_SCENARIO)) {
								System.out.println("\nUPDATE PROCESS");
								fd.updateQueries(fd.getSocket());
								fd.updateJars(fd.getSocket());
							} else {
								System.out.println("Error occurred when trying to communicate with server. Queries and jars will not be updated and the execution " +
										"will follow with not updated local copies of queries and jars list file.");
							}
							
							//local queries execution
							System.out.println("\nOCL QUERIES LOCAL EXECUTION PROCESS");
							String[] localQueriesLS = fd.getQueriesFromFile(fd.getOclQueriesDir() + pathSep + fd.getOclQueriesFileName());
							if(localQueriesLS != null) {
								System.out.println(localQueriesLS.length + " queries will be executed.");
								Object[] results = QueryExecutor.executeQueries(fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName(), localQueriesLS);
								System.out.println("\nFAILURES DETECTION");
								for(int i = 0; i < results.length; i++) {
									if(detectFailure(results[i].toString())) {
										System.out.println("Failure detected for the query " + localQueriesLS[i] + "!");
									} else {
										System.out.println("No failures detected for the query " + localQueriesLS[i] + ".");
									}
								}
								
							} else
								System.out.println("No queries to execute.");
						} else {
							System.out.println("Could not estabilish a connection with the OCL server. Please, check configuration file and correct mistakes.");
						}
					}
					if(fd.getSocket() != null) {
						fd.disconnectFromServer(fd.getSocket());
					}
					//local jars execution
					System.out.println("\nJAR FILES EXECUTION PROCESS");
					String[] jarsToExecDS = fd.getJarsList(fd.getJarsDir() + pathSep + fd.getJarsListFileName());
	System.out.println(jarsToExecDS); 
					System.out.println(jarsToExecDS.length + " .jar files will be executed.");
					for(int i = 0; i < jarsToExecDS.length; i++) {
						jarsToExecDS[i] = fd.getJarsDir() + pathSep + jarsToExecDS[i];
					}
					JarExecutor.executeJars(jarsToExecDS, fd.getEcoreModelDir() + pathSep + fd.getEcoreModelFileName());
					break;
			}
		} catch(LoadConfigurationException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (InvalidFDClientOptionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (Exception e) {
    		// TODO Auto-generated catch block
    		System.out.println(e.getMessage());
    	}

	}


}
