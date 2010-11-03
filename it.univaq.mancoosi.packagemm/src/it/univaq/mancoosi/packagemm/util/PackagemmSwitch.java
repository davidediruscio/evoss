/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package it.univaq.mancoosi.packagemm.util;

import it.univaq.mancoosi.packagemm.AddAlternative;
import it.univaq.mancoosi.packagemm.AdditionEnvironmentStatement;
import it.univaq.mancoosi.packagemm.AdditionFileSystemStatement;
import it.univaq.mancoosi.packagemm.AdditionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.AndBooleanExpression;
import it.univaq.mancoosi.packagemm.AndConflict;
import it.univaq.mancoosi.packagemm.AndDep;
import it.univaq.mancoosi.packagemm.Assignment;
import it.univaq.mancoosi.packagemm.BasicCase;
import it.univaq.mancoosi.packagemm.BasicCaseCondition;
import it.univaq.mancoosi.packagemm.BooleanExpression;
import it.univaq.mancoosi.packagemm.Case;
import it.univaq.mancoosi.packagemm.CasePostinst;
import it.univaq.mancoosi.packagemm.CasePostinstCondition;
import it.univaq.mancoosi.packagemm.CasePostrm;
import it.univaq.mancoosi.packagemm.CasePostrmCondition;
import it.univaq.mancoosi.packagemm.CasePreinst;
import it.univaq.mancoosi.packagemm.CasePreinstCondition;
import it.univaq.mancoosi.packagemm.CasePrerm;
import it.univaq.mancoosi.packagemm.CasePrermCondition;
import it.univaq.mancoosi.packagemm.Comment;
import it.univaq.mancoosi.packagemm.Condition;
import it.univaq.mancoosi.packagemm.ConfigScript;
import it.univaq.mancoosi.packagemm.Conflict;
import it.univaq.mancoosi.packagemm.ControlStatement;
import it.univaq.mancoosi.packagemm.DefaultCaseCondition;
import it.univaq.mancoosi.packagemm.DeletionEnvironmentStatement;
import it.univaq.mancoosi.packagemm.DeletionFileSystemStatement;
import it.univaq.mancoosi.packagemm.DeletionPackageSettingStatement;
import it.univaq.mancoosi.packagemm.Dependence;
import it.univaq.mancoosi.packagemm.DirectoryIterator;
import it.univaq.mancoosi.packagemm.DocumentationFile;
import it.univaq.mancoosi.packagemm.Enumeration;
import it.univaq.mancoosi.packagemm.EnumerationElement;
import it.univaq.mancoosi.packagemm.EnumerationIterator;
import it.univaq.mancoosi.packagemm.EnvironmentStatement;
import it.univaq.mancoosi.packagemm.File;
import it.univaq.mancoosi.packagemm.FileBlockDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileCharacterDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileContentIterator;
import it.univaq.mancoosi.packagemm.FileExecutePermissionBoolean;
import it.univaq.mancoosi.packagemm.FileExistsBoolean;
import it.univaq.mancoosi.packagemm.FileNotZeroSizeBoolean;
import it.univaq.mancoosi.packagemm.FilePipeBoolean;
import it.univaq.mancoosi.packagemm.FileReadPermissionBoolean;
import it.univaq.mancoosi.packagemm.FileSocketBoolean;
import it.univaq.mancoosi.packagemm.FileSymbolicLinkBoolean;
import it.univaq.mancoosi.packagemm.FileSystemStatement;
import it.univaq.mancoosi.packagemm.FileTerminalDeviceBoolean;
import it.univaq.mancoosi.packagemm.FileWritePermissionBoolean;
import it.univaq.mancoosi.packagemm.If;
import it.univaq.mancoosi.packagemm.InformationFile;
import it.univaq.mancoosi.packagemm.InputParameter;
import it.univaq.mancoosi.packagemm.InputParameterIterator;
import it.univaq.mancoosi.packagemm.IntParam;
import it.univaq.mancoosi.packagemm.IntegerEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerGreaterBoolean;
import it.univaq.mancoosi.packagemm.IntegerGreaterEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerLessBoolean;
import it.univaq.mancoosi.packagemm.IntegerLessEqualBoolean;
import it.univaq.mancoosi.packagemm.IntegerNotEqualBoolean;
import it.univaq.mancoosi.packagemm.IsDirectoryBoolean;
import it.univaq.mancoosi.packagemm.Iterator;
import it.univaq.mancoosi.packagemm.Message;
import it.univaq.mancoosi.packagemm.NamedElement;
import it.univaq.mancoosi.packagemm.NeutralStatement;
import it.univaq.mancoosi.packagemm.OrBooleanExpression;
import it.univaq.mancoosi.packagemm.OrConflict;
import it.univaq.mancoosi.packagemm.OrDep;
import it.univaq.mancoosi.packagemm.PackageSettingStatement;
import it.univaq.mancoosi.packagemm.PackagemmPackage;
import it.univaq.mancoosi.packagemm.Param;
import it.univaq.mancoosi.packagemm.PostinstAddAlternative;
import it.univaq.mancoosi.packagemm.PostinstDesktop;
import it.univaq.mancoosi.packagemm.PostinstDocBase;
import it.univaq.mancoosi.packagemm.PostinstEmacsen;
import it.univaq.mancoosi.packagemm.PostinstGconf;
import it.univaq.mancoosi.packagemm.PostinstGconfDefaults;
import it.univaq.mancoosi.packagemm.PostinstIcons;
import it.univaq.mancoosi.packagemm.PostinstInfo;
import it.univaq.mancoosi.packagemm.PostinstInit;
import it.univaq.mancoosi.packagemm.PostinstInitNostart;
import it.univaq.mancoosi.packagemm.PostinstInitRestart;
import it.univaq.mancoosi.packagemm.PostinstMakeshlibs;
import it.univaq.mancoosi.packagemm.PostinstMenu;
import it.univaq.mancoosi.packagemm.PostinstMenuMethod;
import it.univaq.mancoosi.packagemm.PostinstMime;
import it.univaq.mancoosi.packagemm.PostinstModules;
import it.univaq.mancoosi.packagemm.PostinstPython;
import it.univaq.mancoosi.packagemm.PostinstScript;
import it.univaq.mancoosi.packagemm.PostinstScrollkeeper;
import it.univaq.mancoosi.packagemm.PostinstSgmlcatalog;
import it.univaq.mancoosi.packagemm.PostinstSharedmimeinfo;
import it.univaq.mancoosi.packagemm.PostinstSuid;
import it.univaq.mancoosi.packagemm.PostinstUdev;
import it.univaq.mancoosi.packagemm.PostinstUsrlocal;
import it.univaq.mancoosi.packagemm.PostinstWm;
import it.univaq.mancoosi.packagemm.PostinstWmNoman;
import it.univaq.mancoosi.packagemm.PostinstXfonts;
import it.univaq.mancoosi.packagemm.PostrmDebconf;
import it.univaq.mancoosi.packagemm.PostrmDesktop;
import it.univaq.mancoosi.packagemm.PostrmGconf;
import it.univaq.mancoosi.packagemm.PostrmGconfDefaults;
import it.univaq.mancoosi.packagemm.PostrmIcons;
import it.univaq.mancoosi.packagemm.PostrmInit;
import it.univaq.mancoosi.packagemm.PostrmMakeshlibs;
import it.univaq.mancoosi.packagemm.PostrmMenu;
import it.univaq.mancoosi.packagemm.PostrmMenuMethod;
import it.univaq.mancoosi.packagemm.PostrmMime;
import it.univaq.mancoosi.packagemm.PostrmModules;
import it.univaq.mancoosi.packagemm.PostrmScript;
import it.univaq.mancoosi.packagemm.PostrmScrollkeeper;
import it.univaq.mancoosi.packagemm.PostrmSgmlcatalog;
import it.univaq.mancoosi.packagemm.PostrmSharedmimeinfo;
import it.univaq.mancoosi.packagemm.PostrmSuid;
import it.univaq.mancoosi.packagemm.PostrmXfonts;
import it.univaq.mancoosi.packagemm.PreinstScript;
import it.univaq.mancoosi.packagemm.PreinstUdev;
import it.univaq.mancoosi.packagemm.PreinstUser;
import it.univaq.mancoosi.packagemm.PrermDocBase;
import it.univaq.mancoosi.packagemm.PrermEmacsen;
import it.univaq.mancoosi.packagemm.PrermGconf;
import it.univaq.mancoosi.packagemm.PrermInfo;
import it.univaq.mancoosi.packagemm.PrermInit;
import it.univaq.mancoosi.packagemm.PrermInitNorestart;
import it.univaq.mancoosi.packagemm.PrermPython;
import it.univaq.mancoosi.packagemm.PrermScript;
import it.univaq.mancoosi.packagemm.PrermSgmlcatalog;
import it.univaq.mancoosi.packagemm.PrermUsrlocal;
import it.univaq.mancoosi.packagemm.PrermWm;
import it.univaq.mancoosi.packagemm.RegularFileBoolean;
import it.univaq.mancoosi.packagemm.Return;
import it.univaq.mancoosi.packagemm.Script;
import it.univaq.mancoosi.packagemm.SingleConflict;
import it.univaq.mancoosi.packagemm.SingleDep;
import it.univaq.mancoosi.packagemm.Statement;
import it.univaq.mancoosi.packagemm.StatementBoolean;
import it.univaq.mancoosi.packagemm.StatementExistsBoolean;
import it.univaq.mancoosi.packagemm.StrinNotNullBoolean;
import it.univaq.mancoosi.packagemm.StringEqualBoolean;
import it.univaq.mancoosi.packagemm.StringGreaterBoolean;
import it.univaq.mancoosi.packagemm.StringIterator;
import it.univaq.mancoosi.packagemm.StringLessBoolean;
import it.univaq.mancoosi.packagemm.StringNotEqualBoolean;
import it.univaq.mancoosi.packagemm.StringNullBoolean;
import it.univaq.mancoosi.packagemm.StringParam;
import it.univaq.mancoosi.packagemm.UpdateEnvironmentStatement;
import it.univaq.mancoosi.packagemm.UpdateFileSystemStatement;
import it.univaq.mancoosi.packagemm.UpdatePackageSettingStatement;
import it.univaq.mancoosi.packagemm.UpdatePythonModules;

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
 * @see it.univaq.mancoosi.packagemm.PackagemmPackage
 * @generated
 */
