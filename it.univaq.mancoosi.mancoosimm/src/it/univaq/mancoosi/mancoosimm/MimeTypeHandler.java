/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mime Type Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getHandler <em>Handler</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getType <em>Type</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandler()
 * @model
 * @generated
 */
public interface MimeTypeHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler</em>' reference.
	 * @see #setHandler(File)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandler_Handler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	File getHandler();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getHandler <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler</em>' reference.
	 * @see #getHandler()
	 * @generated
	 */
	void setHandler(File value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.MimeType#getMimeTypeHandlers <em>Mime Type Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MimeType)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandler_Type()
	 * @see it.univaq.mancoosi.mancoosimm.MimeType#getMimeTypeHandlers
	 * @model opposite="mimeTypeHandlers"
	 * @generated
	 */
	MimeType getType();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MimeType value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getHandlers <em>Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' container reference.
	 * @see #setCache(MimeTypeHandlerCache)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandler_Cache()
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getHandlers
	 * @model opposite="handlers" required="true" transient="false"
	 * @generated
	 */
	MimeTypeHandlerCache getCache();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getCache <em>Cache</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' container reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(MimeTypeHandlerCache value);

} // MimeTypeHandler
