/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import mancoosi.AndInv;
import mancoosi.Atom;
import mancoosi.Invariant;
import mancoosi.MancoosiPackage;
import mancoosi.NotInv;
import mancoosi.OrInv;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.InvariantImpl#getAtomEl <em>Atom El</em>}</li>
 *   <li>{@link mancoosi.impl.InvariantImpl#getAnd <em>And</em>}</li>
 *   <li>{@link mancoosi.impl.InvariantImpl#getOr <em>Or</em>}</li>
 *   <li>{@link mancoosi.impl.InvariantImpl#getNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvariantImpl extends NamedElementImpl implements Invariant {
	/**
	 * The cached value of the '{@link #getAtomEl() <em>Atom El</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomEl()
	 * @generated
	 * @ordered
	 */
	protected Atom atomEl;

	/**
	 * The cached value of the '{@link #getAnd() <em>And</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnd()
	 * @generated
	 * @ordered
	 */
	protected AndInv and;

	/**
	 * The cached value of the '{@link #getOr() <em>Or</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOr()
	 * @generated
	 * @ordered
	 */
	protected OrInv or;

	/**
	 * The cached value of the '{@link #getNot() <em>Not</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNot()
	 * @generated
	 * @ordered
	 */
	protected NotInv not;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getInvariant();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom getAtomEl() {
		if (atomEl != null && atomEl.eIsProxy()) {
			InternalEObject oldAtomEl = (InternalEObject)atomEl;
			atomEl = (Atom)eResolveProxy(oldAtomEl);
			if (atomEl != oldAtomEl) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.INVARIANT__ATOM_EL, oldAtomEl, atomEl));
			}
		}
		return atomEl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom basicGetAtomEl() {
		return atomEl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomEl(Atom newAtomEl) {
		Atom oldAtomEl = atomEl;
		atomEl = newAtomEl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INVARIANT__ATOM_EL, oldAtomEl, atomEl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndInv getAnd() {
		if (and != null && and.eIsProxy()) {
			InternalEObject oldAnd = (InternalEObject)and;
			and = (AndInv)eResolveProxy(oldAnd);
			if (and != oldAnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.INVARIANT__AND, oldAnd, and));
			}
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndInv basicGetAnd() {
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnd(AndInv newAnd) {
		AndInv oldAnd = and;
		and = newAnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INVARIANT__AND, oldAnd, and));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrInv getOr() {
		if (or != null && or.eIsProxy()) {
			InternalEObject oldOr = (InternalEObject)or;
			or = (OrInv)eResolveProxy(oldOr);
			if (or != oldOr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.INVARIANT__OR, oldOr, or));
			}
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrInv basicGetOr() {
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOr(OrInv newOr) {
		OrInv oldOr = or;
		or = newOr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INVARIANT__OR, oldOr, or));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInv getNot() {
		if (not != null && not.eIsProxy()) {
			InternalEObject oldNot = (InternalEObject)not;
			not = (NotInv)eResolveProxy(oldNot);
			if (not != oldNot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.INVARIANT__NOT, oldNot, not));
			}
		}
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInv basicGetNot() {
		return not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNot(NotInv newNot) {
		NotInv oldNot = not;
		not = newNot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INVARIANT__NOT, oldNot, not));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.INVARIANT__ATOM_EL:
				if (resolve) return getAtomEl();
				return basicGetAtomEl();
			case MancoosiPackage.INVARIANT__AND:
				if (resolve) return getAnd();
				return basicGetAnd();
			case MancoosiPackage.INVARIANT__OR:
				if (resolve) return getOr();
				return basicGetOr();
			case MancoosiPackage.INVARIANT__NOT:
				if (resolve) return getNot();
				return basicGetNot();
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
			case MancoosiPackage.INVARIANT__ATOM_EL:
				setAtomEl((Atom)newValue);
				return;
			case MancoosiPackage.INVARIANT__AND:
				setAnd((AndInv)newValue);
				return;
			case MancoosiPackage.INVARIANT__OR:
				setOr((OrInv)newValue);
				return;
			case MancoosiPackage.INVARIANT__NOT:
				setNot((NotInv)newValue);
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
			case MancoosiPackage.INVARIANT__ATOM_EL:
				setAtomEl((Atom)null);
				return;
			case MancoosiPackage.INVARIANT__AND:
				setAnd((AndInv)null);
				return;
			case MancoosiPackage.INVARIANT__OR:
				setOr((OrInv)null);
				return;
			case MancoosiPackage.INVARIANT__NOT:
				setNot((NotInv)null);
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
			case MancoosiPackage.INVARIANT__ATOM_EL:
				return atomEl != null;
			case MancoosiPackage.INVARIANT__AND:
				return and != null;
			case MancoosiPackage.INVARIANT__OR:
				return or != null;
			case MancoosiPackage.INVARIANT__NOT:
				return not != null;
		}
		return super.eIsSet(featureID);
	}

} //InvariantImpl
