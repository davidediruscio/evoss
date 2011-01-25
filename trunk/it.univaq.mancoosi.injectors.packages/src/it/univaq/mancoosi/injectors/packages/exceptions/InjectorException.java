package it.univaq.mancoosi.injectors.packages.exceptions;

public class InjectorException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public InjectorException() {
		super("Error occurred!");
	}

	public InjectorException(String message) {
		super(message);
	}

	public InjectorException(String message, Throwable cause) {
		super(message, cause);
	}

}
