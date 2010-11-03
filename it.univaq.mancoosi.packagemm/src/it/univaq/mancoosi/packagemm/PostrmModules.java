/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postrm Modules</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostrmModules#getKvers <em>Kvers</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostrmModules()
 * @model
 * @generated
 */
public interface PostrmModules extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Kvers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kvers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kvers</em>' containment reference.
	 * @see #setKvers(IntParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostrmModules_Kvers()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	IntParam getKvers();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostrmModules#getKvers <em>Kvers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kvers</em>' containment reference.
	 * @see #getKvers()
	 * @generated
	 */
	void setKvers(IntParam value);

} // PostrmModules
