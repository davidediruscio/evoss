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
 * A representation of the model object '<em><b>Or Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.OrBooleanExpression#getExps <em>Exps</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getOrBooleanExpression()
 * @model
 * @generated
 */
public interface OrBooleanExpression extends BooleanExpression {
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
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getOrBooleanExpression_Exps()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<BooleanExpression> getExps();

} // OrBooleanExpression
