/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Content Iterator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.FileContentIterator#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getFileContentIterator()
 * @model
 * @generated
 */
public interface FileContentIterator extends Iterator {
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
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getFileContentIterator_File()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.FileContentIterator#getFile <em>File</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // FileContentIterator
