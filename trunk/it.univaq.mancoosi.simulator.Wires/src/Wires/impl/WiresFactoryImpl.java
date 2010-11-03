/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package Wires.impl;

import Wires.*;

import org.eclipse.emf.ecore.EClass;
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
public class WiresFactoryImpl extends EFactoryImpl implements WiresFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiresFactory init() {
		try {
			WiresFactory theWiresFactory = (WiresFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lcc.uma.es/Wires/1.0"); 
			if (theWiresFactory != null) {
				return theWiresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiresFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresFactoryImpl() {
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
			case WiresPackage.QUERY: return createQuery();
			case WiresPackage.ATOMIC_MODEL_TRANSFORMATION: return createAtomicModelTransformation();
			case WiresPackage.MODEL_TYPE: return createModelType();
			case WiresPackage.DECISION_NODE: return createDecisionNode();
			case WiresPackage.DATA_FLOW: return createDataFlow();
			case WiresPackage.QUERY_TYPE: return createQueryType();
			case WiresPackage.MODEL: return createModel();
			case WiresPackage.BASIC_DATA: return createBasicData();
			case WiresPackage.COMPOSITE_TRANSFORMATION_TYPE: return createCompositeTransformationType();
			case WiresPackage.COMPOSITE_TRANSFORMATION: return createCompositeTransformation();
			case WiresPackage.BASIC_DATA_TYPE: return createBasicDataType();
			case WiresPackage.WIRES_SPECIFICATION: return createWiresSpecification();
			case WiresPackage.LIBRARY_REF: return createLibraryRef();
			case WiresPackage.LIBRARY: return createLibrary();
			case WiresPackage.INPUT_FORMAL_PARAMETER: return createInputFormalParameter();
			case WiresPackage.OUTPUT_FORMAL_PARAMETER: return createOutputFormalParameter();
			case WiresPackage.INPUT_ACTUAL_PARAMETER: return createInputActualParameter();
			case WiresPackage.OUTPUT_ACTUAL_PARAMETER: return createOutputActualParameter();
			case WiresPackage.ATOMIC_MODEL_TRANSFOMATION_TYPE: return createAtomicModelTransfomationType();
			case WiresPackage.IDENTITY_TRANSFORMATION: return createIdentityTransformation();
			case WiresPackage.GENERIC_TRANSFORMATION: return createGenericTransformation();
			case WiresPackage.TYPE_PARAMETER: return createTypeParameter();
			case WiresPackage.GENERIC_QUERY: return createGenericQuery();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query createQuery() {
		QueryImpl query = new QueryImpl();
		return query;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelTransformation createAtomicModelTransformation() {
		AtomicModelTransformationImpl atomicModelTransformation = new AtomicModelTransformationImpl();
		return atomicModelTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionNode createDecisionNode() {
		DecisionNodeImpl decisionNode = new DecisionNodeImpl();
		return decisionNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataFlow createDataFlow() {
		DataFlowImpl dataFlow = new DataFlowImpl();
		return dataFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType createQueryType() {
		QueryTypeImpl queryType = new QueryTypeImpl();
		return queryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicData createBasicData() {
		BasicDataImpl basicData = new BasicDataImpl();
		return basicData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTransformationType createCompositeTransformationType() {
		CompositeTransformationTypeImpl compositeTransformationType = new CompositeTransformationTypeImpl();
		return compositeTransformationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTransformation createCompositeTransformation() {
		CompositeTransformationImpl compositeTransformation = new CompositeTransformationImpl();
		return compositeTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType createBasicDataType() {
		BasicDataTypeImpl basicDataType = new BasicDataTypeImpl();
		return basicDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresSpecification createWiresSpecification() {
		WiresSpecificationImpl wiresSpecification = new WiresSpecificationImpl();
		return wiresSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryRef createLibraryRef() {
		LibraryRefImpl libraryRef = new LibraryRefImpl();
		return libraryRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFormalParameter createInputFormalParameter() {
		InputFormalParameterImpl inputFormalParameter = new InputFormalParameterImpl();
		return inputFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFormalParameter createOutputFormalParameter() {
		OutputFormalParameterImpl outputFormalParameter = new OutputFormalParameterImpl();
		return outputFormalParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputActualParameter createInputActualParameter() {
		InputActualParameterImpl inputActualParameter = new InputActualParameterImpl();
		return inputActualParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputActualParameter createOutputActualParameter() {
		OutputActualParameterImpl outputActualParameter = new OutputActualParameterImpl();
		return outputActualParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicModelTransfomationType createAtomicModelTransfomationType() {
		AtomicModelTransfomationTypeImpl atomicModelTransfomationType = new AtomicModelTransfomationTypeImpl();
		return atomicModelTransfomationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentityTransformation createIdentityTransformation() {
		IdentityTransformationImpl identityTransformation = new IdentityTransformationImpl();
		return identityTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericTransformation createGenericTransformation() {
		GenericTransformationImpl genericTransformation = new GenericTransformationImpl();
		return genericTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeParameter createTypeParameter() {
		TypeParameterImpl typeParameter = new TypeParameterImpl();
		return typeParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericQuery createGenericQuery() {
		GenericQueryImpl genericQuery = new GenericQueryImpl();
		return genericQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiresPackage getWiresPackage() {
		return (WiresPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiresPackage getPackage() {
		return WiresPackage.eINSTANCE;
	}

} //WiresFactoryImpl
