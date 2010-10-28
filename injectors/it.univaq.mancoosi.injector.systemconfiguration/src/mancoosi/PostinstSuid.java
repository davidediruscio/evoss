/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Suid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PostinstSuid#getPackage <em>Package</em>}</li>
 *   <li>{@link mancoosi.PostinstSuid#getFile <em>File</em>}</li>
 *   <li>{@link mancoosi.PostinstSuid#getOwner <em>Owner</em>}</li>
 *   <li>{@link mancoosi.PostinstSuid#getGroup <em>Group</em>}</li>
 *   <li>{@link mancoosi.PostinstSuid#getPerms <em>Perms</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPostinstSuid()
 * @model
 * @generated
 */
public interface PostinstSuid extends UpdateEnvironmentStatement, UpdateFileSytemStatement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(InstalledPackage)
	 * @see mancoosi.MancoosiPackage#getPostinstSuid_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstalledPackage getPackage();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSuid#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(InstalledPackage value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see mancoosi.MancoosiPackage#getPostinstSuid_File()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSuid#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstSuid_Owner()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getOwner();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSuid#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(StringParam value);

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
	 * @see mancoosi.MancoosiPackage#getPostinstSuid_Group()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getGroup();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSuid#getGroup <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(StringParam value);

	/**
	 * Returns the value of the '<em><b>Perms</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perms</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perms</em>' reference.
	 * @see #setPerms(StringParam)
	 * @see mancoosi.MancoosiPackage#getPostinstSuid_Perms()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StringParam getPerms();

	/**
	 * Sets the value of the '{@link mancoosi.PostinstSuid#getPerms <em>Perms</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perms</em>' reference.
	 * @see #getPerms()
	 * @generated
	 */
	void setPerms(StringParam value);

} // PostinstSuid
