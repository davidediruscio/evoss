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
 * A representation of the model object '<em><b>Library Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getLocations <em>Locations</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getSharedLibraries <em>Shared Libraries</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getLibraryCache()
 * @model
 * @generated
 */
public interface LibraryCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getLibraryCache_Locations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<File> getLocations();

	/**
	 * Returns the value of the '<em><b>Shared Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.SharedLibrary}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.SharedLibrary#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Libraries</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getLibraryCache_SharedLibraries()
	 * @see it.univaq.mancoosi.mancoosimm.SharedLibrary#getLibraryCache
	 * @model opposite="libraryCache" containment="true" ordered="false"
	 * @generated
	 */
	EList<SharedLibrary> getSharedLibraries();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getLibraryCache_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getLibraryCache
	 * @model opposite="libraryCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.LibraryCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // LibraryCache
