package it.univaq.mancoosi.validator.exceptions;

public class ValidatorException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public ValidatorException() {
		super("Error occurred!");
	}

	public ValidatorException(String message) {
		super(message);
	}

	public ValidatorException(String message, Throwable cause) {
		super(message, cause);
	}

}
