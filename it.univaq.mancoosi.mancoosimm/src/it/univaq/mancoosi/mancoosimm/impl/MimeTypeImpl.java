/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.MimeType;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mime Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl#getExtension <em>Extension</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl#getMimeTypeHandlers <em>Mime Type Handlers</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.MimeTypeImpl#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MimeTypeImpl extends EObjectImpl implements MimeType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMimeTypeHandlers() <em>Mime Type Handlers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMimeTypeHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<MimeTypeHandler> mimeTypeHandlers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MimeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.MIME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MimeTypeHandler> getMimeTypeHandlers() {
		if (mimeTypeHandlers == null) {
			mimeTypeHandlers = new EObjectWithInverseResolvingEList<MimeTypeHandler>(MimeTypeHandler.class, this, MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS, MancoosiPackage.MIME_TYPE_HANDLER__TYPE);
		}
		return mimeTypeHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandlerCache getCache() {
		if (eContainerFeatureID() != MancoosiPackage.MIME_TYPE__CACHE) return null;
		return (MimeTypeHandlerCache)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCache(MimeTypeHandlerCache newCache, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCache, MancoosiPackage.MIME_TYPE__CACHE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(MimeTypeHandlerCache newCache) {
		if (newCache != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.MIME_TYPE__CACHE && newCache != null)) {
			if (EcoreUtil.isAncestor(this, newCache))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCache != null)
				msgs = ((InternalEObject)newCache).eInverseAdd(this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES, MimeTypeHandlerCache.class, msgs);
			msgs = basicSetCache(newCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MIME_TYPE__CACHE, newCache, newCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMimeTypeHandlers()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.MIME_TYPE__CACHE:
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS:
				return ((InternalEList<?>)getMimeTypeHandlers()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.MIME_TYPE__CACHE:
				return basicSetCache(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MancoosiPackage.MIME_TYPE__CACHE:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.MIME_TYPE_HANDLER_CACHE__MIME_TYPES, MimeTypeHandlerCache.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE__NAME:
				return getName();
			case MancoosiPackage.MIME_TYPE__EXTENSION:
				return getExtension();
			case MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS:
				return getMimeTypeHandlers();
			case MancoosiPackage.MIME_TYPE__CACHE:
				return getCache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE__NAME:
				setName((String)newValue);
				return;
			case MancoosiPackage.MIME_TYPE__EXTENSION:
				setExtension((String)newValue);
				return;
			case MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS:
				getMimeTypeHandlers().clear();
				getMimeTypeHandlers().addAll((Collection<? extends MimeTypeHandler>)newValue);
				return;
			case MancoosiPackage.MIME_TYPE__CACHE:
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MancoosiPackage.MIME_TYPE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
				return;
			case MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS:
				getMimeTypeHandlers().clear();
				return;
			case MancoosiPackage.MIME_TYPE__CACHE:
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.MIME_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MancoosiPackage.MIME_TYPE__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
			case MancoosiPackage.MIME_TYPE__MIME_TYPE_HANDLERS:
				return mimeTypeHandlers != null && !mimeTypeHandlers.isEmpty();
			case MancoosiPackage.MIME_TYPE__CACHE:
				return getCache() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

} //MimeTypeImpl
