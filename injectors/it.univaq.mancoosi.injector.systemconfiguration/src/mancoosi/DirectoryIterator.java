/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.DirectoryIterator#getDirectory <em>Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getDirectoryIterator()
 * @model
 * @generated
 */
public interface DirectoryIterator extends Iterator {
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' reference.
	 * @see #setDirectory(File)
	 * @see mancoosi.MancoosiPackage#getDirectoryIterator_Directory()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getDirectory();

	/**
	 * Sets the value of the '{@link mancoosi.DirectoryIterator#getDirectory <em>Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' reference.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(File value);

} // DirectoryIterator
