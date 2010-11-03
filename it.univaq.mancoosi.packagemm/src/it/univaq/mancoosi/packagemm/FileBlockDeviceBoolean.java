/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Block Device Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getFileBlockDeviceBoolean()
 * @model
 * @generated
 */
public interface FileBlockDeviceBoolean extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' containment reference.
	 * @see #setFile(File)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getFileBlockDeviceBoolean_File()
	 * @model containment="true" required="true"
	 * @generated
	 */
	File getFile();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean#getFile <em>File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File</em>' containment reference.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

} // FileBlockDeviceBoolean
