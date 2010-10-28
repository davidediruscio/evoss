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
 * A representation of the model object '<em><b>File System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.FileSystem#getRoot <em>Root</em>}</li>
 *   <li>{@link mancoosi.FileSystem#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link mancoosi.FileSystem#getAllFiles <em>All Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getFileSystem()
 * @model
 * @generated
 */
public interface FileSystem extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.File#getFs <em>Fs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(File)
	 * @see mancoosi.MancoosiPackage#getFileSystem_Root()
	 * @see mancoosi.File#getFs
	 * @model opposite="fs" containment="true" required="true" ordered="false"
	 * @generated
	 */
	File getRoot();

	/**
	 * Sets the value of the '{@link mancoosi.FileSystem#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(File value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Configuration#getFileSystem <em>File System</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' container reference.
	 * @see #setConfiguration(Configuration)
	 * @see mancoosi.MancoosiPackage#getFileSystem_Configuration()
	 * @see mancoosi.Configuration#getFileSystem
	 * @model opposite="fileSystem" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link mancoosi.FileSystem#getConfiguration <em>Configuration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' container reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>All Files</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Files</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getFileSystem_AllFiles()
	 * @model type="mancoosi.File"
	 * @generated
	 */
	EList getAllFiles();

} // FileSystem
