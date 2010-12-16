package failuresdetector.exceptions;

@SuppressWarnings("serial")
public class LoadConfigurationException extends Exception {
	
	private String message = "Error loading configuration file. Please check its content and correct mistakes.";
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public LoadConfigurationException(String message) {
		this.message = message;
	}
	
	public String toString() {
		return this.getMessage();
	}
	
}
