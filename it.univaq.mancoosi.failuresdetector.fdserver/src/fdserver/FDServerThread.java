/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package fdserver;
/*
 * OCLQueryExecutorServer.java
 */

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import failuresdetector.FileReceiverManager;
import failuresdetector.FileSenderManager;
import failuresdetector.QueryExecutor;
import failuresdetector.exceptions.InvalidFDServerOptionException;
import failuresdetector.exceptions.NoConnectionToDBException;

public class FDServerThread extends Thread {	
	
	private String dbDriverName;
	private String dbUri;
	private String dbUser;
	private String dbPassword;
	private String jarsDir;
	private String jarsListFileName;
	private String tmpDir;
	private String oclQueriesFileName;
	
	public static String pathSep = File.separator;
	   
	private FDServerOptionsManager optionsManager = new FDServerOptionsManager();
	
	private Connection dbConnection = null;
	
	public FDServerThread(String dbDriverName, String dbUri, String dbUser, String dbPassword, 
					String jarsDir, String jarsListFileName,
					String tmpDir, String oclQueriesFileName) {
		// TODO Auto-generated constructor stub
		this.dbDriverName = dbDriverName;
		this.dbUri = dbUri;
		this.dbUser = dbUser;
		this.dbPassword = dbPassword;
		this.jarsDir = jarsDir;
		this.jarsListFileName = jarsListFileName;
		this.tmpDir = tmpDir;
		this.oclQueriesFileName = oclQueriesFileName;
	}
	
