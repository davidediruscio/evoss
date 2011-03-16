/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.Conflict;
import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.DocumentationFile;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.PriorityType;
import it.univaq.mancoosi.mancoosimm.SrcPackage;
import it.univaq.mancoosi.mancoosimm.VirtualPackage;

import java.util.Collection;

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
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getInstalledSize <em>Installed Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getMaintainer <em>Maintainer</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getFileSize <em>File Size</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getCheckSum <em>Check Sum</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getSection <em>Section</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getUploaders <em>Uploaders</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getSourcePackage <em>Source Package</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getDepends <em>Depends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getRecommends <em>Recommends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getSuggests <em>Suggests</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getEnhances <em>Enhances</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getPredepends <em>Predepends</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getReplaces <em>Replaces</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getDocumentationFiles <em>Documentation Files</em>}</li>
 *   <li>{@link it.univaq.mancoosi.mancoosimm.impl.InstalledPackageImpl#getConflict <em>Conflict</em>}</li>
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
	protected static final PriorityType PRIORITY_EDEFAULT = PriorityType.STANDARD;

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
	protected EList<InstalledPackage> recommends;

	/**
	 * The cached value of the '{@link #getSuggests() <em>Suggests</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuggests()
	 * @generated
	 * @ordered
	 */
	protected EList<InstalledPackage> suggests;

	/**
	 * The cached value of the '{@link #getEnhances() <em>Enhances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnhances()
	 * @generated
	 * @ordered
	 */
	protected EList<InstalledPackage> enhances;

	/**
	 * The cached value of the '{@link #getPredepends() <em>Predepends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredepends()
	 * @generated
	 * @ordered
	 */
	protected EList<InstalledPackage> predepends;

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
	protected EList<InstalledPackage> replaces;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> files;

	/**
	 * The cached value of the '{@link #getDocumentationFiles() <em>Documentation Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentationFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentationFile> documentationFiles;

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
	@Override
	protected EClass eStaticClass() {
		return MancoosiPackage.Literals.INSTALLED_PACKAGE;
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
	public EList<InstalledPackage> getRecommends() {
		if (recommends == null) {
			recommends = new EObjectResolvingEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__RECOMMENDS);
		}
		return recommends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstalledPackage> getSuggests() {
		if (suggests == null) {
			suggests = new EObjectResolvingEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS);
		}
		return suggests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstalledPackage> getEnhances() {
		if (enhances == null) {
			enhances = new EObjectResolvingEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__ENHANCES);
		}
		return enhances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstalledPackage> getPredepends() {
		if (predepends == null) {
			predepends = new EObjectResolvingEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS);
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
	public EList<InstalledPackage> getReplaces() {
		if (replaces == null) {
			replaces = new EObjectResolvingEList<InstalledPackage>(InstalledPackage.class, this, MancoosiPackage.INSTALLED_PACKAGE__REPLACES);
		}
		return replaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getFiles() {
		if (files == null) {
			files = new EObjectResolvingEList<File>(File.class, this, MancoosiPackage.INSTALLED_PACKAGE__FILES);
		}
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentationFile> getDocumentationFiles() {
		if (documentationFiles == null) {
			documentationFiles = new EObjectContainmentWithInverseEList<DocumentationFile>(DocumentationFile.class, this, MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES, MancoosiPackage.DOCUMENTATION_FILE__PKG);
		}
		return documentationFiles;
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDocumentationFiles()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__DEPENDS:
				return basicSetDepends(null, msgs);
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				return ((InternalEList<?>)getDocumentationFiles()).basicRemove(otherEnd, msgs);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				return getInstalledSize();
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				return getMaintainer();
			case MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE:
				return getFileSize();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				setInstalledSize((Integer)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				setMaintainer((String)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__FILE_SIZE:
				setFileSize((Integer)newValue);
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
				getRecommends().addAll((Collection<? extends InstalledPackage>)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__SUGGESTS:
				getSuggests().clear();
				getSuggests().addAll((Collection<? extends InstalledPackage>)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__ENHANCES:
				getEnhances().clear();
				getEnhances().addAll((Collection<? extends InstalledPackage>)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PREDEPENDS:
				getPredepends().clear();
				getPredepends().addAll((Collection<? extends InstalledPackage>)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__PROVIDES:
				setProvides((VirtualPackage)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__REPLACES:
				getReplaces().clear();
				getReplaces().addAll((Collection<? extends InstalledPackage>)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__FILES:
				getFiles().clear();
				getFiles().addAll((Collection<? extends File>)newValue);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__DOCUMENTATION_FILES:
				getDocumentationFiles().clear();
				getDocumentationFiles().addAll((Collection<? extends DocumentationFile>)newValue);
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
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				setInstalledSize(INSTALLED_SIZE_EDEFAULT);
				return;
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				setMaintainer(MAINTAINER_EDEFAULT);
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
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MancoosiPackage.INSTALLED_PACKAGE__INSTALLED_SIZE:
				return installedSize != INSTALLED_SIZE_EDEFAULT;
			case MancoosiPackage.INSTALLED_PACKAGE__MAINTAINER:
				return MAINTAINER_EDEFAULT == null ? maintainer != null : !MAINTAINER_EDEFAULT.equals(maintainer);
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
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (installedSize: ");
		result.append(installedSize);
		result.append(", maintainer: ");
		result.append(maintainer);
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
		result.append(", uploaders: ");
		result.append(uploaders);
		result.append(')');
		return result.toString();
	}
	
	//mirco
	public boolean equals (InstalledPackage installPackage) {
		return this.getName().equals(installPackage.getName());
	}

} //InstalledPackageImpl
