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
 * A representation of the model object '<em><b>Mime Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.MimeType#getName <em>Name</em>}</li>
 *   <li>{@link mancoosi.MimeType#getExtension <em>Extension</em>}</li>
 *   <li>{@link mancoosi.MimeType#getMimeTypeHandlers <em>Mime Type Handlers</em>}</li>
 *   <li>{@link mancoosi.MimeType#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getMimeType()
 * @model
 * @generated
 */
public interface MimeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mancoosi.MancoosiPackage#getMimeType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mancoosi.MimeType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension</em>' attribute.
	 * @see #setExtension(String)
	 * @see mancoosi.MancoosiPackage#getMimeType_Extension()
	 * @model
	 * @generated
	 */
	String getExtension();

	/**
	 * Sets the value of the '{@link mancoosi.MimeType#getExtension <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension</em>' attribute.
	 * @see #getExtension()
	 * @generated
	 */
	void setExtension(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type Handlers</b></em>' reference list.
	 * The list contents are of type {@link mancoosi.MimeTypeHandler}.
	 * It is bidirectional and its opposite is '{@link mancoosi.MimeTypeHandler#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type Handlers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type Handlers</em>' reference list.
	 * @see mancoosi.MancoosiPackage#getMimeType_MimeTypeHandlers()
	 * @see mancoosi.MimeTypeHandler#getType
	 * @model type="mancoosi.MimeTypeHandler" opposite="type"
	 * @generated
	 */
	EList getMimeTypeHandlers();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.MimeTypeHandlerCache#getMimeTypes <em>Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' container reference.
	 * @see #setCache(MimeTypeHandlerCache)
	 * @see mancoosi.MancoosiPackage#getMimeType_Cache()
	 * @see mancoosi.MimeTypeHandlerCache#getMimeTypes
	 * @model opposite="mimeTypes" required="true" transient="false"
	 * @generated
	 */
	MimeTypeHandlerCache getCache();

	/**
	 * Sets the value of the '{@link mancoosi.MimeType#getCache <em>Cache</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' container reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(MimeTypeHandlerCache value);

} // MimeType
