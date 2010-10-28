/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.AndConflict#getOps <em>Ops</em>}</li>
 *   <li>{@link mancoosi.AndConflict#getConflict <em>Conflict</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getAndConflict()
 * @model
 * @generated
 */
public interface AndConflict extends Conflict {
	/**
	 * Returns the value of the '<em><b>Ops</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.Conflict}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ops</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ops</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getAndConflict_Ops()
	 * @model type="mancoosi.Conflict" containment="true" lower="2"
	 * @generated
	 */
	EList getOps();

	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Conflict#getAndConflict <em>And Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' container reference.
	 * @see #setConflict(Conflict)
	 * @see mancoosi.MancoosiPackage#getAndConflict_Conflict()
	 * @see mancoosi.Conflict#getAndConflict
	 * @model opposite="andConflict" required="true" transient="false"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link mancoosi.AndConflict#getConflict <em>Conflict</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' container reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

} // AndConflict
