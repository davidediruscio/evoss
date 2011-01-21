/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Init</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstInit#getScriptParam <em>Script Param</em>}</li>
 *   <li>{@link mancoosi.PostinstInit#getInitParams <em>Init Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstInit()
 * @model
 * @generated
 */
public interface PostinstInit extends UpdateEnvironmentStatement {
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
	 * @see mancoosi.MancoosiPackage#getPostinstInit_ScriptParam()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Script getScriptParam();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstInit#getScriptParam <em>Script Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Param</em>' reference.
	 * @see #getScriptParam()
	 * @generated
	 */
	void setScriptParam(Script value);

	/**
	 * Returns the value of the '<em><b>Init Params</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Param}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Params</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Params</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPostinstInit_InitParams()
	 * @model type="mancoosi.Param" ordered="false"
	 * @generated
	 */
	EList getInitParams();

} // PostinstInit
