/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Case#getSelector <em>Selector</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Case#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCase()
 * @model abstract="true"
 * @generated
 */
public interface Case extends ControlStatement {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCase_Selector()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Case#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' containment reference.
	 * @see #setDefault(DefaultCaseCondition)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getCase_Default()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	DefaultCaseCondition getDefault();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Case#getDefault <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' containment reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(DefaultCaseCondition value);

} // Case
