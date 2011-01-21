/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.EnvironmentStatement#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getEnvironmentStatement()
 * @model abstract="true"
 * @generated
 */
public interface EnvironmentStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Environment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see mancoosi.MancoosiPackage#getEnvironmentStatement_Environment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link mancoosi.EnvironmentStatement#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

} // EnvironmentStatement
