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
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.Script#getPre <em>Pre</em>}</li>
 *   <li>{@link mancoosi.Script#getPost <em>Post</em>}</li>
 *   <li>{@link mancoosi.Script#getStatements <em>Statements</em>}</li>
 *   <li>{@link mancoosi.Script#getInputParameters <em>Input Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(Invariant)
	 * @see mancoosi.MancoosiPackage#getScript_Pre()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Invariant getPre();

	/**
	 * Sets the value of the '{@link mancoosi.Script#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(Invariant value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(Invariant)
	 * @see mancoosi.MancoosiPackage#getScript_Post()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Invariant getPost();

	/**
	 * Sets the value of the '{@link mancoosi.Script#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Invariant value);

	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.Statement}.
	 * It is bidirectional and its opposite is '{@link mancoosi.Statement#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getScript_Statements()
	 * @see mancoosi.Statement#getScript
	 * @model type="mancoosi.Statement" opposite="script" containment="true" ordered="false"
	 * @generated
	 */
	EList getStatements();

	/**
	 * Returns the value of the '<em><b>Input Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link mancoosi.InputParameter}.
	 * It is bidirectional and its opposite is '{@link mancoosi.InputParameter#getScript <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Parameters</em>' containment reference list.
	 * @see mancoosi.MancoosiPackage#getScript_InputParameters()
	 * @see mancoosi.InputParameter#getScript
	 * @model type="mancoosi.InputParameter" opposite="script" containment="true" ordered="false"
	 * @generated
	 */
	EList getInputParameters();

} // Script
