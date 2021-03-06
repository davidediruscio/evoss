/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SGML Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SGMLDocument#getLocation <em>Location</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SGMLDocument#getDocument <em>Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSGMLDocument()
 * @model
 * @generated
 */
public interface SGMLDocument extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSGMLDocument_Location()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getLocation();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.SGMLDocument#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(File value);

	/**
	 * Returns the value of the '<em><b>Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document</em>' reference.
	 * @see #setDocument(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSGMLDocument_Document()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getDocument();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.SGMLDocument#getDocument <em>Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document</em>' reference.
	 * @see #getDocument()
	 * @generated
	 */
	void setDocument(File value);

} // SGMLDocument
