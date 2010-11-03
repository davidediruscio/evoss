/**
 * 
 */
package it.univaq.mancoosi.simulator.entity;

/**
 * 
 * @author max
 */
public class ActionPkg {

	private String packageNameInput;
	private String action;

	/**
	 * Constructor
	 * 
	 * @param name
	 * @param action
	 */
	public ActionPkg(String name, String action) {
		packageNameInput = name;
		this.action = action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param namePackage
	 *            the namePackage to set
	 */
	public void setNamePackageInput(String packageNameInput) {
		this.packageNameInput = packageNameInput;
	}

	/**
	 * @return the namePackage
	 */
	public String getPackageNameInput() {
		return packageNameInput;
	}

}
