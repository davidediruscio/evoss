/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.DocumentationFile#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getDocumentationFile()
 * @model
 * @generated
 */
public interface DocumentationFile extends File {
	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.InstalledPackage#getDocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(InstalledPackage)
	 * @see mancoosi.MancoosiPackage#getDocumentationFile_Pkg()
	 * @see mancoosi.InstalledPackage#getDocumentationFiles
	 * @model opposite="documentationFiles" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InstalledPackage getPkg();

	/**
	 * Sets the value of the '{@link mancoosi.DocumentationFile#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(InstalledPackage value);

} // DocumentationFile
