/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Setting Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PackageSettingStatement#getPkgsetting <em>Pkgsetting</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPackageSettingStatement()
 * @model abstract="true"
 * @generated
 */
public interface PackageSettingStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Pkgsetting</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkgsetting</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkgsetting</em>' reference.
	 * @see #setPkgsetting(PackageSetting)
	 * @see mancoosi.MancoosiPackage#getPackageSettingStatement_Pkgsetting()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageSetting getPkgsetting();

	/**
	 * Sets the value of the '{@link mancoosi.PackageSettingStatement#getPkgsetting <em>Pkgsetting</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkgsetting</em>' reference.
	 * @see #getPkgsetting()
	 * @generated
	 */
	void setPkgsetting(PackageSetting value);

} // PackageSettingStatement
