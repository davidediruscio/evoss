/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.File;
import mancoosi.MancoosiPackage;
import mancoosi.XFont;
import mancoosi.XFontCache;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XFont</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.XFontImpl#getXfontCache <em>Xfont Cache</em>}</li>
 *   <li>{@link mancoosi.impl.XFontImpl#getFile <em>File</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XFontImpl extends NamedElementImpl implements XFont {
	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected EList file;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XFontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getXFont();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XFontCache getXfontCache() {
		if (eContainerFeatureID() != MancoosiPackage.XFONT__XFONT_CACHE) return null;
		return (XFontCache)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXfontCache(XFontCache newXfontCache, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newXfontCache, MancoosiPackage.XFONT__XFONT_CACHE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXfontCache(XFontCache newXfontCache) {
		if (newXfontCache != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.XFONT__XFONT_CACHE && newXfontCache != null)) {
			if (EcoreUtil.isAncestor(this, newXfontCache))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newXfontCache != null)
				msgs = ((InternalEObject)newXfontCache).eInverseAdd(this, MancoosiPackage.XFONT_CACHE__XFONTS, XFontCache.class, msgs);
			msgs = basicSetXfontCache(newXfontCache, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.XFONT__XFONT_CACHE, newXfontCache, newXfontCache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFile() {
		if (file == null) {
			file = new EObjectResolvingEList(File.class, this, MancoosiPackage.XFONT__FILE);
		}
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.XFONT__XFONT_CACHE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetXfontCache((XFontCache)otherEnd, msgs);
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
			case MancoosiPackage.XFONT__XFONT_CACHE:
				return basicSetXfontCache(null, msgs);
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
			case MancoosiPackage.XFONT__XFONT_CACHE:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.XFONT_CACHE__XFONTS, XFontCache.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.XFONT__XFONT_CACHE:
				return getXfontCache();
			case MancoosiPackage.XFONT__FILE:
				return getFile();
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
			case MancoosiPackage.XFONT__XFONT_CACHE:
				setXfontCache((XFontCache)newValue);
				return;
			case MancoosiPackage.XFONT__FILE:
				getFile().clear();
				getFile().addAll((Collection)newValue);
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
			case MancoosiPackage.XFONT__XFONT_CACHE:
				setXfontCache((XFontCache)null);
				return;
			case MancoosiPackage.XFONT__FILE:
				getFile().clear();
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
			case MancoosiPackage.XFONT__XFONT_CACHE:
				return getXfontCache() != null;
			case MancoosiPackage.XFONT__FILE:
				return file != null && !file.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //XFontImpl
