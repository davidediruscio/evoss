CLIENT AND SERVER OPTIONS:
Allowed options for the fdclient are:
-l (local OCL queries and jars execution with previous lists update),	OK
-rl (remote OCL queries and local jars execution with previous lists update), OK
-r (remote OCL queries)	OK
-offline (local OCL queries and jars execution without previous lists update), OK
-updateonly (lists update only), OK
-qsexecutel (local OCL queries execution) <<oclfilepath (.ocl) or OCL queries separated by space>>, OK
-qsexecuter (remote OCL queries execution) <<oclfilepath (.ocl) or OCL queries separated by space>>, OK
-jsexecute (jars execution) <<jarslistfilepath (.txt) or jar files paths separated by space>>, OK
no options (default scenario, equivalent to -l option). OK


Allowed options for the fdserver are:
-r (remote OCL queries and jars execution with previous lists update),
-updateonly (lists update only),
-qsexecuter (remote OCL queries execution) <<oclfilepath or OCL queries separated by space>>,
no options (default scenario, equivalent to -updateonly option).
	

	
CLIENT/SERVER INTERACTIONS DYNAMIC:
Supposing the server is running (listening on port 6793) and the client is launched:
- Both the client and the server load its own configuration parsing the configuration file and then perform a jars consistency check between its own jar files list and the jar files on the file system.
CLIENT SIDE											SERVER SIDE
- Detect scenario analyzing options
- Connect to the fdserver							- Accept the connection and start new thread (the following steps are executed by the new thread)	
- Send scenario to server							- Receive scenario from client
- Scenario execution								- Scenario execution

CONFIGURATION FILES
Both the fdclient and the fdserver have a configuration file (conf/config.txt) loaded at startup.
The pattern for defining a parameter is
<<parameter>>=<<value>>

Client configuration file contains the following parameters:
- fdServerUri (default value is localhost): 
- ecoreModelDir (default value is model): 
- ecoreModelFileName (default value is systemModel.ecore): 
- jarsDir (default avlue is jars): 
- jarsListFile (default value is jarsList.txt): 
- tmpDir (default value is tmp): 
- oclQueriesDir (default value is oclqueries): 
- oclQueriesFileName (default value is queries.ocl): 

Server configuration file contains the following parameters:
- dbDriverName (default value is com.mysql.jdbc.Driver)
- dbUri (default value is jdbc:mysql://localhost/failuresdetector)
- dbUser (default value is root)
- dbPassword (default value is an empty string)
- jarsDir (default value is jars)
- jarsListFile (default value is jarsList.txt)
- tmpDir (default value is tmp)
- oclQueriesFileName (default value is queries.ocl)