/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.DocumentationFile#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDocumentationFile()
 * @model
 * @generated
 */
public interface DocumentationFile extends File {
	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.Package#getDocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' reference.
	 * @see #setPkg(it.univaq.mancoosi.packagemm.Package)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getDocumentationFile_Pkg()
	 * @see it.univaq.mancoosi.packagemm.Package#getDocumentationFiles
	 * @model opposite="documentationFiles" required="true" ordered="false"
	 * @generated
	 */
	it.univaq.mancoosi.packagemm.Package getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.DocumentationFile#getPkg <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(it.univaq.mancoosi.packagemm.Package value);

} // DocumentationFile
