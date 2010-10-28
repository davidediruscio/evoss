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
 * A representation of the model object '<em><b>Single Dep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mancoosi.SingleDep#getDependence <em>Dependence</em>}</li>
 *   <li>{@link mancoosi.SingleDep#getVersion <em>Version</em>}</li>
 *   <li>{@link mancoosi.SingleDep#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see mancoosi.MancoosiPackage#getSingleDep()
 * @model
 * @generated
 */
public interface SingleDep extends Dependence {
	/**
	 * Returns the value of the '<em><b>Dependence</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mancoosi.Dependence#getSingleDep <em>Single Dep</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependence</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependence</em>' container reference.
	 * @see #setDependence(Dependence)
	 * @see mancoosi.MancoosiPackage#getSingleDep_Dependence()
	 * @see mancoosi.Dependence#getSingleDep
	 * @model opposite="singleDep" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Dependence getDependence();

	/**
	 * Sets the value of the '{@link mancoosi.SingleDep#getDependence <em>Dependence</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependence</em>' container reference.
	 * @see #getDependence()
	 * @generated
	 */
	void setDependence(Dependence value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link mancoosi.VersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see mancoosi.VersionType
	 * @see #setVersion(VersionType)
	 * @see mancoosi.MancoosiPackage#getSingleDep_Version()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link mancoosi.SingleDep#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see mancoosi.VersionType
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(VersionType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see mancoosi.MancoosiPackage#getSingleDep_Value()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link mancoosi.SingleDep#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SingleDep
