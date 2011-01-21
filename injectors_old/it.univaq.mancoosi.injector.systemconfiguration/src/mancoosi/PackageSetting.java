/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.PackageSetting#getServices <em>Services</em>}</li>
 *   <li>{@link mancoosi.PackageSetting#getFiles <em>Files</em>}</li>
 *   <li>{@link mancoosi.PackageSetting#getPkg <em>Pkg</em>}</li>
 *   <li>{@link mancoosi.PackageSetting#getDependences <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getPackageSetting()
 * @model
 * @generated
 */
public interface PackageSetting extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPackageSetting_Services()
	 * @model type="mancoosi.Service" ordered="false"
	 * @generated
	 */
	EList getServices();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * It is bidirectional and its opposite is '{@link mancoosi.File#getPkgSettings <em>Pkg Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPackageSetting_Files()
	 * @see mancoosi.File#getPkgSettings
	 * @model type="mancoosi.File" opposite="pkgSettings" ordered="false"
	 * @generated
	 */
	EList getFiles();

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Package#getPackageSettings <em>Package Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(mancoosi.Package)
	 * @see mancoosi.MancoosiPackage#getPackageSetting_Pkg()
	 * @see mancoosi.Package#getPackageSettings
	 * @model opposite="packageSettings" required="true" transient="false" ordered="false"
	 * @generated
	 */
	mancoosi.Package getPkg();

	/**
	 * Sets the value of the '{@link mancoosi.PackageSetting#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(mancoosi.Package value);

	/**
	 * Returns the value of the '<em><b>Dependences</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.PackageSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependences</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getPackageSetting_Dependences()
	 * @model type="mancoosi.PackageSetting" ordered="false"
	 * @generated
	 */
	EList getDependences();

} // PackageSetting
