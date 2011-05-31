/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fdserver;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;

import failuresdetector.exceptions.LoadConfigurationException;


/**
 *
 * @author Dave
 */
public class FDServer {

	private static FDServer serverInstance = new FDServer();
	
	private String dbDriverName;
	private String dbUri;
	private String dbUser;
	private String dbPassword;
	private String jarsDir;
	private String jarsListFileName;
	private String tmpDir;
	private String oclQueriesFileName;
	
	public static String pathSep = File.separator;
	
	public static FDServer getServerInstance() {
        return FDServer.serverInstance;
    }
	
	private FDServer() {
		
	}
	
	public String getDbDriverName() {
		return dbDriverName;
	}
    
    public void setDbDriverName(String dbDriverName) {
		this.dbDriverName = dbDriverName;
	}
    
	public String getDbUri() {
		return dbUri;
	}
	
	public void setDbUri(String dbUri) {
		this.dbUri = dbUri;
	}
	
	public String getDbUser() {
		return dbUser;
	}
	
	public void setDbUser(String dbUser) {
		this.dbUser = dbUser;
	}
	
	public String getDbPassword() {
		return dbPassword;
	}
	
	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
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
	
	public String getOclQueriesFileName() {
		return oclQueriesFileName;
	}
	
	public void setOclQueriesFileName(String oclQueriesFileName) {
		this.oclQueriesFileName = oclQueriesFileName;
	}
	
	//This method starts a new FDServerThread
	private static void startNewThread(final Socket connectionSocket, final Socket protocolSocket,
										String dbDriverName, String dbUri, String dbUser, String dbPassword, 
										String jarsDir, String jarsListFileName,
										String tmpDir, String oclQueriesFileName) throws IOException {
		Thread t1 = null;
		final FDServerThread serverThread = new FDServerThread(dbDriverName, dbUri, dbUser, dbPassword, jarsDir, jarsListFileName, tmpDir, oclQueriesFileName);

		t1 = new Thread(new Runnable() {

			public void run() {
				serverThread.start(connectionSocket,protocolSocket);
			}
		});
		t1.start();
		
	}
	
