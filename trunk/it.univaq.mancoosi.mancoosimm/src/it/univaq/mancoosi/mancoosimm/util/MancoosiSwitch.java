/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.mancoosimm.util;

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
import it.univaq.mancoosi.mancoosimm.SGMLCatalog;
import it.univaq.mancoosi.mancoosimm.SGMLDocument;
import it.univaq.mancoosi.mancoosimm.Schema;
import it.univaq.mancoosi.mancoosimm.Service;
import it.univaq.mancoosi.mancoosimm.SharedLibrary;
import it.univaq.mancoosi.mancoosimm.SingleConflict;
import it.univaq.mancoosi.mancoosimm.SingleDep;
import it.univaq.mancoosi.mancoosimm.SkeeperCatalog;
import it.univaq.mancoosi.mancoosimm.SkeeperDocument;
import it.univaq.mancoosi.mancoosimm.SrcPackage;
import it.univaq.mancoosi.mancoosimm.UnpackedPackage;
import it.univaq.mancoosi.mancoosimm.User;
import it.univaq.mancoosi.mancoosimm.VirtualPackage;
import it.univaq.mancoosi.mancoosimm.XFont;
import it.univaq.mancoosi.mancoosimm.XFontCache;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see it.univaq.mancoosi.mancoosimm.MancoosiPackage
 * @generated
 */
