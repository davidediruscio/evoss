/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.File;
import mancoosi.IntParam;
import mancoosi.MancoosiPackage;
import mancoosi.PostinstPython;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postinst Python</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostinstPythonImpl#getPyver <em>Pyver</em>}</li>
 *   <li>{@link mancoosi.impl.PostinstPythonImpl#getDirlist <em>Dirlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostinstPythonImpl extends UpdateEnvironmentStatementImpl implements PostinstPython {
	/**
	 * The cached value of the '{@link #getPyver() <em>Pyver</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPyver()
	 * @generated
	 * @ordered
	 */
	protected IntParam pyver;

	/**
	 * The cached value of the '{@link #getDirlist() <em>Dirlist</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirlist()
	 * @generated
	 * @ordered
	 */
	protected EList dirlist;

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
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostinstPython();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParam getPyver() {
		if (pyver != null && pyver.eIsProxy()) {
			InternalEObject oldPyver = (InternalEObject)pyver;
			pyver = (IntParam)eResolveProxy(oldPyver);
			if (pyver != oldPyver) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTINST_PYTHON__PYVER, oldPyver, pyver));
			}
		}
		return pyver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntParam basicGetPyver() {
		return pyver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPyver(IntParam newPyver) {
		IntParam oldPyver = pyver;
		pyver = newPyver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTINST_PYTHON__PYVER, oldPyver, pyver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDirlist() {
		if (dirlist == null) {
			dirlist = new EObjectResolvingEList(File.class, this, MancoosiPackage.POSTINST_PYTHON__DIRLIST);
		}
		return dirlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_PYTHON__PYVER:
				if (resolve) return getPyver();
				return basicGetPyver();
			case MancoosiPackage.POSTINST_PYTHON__DIRLIST:
				return getDirlist();
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
			case MancoosiPackage.POSTINST_PYTHON__PYVER:
				setPyver((IntParam)newValue);
				return;
			case MancoosiPackage.POSTINST_PYTHON__DIRLIST:
				getDirlist().clear();
				getDirlist().addAll((Collection)newValue);
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
			case MancoosiPackage.POSTINST_PYTHON__PYVER:
				setPyver((IntParam)null);
				return;
			case MancoosiPackage.POSTINST_PYTHON__DIRLIST:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.POSTINST_PYTHON__PYVER:
				return pyver != null;
			case MancoosiPackage.POSTINST_PYTHON__DIRLIST:
				return dirlist != null && !dirlist.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostinstPythonImpl
