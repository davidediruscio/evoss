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
 * A representation of the model object '<em><b>Mime Type Handler Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.MimeTypeHandlerCache#getEnv <em>Env</em>}</li>
 *   <li>{@link mancoosi.MimeTypeHandlerCache#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link mancoosi.MimeTypeHandlerCache#getMimeTypes <em>Mime Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getMimeTypeHandlerCache()
 * @model
 * @generated
 */
public interface MimeTypeHandlerCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see mancoosi.MancoosiPackage#getMimeTypeHandlerCache_Env()
	 * @see mancoosi.Environment#getMimeTypeHandlerCache
	 * @model opposite="mimeTypeHandlerCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link mancoosi.MimeTypeHandlerCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.MimeTypeHandler}.
	 * It is bidirectional and its opposite is '{@link mancoosi.MimeTypeHandler#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getMimeTypeHandlerCache_Handlers()
	 * @see mancoosi.MimeTypeHandler#getCache
	 * @model type="mancoosi.MimeTypeHandler" opposite="cache" containment="true" ordered="false"
	 * @generated
	 */
	EList getHandlers();

	/**
	 * Returns the value of the '<em><b>Mime Types</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.MimeType}.
	 * It is bidirectional and its opposite is '{@link mancoosi.MimeType#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Types</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Types</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getMimeTypeHandlerCache_MimeTypes()
	 * @see mancoosi.MimeType#getCache
	 * @model type="mancoosi.MimeType" opposite="cache" containment="true"
	 * @generated
	 */
	EList getMimeTypes();

} // MimeTypeHandlerCache
