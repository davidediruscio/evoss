/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getConflict <em>Conflict</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getVersion <em>Version</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSingleConflict()
 * @model
 * @generated
 */
public interface SingleConflict extends Conflict {
	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Conflict#getSingleConflict <em>Single Conflict</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' container reference.
	 * @see #setConflict(Conflict)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSingleConflict_Conflict()
	 * @see it.univaq.mancoosi.mancoosimm.Conflict#getSingleConflict
	 * @model opposite="singleConflict" required="true" transient="false"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getConflict <em>Conflict</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' container reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.mancoosimm.VersionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.VersionType
	 * @see #setVersion(VersionType)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSingleConflict_Version()
	 * @model required="true"
	 * @generated
	 */
	VersionType getVersion();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.VersionType
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getSingleConflict_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.SingleConflict#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // SingleConflict