public class MancoosiSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MancoosiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MancoosiSwitch() {
		if (modelPackage == null) {
			modelPackage = MancoosiPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MancoosiPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONFIGURATION: {
				Configuration configuration = (Configuration)theEObject;
				T result = caseConfiguration(configuration);
				if (result == null) result = caseNamedElement(configuration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PACKAGE: {
				it.univaq.mancoosi.mancoosimm.Package package_ = (it.univaq.mancoosi.mancoosimm.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INSTALLED_PACKAGE: {
				InstalledPackage installedPackage = (InstalledPackage)theEObject;
				T result = caseInstalledPackage(installedPackage);
				if (result == null) result = casePackage(installedPackage);
				if (result == null) result = caseNamedElement(installedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.NOT_INSTALLED_PACKAGE: {
				NotInstalledPackage notInstalledPackage = (NotInstalledPackage)theEObject;
				T result = caseNotInstalledPackage(notInstalledPackage);
				if (result == null) result = casePackage(notInstalledPackage);
				if (result == null) result = caseNamedElement(notInstalledPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONFIG_FILES_PACKAGE: {
				ConfigFilesPackage configFilesPackage = (ConfigFilesPackage)theEObject;
				T result = caseConfigFilesPackage(configFilesPackage);
				if (result == null) result = casePackage(configFilesPackage);
				if (result == null) result = caseNamedElement(configFilesPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.UNPACKED_PACKAGE: {
				UnpackedPackage unpackedPackage = (UnpackedPackage)theEObject;
				T result = caseUnpackedPackage(unpackedPackage);
				if (result == null) result = casePackage(unpackedPackage);
				if (result == null) result = caseNamedElement(unpackedPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.HALF_CONFIGURED_PACKAGE: {
				HalfConfiguredPackage halfConfiguredPackage = (HalfConfiguredPackage)theEObject;
				T result = caseHalfConfiguredPackage(halfConfiguredPackage);
				if (result == null) result = caseUnpackedPackage(halfConfiguredPackage);
				if (result == null) result = casePackage(halfConfiguredPackage);
				if (result == null) result = caseNamedElement(halfConfiguredPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.HALF_CONFIGURED_REINST_REQUIRED_PACKAGE: {
				HalfConfiguredReinstRequiredPackage halfConfiguredReinstRequiredPackage = (HalfConfiguredReinstRequiredPackage)theEObject;
				T result = caseHalfConfiguredReinstRequiredPackage(halfConfiguredReinstRequiredPackage);
				if (result == null) result = caseUnpackedPackage(halfConfiguredReinstRequiredPackage);
				if (result == null) result = casePackage(halfConfiguredReinstRequiredPackage);
				if (result == null) result = caseNamedElement(halfConfiguredReinstRequiredPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.HALF_INSTALLED_PACKAGE: {
				HalfInstalledPackage halfInstalledPackage = (HalfInstalledPackage)theEObject;
				T result = caseHalfInstalledPackage(halfInstalledPackage);
				if (result == null) result = casePackage(halfInstalledPackage);
				if (result == null) result = caseNamedElement(halfInstalledPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.HALF_INSTALLED_REINST_REQUIRED_PACKAGE: {
				HalfInstalledReinstRequiredPackage halfInstalledReinstRequiredPackage = (HalfInstalledReinstRequiredPackage)theEObject;
				T result = caseHalfInstalledReinstRequiredPackage(halfInstalledReinstRequiredPackage);
				if (result == null) result = casePackage(halfInstalledReinstRequiredPackage);
				if (result == null) result = caseNamedElement(halfInstalledReinstRequiredPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SRC_PACKAGE: {
				SrcPackage srcPackage = (SrcPackage)theEObject;
				T result = caseSrcPackage(srcPackage);
				if (result == null) result = caseInstalledPackage(srcPackage);
				if (result == null) result = casePackage(srcPackage);
				if (result == null) result = caseNamedElement(srcPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BIN_PACKAGE: {
				BinPackage binPackage = (BinPackage)theEObject;
				T result = caseBinPackage(binPackage);
				if (result == null) result = caseInstalledPackage(binPackage);
				if (result == null) result = casePackage(binPackage);
				if (result == null) result = caseNamedElement(binPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.VIRTUAL_PACKAGE: {
				VirtualPackage virtualPackage = (VirtualPackage)theEObject;
				T result = caseVirtualPackage(virtualPackage);
				if (result == null) result = caseInstalledPackage(virtualPackage);
				if (result == null) result = casePackage(virtualPackage);
				if (result == null) result = caseNamedElement(virtualPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DEPENDENCE: {
				Dependence dependence = (Dependence)theEObject;
				T result = caseDependence(dependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.AND_DEP: {
				AndDep andDep = (AndDep)theEObject;
				T result = caseAndDep(andDep);
				if (result == null) result = caseDependence(andDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.OR_DEP: {
				OrDep orDep = (OrDep)theEObject;
				T result = caseOrDep(orDep);
				if (result == null) result = caseDependence(orDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SINGLE_DEP: {
				SingleDep singleDep = (SingleDep)theEObject;
				T result = caseSingleDep(singleDep);
				if (result == null) result = caseDependence(singleDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INVARIANT: {
				Invariant invariant = (Invariant)theEObject;
				T result = caseInvariant(invariant);
				if (result == null) result = caseNamedElement(invariant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ATOM: {
				Atom atom = (Atom)theEObject;
				T result = caseAtom(atom);
				if (result == null) result = caseNamedElement(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.AND_INV: {
				AndInv andInv = (AndInv)theEObject;
				T result = caseAndInv(andInv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.OR_INV: {
				OrInv orInv = (OrInv)theEObject;
				T result = caseOrInv(orInv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.NOT_INV: {
				NotInv notInv = (NotInv)theEObject;
				T result = caseNotInv(notInv);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ENVIRONMENT: {
				Environment environment = (Environment)theEObject;
				T result = caseEnvironment(environment);
				if (result == null) result = caseNamedElement(environment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.FILE_SYSTEM: {
				FileSystem fileSystem = (FileSystem)theEObject;
				T result = caseFileSystem(fileSystem);
				if (result == null) result = caseNamedElement(fileSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.GCONF: {
				GConf gConf = (GConf)theEObject;
				T result = caseGConf(gConf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.APPLICATION_MENU_CATALOG: {
				ApplicationMenuCatalog applicationMenuCatalog = (ApplicationMenuCatalog)theEObject;
				T result = caseApplicationMenuCatalog(applicationMenuCatalog);
				if (result == null) result = caseNamedElement(applicationMenuCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MENU: {
				Menu menu = (Menu)theEObject;
				T result = caseMenu(menu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MENU_ENTRY: {
				MenuEntry menuEntry = (MenuEntry)theEObject;
				T result = caseMenuEntry(menuEntry);
				if (result == null) result = caseNamedElement(menuEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.BOOT: {
				Boot boot = (Boot)theEObject;
				T result = caseBoot(boot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseNamedElement(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseNamedElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DOCUMENTATION_FILE: {
				DocumentationFile documentationFile = (DocumentationFile)theEObject;
				T result = caseDocumentationFile(documentationFile);
				if (result == null) result = caseFile(documentationFile);
				if (result == null) result = caseNamedElement(documentationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.INFORMATION_FILE: {
				InformationFile informationFile = (InformationFile)theEObject;
				T result = caseInformationFile(informationFile);
				if (result == null) result = caseFile(informationFile);
				if (result == null) result = caseNamedElement(informationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseNamedElement(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.PACKAGE_SETTING: {
				PackageSetting packageSetting = (PackageSetting)theEObject;
				T result = casePackageSetting(packageSetting);
				if (result == null) result = caseNamedElement(packageSetting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.ICON_CACHE: {
				IconCache iconCache = (IconCache)theEObject;
				T result = caseIconCache(iconCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.DESKTOP_DB: {
				DesktopDB desktopDB = (DesktopDB)theEObject;
				T result = caseDesktopDB(desktopDB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MIME_TYPE_HANDLER_CACHE: {
				MimeTypeHandlerCache mimeTypeHandlerCache = (MimeTypeHandlerCache)theEObject;
				T result = caseMimeTypeHandlerCache(mimeTypeHandlerCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MIME_TYPE_HANDLER: {
				MimeTypeHandler mimeTypeHandler = (MimeTypeHandler)theEObject;
				T result = caseMimeTypeHandler(mimeTypeHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MIME_TYPE: {
				MimeType mimeType = (MimeType)theEObject;
				T result = caseMimeType(mimeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.XFONT_CACHE: {
				XFontCache xFontCache = (XFontCache)theEObject;
				T result = caseXFontCache(xFontCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.XFONT: {
				XFont xFont = (XFont)theEObject;
				T result = caseXFont(xFont);
				if (result == null) result = caseNamedElement(xFont);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.LIBRARY_CACHE: {
				LibraryCache libraryCache = (LibraryCache)theEObject;
				T result = caseLibraryCache(libraryCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SHARED_LIBRARY: {
				SharedLibrary sharedLibrary = (SharedLibrary)theEObject;
				T result = caseSharedLibrary(sharedLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MODULE_CACHE: {
				ModuleCache moduleCache = (ModuleCache)theEObject;
				T result = caseModuleCache(moduleCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.MODULE: {
				Module module = (Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = caseNamedElement(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SGML_CATALOG: {
				SGMLCatalog sgmlCatalog = (SGMLCatalog)theEObject;
				T result = caseSGMLCatalog(sgmlCatalog);
				if (result == null) result = caseNamedElement(sgmlCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SGML_DOCUMENT: {
				SGMLDocument sgmlDocument = (SGMLDocument)theEObject;
				T result = caseSGMLDocument(sgmlDocument);
				if (result == null) result = caseNamedElement(sgmlDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SKEEPER_CATALOG: {
				SkeeperCatalog skeeperCatalog = (SkeeperCatalog)theEObject;
				T result = caseSkeeperCatalog(skeeperCatalog);
				if (result == null) result = caseNamedElement(skeeperCatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SKEEPER_DOCUMENT: {
				SkeeperDocument skeeperDocument = (SkeeperDocument)theEObject;
				T result = caseSkeeperDocument(skeeperDocument);
				if (result == null) result = caseNamedElement(skeeperDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.EMACS_PACKAGE: {
				EmacsPackage emacsPackage = (EmacsPackage)theEObject;
				T result = caseEmacsPackage(emacsPackage);
				if (result == null) result = caseNamedElement(emacsPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = caseNamedElement(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.GROUP: {
				Group group = (Group)theEObject;
				T result = caseGroup(group);
				if (result == null) result = caseNamedElement(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SINGLE_CONFLICT: {
				SingleConflict singleConflict = (SingleConflict)theEObject;
				T result = caseSingleConflict(singleConflict);
				if (result == null) result = caseConflict(singleConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				T result = caseConflict(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.AND_CONFLICT: {
				AndConflict andConflict = (AndConflict)theEObject;
				T result = caseAndConflict(andConflict);
				if (result == null) result = caseConflict(andConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.OR_CONFLICT: {
				OrConflict orConflict = (OrConflict)theEObject;
				T result = caseOrConflict(orConflict);
				if (result == null) result = caseConflict(orConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MancoosiPackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseFile(schema);
				if (result == null) result = caseNamedElement(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfiguration(Configuration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(it.univaq.mancoosi.mancoosimm.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Installed Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstalledPackage(InstalledPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Installed Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotInstalledPackage(NotInstalledPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Files Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Files Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigFilesPackage(ConfigFilesPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unpacked Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unpacked Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnpackedPackage(UnpackedPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Configured Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Configured Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfConfiguredPackage(HalfConfiguredPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Configured Reinst Required Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Configured Reinst Required Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfConfiguredReinstRequiredPackage(HalfConfiguredReinstRequiredPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Installed Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Installed Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfInstalledPackage(HalfInstalledPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Half Installed Reinst Required Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Half Installed Reinst Required Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHalfInstalledReinstRequiredPackage(HalfInstalledReinstRequiredPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcPackage(SrcPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bin Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bin Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinPackage(BinPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Virtual Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Virtual Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVirtualPackage(VirtualPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependence(Dependence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndDep(AndDep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrDep(OrDep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Dep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Dep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleDep(SingleDep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invariant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvariant(Invariant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtom(Atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndInv(AndInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrInv(OrInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Inv</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Inv</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotInv(NotInv object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystem(FileSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GConf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GConf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGConf(GConf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Menu Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Menu Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationMenuCatalog(ApplicationMenuCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenu(Menu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Menu Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMenuEntry(MenuEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoot(Boot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Documentation File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Documentation File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentationFile(DocumentationFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationFile(InformationFile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Setting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Setting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageSetting(PackageSetting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Icon Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Icon Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIconCache(IconCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desktop DB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desktop DB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesktopDB(DesktopDB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type Handler Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type Handler Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeTypeHandlerCache(MimeTypeHandlerCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeTypeHandler(MimeTypeHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mime Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mime Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMimeType(MimeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFont Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFont Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXFontCache(XFontCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFont</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFont</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXFont(XFont object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryCache(LibraryCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shared Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shared Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharedLibrary(SharedLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleCache(ModuleCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGML Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGML Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGMLCatalog(SGMLCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SGML Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SGML Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSGMLDocument(SGMLDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeeper Catalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeeper Catalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkeeperCatalog(SkeeperCatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Skeeper Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Skeeper Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSkeeperDocument(SkeeperDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emacs Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emacs Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmacsPackage(EmacsPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleConflict(SingleConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConflict(Conflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndConflict(AndConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Conflict</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Conflict</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrConflict(OrConflict object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //MancoosiSwitch