	public FDServerOptionsManager getOptionsManager() {
		return this.optionsManager;
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
	
	//This method loads server configuration defined in the configuration file
	//private static void loadConfiguration() throws FileNotFoundException, LoadConfigurationException, IOException {
		//FDServerConfigurationManager.loadConfiguration(getInstance(), "conf/config.txt");
	//}
    
    //This method is used for connecting to the database
    private Connection dbConnect() {
        if(!dbConnected()) {
            try {
                Class.forName(dbDriverName).newInstance();
                dbConnection = DriverManager.getConnection(dbUri, dbUser, dbPassword);
                System.out.println("Connected to DB " + dbUri);
            } catch (SQLException ex) {
            	System.out.println("Could not connect to DB " + dbUri + ". Check the DBMS server is started.");
                dbConnection = null;
            } catch (InstantiationException ex) {
                System.out.println("Error occurred when trying to instantiate ODBC drivers " + dbDriverName + " for the database " + dbUri + ".");
                dbConnection = null;
            } catch (IllegalAccessException ex) {
                System.out.println("Trying to access database " + dbUri + " with wrong username/password.");
                dbConnection = null;
            } catch (ClassNotFoundException ex) {
                System.out.println("ODBC drivers " + dbDriverName + " not found.");
                dbConnection = null;
            }
        }
        return dbConnection;
    }

    //This method checks if the server is connected to the database
    public boolean dbConnected() {
        return dbConnection != null;
    }

    //This method is used for disconnecting from the database
    private void dbDisconnect() {
        if(dbConnected()) {
            try {
                if(!dbConnection.isClosed()) {
                    dbConnection.close();
                    System.out.println("Disconnected form DB " + dbUri + ".");
                }
            } catch (SQLException ex) {
                System.out.println("Could not disconnect form DB " + dbUri + ".");
            }
            dbConnection = null;
        }
    }
    
    //This method returns all the queries in the database
    public String[] getOCLQueriesTextFromDb() throws NoConnectionToDBException {
        ResultSet rs = null;
        String[] queries = null;
        try {
            if(!dbConnected()) {
                dbConnection = dbConnect();
            }
            if(dbConnected()) {
            	Statement stmt = dbConnection.createStatement();
            	rs = stmt.executeQuery("SELECT * from oclqueries");
            	rs.beforeFirst();           
            	queries = getQueriesTextFromResultSet(rs);
        	} else {
        		throw new NoConnectionToDBException(dbUri);
        	}
        } catch (SQLException ex) {
            System.out.println("Could not retrieve OCL queries from database " + dbUri + ". Connection is closed.");
        }
        return queries;
    }
    
    //This method returns the ID of all the queries in the database
    public int[] getOCLQueriesIDFromDb() throws NoConnectionToDBException {
        ResultSet rs = null;
        int[] queries = null;
        try {
            if(!dbConnected()) {
                dbConnection = dbConnect();
            }
            if(dbConnected()) {
            	Statement stmt = dbConnection.createStatement();
            	rs = stmt.executeQuery("SELECT * from oclqueries");
            	rs.beforeFirst();            
            	queries = getQueriesIDFromResultSet(rs);
            } else {
            	throw new NoConnectionToDBException(dbUri);
            }
        } catch (SQLException ex) {
            System.out.println("Could not retrieve OCL queries from database " + dbUri + ". Connection is closed.");
        }
        return queries;
    }
    
    //Given a query, this method returns its ID if the query exists in the db, -1 otherwise
    public int getOCLQueryIDFromText(String query) throws NoConnectionToDBException {
        ResultSet rs = null;
        int queryID = -1;
        try {
            if(!dbConnected()) {
                dbConnection = dbConnect();
            }
            if(dbConnected()) {
            	Statement stmt = dbConnection.createStatement();
            	String dbQuery = "SELECT * from oclqueries WHERE query = " + "\"" + query + "\"";
            	rs = stmt.executeQuery(dbQuery);
            	rs.beforeFirst();
            	queryID = getQueryIDFromResultSet(rs);
            } else {
            	throw new NoConnectionToDBException(dbUri);
            }
        } catch (SQLException ex) {
            System.out.println("Could not retrieve OCL query " + query + " from database " + dbUri + ". Connection is closed.");
        }
        return queryID;
    }
    
    //Given a ResultSet containing queries, this method returns their text
    //This method supports the getOCLQueriesTextFromDb() method
    private String[] getQueriesTextFromResultSet(ResultSet rs) {
    	String[] queries = null;
    	int querycount = 0;
    	try {
    		rs.beforeFirst();
    		while (rs.next()) {
    			querycount++;
    		}
    		queries = new String[querycount];
    		
    		rs.beforeFirst();
    		int queriesIndex = 0;
    		while (rs.next()) {
    			queries[queriesIndex] = rs.getString("query");
    			queriesIndex++;
    		}
    	} catch(SQLException e) {
    		System.out.println("Could not retrieve OCL queries from database " + dbUri + ". Connection is closed.");
    	}
    	return queries;
    }
    
    //Given a ResultSet containing queries, this method returns their IDs
    //This method supports the getOCLQueriesIDFromDb() method
    private int[] getQueriesIDFromResultSet(ResultSet rs) {
    	int[] queries = null;
    	int querycount = 0;
    	try {
    		rs.beforeFirst();
    		while (rs.next()) {
    			querycount++;
    		}
    		queries = new int[querycount];
    		
    		rs.beforeFirst();
    		int queriesIndex = 0;
    		while (rs.next()) {
    			queries[queriesIndex] = rs.getInt("id");
    			queriesIndex++;
    		}
    	} catch(SQLException e) {
    		System.out.println("Could not retrieve OCL queries from database " + dbUri + ". Connection is closed.");
    	}
    	return queries;
    }
    
    //Given a ResultSet containing a query, this method returns its ID
    //This method supports the getOCLQueryIDFromText(String query) method
    private int getQueryIDFromResultSet(ResultSet rs) {
    	int query = 0;
    	int querycount = 0;
    	try {
    		rs.beforeFirst();
    		while (rs.next()) {
    			querycount++;
    		}
    		if(querycount > 0) {
    			//takes the first returned ID
    			rs.beforeFirst();
    			if (rs.next())
    				query = rs.getInt("id");
    		}

    	} catch(SQLException e) {
    		System.out.println("Could not retrieve OCL query from database " + dbUri + ". Connection is closed.");
    	}
    	return query;
    }
    
    //Given a query ID, this method returns all the possible solutions
    //These are retrieved by means of the union among queries-failures-solutions
    public String[] getSolutionsTextFromQueryID(int queryID) throws NoConnectionToDBException {
        ResultSet rs = null;
        String[] solutions = null;
        try {
            if(!dbConnected()) {
                dbConnection = dbConnect();
            }
            if(dbConnected()) {
            	Statement stmt = dbConnection.createStatement();
            	rs = stmt.executeQuery("SELECT text FROM solutions WHERE ID = " +
            			"ANY (SELECT idfirst FROM ass_solutions2failures WHERE idsecond = " +
            			"ANY (SELECT idsecond FROM ass_oclqueries2failures WHERE idfirst = (SELECT ID FROM oclqueries WHERE ID = " + "\"" + queryID + "\")))");
            	rs.beforeFirst();           
            	solutions = getSolutionsFromResultSet(rs);
        	} else {
        		throw new NoConnectionToDBException(dbUri);
        	}
        } catch (SQLException ex) {
            System.out.println("Could not retrieve solutions from database " + dbUri + ". Connection is closed.");
        }

        return solutions;
    }
    
    //Given a ResultSet containing solutions, this method returns their text
    //This method supports the getSolutionsTextFromQueryID(int queryID) method
    private String[] getSolutionsFromResultSet(ResultSet rs) {
    	String[] solutions = null;
    	int solcount = 0;
    	try {
    		rs.beforeFirst();
    		while (rs.next()) {
    			solcount++;
    		}
    		solutions = new String[solcount];
    		
    		rs.beforeFirst();
    		int solIndex = 0;
    		while (rs.next()) {
    			solutions[solIndex] = rs.getString("text");
    			solIndex++;
    		}
    	} catch(SQLException e) {
    		System.out.println("Could not retrieve OCL queries from database " + dbUri + ". Connection is closed.");
    	}
    	return solutions;
    }
    
    //This method updates the queries file
    private void updateQueriesFile(File queriesFile) throws NoConnectionToDBException, IOException {
    	String[] dbQueries = getOCLQueriesTextFromDb();
    	
    	for(int i = 0; i < dbQueries.length; i++) {
    		if(i == 0)
    			writeToFile(queriesFile, dbQueries[i]);
    		else
    			appendToFile(queriesFile, dbQueries[i]);
    	}
    }
    
    //This method sends the queries file to the client
    private void updateClientQueries(Socket connectionSocket) throws NoConnectionToDBException {
    	try {
    		File tmp = new File(getTmpDir() + pathSep + getOclQueriesFileName());
    		updateQueriesFile(tmp);
    		
    	//	Socket appConnectionSocket = new Socket(connectionSocket.getInetAddress(), FDServerConfigurationManager.FILE_PORT); 
    		
    		System.out.println("Updating client's OCL queries...");
    		new FileSenderManager(connectionSocket, getTmpDir(), getOclQueriesFileName()).run();
    		//appConnectionSocket.close();
    		System.out.println("OCL queries file sent to client.");
    		//tmp.deleteOnExit();
    	
    	} catch (SocketException e) {
    		e.printStackTrace();
    		System.out.println("Socket creation error !");
    	} catch (IOException e) {
    		e.printStackTrace();
			// TODO Auto-generated catch block
			System.out.println("Could not update client's OCL queries.");
		}
    }
    
    //This method executes OCL queries provided by the client from server-side.
    private void executeQueries(Socket connectionSocket, Socket protocolSocket) throws IOException {    	
    	
    	DataOutputStream outToClient = new DataOutputStream(protocolSocket.getOutputStream());
    	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(protocolSocket.getInputStream()));
    	if(inFromClient.readLine().equals("EXEC_QUERIES")) {
    		outToClient.writeBytes("EXEC_QUERIES_ACK\n");
    		if(inFromClient.readLine().equals("MANCOOSI_MODEL")) {
    			System.out.println("Receiving mancoosi model from the client " + connectionSocket.getInetAddress().toString().substring(1) + "...");
    			outToClient.writeBytes("SEND_ECORE_FILENAME\n");
    			String ecoreFileName = inFromClient.readLine(); 
    			if(ecoreFileName.endsWith(".mancoosimm")) {
    				outToClient.writeBytes("SEND_ECORE_FILENAME_ACK\n");
    				//ServerSocket appSs = new ServerSocket(FDServerConfigurationManager.FILE_PORT);
        	    	//Socket appConnectionSocket = appSs.accept();
        	    	String clientAddress = connectionSocket.getInetAddress().toString().substring(1);
        	    	String fileName = clientAddress + "_" + ecoreFileName;
    				new FileReceiverManager(connectionSocket, getTmpDir(), fileName).run();
    				//appConnectionSocket.close();
    				//appSs.close();
    				outToClient.writeBytes("MANCOOSI_MODEL_ACK\n");
    				try {
    					boolean execFinished = false;
    					String strLine = null;
    					while(!execFinished) {
    						strLine = inFromClient.readLine();
    						if(!strLine.equals("EXEC_QUERIES_END")) {
    							System.out.println("\nClient requested the execution of the following OCL query: " + strLine);
    							outToClient.writeBytes("EXECUTING_QUERY\n");
    							if(inFromClient.readLine().equals("WAITING_RESULT")) {
    								Object actualQueryResult = QueryExecutor.executeQuery(getTmpDir() + pathSep + fileName, strLine);
    								outToClient.writeBytes(actualQueryResult.toString() + "\n");
    								System.out.println("OCL query result sent to client " + connectionSocket.getInetAddress().toString().substring(1) + ".");
        						
    								if(inFromClient.readLine().equals("WAITING_FAILURE")) {
    									if(detectFailure(actualQueryResult.toString())) {
    										System.out.println("Failure detected for the query " + strLine + "!");
    										outToClient.writeBytes("FAILURE\n");
    										if(inFromClient.readLine().equals("WAITING_SOLUTIONS")) {
    											int queryID = getOCLQueryIDFromText(strLine);
    											if(queryID > -1) {
    												String[] solutions = getSolutionsTextFromQueryID(queryID);
    												if(solutions != null && solutions.length > 0) {
    													System.out.println("Possible solutions (they will be sent to client " + connectionSocket.getInetAddress().toString().substring(1) + "):");
    													outToClient.writeBytes("SOLUTIONS\n");
    													for(int j = 0; j < solutions.length; j++) {
    														System.out.println("- " + solutions[j]);
    														outToClient.writeBytes(solutions[j] + "\n");
    														if(!inFromClient.readLine().equals("SOLUTION_ACK")) {
    															System.out.println("Protocol error! Client seems to be disconnected.");
    															break;
    														}
    													} 												
    													outToClient.writeBytes("SOLUTIONS_END\n");
    												} else {
    													System.out.println("No possible solutions found for the query " + strLine + ".");
    													outToClient.writeBytes("NO_SOLUTIONS\n");
    												}
    											} else {
    												outToClient.writeBytes("ERR_SOLUTIONS\n");
    											}
    										} else {
    											System.out.println("Protocol error! Client seems to be disconnected.");
    										}
    									} else {
    										System.out.println("No failures detected for the query " + strLine + ".");
    										outToClient.writeBytes("NO_FAILURE\n");
    									}
    								} else {
    									System.out.println("Protocol error! Client seems to be disconnected.");
    								}
    							} else {
    								System.out.println("Protocol error! Client seems to be disconnected.");
    							}
    						} else {
    							if(strLine.equals("EXEC_QUERIES_END")) {
    								execFinished = true;
    							}
    						}
    					}
    					System.out.println("\nRemote OCL queries execution process terminated. Sending termination ack...");
    					outToClient.writeBytes("EXEC_QUERIES_END_ACK");
    					inFromClient.close();
    					outToClient.close();
    					System.out.println("Remote OCL queries execution process complete!");
    					deleteFile(getTmpDir() + pathSep + fileName);
    				} catch (NoConnectionToDBException e) {
    					//TODO Auto-generated catch block
    					System.out.println(e.getMessage());
    					System.out.println("Error in remote OCL queries execution process!");
    				}
    			} else {
    				outToClient.writeBytes("INVALID_FILENAME\n");
    				System.out.println("Invalid system configuration model extension!");
    			}
    		} else {
    			System.out.println("Could not execute queries for the client" + connectionSocket.getInetAddress().toString().substring(1) + " .");
    		}
    	} else {
			System.out.println("Could not execute queries for the client" + connectionSocket.getInetAddress().toString().substring(1) + " .");
		}
		//if(!connectionSocket.isClosed())
		//	connectionSocket.close();
		//if(!ss.isClosed())
		//	ss.close();
    }
    
    
    //This method executes OCL queries in the database from server-side.
    private void executeQueriesInDb(Socket connSocket) throws IOException {    	
    	//ServerSocket ss = new ServerSocket(FDServerConfigurationManager.CONTROL_PORT);
    	Socket connectionSocket = connSocket;
    	
    	DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
    	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
    	if(inFromClient.readLine().equals("EXEC_QUERIES")) {
    		outToClient.writeBytes("EXEC_QUERIES_ACK\n");
    		if(inFromClient.readLine().equals("MANCOOSI_MODEL")) {
    			System.out.println("Receiving mancoosi model from the client " + connSocket.getInetAddress().toString().substring(1) + "...");
    			outToClient.writeBytes("SEND_ECORE_FILENAME\n");
    			String ecoreFileName = inFromClient.readLine(); 
    			if(ecoreFileName.endsWith(".mancoosimm")) {
    				outToClient.writeBytes("SEND_ECORE_FILENAME_ACK\n");
    				//ServerSocket appSs = new ServerSocket(FDServerConfigurationManager.FILE_PORT);
        	    	//Socket appConnectionSocket = appSs.accept();
        	    	String clientAddress = connectionSocket.getInetAddress().toString().substring(1);
        	    	String fileName = clientAddress + "_" + ecoreFileName;
    				new FileReceiverManager(connectionSocket, getTmpDir(), fileName).run();
    				//appConnectionSocket.close();
    				//appSs.close();
    				outToClient.writeBytes("MANCOOSI_MODEL_ACK\n");
    				
    				try {
						String[] queriesToExecute = getOCLQueriesTextFromDb();
						for(int i = 0; i < queriesToExecute.length; i++) {
							System.out.println("\nExecuting " + queriesToExecute[i]);
							outToClient.writeBytes("EXECUTING_QUERY\n");
							if(inFromClient.readLine().equals("EXECUTING_QUERY_ACK")) {
								outToClient.writeBytes(queriesToExecute[i] + "\n");
								if(inFromClient.readLine().equals("WAITING_RESULT")) {
	    							Object actualQueryResult = QueryExecutor.executeQuery(getTmpDir() + pathSep + fileName, queriesToExecute[i]);
	    							outToClient.writeBytes(actualQueryResult.toString() + "\n");
	        						System.out.println("OCL query result sent to client " + connectionSocket.getInetAddress().toString().substring(1) + ".");
	        						
	        						if(inFromClient.readLine().equals("WAITING_FAILURE")) {
	        							if(detectFailure(actualQueryResult.toString())) {
	    									System.out.println("Failure detected for the query " + queriesToExecute[i] + "!");
	    									outToClient.writeBytes("FAILURE\n");
	    									//solutions retrieving
	    									if(inFromClient.readLine().equals("WAITING_SOLUTIONS")) {
	    										int queryID = getOCLQueryIDFromText(queriesToExecute[i]);
	    										if(queryID > 0) {
	    											String[] solutions = getSolutionsTextFromQueryID(queryID);
	    											if(solutions != null && solutions.length > 0) {
	    												System.out.println("Possible solutions (they will be sent to client " + connectionSocket.getInetAddress().toString().substring(1) + "):");
	    												outToClient.writeBytes("SOLUTIONS\n");
	    												for(int j = 0; j < solutions.length; j++) {
	    													System.out.println("- " + solutions[j]);
	    													outToClient.writeBytes(solutions[j] + "\n");
	    													if(!inFromClient.readLine().equals("SOLUTION_ACK")) {
	    														System.out.println("Protocol error! Client seems to be disconnected.");
	    														break;
	    													}
	    												} 												
	    												outToClient.writeBytes("SOLUTIONS_END\n");
	    											} else {
	    												System.out.println("No possible solutions found for the query " + queriesToExecute[i] + ".");
	    		    									outToClient.writeBytes("NO_SOLUTIONS\n");
	    											}
	    										} else {
	    											outToClient.writeBytes("ERR_SOLUTIONS\n");
	    										}
	    									} else {
	    		    							System.out.println("Protocol error! Client seems to be disconnected.");
	    		    						}
	    								} else {
	    									System.out.println("No failures detected for the query " + queriesToExecute[i] + ".");
	    									outToClient.writeBytes("NO_FAILURE\n");
	    								}
	        						} else {
		    							System.out.println("Protocol error! Client seems to be disconnected.");
		    						}
	    						} else {
	    							System.out.println("Protocol error! Client seems to be disconnected.");
	    						}
							} else {
								System.out.println("Protocol error! Client seems to be disconnected.");
							}
							
						}
						outToClient.writeBytes("EXEC_QUERIES_END\n");
						if(inFromClient.readLine().equals("EXEC_QUERIES_END_ACK")) {
							outToClient.close();
							inFromClient.close();
						}
					} catch (NoConnectionToDBException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
						System.out.println("Error in remote OCL queries execution process!");
					}
    				deleteFile(getTmpDir() + pathSep + fileName);
    			} else {
    				outToClient.writeBytes("INVALID_FILENAME\n");
    				System.out.println("Invalid system configuration model extension!");
    			}
    		} else {
    			System.out.println("Could not execute queries for the client" + connectionSocket.getInetAddress().toString().substring(1) + " .");
    		}
    	} else {
			System.out.println("Could not execute queries for the client" + connectionSocket.getInetAddress().toString().substring(1) + " .");
		}
		//if(!connectionSocket.isClosed())
		//	connectionSocket.close();
		//if(!ss.isClosed())
		//	ss.close();
    }
    
