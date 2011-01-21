/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

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
 *   <li>{@link mancoosi.LibraryCache#getLocations <em>Locations</em>}</li>
 *   <li>{@link mancoosi.LibraryCache#getSharedLibraries <em>Shared Libraries</em>}</li>
 *   <li>{@link mancoosi.LibraryCache#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getLibraryCache()
 * @model
 * @generated
 */
public interface LibraryCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Locations</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Locations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getLibraryCache_Locations()
	 * @model type="mancoosi.File" ordered="false"
	 * @generated
	 */
	EList getLocations();

	/**
	 * Returns the value of the '<em><b>Shared Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.SharedLibrary}.
	 * It is bidirectional and its opposite is '{@link mancoosi.SharedLibrary#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared Libraries</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getLibraryCache_SharedLibraries()
	 * @see mancoosi.SharedLibrary#getLibraryCache
	 * @model type="mancoosi.SharedLibrary" opposite="libraryCache" containment="true" ordered="false"
	 * @generated
	 */
	EList getSharedLibraries();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getLibraryCache <em>Library Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getLibraryCache_Env()
	 * @see mancoosi.Environment#getLibraryCache
	 * @model opposite="libraryCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.LibraryCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // LibraryCache
