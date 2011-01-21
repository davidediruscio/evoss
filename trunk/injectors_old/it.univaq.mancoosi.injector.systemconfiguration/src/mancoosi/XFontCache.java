/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFont Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.XFontCache#getXfonts <em>Xfonts</em>}</li>
 *   <li>{@link mancoosi.XFontCache#getLocation <em>Location</em>}</li>
 *   <li>{@link mancoosi.XFontCache#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getXFontCache()
 * @model
 * @generated
 */
public interface XFontCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Xfonts</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.XFont}.
	 * It is bidirectional and its opposite is '{@link mancoosi.XFont#getXfontCache <em>Xfont Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xfonts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xfonts</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getXFontCache_Xfonts()
	 * @see mancoosi.XFont#getXfontCache
	 * @model type="mancoosi.XFont" opposite="xfontCache" containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList getXfonts();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see mancoosi.MancoosiPackage#getXFontCache_Location()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link mancoosi.XFontCache#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getXfontCaches <em>Xfont Caches</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getXFontCache_Env()
	 * @see mancoosi.Environment#getXfontCaches
	 * @model opposite="xfontCaches" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.XFontCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // XFontCache