    //This method detects if the executed OCL query result given in input produced a failure.
    private static boolean detectFailure(String queryResult) {
		if(queryResult.equals("[false]"))
			return true;		
		return false;
	}    
  
    //This method updates the server jars list file, retrieving the jars from the database.
    private void updateJarsListFile(File jarsListFile) throws NoConnectionToDBException, IOException {
    	String[] dbJars = getJarsFromDb();
    	
    	for(int i = 0; i < dbJars.length; i++) {
    		if(i == 0)
    			writeToFile(jarsListFile, dbJars[i]);
    		else
    			appendToFile(jarsListFile, dbJars[i]);
    	}
    }
    
    //This method sends the server jars list file to the client, that will eventually request missing jars .
    private void updateClientJars(Socket connectionSocket) throws NoConnectionToDBException {
    	try {
    		File tmp = new File(getJarsDir() + pathSep + getJarsListFileName());
    		updateJarsListFile(tmp);    
    		System.out.println("Updating client's jar files...");
    		new FileSenderManager(connectionSocket, getJarsDir(), getJarsListFileName()).run();
    		System.out.println("Jar files list sent to client.");
  
    	} catch (SocketException e) {
    		e.printStackTrace();
    		System.out.println("Socket creation error !");
    	} catch (IOException e) {
    		e.printStackTrace();
			// TODO Auto-generated catch block
			System.out.println("Could not update client's jar files list.");
		}
    }
    
