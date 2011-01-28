
package it.univaq.mancoosi.simulator.entity;


public class ActionPkg {

	private String packageName;
	private String packageVersion;
	private String packageArchitecture;
	private String action;

	

	/**
	 * Constructor
	 *
	 */
	public ActionPkg() {}
	
	
	/**
	 * Constructor
	 * 
	 * @param name
	 * @param action
	 * @param packageVersion 
	 * @param packageRelease 
	 * @param packageArchitecture 
	 */
	public ActionPkg(String packageName, String packageVersion,
			String packageArchitecture,
			String action) {
		this.packageName = packageName;
		this.packageVersion = packageVersion;
		this.packageArchitecture = packageArchitecture;
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

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
	}

	public String getPackageVersion() {
		return packageVersion;
	}

	public void setPackageArchitecture(String packageArchitecture) {
		this.packageArchitecture = packageArchitecture;
	}

	public String getPackageArchitecture() {
		return packageArchitecture;
	}

}
