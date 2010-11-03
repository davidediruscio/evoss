/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installed Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getInstalledSize <em>Installed Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getFileSize <em>File Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getStatus <em>Status</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSourcePackage <em>Source Package</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDepends <em>Depends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getEnhances <em>Enhances</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getPredepends <em>Predepends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getProvides <em>Provides</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDocumentationFiles <em>Documentation Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getConflict <em>Conflict</em>}</li>
 * </ul>
 * </p>
 *
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage()
 * @model
 * @generated
 */
public interface InstalledPackage extends it.univaq.mancoosi.mancoosimm.Package {
	/**
	 * Returns the value of the '<em><b>Installed Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Installed Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Installed Size</em>' attribute.
	 * @see #setInstalledSize(int)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_InstalledSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getInstalledSize();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getInstalledSize <em>Installed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed Size</em>' attribute.
	 * @see #getInstalledSize()
	 * @generated
	 */
	void setInstalledSize(int value);

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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Maintainer()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getMaintainer();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getMaintainer <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maintainer</em>' attribute.
	 * @see #getMaintainer()
	 * @generated
	 */
	void setMaintainer(String value);

	/**
	 * Returns the value of the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Architecture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture</em>' attribute.
	 * @see #setArchitecture(String)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Architecture()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getArchitecture();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getArchitecture <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture</em>' attribute.
	 * @see #getArchitecture()
	 * @generated
	 */
	void setArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Size</em>' attribute.
	 * @see #setFileSize(int)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_FileSize()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getFileSize();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getFileSize <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Size</em>' attribute.
	 * @see #getFileSize()
	 * @generated
	 */
	void setFileSize(int value);

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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_CheckSum()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getCheckSum();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getCheckSum <em>Check Sum</em>}' attribute.
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Description()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDescription <em>Description</em>}' attribute.
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Section()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getSection();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSection <em>Section</em>}' attribute.
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Tag()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getTag <em>Tag</em>}' attribute.
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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Priority()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	PriorityType getPriority();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.PriorityType
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(PriorityType value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link it.univaq.mancoosi.mancoosimm.StatusType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.StatusType
	 * @see #setStatus(StatusType)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Status()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	StatusType getStatus();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see it.univaq.mancoosi.mancoosimm.StatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(StatusType value);

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
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Uploaders()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String getUploaders();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getUploaders <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uploaders</em>' attribute.
	 * @see #getUploaders()
	 * @generated
	 */
	void setUploaders(String value);

	/**
	 * Returns the value of the '<em><b>Source Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Package</em>' reference.
	 * @see #setSourcePackage(SrcPackage)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_SourcePackage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SrcPackage getSourcePackage();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getSourcePackage <em>Source Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Package</em>' reference.
	 * @see #getSourcePackage()
	 * @generated
	 */
	void setSourcePackage(SrcPackage value);

	/**
	 * Returns the value of the '<em><b>Depends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends</em>' containment reference.
	 * @see #setDepends(Dependence)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Depends()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Dependence getDepends();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getDepends <em>Depends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends</em>' containment reference.
	 * @see #getDepends()
	 * @generated
	 */
	void setDepends(Dependence value);

	/**
	 * Returns the value of the '<em><b>Recommends</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recommends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommends</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Recommends()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstalledPackage> getRecommends();

	/**
	 * Returns the value of the '<em><b>Suggests</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suggests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suggests</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Suggests()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstalledPackage> getSuggests();

	/**
	 * Returns the value of the '<em><b>Enhances</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enhances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enhances</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Enhances()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstalledPackage> getEnhances();

	/**
	 * Returns the value of the '<em><b>Predepends</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Predepends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Predepends</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Predepends()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstalledPackage> getPredepends();

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' reference.
	 * @see #setProvides(VirtualPackage)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Provides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	VirtualPackage getProvides();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getProvides <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' reference.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(VirtualPackage value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.InstalledPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaces</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaces</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Replaces()
	 * @model ordered="false"
	 * @generated
	 */
	EList<InstalledPackage> getReplaces();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Files</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Files()
	 * @model ordered="false"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Documentation Files</b></em>' containment reference list.
	 * The list contents are of type {@link it.univaq.mancoosi.mancoosimm.DocumentationFile}.
	 * It is bidirectional and its opposite is '{@link it.univaq.mancoosi.mancoosimm.DocumentationFile#getPkg <em>Pkg</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Documentation Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documentation Files</em>' containment reference list.
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_DocumentationFiles()
	 * @see it.univaq.mancoosi.mancoosimm.DocumentationFile#getPkg
	 * @model opposite="pkg" containment="true" ordered="false"
	 * @generated
	 */
	EList<DocumentationFile> getDocumentationFiles();

	/**
	 * Returns the value of the '<em><b>Conflict</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflict</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflict</em>' containment reference.
	 * @see #setConflict(Conflict)
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#getInstalledPackage_Conflict()
	 * @model containment="true"
	 * @generated
	 */
	Conflict getConflict();

	/**
	 * Sets the value of the '{@link it.univaq.mancoosi.mancoosimm.InstalledPackage#getConflict <em>Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conflict</em>' containment reference.
	 * @see #getConflict()
	 * @generated
	 */
	void setConflict(Conflict value);

} // InstalledPackage