	//This method returns the jar files list as a String array.
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
  	  			System.out.println("The jars file list " + getJarsDir() + pathSep + getJarsListFileName() + " doesn't exists.");
  	  		}
		} catch(NullPointerException e) {
  	  		System.out.println("The jars file list " + getJarsDir() + pathSep + getJarsListFileName() + " doesn't exists.");
  	  	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
  	  		System.out.println("The jars file list " + getJarsDir() + pathSep + getJarsListFileName() + " doesn't exists.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Can't read from file " + getJarsDir() + pathSep + getJarsListFileName() + ". Please, check file permission.");
		}
		return jarsList;
	}
    
  //This method compares two jar files lists (given as two String arrays) and returns the difference between them. 
    //A jar file name will be present in the resulting difference if an only if it is contained in the first list but not in the second. 
	private String[] compareJarsLists(String[] firstJarsList, String[] secondJarsList) {
		String[] diff = null;
		if(secondJarsList != null)
			for(int i = 0; i < secondJarsList.length; i++) {
				if(!findJar(firstJarsList, secondJarsList[i]))
					diff = addToArray(diff, secondJarsList[i]);
			}
		return diff;
	}
	
	//This method returns true if the jar is contained in the jar files list, false otherwise.
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
	
	//This method checks jars consistency, described by the following condition:
    //There is a jars inconsistency if some jar file in the jar files list is not present on the filesystem and 
    //if some jar file on the filesystem is not present in the jar files list.
    public boolean checkJarsConsistency() {
		File jarFilesList = new File(getJarsDir() + pathSep + getJarsListFileName());
		try {
			//deletes from the jar files list all that jars that are not present on the filesystem
			if(jarFilesList.exists()) {
				FileInputStream fstream = new FileInputStream(jarFilesList);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String[] obsoleteJars = null;
				String strLine;
				//Read File Line By Line
				while((strLine = br.readLine()) != null) {
					if(strLine.endsWith(".jar")) {
						File correspJar = new File(getJarsDir() + pathSep + strLine);
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
			
			//deletes from the filesystem all that jars that are not present in the jar files list
			File jarsDir = new File(getJarsDir());
			if(jarsDir.exists() && jarsDir.isDirectory()) {
				String[] jars = jarsDir.list(new FilenameFilter() {
					@Override
					public boolean accept(File dir, String name) {
						// TODO Auto-generated method stub
						return name.endsWith(".jar"); 
					}
				});
				String[] jarsToDelete = compareJarsLists(getJarsList(getJarsDir() + pathSep + getJarsListFileName()), jars);
				if(jarsToDelete != null && jarsToDelete.length > 0) {
					for(int i = 0; i < jarsToDelete.length; i++) {
						deleteFile(getJarsDir() + pathSep + jarsToDelete[i]);
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
	
	//This method loads server configuration defined in the configuration file
	private static void loadConfiguration() throws FileNotFoundException, LoadConfigurationException, IOException {
		FDServerConfigurationManager.loadConfiguration(getServerInstance(), "conf/config.txt");
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Loading Failures Detector Server configuration...");
    		loadConfiguration();
    		System.out.println("Failures Detector Server configuration loaded!");
    		if(getServerInstance().checkJarsConsistency()) {
				System.out.println("Jars Consistency checked.");
				ServerSocket serverFather = new ServerSocket(FDServerConfigurationManager.DEFAULT_PORT);
				
				Socket connectionSocket = null;
				
			

				while(true) {
	            	System.out.println("\nListening for connection request on port " + FDServerConfigurationManager.DEFAULT_PORT + "...");
	                connectionSocket = serverFather.accept();
	                System.out.println("Connection estabilished with client " + connectionSocket.getInetAddress().toString().substring(1) + ".");
	            	
	                System.out.println("Requesting socket protocol on the remote port " + FDServerConfigurationManager.CONTROL_PORT );
	                Socket protocolSocket = null;
	                boolean protocolSocketConnected = false;
	                
	                while ( ! protocolSocketConnected ) {
	                	try {
	                		InetAddress inteAddress = connectionSocket.getInetAddress();
	                	    SocketAddress socketAddress = new InetSocketAddress(inteAddress,  FDServerConfigurationManager.CONTROL_PORT);
	                	  
	                	    // create a socket
	                	    protocolSocket = new Socket();
	                	  
	                	    //this method will block no more than timeout ms.
	                	    int timeoutInMs = 10*1000;   // 10 seconds
	                	    protocolSocket.connect(socketAddress, timeoutInMs);
	                		
	               // 		protocolSocket = new Socket(connectionSocket.getInetAddress(), FDServerConfigurationManager.CONTROL_PORT);
	                		protocolSocketConnected = true;
						} catch (ConnectException e) {
							// TODO: handle exception
						}	catch (SocketTimeoutException ste) {
							System.err.println("Timed out waiting for the socket.");
							//ste.printStackTrace();
							protocolSocketConnected = false;
							System.exit(1);
						}             
	                }
	               
	    	    	    			
	               startNewThread(connectionSocket, 
	            		   			protocolSocket,
	                				getServerInstance().getDbDriverName(),
	                				getServerInstance().getDbUri(),
	                				getServerInstance().getDbUser(),
	                				getServerInstance().getDbPassword(),
	                				getServerInstance().getJarsDir(),
	                				getServerInstance().getJarsListFileName(),
	                				getServerInstance().getTmpDir(),
	                				getServerInstance().getOclQueriesFileName());
	                
	    
	            }				
			} else {
				System.out.println("Error occurred when checking jars consistency. The server cannot be started." +
						"\nPlease check 1:1 relation between jars on the file system and jars listed in the database.");
			}
		} catch(LoadConfigurationException e) {
    		System.out.println(e.getMessage());
    	} catch (FileNotFoundException e) {
    		//TODO Auto-generated catch block
    		System.out.println(e.getMessage());
    	} catch (IOException e) {
    		// TODO Auto-generated catch block
    		System.out.println(e.getMessage());
    	} catch (Exception e) {
    		//TODO Auto-generated catch block
    		System.out.println(e.getMessage());
    	}
	}
}
