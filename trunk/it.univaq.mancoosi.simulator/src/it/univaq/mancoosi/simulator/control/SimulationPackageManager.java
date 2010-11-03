/**
 * 
 */
package it.univaq.mancoosi.simulator.control;


import it.univaq.mancoosi.simulator.exceptions.SimulatorException;
import it.univaq.mancoosi.simulator.util.SimulatorLogger;

/**
 * @author max
 * 
 */
abstract public class SimulationPackageManager {
	
	protected String packageNameInput;
	protected SimulatorLogger logger;
	protected PackageModelManager pkgModel;
	protected SystemModelManager systemModel;

	/**
	 * Constructor
	 * 
	 * @param packageName
	 * @throws SimulatorException
	 */
	protected SimulationPackageManager(String packageNameInput)
			throws Exception {
		this.packageNameInput = packageNameInput;
		pkgModel = new PackageModelManager(packageNameInput);
		logger = SimulatorLogger.getInstance();
	}

	/**
	 * 
	 * @throws Exception
	 */
	protected abstract void pre() throws Exception;

	/**
	 * @throws Exception 
	 * 
	 */
	protected abstract void unpacking() throws Exception;

	/**
	 * 
	 * @throws Exception
	 */
	protected abstract void post() throws Exception;

	/**
	 * @throws Exception 
	 * 
	 */
	protected abstract void finalSimul() throws Exception;

	/**
	 * 
	 * @throws Exception
	 */
	final public void execute() throws Exception {
		pre();
		unpacking();
		post();
		finalSimul();
	}
}