public class PackagemmSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PackagemmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackagemmSwitch() {
		if (modelPackage == null) {
			modelPackage = PackagemmPackage.eINSTANCE;
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
			case PackagemmPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PACKAGE: {
				it.univaq.mancoosi.packagemm.Package package_ = (it.univaq.mancoosi.packagemm.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseNamedElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.SCRIPT: {
				Script script = (Script)theEObject;
				T result = caseScript(script);
				if (result == null) result = caseNamedElement(script);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INPUT_PARAMETER: {
				InputParameter inputParameter = (InputParameter)theEObject;
				T result = caseInputParameter(inputParameter);
				if (result == null) result = caseNamedElement(inputParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DEPENDENCE: {
				Dependence dependence = (Dependence)theEObject;
				T result = caseDependence(dependence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.AND_DEP: {
				AndDep andDep = (AndDep)theEObject;
				T result = caseAndDep(andDep);
				if (result == null) result = caseDependence(andDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.OR_DEP: {
				OrDep orDep = (OrDep)theEObject;
				T result = caseOrDep(orDep);
				if (result == null) result = caseDependence(orDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.SINGLE_DEP: {
				SingleDep singleDep = (SingleDep)theEObject;
				T result = caseSingleDep(singleDep);
				if (result == null) result = caseDependence(singleDep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PREINST_SCRIPT: {
				PreinstScript preinstScript = (PreinstScript)theEObject;
				T result = casePreinstScript(preinstScript);
				if (result == null) result = caseScript(preinstScript);
				if (result == null) result = caseNamedElement(preinstScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_SCRIPT: {
				PostinstScript postinstScript = (PostinstScript)theEObject;
				T result = casePostinstScript(postinstScript);
				if (result == null) result = caseScript(postinstScript);
				if (result == null) result = caseNamedElement(postinstScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_SCRIPT: {
				PrermScript prermScript = (PrermScript)theEObject;
				T result = casePrermScript(prermScript);
				if (result == null) result = caseScript(prermScript);
				if (result == null) result = caseNamedElement(prermScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_SCRIPT: {
				PostrmScript postrmScript = (PostrmScript)theEObject;
				T result = casePostrmScript(postrmScript);
				if (result == null) result = caseScript(postrmScript);
				if (result == null) result = caseNamedElement(postrmScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CONFIG_SCRIPT: {
				ConfigScript configScript = (ConfigScript)theEObject;
				T result = caseConfigScript(configScript);
				if (result == null) result = caseScript(configScript);
				if (result == null) result = caseNamedElement(configScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = caseNamedElement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CONTROL_STATEMENT: {
				ControlStatement controlStatement = (ControlStatement)theEObject;
				T result = caseControlStatement(controlStatement);
				if (result == null) result = caseStatement(controlStatement);
				if (result == null) result = caseNamedElement(controlStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE: {
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = caseControlStatement(case_);
				if (result == null) result = caseStatement(case_);
				if (result == null) result = caseNamedElement(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DEFAULT_CASE_CONDITION: {
				DefaultCaseCondition defaultCaseCondition = (DefaultCaseCondition)theEObject;
				T result = caseDefaultCaseCondition(defaultCaseCondition);
				if (result == null) result = caseCondition(defaultCaseCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_PRERM: {
				CasePrerm casePrerm = (CasePrerm)theEObject;
				T result = caseCasePrerm(casePrerm);
				if (result == null) result = caseCase(casePrerm);
				if (result == null) result = caseControlStatement(casePrerm);
				if (result == null) result = caseStatement(casePrerm);
				if (result == null) result = caseNamedElement(casePrerm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_PRERM_CONDITION: {
				CasePrermCondition casePrermCondition = (CasePrermCondition)theEObject;
				T result = caseCasePrermCondition(casePrermCondition);
				if (result == null) result = caseCondition(casePrermCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_POSTRM: {
				CasePostrm casePostrm = (CasePostrm)theEObject;
				T result = caseCasePostrm(casePostrm);
				if (result == null) result = caseCase(casePostrm);
				if (result == null) result = caseControlStatement(casePostrm);
				if (result == null) result = caseStatement(casePostrm);
				if (result == null) result = caseNamedElement(casePostrm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_POSTRM_CONDITION: {
				CasePostrmCondition casePostrmCondition = (CasePostrmCondition)theEObject;
				T result = caseCasePostrmCondition(casePostrmCondition);
				if (result == null) result = caseCondition(casePostrmCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_PREINST: {
				CasePreinst casePreinst = (CasePreinst)theEObject;
				T result = caseCasePreinst(casePreinst);
				if (result == null) result = caseCase(casePreinst);
				if (result == null) result = caseControlStatement(casePreinst);
				if (result == null) result = caseStatement(casePreinst);
				if (result == null) result = caseNamedElement(casePreinst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_PREINST_CONDITION: {
				CasePreinstCondition casePreinstCondition = (CasePreinstCondition)theEObject;
				T result = caseCasePreinstCondition(casePreinstCondition);
				if (result == null) result = caseCondition(casePreinstCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_POSTINST: {
				CasePostinst casePostinst = (CasePostinst)theEObject;
				T result = caseCasePostinst(casePostinst);
				if (result == null) result = caseCase(casePostinst);
				if (result == null) result = caseControlStatement(casePostinst);
				if (result == null) result = caseStatement(casePostinst);
				if (result == null) result = caseNamedElement(casePostinst);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CASE_POSTINST_CONDITION: {
				CasePostinstCondition casePostinstCondition = (CasePostinstCondition)theEObject;
				T result = caseCasePostinstCondition(casePostinstCondition);
				if (result == null) result = caseCondition(casePostinstCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.BASIC_CASE: {
				BasicCase basicCase = (BasicCase)theEObject;
				T result = caseBasicCase(basicCase);
				if (result == null) result = caseControlStatement(basicCase);
				if (result == null) result = caseStatement(basicCase);
				if (result == null) result = caseNamedElement(basicCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.BASIC_CASE_CONDITION: {
				BasicCaseCondition basicCaseCondition = (BasicCaseCondition)theEObject;
				T result = caseBasicCaseCondition(basicCaseCondition);
				if (result == null) result = caseCondition(basicCaseCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.IF: {
				If if_ = (If)theEObject;
				T result = caseIf(if_);
				if (result == null) result = caseControlStatement(if_);
				if (result == null) result = caseStatement(if_);
				if (result == null) result = caseNamedElement(if_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.BOOLEAN_EXPRESSION: {
				BooleanExpression booleanExpression = (BooleanExpression)theEObject;
				T result = caseBooleanExpression(booleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_EXISTS_BOOLEAN: {
				FileExistsBoolean fileExistsBoolean = (FileExistsBoolean)theEObject;
				T result = caseFileExistsBoolean(fileExistsBoolean);
				if (result == null) result = caseBooleanExpression(fileExistsBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.REGULAR_FILE_BOOLEAN: {
				RegularFileBoolean regularFileBoolean = (RegularFileBoolean)theEObject;
				T result = caseRegularFileBoolean(regularFileBoolean);
				if (result == null) result = caseBooleanExpression(regularFileBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_NOT_ZERO_SIZE_BOOLEAN: {
				FileNotZeroSizeBoolean fileNotZeroSizeBoolean = (FileNotZeroSizeBoolean)theEObject;
				T result = caseFileNotZeroSizeBoolean(fileNotZeroSizeBoolean);
				if (result == null) result = caseBooleanExpression(fileNotZeroSizeBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.IS_DIRECTORY_BOOLEAN: {
				IsDirectoryBoolean isDirectoryBoolean = (IsDirectoryBoolean)theEObject;
				T result = caseIsDirectoryBoolean(isDirectoryBoolean);
				if (result == null) result = caseBooleanExpression(isDirectoryBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_BLOCK_DEVICE_BOOLEAN: {
				FileBlockDeviceBoolean fileBlockDeviceBoolean = (FileBlockDeviceBoolean)theEObject;
				T result = caseFileBlockDeviceBoolean(fileBlockDeviceBoolean);
				if (result == null) result = caseBooleanExpression(fileBlockDeviceBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_CHARACTER_DEVICE_BOOLEAN: {
				FileCharacterDeviceBoolean fileCharacterDeviceBoolean = (FileCharacterDeviceBoolean)theEObject;
				T result = caseFileCharacterDeviceBoolean(fileCharacterDeviceBoolean);
				if (result == null) result = caseBooleanExpression(fileCharacterDeviceBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_PIPE_BOOLEAN: {
				FilePipeBoolean filePipeBoolean = (FilePipeBoolean)theEObject;
				T result = caseFilePipeBoolean(filePipeBoolean);
				if (result == null) result = caseBooleanExpression(filePipeBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_SYMBOLIC_LINK_BOOLEAN: {
				FileSymbolicLinkBoolean fileSymbolicLinkBoolean = (FileSymbolicLinkBoolean)theEObject;
				T result = caseFileSymbolicLinkBoolean(fileSymbolicLinkBoolean);
				if (result == null) result = caseBooleanExpression(fileSymbolicLinkBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_SOCKET_BOOLEAN: {
				FileSocketBoolean fileSocketBoolean = (FileSocketBoolean)theEObject;
				T result = caseFileSocketBoolean(fileSocketBoolean);
				if (result == null) result = caseBooleanExpression(fileSocketBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_TERMINAL_DEVICE_BOOLEAN: {
				FileTerminalDeviceBoolean fileTerminalDeviceBoolean = (FileTerminalDeviceBoolean)theEObject;
				T result = caseFileTerminalDeviceBoolean(fileTerminalDeviceBoolean);
				if (result == null) result = caseBooleanExpression(fileTerminalDeviceBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_READ_PERMISSION_BOOLEAN: {
				FileReadPermissionBoolean fileReadPermissionBoolean = (FileReadPermissionBoolean)theEObject;
				T result = caseFileReadPermissionBoolean(fileReadPermissionBoolean);
				if (result == null) result = caseBooleanExpression(fileReadPermissionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_WRITE_PERMISSION_BOOLEAN: {
				FileWritePermissionBoolean fileWritePermissionBoolean = (FileWritePermissionBoolean)theEObject;
				T result = caseFileWritePermissionBoolean(fileWritePermissionBoolean);
				if (result == null) result = caseBooleanExpression(fileWritePermissionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_EXECUTE_PERMISSION_BOOLEAN: {
				FileExecutePermissionBoolean fileExecutePermissionBoolean = (FileExecutePermissionBoolean)theEObject;
				T result = caseFileExecutePermissionBoolean(fileExecutePermissionBoolean);
				if (result == null) result = caseBooleanExpression(fileExecutePermissionBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INTEGER_EQUAL_BOOLEAN: {
				IntegerEqualBoolean integerEqualBoolean = (IntegerEqualBoolean)theEObject;
				T result = caseIntegerEqualBoolean(integerEqualBoolean);
				if (result == null) result = caseBooleanExpression(integerEqualBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INTEGER_NOT_EQUAL_BOOLEAN: {
				IntegerNotEqualBoolean integerNotEqualBoolean = (IntegerNotEqualBoolean)theEObject;
				T result = caseIntegerNotEqualBoolean(integerNotEqualBoolean);
				if (result == null) result = caseBooleanExpression(integerNotEqualBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INTEGER_GREATER_BOOLEAN: {
				IntegerGreaterBoolean integerGreaterBoolean = (IntegerGreaterBoolean)theEObject;
				T result = caseIntegerGreaterBoolean(integerGreaterBoolean);
				if (result == null) result = caseBooleanExpression(integerGreaterBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INTEGER_GREATER_EQUAL_BOOLEAN: {
				IntegerGreaterEqualBoolean integerGreaterEqualBoolean = (IntegerGreaterEqualBoolean)theEObject;
				T result = caseIntegerGreaterEqualBoolean(integerGreaterEqualBoolean);
				if (result == null) result = caseBooleanExpression(integerGreaterEqualBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INTEGER_LESS_BOOLEAN: {
				IntegerLessBoolean integerLessBoolean = (IntegerLessBoolean)theEObject;
				T result = caseIntegerLessBoolean(integerLessBoolean);
				if (result == null) result = caseBooleanExpression(integerLessBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INTEGER_LESS_EQUAL_BOOLEAN: {
				IntegerLessEqualBoolean integerLessEqualBoolean = (IntegerLessEqualBoolean)theEObject;
				T result = caseIntegerLessEqualBoolean(integerLessEqualBoolean);
				if (result == null) result = caseBooleanExpression(integerLessEqualBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_EQUAL_BOOLEAN: {
				StringEqualBoolean stringEqualBoolean = (StringEqualBoolean)theEObject;
				T result = caseStringEqualBoolean(stringEqualBoolean);
				if (result == null) result = caseBooleanExpression(stringEqualBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_NOT_EQUAL_BOOLEAN: {
				StringNotEqualBoolean stringNotEqualBoolean = (StringNotEqualBoolean)theEObject;
				T result = caseStringNotEqualBoolean(stringNotEqualBoolean);
				if (result == null) result = caseBooleanExpression(stringNotEqualBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_GREATER_BOOLEAN: {
				StringGreaterBoolean stringGreaterBoolean = (StringGreaterBoolean)theEObject;
				T result = caseStringGreaterBoolean(stringGreaterBoolean);
				if (result == null) result = caseBooleanExpression(stringGreaterBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_LESS_BOOLEAN: {
				StringLessBoolean stringLessBoolean = (StringLessBoolean)theEObject;
				T result = caseStringLessBoolean(stringLessBoolean);
				if (result == null) result = caseBooleanExpression(stringLessBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRIN_NOT_NULL_BOOLEAN: {
				StrinNotNullBoolean strinNotNullBoolean = (StrinNotNullBoolean)theEObject;
				T result = caseStrinNotNullBoolean(strinNotNullBoolean);
				if (result == null) result = caseBooleanExpression(strinNotNullBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_NULL_BOOLEAN: {
				StringNullBoolean stringNullBoolean = (StringNullBoolean)theEObject;
				T result = caseStringNullBoolean(stringNullBoolean);
				if (result == null) result = caseBooleanExpression(stringNullBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.AND_BOOLEAN_EXPRESSION: {
				AndBooleanExpression andBooleanExpression = (AndBooleanExpression)theEObject;
				T result = caseAndBooleanExpression(andBooleanExpression);
				if (result == null) result = caseBooleanExpression(andBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.OR_BOOLEAN_EXPRESSION: {
				OrBooleanExpression orBooleanExpression = (OrBooleanExpression)theEObject;
				T result = caseOrBooleanExpression(orBooleanExpression);
				if (result == null) result = caseBooleanExpression(orBooleanExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STATEMENT_BOOLEAN: {
				StatementBoolean statementBoolean = (StatementBoolean)theEObject;
				T result = caseStatementBoolean(statementBoolean);
				if (result == null) result = caseBooleanExpression(statementBoolean);
				if (result == null) result = caseStatement(statementBoolean);
				if (result == null) result = caseNamedElement(statementBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STATEMENT_EXISTS_BOOLEAN: {
				StatementExistsBoolean statementExistsBoolean = (StatementExistsBoolean)theEObject;
				T result = caseStatementExistsBoolean(statementExistsBoolean);
				if (result == null) result = caseStatementBoolean(statementExistsBoolean);
				if (result == null) result = caseBooleanExpression(statementExistsBoolean);
				if (result == null) result = caseStatement(statementExistsBoolean);
				if (result == null) result = caseNamedElement(statementExistsBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseControlStatement(return_);
				if (result == null) result = caseStatement(return_);
				if (result == null) result = caseNamedElement(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ITERATOR: {
				Iterator iterator = (Iterator)theEObject;
				T result = caseIterator(iterator);
				if (result == null) result = caseControlStatement(iterator);
				if (result == null) result = caseStatement(iterator);
				if (result == null) result = caseNamedElement(iterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DIRECTORY_ITERATOR: {
				DirectoryIterator directoryIterator = (DirectoryIterator)theEObject;
				T result = caseDirectoryIterator(directoryIterator);
				if (result == null) result = caseIterator(directoryIterator);
				if (result == null) result = caseControlStatement(directoryIterator);
				if (result == null) result = caseStatement(directoryIterator);
				if (result == null) result = caseNamedElement(directoryIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_CONTENT_ITERATOR: {
				FileContentIterator fileContentIterator = (FileContentIterator)theEObject;
				T result = caseFileContentIterator(fileContentIterator);
				if (result == null) result = caseIterator(fileContentIterator);
				if (result == null) result = caseControlStatement(fileContentIterator);
				if (result == null) result = caseStatement(fileContentIterator);
				if (result == null) result = caseNamedElement(fileContentIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INPUT_PARAMETER_ITERATOR: {
				InputParameterIterator inputParameterIterator = (InputParameterIterator)theEObject;
				T result = caseInputParameterIterator(inputParameterIterator);
				if (result == null) result = caseIterator(inputParameterIterator);
				if (result == null) result = caseControlStatement(inputParameterIterator);
				if (result == null) result = caseStatement(inputParameterIterator);
				if (result == null) result = caseNamedElement(inputParameterIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ENUMERATION_ITERATOR: {
				EnumerationIterator enumerationIterator = (EnumerationIterator)theEObject;
				T result = caseEnumerationIterator(enumerationIterator);
				if (result == null) result = caseIterator(enumerationIterator);
				if (result == null) result = caseControlStatement(enumerationIterator);
				if (result == null) result = caseStatement(enumerationIterator);
				if (result == null) result = caseNamedElement(enumerationIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_ITERATOR: {
				StringIterator stringIterator = (StringIterator)theEObject;
				T result = caseStringIterator(stringIterator);
				if (result == null) result = caseIterator(stringIterator);
				if (result == null) result = caseControlStatement(stringIterator);
				if (result == null) result = caseStatement(stringIterator);
				if (result == null) result = caseNamedElement(stringIterator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ENUMERATION_ELEMENT: {
				EnumerationElement enumerationElement = (EnumerationElement)theEObject;
				T result = caseEnumerationElement(enumerationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE_SYSTEM_STATEMENT: {
				FileSystemStatement fileSystemStatement = (FileSystemStatement)theEObject;
				T result = caseFileSystemStatement(fileSystemStatement);
				if (result == null) result = caseStatement(fileSystemStatement);
				if (result == null) result = caseNamedElement(fileSystemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ADDITION_FILE_SYSTEM_STATEMENT: {
				AdditionFileSystemStatement additionFileSystemStatement = (AdditionFileSystemStatement)theEObject;
				T result = caseAdditionFileSystemStatement(additionFileSystemStatement);
				if (result == null) result = caseFileSystemStatement(additionFileSystemStatement);
				if (result == null) result = caseStatement(additionFileSystemStatement);
				if (result == null) result = caseNamedElement(additionFileSystemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DELETION_FILE_SYSTEM_STATEMENT: {
				DeletionFileSystemStatement deletionFileSystemStatement = (DeletionFileSystemStatement)theEObject;
				T result = caseDeletionFileSystemStatement(deletionFileSystemStatement);
				if (result == null) result = caseFileSystemStatement(deletionFileSystemStatement);
				if (result == null) result = caseStatement(deletionFileSystemStatement);
				if (result == null) result = caseNamedElement(deletionFileSystemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.UPDATE_FILE_SYSTEM_STATEMENT: {
				UpdateFileSystemStatement updateFileSystemStatement = (UpdateFileSystemStatement)theEObject;
				T result = caseUpdateFileSystemStatement(updateFileSystemStatement);
				if (result == null) result = caseFileSystemStatement(updateFileSystemStatement);
				if (result == null) result = caseStatement(updateFileSystemStatement);
				if (result == null) result = caseNamedElement(updateFileSystemStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ENVIRONMENT_STATEMENT: {
				EnvironmentStatement environmentStatement = (EnvironmentStatement)theEObject;
				T result = caseEnvironmentStatement(environmentStatement);
				if (result == null) result = caseStatement(environmentStatement);
				if (result == null) result = caseNamedElement(environmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ADDITION_ENVIRONMENT_STATEMENT: {
				AdditionEnvironmentStatement additionEnvironmentStatement = (AdditionEnvironmentStatement)theEObject;
				T result = caseAdditionEnvironmentStatement(additionEnvironmentStatement);
				if (result == null) result = caseEnvironmentStatement(additionEnvironmentStatement);
				if (result == null) result = caseStatement(additionEnvironmentStatement);
				if (result == null) result = caseNamedElement(additionEnvironmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DELETION_ENVIRONMENT_STATEMENT: {
				DeletionEnvironmentStatement deletionEnvironmentStatement = (DeletionEnvironmentStatement)theEObject;
				T result = caseDeletionEnvironmentStatement(deletionEnvironmentStatement);
				if (result == null) result = caseEnvironmentStatement(deletionEnvironmentStatement);
				if (result == null) result = caseStatement(deletionEnvironmentStatement);
				if (result == null) result = caseNamedElement(deletionEnvironmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.UPDATE_ENVIRONMENT_STATEMENT: {
				UpdateEnvironmentStatement updateEnvironmentStatement = (UpdateEnvironmentStatement)theEObject;
				T result = caseUpdateEnvironmentStatement(updateEnvironmentStatement);
				if (result == null) result = caseEnvironmentStatement(updateEnvironmentStatement);
				if (result == null) result = caseStatement(updateEnvironmentStatement);
				if (result == null) result = caseNamedElement(updateEnvironmentStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PACKAGE_SETTING_STATEMENT: {
				PackageSettingStatement packageSettingStatement = (PackageSettingStatement)theEObject;
				T result = casePackageSettingStatement(packageSettingStatement);
				if (result == null) result = caseStatement(packageSettingStatement);
				if (result == null) result = caseNamedElement(packageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ADDITION_PACKAGE_SETTING_STATEMENT: {
				AdditionPackageSettingStatement additionPackageSettingStatement = (AdditionPackageSettingStatement)theEObject;
				T result = caseAdditionPackageSettingStatement(additionPackageSettingStatement);
				if (result == null) result = casePackageSettingStatement(additionPackageSettingStatement);
				if (result == null) result = caseStatement(additionPackageSettingStatement);
				if (result == null) result = caseNamedElement(additionPackageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DELETION_PACKAGE_SETTING_STATEMENT: {
				DeletionPackageSettingStatement deletionPackageSettingStatement = (DeletionPackageSettingStatement)theEObject;
				T result = caseDeletionPackageSettingStatement(deletionPackageSettingStatement);
				if (result == null) result = casePackageSettingStatement(deletionPackageSettingStatement);
				if (result == null) result = caseStatement(deletionPackageSettingStatement);
				if (result == null) result = caseNamedElement(deletionPackageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.UPDATE_PACKAGE_SETTING_STATEMENT: {
				UpdatePackageSettingStatement updatePackageSettingStatement = (UpdatePackageSettingStatement)theEObject;
				T result = caseUpdatePackageSettingStatement(updatePackageSettingStatement);
				if (result == null) result = casePackageSettingStatement(updatePackageSettingStatement);
				if (result == null) result = caseStatement(updatePackageSettingStatement);
				if (result == null) result = caseNamedElement(updatePackageSettingStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.NEUTRAL_STATEMENT: {
				NeutralStatement neutralStatement = (NeutralStatement)theEObject;
				T result = caseNeutralStatement(neutralStatement);
				if (result == null) result = caseStatement(neutralStatement);
				if (result == null) result = caseNamedElement(neutralStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = caseNeutralStatement(message);
				if (result == null) result = caseStatement(message);
				if (result == null) result = caseNamedElement(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseNeutralStatement(comment);
				if (result == null) result = caseStatement(comment);
				if (result == null) result = caseNamedElement(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseNamedElement(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.DOCUMENTATION_FILE: {
				DocumentationFile documentationFile = (DocumentationFile)theEObject;
				T result = caseDocumentationFile(documentationFile);
				if (result == null) result = caseFile(documentationFile);
				if (result == null) result = caseNamedElement(documentationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INFORMATION_FILE: {
				InformationFile informationFile = (InformationFile)theEObject;
				T result = caseInformationFile(informationFile);
				if (result == null) result = caseFile(informationFile);
				if (result == null) result = caseNamedElement(informationFile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_DESKTOP: {
				PostinstDesktop postinstDesktop = (PostinstDesktop)theEObject;
				T result = casePostinstDesktop(postinstDesktop);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstDesktop);
				if (result == null) result = caseEnvironmentStatement(postinstDesktop);
				if (result == null) result = caseStatement(postinstDesktop);
				if (result == null) result = caseNamedElement(postinstDesktop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_DOC_BASE: {
				PostinstDocBase postinstDocBase = (PostinstDocBase)theEObject;
				T result = casePostinstDocBase(postinstDocBase);
				if (result == null) result = caseAdditionEnvironmentStatement(postinstDocBase);
				if (result == null) result = caseEnvironmentStatement(postinstDocBase);
				if (result == null) result = caseStatement(postinstDocBase);
				if (result == null) result = caseNamedElement(postinstDocBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_EMACSEN: {
				PostinstEmacsen postinstEmacsen = (PostinstEmacsen)theEObject;
				T result = casePostinstEmacsen(postinstEmacsen);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstEmacsen);
				if (result == null) result = caseUpdatePackageSettingStatement(postinstEmacsen);
				if (result == null) result = caseEnvironmentStatement(postinstEmacsen);
				if (result == null) result = casePackageSettingStatement(postinstEmacsen);
				if (result == null) result = caseStatement(postinstEmacsen);
				if (result == null) result = caseNamedElement(postinstEmacsen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_GCONF: {
				PostinstGconf postinstGconf = (PostinstGconf)theEObject;
				T result = casePostinstGconf(postinstGconf);
				if (result == null) result = caseUpdatePackageSettingStatement(postinstGconf);
				if (result == null) result = casePackageSettingStatement(postinstGconf);
				if (result == null) result = caseStatement(postinstGconf);
				if (result == null) result = caseNamedElement(postinstGconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_GCONF_DEFAULTS: {
				PostinstGconfDefaults postinstGconfDefaults = (PostinstGconfDefaults)theEObject;
				T result = casePostinstGconfDefaults(postinstGconfDefaults);
				if (result == null) result = caseUpdatePackageSettingStatement(postinstGconfDefaults);
				if (result == null) result = casePackageSettingStatement(postinstGconfDefaults);
				if (result == null) result = caseStatement(postinstGconfDefaults);
				if (result == null) result = caseNamedElement(postinstGconfDefaults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_ICONS: {
				PostinstIcons postinstIcons = (PostinstIcons)theEObject;
				T result = casePostinstIcons(postinstIcons);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstIcons);
				if (result == null) result = caseEnvironmentStatement(postinstIcons);
				if (result == null) result = caseStatement(postinstIcons);
				if (result == null) result = caseNamedElement(postinstIcons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_INFO: {
				PostinstInfo postinstInfo = (PostinstInfo)theEObject;
				T result = casePostinstInfo(postinstInfo);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInfo);
				if (result == null) result = caseEnvironmentStatement(postinstInfo);
				if (result == null) result = caseStatement(postinstInfo);
				if (result == null) result = caseNamedElement(postinstInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_INIT: {
				PostinstInit postinstInit = (PostinstInit)theEObject;
				T result = casePostinstInit(postinstInit);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInit);
				if (result == null) result = caseEnvironmentStatement(postinstInit);
				if (result == null) result = caseStatement(postinstInit);
				if (result == null) result = caseNamedElement(postinstInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_INIT_NOSTART: {
				PostinstInitNostart postinstInitNostart = (PostinstInitNostart)theEObject;
				T result = casePostinstInitNostart(postinstInitNostart);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInitNostart);
				if (result == null) result = caseEnvironmentStatement(postinstInitNostart);
				if (result == null) result = caseStatement(postinstInitNostart);
				if (result == null) result = caseNamedElement(postinstInitNostart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_INIT_RESTART: {
				PostinstInitRestart postinstInitRestart = (PostinstInitRestart)theEObject;
				T result = casePostinstInitRestart(postinstInitRestart);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstInitRestart);
				if (result == null) result = caseEnvironmentStatement(postinstInitRestart);
				if (result == null) result = caseStatement(postinstInitRestart);
				if (result == null) result = caseNamedElement(postinstInitRestart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_MAKESHLIBS: {
				PostinstMakeshlibs postinstMakeshlibs = (PostinstMakeshlibs)theEObject;
				T result = casePostinstMakeshlibs(postinstMakeshlibs);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMakeshlibs);
				if (result == null) result = caseEnvironmentStatement(postinstMakeshlibs);
				if (result == null) result = caseStatement(postinstMakeshlibs);
				if (result == null) result = caseNamedElement(postinstMakeshlibs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_MENU: {
				PostinstMenu postinstMenu = (PostinstMenu)theEObject;
				T result = casePostinstMenu(postinstMenu);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMenu);
				if (result == null) result = caseEnvironmentStatement(postinstMenu);
				if (result == null) result = caseStatement(postinstMenu);
				if (result == null) result = caseNamedElement(postinstMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_MENU_METHOD: {
				PostinstMenuMethod postinstMenuMethod = (PostinstMenuMethod)theEObject;
				T result = casePostinstMenuMethod(postinstMenuMethod);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMenuMethod);
				if (result == null) result = caseEnvironmentStatement(postinstMenuMethod);
				if (result == null) result = caseStatement(postinstMenuMethod);
				if (result == null) result = caseNamedElement(postinstMenuMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_MIME: {
				PostinstMime postinstMime = (PostinstMime)theEObject;
				T result = casePostinstMime(postinstMime);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstMime);
				if (result == null) result = caseEnvironmentStatement(postinstMime);
				if (result == null) result = caseStatement(postinstMime);
				if (result == null) result = caseNamedElement(postinstMime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_MODULES: {
				PostinstModules postinstModules = (PostinstModules)theEObject;
				T result = casePostinstModules(postinstModules);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstModules);
				if (result == null) result = caseEnvironmentStatement(postinstModules);
				if (result == null) result = caseStatement(postinstModules);
				if (result == null) result = caseNamedElement(postinstModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_PYTHON: {
				PostinstPython postinstPython = (PostinstPython)theEObject;
				T result = casePostinstPython(postinstPython);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstPython);
				if (result == null) result = caseEnvironmentStatement(postinstPython);
				if (result == null) result = caseStatement(postinstPython);
				if (result == null) result = caseNamedElement(postinstPython);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_SCROLLKEEPER: {
				PostinstScrollkeeper postinstScrollkeeper = (PostinstScrollkeeper)theEObject;
				T result = casePostinstScrollkeeper(postinstScrollkeeper);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstScrollkeeper);
				if (result == null) result = caseEnvironmentStatement(postinstScrollkeeper);
				if (result == null) result = caseStatement(postinstScrollkeeper);
				if (result == null) result = caseNamedElement(postinstScrollkeeper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_SGMLCATALOG: {
				PostinstSgmlcatalog postinstSgmlcatalog = (PostinstSgmlcatalog)theEObject;
				T result = casePostinstSgmlcatalog(postinstSgmlcatalog);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstSgmlcatalog);
				if (result == null) result = caseEnvironmentStatement(postinstSgmlcatalog);
				if (result == null) result = caseStatement(postinstSgmlcatalog);
				if (result == null) result = caseNamedElement(postinstSgmlcatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_SHAREDMIMEINFO: {
				PostinstSharedmimeinfo postinstSharedmimeinfo = (PostinstSharedmimeinfo)theEObject;
				T result = casePostinstSharedmimeinfo(postinstSharedmimeinfo);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstSharedmimeinfo);
				if (result == null) result = caseEnvironmentStatement(postinstSharedmimeinfo);
				if (result == null) result = caseStatement(postinstSharedmimeinfo);
				if (result == null) result = caseNamedElement(postinstSharedmimeinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_SUID: {
				PostinstSuid postinstSuid = (PostinstSuid)theEObject;
				T result = casePostinstSuid(postinstSuid);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstSuid);
				if (result == null) result = caseUpdateFileSystemStatement(postinstSuid);
				if (result == null) result = caseEnvironmentStatement(postinstSuid);
				if (result == null) result = caseFileSystemStatement(postinstSuid);
				if (result == null) result = caseStatement(postinstSuid);
				if (result == null) result = caseNamedElement(postinstSuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_UDEV: {
				PostinstUdev postinstUdev = (PostinstUdev)theEObject;
				T result = casePostinstUdev(postinstUdev);
				if (result == null) result = caseUpdateFileSystemStatement(postinstUdev);
				if (result == null) result = caseFileSystemStatement(postinstUdev);
				if (result == null) result = caseStatement(postinstUdev);
				if (result == null) result = caseNamedElement(postinstUdev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_USRLOCAL: {
				PostinstUsrlocal postinstUsrlocal = (PostinstUsrlocal)theEObject;
				T result = casePostinstUsrlocal(postinstUsrlocal);
				if (result == null) result = caseUpdateFileSystemStatement(postinstUsrlocal);
				if (result == null) result = caseFileSystemStatement(postinstUsrlocal);
				if (result == null) result = caseStatement(postinstUsrlocal);
				if (result == null) result = caseNamedElement(postinstUsrlocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_WM: {
				PostinstWm postinstWm = (PostinstWm)theEObject;
				T result = casePostinstWm(postinstWm);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstWm);
				if (result == null) result = caseEnvironmentStatement(postinstWm);
				if (result == null) result = caseStatement(postinstWm);
				if (result == null) result = caseNamedElement(postinstWm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_WM_NOMAN: {
				PostinstWmNoman postinstWmNoman = (PostinstWmNoman)theEObject;
				T result = casePostinstWmNoman(postinstWmNoman);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstWmNoman);
				if (result == null) result = caseEnvironmentStatement(postinstWmNoman);
				if (result == null) result = caseStatement(postinstWmNoman);
				if (result == null) result = caseNamedElement(postinstWmNoman);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_XFONTS: {
				PostinstXfonts postinstXfonts = (PostinstXfonts)theEObject;
				T result = casePostinstXfonts(postinstXfonts);
				if (result == null) result = caseUpdateEnvironmentStatement(postinstXfonts);
				if (result == null) result = caseEnvironmentStatement(postinstXfonts);
				if (result == null) result = caseStatement(postinstXfonts);
				if (result == null) result = caseNamedElement(postinstXfonts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_DEBCONF: {
				PostrmDebconf postrmDebconf = (PostrmDebconf)theEObject;
				T result = casePostrmDebconf(postrmDebconf);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmDebconf);
				if (result == null) result = caseEnvironmentStatement(postrmDebconf);
				if (result == null) result = caseStatement(postrmDebconf);
				if (result == null) result = caseNamedElement(postrmDebconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_DESKTOP: {
				PostrmDesktop postrmDesktop = (PostrmDesktop)theEObject;
				T result = casePostrmDesktop(postrmDesktop);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmDesktop);
				if (result == null) result = caseEnvironmentStatement(postrmDesktop);
				if (result == null) result = caseStatement(postrmDesktop);
				if (result == null) result = caseNamedElement(postrmDesktop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_GCONF: {
				PostrmGconf postrmGconf = (PostrmGconf)theEObject;
				T result = casePostrmGconf(postrmGconf);
				if (result == null) result = caseDeletionFileSystemStatement(postrmGconf);
				if (result == null) result = caseFileSystemStatement(postrmGconf);
				if (result == null) result = caseStatement(postrmGconf);
				if (result == null) result = caseNamedElement(postrmGconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_GCONF_DEFAULTS: {
				PostrmGconfDefaults postrmGconfDefaults = (PostrmGconfDefaults)theEObject;
				T result = casePostrmGconfDefaults(postrmGconfDefaults);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmGconfDefaults);
				if (result == null) result = caseEnvironmentStatement(postrmGconfDefaults);
				if (result == null) result = caseStatement(postrmGconfDefaults);
				if (result == null) result = caseNamedElement(postrmGconfDefaults);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_ICONS: {
				PostrmIcons postrmIcons = (PostrmIcons)theEObject;
				T result = casePostrmIcons(postrmIcons);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmIcons);
				if (result == null) result = caseEnvironmentStatement(postrmIcons);
				if (result == null) result = caseStatement(postrmIcons);
				if (result == null) result = caseNamedElement(postrmIcons);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_INIT: {
				PostrmInit postrmInit = (PostrmInit)theEObject;
				T result = casePostrmInit(postrmInit);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmInit);
				if (result == null) result = caseDeletionFileSystemStatement(postrmInit);
				if (result == null) result = caseEnvironmentStatement(postrmInit);
				if (result == null) result = caseFileSystemStatement(postrmInit);
				if (result == null) result = caseStatement(postrmInit);
				if (result == null) result = caseNamedElement(postrmInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_MAKESHLIBS: {
				PostrmMakeshlibs postrmMakeshlibs = (PostrmMakeshlibs)theEObject;
				T result = casePostrmMakeshlibs(postrmMakeshlibs);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMakeshlibs);
				if (result == null) result = caseEnvironmentStatement(postrmMakeshlibs);
				if (result == null) result = caseStatement(postrmMakeshlibs);
				if (result == null) result = caseNamedElement(postrmMakeshlibs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_MENU: {
				PostrmMenu postrmMenu = (PostrmMenu)theEObject;
				T result = casePostrmMenu(postrmMenu);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMenu);
				if (result == null) result = caseEnvironmentStatement(postrmMenu);
				if (result == null) result = caseStatement(postrmMenu);
				if (result == null) result = caseNamedElement(postrmMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_MENU_METHOD: {
				PostrmMenuMethod postrmMenuMethod = (PostrmMenuMethod)theEObject;
				T result = casePostrmMenuMethod(postrmMenuMethod);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMenuMethod);
				if (result == null) result = caseUpdateFileSystemStatement(postrmMenuMethod);
				if (result == null) result = caseEnvironmentStatement(postrmMenuMethod);
				if (result == null) result = caseFileSystemStatement(postrmMenuMethod);
				if (result == null) result = caseStatement(postrmMenuMethod);
				if (result == null) result = caseNamedElement(postrmMenuMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_MIME: {
				PostrmMime postrmMime = (PostrmMime)theEObject;
				T result = casePostrmMime(postrmMime);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmMime);
				if (result == null) result = caseEnvironmentStatement(postrmMime);
				if (result == null) result = caseStatement(postrmMime);
				if (result == null) result = caseNamedElement(postrmMime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_MODULES: {
				PostrmModules postrmModules = (PostrmModules)theEObject;
				T result = casePostrmModules(postrmModules);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmModules);
				if (result == null) result = caseEnvironmentStatement(postrmModules);
				if (result == null) result = caseStatement(postrmModules);
				if (result == null) result = caseNamedElement(postrmModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_SCROLLKEEPER: {
				PostrmScrollkeeper postrmScrollkeeper = (PostrmScrollkeeper)theEObject;
				T result = casePostrmScrollkeeper(postrmScrollkeeper);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmScrollkeeper);
				if (result == null) result = caseEnvironmentStatement(postrmScrollkeeper);
				if (result == null) result = caseStatement(postrmScrollkeeper);
				if (result == null) result = caseNamedElement(postrmScrollkeeper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_SGMLCATALOG: {
				PostrmSgmlcatalog postrmSgmlcatalog = (PostrmSgmlcatalog)theEObject;
				T result = casePostrmSgmlcatalog(postrmSgmlcatalog);
				if (result == null) result = caseUpdateFileSystemStatement(postrmSgmlcatalog);
				if (result == null) result = caseFileSystemStatement(postrmSgmlcatalog);
				if (result == null) result = caseStatement(postrmSgmlcatalog);
				if (result == null) result = caseNamedElement(postrmSgmlcatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_SHAREDMIMEINFO: {
				PostrmSharedmimeinfo postrmSharedmimeinfo = (PostrmSharedmimeinfo)theEObject;
				T result = casePostrmSharedmimeinfo(postrmSharedmimeinfo);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmSharedmimeinfo);
				if (result == null) result = caseEnvironmentStatement(postrmSharedmimeinfo);
				if (result == null) result = caseStatement(postrmSharedmimeinfo);
				if (result == null) result = caseNamedElement(postrmSharedmimeinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_SUID: {
				PostrmSuid postrmSuid = (PostrmSuid)theEObject;
				T result = casePostrmSuid(postrmSuid);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmSuid);
				if (result == null) result = caseEnvironmentStatement(postrmSuid);
				if (result == null) result = caseStatement(postrmSuid);
				if (result == null) result = caseNamedElement(postrmSuid);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTRM_XFONTS: {
				PostrmXfonts postrmXfonts = (PostrmXfonts)theEObject;
				T result = casePostrmXfonts(postrmXfonts);
				if (result == null) result = caseUpdateEnvironmentStatement(postrmXfonts);
				if (result == null) result = caseEnvironmentStatement(postrmXfonts);
				if (result == null) result = caseStatement(postrmXfonts);
				if (result == null) result = caseNamedElement(postrmXfonts);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PREINST_UDEV: {
				PreinstUdev preinstUdev = (PreinstUdev)theEObject;
				T result = casePreinstUdev(preinstUdev);
				if (result == null) result = caseDeletionFileSystemStatement(preinstUdev);
				if (result == null) result = caseFileSystemStatement(preinstUdev);
				if (result == null) result = caseStatement(preinstUdev);
				if (result == null) result = caseNamedElement(preinstUdev);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PREINST_USER: {
				PreinstUser preinstUser = (PreinstUser)theEObject;
				T result = casePreinstUser(preinstUser);
				if (result == null) result = caseUpdateFileSystemStatement(preinstUser);
				if (result == null) result = caseFileSystemStatement(preinstUser);
				if (result == null) result = caseStatement(preinstUser);
				if (result == null) result = caseNamedElement(preinstUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_DOC_BASE: {
				PrermDocBase prermDocBase = (PrermDocBase)theEObject;
				T result = casePrermDocBase(prermDocBase);
				if (result == null) result = caseUpdateEnvironmentStatement(prermDocBase);
				if (result == null) result = caseEnvironmentStatement(prermDocBase);
				if (result == null) result = caseStatement(prermDocBase);
				if (result == null) result = caseNamedElement(prermDocBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_EMACSEN: {
				PrermEmacsen prermEmacsen = (PrermEmacsen)theEObject;
				T result = casePrermEmacsen(prermEmacsen);
				if (result == null) result = caseUpdateEnvironmentStatement(prermEmacsen);
				if (result == null) result = caseUpdatePackageSettingStatement(prermEmacsen);
				if (result == null) result = caseEnvironmentStatement(prermEmacsen);
				if (result == null) result = casePackageSettingStatement(prermEmacsen);
				if (result == null) result = caseStatement(prermEmacsen);
				if (result == null) result = caseNamedElement(prermEmacsen);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_GCONF: {
				PrermGconf prermGconf = (PrermGconf)theEObject;
				T result = casePrermGconf(prermGconf);
				if (result == null) result = caseUpdatePackageSettingStatement(prermGconf);
				if (result == null) result = casePackageSettingStatement(prermGconf);
				if (result == null) result = caseStatement(prermGconf);
				if (result == null) result = caseNamedElement(prermGconf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_INFO: {
				PrermInfo prermInfo = (PrermInfo)theEObject;
				T result = casePrermInfo(prermInfo);
				if (result == null) result = caseUpdateEnvironmentStatement(prermInfo);
				if (result == null) result = caseDeletionPackageSettingStatement(prermInfo);
				if (result == null) result = caseEnvironmentStatement(prermInfo);
				if (result == null) result = casePackageSettingStatement(prermInfo);
				if (result == null) result = caseStatement(prermInfo);
				if (result == null) result = caseNamedElement(prermInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_INIT: {
				PrermInit prermInit = (PrermInit)theEObject;
				T result = casePrermInit(prermInit);
				if (result == null) result = caseUpdateEnvironmentStatement(prermInit);
				if (result == null) result = caseEnvironmentStatement(prermInit);
				if (result == null) result = caseStatement(prermInit);
				if (result == null) result = caseNamedElement(prermInit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_INIT_NORESTART: {
				PrermInitNorestart prermInitNorestart = (PrermInitNorestart)theEObject;
				T result = casePrermInitNorestart(prermInitNorestart);
				if (result == null) result = caseUpdateEnvironmentStatement(prermInitNorestart);
				if (result == null) result = caseEnvironmentStatement(prermInitNorestart);
				if (result == null) result = caseStatement(prermInitNorestart);
				if (result == null) result = caseNamedElement(prermInitNorestart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_PYTHON: {
				PrermPython prermPython = (PrermPython)theEObject;
				T result = casePrermPython(prermPython);
				if (result == null) result = caseDeletionFileSystemStatement(prermPython);
				if (result == null) result = caseFileSystemStatement(prermPython);
				if (result == null) result = caseStatement(prermPython);
				if (result == null) result = caseNamedElement(prermPython);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_SGMLCATALOG: {
				PrermSgmlcatalog prermSgmlcatalog = (PrermSgmlcatalog)theEObject;
				T result = casePrermSgmlcatalog(prermSgmlcatalog);
				if (result == null) result = caseUpdateEnvironmentStatement(prermSgmlcatalog);
				if (result == null) result = caseDeletionPackageSettingStatement(prermSgmlcatalog);
				if (result == null) result = caseEnvironmentStatement(prermSgmlcatalog);
				if (result == null) result = casePackageSettingStatement(prermSgmlcatalog);
				if (result == null) result = caseStatement(prermSgmlcatalog);
				if (result == null) result = caseNamedElement(prermSgmlcatalog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_USRLOCAL: {
				PrermUsrlocal prermUsrlocal = (PrermUsrlocal)theEObject;
				T result = casePrermUsrlocal(prermUsrlocal);
				if (result == null) result = caseDeletionFileSystemStatement(prermUsrlocal);
				if (result == null) result = caseFileSystemStatement(prermUsrlocal);
				if (result == null) result = caseStatement(prermUsrlocal);
				if (result == null) result = caseNamedElement(prermUsrlocal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PRERM_WM: {
				PrermWm prermWm = (PrermWm)theEObject;
				T result = casePrermWm(prermWm);
				if (result == null) result = caseDeletionPackageSettingStatement(prermWm);
				if (result == null) result = casePackageSettingStatement(prermWm);
				if (result == null) result = caseStatement(prermWm);
				if (result == null) result = caseNamedElement(prermWm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.UPDATE_PYTHON_MODULES: {
				UpdatePythonModules updatePythonModules = (UpdatePythonModules)theEObject;
				T result = caseUpdatePythonModules(updatePythonModules);
				if (result == null) result = caseUpdateEnvironmentStatement(updatePythonModules);
				if (result == null) result = caseEnvironmentStatement(updatePythonModules);
				if (result == null) result = caseStatement(updatePythonModules);
				if (result == null) result = caseNamedElement(updatePythonModules);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.POSTINST_ADD_ALTERNATIVE: {
				PostinstAddAlternative postinstAddAlternative = (PostinstAddAlternative)theEObject;
				T result = casePostinstAddAlternative(postinstAddAlternative);
				if (result == null) result = caseAdditionEnvironmentStatement(postinstAddAlternative);
				if (result == null) result = caseEnvironmentStatement(postinstAddAlternative);
				if (result == null) result = caseStatement(postinstAddAlternative);
				if (result == null) result = caseNamedElement(postinstAddAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ADD_ALTERNATIVE: {
				AddAlternative addAlternative = (AddAlternative)theEObject;
				T result = caseAddAlternative(addAlternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.PARAM: {
				Param param = (Param)theEObject;
				T result = caseParam(param);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.STRING_PARAM: {
				StringParam stringParam = (StringParam)theEObject;
				T result = caseStringParam(stringParam);
				if (result == null) result = caseParam(stringParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.INT_PARAM: {
				IntParam intParam = (IntParam)theEObject;
				T result = caseIntParam(intParam);
				if (result == null) result = caseParam(intParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.SINGLE_CONFLICT: {
				SingleConflict singleConflict = (SingleConflict)theEObject;
				T result = caseSingleConflict(singleConflict);
				if (result == null) result = caseConflict(singleConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.CONFLICT: {
				Conflict conflict = (Conflict)theEObject;
				T result = caseConflict(conflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.AND_CONFLICT: {
				AndConflict andConflict = (AndConflict)theEObject;
				T result = caseAndConflict(andConflict);
				if (result == null) result = caseConflict(andConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.OR_CONFLICT: {
				OrConflict orConflict = (OrConflict)theEObject;
				T result = caseOrConflict(orConflict);
				if (result == null) result = caseConflict(orConflict);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PackagemmPackage.ASSIGNMENT: {
				Assignment assignment = (Assignment)theEObject;
				T result = caseAssignment(assignment);
				if (result == null) result = caseNeutralStatement(assignment);
				if (result == null) result = caseStatement(assignment);
				if (result == null) result = caseNamedElement(assignment);
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
	public T casePackage(it.univaq.mancoosi.packagemm.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScript(Script object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParameter(InputParameter object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Preinst Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preinst Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreinstScript(PreinstScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstScript(PostinstScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermScript(PrermScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmScript(PostrmScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigScript(ConfigScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlStatement(ControlStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Case Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Case Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultCaseCondition(DefaultCaseCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Prerm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Prerm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePrerm(CasePrerm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Prerm Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Prerm Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePrermCondition(CasePrermCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postrm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postrm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePostrm(CasePostrm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postrm Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postrm Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePostrmCondition(CasePostrmCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Preinst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Preinst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePreinst(CasePreinst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Preinst Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Preinst Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePreinstCondition(CasePreinstCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postinst</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postinst</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePostinst(CasePostinst object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Postinst Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Postinst Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCasePostinstCondition(CasePostinstCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCase(BasicCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Case Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Case Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicCaseCondition(BasicCaseCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanExpression(BooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Exists Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Exists Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileExistsBoolean(FileExistsBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regular File Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regular File Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegularFileBoolean(RegularFileBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Not Zero Size Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Not Zero Size Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNotZeroSizeBoolean(FileNotZeroSizeBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Directory Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Directory Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsDirectoryBoolean(IsDirectoryBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Block Device Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Block Device Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileBlockDeviceBoolean(FileBlockDeviceBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Character Device Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Character Device Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileCharacterDeviceBoolean(FileCharacterDeviceBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Pipe Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Pipe Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilePipeBoolean(FilePipeBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Symbolic Link Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Symbolic Link Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSymbolicLinkBoolean(FileSymbolicLinkBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Socket Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Socket Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSocketBoolean(FileSocketBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Terminal Device Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Terminal Device Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileTerminalDeviceBoolean(FileTerminalDeviceBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Read Permission Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Read Permission Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileReadPermissionBoolean(FileReadPermissionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Write Permission Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Write Permission Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileWritePermissionBoolean(FileWritePermissionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Execute Permission Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Execute Permission Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileExecutePermissionBoolean(FileExecutePermissionBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Equal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerEqualBoolean(IntegerEqualBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Not Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Not Equal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerNotEqualBoolean(IntegerNotEqualBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Greater Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Greater Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerGreaterBoolean(IntegerGreaterBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Greater Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Greater Equal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerGreaterEqualBoolean(IntegerGreaterEqualBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Less Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Less Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLessBoolean(IntegerLessBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Less Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Less Equal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerLessEqualBoolean(IntegerLessEqualBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Equal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringEqualBoolean(StringEqualBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Not Equal Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Not Equal Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringNotEqualBoolean(StringNotEqualBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Greater Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Greater Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringGreaterBoolean(StringGreaterBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Less Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Less Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLessBoolean(StringLessBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strin Not Null Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strin Not Null Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrinNotNullBoolean(StrinNotNullBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Null Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Null Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringNullBoolean(StringNullBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAndBooleanExpression(AndBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or Boolean Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrBooleanExpression(OrBooleanExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementBoolean(StatementBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement Exists Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement Exists Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatementExistsBoolean(StatementExistsBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIterator(Iterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectoryIterator(DirectoryIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Content Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Content Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileContentIterator(FileContentIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Parameter Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Parameter Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputParameterIterator(InputParameterIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationIterator(EnumerationIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Iterator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Iterator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringIterator(StringIterator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationElement(EnumerationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File System Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileSystemStatement(FileSystemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition File System Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionFileSystemStatement(AdditionFileSystemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion File System Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletionFileSystemStatement(DeletionFileSystemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update File System Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update File System Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateFileSystemStatement(UpdateFileSystemStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentStatement(EnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionEnvironmentStatement(AdditionEnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletionEnvironmentStatement(DeletionEnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Environment Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Environment Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateEnvironmentStatement(UpdateEnvironmentStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageSettingStatement(PackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Addition Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Addition Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionPackageSettingStatement(AdditionPackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deletion Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deletion Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeletionPackageSettingStatement(DeletionPackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Package Setting Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Package Setting Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatePackageSettingStatement(UpdatePackageSettingStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Neutral Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Neutral Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNeutralStatement(NeutralStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Desktop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstDesktop(PostinstDesktop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Doc Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Doc Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstDocBase(PostinstDocBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Emacsen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Emacsen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstEmacsen(PostinstEmacsen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Gconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstGconf(PostinstGconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Gconf Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Gconf Defaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstGconfDefaults(PostinstGconfDefaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Icons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Icons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstIcons(PostinstIcons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstInfo(PostinstInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstInit(PostinstInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Init Nostart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Init Nostart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstInitNostart(PostinstInitNostart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Init Restart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Init Restart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstInitRestart(PostinstInitRestart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Makeshlibs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Makeshlibs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstMakeshlibs(PostinstMakeshlibs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstMenu(PostinstMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Menu Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Menu Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstMenuMethod(PostinstMenuMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Mime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Mime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstMime(PostinstMime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstModules(PostinstModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Python</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Python</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstPython(PostinstPython object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Scrollkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Scrollkeeper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstScrollkeeper(PostinstScrollkeeper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Sgmlcatalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstSgmlcatalog(PostinstSgmlcatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Sharedmimeinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Sharedmimeinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstSharedmimeinfo(PostinstSharedmimeinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Suid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Suid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstSuid(PostinstSuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Udev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Udev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstUdev(PostinstUdev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Usrlocal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Usrlocal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstUsrlocal(PostinstUsrlocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Wm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Wm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstWm(PostinstWm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Wm Noman</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Wm Noman</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstWmNoman(PostinstWmNoman object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Xfonts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Xfonts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstXfonts(PostinstXfonts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Debconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Debconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmDebconf(PostrmDebconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Desktop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Desktop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmDesktop(PostrmDesktop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Gconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmGconf(PostrmGconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Gconf Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Gconf Defaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmGconfDefaults(PostrmGconfDefaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Icons</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Icons</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmIcons(PostrmIcons object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmInit(PostrmInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Makeshlibs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Makeshlibs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmMakeshlibs(PostrmMakeshlibs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Menu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Menu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmMenu(PostrmMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Menu Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Menu Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmMenuMethod(PostrmMenuMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Mime</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Mime</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmMime(PostrmMime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmModules(PostrmModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Scrollkeeper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Scrollkeeper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmScrollkeeper(PostrmScrollkeeper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Sgmlcatalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmSgmlcatalog(PostrmSgmlcatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Sharedmimeinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Sharedmimeinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmSharedmimeinfo(PostrmSharedmimeinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Suid</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Suid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmSuid(PostrmSuid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postrm Xfonts</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postrm Xfonts</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostrmXfonts(PostrmXfonts object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preinst Udev</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preinst Udev</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreinstUdev(PreinstUdev object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preinst User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preinst User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreinstUser(PreinstUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Doc Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Doc Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermDocBase(PrermDocBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Emacsen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Emacsen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermEmacsen(PrermEmacsen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Gconf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Gconf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermGconf(PrermGconf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermInfo(PrermInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Init</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Init</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermInit(PrermInit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Init Norestart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Init Norestart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermInitNorestart(PrermInitNorestart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Python</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Python</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermPython(PrermPython object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Sgmlcatalog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Sgmlcatalog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermSgmlcatalog(PrermSgmlcatalog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Usrlocal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Usrlocal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermUsrlocal(PrermUsrlocal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prerm Wm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prerm Wm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrermWm(PrermWm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update Python Modules</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update Python Modules</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdatePythonModules(UpdatePythonModules object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postinst Add Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postinst Add Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostinstAddAlternative(PostinstAddAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAlternative(AddAlternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParam(Param object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringParam(StringParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Int Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Int Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntParam(IntParam object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignment(Assignment object) {
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

} //PackagemmSwitch
