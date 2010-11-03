/**
 * 
 */
package it.univaq.mancoosi.simulator.exceptions;

/**
 * High level exception
 * @author max
 */

public class SimulatorException extends Exception {

	private static final long serialVersionUID = -8988032367620891859L;

	public SimulatorException() {
		super("Error occurred in simulator!");
	}

	public SimulatorException(String message) {
		super(message);
	}

	public SimulatorException(String message, Throwable cause) {
		super(message, cause);
	}
}
