/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GConf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.GConf#getConfFiles <em>Conf Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.GConf#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.GConf#getEnv <em>Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getGConf()
 * @model
 * @generated
 */
public interface GConf extends EObject {
	/**
	 * Returns the value of the '<em><b>Conf Files</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conf Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conf Files</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getGConf_ConfFiles()
	 * @model ordered="false"
	 * @generated
	 */
	EList<File> getConfFiles();

	/**
	 * Returns the value of the '<em><b>Schemas</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.Schema}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Schema#getGconf <em>Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemas</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemas</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getGConf_Schemas()
	 * @see it.univaq.mancoosi.mancoosimm.Schema#getGconf
	 * @model opposite="gconf" containment="true" ordered="false"
	 * @generated
	 */
	EList<Schema> getSchemas();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.Environment#getGconf <em>Gconf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' container reference.
	 * @see #setEnv(Environment)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getGConf_Env()
	 * @see it.univaq.mancoosi.mancoosimm.Environment#getGconf
	 * @model opposite="gconf" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Environment getEnv();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.GConf#getEnv <em>Env</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env</em>' container reference.
	 * @see #getEnv()
	 * @generated
	 */
	void setEnv(Environment value);

} // GConf
