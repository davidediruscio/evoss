/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Menu Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstMenuMethod#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstMenuMethod()
 * @model
 * @generated
 */
public interface PostinstMenuMethod extends UpdateEnvironmentStatement {
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
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstMenuMethod_Package()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	it.univaq.mancoosi.packagemm.Package getPackage();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstMenuMethod#getPackage <em>Package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' containment reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(it.univaq.mancoosi.packagemm.Package value);

} // PostinstMenuMethod
