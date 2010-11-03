/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Emacsen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstEmacsen#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstEmacsen()
 * @model
 * @generated
 */
public interface PostinstEmacsen extends UpdateEnvironmentStatement, UpdatePackageSettingStatement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' containment reference.
	 * @see #setPackage(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstEmacsen_Package()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	File getPackage();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstEmacsen#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(File value);

} // PostinstEmacsen
