package fdserver;

import java.util.HashMap;
import java.util.Map;

import failuresdetector.exceptions.InvalidFDServerOptionException;

//This class manages the options for the server, mapping them to the corresponding scenario
public class FDServerOptionsManager {
	
	public static final int REMOTE_SCENARIO = 1;
	public static final int UPDATEONLY_SCENARIO = 3;
	public static final int REMOTE_QUERIES_EXECUTION_SCENARIO = 4;
	public static final int REMOTE_QUERY_EXECUTION_SCENARIO = 8;
	public static final int DEFAULT_SCENARIO = 10;
	public static final int REMOTE_AND_LOCAL_SCENARIO = 11;
	
	private static Map<String, Integer> optionsMap = new HashMap<String, Integer>();
	
	public FDServerOptionsManager() {
		optionsMap.put("-r", REMOTE_SCENARIO);
		optionsMap.put("-updateonly", UPDATEONLY_SCENARIO);
		optionsMap.put("-qsexecuter", REMOTE_QUERIES_EXECUTION_SCENARIO);
		optionsMap.put("", DEFAULT_SCENARIO);
		optionsMap.put(null, DEFAULT_SCENARIO);
	}
	
	public static int getScenario(String option) throws InvalidFDServerOptionException {
		try {
			return Integer.parseInt(option);
		} catch (NumberFormatException e) {
			throw new InvalidFDServerOptionException(option);
		}
	}
	
}
