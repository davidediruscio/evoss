/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documentation File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.DocumentationFile#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getDocumentationFile()
 * @model
 * @generated
 */
public interface DocumentationFile extends File {
	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDocumentationFiles <em>Documentation Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' container reference.
	 * @see #setPkg(InstalledPackage)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getDocumentationFile_Pkg()
	 * @see it.univaq.mancoosi.mancoosimm.InstalledPackage#getDocumentationFiles
	 * @model opposite="documentationFiles" required="true" transient="false" ordered="false"
	 * @generated
	 */
	InstalledPackage getPkg();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.DocumentationFile#getPkg <em>Pkg</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' container reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(InstalledPackage value);

} // DocumentationFile
