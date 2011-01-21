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
 * A representation of the model object '<em><b>XFont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.XFont#getXfontCache <em>Xfont Cache</em>}</li>
 *   <li>{@link mancoosi.XFont#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getXFont()
 * @model
 * @generated
 */
public interface XFont extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Xfont Cache</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.XFontCache#getXfonts <em>Xfonts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xfont Cache</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xfont Cache</em>' container reference.
	 * @see #setXfontCache(XFontCache)
	 * @see mancoosi.MancoosiPackage#getXFont_XfontCache()
	 * @see mancoosi.XFontCache#getXfonts
	 * @model opposite="xfonts" required="true" transient="false" ordered="false"
	 * @generated
	 */
	XFontCache getXfontCache();

	/**
	 * Sets the value of the '{@link mancoosi.XFont#getXfontCache <em>Xfont Cache</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xfont Cache</em>' container reference.
	 * @see #getXfontCache()
	 * @generated
	 */
	void setXfontCache(XFontCache value);

	/**
	 * Returns the value of the '<em><b>File</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getXFont_File()
	 * @model type="mancoosi.File" required="true" ordered="false"
	 * @generated
	 */
	EList getFile();

} // XFont
