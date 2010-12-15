/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.AndBooleanExpression#getExps <em>Exps</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getAndBooleanExpression()
 * @model
 * @generated
 */
public interface AndBooleanExpression extends BooleanExpression {
	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.packagemm.BooleanExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exps</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getAndBooleanExpression_Exps()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<BooleanExpression> getExps();

} // AndBooleanExpression
