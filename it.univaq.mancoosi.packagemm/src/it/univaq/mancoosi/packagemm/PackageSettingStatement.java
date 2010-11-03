/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Setting Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PackageSettingStatement#getPkgsetting <em>Pkgsetting</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackageSettingStatement()
 * @model abstract="true"
 * @generated
 */
public interface PackageSettingStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Pkgsetting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkgsetting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkgsetting</em>' attribute.
	 * @see #setPkgsetting(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPackageSettingStatement_Pkgsetting()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getPkgsetting();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PackageSettingStatement#getPkgsetting <em>Pkgsetting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkgsetting</em>' attribute.
	 * @see #getPkgsetting()
	 * @generated
	 */
	void setPkgsetting(String value);

} // PackageSettingStatement
