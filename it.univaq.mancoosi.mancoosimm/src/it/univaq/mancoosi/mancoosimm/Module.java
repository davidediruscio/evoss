/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Module#getFile <em>File</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.Module#getModuleCache <em>Module Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends NamedElement {
	/**
	 * Returns the value of the '<em><b>File</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference.
	 * @see #setFile(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModule_File()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Module#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * Returns the value of the '<em><b>Module Cache</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module Cache</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module Cache</em>' container reference.
	 * @see #setModuleCache(ModuleCache)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModule_ModuleCache()
	 * @see it.univaq.mancoosi.mancoosimm.ModuleCache#getModules
	 * @model opposite="modules" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ModuleCache getModuleCache();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.Module#getModuleCache <em>Module Cache</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module Cache</em>' container reference.
	 * @see #getModuleCache()
	 * @generated
	 */
	void setModuleCache(ModuleCache value);

} // Module
