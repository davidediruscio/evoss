/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.impl;

import it.univaq.mancoosi.packagemm.NamedElement;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.Script;
import it.univaq.mancoosi.packagemm.Statement;
import it.univaq.mancoosi.packagemm.StatementBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl#getName <em>Name</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl#getScript <em>Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.impl.StatementBooleanImpl#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementBooleanImpl extends BooleanExpressionImpl implements StatementBoolean {
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
	 * The default value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_START_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsStart() <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStart()
	 * @generated
	 * @ordered
	 */
	protected boolean isStart = IS_START_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Statement previous;

	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected Statement next;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PackagemmPackage.eINSTANCE.getStatementBoolean();
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
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STATEMENT_BOOLEAN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Script getScript() {
		if (eContainerFeatureID() != PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT) return null;
		return (Script)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScript(Script newScript, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScript, PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(Script newScript) {
		if (newScript != eInternalContainer() || (eContainerFeatureID() != PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT && newScript != null)) {
			if (EcoreUtil.isAncestor(this, newScript))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScript != null)
				msgs = ((InternalEObject)newScript).eInverseAdd(this, PackagemmPackage.SCRIPT__STATEMENTS, Script.class, msgs);
			msgs = basicSetScript(newScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT, newScript, newScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStart() {
		return isStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStart(boolean newIsStart) {
		boolean oldIsStart = isStart;
		isStart = newIsStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STATEMENT_BOOLEAN__IS_START, oldIsStart, isStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Statement)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrevious(Statement newPrevious) {
		Statement oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS, oldPrevious, previous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getNext() {
		if (next != null && next.eIsProxy()) {
			InternalEObject oldNext = (InternalEObject)next;
			next = (Statement)eResolveProxy(oldNext);
			if (next != oldNext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PackagemmPackage.STATEMENT_BOOLEAN__NEXT, oldNext, next));
			}
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetNext() {
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNext(Statement newNext) {
		Statement oldNext = next;
		next = newNext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PackagemmPackage.STATEMENT_BOOLEAN__NEXT, oldNext, next));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScript((Script)otherEnd, msgs);
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
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				return basicSetScript(null, msgs);
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
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				return eInternalContainer().eInverseRemove(this, PackagemmPackage.SCRIPT__STATEMENTS, Script.class, msgs);
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
			case PackagemmPackage.STATEMENT_BOOLEAN__NAME:
				return getName();
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				return getScript();
			case PackagemmPackage.STATEMENT_BOOLEAN__IS_START:
				return isIsStart();
			case PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case PackagemmPackage.STATEMENT_BOOLEAN__NEXT:
				if (resolve) return getNext();
				return basicGetNext();
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
			case PackagemmPackage.STATEMENT_BOOLEAN__NAME:
				setName((String)newValue);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				setScript((Script)newValue);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__IS_START:
				setIsStart((Boolean)newValue);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS:
				setPrevious((Statement)newValue);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__NEXT:
				setNext((Statement)newValue);
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
			case PackagemmPackage.STATEMENT_BOOLEAN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				setScript((Script)null);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__IS_START:
				setIsStart(IS_START_EDEFAULT);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS:
				setPrevious((Statement)null);
				return;
			case PackagemmPackage.STATEMENT_BOOLEAN__NEXT:
				setNext((Statement)null);
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
			case PackagemmPackage.STATEMENT_BOOLEAN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT:
				return getScript() != null;
			case PackagemmPackage.STATEMENT_BOOLEAN__IS_START:
				return isStart != IS_START_EDEFAULT;
			case PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS:
				return previous != null;
			case PackagemmPackage.STATEMENT_BOOLEAN__NEXT:
				return next != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case PackagemmPackage.STATEMENT_BOOLEAN__NAME: return PackagemmPackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (derivedFeatureID) {
				case PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT: return PackagemmPackage.STATEMENT__SCRIPT;
				case PackagemmPackage.STATEMENT_BOOLEAN__IS_START: return PackagemmPackage.STATEMENT__IS_START;
				case PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS: return PackagemmPackage.STATEMENT__PREVIOUS;
				case PackagemmPackage.STATEMENT_BOOLEAN__NEXT: return PackagemmPackage.STATEMENT__NEXT;
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
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case PackagemmPackage.NAMED_ELEMENT__NAME: return PackagemmPackage.STATEMENT_BOOLEAN__NAME;
				default: return -1;
			}
		}
		if (baseClass == Statement.class) {
			switch (baseFeatureID) {
				case PackagemmPackage.STATEMENT__SCRIPT: return PackagemmPackage.STATEMENT_BOOLEAN__SCRIPT;
				case PackagemmPackage.STATEMENT__IS_START: return PackagemmPackage.STATEMENT_BOOLEAN__IS_START;
				case PackagemmPackage.STATEMENT__PREVIOUS: return PackagemmPackage.STATEMENT_BOOLEAN__PREVIOUS;
				case PackagemmPackage.STATEMENT__NEXT: return PackagemmPackage.STATEMENT_BOOLEAN__NEXT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", isStart: ");
		result.append(isStart);
		result.append(')');
		return result.toString();
	}

} //StatementBooleanImpl
