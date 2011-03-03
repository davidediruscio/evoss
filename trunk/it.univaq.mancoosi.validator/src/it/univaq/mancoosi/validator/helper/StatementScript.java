/**
 * 
 */
package it.univaq.mancoosi.validator.helper;


public class StatementScript {
	private String type;
	private String container;
	private String containingFeature;
	private int position;
	
	/**
	 * Constructor
	 * @param type
	 * @param container
	 * @param containingFeature
	 * @param position
	 */
	public StatementScript(String type, String container, String containingFeature, int position) {
		this.type = type;
		this.container = container;
		this.containingFeature = containingFeature;
		this.position = position;
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
	 * @param container the container to set
	 */
	public void setContainer(String container) {
		this.container = container;
	}
	/**
	 * @return the container
	 */
	public String getContainer() {
		return container;
	}
	/**
	 * @param containingFeature the containingFeature to set
	 */
	public void setContainingFeature(String containingFeature) {
		this.containingFeature = containingFeature;
	}
	/**
	 * @return the containingFeature
	 */
	public String getContainingFeature() {
		return containingFeature;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	/**
	 * @return the position
	 */
	public int getPosition() {
		return position;
	}

}
