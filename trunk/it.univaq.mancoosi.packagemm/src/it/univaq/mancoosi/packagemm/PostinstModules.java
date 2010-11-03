/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstModules#getKvers <em>Kvers</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstModules()
 * @model
 * @generated
 */
public interface PostinstModules extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Kvers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kvers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kvers</em>' containment reference.
	 * @see #setKvers(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstModules_Kvers()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getKvers();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstModules#getKvers <em>Kvers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kvers</em>' containment reference.
	 * @see #getKvers()
	 * @generated
	 */
	void setKvers(StringParam value);

} // PostinstModules
