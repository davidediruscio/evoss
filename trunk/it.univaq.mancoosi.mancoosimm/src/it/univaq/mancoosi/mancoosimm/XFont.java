/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.XFont#getXfontCache <em>Xfont Cache</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.XFont#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getXFont()
 * @model
 * @generated
 */
public interface XFont extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Xfont Cache</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.XFontCache#getXfonts <em>Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xfont Cache</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xfont Cache</em>' container reference.
	 * @see #setXfontCache(XFontCache)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getXFont_XfontCache()
	 * @see it.univaq.mancoosi.mancoosimm.XFontCache#getXfonts
	 * @model opposite="xfonts" required="true" transient="false" ordered="false"
	 * @generated
	 */
	XFontCache getXfontCache();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.XFont#getXfontCache <em>Xfont Cache</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xfont Cache</em>' container reference.
	 * @see #getXfontCache()
	 * @generated
	 */
	void setXfontCache(XFontCache value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getXFont_File()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<File> getFile();

} // XFont
