/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mancoosi.impl;

import java.util.Collection;

import mancoosi.ConfigScript;
import mancoosi.Conflict;
import mancoosi.Dependence;
import mancoosi.DocumentationFile;
import mancoosi.File;
import mancoosi.InstalledPackage;
import mancoosi.MancoosiPackage;
import mancoosi.PostinstScript;
import mancoosi.PostrmScript;
import mancoosi.PreinstScript;
import mancoosi.PrermScript;
import mancoosi.PriorityType;
import mancoosi.SrcPackage;
import mancoosi.StatusType;
import mancoosi.VirtualPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Installed Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getInstalledSize <em>Installed Size</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getArchitecture <em>Architecture</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getSourcePackage <em>Source Package</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getEnhances <em>Enhances</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getPredepends <em>Predepends</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getDocumentationFiles <em>Documentation Files</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getPreinstScript <em>Preinst Script</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getPostinstScript <em>Postinst Script</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getPrermScript <em>Prerm Script</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getPostrmScript <em>Postrm Script</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getConfigScript <em>Config Script</em>}</li>
 *   <li>{@link mancoosi.impl.InstalledPackageImpl#getConflict <em>Conflict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstalledPackageImpl extends PackageImpl implements InstalledPackage {
	/**
	 * The default value of the '{@link #getInstalledSize() <em>Installed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledSize()
	 * @generated
	 * @ordered
	 */
	protected static final int INSTALLED_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInstalledSize() <em>Installed Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstalledSize()
	 * @generated
	 * @ordered
	 */
	protected int installedSize = INSTALLED_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected static final String MAINTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaintainer() <em>Maintainer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaintainer()
	 * @generated
	 * @ordered
	 */
	protected String maintainer = MAINTAINER_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected static final int FILE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFileSize() <em>File Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileSize()
	 * @generated
	 * @ordered
	 */
	protected int fileSize = FILE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_SUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckSum() <em>Check Sum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckSum()
	 * @generated
	 * @ordered
	 */
	protected String checkSum = CHECK_SUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final String SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected String section = SECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected String tag = TAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final PriorityType PRIORITY_EDEFAULT = PriorityType.STANDARD_LITERAL;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected PriorityType priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final StatusType STATUS_EDEFAULT = StatusType.INSTALLED_LITERAL;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected StatusType status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUploaders() <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploaders()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUploaders() <em>Uploaders</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploaders()
	 * @generated
	 * @ordered
	 */
	protected String uploaders = UPLOADERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourcePackage() <em>Source Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePackage()
	 * @generated
	 * @ordered
	 */
	protected SrcPackage sourcePackage;

	/**
	 * The cached value of the '{@link #getDepends() <em>Depends</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepends()
	 * @generated
	 * @ordered
	 */
	protected Dependence depends;

	/**
	 * The cached value of the '{@link #getRecommends() <em>Recommends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommends()
	 * @generated
	 * @ordered
	 */
	protected EList recommends;

	/**
	 * The cached value of the '{@link #getSuggests() <em>Suggests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggests()
	 * @generated
	 * @ordered
	 */
	protected EList suggests;

	/**
	 * The cached value of the '{@link #getEnhances() <em>Enhances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhances()
	 * @generated
	 * @ordered
	 */
	protected EList enhances;

	/**
	 * The cached value of the '{@link #getPredepends() <em>Predepends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredepends()
	 * @generated
	 * @ordered
	 */
	protected EList predepends;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected VirtualPackage provides;

	/**
	 * The cached value of the '{@link #getReplaces() <em>Replaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplaces()
	 * @generated
	 * @ordered
	 */
	protected EList replaces;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList files;

	/**
	 * The cached value of the '{@link #getDocumentationFiles() <em>Documentation Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationFiles()
	 * @generated
	 * @ordered
	 */
	protected EList documentationFiles;

	/**
	 * The cached value of the '{@link #getPreinstScript() <em>Preinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreinstScript()
	 * @generated
	 * @ordered
	 */
	protected PreinstScript preinstScript;

	/**
	 * The cached value of the '{@link #getPostinstScript() <em>Postinst Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostinstScript()
	 * @generated
	 * @ordered
	 */
	protected PostinstScript postinstScript;

	/**
	 * The cached value of the '{@link #getPrermScript() <em>Prerm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrermScript()
	 * @generated
	 * @ordered
	 */
	protected PrermScript prermScript;

	/**
	 * The cached value of the '{@link #getPostrmScript() <em>Postrm Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostrmScript()
	 * @generated
	 * @ordered
	 */
	protected PostrmScript postrmScript;

	/**
	 * The cached value of the '{@link #getConfigScript() <em>Config Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigScript()
	 * @generated
	 * @ordered
	 */
	protected ConfigScript configScript;

	/**
	 * The cached value of the '{@link #getConflict() <em>Conflict</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConflict()
	 * @generated
	 * @ordered
	 */
	protected Conflict conflict;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstalledPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return MancoosiPackage.eINSTANCE.getInstalledPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInstalledSize() {
		return installedSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstalledSize(int newInstalledSize) {
		int oldInstalledSize = installedSize;
		installedSize = newInstalledSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE, oldInstalledSize, installedSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaintainer() {
		return maintainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaintainer(String newMaintainer) {
		String oldMaintainer = maintainer;
		maintainer = newMaintainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER, oldMaintainer, maintainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(String newArchitecture) {
		String oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFileSize() {
		return fileSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileSize(int newFileSize) {
		int oldFileSize = fileSize;
		fileSize = newFileSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE, oldFileSize, fileSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckSum() {
		return checkSum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckSum(String newCheckSum) {
		String oldCheckSum = checkSum;
		checkSum = newCheckSum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__CHECK_SUM, oldCheckSum, checkSum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(String newSection) {
		String oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(String newTag) {
		String oldTag = tag;
		tag = newTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__TAG, oldTag, tag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(PriorityType newPriority) {
		PriorityType oldPriority = priority;
		priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(StatusType newStatus) {
		StatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUploaders() {
		return uploaders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploaders(String newUploaders) {
		String oldUploaders = uploaders;
		uploaders = newUploaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__UPLOADERS, oldUploaders, uploaders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPackage getSourcePackage() {
		if (sourcePackage != null && sourcePackage.eIsProxy()) {
			InternalEObject oldSourcePackage = (InternalEObject)sourcePackage;
			sourcePackage = (SrcPackage)eResolveProxy(oldSourcePackage);
			if (sourcePackage != oldSourcePackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.INSTALLED_PACKAGE__SOURCE_PACKAGE, oldSourcePackage, sourcePackage));
			}
		}
		return sourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPackage basicGetSourcePackage() {
		return sourcePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePackage(SrcPackage newSourcePackage) {
		SrcPackage oldSourcePackage = sourcePackage;
		sourcePackage = newSourcePackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__SOURCE_PACKAGE, oldSourcePackage, sourcePackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependence getDepends() {
		return depends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDepends(Dependence newDepends, NotificationChain msgs) {
		Dependence oldDepends = depends;
		depends = newDepends;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__DEPENDS, oldDepends, newDepends);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepends(Dependence newDepends) {
		if (newDepends != depends) {
			NotificationChain msgs = null;
			if (depends != null)
				msgs = ((InternalEObject)depends).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__DEPENDS, null, msgs);
			if (newDepends != null)
				msgs = ((InternalEObject)newDepends).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__DEPENDS, null, msgs);
			msgs = basicSetDepends(newDepends, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__DEPENDS, newDepends, newDepends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getRecommends() {
		if (recommends == null) {
			recommends = new EObjectResolvingEList(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__RECOMMENDS);
		}
		return recommends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSuggests() {
		if (suggests == null) {
			suggests = new EObjectResolvingEList(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS);
		}
		return suggests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getEnhances() {
		if (enhances == null) {
			enhances = new EObjectResolvingEList(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__ENHANCES);
		}
		return enhances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPredepends() {
		if (predepends == null) {
			predepends = new EObjectResolvingEList(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS);
		}
		return predepends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualPackage getProvides() {
		if (provides != null && provides.eIsProxy()) {
			InternalEObject oldProvides = (InternalEObject)provides;
			provides = (VirtualPackage)eResolveProxy(oldProvides);
			if (provides != oldProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MancoosiPackage.INSTALLED_PACKAGE__PROVIDES, oldProvides, provides));
			}
		}
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualPackage basicGetProvides() {
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvides(VirtualPackage newProvides) {
		VirtualPackage oldProvides = provides;
		provides = newProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__PROVIDES, oldProvides, provides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getReplaces() {
		if (replaces == null) {
			replaces = new EObjectResolvingEList(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getFiles() {
		if (files == null) {
			files = new EObjectResolvingEList(File.class, this, MancoosiPackage.INSTALLED_PACKAGE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getDocumentationFiles() {
		if (documentationFiles == null) {
			documentationFiles = new EObjectContainmentWithInverseEList(DocumentationFile.class, this, MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES, MancoosiPackage.DOCUMENTATION_FILE__PKG);
		}
		return documentationFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreinstScript getPreinstScript() {
		return preinstScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreinstScript(PreinstScript newPreinstScript, NotificationChain msgs) {
		PreinstScript oldPreinstScript = preinstScript;
		preinstScript = newPreinstScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT, oldPreinstScript, newPreinstScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreinstScript(PreinstScript newPreinstScript) {
		if (newPreinstScript != preinstScript) {
			NotificationChain msgs = null;
			if (preinstScript != null)
				msgs = ((InternalEObject)preinstScript).eInverseRemove(this, MancoosiPackage.PREINST_SCRIPT__PKG, PreinstScript.class, msgs);
			if (newPreinstScript != null)
				msgs = ((InternalEObject)newPreinstScript).eInverseAdd(this, MancoosiPackage.PREINST_SCRIPT__PKG, PreinstScript.class, msgs);
			msgs = basicSetPreinstScript(newPreinstScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT, newPreinstScript, newPreinstScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostinstScript getPostinstScript() {
		return postinstScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostinstScript(PostinstScript newPostinstScript, NotificationChain msgs) {
		PostinstScript oldPostinstScript = postinstScript;
		postinstScript = newPostinstScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT, oldPostinstScript, newPostinstScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostinstScript(PostinstScript newPostinstScript) {
		if (newPostinstScript != postinstScript) {
			NotificationChain msgs = null;
			if (postinstScript != null)
				msgs = ((InternalEObject)postinstScript).eInverseRemove(this, MancoosiPackage.POSTINST_SCRIPT__PKG, PostinstScript.class, msgs);
			if (newPostinstScript != null)
				msgs = ((InternalEObject)newPostinstScript).eInverseAdd(this, MancoosiPackage.POSTINST_SCRIPT__PKG, PostinstScript.class, msgs);
			msgs = basicSetPostinstScript(newPostinstScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT, newPostinstScript, newPostinstScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrermScript getPrermScript() {
		return prermScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrermScript(PrermScript newPrermScript, NotificationChain msgs) {
		PrermScript oldPrermScript = prermScript;
		prermScript = newPrermScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT, oldPrermScript, newPrermScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrermScript(PrermScript newPrermScript) {
		if (newPrermScript != prermScript) {
			NotificationChain msgs = null;
			if (prermScript != null)
				msgs = ((InternalEObject)prermScript).eInverseRemove(this, MancoosiPackage.PRERM_SCRIPT__PKG, PrermScript.class, msgs);
			if (newPrermScript != null)
				msgs = ((InternalEObject)newPrermScript).eInverseAdd(this, MancoosiPackage.PRERM_SCRIPT__PKG, PrermScript.class, msgs);
			msgs = basicSetPrermScript(newPrermScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT, newPrermScript, newPrermScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostrmScript getPostrmScript() {
		return postrmScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostrmScript(PostrmScript newPostrmScript, NotificationChain msgs) {
		PostrmScript oldPostrmScript = postrmScript;
		postrmScript = newPostrmScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT, oldPostrmScript, newPostrmScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostrmScript(PostrmScript newPostrmScript) {
		if (newPostrmScript != postrmScript) {
			NotificationChain msgs = null;
			if (postrmScript != null)
				msgs = ((InternalEObject)postrmScript).eInverseRemove(this, MancoosiPackage.POSTRM_SCRIPT__PKG, PostrmScript.class, msgs);
			if (newPostrmScript != null)
				msgs = ((InternalEObject)newPostrmScript).eInverseAdd(this, MancoosiPackage.POSTRM_SCRIPT__PKG, PostrmScript.class, msgs);
			msgs = basicSetPostrmScript(newPostrmScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT, newPostrmScript, newPostrmScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigScript getConfigScript() {
		return configScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigScript(ConfigScript newConfigScript, NotificationChain msgs) {
		ConfigScript oldConfigScript = configScript;
		configScript = newConfigScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT, oldConfigScript, newConfigScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigScript(ConfigScript newConfigScript) {
		if (newConfigScript != configScript) {
			NotificationChain msgs = null;
			if (configScript != null)
				msgs = ((InternalEObject)configScript).eInverseRemove(this, MancoosiPackage.CONFIG_SCRIPT__PKG, ConfigScript.class, msgs);
			if (newConfigScript != null)
				msgs = ((InternalEObject)newConfigScript).eInverseAdd(this, MancoosiPackage.CONFIG_SCRIPT__PKG, ConfigScript.class, msgs);
			msgs = basicSetConfigScript(newConfigScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT, newConfigScript, newConfigScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conflict getConflict() {
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConflict(Conflict newConflict, NotificationChain msgs) {
		Conflict oldConflict = conflict;
		conflict = newConflict;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__CONFLICT, oldConflict, newConflict);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConflict(Conflict newConflict) {
		if (newConflict != conflict) {
			NotificationChain msgs = null;
			if (conflict != null)
				msgs = ((InternalEObject)conflict).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__CONFLICT, null, msgs);
			if (newConflict != null)
				msgs = ((InternalEObject)newConflict).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__CONFLICT, null, msgs);
			msgs = basicSetConflict(newConflict, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MancoosiPackage.INSTALLED_PACKAGE__CONFLICT, newConflict, newConflict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				return ((InternalEList)getDocumentationFiles()).basicAdd(otherEnd, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT:
				if (preinstScript != null)
					msgs = ((InternalEObject)preinstScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT, null, msgs);
				return basicSetPreinstScript((PreinstScript)otherEnd, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT:
				if (postinstScript != null)
					msgs = ((InternalEObject)postinstScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT, null, msgs);
				return basicSetPostinstScript((PostinstScript)otherEnd, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT:
				if (prermScript != null)
					msgs = ((InternalEObject)prermScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT, null, msgs);
				return basicSetPrermScript((PrermScript)otherEnd, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT:
				if (postrmScript != null)
					msgs = ((InternalEObject)postrmScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT, null, msgs);
				return basicSetPostrmScript((PostrmScript)otherEnd, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT:
				if (configScript != null)
					msgs = ((InternalEObject)configScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT, null, msgs);
				return basicSetConfigScript((ConfigScript)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__DEPENDS:
				return basicSetDepends(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				return ((InternalEList)getDocumentationFiles()).basicRemove(otherEnd, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT:
				return basicSetPreinstScript(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT:
				return basicSetPostinstScript(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT:
				return basicSetPrermScript(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT:
				return basicSetPostrmScript(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT:
				return basicSetConfigScript(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__CONFLICT:
				return basicSetConflict(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				return new Integer(getInstalledSize());
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				return getMaintainer();
			case MancoosiPackage.INSTALLED_PACKAGE__ARCHITECTURE:
				return getArchitecture();
			case MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE:
				return new Integer(getFileSize());
			case MancoosiPackage.INSTALLED_PACKAGE__CHECK_SUM:
				return getCheckSum();
			case MancoosiPackage.INSTALLED_PACKAGE__DESCRIPTION:
				return getDescription();
			case MancoosiPackage.INSTALLED_PACKAGE__SECTION:
				return getSection();
			case MancoosiPackage.INSTALLED_PACKAGE__TAG:
				return getTag();
			case MancoosiPackage.INSTALLED_PACKAGE__PRIORITY:
				return getPriority();
			case MancoosiPackage.INSTALLED_PACKAGE__STATUS:
				return getStatus();
			case MancoosiPackage.INSTALLED_PACKAGE__UPLOADERS:
				return getUploaders();
			case MancoosiPackage.INSTALLED_PACKAGE__SOURCE_PACKAGE:
				if (resolve) return getSourcePackage();
				return basicGetSourcePackage();
			case MancoosiPackage.INSTALLED_PACKAGE__DEPENDS:
				return getDepends();
			case MancoosiPackage.INSTALLED_PACKAGE__RECOMMENDS:
				return getRecommends();
			case MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS:
				return getSuggests();
			case MancoosiPackage.INSTALLED_PACKAGE__ENHANCES:
				return getEnhances();
			case MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS:
				return getPredepends();
			case MancoosiPackage.INSTALLED_PACKAGE__PROVIDES:
				if (resolve) return getProvides();
				return basicGetProvides();
			case MancoosiPackage.INSTALLED_PACKAGE__REPLACES:
				return getReplaces();
			case MancoosiPackage.INSTALLED_PACKAGE__FILES:
				return getFiles();
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				return getDocumentationFiles();
			case MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT:
				return getPreinstScript();
			case MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT:
				return getPostinstScript();
			case MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT:
				return getPrermScript();
			case MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT:
				return getPostrmScript();
			case MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT:
				return getConfigScript();
			case MancoosiPackage.INSTALLED_PACKAGE__CONFLICT:
				return getConflict();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				setInstalledSize(((Integer)newValue).intValue());
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				setMaintainer((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__ARCHITECTURE:
				setArchitecture((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE:
				setFileSize(((Integer)newValue).intValue());
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__CHECK_SUM:
				setCheckSum((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SECTION:
				setSection((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__TAG:
				setTag((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PRIORITY:
				setPriority((PriorityType)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__STATUS:
				setStatus((StatusType)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__UPLOADERS:
				setUploaders((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SOURCE_PACKAGE:
				setSourcePackage((SrcPackage)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DEPENDS:
				setDepends((Dependence)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__RECOMMENDS:
				getRecommends().clear();
				getRecommends().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS:
				getSuggests().clear();
				getSuggests().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__ENHANCES:
				getEnhances().clear();
				getEnhances().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS:
				getPredepends().clear();
				getPredepends().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PROVIDES:
				setProvides((VirtualPackage)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				getDocumentationFiles().clear();
				getDocumentationFiles().addAll((Collection)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT:
				setPreinstScript((PreinstScript)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT:
				setPostinstScript((PostinstScript)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT:
				setPrermScript((PrermScript)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT:
				setPostrmScript((PostrmScript)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT:
				setConfigScript((ConfigScript)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__CONFLICT:
				setConflict((Conflict)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				setInstalledSize(INSTALLED_SIZE_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE:
				setFileSize(FILE_SIZE_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__CHECK_SUM:
				setCheckSum(CHECK_SUM_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SECTION:
				setSection(SECTION_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__TAG:
				setTag(TAG_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__UPLOADERS:
				setUploaders(UPLOADERS_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SOURCE_PACKAGE:
				setSourcePackage((SrcPackage)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DEPENDS:
				setDepends((Dependence)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__RECOMMENDS:
				getRecommends().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS:
				getSuggests().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__ENHANCES:
				getEnhances().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS:
				getPredepends().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PROVIDES:
				setProvides((VirtualPackage)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__REPLACES:
				getReplaces().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__FILES:
				getFiles().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				getDocumentationFiles().clear();
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT:
				setPreinstScript((PreinstScript)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT:
				setPostinstScript((PostinstScript)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT:
				setPrermScript((PrermScript)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT:
				setPostrmScript((PostrmScript)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT:
				setConfigScript((ConfigScript)null);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__CONFLICT:
				setConflict((Conflict)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				return installedSize != INSTALLED_SIZE_EDEFAULT;
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
			case MancoosiPackage.INSTALLED_PACKAGE__ARCHITECTURE:
				return ARCHITECTURE_EDEFAULT == null ? architecture != null : !ARCHITECTURE_EDEFAULT.equals(architecture);
			case MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE:
				return fileSize != FILE_SIZE_EDEFAULT;
			case MancoosiPackage.INSTALLED_PACKAGE__CHECK_SUM:
				return CHECK_SUM_EDEFAULT == null ? checkSum != null : !CHECK_SUM_EDEFAULT.equals(checkSum);
			case MancoosiPackage.INSTALLED_PACKAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MancoosiPackage.INSTALLED_PACKAGE__SECTION:
				return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
			case MancoosiPackage.INSTALLED_PACKAGE__TAG:
				return TAG_EDEFAULT == null ? tag != null : !TAG_EDEFAULT.equals(tag);
			case MancoosiPackage.INSTALLED_PACKAGE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case MancoosiPackage.INSTALLED_PACKAGE__STATUS:
				return status != STATUS_EDEFAULT;
			case MancoosiPackage.INSTALLED_PACKAGE__UPLOADERS:
				return UPLOADERS_EDEFAULT == null ? uploaders != null : !UPLOADERS_EDEFAULT.equals(uploaders);
			case MancoosiPackage.INSTALLED_PACKAGE__SOURCE_PACKAGE:
				return sourcePackage != null;
			case MancoosiPackage.INSTALLED_PACKAGE__DEPENDS:
				return depends != null;
			case MancoosiPackage.INSTALLED_PACKAGE__RECOMMENDS:
				return recommends != null && !recommends.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS:
				return suggests != null && !suggests.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__ENHANCES:
				return enhances != null && !enhances.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS:
				return predepends != null && !predepends.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__PROVIDES:
				return provides != null;
			case MancoosiPackage.INSTALLED_PACKAGE__REPLACES:
				return replaces != null && !replaces.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__FILES:
				return files != null && !files.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				return documentationFiles != null && !documentationFiles.isEmpty();
			case MancoosiPackage.INSTALLED_PACKAGE__PREINST_SCRIPT:
				return preinstScript != null;
			case MancoosiPackage.INSTALLED_PACKAGE__POSTINST_SCRIPT:
				return postinstScript != null;
			case MancoosiPackage.INSTALLED_PACKAGE__PRERM_SCRIPT:
				return prermScript != null;
			case MancoosiPackage.INSTALLED_PACKAGE__POSTRM_SCRIPT:
				return postrmScript != null;
			case MancoosiPackage.INSTALLED_PACKAGE__CONFIG_SCRIPT:
				return configScript != null;
			case MancoosiPackage.INSTALLED_PACKAGE__CONFLICT:
				return conflict != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (installedSize: ");
		result.append(installedSize);
		result.append(", maintainer: ");
		result.append(maintainer);
		result.append(", architecture: ");
		result.append(architecture);
		result.append(", fileSize: ");
		result.append(fileSize);
		result.append(", checkSum: ");
		result.append(checkSum);
		result.append(", description: ");
		result.append(description);
		result.append(", section: ");
		result.append(section);
		result.append(", tag: ");
		result.append(tag);
		result.append(", priority: ");
		result.append(priority);
		result.append(", status: ");
		result.append(status);
		result.append(", uploaders: ");
		result.append(uploaders);
		result.append(')');
		return result.toString();
	}

} //InstalledPackageImpl
