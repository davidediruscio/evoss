/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.MancoosiPackage;
import mancoosi.PostrmXfonts;
import mancoosi.Statement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postrm Xfonts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.PostrmXfontsImpl#getCmds <em>Cmds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PostrmXfontsImpl extends UpdateEnvironmentStatementImpl implements PostrmXfonts {
	/**
	 * The cached value of the '{@link #getCmds() <em>Cmds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmds()
	 * @generated
	 * @ordered
	 */
	protected EList cmds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostrmXfontsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getPostrmXfonts();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getCmds() {
		if (cmds == null) {
			cmds = new EObjectResolvingEList(Statement.class, this, MancoosiPackage.POSTRM_XFONTS__CMDS);
		}
		return cmds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.POSTRM_XFONTS__CMDS:
				return getCmds();
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
			case MancoosiPackage.POSTRM_XFONTS__CMDS:
				getCmds().clear();
				getCmds().addAll((Collection)newValue);
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
			case MancoosiPackage.POSTRM_XFONTS__CMDS:
				getCmds().clear();
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
			case MancoosiPackage.POSTRM_XFONTS__CMDS:
				return cmds != null && !cmds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostrmXfontsImpl
