/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.MimeType;
import mancoosi.MimeTypeHandler;

import mancoosi.MimeTypeHandlerCache;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mime Type Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.MimeTypeHandlerImpl#getHandler <em>Handler</em>}</li>
 *   <li>{@link mancoosi.impl.MimeTypeHandlerImpl#getType <em>Type</em>}</li>
 *   <li>{@link mancoosi.impl.MimeTypeHandlerImpl#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MimeTypeHandlerImpl extends EObjectImpl implements MimeTypeHandler {
	/**
	 * The cached value of the '{@link #getHandler() <em>Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandler()
	 * @generated
	 * @ordered
	 */
	protected File handler;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MimeType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MimeTypeHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getMimeTypeHandler();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MimeType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.MIME_TYPE_HANDLER__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(MimeType newType, NotificationChain msgs) {
		MimeType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE_HANDLER__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MimeType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS, MimeType.class, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS, MimeType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE_HANDLER__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandlerCache getCache() {
		if (eContainerFeatureID() != MancoosiPackage.MIME_TYPE_HANDLER__CACHE) return null;
		return (MimeTypeHandlerCache)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCache(MimeTypeHandlerCache newCache, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCache, MancoosiPackage.MIME_TYPE_HANDLER__CACHE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(MimeTypeHandlerCache newCache) {
		if (newCache != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.MIME_TYPE_HANDLER__CACHE && newCache != null)) {
			if (EcoreUtil.isAncestor(this, newCache))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS, MimeTypeHandlerCache.class, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE_HANDLER__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER__TYPE:
				if (type != null)
					msgs = ((InternalEObject)type).eInverseRemove(this, MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS, MimeType.class, msgs);
				return basicSetType((MimeType)otherEnd, msgs);
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCache((MimeTypeHandlerCache)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER__TYPE:
				return basicSetType(null, msgs);
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				return basicSetCache(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__HANDLERS, MimeTypeHandlerCache.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File getHandler() {
		if (handler != null && handler.eIsProxy()) {
			InternalEObject oldHandler = (InternalEObject)handler;
			handler = (File)eResolveProxy(oldHandler);
			if (handler != oldHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.MIME_TYPE_HANDLER__HANDLER, oldHandler, handler));
			}
		}
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File basicGetHandler() {
		return handler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandler(File newHandler) {
		File oldHandler = handler;
		handler = newHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE_HANDLER__HANDLER, oldHandler, handler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER__HANDLER:
				if (resolve) return getHandler();
				return basicGetHandler();
			case MancoosiPackage.MIME_TYPE_HANDLER__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				return getCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER__HANDLER:
				setHandler((File)newValue);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER__TYPE:
				setType((MimeType)newValue);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				setCache((MimeTypeHandlerCache)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER__HANDLER:
				setHandler((File)null);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER__TYPE:
				setType((MimeType)null);
				return;
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				setCache((MimeTypeHandlerCache)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE_HANDLER__HANDLER:
				return handler != null;
			case MancoosiPackage.MIME_TYPE_HANDLER__TYPE:
				return type != null;
			case MancoosiPackage.MIME_TYPE_HANDLER__CACHE:
				return getCache() != null;
		}
		return super.eIsSet(featureID);
	}

} //MimeTypeHandlerImpl
