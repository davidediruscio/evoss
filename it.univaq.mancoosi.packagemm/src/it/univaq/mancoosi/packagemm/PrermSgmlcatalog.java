/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerm Sgmlcatalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PrermSgmlcatalog#getCentralcat <em>Centralcat</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPrermSgmlcatalog()
 * @model
 * @generated
 */
public interface PrermSgmlcatalog extends UpdateEnvironmentStatement, DeletionPackageSettingStatement {
	/**
	 * Returns the value of the '<em><b>Centralcat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centralcat</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centralcat</em>' containment reference.
	 * @see #setCentralcat(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPrermSgmlcatalog_Centralcat()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	File getCentralcat();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PrermSgmlcatalog#getCentralcat <em>Centralcat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centralcat</em>' containment reference.
	 * @see #getCentralcat()
	 * @generated
	 */
	void setCentralcat(File value);

} // PrermSgmlcatalog
