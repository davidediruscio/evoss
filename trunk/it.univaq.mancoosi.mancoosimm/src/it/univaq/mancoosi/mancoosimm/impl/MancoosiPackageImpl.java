/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.impl;

import it.univaq.mancoosi.mancoosimm.Alternative;
import it.univaq.mancoosi.mancoosimm.AndConflict;
import it.univaq.mancoosi.mancoosimm.AndDep;
import it.univaq.mancoosi.mancoosimm.AndInv;
import it.univaq.mancoosi.mancoosimm.ApplicationMenuCatalog;
import it.univaq.mancoosi.mancoosimm.Atom;
import it.univaq.mancoosi.mancoosimm.BinPackage;
import it.univaq.mancoosi.mancoosimm.Boot;
import it.univaq.mancoosi.mancoosimm.ConfigFilesPackage;
import it.univaq.mancoosi.mancoosimm.Configuration;
import it.univaq.mancoosi.mancoosimm.Conflict;
import it.univaq.mancoosi.mancoosimm.Dependence;
import it.univaq.mancoosi.mancoosimm.DesktopDB;
import it.univaq.mancoosi.mancoosimm.DocumentationFile;
import it.univaq.mancoosi.mancoosimm.EmacsPackage;
import it.univaq.mancoosi.mancoosimm.Environment;
import it.univaq.mancoosi.mancoosimm.File;
import it.univaq.mancoosi.mancoosimm.FileSystem;
import it.univaq.mancoosi.mancoosimm.GConf;
import it.univaq.mancoosi.mancoosimm.Group;
import it.univaq.mancoosi.mancoosimm.HalfConfiguredPackage;
import it.univaq.mancoosi.mancoosimm.HalfConfiguredReinstRequiredPackage;
import it.univaq.mancoosi.mancoosimm.HalfInstalledPackage;
import it.univaq.mancoosi.mancoosimm.HalfInstalledReinstRequiredPackage;
import it.univaq.mancoosi.mancoosimm.IconCache;
import it.univaq.mancoosi.mancoosimm.InformationFile;
import it.univaq.mancoosi.mancoosimm.InstalledPackage;
import it.univaq.mancoosi.mancoosimm.Invariant;
import it.univaq.mancoosi.mancoosimm.LibraryCache;
import it.univaq.mancoosi.mancoosimm.MancoosiFactory;
import it.univaq.mancoosi.mancoosimm.MancoosiPackage;
import it.univaq.mancoosi.mancoosimm.Menu;
import it.univaq.mancoosi.mancoosimm.MenuEntry;
import it.univaq.mancoosi.mancoosimm.MimeType;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandler;
import it.univaq.mancoosi.mancoosimm.MimeTypeHandlerCache;
import it.univaq.mancoosi.mancoosimm.Module;
import it.univaq.mancoosi.mancoosimm.ModuleCache;
import it.univaq.mancoosi.mancoosimm.NamedElement;
import it.univaq.mancoosi.mancoosimm.NotInstalledPackage;
import it.univaq.mancoosi.mancoosimm.NotInv;
import it.univaq.mancoosi.mancoosimm.OrConflict;
import it.univaq.mancoosi.mancoosimm.OrDep;
import it.univaq.mancoosi.mancoosimm.OrInv;
import it.univaq.mancoosi.mancoosimm.PackageSetting;
import it.univaq.mancoosi.mancoosimm.PriorityType;
import it.univaq.mancoosi.mancoosimm.SGMLCatalog;
import it.univaq.mancoosi.mancoosimm.SGMLDocument;
import it.univaq.mancoosi.mancoosimm.Service;
import it.univaq.mancoosi.mancoosimm.SharedLibrary;
import it.univaq.mancoosi.mancoosimm.SingleConflict;
import it.univaq.mancoosi.mancoosimm.SingleDep;
import it.univaq.mancoosi.mancoosimm.SkeeperCatalog;
import it.univaq.mancoosi.mancoosimm.SkeeperDocument;
import it.univaq.mancoosi.mancoosimm.SrcPackage;
import it.univaq.mancoosi.mancoosimm.StatusType;
import it.univaq.mancoosi.mancoosimm.UnpackedPackage;
import it.univaq.mancoosi.mancoosimm.User;
import it.univaq.mancoosi.mancoosimm.VersionType;
import it.univaq.mancoosi.mancoosimm.VirtualPackage;
import it.univaq.mancoosi.mancoosimm.XFont;
import it.univaq.mancoosi.mancoosimm.XFontCache;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MancoosiPackageImpl extends EPackageImpl implements MancoosiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass installedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notInstalledPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configFilesPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unpackedPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfConfiguredPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfConfiguredReinstRequiredPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfInstalledPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass halfInstalledReinstRequiredPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andDepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orDepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleDepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andInvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orInvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notInvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileSystemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gConfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationMenuCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass menuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageSettingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass desktopDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeHandlerCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xFontCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xFontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharedLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sgmlCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sgmlDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeeperCatalogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass skeeperDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emacsPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orConflictEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MancoosiPackageImpl() {
		super(eNS_URI, MancoosiFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MancoosiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MancoosiPackage init() {
		if (isInited) return (MancoosiPackage)EPackage.Registry.INSTANCE.getEPackage(MancoosiPackage.eNS_URI);

		// Obtain or create and register package
		MancoosiPackageImpl theMancoosiPackage = (MancoosiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MancoosiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MancoosiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMancoosiPackage.createPackageContents();

		// Initialize created meta-data
		theMancoosiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMancoosiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MancoosiPackage.eNS_URI, theMancoosiPackage);
		return theMancoosiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfiguration() {
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_CreationTime() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfiguration_SystemType() {
		return (EAttribute)configurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_FileSystem() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_Environment() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_InstalledPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_NotInstalledPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_ConfigFilesPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_UnpackedPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_HalfConfiguredPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_HalfInstalledPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_HalfConfiguredReinstRequiredPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfiguration_HalfInstalledReinstRequiredPackages() {
		return (EReference)configurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Version() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_Configuration() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageSettings() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Architecture() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstalledPackage() {
		return installedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_InstalledSize() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_Maintainer() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_FileSize() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_CheckSum() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_Description() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_Section() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_Tag() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_Priority() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstalledPackage_Uploaders() {
		return (EAttribute)installedPackageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_SourcePackage() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Depends() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Recommends() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Suggests() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Enhances() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Predepends() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Provides() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Replaces() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Files() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_DocumentationFiles() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstalledPackage_Conflict() {
		return (EReference)installedPackageEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotInstalledPackage() {
		return notInstalledPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigFilesPackage() {
		return configFilesPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_Maintainer() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_CheckSum() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_Description() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_Section() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_Tag() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_Priority() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigFilesPackage_Uploaders() {
		return (EAttribute)configFilesPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnpackedPackage() {
		return unpackedPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_Maintainer() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_CheckSum() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_Description() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_Section() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_Tag() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_Priority() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpackedPackage_Uploaders() {
		return (EAttribute)unpackedPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnpackedPackage_Files() {
		return (EReference)unpackedPackageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfConfiguredPackage() {
		return halfConfiguredPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfConfiguredReinstRequiredPackage() {
		return halfConfiguredReinstRequiredPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfInstalledPackage() {
		return halfInstalledPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_Maintainer() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_CheckSum() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_Description() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_Section() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_Tag() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_Priority() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledPackage_Uploaders() {
		return (EAttribute)halfInstalledPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHalfInstalledReinstRequiredPackage() {
		return halfInstalledReinstRequiredPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_Maintainer() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_CheckSum() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_Description() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_Section() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_Tag() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_Priority() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHalfInstalledReinstRequiredPackage_Uploaders() {
		return (EAttribute)halfInstalledReinstRequiredPackageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSrcPackage() {
		return srcPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcPackage_BuildDepends() {
		return (EReference)srcPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSrcPackage_BuildConflicts() {
		return (EReference)srcPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinPackage() {
		return binPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinPackage_SrcRef() {
		return (EReference)binPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualPackage() {
		return virtualPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVirtualPackage_ImpPackage() {
		return (EReference)virtualPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependence() {
		return dependenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_AndDep() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_OrDep() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_SingleDep() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependence_Pkg() {
		return (EReference)dependenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndDep() {
		return andDepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndDep_Ops() {
		return (EReference)andDepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndDep_Dependence() {
		return (EReference)andDepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrDep() {
		return orDepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrDep_Ops() {
		return (EReference)orDepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrDep_Dependence() {
		return (EReference)orDepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleDep() {
		return singleDepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleDep_Dependence() {
		return (EReference)singleDepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleDep_Version() {
		return (EAttribute)singleDepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleDep_Value() {
		return (EAttribute)singleDepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvariant() {
		return invariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariant_AtomEl() {
		return (EReference)invariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariant_And() {
		return (EReference)invariantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariant_Or() {
		return (EReference)invariantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvariant_Not() {
		return (EReference)invariantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndInv() {
		return andInvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndInv_Left() {
		return (EReference)andInvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndInv_Right() {
		return (EReference)andInvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrInv() {
		return orInvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrInv_Left() {
		return (EReference)orInvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrInv_Right() {
		return (EReference)orInvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotInv() {
		return notInvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotInv_Elem() {
		return (EReference)notInvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_RunningServices() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Alternatives() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Users() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Groups() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Emacspkg() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_IconCache() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_DesktopDb() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_MimeTypeHandlerCache() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_LibraryCache() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_SkeeperCatalog() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_SgmlCatalog() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Configuration() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_ModuleCache() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_XfontCaches() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Gconf() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvironment_Menu() {
		return (EReference)environmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileSystem() {
		return fileSystemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSystem_Root() {
		return (EReference)fileSystemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSystem_Configuration() {
		return (EReference)fileSystemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileSystem_AllFiles() {
		return (EReference)fileSystemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGConf() {
		return gConfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGConf_ConfFiles() {
		return (EReference)gConfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGConf_Schemas() {
		return (EReference)gConfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGConf_Env() {
		return (EReference)gConfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationMenuCatalog() {
		return applicationMenuCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationMenuCatalog_Menu() {
		return (EReference)applicationMenuCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenu() {
		return menuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Entries() {
		return (EReference)menuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Catalog() {
		return (EReference)menuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenu_Env() {
		return (EReference)menuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMenuEntry() {
		return menuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuEntry_Menu() {
		return (EReference)menuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuEntry_Executable() {
		return (EReference)menuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMenuEntry_Parent() {
		return (EReference)menuEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoot() {
		return bootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoot_Services() {
		return (EReference)bootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Executable() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getService_Env() {
		return (EReference)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Extension() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Description() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Size() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_CheckSum() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_IsDirectory() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Suid() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Guid() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Permission() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_Location() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Fs() {
		return (EReference)fileEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Childs() {
		return (EReference)fileEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Parent() {
		return (EReference)fileEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Owner() {
		return (EReference)fileEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Group() {
		return (EReference)fileEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFile_IsMissing() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_PkgSettings() {
		return (EReference)fileEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentationFile() {
		return documentationFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentationFile_Pkg() {
		return (EReference)documentationFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFile() {
		return informationFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternative() {
		return alternativeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_Current() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_Location() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternative_Env() {
		return (EReference)alternativeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageSetting() {
		return packageSettingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageSetting_Services() {
		return (EReference)packageSettingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageSetting_Files() {
		return (EReference)packageSettingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageSetting_Pkg() {
		return (EReference)packageSettingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageSetting_Dependences() {
		return (EReference)packageSettingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIconCache() {
		return iconCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIconCache_Mtime() {
		return (EAttribute)iconCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconCache_Env() {
		return (EReference)iconCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIconCache_Icons() {
		return (EReference)iconCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesktopDB() {
		return desktopDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesktopDB_Env() {
		return (EReference)desktopDBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesktopDB_Applications() {
		return (EReference)desktopDBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeTypeHandlerCache() {
		return mimeTypeHandlerCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeTypeHandlerCache_Env() {
		return (EReference)mimeTypeHandlerCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeTypeHandlerCache_Handlers() {
		return (EReference)mimeTypeHandlerCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeTypeHandlerCache_MimeTypes() {
		return (EReference)mimeTypeHandlerCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeTypeHandler() {
		return mimeTypeHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeTypeHandler_Handler() {
		return (EReference)mimeTypeHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeTypeHandler_Type() {
		return (EReference)mimeTypeHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeTypeHandler_Cache() {
		return (EReference)mimeTypeHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMimeType() {
		return mimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimeType_Name() {
		return (EAttribute)mimeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMimeType_Extension() {
		return (EAttribute)mimeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeType_MimeTypeHandlers() {
		return (EReference)mimeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMimeType_Cache() {
		return (EReference)mimeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXFontCache() {
		return xFontCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFontCache_Xfonts() {
		return (EReference)xFontCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFontCache_Location() {
		return (EAttribute)xFontCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFontCache_Env() {
		return (EReference)xFontCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXFont() {
		return xFontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFont_XfontCache() {
		return (EReference)xFontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXFont_File() {
		return (EReference)xFontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibraryCache() {
		return libraryCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryCache_Locations() {
		return (EReference)libraryCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryCache_SharedLibraries() {
		return (EReference)libraryCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLibraryCache_Env() {
		return (EReference)libraryCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharedLibrary() {
		return sharedLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedLibrary_Name() {
		return (EAttribute)sharedLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedLibrary_File() {
		return (EReference)sharedLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharedLibrary_Version() {
		return (EAttribute)sharedLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSharedLibrary_LibraryCache() {
		return (EReference)sharedLibraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModuleCache() {
		return moduleCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModuleCache_Version() {
		return (EAttribute)moduleCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleCache_Modules() {
		return (EReference)moduleCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModuleCache_Env() {
		return (EReference)moduleCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_File() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModuleCache() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGMLCatalog() {
		return sgmlCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGMLCatalog_Env() {
		return (EReference)sgmlCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGMLCatalog_Documents() {
		return (EReference)sgmlCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGMLDocument() {
		return sgmlDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGMLDocument_Location() {
		return (EReference)sgmlDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSGMLDocument_Document() {
		return (EReference)sgmlDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkeeperCatalog() {
		return skeeperCatalogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeeperCatalog_Env() {
		return (EReference)skeeperCatalogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeeperCatalog_Documents() {
		return (EReference)skeeperCatalogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSkeeperDocument() {
		return skeeperDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeeperDocument_Location() {
		return (EReference)skeeperDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSkeeperDocument_Document() {
		return (EReference)skeeperDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmacsPackage() {
		return emacsPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmacsPackage_Files() {
		return (EReference)emacsPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmacsPackage_Env() {
		return (EReference)emacsPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Env() {
		return (EReference)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Groups() {
		return (EReference)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Home() {
		return (EReference)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Env() {
		return (EReference)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Users() {
		return (EReference)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleConflict() {
		return singleConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleConflict_Conflict() {
		return (EReference)singleConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleConflict_Version() {
		return (EAttribute)singleConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleConflict_Value() {
		return (EAttribute)singleConflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflict() {
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_AndConflict() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_OrConflict() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_SingleConflict() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_Pkg() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndConflict() {
		return andConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndConflict_Ops() {
		return (EReference)andConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAndConflict_Conflict() {
		return (EReference)andConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrConflict() {
		return orConflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrConflict_Ops() {
		return (EReference)orConflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrConflict_Conflict() {
		return (EReference)orConflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityType() {
		return priorityTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusType() {
		return statusTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionType() {
		return versionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiFactory getMancoosiFactory() {
		return (MancoosiFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		configurationEClass = createEClass(CONFIGURATION);
		createEAttribute(configurationEClass, CONFIGURATION__CREATION_TIME);
		createEAttribute(configurationEClass, CONFIGURATION__SYSTEM_TYPE);
		createEReference(configurationEClass, CONFIGURATION__FILE_SYSTEM);
		createEReference(configurationEClass, CONFIGURATION__ENVIRONMENT);
		createEReference(configurationEClass, CONFIGURATION__INSTALLED_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__NOT_INSTALLED_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__CONFIG_FILES_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__UNPACKED_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__HALF_CONFIGURED_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__HALF_INSTALLED_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__HALF_CONFIGURED_REINST_REQUIRED_PACKAGES);
		createEReference(configurationEClass, CONFIGURATION__HALF_INSTALLED_REINST_REQUIRED_PACKAGES);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__VERSION);
		createEReference(packageEClass, PACKAGE__CONFIGURATION);
		createEReference(packageEClass, PACKAGE__PACKAGE_SETTINGS);
		createEAttribute(packageEClass, PACKAGE__ARCHITECTURE);

		installedPackageEClass = createEClass(INSTALLED_PACKAGE);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__INSTALLED_SIZE);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__MAINTAINER);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__FILE_SIZE);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__CHECK_SUM);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__DESCRIPTION);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__SECTION);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__TAG);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__PRIORITY);
		createEAttribute(installedPackageEClass, INSTALLED_PACKAGE__UPLOADERS);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__SOURCE_PACKAGE);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__DEPENDS);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__RECOMMENDS);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__SUGGESTS);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__ENHANCES);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__PREDEPENDS);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__PROVIDES);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__REPLACES);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__FILES);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__DOCUMENTATION_FILES);
		createEReference(installedPackageEClass, INSTALLED_PACKAGE__CONFLICT);

		notInstalledPackageEClass = createEClass(NOT_INSTALLED_PACKAGE);

		configFilesPackageEClass = createEClass(CONFIG_FILES_PACKAGE);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__MAINTAINER);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__CHECK_SUM);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__DESCRIPTION);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__SECTION);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__TAG);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__PRIORITY);
		createEAttribute(configFilesPackageEClass, CONFIG_FILES_PACKAGE__UPLOADERS);

		unpackedPackageEClass = createEClass(UNPACKED_PACKAGE);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__MAINTAINER);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__CHECK_SUM);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__DESCRIPTION);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__SECTION);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__TAG);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__PRIORITY);
		createEAttribute(unpackedPackageEClass, UNPACKED_PACKAGE__UPLOADERS);
		createEReference(unpackedPackageEClass, UNPACKED_PACKAGE__FILES);

		halfConfiguredPackageEClass = createEClass(HALF_CONFIGURED_PACKAGE);

		halfConfiguredReinstRequiredPackageEClass = createEClass(HALF_CONFIGURED_REINST_REQUIRED_PACKAGE);

		halfInstalledPackageEClass = createEClass(HALF_INSTALLED_PACKAGE);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__MAINTAINER);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__CHECK_SUM);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__DESCRIPTION);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__SECTION);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__TAG);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__PRIORITY);
		createEAttribute(halfInstalledPackageEClass, HALF_INSTALLED_PACKAGE__UPLOADERS);

		halfInstalledReinstRequiredPackageEClass = createEClass(HALF_INSTALLED_REINST_REQUIRED_PACKAGE);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__MAINTAINER);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__CHECK_SUM);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__DESCRIPTION);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__SECTION);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__TAG);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__PRIORITY);
		createEAttribute(halfInstalledReinstRequiredPackageEClass, HALF_INSTALLED_REINST_REQUIRED_PACKAGE__UPLOADERS);

		srcPackageEClass = createEClass(SRC_PACKAGE);
		createEReference(srcPackageEClass, SRC_PACKAGE__BUILD_DEPENDS);
		createEReference(srcPackageEClass, SRC_PACKAGE__BUILD_CONFLICTS);

		binPackageEClass = createEClass(BIN_PACKAGE);
		createEReference(binPackageEClass, BIN_PACKAGE__SRC_REF);

		virtualPackageEClass = createEClass(VIRTUAL_PACKAGE);
		createEReference(virtualPackageEClass, VIRTUAL_PACKAGE__IMP_PACKAGE);

		dependenceEClass = createEClass(DEPENDENCE);
		createEReference(dependenceEClass, DEPENDENCE__AND_DEP);
		createEReference(dependenceEClass, DEPENDENCE__OR_DEP);
		createEReference(dependenceEClass, DEPENDENCE__SINGLE_DEP);
		createEReference(dependenceEClass, DEPENDENCE__PKG);

		andDepEClass = createEClass(AND_DEP);
		createEReference(andDepEClass, AND_DEP__OPS);
		createEReference(andDepEClass, AND_DEP__DEPENDENCE);

		orDepEClass = createEClass(OR_DEP);
		createEReference(orDepEClass, OR_DEP__OPS);
		createEReference(orDepEClass, OR_DEP__DEPENDENCE);

		singleDepEClass = createEClass(SINGLE_DEP);
		createEReference(singleDepEClass, SINGLE_DEP__DEPENDENCE);
		createEAttribute(singleDepEClass, SINGLE_DEP__VERSION);
		createEAttribute(singleDepEClass, SINGLE_DEP__VALUE);

		invariantEClass = createEClass(INVARIANT);
		createEReference(invariantEClass, INVARIANT__ATOM_EL);
		createEReference(invariantEClass, INVARIANT__AND);
		createEReference(invariantEClass, INVARIANT__OR);
		createEReference(invariantEClass, INVARIANT__NOT);

		atomEClass = createEClass(ATOM);

		andInvEClass = createEClass(AND_INV);
		createEReference(andInvEClass, AND_INV__LEFT);
		createEReference(andInvEClass, AND_INV__RIGHT);

		orInvEClass = createEClass(OR_INV);
		createEReference(orInvEClass, OR_INV__LEFT);
		createEReference(orInvEClass, OR_INV__RIGHT);

		notInvEClass = createEClass(NOT_INV);
		createEReference(notInvEClass, NOT_INV__ELEM);

		environmentEClass = createEClass(ENVIRONMENT);
		createEReference(environmentEClass, ENVIRONMENT__RUNNING_SERVICES);
		createEReference(environmentEClass, ENVIRONMENT__ALTERNATIVES);
		createEReference(environmentEClass, ENVIRONMENT__USERS);
		createEReference(environmentEClass, ENVIRONMENT__GROUPS);
		createEReference(environmentEClass, ENVIRONMENT__EMACSPKG);
		createEReference(environmentEClass, ENVIRONMENT__ICON_CACHE);
		createEReference(environmentEClass, ENVIRONMENT__DESKTOP_DB);
		createEReference(environmentEClass, ENVIRONMENT__MIME_TYPE_HANDLER_CACHE);
		createEReference(environmentEClass, ENVIRONMENT__LIBRARY_CACHE);
		createEReference(environmentEClass, ENVIRONMENT__SKEEPER_CATALOG);
		createEReference(environmentEClass, ENVIRONMENT__SGML_CATALOG);
		createEReference(environmentEClass, ENVIRONMENT__CONFIGURATION);
		createEReference(environmentEClass, ENVIRONMENT__MODULE_CACHE);
		createEReference(environmentEClass, ENVIRONMENT__XFONT_CACHES);
		createEReference(environmentEClass, ENVIRONMENT__GCONF);
		createEReference(environmentEClass, ENVIRONMENT__MENU);

		fileSystemEClass = createEClass(FILE_SYSTEM);
		createEReference(fileSystemEClass, FILE_SYSTEM__ROOT);
		createEReference(fileSystemEClass, FILE_SYSTEM__CONFIGURATION);
		createEReference(fileSystemEClass, FILE_SYSTEM__ALL_FILES);

		gConfEClass = createEClass(GCONF);
		createEReference(gConfEClass, GCONF__CONF_FILES);
		createEReference(gConfEClass, GCONF__SCHEMAS);
		createEReference(gConfEClass, GCONF__ENV);

		applicationMenuCatalogEClass = createEClass(APPLICATION_MENU_CATALOG);
		createEReference(applicationMenuCatalogEClass, APPLICATION_MENU_CATALOG__MENU);

		menuEClass = createEClass(MENU);
		createEReference(menuEClass, MENU__ENTRIES);
		createEReference(menuEClass, MENU__CATALOG);
		createEReference(menuEClass, MENU__ENV);

		menuEntryEClass = createEClass(MENU_ENTRY);
		createEReference(menuEntryEClass, MENU_ENTRY__MENU);
		createEReference(menuEntryEClass, MENU_ENTRY__EXECUTABLE);
		createEReference(menuEntryEClass, MENU_ENTRY__PARENT);

		bootEClass = createEClass(BOOT);
		createEReference(bootEClass, BOOT__SERVICES);

		serviceEClass = createEClass(SERVICE);
		createEReference(serviceEClass, SERVICE__EXECUTABLE);
		createEReference(serviceEClass, SERVICE__ENV);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__EXTENSION);
		createEAttribute(fileEClass, FILE__DESCRIPTION);
		createEAttribute(fileEClass, FILE__SIZE);
		createEAttribute(fileEClass, FILE__CHECK_SUM);
		createEAttribute(fileEClass, FILE__IS_DIRECTORY);
		createEAttribute(fileEClass, FILE__SUID);
		createEAttribute(fileEClass, FILE__GUID);
		createEAttribute(fileEClass, FILE__PERMISSION);
		createEAttribute(fileEClass, FILE__LOCATION);
		createEReference(fileEClass, FILE__FS);
		createEReference(fileEClass, FILE__CHILDS);
		createEReference(fileEClass, FILE__PARENT);
		createEReference(fileEClass, FILE__OWNER);
		createEReference(fileEClass, FILE__GROUP);
		createEAttribute(fileEClass, FILE__IS_MISSING);
		createEReference(fileEClass, FILE__PKG_SETTINGS);

		documentationFileEClass = createEClass(DOCUMENTATION_FILE);
		createEReference(documentationFileEClass, DOCUMENTATION_FILE__PKG);

		informationFileEClass = createEClass(INFORMATION_FILE);

		alternativeEClass = createEClass(ALTERNATIVE);
		createEReference(alternativeEClass, ALTERNATIVE__CURRENT);
		createEReference(alternativeEClass, ALTERNATIVE__LOCATION);
		createEReference(alternativeEClass, ALTERNATIVE__ENV);

		packageSettingEClass = createEClass(PACKAGE_SETTING);
		createEReference(packageSettingEClass, PACKAGE_SETTING__SERVICES);
		createEReference(packageSettingEClass, PACKAGE_SETTING__FILES);
		createEReference(packageSettingEClass, PACKAGE_SETTING__PKG);
		createEReference(packageSettingEClass, PACKAGE_SETTING__DEPENDENCES);

		iconCacheEClass = createEClass(ICON_CACHE);
		createEAttribute(iconCacheEClass, ICON_CACHE__MTIME);
		createEReference(iconCacheEClass, ICON_CACHE__ENV);
		createEReference(iconCacheEClass, ICON_CACHE__ICONS);

		desktopDBEClass = createEClass(DESKTOP_DB);
		createEReference(desktopDBEClass, DESKTOP_DB__ENV);
		createEReference(desktopDBEClass, DESKTOP_DB__APPLICATIONS);

		mimeTypeHandlerCacheEClass = createEClass(MIME_TYPE_HANDLER_CACHE);
		createEReference(mimeTypeHandlerCacheEClass, MIME_TYPE_HANDLER_CACHE__ENV);
		createEReference(mimeTypeHandlerCacheEClass, MIME_TYPE_HANDLER_CACHE__HANDLERS);
		createEReference(mimeTypeHandlerCacheEClass, MIME_TYPE_HANDLER_CACHE__MIME_TYPES);

		mimeTypeHandlerEClass = createEClass(MIME_TYPE_HANDLER);
		createEReference(mimeTypeHandlerEClass, MIME_TYPE_HANDLER__HANDLER);
		createEReference(mimeTypeHandlerEClass, MIME_TYPE_HANDLER__TYPE);
		createEReference(mimeTypeHandlerEClass, MIME_TYPE_HANDLER__CACHE);

		mimeTypeEClass = createEClass(MIME_TYPE);
		createEAttribute(mimeTypeEClass, MIME_TYPE__NAME);
		createEAttribute(mimeTypeEClass, MIME_TYPE__EXTENSION);
		createEReference(mimeTypeEClass, MIME_TYPE__MIME_TYPE_HANDLERS);
		createEReference(mimeTypeEClass, MIME_TYPE__CACHE);

		xFontCacheEClass = createEClass(XFONT_CACHE);
		createEReference(xFontCacheEClass, XFONT_CACHE__XFONTS);
		createEAttribute(xFontCacheEClass, XFONT_CACHE__LOCATION);
		createEReference(xFontCacheEClass, XFONT_CACHE__ENV);

		xFontEClass = createEClass(XFONT);
		createEReference(xFontEClass, XFONT__XFONT_CACHE);
		createEReference(xFontEClass, XFONT__FILE);

		libraryCacheEClass = createEClass(LIBRARY_CACHE);
		createEReference(libraryCacheEClass, LIBRARY_CACHE__LOCATIONS);
		createEReference(libraryCacheEClass, LIBRARY_CACHE__SHARED_LIBRARIES);
		createEReference(libraryCacheEClass, LIBRARY_CACHE__ENV);

		sharedLibraryEClass = createEClass(SHARED_LIBRARY);
		createEAttribute(sharedLibraryEClass, SHARED_LIBRARY__NAME);
		createEReference(sharedLibraryEClass, SHARED_LIBRARY__FILE);
		createEAttribute(sharedLibraryEClass, SHARED_LIBRARY__VERSION);
		createEReference(sharedLibraryEClass, SHARED_LIBRARY__LIBRARY_CACHE);

		moduleCacheEClass = createEClass(MODULE_CACHE);
		createEAttribute(moduleCacheEClass, MODULE_CACHE__VERSION);
		createEReference(moduleCacheEClass, MODULE_CACHE__MODULES);
		createEReference(moduleCacheEClass, MODULE_CACHE__ENV);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__FILE);
		createEReference(moduleEClass, MODULE__MODULE_CACHE);

		sgmlCatalogEClass = createEClass(SGML_CATALOG);
		createEReference(sgmlCatalogEClass, SGML_CATALOG__ENV);
		createEReference(sgmlCatalogEClass, SGML_CATALOG__DOCUMENTS);

		sgmlDocumentEClass = createEClass(SGML_DOCUMENT);
		createEReference(sgmlDocumentEClass, SGML_DOCUMENT__LOCATION);
		createEReference(sgmlDocumentEClass, SGML_DOCUMENT__DOCUMENT);

		skeeperCatalogEClass = createEClass(SKEEPER_CATALOG);
		createEReference(skeeperCatalogEClass, SKEEPER_CATALOG__ENV);
		createEReference(skeeperCatalogEClass, SKEEPER_CATALOG__DOCUMENTS);

		skeeperDocumentEClass = createEClass(SKEEPER_DOCUMENT);
		createEReference(skeeperDocumentEClass, SKEEPER_DOCUMENT__LOCATION);
		createEReference(skeeperDocumentEClass, SKEEPER_DOCUMENT__DOCUMENT);

		emacsPackageEClass = createEClass(EMACS_PACKAGE);
		createEReference(emacsPackageEClass, EMACS_PACKAGE__FILES);
		createEReference(emacsPackageEClass, EMACS_PACKAGE__ENV);

		userEClass = createEClass(USER);
		createEReference(userEClass, USER__ENV);
		createEReference(userEClass, USER__GROUPS);
		createEReference(userEClass, USER__HOME);

		groupEClass = createEClass(GROUP);
		createEReference(groupEClass, GROUP__ENV);
		createEReference(groupEClass, GROUP__USERS);

		singleConflictEClass = createEClass(SINGLE_CONFLICT);
		createEReference(singleConflictEClass, SINGLE_CONFLICT__CONFLICT);
		createEAttribute(singleConflictEClass, SINGLE_CONFLICT__VERSION);
		createEAttribute(singleConflictEClass, SINGLE_CONFLICT__VALUE);

		conflictEClass = createEClass(CONFLICT);
		createEReference(conflictEClass, CONFLICT__AND_CONFLICT);
		createEReference(conflictEClass, CONFLICT__OR_CONFLICT);
		createEReference(conflictEClass, CONFLICT__SINGLE_CONFLICT);
		createEReference(conflictEClass, CONFLICT__PKG);

		andConflictEClass = createEClass(AND_CONFLICT);
		createEReference(andConflictEClass, AND_CONFLICT__OPS);
		createEReference(andConflictEClass, AND_CONFLICT__CONFLICT);

		orConflictEClass = createEClass(OR_CONFLICT);
		createEReference(orConflictEClass, OR_CONFLICT__OPS);
		createEReference(orConflictEClass, OR_CONFLICT__CONFLICT);

		// Create enums
		priorityTypeEEnum = createEEnum(PRIORITY_TYPE);
		statusTypeEEnum = createEEnum(STATUS_TYPE);
		versionTypeEEnum = createEEnum(VERSION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		configurationEClass.getESuperTypes().add(this.getNamedElement());
		packageEClass.getESuperTypes().add(this.getNamedElement());
		installedPackageEClass.getESuperTypes().add(this.getPackage());
		notInstalledPackageEClass.getESuperTypes().add(this.getPackage());
		configFilesPackageEClass.getESuperTypes().add(this.getPackage());
		unpackedPackageEClass.getESuperTypes().add(this.getPackage());
		halfConfiguredPackageEClass.getESuperTypes().add(this.getUnpackedPackage());
		halfConfiguredReinstRequiredPackageEClass.getESuperTypes().add(this.getUnpackedPackage());
		halfInstalledPackageEClass.getESuperTypes().add(this.getPackage());
		halfInstalledReinstRequiredPackageEClass.getESuperTypes().add(this.getPackage());
		srcPackageEClass.getESuperTypes().add(this.getInstalledPackage());
		binPackageEClass.getESuperTypes().add(this.getInstalledPackage());
		virtualPackageEClass.getESuperTypes().add(this.getInstalledPackage());
		andDepEClass.getESuperTypes().add(this.getDependence());
		orDepEClass.getESuperTypes().add(this.getDependence());
		singleDepEClass.getESuperTypes().add(this.getDependence());
		invariantEClass.getESuperTypes().add(this.getNamedElement());
		atomEClass.getESuperTypes().add(this.getNamedElement());
		environmentEClass.getESuperTypes().add(this.getNamedElement());
		fileSystemEClass.getESuperTypes().add(this.getNamedElement());
		applicationMenuCatalogEClass.getESuperTypes().add(this.getNamedElement());
		menuEntryEClass.getESuperTypes().add(this.getNamedElement());
		serviceEClass.getESuperTypes().add(this.getNamedElement());
		fileEClass.getESuperTypes().add(this.getNamedElement());
		documentationFileEClass.getESuperTypes().add(this.getFile());
		informationFileEClass.getESuperTypes().add(this.getFile());
		alternativeEClass.getESuperTypes().add(this.getNamedElement());
		packageSettingEClass.getESuperTypes().add(this.getNamedElement());
		xFontEClass.getESuperTypes().add(this.getNamedElement());
		moduleEClass.getESuperTypes().add(this.getNamedElement());
		sgmlCatalogEClass.getESuperTypes().add(this.getNamedElement());
		sgmlDocumentEClass.getESuperTypes().add(this.getNamedElement());
		skeeperCatalogEClass.getESuperTypes().add(this.getNamedElement());
		skeeperDocumentEClass.getESuperTypes().add(this.getNamedElement());
		emacsPackageEClass.getESuperTypes().add(this.getNamedElement());
		userEClass.getESuperTypes().add(this.getNamedElement());
		groupEClass.getESuperTypes().add(this.getNamedElement());
		singleConflictEClass.getESuperTypes().add(this.getConflict());
		andConflictEClass.getESuperTypes().add(this.getConflict());
		orConflictEClass.getESuperTypes().add(this.getConflict());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(configurationEClass, Configuration.class, "Configuration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfiguration_CreationTime(), ecorePackage.getEString(), "creationTime", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfiguration_SystemType(), ecorePackage.getEString(), "systemType", null, 0, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfiguration_FileSystem(), this.getFileSystem(), this.getFileSystem_Configuration(), "fileSystem", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_Environment(), this.getEnvironment(), this.getEnvironment_Configuration(), "environment", null, 1, 1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_InstalledPackages(), this.getInstalledPackage(), null, "installedPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_NotInstalledPackages(), this.getNotInstalledPackage(), null, "notInstalledPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_ConfigFilesPackages(), this.getConfigFilesPackage(), null, "configFilesPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_UnpackedPackages(), this.getUnpackedPackage(), null, "unpackedPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_HalfConfiguredPackages(), this.getHalfConfiguredPackage(), null, "halfConfiguredPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_HalfInstalledPackages(), this.getHalfInstalledPackage(), null, "halfInstalledPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_HalfConfiguredReinstRequiredPackages(), this.getHalfConfiguredReinstRequiredPackage(), null, "halfConfiguredReinstRequiredPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConfiguration_HalfInstalledReinstRequiredPackages(), this.getHalfInstalledReinstRequiredPackage(), null, "halfInstalledReinstRequiredPackages", null, 0, -1, Configuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageEClass, it.univaq.mancoosi.mancoosimm.Package.class, "Package", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Version(), ecorePackage.getEString(), "version", null, 1, 1, it.univaq.mancoosi.mancoosimm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_Configuration(), this.getConfiguration(), null, "configuration", null, 0, 1, it.univaq.mancoosi.mancoosimm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackageSettings(), this.getPackageSetting(), this.getPackageSetting_Pkg(), "packageSettings", null, 0, 1, it.univaq.mancoosi.mancoosimm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackage_Architecture(), ecorePackage.getEString(), "architecture", null, 1, 1, it.univaq.mancoosi.mancoosimm.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(installedPackageEClass, InstalledPackage.class, "InstalledPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstalledPackage_InstalledSize(), ecorePackage.getEInt(), "installedSize", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_FileSize(), ecorePackage.getEInt(), "fileSize", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_CheckSum(), ecorePackage.getEString(), "checkSum", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_Description(), ecorePackage.getEString(), "description", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_Section(), ecorePackage.getEString(), "section", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_Priority(), this.getPriorityType(), "priority", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getInstalledPackage_Uploaders(), ecorePackage.getEString(), "uploaders", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_SourcePackage(), this.getSrcPackage(), null, "sourcePackage", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Depends(), this.getDependence(), null, "depends", null, 0, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Recommends(), this.getInstalledPackage(), null, "recommends", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Suggests(), this.getInstalledPackage(), null, "suggests", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Enhances(), this.getInstalledPackage(), null, "enhances", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Predepends(), this.getInstalledPackage(), null, "predepends", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Provides(), this.getVirtualPackage(), null, "provides", null, 1, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Replaces(), this.getInstalledPackage(), null, "replaces", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Files(), this.getFile(), null, "files", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_DocumentationFiles(), this.getDocumentationFile(), this.getDocumentationFile_Pkg(), "documentationFiles", null, 0, -1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstalledPackage_Conflict(), this.getConflict(), null, "conflict", null, 0, 1, InstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notInstalledPackageEClass, NotInstalledPackage.class, "NotInstalledPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configFilesPackageEClass, ConfigFilesPackage.class, "ConfigFilesPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigFilesPackage_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigFilesPackage_CheckSum(), ecorePackage.getEString(), "checkSum", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigFilesPackage_Description(), ecorePackage.getEString(), "description", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigFilesPackage_Section(), ecorePackage.getEString(), "section", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigFilesPackage_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigFilesPackage_Priority(), this.getPriorityType(), "priority", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConfigFilesPackage_Uploaders(), ecorePackage.getEString(), "uploaders", null, 1, 1, ConfigFilesPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unpackedPackageEClass, UnpackedPackage.class, "UnpackedPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnpackedPackage_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnpackedPackage_CheckSum(), ecorePackage.getEString(), "checkSum", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnpackedPackage_Description(), ecorePackage.getEString(), "description", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnpackedPackage_Section(), ecorePackage.getEString(), "section", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnpackedPackage_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnpackedPackage_Priority(), this.getPriorityType(), "priority", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUnpackedPackage_Uploaders(), ecorePackage.getEString(), "uploaders", null, 1, 1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnpackedPackage_Files(), this.getFile(), null, "files", null, 0, -1, UnpackedPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(halfConfiguredPackageEClass, HalfConfiguredPackage.class, "HalfConfiguredPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(halfConfiguredReinstRequiredPackageEClass, HalfConfiguredReinstRequiredPackage.class, "HalfConfiguredReinstRequiredPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(halfInstalledPackageEClass, HalfInstalledPackage.class, "HalfInstalledPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHalfInstalledPackage_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledPackage_CheckSum(), ecorePackage.getEString(), "checkSum", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledPackage_Description(), ecorePackage.getEString(), "description", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledPackage_Section(), ecorePackage.getEString(), "section", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledPackage_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledPackage_Priority(), this.getPriorityType(), "priority", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledPackage_Uploaders(), ecorePackage.getEString(), "uploaders", null, 1, 1, HalfInstalledPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(halfInstalledReinstRequiredPackageEClass, HalfInstalledReinstRequiredPackage.class, "HalfInstalledReinstRequiredPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHalfInstalledReinstRequiredPackage_Maintainer(), ecorePackage.getEString(), "maintainer", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledReinstRequiredPackage_CheckSum(), ecorePackage.getEString(), "checkSum", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledReinstRequiredPackage_Description(), ecorePackage.getEString(), "description", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledReinstRequiredPackage_Section(), ecorePackage.getEString(), "section", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledReinstRequiredPackage_Tag(), ecorePackage.getEString(), "tag", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledReinstRequiredPackage_Priority(), this.getPriorityType(), "priority", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHalfInstalledReinstRequiredPackage_Uploaders(), ecorePackage.getEString(), "uploaders", null, 1, 1, HalfInstalledReinstRequiredPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcPackageEClass, SrcPackage.class, "SrcPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcPackage_BuildDepends(), this.getBinPackage(), null, "buildDepends", null, 0, -1, SrcPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcPackage_BuildConflicts(), this.getBinPackage(), null, "buildConflicts", null, 0, -1, SrcPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(binPackageEClass, BinPackage.class, "BinPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinPackage_SrcRef(), this.getSrcPackage(), null, "srcRef", null, 1, 1, BinPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(virtualPackageEClass, VirtualPackage.class, "VirtualPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVirtualPackage_ImpPackage(), this.getInstalledPackage(), null, "impPackage", null, 1, -1, VirtualPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dependenceEClass, Dependence.class, "Dependence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependence_AndDep(), this.getAndDep(), this.getAndDep_Dependence(), "andDep", null, 0, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependence_OrDep(), this.getOrDep(), this.getOrDep_Dependence(), "orDep", null, 0, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependence_SingleDep(), this.getSingleDep(), this.getSingleDep_Dependence(), "singleDep", null, 1, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependence_Pkg(), this.getPackage(), null, "pkg", null, 1, 1, Dependence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(andDepEClass, AndDep.class, "AndDep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndDep_Ops(), this.getDependence(), null, "ops", null, 2, -1, AndDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAndDep_Dependence(), this.getDependence(), this.getDependence_AndDep(), "dependence", null, 1, 1, AndDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orDepEClass, OrDep.class, "OrDep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrDep_Ops(), this.getDependence(), null, "ops", null, 2, -1, OrDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrDep_Dependence(), this.getDependence(), this.getDependence_OrDep(), "dependence", null, 1, 1, OrDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(singleDepEClass, SingleDep.class, "SingleDep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleDep_Dependence(), this.getDependence(), this.getDependence_SingleDep(), "dependence", null, 1, 1, SingleDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSingleDep_Version(), this.getVersionType(), "version", null, 1, 1, SingleDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSingleDep_Value(), ecorePackage.getEString(), "value", null, 1, 1, SingleDep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(invariantEClass, Invariant.class, "Invariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvariant_AtomEl(), this.getAtom(), null, "atomEl", null, 0, 1, Invariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvariant_And(), this.getAndInv(), null, "and", null, 0, 1, Invariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvariant_Or(), this.getOrInv(), null, "or", null, 0, 1, Invariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInvariant_Not(), this.getNotInv(), null, "not", null, 0, 1, Invariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andInvEClass, AndInv.class, "AndInv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndInv_Left(), this.getInvariant(), null, "left", null, 1, 1, AndInv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAndInv_Right(), this.getInvariant(), null, "right", null, 1, 1, AndInv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(orInvEClass, OrInv.class, "OrInv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrInv_Left(), this.getInvariant(), null, "left", null, 1, 1, OrInv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOrInv_Right(), this.getInvariant(), null, "right", null, 1, 1, OrInv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(notInvEClass, NotInv.class, "NotInv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNotInv_Elem(), this.getInvariant(), null, "elem", null, 1, 1, NotInv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvironment_RunningServices(), this.getService(), this.getService_Env(), "runningServices", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Alternatives(), this.getAlternative(), this.getAlternative_Env(), "alternatives", null, 0, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Users(), this.getUser(), this.getUser_Env(), "users", null, 1, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Groups(), this.getGroup(), this.getGroup_Env(), "groups", null, 1, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Emacspkg(), this.getEmacsPackage(), this.getEmacsPackage_Env(), "emacspkg", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_IconCache(), this.getIconCache(), this.getIconCache_Env(), "iconCache", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_DesktopDb(), this.getDesktopDB(), this.getDesktopDB_Env(), "desktopDb", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_MimeTypeHandlerCache(), this.getMimeTypeHandlerCache(), this.getMimeTypeHandlerCache_Env(), "mimeTypeHandlerCache", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_LibraryCache(), this.getLibraryCache(), this.getLibraryCache_Env(), "libraryCache", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_SkeeperCatalog(), this.getSkeeperCatalog(), this.getSkeeperCatalog_Env(), "skeeperCatalog", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_SgmlCatalog(), this.getSGMLCatalog(), this.getSGMLCatalog_Env(), "sgmlCatalog", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Configuration(), this.getConfiguration(), this.getConfiguration_Environment(), "configuration", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_ModuleCache(), this.getModuleCache(), this.getModuleCache_Env(), "moduleCache", null, 1, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_XfontCaches(), this.getXFontCache(), this.getXFontCache_Env(), "xfontCaches", null, 1, -1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Gconf(), this.getGConf(), this.getGConf_Env(), "gconf", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEnvironment_Menu(), this.getMenu(), this.getMenu_Env(), "menu", null, 1, 1, Environment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileSystemEClass, FileSystem.class, "FileSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileSystem_Root(), this.getFile(), this.getFile_Fs(), "root", null, 1, 1, FileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFileSystem_Configuration(), this.getConfiguration(), this.getConfiguration_FileSystem(), "configuration", null, 1, 1, FileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFileSystem_AllFiles(), this.getFile(), null, "allFiles", null, 0, -1, FileSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gConfEClass, GConf.class, "GConf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGConf_ConfFiles(), this.getFile(), null, "confFiles", null, 0, -1, GConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGConf_Schemas(), this.getFile(), null, "schemas", null, 0, -1, GConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGConf_Env(), this.getEnvironment(), this.getEnvironment_Gconf(), "env", null, 1, 1, GConf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationMenuCatalogEClass, ApplicationMenuCatalog.class, "ApplicationMenuCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationMenuCatalog_Menu(), this.getMenu(), this.getMenu_Catalog(), "menu", null, 1, 1, ApplicationMenuCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuEClass, Menu.class, "Menu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenu_Entries(), this.getMenuEntry(), this.getMenuEntry_Menu(), "entries", null, 0, -1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMenu_Catalog(), this.getApplicationMenuCatalog(), this.getApplicationMenuCatalog_Menu(), "catalog", null, 1, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMenu_Env(), this.getEnvironment(), this.getEnvironment_Menu(), "env", null, 1, 1, Menu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(menuEntryEClass, MenuEntry.class, "MenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMenuEntry_Menu(), this.getMenu(), this.getMenu_Entries(), "menu", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMenuEntry_Executable(), this.getFile(), null, "executable", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMenuEntry_Parent(), this.getMenuEntry(), null, "parent", null, 1, 1, MenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bootEClass, Boot.class, "Boot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoot_Services(), this.getService(), null, "services", null, 1, -1, Boot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getService_Executable(), this.getFile(), null, "executable", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getService_Env(), this.getEnvironment(), this.getEnvironment_RunningServices(), "env", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Extension(), ecorePackage.getEString(), "extension", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Description(), ecorePackage.getEString(), "description", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Size(), ecorePackage.getEInt(), "size", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_CheckSum(), ecorePackage.getEString(), "checkSum", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_IsDirectory(), ecorePackage.getEBoolean(), "isDirectory", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Suid(), ecorePackage.getEBoolean(), "suid", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Guid(), ecorePackage.getEBoolean(), "guid", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Permission(), ecorePackage.getEString(), "permission", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFile_Location(), ecorePackage.getEString(), "location", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFile_Fs(), this.getFileSystem(), this.getFileSystem_Root(), "fs", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFile_Childs(), this.getFile(), this.getFile_Parent(), "childs", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFile_Parent(), this.getFile(), this.getFile_Childs(), "parent", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFile_Owner(), this.getUser(), null, "owner", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_Group(), this.getGroup(), null, "group", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_IsMissing(), ecorePackage.getEBoolean(), "isMissing", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_PkgSettings(), this.getPackageSetting(), this.getPackageSetting_Files(), "pkgSettings", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentationFileEClass, DocumentationFile.class, "DocumentationFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDocumentationFile_Pkg(), this.getInstalledPackage(), this.getInstalledPackage_DocumentationFiles(), "pkg", null, 1, 1, DocumentationFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(informationFileEClass, InformationFile.class, "InformationFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(alternativeEClass, Alternative.class, "Alternative", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlternative_Current(), this.getFile(), null, "current", null, 1, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlternative_Location(), this.getFile(), null, "location", null, 1, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAlternative_Env(), this.getEnvironment(), this.getEnvironment_Alternatives(), "env", null, 1, 1, Alternative.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageSettingEClass, PackageSetting.class, "PackageSetting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageSetting_Services(), this.getService(), null, "services", null, 0, -1, PackageSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSetting_Files(), this.getFile(), this.getFile_PkgSettings(), "files", null, 0, -1, PackageSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSetting_Pkg(), this.getPackage(), this.getPackage_PackageSettings(), "pkg", null, 1, 1, PackageSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageSetting_Dependences(), this.getPackageSetting(), null, "dependences", null, 0, -1, PackageSetting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iconCacheEClass, IconCache.class, "IconCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIconCache_Mtime(), ecorePackage.getEString(), "mtime", null, 1, 1, IconCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIconCache_Env(), this.getEnvironment(), this.getEnvironment_IconCache(), "env", null, 1, 1, IconCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIconCache_Icons(), this.getFile(), null, "icons", null, 1, 1, IconCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(desktopDBEClass, DesktopDB.class, "DesktopDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesktopDB_Env(), this.getEnvironment(), this.getEnvironment_DesktopDb(), "env", null, 1, 1, DesktopDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDesktopDB_Applications(), this.getFile(), null, "applications", null, 1, 1, DesktopDB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(mimeTypeHandlerCacheEClass, MimeTypeHandlerCache.class, "MimeTypeHandlerCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMimeTypeHandlerCache_Env(), this.getEnvironment(), this.getEnvironment_MimeTypeHandlerCache(), "env", null, 1, 1, MimeTypeHandlerCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMimeTypeHandlerCache_Handlers(), this.getMimeTypeHandler(), this.getMimeTypeHandler_Cache(), "handlers", null, 0, -1, MimeTypeHandlerCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMimeTypeHandlerCache_MimeTypes(), this.getMimeType(), this.getMimeType_Cache(), "mimeTypes", null, 0, -1, MimeTypeHandlerCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mimeTypeHandlerEClass, MimeTypeHandler.class, "MimeTypeHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMimeTypeHandler_Handler(), this.getFile(), null, "handler", null, 1, 1, MimeTypeHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMimeTypeHandler_Type(), this.getMimeType(), this.getMimeType_MimeTypeHandlers(), "type", null, 0, 1, MimeTypeHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimeTypeHandler_Cache(), this.getMimeTypeHandlerCache(), this.getMimeTypeHandlerCache_Handlers(), "cache", null, 1, 1, MimeTypeHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mimeTypeEClass, MimeType.class, "MimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMimeType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMimeType_Extension(), ecorePackage.getEString(), "extension", null, 0, 1, MimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimeType_MimeTypeHandlers(), this.getMimeTypeHandler(), this.getMimeTypeHandler_Type(), "mimeTypeHandlers", null, 0, -1, MimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMimeType_Cache(), this.getMimeTypeHandlerCache(), this.getMimeTypeHandlerCache_MimeTypes(), "cache", null, 1, 1, MimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xFontCacheEClass, XFontCache.class, "XFontCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXFontCache_Xfonts(), this.getXFont(), this.getXFont_XfontCache(), "xfonts", null, 1, -1, XFontCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getXFontCache_Location(), ecorePackage.getEString(), "location", null, 1, 1, XFontCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getXFontCache_Env(), this.getEnvironment(), this.getEnvironment_XfontCaches(), "env", null, 1, 1, XFontCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(xFontEClass, XFont.class, "XFont", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXFont_XfontCache(), this.getXFontCache(), this.getXFontCache_Xfonts(), "xfontCache", null, 1, 1, XFont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getXFont_File(), this.getFile(), null, "file", null, 1, -1, XFont.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(libraryCacheEClass, LibraryCache.class, "LibraryCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLibraryCache_Locations(), this.getFile(), null, "locations", null, 0, -1, LibraryCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLibraryCache_SharedLibraries(), this.getSharedLibrary(), this.getSharedLibrary_LibraryCache(), "sharedLibraries", null, 0, -1, LibraryCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLibraryCache_Env(), this.getEnvironment(), this.getEnvironment_LibraryCache(), "env", null, 1, 1, LibraryCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sharedLibraryEClass, SharedLibrary.class, "SharedLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSharedLibrary_Name(), ecorePackage.getEString(), "name", null, 1, 1, SharedLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSharedLibrary_File(), this.getFile(), null, "file", null, 1, 1, SharedLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSharedLibrary_Version(), ecorePackage.getEString(), "version", null, 1, 1, SharedLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSharedLibrary_LibraryCache(), this.getLibraryCache(), this.getLibraryCache_SharedLibraries(), "libraryCache", null, 1, 1, SharedLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moduleCacheEClass, ModuleCache.class, "ModuleCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleCache_Version(), ecorePackage.getEString(), "version", null, 1, 1, ModuleCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleCache_Modules(), this.getModule(), this.getModule_ModuleCache(), "modules", null, 0, -1, ModuleCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModuleCache_Env(), this.getEnvironment(), this.getEnvironment_ModuleCache(), "env", null, 1, 1, ModuleCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_File(), this.getFile(), null, "file", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getModule_ModuleCache(), this.getModuleCache(), this.getModuleCache_Modules(), "moduleCache", null, 1, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sgmlCatalogEClass, SGMLCatalog.class, "SGMLCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGMLCatalog_Env(), this.getEnvironment(), this.getEnvironment_SgmlCatalog(), "env", null, 1, 1, SGMLCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSGMLCatalog_Documents(), this.getSGMLDocument(), null, "documents", null, 0, -1, SGMLCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sgmlDocumentEClass, SGMLDocument.class, "SGMLDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSGMLDocument_Location(), this.getFile(), null, "location", null, 1, 1, SGMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSGMLDocument_Document(), this.getFile(), null, "document", null, 1, 1, SGMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(skeeperCatalogEClass, SkeeperCatalog.class, "SkeeperCatalog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkeeperCatalog_Env(), this.getEnvironment(), this.getEnvironment_SkeeperCatalog(), "env", null, 1, 1, SkeeperCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSkeeperCatalog_Documents(), this.getSkeeperDocument(), null, "documents", null, 0, -1, SkeeperCatalog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(skeeperDocumentEClass, SkeeperDocument.class, "SkeeperDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSkeeperDocument_Location(), this.getFile(), null, "location", null, 1, 1, SkeeperDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSkeeperDocument_Document(), this.getFile(), null, "document", null, 1, 1, SkeeperDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(emacsPackageEClass, EmacsPackage.class, "EmacsPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEmacsPackage_Files(), this.getFile(), null, "files", null, 1, -1, EmacsPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getEmacsPackage_Env(), this.getEnvironment(), this.getEnvironment_Emacspkg(), "env", null, 1, 1, EmacsPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUser_Env(), this.getEnvironment(), this.getEnvironment_Users(), "env", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Groups(), this.getGroup(), this.getGroup_Users(), "groups", null, 1, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUser_Home(), this.getFile(), null, "home", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroup_Env(), this.getEnvironment(), this.getEnvironment_Groups(), "env", null, 1, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGroup_Users(), this.getUser(), this.getUser_Groups(), "users", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(singleConflictEClass, SingleConflict.class, "SingleConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleConflict_Conflict(), this.getConflict(), this.getConflict_SingleConflict(), "conflict", null, 1, 1, SingleConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleConflict_Version(), this.getVersionType(), "version", null, 1, 1, SingleConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleConflict_Value(), ecorePackage.getEString(), "value", null, 0, 1, SingleConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictEClass, Conflict.class, "Conflict", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflict_AndConflict(), this.getAndConflict(), this.getAndConflict_Conflict(), "andConflict", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflict_OrConflict(), this.getOrConflict(), this.getOrConflict_Conflict(), "orConflict", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflict_SingleConflict(), this.getSingleConflict(), this.getSingleConflict_Conflict(), "singleConflict", null, 0, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflict_Pkg(), this.getPackage(), null, "pkg", null, 1, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andConflictEClass, AndConflict.class, "AndConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAndConflict_Ops(), this.getConflict(), null, "ops", null, 2, -1, AndConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAndConflict_Conflict(), this.getConflict(), this.getConflict_AndConflict(), "conflict", null, 1, 1, AndConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orConflictEClass, OrConflict.class, "OrConflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrConflict_Ops(), this.getConflict(), null, "ops", null, 2, -1, OrConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrConflict_Conflict(), this.getConflict(), this.getConflict_OrConflict(), "conflict", null, 1, 1, OrConflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(priorityTypeEEnum, PriorityType.class, "PriorityType");
		addEEnumLiteral(priorityTypeEEnum, PriorityType.STANDARD);
		addEEnumLiteral(priorityTypeEEnum, PriorityType.REQUIRED);
		addEEnumLiteral(priorityTypeEEnum, PriorityType.IMPORTANT);
		addEEnumLiteral(priorityTypeEEnum, PriorityType.OPTIONAL);
		addEEnumLiteral(priorityTypeEEnum, PriorityType.EXTRA);

		initEEnum(statusTypeEEnum, StatusType.class, "StatusType");
		addEEnumLiteral(statusTypeEEnum, StatusType.INSTALLED);
		addEEnumLiteral(statusTypeEEnum, StatusType.NOT_INSTALLED);
		addEEnumLiteral(statusTypeEEnum, StatusType.HALF_CONFIGURED);
		addEEnumLiteral(statusTypeEEnum, StatusType.HALF_INSTALLED);
		addEEnumLiteral(statusTypeEEnum, StatusType.CONFIG_FILES);
		addEEnumLiteral(statusTypeEEnum, StatusType.UNPACKED);

		initEEnum(versionTypeEEnum, VersionType.class, "VersionType");
		addEEnumLiteral(versionTypeEEnum, VersionType.EQ);
		addEEnumLiteral(versionTypeEEnum, VersionType.GE);
		addEEnumLiteral(versionTypeEEnum, VersionType.LE);
		addEEnumLiteral(versionTypeEEnum, VersionType.LT);
		addEEnumLiteral(versionTypeEEnum, VersionType.LLT);
		addEEnumLiteral(versionTypeEEnum, VersionType.GT);
		addEEnumLiteral(versionTypeEEnum, VersionType.GGT);

		// Create resource
		createResource(eNS_URI);
	}

} //MancoosiPackageImpl
