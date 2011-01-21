/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Conflict#getAndConflict <em>And Conflict</em>}</li>
 *   <li>{@link mancoosi.Conflict#getOrConflict <em>Or Conflict</em>}</li>
 *   <li>{@link mancoosi.Conflict#getSingleConflict <em>Single Conflict</em>}</li>
 *   <li>{@link mancoosi.Conflict#getPkg <em>Pkg</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getConflict()
 * @model abstract="true"
 * @generated
 */
public interface Conflict extends EObject {
	/**
	 * Returns the value of the '<em><b>And Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.AndConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Conflict</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Conflict</em>' containment reference.
	 * @see #setAndConflict(AndConflict)
	 * @see mancoosi.MancoosiPackage#getConflict_AndConflict()
	 * @see mancoosi.AndConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	AndConflict getAndConflict();

	/**
	 * Sets the value of the '{@link mancoosi.Conflict#getAndConflict <em>And Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Conflict</em>' containment reference.
	 * @see #getAndConflict()
	 * @generated
	 */
	void setAndConflict(AndConflict value);

	/**
	 * Returns the value of the '<em><b>Or Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.OrConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Conflict</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Conflict</em>' containment reference.
	 * @see #setOrConflict(OrConflict)
	 * @see mancoosi.MancoosiPackage#getConflict_OrConflict()
	 * @see mancoosi.OrConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	OrConflict getOrConflict();

	/**
	 * Sets the value of the '{@link mancoosi.Conflict#getOrConflict <em>Or Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Conflict</em>' containment reference.
	 * @see #getOrConflict()
	 * @generated
	 */
	void setOrConflict(OrConflict value);

	/**
	 * Returns the value of the '<em><b>Single Conflict</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.SingleConflict#getConflict <em>Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Conflict</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Conflict</em>' containment reference.
	 * @see #setSingleConflict(SingleConflict)
	 * @see mancoosi.MancoosiPackage#getConflict_SingleConflict()
	 * @see mancoosi.SingleConflict#getConflict
	 * @model opposite="conflict" containment="true"
	 * @generated
	 */
	SingleConflict getSingleConflict();

	/**
	 * Sets the value of the '{@link mancoosi.Conflict#getSingleConflict <em>Single Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Conflict</em>' containment reference.
	 * @see #getSingleConflict()
	 * @generated
	 */
	void setSingleConflict(SingleConflict value);

	/**
	 * Returns the value of the '<em><b>Pkg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pkg</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pkg</em>' reference.
	 * @see #setPkg(mancoosi.Package)
	 * @see mancoosi.MancoosiPackage#getConflict_Pkg()
	 * @model required="true"
	 * @generated
	 */
	mancoosi.Package getPkg();

	/**
	 * Sets the value of the '{@link mancoosi.Conflict#getPkg <em>Pkg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pkg</em>' reference.
	 * @see #getPkg()
	 * @generated
	 */
	void setPkg(mancoosi.Package value);

} // Conflict