    //This method returns a String array containing the names of jar files referred in the database.
    public String[] getJarsFromDb() throws NoConnectionToDBException {
        ResultSet rs = null;
        String[] jars = null;
        try {
            if(!dbConnected()) {
                dbConnection = dbConnect();
            }
            if(dbConnected()) {
            	Statement stmt = dbConnection.createStatement();
            	rs = stmt.executeQuery("SELECT * from jars");
            	rs.beforeFirst();            
            	jars = getJarFilesFromResultSet(rs);
        	} else {
        		throw new NoConnectionToDBException(dbUri);
        	}
        } catch (SQLException ex) {
            System.out.println("Could not retrieve jars list from database " + dbUri + ". Connection is closed.");
        }

        return jars;
    }
    
    //This method returns a String array with the names of jar files contained in the ResultSet parameter.
    private String[] getJarFilesFromResultSet(ResultSet rs) {
    	String[] jars = null;
    	int jarcount = 0;
    	try {
    		rs.beforeFirst();
    		while (rs.next()) {
    			jarcount++;
    		}
    		jars = new String[jarcount];
    		
    		rs.beforeFirst();
    		int jarsIndex = 0;
    		while (rs.next()) {
    			jars[jarsIndex] = rs.getString("file");
    			jarsIndex++;
    		}
    	} catch(SQLException e) {
    		System.out.println("Could not retrieve jars list from database " + dbUri + ". Connection is closed.");
    	}
    	return jars;
    }
    
