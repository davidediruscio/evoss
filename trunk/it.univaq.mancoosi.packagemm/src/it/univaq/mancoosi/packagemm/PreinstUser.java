/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Preinst User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PreinstUser#getDir <em>Dir</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PreinstUser#getMode <em>Mode</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PreinstUser#getUser <em>User</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PreinstUser#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPreinstUser()
 * @model
 * @generated
 */
public interface PreinstUser extends UpdateFileSystemStatement {
	/**
	 * Returns the value of the '<em><b>Dir</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' containment reference.
	 * @see #setDir(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPreinstUser_Dir()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getDir();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PreinstUser#getDir <em>Dir</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' containment reference.
	 * @see #getDir()
	 * @generated
	 */
	void setDir(StringParam value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' containment reference.
	 * @see #setMode(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPreinstUser_Mode()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getMode();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PreinstUser#getMode <em>Mode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' containment reference.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(StringParam value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' containment reference.
	 * @see #setUser(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPreinstUser_User()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getUser();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PreinstUser#getUser <em>User</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' containment reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(StringParam value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPreinstUser_Group()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getGroup();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PreinstUser#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(StringParam value);

} // PreinstUser
