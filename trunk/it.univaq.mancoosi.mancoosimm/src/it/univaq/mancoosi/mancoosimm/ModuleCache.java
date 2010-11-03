/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getVersion <em>Version</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getModules <em>Modules</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModuleCache()
 * @model
 * @generated
 */
public interface ModuleCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModuleCache_Version()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.Module}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Module#getModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModuleCache_Modules()
	 * @see it.univaq.mancoosi.mancoosimm.Module#getModuleCache
	 * @model opposite="moduleCache" containment="true" ordered="false"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getModuleCache <em>Module Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getModuleCache_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getModuleCache
	 * @model opposite="moduleCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.ModuleCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // ModuleCache
