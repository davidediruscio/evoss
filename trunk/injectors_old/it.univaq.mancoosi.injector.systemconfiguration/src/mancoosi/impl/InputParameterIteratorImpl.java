/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.InputParameter;
import mancoosi.InputParameterIterator;
import mancoosi.MancoosiPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Parameter Iterator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.InputParameterIteratorImpl#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputParameterIteratorImpl extends IteratorImpl implements InputParameterIterator {
	/**
	 * The cached value of the '{@link #getInputParameters() <em>Input Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputParameters()
	 * @generated
	 * @ordered
	 */
	protected EList inputParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputParameterIteratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getInputParameterIterator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInputParameters() {
		if (inputParameters == null) {
			inputParameters = new EObjectResolvingEList(InputParameter.class, this, MancoosiPackage.INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS);
		}
		return inputParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS:
				return getInputParameters();
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
			case MancoosiPackage.INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS:
				getInputParameters().clear();
				getInputParameters().addAll((Collection)newValue);
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
			case MancoosiPackage.INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS:
				getInputParameters().clear();
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
			case MancoosiPackage.INPUT_PARAMETER_ITERATOR__INPUT_PARAMETERS:
				return inputParameters != null && !inputParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputParameterIteratorImpl
