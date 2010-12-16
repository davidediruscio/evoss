package failuresdetector.exceptions;

import fdserver.FDServerConfigurationManager;

@SuppressWarnings("serial")
public class NoConnectionToDBException extends Exception {
	
	@SuppressWarnings("unused")
	private String dbUri = FDServerConfigurationManager.DEFAULT_DB_URI;
	private String message = null;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public NoConnectionToDBException(String dbUri) {
		this.dbUri = dbUri;
		this.message = "Not connected to the database " + dbUri + ".";
	}
	
	public NoConnectionToDBException() {
		this.message = "Not connected to the database " + FDServerConfigurationManager.DEFAULT_DB_URI + ".";
	}
	
	public String toString() {
		return this.getMessage();
	}
	
}
