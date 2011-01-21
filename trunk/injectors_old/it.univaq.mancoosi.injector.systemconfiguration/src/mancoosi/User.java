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
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.User#getEnv <em>Env</em>}</li>
 *   <li>{@link mancoosi.User#getGroups <em>Groups</em>}</li>
 *   <li>{@link mancoosi.User#getHome <em>Home</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getUser()
 * @model
 * @generated
 */
public interface User extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getUser_Env()
	 * @see mancoosi.Environment#getUsers
	 * @model opposite="users" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.User#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

	/**
	 * Returns the value of the '<em><b>Groups</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Group}.
	 * It is bidirectional and its opposite is '{@link mancoosi.Group#getUsers <em>Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getUser_Groups()
	 * @see mancoosi.Group#getUsers
	 * @model type="mancoosi.Group" opposite="users" required="true" ordered="false"
	 * @generated
	 */
	EList getGroups();

	/**
	 * Returns the value of the '<em><b>Home</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home</em>' reference.
	 * @see #setHome(File)
	 * @see mancoosi.MancoosiPackage#getUser_Home()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getHome();

	/**
	 * Sets the value of the '{@link mancoosi.User#getHome <em>Home</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home</em>' reference.
	 * @see #getHome()
	 * @generated
	 */
	void setHome(File value);

} // User
