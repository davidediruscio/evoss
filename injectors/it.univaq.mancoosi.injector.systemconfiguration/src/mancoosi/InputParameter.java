/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.InputParameter#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getInputParameter()
 * @model
 * @generated
 */
public interface InputParameter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Script#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' container reference.
	 * @see #setScript(Script)
	 * @see mancoosi.MancoosiPackage#getInputParameter_Script()
	 * @see mancoosi.Script#getInputParameters
	 * @model opposite="inputParameters" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link mancoosi.InputParameter#getScript <em>Script</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' container reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

} // InputParameter
