package failuresdetector.exceptions;

@SuppressWarnings("serial")
public class InvalidFDServerOptionException extends Exception {
	
	private String message = null;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public InvalidFDServerOptionException(String invalidOption) {
		this.message = "Invalid option (" + invalidOption + "). Allowed options are: " +
						"\n-r (remote OCL queries and jars execution with previous lists update), " +
						"\n-updateonly (lists update only), " +
						"\n-qsexecuter (remote OCL queries execution) <<oclfilepath or OCL queries separated by space>>, " +
						"\nno options (default scenario, equivalent to -updateonly option).";
	}
	
	public String toString() {
		return this.getMessage();
	}
	
}