	//This method sends jar files over the socket given in input.
    private void sendJars(Socket connectionSocket, Socket protocolSocket) throws IOException {    	
    	
    	DataOutputStream outToClient = new DataOutputStream(protocolSocket.getOutputStream());
    	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(protocolSocket.getInputStream()));
    	String firstInput = inFromClient.readLine();
    	if(firstInput.equals("GET_JARS")) {
    		outToClient.writeBytes("GET_JARS_ACK\n");
    		boolean downloadFinished = false;
    		String strLine = null;
    		while(!downloadFinished) {
    			strLine = inFromClient.readLine();
    			if(strLine.endsWith(".jar")) {
    				System.out.println("Client requested " + strLine + " ...");
    				if(new File(getJarsDir() + pathSep + strLine).exists()) {
    					outToClient.writeBytes("SENDING_JAR\n");
    					new FileSenderManager(connectionSocket, getJarsDir(), strLine).run();
    					System.out.println(strLine + " sent to client.");
    					if(inFromClient.readLine().equals(strLine + "_ACK"))
    						System.out.println(strLine + " received by client.");
    				} else {
    					outToClient.writeBytes("ERR_SENDING_JARS\n");
    					System.out.println("Could not retrieve requested jar " + strLine);
    				}
    			} else {
    				if(strLine.equals("GET_JARS_END")) {
    					downloadFinished = true;
    					System.out.println("Download finished.");
    				}
    			}
    		}
    		System.out.println("Sending jars process terminated. Sending termination ack...");
    		outToClient.writeBytes("GET_JARS_END_ACK");
    		inFromClient.close();
    		outToClient.close();
    		System.out.println("Update jars process complete!");
    	} else {
    		if(firstInput.equals("NO_JARS")) {
    			System.out.println("No jars to send to the client " + connectionSocket.getInetAddress().toString().substring(1) + " . Its jars list is already updated.");
    		}
    		else {
    			System.out.println("Could not send jars to the client" + connectionSocket.getInetAddress().toString().substring(1) + " .");
    		}
		}
    }
    
    //This method implements the client jars update process, which consists of the client jars list update, 
    //followed by the transfer of missing jar files.
    private void updateClientJarsProcess(Socket connectionSocket, Socket protocolSocket) throws NoConnectionToDBException, IOException {
    	updateClientJars(connectionSocket);
    	DataOutputStream outToClient = new DataOutputStream(protocolSocket.getOutputStream());
    	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(protocolSocket.getInputStream()));
    	String firstInput = inFromClient.readLine();
    	if(firstInput.equals("GET_JARS")) {
    		outToClient.writeBytes("GET_JARS_ACK\n");
    		sendJars(connectionSocket,protocolSocket);
    	} else {
    		if(firstInput.equals("NO_JARS")) {
    			System.out.println("No jars to send to the client " + connectionSocket.getInetAddress().toString().substring(1) + " . Its jars list is already updated.");
    		}
    		else {
    			System.out.println("Could not send jars to the client" + connectionSocket.getInetAddress().toString().substring(1) + " .");
    		}
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
    
    //This method determines which scenario will be executed.
    private int getScenarioFromClient(Socket protocolSocket) throws IOException, InvalidFDServerOptionException {
    	DataOutputStream outToClient = new DataOutputStream(protocolSocket.getOutputStream());
    	BufferedReader inFromClient = new BufferedReader(new InputStreamReader(protocolSocket.getInputStream()));
    	String option = inFromClient.readLine();
    	outToClient.writeBytes("GET_SCENARIO_ACK\n");
    	return FDServerOptionsManager.getScenario(option);
    }
    
    //This method implements the interaction with a single client
    public void start(Socket connectionSocket, Socket protocolSocket) {
        try {
			try {
				int scenario = getScenarioFromClient(protocolSocket);
				switch(scenario) {
				
				
					case FDServerOptionsManager.REMOTE_AND_LOCAL_SCENARIO:
						System.out.println("\nREMOTE SCENARIO (Client: " + connectionSocket.getInetAddress().toString().substring(1) + ")");
						updateClientQueries(connectionSocket);
						updateClientJarsProcess(connectionSocket,protocolSocket);
						//remote queries execution
						executeQueriesInDb(connectionSocket);
						break;
					
					case FDServerOptionsManager.REMOTE_SCENARIO:
						System.out.println("\nREMOTE SCENARIO (Client: " + connectionSocket.getInetAddress().toString().substring(1) + ")");
						//updateClientQueries(connectionSocket);
						//updateClientJarsProcess(connectionSocket,protocolSocket);
						//remote queries execution
						executeQueriesInDb(connectionSocket);
						break;
					case FDServerOptionsManager.UPDATEONLY_SCENARIO:
						System.out.println("\nUPDATEONLY SCENARIO (Client: " + connectionSocket.getInetAddress().toString().substring(1) + ")");
						updateClientQueries(connectionSocket);
						updateClientJarsProcess(connectionSocket,protocolSocket);
						break;
					case FDServerOptionsManager.REMOTE_QUERIES_EXECUTION_SCENARIO:
						System.out.println("\nREMOTE QUERIES EXECUTION SCENARIO (Client: " + connectionSocket.getInetAddress().toString().substring(1) + ")");
						//remote queries execution
						executeQueries(connectionSocket,protocolSocket);
						break;
					case FDServerOptionsManager.DEFAULT_SCENARIO:
						System.out.println("\nDEFAULT SCENARIO (UPDATEONLY SCENARIO) (Client: " + connectionSocket.getInetAddress().toString().substring(1) + ")");
						updateClientQueries(connectionSocket);
						updateClientJarsProcess(connectionSocket,protocolSocket);
						break;
				}					
			} catch (NoConnectionToDBException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				//connectionSocket.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
				//connectionSocket.close();
			} catch (InvalidFDServerOptionException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				//connectionSocket.close();
			} catch (Exception e) {
	    		// TODO Auto-generated catch block
	    		System.out.println(e.getMessage());
	    	} finally {
	    		dbDisconnect();
				if(!connectionSocket.isClosed())
					connectionSocket.close();
				System.out.println("Disconnected from the client " + connectionSocket.getInetAddress().toString().substring(1) + ".");
				System.out.println("END OF SCENARIO.");
			}
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        }
    }
}
