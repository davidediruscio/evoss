/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Usrlocal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstUsrlocal#getDir <em>Dir</em>}</li>
 *   <li>{@link mancoosi.PostinstUsrlocal#getMode <em>Mode</em>}</li>
 *   <li>{@link mancoosi.PostinstUsrlocal#getUser <em>User</em>}</li>
 *   <li>{@link mancoosi.PostinstUsrlocal#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstUsrlocal()
 * @model
 * @generated
 */
public interface PostinstUsrlocal extends UpdateFileSytemStatement {
	/**
	 * Returns the value of the '<em><b>Dir</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' reference.
	 * @see #setDir(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstUsrlocal_Dir()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getDir();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstUsrlocal#getDir <em>Dir</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' reference.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(StringParam value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' reference.
	 * @see #setMode(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstUsrlocal_Mode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getMode();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstUsrlocal#getMode <em>Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(StringParam value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstUsrlocal_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getUser();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstUsrlocal#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(StringParam value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' reference.
	 * @see #setGroup(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstUsrlocal_Group()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getGroup();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstUsrlocal#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(StringParam value);

} // PostinstUsrlocal
