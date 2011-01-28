/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.IntParam;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.PostinstPython;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Python</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstPythonImpl#getPyver <em>Pyver</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.PostinstPythonImpl#getDirlist <em>Dirlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstPythonImpl extends UpdateEnvironmentStatementImpl implements PostinstPython {
	/**
	 * The cached value of the '{@link #getPyver() <em>Pyver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPyver()
	 * @generated
	 * @ordered
	 */
	protected IntParam pyver;

	/**
	 * The cached value of the '{@link #getDirlist() <em>Dirlist</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirlist()
	 * @generated
	 * @ordered
	 */
	protected EList<File> dirlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostinstPythonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getPostinstPython();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParam getPyver() {
		return pyver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPyver(IntParam newPyver, NotificationChain msgs) {
		IntParam oldPyver = pyver;
		pyver = newPyver;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_PYTHON__PYVER, oldPyver, newPyver);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPyver(IntParam newPyver) {
		if (newPyver != pyver) {
			NotificationChain msgs = null;
			if (pyver != null)
				msgs = ((InternalEObject)pyver).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_PYTHON__PYVER, null, msgs);
			if (newPyver != null)
				msgs = ((InternalEObject)newPyver).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PackagemmPackage.POSTINST_PYTHON__PYVER, null, msgs);
			msgs = basicSetPyver(newPyver, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.POSTINST_PYTHON__PYVER, newPyver, newPyver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getDirlist() {
		if (dirlist == null) {
			dirlist = new EObjectContainmentEList<File>(File.class, this, PackagemmPackage.POSTINST_PYTHON__DIRLIST);
		}
		return dirlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_PYTHON__PYVER:
				return basicSetPyver(null, msgs);
			case PackagemmPackage.POSTINST_PYTHON__DIRLIST:
				return ((InternalEList<?>)getDirlist()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.POSTINST_PYTHON__PYVER:
				return getPyver();
			case PackagemmPackage.POSTINST_PYTHON__DIRLIST:
				return getDirlist();
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
			case PackagemmPackage.POSTINST_PYTHON__PYVER:
				setPyver((IntParam)newValue);
				return;
			case PackagemmPackage.POSTINST_PYTHON__DIRLIST:
				getDirlist().clear();
				getDirlist().addAll((Collection<? extends File>)newValue);
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
			case PackagemmPackage.POSTINST_PYTHON__PYVER:
				setPyver((IntParam)null);
				return;
			case PackagemmPackage.POSTINST_PYTHON__DIRLIST:
				getDirlist().clear();
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
			case PackagemmPackage.POSTINST_PYTHON__PYVER:
				return pyver != null;
			case PackagemmPackage.POSTINST_PYTHON__DIRLIST:
				return dirlist != null && !dirlist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostinstPythonImpl
