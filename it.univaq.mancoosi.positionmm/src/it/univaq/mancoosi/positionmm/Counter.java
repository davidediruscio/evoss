/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.positionmm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.positionmm.Counter#getPosition <em>Position</em>}</li>
 *   <li>{@link it.univaq.mancoosi.positionmm.Counter#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.positionmm.PositionmmPackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(int)
	 * @see it.univaq.mancoosi.positionmm.PositionmmPackage#getCounter_Position()
	 * @model
	 * @generated
	 */
	int getPosition();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.positionmm.Counter#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(int value);

	/**
	 * Returns the value of the '<em><b>Script</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.positionmm.TypeScript}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' attribute.
	 * @see it.univaq.mancoosi.positionmm.TypeScript
	 * @see #setScript(TypeScript)
	 * @see it.univaq.mancoosi.positionmm.PositionmmPackage#getCounter_Script()
	 * @model
	 * @generated
	 */
	TypeScript getScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.positionmm.Counter#getScript <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' attribute.
	 * @see it.univaq.mancoosi.positionmm.TypeScript
	 * @see #getScript()
	 * @generated
	 */
	void setScript(TypeScript value);

} // Counter
