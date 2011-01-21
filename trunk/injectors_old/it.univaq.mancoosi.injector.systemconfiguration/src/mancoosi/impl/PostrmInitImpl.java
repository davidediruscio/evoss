/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.DeletionFileSystemStatement;
import mancoosi.File;
import mancoosi.FileSystemStatement;
import mancoosi.MancoosiPackage;
import mancoosi.PostrmInit;
import mancoosi.Script;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postrm Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostrmInitImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link mancoosi.impl.PostrmInitImpl#getScriptParam <em>Script Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostrmInitImpl extends UpdateEnvironmentStatementImpl implements PostrmInit {
	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList files;

	/**
	 * The cached value of the '{@link #getScriptParam() <em>Script Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptParam()
	 * @generated
	 * @ordered
	 */
	protected Script scriptParam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostrmInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostrmInit();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFiles() {
		if (files == null) {
			files = new EObjectResolvingEList(File.class, this, MancoosiPackage.POSTRM_INIT__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScriptParam() {
		if (scriptParam != null && scriptParam.eIsProxy()) {
			InternalEObject oldScriptParam = (InternalEObject)scriptParam;
			scriptParam = (Script)eResolveProxy(oldScriptParam);
			if (scriptParam != oldScriptParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.POSTRM_INIT__SCRIPT_PARAM, oldScriptParam, scriptParam));
			}
		}
		return scriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script basicGetScriptParam() {
		return scriptParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptParam(Script newScriptParam) {
		Script oldScriptParam = scriptParam;
		scriptParam = newScriptParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.POSTRM_INIT__SCRIPT_PARAM, oldScriptParam, scriptParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTRM_INIT__FILES:
				return getFiles();
			case MancoosiPackage.POSTRM_INIT__SCRIPT_PARAM:
				if (resolve) return getScriptParam();
				return basicGetScriptParam();
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
			case MancoosiPackage.POSTRM_INIT__FILES:
				getFiles().clear();
				getFiles().addAll((Collection)newValue);
				return;
			case MancoosiPackage.POSTRM_INIT__SCRIPT_PARAM:
				setScriptParam((Script)newValue);
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
			case MancoosiPackage.POSTRM_INIT__FILES:
				getFiles().clear();
				return;
			case MancoosiPackage.POSTRM_INIT__SCRIPT_PARAM:
				setScriptParam((Script)null);
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
			case MancoosiPackage.POSTRM_INIT__FILES:
				return files != null && !files.isEmpty();
			case MancoosiPackage.POSTRM_INIT__SCRIPT_PARAM:
				return scriptParam != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class baseClass) {
		if (baseClass == FileSystemStatement.class) {
			switch (derivedFeatureID) {
				case MancoosiPackage.POSTRM_INIT__FILES: return MancoosiPackage.FILE_SYSTEM_STATEMENT__FILES;
				default: return -1;
			}
		}
		if (baseClass == DeletionFileSystemStatement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class baseClass) {
		if (baseClass == FileSystemStatement.class) {
			switch (baseFeatureID) {
				case MancoosiPackage.FILE_SYSTEM_STATEMENT__FILES: return MancoosiPackage.POSTRM_INIT__FILES;
				default: return -1;
			}
		}
		if (baseClass == DeletionFileSystemStatement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PostrmInitImpl
