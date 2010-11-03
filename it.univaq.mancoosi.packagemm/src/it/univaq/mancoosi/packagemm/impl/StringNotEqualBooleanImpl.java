/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.StringNotEqualBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Not Equal Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StringNotEqualBooleanImpl#getFirstOp <em>First Op</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StringNotEqualBooleanImpl#getSecondOp <em>Second Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringNotEqualBooleanImpl extends BooleanExpressionImpl implements StringNotEqualBoolean {
	/**
	 * The default value of the '{@link #getFirstOp() <em>First Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOp()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstOp() <em>First Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOp()
	 * @generated
	 * @ordered
	 */
	protected String firstOp = FIRST_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondOp() <em>Second Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOp()
	 * @generated
	 * @ordered
	 */
	protected static final String SECOND_OP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecondOp() <em>Second Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOp()
	 * @generated
	 * @ordered
	 */
	protected String secondOp = SECOND_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringNotEqualBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getStringNotEqualBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstOp() {
		return firstOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOp(String newFirstOp) {
		String oldFirstOp = firstOp;
		firstOp = newFirstOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__FIRST_OP, oldFirstOp, firstOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondOp() {
		return secondOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOp(String newSecondOp) {
		String oldSecondOp = secondOp;
		secondOp = newSecondOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__SECOND_OP, oldSecondOp, secondOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__FIRST_OP:
				return getFirstOp();
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__SECOND_OP:
				return getSecondOp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__FIRST_OP:
				setFirstOp((String)newValue);
				return;
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__SECOND_OP:
				setSecondOp((String)newValue);
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
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__FIRST_OP:
				setFirstOp(FIRST_OP_EDEFAULT);
				return;
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__SECOND_OP:
				setSecondOp(SECOND_OP_EDEFAULT);
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
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__FIRST_OP:
				return FIRST_OP_EDEFAULT == null ? firstOp != null : !FIRST_OP_EDEFAULT.equals(firstOp);
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN__SECOND_OP:
				return SECOND_OP_EDEFAULT == null ? secondOp != null : !SECOND_OP_EDEFAULT.equals(secondOp);
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
		result.append(" (firstOp: ");
		result.append(firstOp);
		result.append(", secondOp: ");
		result.append(secondOp);
		result.append(')');
		return result.toString();
	}

} //StringNotEqualBooleanImpl
