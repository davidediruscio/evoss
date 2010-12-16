package failuresdetector.fdclient;

import java.util.HashMap;
import java.util.Map;

import failuresdetector.exceptions.InvalidFDClientOptionException;

//This class manages the options for the client, mapping them to the corresponding scenario
public class FDClientOptionsManager {
	
	public static final int LOCAL_SCENARIO = 0;
	public static final int REMOTE_SCENARIO = 1;
	public static final int OFFLINE_SCENARIO = 2;
	public static final int UPDATEONLY_SCENARIO = 3;
	public static final int REMOTE_QUERIES_EXECUTION_SCENARIO = 4;
	public static final int LOCAL_QUERIES_EXECUTION_SCENARIO = 5;
	public static final int LOCAL_JARS_EXECUTION_SCENARIO = 6;
	public static final int LOCAL_QUERY_EXECUTION_SCENARIO = 7;
	public static final int REMOTE_QUERY_EXECUTION_SCENARIO = 8;
	public static final int LOCAL_JAR_EXECUTION_SCENARIO = 9;
	public static final int DEFAULT_SCENARIO = 10;
	
	private static Map<String, Integer> optionsMap = new HashMap<String, Integer>();
	
	public FDClientOptionsManager() {
		optionsMap.put("-l", LOCAL_SCENARIO);
		optionsMap.put("-r", REMOTE_SCENARIO);
		optionsMap.put("-offline", OFFLINE_SCENARIO);
		optionsMap.put("-updateonly", UPDATEONLY_SCENARIO);
		optionsMap.put("-qsexecuter", REMOTE_QUERIES_EXECUTION_SCENARIO);
		optionsMap.put("-qsexecutel", LOCAL_QUERIES_EXECUTION_SCENARIO);
		optionsMap.put("-jsexecute", LOCAL_JARS_EXECUTION_SCENARIO);
		optionsMap.put("", DEFAULT_SCENARIO);
		optionsMap.put(null, DEFAULT_SCENARIO);
	}
	
	public static int getScenario(String[] args) throws InvalidFDClientOptionException {
		if(args == null || args.length == 0)
			return (int) optionsMap.get(null);
		else
			if(optionsMap.get(args[0]) != null)
				return (int) optionsMap.get(args[0]);
			else
				throw new InvalidFDClientOptionException(args[0]);
	}
	
}
