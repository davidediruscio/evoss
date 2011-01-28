/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Half Installed Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getUploaders <em>Uploaders</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage()
 * @model
 * @generated
 */
public interface HalfInstalledPackage extends it.univaq.mancoosi.mancoosimm.Package {
	/**
	 * Returns the value of the '<em><b>Maintainer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maintainer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maintainer</em>' attribute.
	 * @see #setMaintainer(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_Maintainer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMaintainer();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
	void setMaintainer(String value);

	/**
	 * Returns the value of the '<em><b>Check Sum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Sum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Sum</em>' attribute.
	 * @see #setCheckSum(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getCheckSum <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Sum</em>' attribute.
	 * @see #getCheckSum()
	 * @generated
	 */
	void setCheckSum(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_Description()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Section</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Section</em>' attribute.
	 * @see #setSection(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_Section()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getSection <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Section</em>' attribute.
	 * @see #getSection()
	 * @generated
	 */
	void setSection(String value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_Tag()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.mancoosimm.PriorityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @see #setPriority(PriorityType)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_Priority()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Uploaders</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uploaders</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uploaders</em>' attribute.
	 * @see #setUploaders(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getHalfInstalledPackage_Uploaders()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUploaders();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.HalfInstalledPackage#getUploaders <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploaders</em>' attribute.
	 * @see #getUploaders()
	 * @generated
	 */
	void setUploaders(String value);

} // HalfInstalledPackage
