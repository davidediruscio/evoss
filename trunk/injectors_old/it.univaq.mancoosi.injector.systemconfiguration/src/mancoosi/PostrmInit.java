/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postrm Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostrmInit#getScriptParam <em>Script Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostrmInit()
 * @model
 * @generated
 */
public interface PostrmInit extends UpdateEnvironmentStatement, DeletionFileSystemStatement {
	/**
	 * Returns the value of the '<em><b>Script Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Param</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Param</em>' reference.
	 * @see #setScriptParam(Script)
	 * @see mancoosi.MancoosiPackage#getPostrmInit_ScriptParam()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Script getScriptParam();

	/**
	 * Sets the value of the '{@link mancoosi.PostrmInit#getScriptParam <em>Script Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Param</em>' reference.
	 * @see #getScriptParam()
	 * @generated
	 */
	void setScriptParam(Script value);

} // PostrmInit
