/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Service#getExecutable <em>Executable</em>}</li>
 *   <li>{@link mancoosi.Service#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Executable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executable</em>' reference.
	 * @see #setExecutable(File)
	 * @see mancoosi.MancoosiPackage#getService_Executable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getExecutable();

	/**
	 * Sets the value of the '{@link mancoosi.Service#getExecutable <em>Executable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Executable</em>' reference.
	 * @see #getExecutable()
	 * @generated
	 */
	void setExecutable(File value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getRunningServices <em>Running Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getService_Env()
	 * @see mancoosi.Environment#getRunningServices
	 * @model opposite="runningServices" required="true" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.Service#getEnv <em>Env</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // Service
