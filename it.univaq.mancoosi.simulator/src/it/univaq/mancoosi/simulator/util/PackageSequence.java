/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.PackageSequenceFileException;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * Abstract class to handle different file
 * formats of sequence packets
 * @author max
 */
public abstract class PackageSequence {

	protected static SimulatorConfig config = null;

	protected static PackageSequence INSTANCE = null;

	public static PackageSequence getInstance()throws SimulatorException {
		
		if (INSTANCE == null) {

			config = SimulatorConfig.getInstance();

			// To change if file format changes
			if ((config.getFilePackageSequence()).endsWith(".xml")) {
				INSTANCE = new PackageSequenceFileXML();
			} else {
					throw new PackageSequenceFileException("Format PackageSequence '" +config.getFilePackageSequence() + "' not supported");
			}
		}

		return INSTANCE;
	}

	/**
	 * Returns the package name in the required position
	 * 
	 * @param index Position in the sequence
	 * @return Package name
	 */
	abstract public String getPackageNameInput(int index);

	/**
	 * Returns the action to perform on 
	 * the package in the required position
	 * 
	 * @param index Position in the sequence
	 * @return Action to perform on the packet
	 */
	abstract public String getPackageAction(int index);

	/**
	 * Returns the number of packages involved
	 * @return Number of packages
	 */
	abstract public int getSizePackageSequence();
}
