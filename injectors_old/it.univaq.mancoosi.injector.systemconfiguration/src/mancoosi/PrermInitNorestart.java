/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerm Init Norestart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PrermInitNorestart#getScriptParam <em>Script Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPrermInitNorestart()
 * @model
 * @generated
 */
public interface PrermInitNorestart extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Param</em>' reference.
	 * @see #setScriptParam(File)
	 * @see mancoosi.MancoosiPackage#getPrermInitNorestart_ScriptParam()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getScriptParam();

	/**
	 * Sets the value of the '{@link mancoosi.PrermInitNorestart#getScriptParam <em>Script Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Param</em>' reference.
	 * @see #getScriptParam()
	 * @generated
	 */
	void setScriptParam(File value);

} // PrermInitNorestart
