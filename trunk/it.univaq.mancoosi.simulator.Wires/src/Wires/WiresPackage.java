package Wires;

import Wires.impl.WiresPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public abstract interface WiresPackage extends EPackage {
	public static final String eNAME = "Wires";
	public static final String eNS_URI = "http://www.lcc.uma.es/Wires/1.0";
	public static final String eNS_PREFIX = "Wires";
	public static final WiresPackage eINSTANCE = WiresPackageImpl.init();
	int WIRES_ELEMENT = 20;

/**
 * The number of structural features of the '<em>Element</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int WIRES_ELEMENT_FEATURE_COUNT = 0;

/**
 * The meta object id for the '{@link Wires.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.ConnectableElementImpl
 * @see Wires.impl.WiresPackageImpl#getConnectableElement()
 * @generated
 */
int CONNECTABLE_ELEMENT = 13;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int CONNECTABLE_ELEMENT__INCOMING = WIRES_ELEMENT_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int CONNECTABLE_ELEMENT__OUTGOING = WIRES_ELEMENT_FEATURE_COUNT + 1;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int CONNECTABLE_ELEMENT__NAME = WIRES_ELEMENT_FEATURE_COUNT + 2;

/**
 * The number of structural features of the '<em>Connectable Element</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int CONNECTABLE_ELEMENT_FEATURE_COUNT = WIRES_ELEMENT_FEATURE_COUNT + 3;

/**
 * The meta object id for the '{@link Wires.impl.TypedElementImpl <em>Typed Element</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.TypedElementImpl
 * @see Wires.impl.WiresPackageImpl#getTypedElement()
 * @generated
 */
int TYPED_ELEMENT = 3;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPED_ELEMENT__INCOMING = CONNECTABLE_ELEMENT__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPED_ELEMENT__OUTGOING = CONNECTABLE_ELEMENT__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPED_ELEMENT__NAME = CONNECTABLE_ELEMENT__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPED_ELEMENT__TYPE = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Typed Element</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPED_ELEMENT_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.TransformationImpl <em>Transformation</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.TransformationImpl
 * @see Wires.impl.WiresPackageImpl#getTransformation()
 * @generated
 */
int TRANSFORMATION = 0;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__INCOMING = TYPED_ELEMENT__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__OUTGOING = TYPED_ELEMENT__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__NAME = TYPED_ELEMENT__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__TYPE = TYPED_ELEMENT__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__IN_PARAMS = TYPED_ELEMENT_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__OUT_PARAMS = TYPED_ELEMENT_FEATURE_COUNT + 1;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION__CONTROL_NODE = TYPED_ELEMENT_FEATURE_COUNT + 2;

/**
 * The number of structural features of the '<em>Transformation</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 3;

/**
 * The meta object id for the '{@link Wires.impl.QueryImpl <em>Query</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.QueryImpl
 * @see Wires.impl.WiresPackageImpl#getQuery()
 * @generated
 */
int QUERY = 1;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__INCOMING = TRANSFORMATION__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__OUTGOING = TRANSFORMATION__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__NAME = TRANSFORMATION__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__TYPE = TRANSFORMATION__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__IN_PARAMS = TRANSFORMATION__IN_PARAMS;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__OUT_PARAMS = TRANSFORMATION__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY__CONTROL_NODE = TRANSFORMATION__CONTROL_NODE;

/**
 * The number of structural features of the '<em>Query</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.AtomicModelTransformationImpl <em>Atomic Model Transformation</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.AtomicModelTransformationImpl
 * @see Wires.impl.WiresPackageImpl#getAtomicModelTransformation()
 * @generated
 */
int ATOMIC_MODEL_TRANSFORMATION = 2;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__INCOMING = TRANSFORMATION__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__OUTGOING = TRANSFORMATION__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__TYPE = TRANSFORMATION__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__IN_PARAMS = TRANSFORMATION__IN_PARAMS;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__OUT_PARAMS = TRANSFORMATION__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION__CONTROL_NODE = TRANSFORMATION__CONTROL_NODE;

/**
 * The number of structural features of the '<em>Atomic Model Transformation</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.TypeImpl <em>Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.TypeImpl
 * @see Wires.impl.WiresPackageImpl#getType()
 * @generated
 */
int TYPE = 4;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE__INCOMING = CONNECTABLE_ELEMENT__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE__OUTGOING = CONNECTABLE_ELEMENT__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE__NAME = CONNECTABLE_ELEMENT__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE__PATH = CONNECTABLE_ELEMENT_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE_FEATURE_COUNT = CONNECTABLE_ELEMENT_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.DataTypeImpl <em>Data Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.DataTypeImpl
 * @see Wires.impl.WiresPackageImpl#getDataType()
 * @generated
 */
int DATA_TYPE = 6;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_TYPE__INCOMING = TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_TYPE__OUTGOING = TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_TYPE__NAME = TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_TYPE__PATH = TYPE__PATH;

/**
 * The number of structural features of the '<em>Data Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.ModelTypeImpl <em>Model Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.ModelTypeImpl
 * @see Wires.impl.WiresPackageImpl#getModelType()
 * @generated
 */
int MODEL_TYPE = 5;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_TYPE__INCOMING = DATA_TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_TYPE__OUTGOING = DATA_TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_TYPE__NAME = DATA_TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_TYPE__PATH = DATA_TYPE__PATH;

/**
 * The feature id for the '<em><b>Uri</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_TYPE__URI = DATA_TYPE_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Model Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.ActualParameterImpl
 * @see Wires.impl.WiresPackageImpl#getActualParameter()
 * @generated
 */
int ACTUAL_PARAMETER = 7;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ACTUAL_PARAMETER__INCOMING = TYPED_ELEMENT__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ACTUAL_PARAMETER__OUTGOING = TYPED_ELEMENT__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ACTUAL_PARAMETER__NAME = TYPED_ELEMENT__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ACTUAL_PARAMETER__TYPE = TYPED_ELEMENT__TYPE;

/**
 * The number of structural features of the '<em>Actual Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ACTUAL_PARAMETER_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.DecisionNodeImpl
 * @see Wires.impl.WiresPackageImpl#getDecisionNode()
 * @generated
 */
int DECISION_NODE = 8;

/**
 * The feature id for the '<em><b>True Branch</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DECISION_NODE__TRUE_BRANCH = WIRES_ELEMENT_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>False Branch</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DECISION_NODE__FALSE_BRANCH = WIRES_ELEMENT_FEATURE_COUNT + 1;

/**
 * The feature id for the '<em><b>Expression</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DECISION_NODE__EXPRESSION = WIRES_ELEMENT_FEATURE_COUNT + 2;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DECISION_NODE__IN_PARAMS = WIRES_ELEMENT_FEATURE_COUNT + 3;

/**
 * The number of structural features of the '<em>Decision Node</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DECISION_NODE_FEATURE_COUNT = WIRES_ELEMENT_FEATURE_COUNT + 4;

/**
 * The meta object id for the '{@link Wires.impl.DataFlowImpl <em>Data Flow</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.DataFlowImpl
 * @see Wires.impl.WiresPackageImpl#getDataFlow()
 * @generated
 */
int DATA_FLOW = 9;

/**
 * The feature id for the '<em><b>Target</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_FLOW__TARGET = WIRES_ELEMENT_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>Src</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_FLOW__SRC = WIRES_ELEMENT_FEATURE_COUNT + 1;

/**
 * The number of structural features of the '<em>Data Flow</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int DATA_FLOW_FEATURE_COUNT = WIRES_ELEMENT_FEATURE_COUNT + 2;

/**
 * The meta object id for the '{@link Wires.impl.TransformationTypeImpl <em>Transformation Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.TransformationTypeImpl
 * @see Wires.impl.WiresPackageImpl#getTransformationType()
 * @generated
 */
int TRANSFORMATION_TYPE = 10;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__INCOMING = TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__OUTGOING = TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__NAME = TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__PATH = TYPE__PATH;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__OUT_PARAMS = TYPE_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__LIBRARIES = TYPE_FEATURE_COUNT + 1;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE__IN_PARAMS = TYPE_FEATURE_COUNT + 2;

/**
 * The number of structural features of the '<em>Transformation Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TRANSFORMATION_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 3;

/**
 * The meta object id for the '{@link Wires.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.FormalParameterImpl
 * @see Wires.impl.WiresPackageImpl#getFormalParameter()
 * @generated
 */
int FORMAL_PARAMETER = 11;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER__INCOMING = TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER__OUTGOING = TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER__NAME = TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER__PATH = TYPE__PATH;

/**
 * The feature id for the '<em><b>Type El</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER__TYPE_EL = TYPE_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>Type Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER__TYPE_NAME = TYPE_FEATURE_COUNT + 1;

/**
 * The number of structural features of the '<em>Formal Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int FORMAL_PARAMETER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

/**
 * The meta object id for the '{@link Wires.impl.QueryTypeImpl <em>Query Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.QueryTypeImpl
 * @see Wires.impl.WiresPackageImpl#getQueryType()
 * @generated
 */
int QUERY_TYPE = 12;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__INCOMING = TRANSFORMATION_TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__OUTGOING = TRANSFORMATION_TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__NAME = TRANSFORMATION_TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__PATH = TRANSFORMATION_TYPE__PATH;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__OUT_PARAMS = TRANSFORMATION_TYPE__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__LIBRARIES = TRANSFORMATION_TYPE__LIBRARIES;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE__IN_PARAMS = TRANSFORMATION_TYPE__IN_PARAMS;

/**
 * The number of structural features of the '<em>Query Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int QUERY_TYPE_FEATURE_COUNT = TRANSFORMATION_TYPE_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.ModelImpl <em>Model</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.ModelImpl
 * @see Wires.impl.WiresPackageImpl#getModel()
 * @generated
 */
int MODEL = 14;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL__INCOMING = TYPED_ELEMENT__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL__OUTGOING = TYPED_ELEMENT__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL__NAME = TYPED_ELEMENT__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL__TYPE = TYPED_ELEMENT__TYPE;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL__PATH = TYPED_ELEMENT_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Model</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int MODEL_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.BasicDataImpl <em>Basic Data</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.BasicDataImpl
 * @see Wires.impl.WiresPackageImpl#getBasicData()
 * @generated
 */
int BASIC_DATA = 15;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA__INCOMING = TYPED_ELEMENT__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA__OUTGOING = TYPED_ELEMENT__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA__NAME = TYPED_ELEMENT__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA__TYPE = TYPED_ELEMENT__TYPE;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA__PATH = TYPED_ELEMENT_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Basic Data</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.CompositeTransformationTypeImpl <em>Composite Transformation Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.CompositeTransformationTypeImpl
 * @see Wires.impl.WiresPackageImpl#getCompositeTransformationType()
 * @generated
 */
int COMPOSITE_TRANSFORMATION_TYPE = 16;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__INCOMING = TRANSFORMATION_TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__OUTGOING = TRANSFORMATION_TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__NAME = TRANSFORMATION_TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__PATH = TRANSFORMATION_TYPE__PATH;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__OUT_PARAMS = TRANSFORMATION_TYPE__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__LIBRARIES = TRANSFORMATION_TYPE__LIBRARIES;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__IN_PARAMS = TRANSFORMATION_TYPE__IN_PARAMS;

/**
 * The feature id for the '<em><b>Els</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE__ELS = TRANSFORMATION_TYPE_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Composite Transformation Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_TYPE_FEATURE_COUNT = TRANSFORMATION_TYPE_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.CompositeTransformationImpl <em>Composite Transformation</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.CompositeTransformationImpl
 * @see Wires.impl.WiresPackageImpl#getCompositeTransformation()
 * @generated
 */
int COMPOSITE_TRANSFORMATION = 17;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__INCOMING = TRANSFORMATION__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__OUTGOING = TRANSFORMATION__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__NAME = TRANSFORMATION__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__TYPE = TRANSFORMATION__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__IN_PARAMS = TRANSFORMATION__IN_PARAMS;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__OUT_PARAMS = TRANSFORMATION__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION__CONTROL_NODE = TRANSFORMATION__CONTROL_NODE;

/**
 * The number of structural features of the '<em>Composite Transformation</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int COMPOSITE_TRANSFORMATION_FEATURE_COUNT = TRANSFORMATION_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.BasicDataTypeImpl <em>Basic Data Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.BasicDataTypeImpl
 * @see Wires.impl.WiresPackageImpl#getBasicDataType()
 * @generated
 */
int BASIC_DATA_TYPE = 18;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA_TYPE__INCOMING = DATA_TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA_TYPE__OUTGOING = DATA_TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA_TYPE__NAME = DATA_TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA_TYPE__PATH = DATA_TYPE__PATH;

/**
 * The number of structural features of the '<em>Basic Data Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int BASIC_DATA_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.WiresSpecificationImpl <em>Specification</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.WiresSpecificationImpl
 * @see Wires.impl.WiresPackageImpl#getWiresSpecification()
 * @generated
 */
int WIRES_SPECIFICATION = 19;

/**
 * The feature id for the '<em><b>Els</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int WIRES_SPECIFICATION__ELS = 0;

/**
 * The number of structural features of the '<em>Specification</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int WIRES_SPECIFICATION_FEATURE_COUNT = 1;

/**
 * The meta object id for the '{@link Wires.impl.LibraryRefImpl <em>Library Ref</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.LibraryRefImpl
 * @see Wires.impl.WiresPackageImpl#getLibraryRef()
 * @generated
 */
int LIBRARY_REF = 21;

/**
 * The feature id for the '<em><b>Library</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY_REF__LIBRARY = 0;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY_REF__NAME = 1;

/**
 * The number of structural features of the '<em>Library Ref</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY_REF_FEATURE_COUNT = 2;

/**
 * The meta object id for the '{@link Wires.impl.LibraryImpl <em>Library</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.LibraryImpl
 * @see Wires.impl.WiresPackageImpl#getLibrary()
 * @generated
 */
int LIBRARY = 22;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY__NAME = WIRES_ELEMENT_FEATURE_COUNT + 0;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY__PATH = WIRES_ELEMENT_FEATURE_COUNT + 1;

/**
 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY__LIBRARIES = WIRES_ELEMENT_FEATURE_COUNT + 2;

/**
 * The number of structural features of the '<em>Library</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int LIBRARY_FEATURE_COUNT = WIRES_ELEMENT_FEATURE_COUNT + 3;

/**
 * The meta object id for the '{@link Wires.impl.InputFormalParameterImpl <em>Input Formal Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.InputFormalParameterImpl
 * @see Wires.impl.WiresPackageImpl#getInputFormalParameter()
 * @generated
 */
int INPUT_FORMAL_PARAMETER = 23;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER__INCOMING = FORMAL_PARAMETER__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER__OUTGOING = FORMAL_PARAMETER__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER__NAME = FORMAL_PARAMETER__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER__PATH = FORMAL_PARAMETER__PATH;

/**
 * The feature id for the '<em><b>Type El</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER__TYPE_EL = FORMAL_PARAMETER__TYPE_EL;

/**
 * The feature id for the '<em><b>Type Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER__TYPE_NAME = FORMAL_PARAMETER__TYPE_NAME;

/**
 * The number of structural features of the '<em>Input Formal Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_FORMAL_PARAMETER_FEATURE_COUNT = FORMAL_PARAMETER_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.OutputFormalParameterImpl <em>Output Formal Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.OutputFormalParameterImpl
 * @see Wires.impl.WiresPackageImpl#getOutputFormalParameter()
 * @generated
 */
int OUTPUT_FORMAL_PARAMETER = 24;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER__INCOMING = FORMAL_PARAMETER__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER__OUTGOING = FORMAL_PARAMETER__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER__NAME = FORMAL_PARAMETER__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER__PATH = FORMAL_PARAMETER__PATH;

/**
 * The feature id for the '<em><b>Type El</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER__TYPE_EL = FORMAL_PARAMETER__TYPE_EL;

/**
 * The feature id for the '<em><b>Type Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER__TYPE_NAME = FORMAL_PARAMETER__TYPE_NAME;

/**
 * The number of structural features of the '<em>Output Formal Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_FORMAL_PARAMETER_FEATURE_COUNT = FORMAL_PARAMETER_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.InputActualParameterImpl <em>Input Actual Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.InputActualParameterImpl
 * @see Wires.impl.WiresPackageImpl#getInputActualParameter()
 * @generated
 */
int INPUT_ACTUAL_PARAMETER = 25;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_ACTUAL_PARAMETER__INCOMING = ACTUAL_PARAMETER__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_ACTUAL_PARAMETER__OUTGOING = ACTUAL_PARAMETER__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_ACTUAL_PARAMETER__NAME = ACTUAL_PARAMETER__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_ACTUAL_PARAMETER__TYPE = ACTUAL_PARAMETER__TYPE;

/**
 * The number of structural features of the '<em>Input Actual Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int INPUT_ACTUAL_PARAMETER_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.OutputActualParameterImpl <em>Output Actual Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.OutputActualParameterImpl
 * @see Wires.impl.WiresPackageImpl#getOutputActualParameter()
 * @generated
 */
int OUTPUT_ACTUAL_PARAMETER = 26;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_ACTUAL_PARAMETER__INCOMING = ACTUAL_PARAMETER__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_ACTUAL_PARAMETER__OUTGOING = ACTUAL_PARAMETER__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_ACTUAL_PARAMETER__NAME = ACTUAL_PARAMETER__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_ACTUAL_PARAMETER__TYPE = ACTUAL_PARAMETER__TYPE;

/**
 * The number of structural features of the '<em>Output Actual Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int OUTPUT_ACTUAL_PARAMETER_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.AtomicModelTransfomationTypeImpl <em>Atomic Model Transfomation Type</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.AtomicModelTransfomationTypeImpl
 * @see Wires.impl.WiresPackageImpl#getAtomicModelTransfomationType()
 * @generated
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE = 27;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__INCOMING = TRANSFORMATION_TYPE__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__OUTGOING = TRANSFORMATION_TYPE__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__NAME = TRANSFORMATION_TYPE__NAME;

/**
 * The feature id for the '<em><b>Path</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__PATH = TRANSFORMATION_TYPE__PATH;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__OUT_PARAMS = TRANSFORMATION_TYPE__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Libraries</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__LIBRARIES = TRANSFORMATION_TYPE__LIBRARIES;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE__IN_PARAMS = TRANSFORMATION_TYPE__IN_PARAMS;

/**
 * The number of structural features of the '<em>Atomic Model Transfomation Type</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int ATOMIC_MODEL_TRANSFOMATION_TYPE_FEATURE_COUNT = TRANSFORMATION_TYPE_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.IdentityTransformationImpl <em>Identity Transformation</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.IdentityTransformationImpl
 * @see Wires.impl.WiresPackageImpl#getIdentityTransformation()
 * @generated
 */
int IDENTITY_TRANSFORMATION = 28;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__INCOMING = ATOMIC_MODEL_TRANSFORMATION__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__OUTGOING = ATOMIC_MODEL_TRANSFORMATION__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__NAME = ATOMIC_MODEL_TRANSFORMATION__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__TYPE = ATOMIC_MODEL_TRANSFORMATION__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__IN_PARAMS = ATOMIC_MODEL_TRANSFORMATION__IN_PARAMS;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__OUT_PARAMS = ATOMIC_MODEL_TRANSFORMATION__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION__CONTROL_NODE = ATOMIC_MODEL_TRANSFORMATION__CONTROL_NODE;

/**
 * The number of structural features of the '<em>Identity Transformation</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int IDENTITY_TRANSFORMATION_FEATURE_COUNT = ATOMIC_MODEL_TRANSFORMATION_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.GenericTransformationImpl <em>Generic Transformation</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.GenericTransformationImpl
 * @see Wires.impl.WiresPackageImpl#getGenericTransformation()
 * @generated
 */
int GENERIC_TRANSFORMATION = 29;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__INCOMING = ATOMIC_MODEL_TRANSFORMATION__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__OUTGOING = ATOMIC_MODEL_TRANSFORMATION__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__NAME = ATOMIC_MODEL_TRANSFORMATION__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__TYPE = ATOMIC_MODEL_TRANSFORMATION__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__IN_PARAMS = ATOMIC_MODEL_TRANSFORMATION__IN_PARAMS;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__OUT_PARAMS = ATOMIC_MODEL_TRANSFORMATION__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__CONTROL_NODE = ATOMIC_MODEL_TRANSFORMATION__CONTROL_NODE;

/**
 * The feature id for the '<em><b>Type Param</b></em>' containment reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION__TYPE_PARAM = ATOMIC_MODEL_TRANSFORMATION_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Generic Transformation</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_TRANSFORMATION_FEATURE_COUNT = ATOMIC_MODEL_TRANSFORMATION_FEATURE_COUNT + 1;

/**
 * The meta object id for the '{@link Wires.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.TypeParameterImpl
 * @see Wires.impl.WiresPackageImpl#getTypeParameter()
 * @generated
 */
int TYPE_PARAMETER = 30;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE_PARAMETER__INCOMING = ACTUAL_PARAMETER__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE_PARAMETER__OUTGOING = ACTUAL_PARAMETER__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE_PARAMETER__NAME = ACTUAL_PARAMETER__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE_PARAMETER__TYPE = ACTUAL_PARAMETER__TYPE;

/**
 * The number of structural features of the '<em>Type Parameter</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int TYPE_PARAMETER_FEATURE_COUNT = ACTUAL_PARAMETER_FEATURE_COUNT + 0;

/**
 * The meta object id for the '{@link Wires.impl.GenericQueryImpl <em>Generic Query</em>}' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @see Wires.impl.GenericQueryImpl
 * @see Wires.impl.WiresPackageImpl#getGenericQuery()
 * @generated
 */
int GENERIC_QUERY = 31;

/**
 * The feature id for the '<em><b>Incoming</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__INCOMING = QUERY__INCOMING;

/**
 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__OUTGOING = QUERY__OUTGOING;

/**
 * The feature id for the '<em><b>Name</b></em>' attribute.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__NAME = QUERY__NAME;

/**
 * The feature id for the '<em><b>Type</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__TYPE = QUERY__TYPE;

/**
 * The feature id for the '<em><b>In Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__IN_PARAMS = QUERY__IN_PARAMS;

/**
 * The feature id for the '<em><b>Out Params</b></em>' containment reference list.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__OUT_PARAMS = QUERY__OUT_PARAMS;

/**
 * The feature id for the '<em><b>Control Node</b></em>' reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__CONTROL_NODE = QUERY__CONTROL_NODE;

/**
 * The feature id for the '<em><b>Type Param</b></em>' containment reference.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY__TYPE_PARAM = QUERY_FEATURE_COUNT + 0;

/**
 * The number of structural features of the '<em>Generic Query</em>' class.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 * @ordered
 */
int GENERIC_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 1;


/**
 * Returns the meta object for class '{@link Wires.Transformation <em>Transformation</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Transformation</em>'.
 * @see Wires.Transformation
 * @generated
 */
EClass getTransformation();

/**
 * Returns the meta object for the containment reference list '{@link Wires.Transformation#getInParams <em>In Params</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>In Params</em>'.
 * @see Wires.Transformation#getInParams()
 * @see #getTransformation()
 * @generated
 */
EReference getTransformation_InParams();

/**
 * Returns the meta object for the containment reference list '{@link Wires.Transformation#getOutParams <em>Out Params</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>Out Params</em>'.
 * @see Wires.Transformation#getOutParams()
 * @see #getTransformation()
 * @generated
 */
EReference getTransformation_OutParams();

/**
 * Returns the meta object for the reference '{@link Wires.Transformation#getControlNode <em>Control Node</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference '<em>Control Node</em>'.
 * @see Wires.Transformation#getControlNode()
 * @see #getTransformation()
 * @generated
 */
EReference getTransformation_ControlNode();

/**
 * Returns the meta object for class '{@link Wires.Query <em>Query</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Query</em>'.
 * @see Wires.Query
 * @generated
 */
EClass getQuery();

/**
 * Returns the meta object for class '{@link Wires.AtomicModelTransformation <em>Atomic Model Transformation</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Atomic Model Transformation</em>'.
 * @see Wires.AtomicModelTransformation
 * @generated
 */
EClass getAtomicModelTransformation();

/**
 * Returns the meta object for class '{@link Wires.TypedElement <em>Typed Element</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Typed Element</em>'.
 * @see Wires.TypedElement
 * @generated
 */
EClass getTypedElement();

/**
 * Returns the meta object for the reference '{@link Wires.TypedElement#getType <em>Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference '<em>Type</em>'.
 * @see Wires.TypedElement#getType()
 * @see #getTypedElement()
 * @generated
 */
EReference getTypedElement_Type();

/**
 * Returns the meta object for class '{@link Wires.Type <em>Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Type</em>'.
 * @see Wires.Type
 * @generated
 */
EClass getType();

/**
 * Returns the meta object for the attribute '{@link Wires.Type#getPath <em>Path</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Path</em>'.
 * @see Wires.Type#getPath()
 * @see #getType()
 * @generated
 */
EAttribute getType_Path();

/**
 * Returns the meta object for class '{@link Wires.ModelType <em>Model Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Model Type</em>'.
 * @see Wires.ModelType
 * @generated
 */
EClass getModelType();

/**
 * Returns the meta object for the attribute '{@link Wires.ModelType#getUri <em>Uri</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Uri</em>'.
 * @see Wires.ModelType#getUri()
 * @see #getModelType()
 * @generated
 */
EAttribute getModelType_Uri();

/**
 * Returns the meta object for class '{@link Wires.DataType <em>Data Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Data Type</em>'.
 * @see Wires.DataType
 * @generated
 */
EClass getDataType();

/**
 * Returns the meta object for class '{@link Wires.ActualParameter <em>Actual Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Actual Parameter</em>'.
 * @see Wires.ActualParameter
 * @generated
 */
EClass getActualParameter();

/**
 * Returns the meta object for class '{@link Wires.DecisionNode <em>Decision Node</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Decision Node</em>'.
 * @see Wires.DecisionNode
 * @generated
 */
EClass getDecisionNode();

/**
 * Returns the meta object for the reference list '{@link Wires.DecisionNode#getTrueBranch <em>True Branch</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference list '<em>True Branch</em>'.
 * @see Wires.DecisionNode#getTrueBranch()
 * @see #getDecisionNode()
 * @generated
 */
EReference getDecisionNode_TrueBranch();

/**
 * Returns the meta object for the reference list '{@link Wires.DecisionNode#getFalseBranch <em>False Branch</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference list '<em>False Branch</em>'.
 * @see Wires.DecisionNode#getFalseBranch()
 * @see #getDecisionNode()
 * @generated
 */
EReference getDecisionNode_FalseBranch();

/**
 * Returns the meta object for the attribute '{@link Wires.DecisionNode#getExpression <em>Expression</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Expression</em>'.
 * @see Wires.DecisionNode#getExpression()
 * @see #getDecisionNode()
 * @generated
 */
EAttribute getDecisionNode_Expression();

/**
 * Returns the meta object for the containment reference list '{@link Wires.DecisionNode#getInParams <em>In Params</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>In Params</em>'.
 * @see Wires.DecisionNode#getInParams()
 * @see #getDecisionNode()
 * @generated
 */
EReference getDecisionNode_InParams();

/**
 * Returns the meta object for class '{@link Wires.DataFlow <em>Data Flow</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Data Flow</em>'.
 * @see Wires.DataFlow
 * @generated
 */
EClass getDataFlow();

/**
 * Returns the meta object for the reference '{@link Wires.DataFlow#getTarget <em>Target</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference '<em>Target</em>'.
 * @see Wires.DataFlow#getTarget()
 * @see #getDataFlow()
 * @generated
 */
EReference getDataFlow_Target();

/**
 * Returns the meta object for the reference '{@link Wires.DataFlow#getSrc <em>Src</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference '<em>Src</em>'.
 * @see Wires.DataFlow#getSrc()
 * @see #getDataFlow()
 * @generated
 */
EReference getDataFlow_Src();

/**
 * Returns the meta object for class '{@link Wires.TransformationType <em>Transformation Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Transformation Type</em>'.
 * @see Wires.TransformationType
 * @generated
 */
EClass getTransformationType();

/**
 * Returns the meta object for the containment reference list '{@link Wires.TransformationType#getOutParams <em>Out Params</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>Out Params</em>'.
 * @see Wires.TransformationType#getOutParams()
 * @see #getTransformationType()
 * @generated
 */
EReference getTransformationType_OutParams();

/**
 * Returns the meta object for the containment reference list '{@link Wires.TransformationType#getLibraries <em>Libraries</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>Libraries</em>'.
 * @see Wires.TransformationType#getLibraries()
 * @see #getTransformationType()
 * @generated
 */
EReference getTransformationType_Libraries();

/**
 * Returns the meta object for the containment reference list '{@link Wires.TransformationType#getInParams <em>In Params</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>In Params</em>'.
 * @see Wires.TransformationType#getInParams()
 * @see #getTransformationType()
 * @generated
 */
EReference getTransformationType_InParams();

/**
 * Returns the meta object for class '{@link Wires.FormalParameter <em>Formal Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Formal Parameter</em>'.
 * @see Wires.FormalParameter
 * @generated
 */
EClass getFormalParameter();

/**
 * Returns the meta object for the reference '{@link Wires.FormalParameter#getTypeEl <em>Type El</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference '<em>Type El</em>'.
 * @see Wires.FormalParameter#getTypeEl()
 * @see #getFormalParameter()
 * @generated
 */
EReference getFormalParameter_TypeEl();

/**
 * Returns the meta object for the attribute '{@link Wires.FormalParameter#getTypeName <em>Type Name</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Type Name</em>'.
 * @see Wires.FormalParameter#getTypeName()
 * @see #getFormalParameter()
 * @generated
 */
EAttribute getFormalParameter_TypeName();

/**
 * Returns the meta object for class '{@link Wires.QueryType <em>Query Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Query Type</em>'.
 * @see Wires.QueryType
 * @generated
 */
EClass getQueryType();

/**
 * Returns the meta object for class '{@link Wires.ConnectableElement <em>Connectable Element</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Connectable Element</em>'.
 * @see Wires.ConnectableElement
 * @generated
 */
EClass getConnectableElement();

/**
 * Returns the meta object for the reference list '{@link Wires.ConnectableElement#getIncoming <em>Incoming</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference list '<em>Incoming</em>'.
 * @see Wires.ConnectableElement#getIncoming()
 * @see #getConnectableElement()
 * @generated
 */
EReference getConnectableElement_Incoming();

/**
 * Returns the meta object for the reference list '{@link Wires.ConnectableElement#getOutgoing <em>Outgoing</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference list '<em>Outgoing</em>'.
 * @see Wires.ConnectableElement#getOutgoing()
 * @see #getConnectableElement()
 * @generated
 */
EReference getConnectableElement_Outgoing();

/**
 * Returns the meta object for the attribute '{@link Wires.ConnectableElement#getName <em>Name</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Name</em>'.
 * @see Wires.ConnectableElement#getName()
 * @see #getConnectableElement()
 * @generated
 */
EAttribute getConnectableElement_Name();

/**
 * Returns the meta object for class '{@link Wires.Model <em>Model</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Model</em>'.
 * @see Wires.Model
 * @generated
 */
EClass getModel();

/**
 * Returns the meta object for the attribute '{@link Wires.Model#getPath <em>Path</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Path</em>'.
 * @see Wires.Model#getPath()
 * @see #getModel()
 * @generated
 */
EAttribute getModel_Path();

/**
 * Returns the meta object for class '{@link Wires.BasicData <em>Basic Data</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Basic Data</em>'.
 * @see Wires.BasicData
 * @generated
 */
EClass getBasicData();

/**
 * Returns the meta object for the attribute '{@link Wires.BasicData#getPath <em>Path</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Path</em>'.
 * @see Wires.BasicData#getPath()
 * @see #getBasicData()
 * @generated
 */
EAttribute getBasicData_Path();

/**
 * Returns the meta object for class '{@link Wires.CompositeTransformationType <em>Composite Transformation Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Composite Transformation Type</em>'.
 * @see Wires.CompositeTransformationType
 * @generated
 */
EClass getCompositeTransformationType();

/**
 * Returns the meta object for class '{@link Wires.CompositeTransformation <em>Composite Transformation</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Composite Transformation</em>'.
 * @see Wires.CompositeTransformation
 * @generated
 */
EClass getCompositeTransformation();

/**
 * Returns the meta object for class '{@link Wires.BasicDataType <em>Basic Data Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Basic Data Type</em>'.
 * @see Wires.BasicDataType
 * @generated
 */
EClass getBasicDataType();

/**
 * Returns the meta object for class '{@link Wires.WiresSpecification <em>Specification</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Specification</em>'.
 * @see Wires.WiresSpecification
 * @generated
 */
EClass getWiresSpecification();

/**
 * Returns the meta object for the containment reference list '{@link Wires.WiresSpecification#getEls <em>Els</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>Els</em>'.
 * @see Wires.WiresSpecification#getEls()
 * @see #getWiresSpecification()
 * @generated
 */
EReference getWiresSpecification_Els();

/**
 * Returns the meta object for class '{@link Wires.WiresElement <em>Element</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Element</em>'.
 * @see Wires.WiresElement
 * @generated
 */
EClass getWiresElement();

/**
 * Returns the meta object for class '{@link Wires.LibraryRef <em>Library Ref</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Library Ref</em>'.
 * @see Wires.LibraryRef
 * @generated
 */
EClass getLibraryRef();

/**
 * Returns the meta object for the reference '{@link Wires.LibraryRef#getLibrary <em>Library</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the reference '<em>Library</em>'.
 * @see Wires.LibraryRef#getLibrary()
 * @see #getLibraryRef()
 * @generated
 */
EReference getLibraryRef_Library();

/**
 * Returns the meta object for the attribute '{@link Wires.LibraryRef#getName <em>Name</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Name</em>'.
 * @see Wires.LibraryRef#getName()
 * @see #getLibraryRef()
 * @generated
 */
EAttribute getLibraryRef_Name();

/**
 * Returns the meta object for class '{@link Wires.Library <em>Library</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Library</em>'.
 * @see Wires.Library
 * @generated
 */
EClass getLibrary();

/**
 * Returns the meta object for the attribute '{@link Wires.Library#getName <em>Name</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Name</em>'.
 * @see Wires.Library#getName()
 * @see #getLibrary()
 * @generated
 */
EAttribute getLibrary_Name();

/**
 * Returns the meta object for the attribute '{@link Wires.Library#getPath <em>Path</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the attribute '<em>Path</em>'.
 * @see Wires.Library#getPath()
 * @see #getLibrary()
 * @generated
 */
EAttribute getLibrary_Path();

/**
 * Returns the meta object for the containment reference list '{@link Wires.Library#getLibraries <em>Libraries</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference list '<em>Libraries</em>'.
 * @see Wires.Library#getLibraries()
 * @see #getLibrary()
 * @generated
 */
EReference getLibrary_Libraries();

/**
 * Returns the meta object for class '{@link Wires.InputFormalParameter <em>Input Formal Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Input Formal Parameter</em>'.
 * @see Wires.InputFormalParameter
 * @generated
 */
EClass getInputFormalParameter();

/**
 * Returns the meta object for class '{@link Wires.OutputFormalParameter <em>Output Formal Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Output Formal Parameter</em>'.
 * @see Wires.OutputFormalParameter
 * @generated
 */
EClass getOutputFormalParameter();

/**
 * Returns the meta object for class '{@link Wires.InputActualParameter <em>Input Actual Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Input Actual Parameter</em>'.
 * @see Wires.InputActualParameter
 * @generated
 */
EClass getInputActualParameter();

/**
 * Returns the meta object for class '{@link Wires.OutputActualParameter <em>Output Actual Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Output Actual Parameter</em>'.
 * @see Wires.OutputActualParameter
 * @generated
 */
EClass getOutputActualParameter();

/**
 * Returns the meta object for class '{@link Wires.AtomicModelTransfomationType <em>Atomic Model Transfomation Type</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Atomic Model Transfomation Type</em>'.
 * @see Wires.AtomicModelTransfomationType
 * @generated
 */
EClass getAtomicModelTransfomationType();

/**
 * Returns the meta object for class '{@link Wires.IdentityTransformation <em>Identity Transformation</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Identity Transformation</em>'.
 * @see Wires.IdentityTransformation
 * @generated
 */
EClass getIdentityTransformation();

/**
 * Returns the meta object for class '{@link Wires.GenericTransformation <em>Generic Transformation</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Generic Transformation</em>'.
 * @see Wires.GenericTransformation
 * @generated
 */
EClass getGenericTransformation();

/**
 * Returns the meta object for the containment reference '{@link Wires.GenericTransformation#getTypeParam <em>Type Param</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference '<em>Type Param</em>'.
 * @see Wires.GenericTransformation#getTypeParam()
 * @see #getGenericTransformation()
 * @generated
 */
EReference getGenericTransformation_TypeParam();

/**
 * Returns the meta object for class '{@link Wires.TypeParameter <em>Type Parameter</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Type Parameter</em>'.
 * @see Wires.TypeParameter
 * @generated
 */
EClass getTypeParameter();

/**
 * Returns the meta object for class '{@link Wires.GenericQuery <em>Generic Query</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for class '<em>Generic Query</em>'.
 * @see Wires.GenericQuery
 * @generated
 */
EClass getGenericQuery();

/**
 * Returns the meta object for the containment reference '{@link Wires.GenericQuery#getTypeParam <em>Type Param</em>}'.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the meta object for the containment reference '<em>Type Param</em>'.
 * @see Wires.GenericQuery#getTypeParam()
 * @see #getGenericQuery()
 * @generated
 */
EReference getGenericQuery_TypeParam();

/**
 * Returns the factory that creates the instances of the model.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @return the factory that creates the instances of the model.
 * @generated
 */
WiresFactory getWiresFactory();

/**
 * <!-- begin-user-doc -->
 * Defines literals for the meta objects that represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @generated
 */
interface Literals {
	/**
	 * The meta object literal for the '{@link Wires.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.TransformationImpl
	 * @see Wires.impl.WiresPackageImpl#getTransformation()
	 * @generated
	 */
	EClass TRANSFORMATION = eINSTANCE.getTransformation();

	/**
	 * The meta object literal for the '<em><b>In Params</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TRANSFORMATION__IN_PARAMS = eINSTANCE.getTransformation_InParams();

	/**
	 * The meta object literal for the '<em><b>Out Params</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TRANSFORMATION__OUT_PARAMS = eINSTANCE.getTransformation_OutParams();

	/**
	 * The meta object literal for the '<em><b>Control Node</b></em>' reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TRANSFORMATION__CONTROL_NODE = eINSTANCE.getTransformation_ControlNode();

	/**
	 * The meta object literal for the '{@link Wires.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.QueryImpl
	 * @see Wires.impl.WiresPackageImpl#getQuery()
	 * @generated
	 */
	EClass QUERY = eINSTANCE.getQuery();

	/**
	 * The meta object literal for the '{@link Wires.impl.AtomicModelTransformationImpl <em>Atomic Model Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.AtomicModelTransformationImpl
	 * @see Wires.impl.WiresPackageImpl#getAtomicModelTransformation()
	 * @generated
	 */
	EClass ATOMIC_MODEL_TRANSFORMATION = eINSTANCE.getAtomicModelTransformation();

	/**
	 * The meta object literal for the '{@link Wires.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.TypedElementImpl
	 * @see Wires.impl.WiresPackageImpl#getTypedElement()
	 * @generated
	 */
	EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

	/**
	 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

	/**
	 * The meta object literal for the '{@link Wires.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.TypeImpl
	 * @see Wires.impl.WiresPackageImpl#getType()
	 * @generated
	 */
	EClass TYPE = eINSTANCE.getType();

	/**
	 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute TYPE__PATH = eINSTANCE.getType_Path();

	/**
	 * The meta object literal for the '{@link Wires.impl.ModelTypeImpl <em>Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.ModelTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getModelType()
	 * @generated
	 */
	EClass MODEL_TYPE = eINSTANCE.getModelType();

	/**
	 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute MODEL_TYPE__URI = eINSTANCE.getModelType_Uri();

	/**
	 * The meta object literal for the '{@link Wires.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.DataTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getDataType()
	 * @generated
	 */
	EClass DATA_TYPE = eINSTANCE.getDataType();

	/**
	 * The meta object literal for the '{@link Wires.impl.ActualParameterImpl <em>Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.ActualParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getActualParameter()
	 * @generated
	 */
	EClass ACTUAL_PARAMETER = eINSTANCE.getActualParameter();

	/**
	 * The meta object literal for the '{@link Wires.impl.DecisionNodeImpl <em>Decision Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.DecisionNodeImpl
	 * @see Wires.impl.WiresPackageImpl#getDecisionNode()
	 * @generated
	 */
	EClass DECISION_NODE = eINSTANCE.getDecisionNode();

	/**
	 * The meta object literal for the '<em><b>True Branch</b></em>' reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference DECISION_NODE__TRUE_BRANCH = eINSTANCE.getDecisionNode_TrueBranch();

	/**
	 * The meta object literal for the '<em><b>False Branch</b></em>' reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference DECISION_NODE__FALSE_BRANCH = eINSTANCE.getDecisionNode_FalseBranch();

	/**
	 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute DECISION_NODE__EXPRESSION = eINSTANCE.getDecisionNode_Expression();

	/**
	 * The meta object literal for the '<em><b>In Params</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference DECISION_NODE__IN_PARAMS = eINSTANCE.getDecisionNode_InParams();

	/**
	 * The meta object literal for the '{@link Wires.impl.DataFlowImpl <em>Data Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.DataFlowImpl
	 * @see Wires.impl.WiresPackageImpl#getDataFlow()
	 * @generated
	 */
	EClass DATA_FLOW = eINSTANCE.getDataFlow();

	/**
	 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference DATA_FLOW__TARGET = eINSTANCE.getDataFlow_Target();

	/**
	 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference DATA_FLOW__SRC = eINSTANCE.getDataFlow_Src();

	/**
	 * The meta object literal for the '{@link Wires.impl.TransformationTypeImpl <em>Transformation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.TransformationTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getTransformationType()
	 * @generated
	 */
	EClass TRANSFORMATION_TYPE = eINSTANCE.getTransformationType();

	/**
	 * The meta object literal for the '<em><b>Out Params</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TRANSFORMATION_TYPE__OUT_PARAMS = eINSTANCE.getTransformationType_OutParams();

	/**
	 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TRANSFORMATION_TYPE__LIBRARIES = eINSTANCE.getTransformationType_Libraries();

	/**
	 * The meta object literal for the '<em><b>In Params</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference TRANSFORMATION_TYPE__IN_PARAMS = eINSTANCE.getTransformationType_InParams();

	/**
	 * The meta object literal for the '{@link Wires.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.FormalParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getFormalParameter()
	 * @generated
	 */
	EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

	/**
	 * The meta object literal for the '<em><b>Type El</b></em>' reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference FORMAL_PARAMETER__TYPE_EL = eINSTANCE.getFormalParameter_TypeEl();

	/**
	 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute FORMAL_PARAMETER__TYPE_NAME = eINSTANCE.getFormalParameter_TypeName();

	/**
	 * The meta object literal for the '{@link Wires.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.QueryTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getQueryType()
	 * @generated
	 */
	EClass QUERY_TYPE = eINSTANCE.getQueryType();

	/**
	 * The meta object literal for the '{@link Wires.impl.ConnectableElementImpl <em>Connectable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.ConnectableElementImpl
	 * @see Wires.impl.WiresPackageImpl#getConnectableElement()
	 * @generated
	 */
	EClass CONNECTABLE_ELEMENT = eINSTANCE.getConnectableElement();

	/**
	 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference CONNECTABLE_ELEMENT__INCOMING = eINSTANCE.getConnectableElement_Incoming();

	/**
	 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference CONNECTABLE_ELEMENT__OUTGOING = eINSTANCE.getConnectableElement_Outgoing();

	/**
	 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute CONNECTABLE_ELEMENT__NAME = eINSTANCE.getConnectableElement_Name();

	/**
	 * The meta object literal for the '{@link Wires.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.ModelImpl
	 * @see Wires.impl.WiresPackageImpl#getModel()
	 * @generated
	 */
	EClass MODEL = eINSTANCE.getModel();

	/**
	 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute MODEL__PATH = eINSTANCE.getModel_Path();

	/**
	 * The meta object literal for the '{@link Wires.impl.BasicDataImpl <em>Basic Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.BasicDataImpl
	 * @see Wires.impl.WiresPackageImpl#getBasicData()
	 * @generated
	 */
	EClass BASIC_DATA = eINSTANCE.getBasicData();

	/**
	 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute BASIC_DATA__PATH = eINSTANCE.getBasicData_Path();

	/**
	 * The meta object literal for the '{@link Wires.impl.CompositeTransformationTypeImpl <em>Composite Transformation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.CompositeTransformationTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getCompositeTransformationType()
	 * @generated
	 */
	EClass COMPOSITE_TRANSFORMATION_TYPE = eINSTANCE.getCompositeTransformationType();

	/**
	 * The meta object literal for the '{@link Wires.impl.CompositeTransformationImpl <em>Composite Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.CompositeTransformationImpl
	 * @see Wires.impl.WiresPackageImpl#getCompositeTransformation()
	 * @generated
	 */
	EClass COMPOSITE_TRANSFORMATION = eINSTANCE.getCompositeTransformation();

	/**
	 * The meta object literal for the '{@link Wires.impl.BasicDataTypeImpl <em>Basic Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.BasicDataTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getBasicDataType()
	 * @generated
	 */
	EClass BASIC_DATA_TYPE = eINSTANCE.getBasicDataType();

	/**
	 * The meta object literal for the '{@link Wires.impl.WiresSpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.WiresSpecificationImpl
	 * @see Wires.impl.WiresPackageImpl#getWiresSpecification()
	 * @generated
	 */
	EClass WIRES_SPECIFICATION = eINSTANCE.getWiresSpecification();

	/**
	 * The meta object literal for the '<em><b>Els</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference WIRES_SPECIFICATION__ELS = eINSTANCE.getWiresSpecification_Els();

	/**
	 * The meta object literal for the '{@link Wires.impl.WiresElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.WiresElementImpl
	 * @see Wires.impl.WiresPackageImpl#getWiresElement()
	 * @generated
	 */
	EClass WIRES_ELEMENT = eINSTANCE.getWiresElement();

	/**
	 * The meta object literal for the '{@link Wires.impl.LibraryRefImpl <em>Library Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.LibraryRefImpl
	 * @see Wires.impl.WiresPackageImpl#getLibraryRef()
	 * @generated
	 */
	EClass LIBRARY_REF = eINSTANCE.getLibraryRef();

	/**
	 * The meta object literal for the '<em><b>Library</b></em>' reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference LIBRARY_REF__LIBRARY = eINSTANCE.getLibraryRef_Library();

	/**
	 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute LIBRARY_REF__NAME = eINSTANCE.getLibraryRef_Name();

	/**
	 * The meta object literal for the '{@link Wires.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.LibraryImpl
	 * @see Wires.impl.WiresPackageImpl#getLibrary()
	 * @generated
	 */
	EClass LIBRARY = eINSTANCE.getLibrary();

	/**
	 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();

	/**
	 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EAttribute LIBRARY__PATH = eINSTANCE.getLibrary_Path();

	/**
	 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference list feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference LIBRARY__LIBRARIES = eINSTANCE.getLibrary_Libraries();

	/**
	 * The meta object literal for the '{@link Wires.impl.InputFormalParameterImpl <em>Input Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.InputFormalParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getInputFormalParameter()
	 * @generated
	 */
	EClass INPUT_FORMAL_PARAMETER = eINSTANCE.getInputFormalParameter();

	/**
	 * The meta object literal for the '{@link Wires.impl.OutputFormalParameterImpl <em>Output Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.OutputFormalParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getOutputFormalParameter()
	 * @generated
	 */
	EClass OUTPUT_FORMAL_PARAMETER = eINSTANCE.getOutputFormalParameter();

	/**
	 * The meta object literal for the '{@link Wires.impl.InputActualParameterImpl <em>Input Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.InputActualParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getInputActualParameter()
	 * @generated
	 */
	EClass INPUT_ACTUAL_PARAMETER = eINSTANCE.getInputActualParameter();

	/**
	 * The meta object literal for the '{@link Wires.impl.OutputActualParameterImpl <em>Output Actual Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.OutputActualParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getOutputActualParameter()
	 * @generated
	 */
	EClass OUTPUT_ACTUAL_PARAMETER = eINSTANCE.getOutputActualParameter();

	/**
	 * The meta object literal for the '{@link Wires.impl.AtomicModelTransfomationTypeImpl <em>Atomic Model Transfomation Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.AtomicModelTransfomationTypeImpl
	 * @see Wires.impl.WiresPackageImpl#getAtomicModelTransfomationType()
	 * @generated
	 */
	EClass ATOMIC_MODEL_TRANSFOMATION_TYPE = eINSTANCE.getAtomicModelTransfomationType();

	/**
	 * The meta object literal for the '{@link Wires.impl.IdentityTransformationImpl <em>Identity Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.IdentityTransformationImpl
	 * @see Wires.impl.WiresPackageImpl#getIdentityTransformation()
	 * @generated
	 */
	EClass IDENTITY_TRANSFORMATION = eINSTANCE.getIdentityTransformation();

	/**
	 * The meta object literal for the '{@link Wires.impl.GenericTransformationImpl <em>Generic Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.GenericTransformationImpl
	 * @see Wires.impl.WiresPackageImpl#getGenericTransformation()
	 * @generated
	 */
	EClass GENERIC_TRANSFORMATION = eINSTANCE.getGenericTransformation();

	/**
	 * The meta object literal for the '<em><b>Type Param</b></em>' containment reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference GENERIC_TRANSFORMATION__TYPE_PARAM = eINSTANCE.getGenericTransformation_TypeParam();

	/**
	 * The meta object literal for the '{@link Wires.impl.TypeParameterImpl <em>Type Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.TypeParameterImpl
	 * @see Wires.impl.WiresPackageImpl#getTypeParameter()
	 * @generated
	 */
	EClass TYPE_PARAMETER = eINSTANCE.getTypeParameter();

	/**
	 * The meta object literal for the '{@link Wires.impl.GenericQueryImpl <em>Generic Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Wires.impl.GenericQueryImpl
	 * @see Wires.impl.WiresPackageImpl#getGenericQuery()
	 * @generated
	 */
	EClass GENERIC_QUERY = eINSTANCE.getGenericQuery();

	/**
	 * The meta object literal for the '<em><b>Type Param</b></em>' containment reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EReference GENERIC_QUERY__TYPE_PARAM = eINSTANCE.getGenericQuery_TypeParam();

}

} //WiresPackage
