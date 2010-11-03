/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postinst Wm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstWm#getWm <em>Wm</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstWm#getWmman <em>Wmman</em>}</li>
 *   <li>{@link it.univaq.mancoosi.packagemm.PostinstWm#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWm()
 * @model
 * @generated
 */
public interface PostinstWm extends UpdateEnvironmentStatement {
	/**
	 * Returns the value of the '<em><b>Wm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wm</em>' containment reference.
	 * @see #setWm(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWm_Wm()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getWm();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstWm#getWm <em>Wm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wm</em>' containment reference.
	 * @see #getWm()
	 * @generated
	 */
	void setWm(StringParam value);

	/**
	 * Returns the value of the '<em><b>Wmman</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wmman</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wmman</em>' containment reference.
	 * @see #setWmman(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWm_Wmman()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getWmman();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstWm#getWmman <em>Wmman</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wmman</em>' containment reference.
	 * @see #getWmman()
	 * @generated
	 */
	void setWmman(StringParam value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(StringParam)
	 * @see it.univaq.mancoosi.packagemm.PackagemmPackage#getPostinstWm_Priority()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	StringParam getPriority();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.packagemm.PostinstWm#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(StringParam value);

} // PostinstWm
