package failuresdetector.exceptions;

@SuppressWarnings("serial")
public class InvalidFDClientOptionException extends Exception {
	
	private String message = null;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public InvalidFDClientOptionException(String invalidOption) {
		this.message = "Invalid option (" + invalidOption + "). Allowed options are: " +
						"\n-l (local OCL queries and jars execution with previous lists update), " +
						"\n-r (remote OCL queries and jars execution with previous lists update), " +
						"\n-offline (local OCL queries and jars execution without previous lists update), " +
						"\n-updateonly (lists update only), " +
						"\n-qsexecutel (local OCL queries execution) <<oclfilepath (.ocl) or OCL queries separated by space>>, " +
						"\n-qsexecuter (remote OCL queries execution) <<oclfilepath (.ocl) or OCL queries separated by space>>, " +
						"\n-jsexecute (jars execution) <<jarslistfilepath (.txt) or jar files paths separated by space>>, " +
						"\nno options (default scenario, equivalent to -l option).";
	}
	
	public String toString() {
		return this.getMessage();
	}
	
}
