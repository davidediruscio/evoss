/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Udev</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstUdev#getOld <em>Old</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstUdev#getRule <em>Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstUdev()
 * @model
 * @generated
 */
public interface PostinstUdev extends UpdateFileSystemStatement {
	/**
	 * Returns the value of the '<em><b>Old</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old</em>' containment reference.
	 * @see #setOld(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstUdev_Old()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	File getOld();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstUdev#getOld <em>Old</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old</em>' containment reference.
	 * @see #getOld()
	 * @generated
	 */
	void setOld(File value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference.
	 * @see #setRule(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstUdev_Rule()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	File getRule();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstUdev#getRule <em>Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' containment reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(File value);

} // PostinstUdev
