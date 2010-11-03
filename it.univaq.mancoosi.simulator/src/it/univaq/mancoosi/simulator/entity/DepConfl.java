package it.univaq.mancoosi.simulator.entity;

public class DepConfl {

	private Integer parentPosition;
	private String type;
	private String value;
	private String version;
	private String pkg;
	
	public DepConfl(Integer parentPosition, String type, String pkg, String value, String version) {
		this.setPkg(pkg);
		this.setType(type);
		this.setValue(value);
		this.setVersion(version);
		this.setParentPosition(parentPosition);
	}
	
	public DepConfl(Integer parentPosition, String type) {
		this.setParentPosition(parentPosition);
		this.setType(type);
	}

	/**
	 * @param pkg the pkg to set
	 */
	public void setPkg(String pkg) {
		this.pkg = pkg;
	}

	/**
	 * @return the pkg
	 */
	public String getPkg() {
		return pkg;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param parentPosition the parentPosition to set
	 */
	public void setParentPosition(Integer parentPosition) {
		this.parentPosition = parentPosition;
	}

	/**
	 * @return the parentPosition
	 */
	public Integer getParentPosition() {
		return parentPosition;
	}
}
