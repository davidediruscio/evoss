/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerm Emacsen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PrermEmacsen#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPrermEmacsen()
 * @model
 * @generated
 */
public interface PrermEmacsen extends UpdateEnvironmentStatement, UpdatePackageSettingStatement {
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
	 * @see mancoosi.MancoosiPackage#getPrermEmacsen_Package()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InstalledPackage getPackage();

	/**
	 * Sets the value of the '{@link mancoosi.PrermEmacsen#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(InstalledPackage value);

} // PrermEmacsen
