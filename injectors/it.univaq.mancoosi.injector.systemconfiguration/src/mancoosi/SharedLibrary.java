/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.SharedLibrary#getName <em>Name</em>}</li>
 *   <li>{@link mancoosi.SharedLibrary#getFile <em>File</em>}</li>
 *   <li>{@link mancoosi.SharedLibrary#getVersion <em>Version</em>}</li>
 *   <li>{@link mancoosi.SharedLibrary#getLibraryCache <em>Library Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getSharedLibrary()
 * @model
 * @generated
 */
public interface SharedLibrary extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mancoosi.MancoosiPackage#getSharedLibrary_Name()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mancoosi.SharedLibrary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see mancoosi.MancoosiPackage#getSharedLibrary_File()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link mancoosi.SharedLibrary#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

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
	 * @see mancoosi.MancoosiPackage#getSharedLibrary_Version()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link mancoosi.SharedLibrary#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Library Cache</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.LibraryCache#getSharedLibraries <em>Shared Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Cache</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Cache</em>' container reference.
	 * @see #setLibraryCache(LibraryCache)
	 * @see mancoosi.MancoosiPackage#getSharedLibrary_LibraryCache()
	 * @see mancoosi.LibraryCache#getSharedLibraries
	 * @model opposite="sharedLibraries" required="true" transient="false" ordered="false"
	 * @generated
	 */
	LibraryCache getLibraryCache();

	/**
	 * Sets the value of the '{@link mancoosi.SharedLibrary#getLibraryCache <em>Library Cache</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Cache</em>' container reference.
	 * @see #getLibraryCache()
	 * @generated
	 */
	void setLibraryCache(LibraryCache value);

} // SharedLibrary
