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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MancoosiFactoryImpl extends EFactoryImpl implements MancoosiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MancoosiFactory init() {
		try {
			MancoosiFactory theMancoosiFactory = (MancoosiFactory)EPackage.Registry.INSTANCE.getEFactory("mancoosimm"); 
			if (theMancoosiFactory != null) {
				return theMancoosiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MancoosiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MancoosiPackage.CONFIGURATION: return createConfiguration();
			case MancoosiPackage.INSTALLED_PACKAGE: return createInstalledPackage();
			case MancoosiPackage.NOT_INSTALLED_PACKAGE: return createNotInstalledPackage();
			case MancoosiPackage.CONFIG_FILES_PACKAGE: return createConfigFilesPackage();
			case MancoosiPackage.UNPACKED_PACKAGE: return createUnpackedPackage();
			case MancoosiPackage.HALF_CONFIGURED_PACKAGE: return createHalfConfiguredPackage();
			case MancoosiPackage.HALF_CONFIGURED_REINST_REQUIRED_PACKAGE: return createHalfConfiguredReinstRequiredPackage();
			case MancoosiPackage.HALF_INSTALLED_PACKAGE: return createHalfInstalledPackage();
			case MancoosiPackage.HALF_INSTALLED_REINST_REQUIRED_PACKAGE: return createHalfInstalledReinstRequiredPackage();
			case MancoosiPackage.SRC_PACKAGE: return createSrcPackage();
			case MancoosiPackage.BIN_PACKAGE: return createBinPackage();
			case MancoosiPackage.VIRTUAL_PACKAGE: return createVirtualPackage();
			case MancoosiPackage.AND_DEP: return createAndDep();
			case MancoosiPackage.OR_DEP: return createOrDep();
			case MancoosiPackage.SINGLE_DEP: return createSingleDep();
			case MancoosiPackage.INVARIANT: return createInvariant();
			case MancoosiPackage.ATOM: return createAtom();
			case MancoosiPackage.AND_INV: return createAndInv();
			case MancoosiPackage.OR_INV: return createOrInv();
			case MancoosiPackage.NOT_INV: return createNotInv();
			case MancoosiPackage.ENVIRONMENT: return createEnvironment();
			case MancoosiPackage.FILE_SYSTEM: return createFileSystem();
			case MancoosiPackage.GCONF: return createGConf();
			case MancoosiPackage.APPLICATION_MENU_CATALOG: return createApplicationMenuCatalog();
			case MancoosiPackage.MENU: return createMenu();
			case MancoosiPackage.MENU_ENTRY: return createMenuEntry();
			case MancoosiPackage.BOOT: return createBoot();
			case MancoosiPackage.SERVICE: return createService();
			case MancoosiPackage.FILE: return createFile();
			case MancoosiPackage.DOCUMENTATION_FILE: return createDocumentationFile();
			case MancoosiPackage.INFORMATION_FILE: return createInformationFile();
			case MancoosiPackage.ALTERNATIVE: return createAlternative();
			case MancoosiPackage.PACKAGE_SETTING: return createPackageSetting();
			case MancoosiPackage.ICON_CACHE: return createIconCache();
			case MancoosiPackage.DESKTOP_DB: return createDesktopDB();
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE: return createMimeTypeHandlerCache();
			case MancoosiPackage.MIME_TYPE_HANDLER: return createMimeTypeHandler();
			case MancoosiPackage.MIME_TYPE: return createMimeType();
			case MancoosiPackage.XFONT_CACHE: return createXFontCache();
			case MancoosiPackage.XFONT: return createXFont();
			case MancoosiPackage.LIBRARY_CACHE: return createLibraryCache();
			case MancoosiPackage.SHARED_LIBRARY: return createSharedLibrary();
			case MancoosiPackage.MODULE_CACHE: return createModuleCache();
			case MancoosiPackage.MODULE: return createModule();
			case MancoosiPackage.SGML_CATALOG: return createSGMLCatalog();
			case MancoosiPackage.SGML_DOCUMENT: return createSGMLDocument();
			case MancoosiPackage.SKEEPER_CATALOG: return createSkeeperCatalog();
			case MancoosiPackage.SKEEPER_DOCUMENT: return createSkeeperDocument();
			case MancoosiPackage.EMACS_PACKAGE: return createEmacsPackage();
			case MancoosiPackage.USER: return createUser();
			case MancoosiPackage.GROUP: return createGroup();
			case MancoosiPackage.SINGLE_CONFLICT: return createSingleConflict();
			case MancoosiPackage.AND_CONFLICT: return createAndConflict();
			case MancoosiPackage.OR_CONFLICT: return createOrConflict();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MancoosiPackage.PRIORITY_TYPE:
				return createPriorityTypeFromString(eDataType, initialValue);
			case MancoosiPackage.STATUS_TYPE:
				return createStatusTypeFromString(eDataType, initialValue);
			case MancoosiPackage.VERSION_TYPE:
				return createVersionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MancoosiPackage.PRIORITY_TYPE:
				return convertPriorityTypeToString(eDataType, instanceValue);
			case MancoosiPackage.STATUS_TYPE:
				return convertStatusTypeToString(eDataType, instanceValue);
			case MancoosiPackage.VERSION_TYPE:
				return convertVersionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstalledPackage createInstalledPackage() {
		InstalledPackageImpl installedPackage = new InstalledPackageImpl();
		return installedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInstalledPackage createNotInstalledPackage() {
		NotInstalledPackageImpl notInstalledPackage = new NotInstalledPackageImpl();
		return notInstalledPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigFilesPackage createConfigFilesPackage() {
		ConfigFilesPackageImpl configFilesPackage = new ConfigFilesPackageImpl();
		return configFilesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpackedPackage createUnpackedPackage() {
		UnpackedPackageImpl unpackedPackage = new UnpackedPackageImpl();
		return unpackedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfConfiguredPackage createHalfConfiguredPackage() {
		HalfConfiguredPackageImpl halfConfiguredPackage = new HalfConfiguredPackageImpl();
		return halfConfiguredPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfConfiguredReinstRequiredPackage createHalfConfiguredReinstRequiredPackage() {
		HalfConfiguredReinstRequiredPackageImpl halfConfiguredReinstRequiredPackage = new HalfConfiguredReinstRequiredPackageImpl();
		return halfConfiguredReinstRequiredPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfInstalledPackage createHalfInstalledPackage() {
		HalfInstalledPackageImpl halfInstalledPackage = new HalfInstalledPackageImpl();
		return halfInstalledPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HalfInstalledReinstRequiredPackage createHalfInstalledReinstRequiredPackage() {
		HalfInstalledReinstRequiredPackageImpl halfInstalledReinstRequiredPackage = new HalfInstalledReinstRequiredPackageImpl();
		return halfInstalledReinstRequiredPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcPackage createSrcPackage() {
		SrcPackageImpl srcPackage = new SrcPackageImpl();
		return srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinPackage createBinPackage() {
		BinPackageImpl binPackage = new BinPackageImpl();
		return binPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualPackage createVirtualPackage() {
		VirtualPackageImpl virtualPackage = new VirtualPackageImpl();
		return virtualPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndDep createAndDep() {
		AndDepImpl andDep = new AndDepImpl();
		return andDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrDep createOrDep() {
		OrDepImpl orDep = new OrDepImpl();
		return orDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleDep createSingleDep() {
		SingleDepImpl singleDep = new SingleDepImpl();
		return singleDep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invariant createInvariant() {
		InvariantImpl invariant = new InvariantImpl();
		return invariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndInv createAndInv() {
		AndInvImpl andInv = new AndInvImpl();
		return andInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrInv createOrInv() {
		OrInvImpl orInv = new OrInvImpl();
		return orInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotInv createNotInv() {
		NotInvImpl notInv = new NotInvImpl();
		return notInv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileSystem createFileSystem() {
		FileSystemImpl fileSystem = new FileSystemImpl();
		return fileSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GConf createGConf() {
		GConfImpl gConf = new GConfImpl();
		return gConf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMenuCatalog createApplicationMenuCatalog() {
		ApplicationMenuCatalogImpl applicationMenuCatalog = new ApplicationMenuCatalogImpl();
		return applicationMenuCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Menu createMenu() {
		MenuImpl menu = new MenuImpl();
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MenuEntry createMenuEntry() {
		MenuEntryImpl menuEntry = new MenuEntryImpl();
		return menuEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boot createBoot() {
		BootImpl boot = new BootImpl();
		return boot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationFile createDocumentationFile() {
		DocumentationFileImpl documentationFile = new DocumentationFileImpl();
		return documentationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationFile createInformationFile() {
		InformationFileImpl informationFile = new InformationFileImpl();
		return informationFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alternative createAlternative() {
		AlternativeImpl alternative = new AlternativeImpl();
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageSetting createPackageSetting() {
		PackageSettingImpl packageSetting = new PackageSettingImpl();
		return packageSetting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IconCache createIconCache() {
		IconCacheImpl iconCache = new IconCacheImpl();
		return iconCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesktopDB createDesktopDB() {
		DesktopDBImpl desktopDB = new DesktopDBImpl();
		return desktopDB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandlerCache createMimeTypeHandlerCache() {
		MimeTypeHandlerCacheImpl mimeTypeHandlerCache = new MimeTypeHandlerCacheImpl();
		return mimeTypeHandlerCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeTypeHandler createMimeTypeHandler() {
		MimeTypeHandlerImpl mimeTypeHandler = new MimeTypeHandlerImpl();
		return mimeTypeHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MimeType createMimeType() {
		MimeTypeImpl mimeType = new MimeTypeImpl();
		return mimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XFontCache createXFontCache() {
		XFontCacheImpl xFontCache = new XFontCacheImpl();
		return xFontCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XFont createXFont() {
		XFontImpl xFont = new XFontImpl();
		return xFont;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryCache createLibraryCache() {
		LibraryCacheImpl libraryCache = new LibraryCacheImpl();
		return libraryCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedLibrary createSharedLibrary() {
		SharedLibraryImpl sharedLibrary = new SharedLibraryImpl();
		return sharedLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModuleCache createModuleCache() {
		ModuleCacheImpl moduleCache = new ModuleCacheImpl();
		return moduleCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGMLCatalog createSGMLCatalog() {
		SGMLCatalogImpl sgmlCatalog = new SGMLCatalogImpl();
		return sgmlCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGMLDocument createSGMLDocument() {
		SGMLDocumentImpl sgmlDocument = new SGMLDocumentImpl();
		return sgmlDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeeperCatalog createSkeeperCatalog() {
		SkeeperCatalogImpl skeeperCatalog = new SkeeperCatalogImpl();
		return skeeperCatalog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkeeperDocument createSkeeperDocument() {
		SkeeperDocumentImpl skeeperDocument = new SkeeperDocumentImpl();
		return skeeperDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmacsPackage createEmacsPackage() {
		EmacsPackageImpl emacsPackage = new EmacsPackageImpl();
		return emacsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleConflict createSingleConflict() {
		SingleConflictImpl singleConflict = new SingleConflictImpl();
		return singleConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AndConflict createAndConflict() {
		AndConflictImpl andConflict = new AndConflictImpl();
		return andConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrConflict createOrConflict() {
		OrConflictImpl orConflict = new OrConflictImpl();
		return orConflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityType createPriorityTypeFromString(EDataType eDataType, String initialValue) {
		PriorityType result = PriorityType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorityTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusType createStatusTypeFromString(EDataType eDataType, String initialValue) {
		StatusType result = StatusType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionType createVersionTypeFromString(EDataType eDataType, String initialValue) {
		VersionType result = VersionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiPackage getMancoosiPackage() {
		return (MancoosiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MancoosiPackage getPackage() {
		return MancoosiPackage.eINSTANCE;
	}

} //MancoosiFactoryImpl
