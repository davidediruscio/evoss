/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.ApplicationMenuCatalog;
import mancoosi.Environment;
import mancoosi.MancoosiPackage;
import mancoosi.Menu;
import mancoosi.MenuEntry;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Menu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.MenuImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link mancoosi.impl.MenuImpl#getCatalog <em>Catalog</em>}</li>
 *   <li>{@link mancoosi.impl.MenuImpl#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MenuImpl extends EObjectImpl implements Menu {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList entries;

	/**
	 * The cached value of the '{@link #getCatalog() <em>Catalog</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatalog()
	 * @generated
	 * @ordered
	 */
	protected ApplicationMenuCatalog catalog;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MenuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getMenu();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList(MenuEntry.class, this, MancoosiPackage.MENU__ENTRIES, MancoosiPackage.MENU_ENTRY__MENU);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMenuCatalog getCatalog() {
		return catalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCatalog(ApplicationMenuCatalog newCatalog, NotificationChain msgs) {
		ApplicationMenuCatalog oldCatalog = catalog;
		catalog = newCatalog;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.MENU__CATALOG, oldCatalog, newCatalog);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCatalog(ApplicationMenuCatalog newCatalog) {
		if (newCatalog != catalog) {
			NotificationChain msgs = null;
			if (catalog != null)
				msgs = ((InternalEObject)catalog).eInverseRemove(this, MancoosiPackage.APPLICATION_MENU_CATALOG__MENU, ApplicationMenuCatalog.class, msgs);
			if (newCatalog != null)
				msgs = ((InternalEObject)newCatalog).eInverseAdd(this, MancoosiPackage.APPLICATION_MENU_CATALOG__MENU, ApplicationMenuCatalog.class, msgs);
			msgs = basicSetCatalog(newCatalog, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MENU__CATALOG, newCatalog, newCatalog));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnv() {
		if (eContainerFeatureID() != MancoosiPackage.MENU__ENV) return null;
		return (Environment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(Environment newEnv, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnv, MancoosiPackage.MENU__ENV, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnv(Environment newEnv) {
		if (newEnv != eInternalContainer() || (eContainerFeatureID() != MancoosiPackage.MENU__ENV && newEnv != null)) {
			if (EcoreUtil.isAncestor(this, newEnv))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, MancoosiPackage.ENVIRONMENT__MENU, Environment.class, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.MENU__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.MENU__ENTRIES:
				return ((InternalEList)getEntries()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.MENU__CATALOG:
				if (catalog != null)
					msgs = ((InternalEObject)catalog).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.MENU__CATALOG, null, msgs);
				return basicSetCatalog((ApplicationMenuCatalog)otherEnd, msgs);
			case MancoosiPackage.MENU__ENV:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnv((Environment)otherEnd, msgs);
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
			case MancoosiPackage.MENU__ENTRIES:
				return ((InternalEList)getEntries()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.MENU__CATALOG:
				return basicSetCatalog(null, msgs);
			case MancoosiPackage.MENU__ENV:
				return basicSetEnv(null, msgs);
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
			case MancoosiPackage.MENU__ENV:
				return eInternalContainer().eInverseRemove(this, MancoosiPackage.ENVIRONMENT__MENU, Environment.class, msgs);
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
			case MancoosiPackage.MENU__ENTRIES:
				return getEntries();
			case MancoosiPackage.MENU__CATALOG:
				return getCatalog();
			case MancoosiPackage.MENU__ENV:
				return getEnv();
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
			case MancoosiPackage.MENU__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection)newValue);
				return;
			case MancoosiPackage.MENU__CATALOG:
				setCatalog((ApplicationMenuCatalog)newValue);
				return;
			case MancoosiPackage.MENU__ENV:
				setEnv((Environment)newValue);
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
			case MancoosiPackage.MENU__ENTRIES:
				getEntries().clear();
				return;
			case MancoosiPackage.MENU__CATALOG:
				setCatalog((ApplicationMenuCatalog)null);
				return;
			case MancoosiPackage.MENU__ENV:
				setEnv((Environment)null);
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
			case MancoosiPackage.MENU__ENTRIES:
				return entries != null && !entries.isEmpty();
			case MancoosiPackage.MENU__CATALOG:
				return catalog != null;
			case MancoosiPackage.MENU__ENV:
				return getEnv() != null;
		}
		return super.eIsSet(featureID);
	}

} //MenuImpl
