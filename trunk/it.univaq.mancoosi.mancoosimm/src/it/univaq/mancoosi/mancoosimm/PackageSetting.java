/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Setting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getServices <em>Services</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getPkg <em>Pkg</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getDependences <em>Dependences</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getPackageSetting()
 * @model
 * @generated
 */
public interface PackageSetting extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getPackageSetting_Services()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.File}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.File#getPkgSettings <em>Pkg Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getPackageSetting_Files()
	 * @see it.univaq.mancoosi.mancoosimm.File#getPkgSettings
	 * @model opposite="pkgSettings" ordered="false"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Package#getPackageSettings <em>Package Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(it.univaq.mancoosi.mancoosimm.Package)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getPackageSetting_Pkg()
	 * @see it.univaq.mancoosi.mancoosimm.Package#getPackageSettings
	 * @model opposite="packageSettings" required="true" transient="false" ordered="false"
	 * @generated
	 */
	it.univaq.mancoosi.mancoosimm.Package getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.PackageSetting#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(it.univaq.mancoosi.mancoosimm.Package value);

	/**
	 * Returns the value of the '<em><b>Dependences</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.PackageSetting}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependences</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependences</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getPackageSetting_Dependences()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PackageSetting> getDependences();

} // PackageSetting
