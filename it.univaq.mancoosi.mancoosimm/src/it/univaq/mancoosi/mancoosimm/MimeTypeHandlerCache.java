/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

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
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getEnv <em>Env</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getHandlers <em>Handlers</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getMimeTypes <em>Mime Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandlerCache()
 * @model
 * @generated
 */
public interface MimeTypeHandlerCache extends EObject {
	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getMimeTypeHandlerCache <em>Mime Type Handler Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandlerCache_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getMimeTypeHandlerCache
	 * @model opposite="mimeTypeHandlerCache" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

	/**
	 * Returns the value of the '<em><b>Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handlers</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandlerCache_Handlers()
	 * @see it.univaq.mancoosi.mancoosimm.MimeTypeHandler#getCache
	 * @model opposite="cache" containment="true" ordered="false"
	 * @generated
	 */
	EList<MimeTypeHandler> getHandlers();

	/**
	 * Returns the value of the '<em><b>Mime Types</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.MimeType}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.MimeType#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Types</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getMimeTypeHandlerCache_MimeTypes()
	 * @see it.univaq.mancoosi.mancoosimm.MimeType#getCache
	 * @model opposite="cache" containment="true"
	 * @generated
	 */
	EList<MimeType> getMimeTypes();

} // MimeTypeHandlerCache
