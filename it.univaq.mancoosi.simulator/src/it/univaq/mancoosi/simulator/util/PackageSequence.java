/**
 * 
 */
package it.univaq.mancoosi.simulator.util;

import it.univaq.mancoosi.simulator.exceptions.PackageSequenceFileException;
import it.univaq.mancoosi.simulator.exceptions.SimulatorException;

/**
 * Abstract class to handle different file
 * formats of sequence package
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
				INSTANCE = new XmlPackageSequence();
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
	abstract public String getPackageName(int index);
	
	/**
	 * Returns the package version in the required position
	 * 
	 * @param index Position in the sequence
	 * @return Package version
	 */
	abstract public String getPackageVersion(int index);

	
	/**
	 * Returns the package architecture in the required position
	 * 
	 * @param index Position in the sequence
	 * @return Package architecture
	 */
	abstract public String getPackageArchitecture(int index);

	
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
