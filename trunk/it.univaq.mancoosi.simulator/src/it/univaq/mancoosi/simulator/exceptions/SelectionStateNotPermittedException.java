
package it.univaq.mancoosi.simulator.exceptions;



public class SelectionStateNotPermittedException extends SimulatorException {

	private static final long serialVersionUID = 607703691102191909L;

	public SelectionStateNotPermittedException() {
		super();
	}

	public SelectionStateNotPermittedException(String message) {
		super(message);
	}
}
