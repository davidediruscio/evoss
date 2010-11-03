/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Suid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstSuid#getPackage <em>Package</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstSuid#getFile <em>File</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstSuid#getOwner <em>Owner</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstSuid#getGroup <em>Group</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstSuid#getPerms <em>Perms</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstSuid()
 * @model
 * @generated
 */
public interface PostinstSuid extends UpdateEnvironmentStatement, UpdateFileSystemStatement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(it.univaq.mancoosi.packagemm.Package)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstSuid_Package()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	it.univaq.mancoosi.packagemm.Package getPackage();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(it.univaq.mancoosi.packagemm.Package value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstSuid_File()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' containment reference.
	 * @see #setOwner(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstSuid_Owner()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getOwner();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getOwner <em>Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' containment reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(StringParam value);

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
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstSuid_Group()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getGroup();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(StringParam value);

	/**
	 * Returns the value of the '<em><b>Perms</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perms</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perms</em>' containment reference.
	 * @see #setPerms(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstSuid_Perms()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getPerms();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstSuid#getPerms <em>Perms</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perms</em>' containment reference.
	 * @see #getPerms()
	 * @generated
	 */
	void setPerms(StringParam value);

} // PostinstSuid
