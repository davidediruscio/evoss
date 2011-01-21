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
 * A representation of the model object '<em><b>File System Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.FileSystemStatement#getFiles <em>Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getFileSystemStatement()
 * @model abstract="true"
 * @generated
 */
public interface FileSystemStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getFileSystemStatement_Files()
	 * @model type="mancoosi.File" required="true" ordered="false"
	 * @generated
	 */
	EList getFiles();

} // FileSystemStatement
