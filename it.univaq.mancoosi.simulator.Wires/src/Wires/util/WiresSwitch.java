/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Wires.util;

import Wires.*;

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
 * @see Wires.WiresPackage
 * @generated
 */
public class WiresSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiresPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresSwitch() {
		if (modelPackage == null) {
			modelPackage = WiresPackage.eINSTANCE;
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
			case WiresPackage.TRANSFORMATION: {
				Transformation transformation = (Transformation)theEObject;
				T result = caseTransformation(transformation);
				if (result == null) result = caseTypedElement(transformation);
				if (result == null) result = caseConnectableElement(transformation);
				if (result == null) result = caseWiresElement(transformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.QUERY: {
				Query query = (Query)theEObject;
				T result = caseQuery(query);
				if (result == null) result = caseTransformation(query);
				if (result == null) result = caseTypedElement(query);
				if (result == null) result = caseConnectableElement(query);
				if (result == null) result = caseWiresElement(query);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.ATOMIC_MODEL_TRANSFORMATION: {
				AtomicModelTransformation atomicModelTransformation = (AtomicModelTransformation)theEObject;
				T result = caseAtomicModelTransformation(atomicModelTransformation);
				if (result == null) result = caseTransformation(atomicModelTransformation);
				if (result == null) result = caseTypedElement(atomicModelTransformation);
				if (result == null) result = caseConnectableElement(atomicModelTransformation);
				if (result == null) result = caseWiresElement(atomicModelTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TYPED_ELEMENT: {
				TypedElement typedElement = (TypedElement)theEObject;
				T result = caseTypedElement(typedElement);
				if (result == null) result = caseConnectableElement(typedElement);
				if (result == null) result = caseWiresElement(typedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TYPE: {
				Type type = (Type)theEObject;
				T result = caseType(type);
				if (result == null) result = caseConnectableElement(type);
				if (result == null) result = caseWiresElement(type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.MODEL_TYPE: {
				ModelType modelType = (ModelType)theEObject;
				T result = caseModelType(modelType);
				if (result == null) result = caseDataType(modelType);
				if (result == null) result = caseType(modelType);
				if (result == null) result = caseConnectableElement(modelType);
				if (result == null) result = caseWiresElement(modelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.DATA_TYPE: {
				DataType dataType = (DataType)theEObject;
				T result = caseDataType(dataType);
				if (result == null) result = caseType(dataType);
				if (result == null) result = caseConnectableElement(dataType);
				if (result == null) result = caseWiresElement(dataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.ACTUAL_PARAMETER: {
				ActualParameter actualParameter = (ActualParameter)theEObject;
				T result = caseActualParameter(actualParameter);
				if (result == null) result = caseTypedElement(actualParameter);
				if (result == null) result = caseConnectableElement(actualParameter);
				if (result == null) result = caseWiresElement(actualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.DECISION_NODE: {
				DecisionNode decisionNode = (DecisionNode)theEObject;
				T result = caseDecisionNode(decisionNode);
				if (result == null) result = caseWiresElement(decisionNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.DATA_FLOW: {
				DataFlow dataFlow = (DataFlow)theEObject;
				T result = caseDataFlow(dataFlow);
				if (result == null) result = caseWiresElement(dataFlow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TRANSFORMATION_TYPE: {
				TransformationType transformationType = (TransformationType)theEObject;
				T result = caseTransformationType(transformationType);
				if (result == null) result = caseType(transformationType);
				if (result == null) result = caseConnectableElement(transformationType);
				if (result == null) result = caseWiresElement(transformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.FORMAL_PARAMETER: {
				FormalParameter formalParameter = (FormalParameter)theEObject;
				T result = caseFormalParameter(formalParameter);
				if (result == null) result = caseType(formalParameter);
				if (result == null) result = caseConnectableElement(formalParameter);
				if (result == null) result = caseWiresElement(formalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.QUERY_TYPE: {
				QueryType queryType = (QueryType)theEObject;
				T result = caseQueryType(queryType);
				if (result == null) result = caseTransformationType(queryType);
				if (result == null) result = caseType(queryType);
				if (result == null) result = caseConnectableElement(queryType);
				if (result == null) result = caseWiresElement(queryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.CONNECTABLE_ELEMENT: {
				ConnectableElement connectableElement = (ConnectableElement)theEObject;
				T result = caseConnectableElement(connectableElement);
				if (result == null) result = caseWiresElement(connectableElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = caseTypedElement(model);
				if (result == null) result = caseConnectableElement(model);
				if (result == null) result = caseWiresElement(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.BASIC_DATA: {
				BasicData basicData = (BasicData)theEObject;
				T result = caseBasicData(basicData);
				if (result == null) result = caseTypedElement(basicData);
				if (result == null) result = caseConnectableElement(basicData);
				if (result == null) result = caseWiresElement(basicData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.COMPOSITE_TRANSFORMATION_TYPE: {
				CompositeTransformationType compositeTransformationType = (CompositeTransformationType)theEObject;
				T result = caseCompositeTransformationType(compositeTransformationType);
				if (result == null) result = caseTransformationType(compositeTransformationType);
				if (result == null) result = caseWiresSpecification(compositeTransformationType);
				if (result == null) result = caseType(compositeTransformationType);
				if (result == null) result = caseConnectableElement(compositeTransformationType);
				if (result == null) result = caseWiresElement(compositeTransformationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.COMPOSITE_TRANSFORMATION: {
				CompositeTransformation compositeTransformation = (CompositeTransformation)theEObject;
				T result = caseCompositeTransformation(compositeTransformation);
				if (result == null) result = caseTransformation(compositeTransformation);
				if (result == null) result = caseTypedElement(compositeTransformation);
				if (result == null) result = caseConnectableElement(compositeTransformation);
				if (result == null) result = caseWiresElement(compositeTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.BASIC_DATA_TYPE: {
				BasicDataType basicDataType = (BasicDataType)theEObject;
				T result = caseBasicDataType(basicDataType);
				if (result == null) result = caseDataType(basicDataType);
				if (result == null) result = caseType(basicDataType);
				if (result == null) result = caseConnectableElement(basicDataType);
				if (result == null) result = caseWiresElement(basicDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.WIRES_SPECIFICATION: {
				WiresSpecification wiresSpecification = (WiresSpecification)theEObject;
				T result = caseWiresSpecification(wiresSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.WIRES_ELEMENT: {
				WiresElement wiresElement = (WiresElement)theEObject;
				T result = caseWiresElement(wiresElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.LIBRARY_REF: {
				LibraryRef libraryRef = (LibraryRef)theEObject;
				T result = caseLibraryRef(libraryRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = caseWiresElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.INPUT_FORMAL_PARAMETER: {
				InputFormalParameter inputFormalParameter = (InputFormalParameter)theEObject;
				T result = caseInputFormalParameter(inputFormalParameter);
				if (result == null) result = caseFormalParameter(inputFormalParameter);
				if (result == null) result = caseType(inputFormalParameter);
				if (result == null) result = caseConnectableElement(inputFormalParameter);
				if (result == null) result = caseWiresElement(inputFormalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.OUTPUT_FORMAL_PARAMETER: {
				OutputFormalParameter outputFormalParameter = (OutputFormalParameter)theEObject;
				T result = caseOutputFormalParameter(outputFormalParameter);
				if (result == null) result = caseFormalParameter(outputFormalParameter);
				if (result == null) result = caseType(outputFormalParameter);
				if (result == null) result = caseConnectableElement(outputFormalParameter);
				if (result == null) result = caseWiresElement(outputFormalParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.INPUT_ACTUAL_PARAMETER: {
				InputActualParameter inputActualParameter = (InputActualParameter)theEObject;
				T result = caseInputActualParameter(inputActualParameter);
				if (result == null) result = caseActualParameter(inputActualParameter);
				if (result == null) result = caseTypedElement(inputActualParameter);
				if (result == null) result = caseConnectableElement(inputActualParameter);
				if (result == null) result = caseWiresElement(inputActualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.OUTPUT_ACTUAL_PARAMETER: {
				OutputActualParameter outputActualParameter = (OutputActualParameter)theEObject;
				T result = caseOutputActualParameter(outputActualParameter);
				if (result == null) result = caseActualParameter(outputActualParameter);
				if (result == null) result = caseTypedElement(outputActualParameter);
				if (result == null) result = caseConnectableElement(outputActualParameter);
				if (result == null) result = caseWiresElement(outputActualParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.ATOMIC_MODEL_TRANSFOMATION_TYPE: {
				AtomicModelTransfomationType atomicModelTransfomationType = (AtomicModelTransfomationType)theEObject;
				T result = caseAtomicModelTransfomationType(atomicModelTransfomationType);
				if (result == null) result = caseTransformationType(atomicModelTransfomationType);
				if (result == null) result = caseType(atomicModelTransfomationType);
				if (result == null) result = caseConnectableElement(atomicModelTransfomationType);
				if (result == null) result = caseWiresElement(atomicModelTransfomationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.IDENTITY_TRANSFORMATION: {
				IdentityTransformation identityTransformation = (IdentityTransformation)theEObject;
				T result = caseIdentityTransformation(identityTransformation);
				if (result == null) result = caseAtomicModelTransformation(identityTransformation);
				if (result == null) result = caseTransformation(identityTransformation);
				if (result == null) result = caseTypedElement(identityTransformation);
				if (result == null) result = caseConnectableElement(identityTransformation);
				if (result == null) result = caseWiresElement(identityTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.GENERIC_TRANSFORMATION: {
				GenericTransformation genericTransformation = (GenericTransformation)theEObject;
				T result = caseGenericTransformation(genericTransformation);
				if (result == null) result = caseAtomicModelTransformation(genericTransformation);
				if (result == null) result = caseTransformation(genericTransformation);
				if (result == null) result = caseTypedElement(genericTransformation);
				if (result == null) result = caseConnectableElement(genericTransformation);
				if (result == null) result = caseWiresElement(genericTransformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.TYPE_PARAMETER: {
				TypeParameter typeParameter = (TypeParameter)theEObject;
				T result = caseTypeParameter(typeParameter);
				if (result == null) result = caseActualParameter(typeParameter);
				if (result == null) result = caseTypedElement(typeParameter);
				if (result == null) result = caseConnectableElement(typeParameter);
				if (result == null) result = caseWiresElement(typeParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WiresPackage.GENERIC_QUERY: {
				GenericQuery genericQuery = (GenericQuery)theEObject;
				T result = caseGenericQuery(genericQuery);
				if (result == null) result = caseQuery(genericQuery);
				if (result == null) result = caseTransformation(genericQuery);
				if (result == null) result = caseTypedElement(genericQuery);
				if (result == null) result = caseConnectableElement(genericQuery);
				if (result == null) result = caseWiresElement(genericQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformation(Transformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuery(Query object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelTransformation(AtomicModelTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelType(ModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActualParameter(ActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionNode(DecisionNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataFlow(DataFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformationType(TransformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalParameter(FormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Query Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueryType(QueryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicData(BasicData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Transformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Transformation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTransformationType(CompositeTransformationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTransformation(CompositeTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicDataType(BasicDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiresSpecification(WiresSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWiresElement(WiresElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibraryRef(LibraryRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputFormalParameter(InputFormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Formal Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Formal Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFormalParameter(OutputFormalParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputActualParameter(InputActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Actual Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Actual Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputActualParameter(OutputActualParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Model Transfomation Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Model Transfomation Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicModelTransfomationType(AtomicModelTransfomationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identity Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identity Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentityTransformation(IdentityTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericTransformation(GenericTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeParameter(TypeParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Query</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Query</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericQuery(GenericQuery object) {
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

} //WiresSwitch
