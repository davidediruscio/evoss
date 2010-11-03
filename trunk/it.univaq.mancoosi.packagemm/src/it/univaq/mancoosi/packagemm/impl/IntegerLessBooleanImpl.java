/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.IntegerLessBoolean;
import it.univaq.mancoosi.packagemm.PackagemmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Less Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.IntegerLessBooleanImpl#getFirstOp <em>First Op</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.IntegerLessBooleanImpl#getSecondOp <em>Second Op</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntegerLessBooleanImpl extends BooleanExpressionImpl implements IntegerLessBoolean {
	/**
	 * The default value of the '{@link #getFirstOp() <em>First Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOp()
	 * @generated
	 * @ordered
	 */
	protected static final int FIRST_OP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFirstOp() <em>First Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstOp()
	 * @generated
	 * @ordered
	 */
	protected int firstOp = FIRST_OP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecondOp() <em>Second Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOp()
	 * @generated
	 * @ordered
	 */
	protected static final int SECOND_OP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSecondOp() <em>Second Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondOp()
	 * @generated
	 * @ordered
	 */
	protected int secondOp = SECOND_OP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLessBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getIntegerLessBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFirstOp() {
		return firstOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstOp(int newFirstOp) {
		int oldFirstOp = firstOp;
		firstOp = newFirstOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.INTEGER_LESS_BOOLEAN__FIRST_OP, oldFirstOp, firstOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSecondOp() {
		return secondOp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondOp(int newSecondOp) {
		int oldSecondOp = secondOp;
		secondOp = newSecondOp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.INTEGER_LESS_BOOLEAN__SECOND_OP, oldSecondOp, secondOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__FIRST_OP:
				return getFirstOp();
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__SECOND_OP:
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
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__FIRST_OP:
				setFirstOp((Integer)newValue);
				return;
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__SECOND_OP:
				setSecondOp((Integer)newValue);
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
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__FIRST_OP:
				setFirstOp(FIRST_OP_EDEFAULT);
				return;
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__SECOND_OP:
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
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__FIRST_OP:
				return firstOp != FIRST_OP_EDEFAULT;
			case PackagemmPackage.INTEGER_LESS_BOOLEAN__SECOND_OP:
				return secondOp != SECOND_OP_EDEFAULT;
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

} //IntegerLessBooleanImpl
