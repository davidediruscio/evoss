/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.Statement#getScript <em>Script</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Statement#isIsStart <em>Is Start</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Statement#getPrevious <em>Previous</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.Statement#getNext <em>Next</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStatement()
 * @model abstract="true"
 * @generated
 */
public interface Statement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Script</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.packagemm.Script#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script</em>' container reference.
	 * @see #setScript(Script)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStatement_Script()
	 * @see it.univaq.mancoosi.packagemm.Script#getStatements
	 * @model opposite="statements" transient="false" ordered="false"
	 * @generated
	 */
	Script getScript();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Statement#getScript <em>Script</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script</em>' container reference.
	 * @see #getScript()
	 * @generated
	 */
	void setScript(Script value);

	/**
	 * Returns the value of the '<em><b>Is Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Start</em>' attribute.
	 * @see #setIsStart(boolean)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStatement_IsStart()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isIsStart();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Statement#isIsStart <em>Is Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Start</em>' attribute.
	 * @see #isIsStart()
	 * @generated
	 */
	void setIsStart(boolean value);

	/**
	 * Returns the value of the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous</em>' reference.
	 * @see #setPrevious(Statement)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStatement_Previous()
	 * @model ordered="false"
	 * @generated
	 */
	Statement getPrevious();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Statement#getPrevious <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(Statement value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(Statement)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getStatement_Next()
	 * @model ordered="false"
	 * @generated
	 */
	Statement getNext();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.Statement#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(Statement value);

} // Statement
