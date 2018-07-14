/**
 */
package org.wbsilva.bence.graphgrammar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarFactory
 * @model kind="package"
 * @generated
 */
public interface GraphgrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphgrammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.wbsilva.bence.graphgrammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.wbsilva.bence.graphgrammar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphgrammarPackage eINSTANCE = org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.GrammarImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alphabet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__ALPHABET = 1;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__TERMINALS = 2;

	/**
	 * The feature id for the '<em><b>Nonterminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NONTERMINALS = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULES = 4;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__INITIAL = 5;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Derives</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR___DERIVES__GRAPH_GRAPH_VERTEX_GRAPH = 0;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.RuleImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LHS = 2;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RHS = 3;

	/**
	 * The feature id for the '<em><b>Embedding</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EMBEDDING = 4;

	/**
	 * The feature id for the '<em><b>Pac</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PAC = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Embed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___EMBED__GRAPH_ELIST = 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE___APPLY__GRAPH_VERTEX = 1;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairImpl <em>Vertex Label Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.VertexLabelPairImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertexLabelPair()
	 * @generated
	 */
	int VERTEX_LABEL_PAIR = 2;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR__VERTEX = 0;

	/**
	 * The feature id for the '<em><b>Edge Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR__EDGE_LABEL = 1;

	/**
	 * The number of structural features of the '<em>Vertex Label Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vertex Label Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairToSymbolMapImpl <em>Vertex Label Pair To Symbol Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.VertexLabelPairToSymbolMapImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertexLabelPairToSymbolMap()
	 * @generated
	 */
	int VERTEX_LABEL_PAIR_TO_SYMBOL_MAP = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Vertex Label Pair To Symbol Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR_TO_SYMBOL_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vertex Label Pair To Symbol Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_LABEL_PAIR_TO_SYMBOL_MAP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.SymbolImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = 0;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl <em>Derivation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getDerivationStep()
	 * @generated
	 */
	int DERIVATION_STEP = 5;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__RULE = 0;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__VERTEX = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__PREVIOUS = 2;

	/**
	 * The feature id for the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__NEXT = 3;

	/**
	 * The feature id for the '<em><b>Unifier</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__UNIFIER = 4;

	/**
	 * The number of structural features of the '<em>Derivation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Derivation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.DerivationImpl <em>Derivation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.DerivationImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getDerivation()
	 * @generated
	 */
	int DERIVATION = 6;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__STEPS = 0;

	/**
	 * The number of structural features of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl <em>Parsing Tree</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getParsingTree()
	 * @generated
	 */
	int PARSING_TREE = 7;

	/**
	 * The feature id for the '<em><b>Zone Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_TREE__ZONE_VERTEX = 0;

	/**
	 * The feature id for the '<em><b>Derivation Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_TREE__DERIVATION_STEP = 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_TREE__CHILDREN = 2;

	/**
	 * The number of structural features of the '<em>Parsing Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_TREE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Derivation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_TREE___DERIVATION = 0;

	/**
	 * The number of operations of the '<em>Parsing Tree</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARSING_TREE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 8;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VERTICES = 0;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Neighborhood</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NEIGHBORHOOD__ELIST = 0;

	/**
	 * The operation id for the '<em>Isomorphic To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ISOMORPHIC_TO__GRAPH = 1;

	/**
	 * The operation id for the '<em>In Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___IN_EDGES__VERTEX = 2;

	/**
	 * The operation id for the '<em>Out Edges</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___OUT_EDGES__VERTEX = 3;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.VertexImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.ZoneVertexImpl <em>Zone Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.ZoneVertexImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getZoneVertex()
	 * @generated
	 */
	int ZONE_VERTEX = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX__ID = VERTEX__ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX__LABEL = VERTEX__LABEL;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX__VERTICES = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Zone Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Equivalates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX___EQUIVALATES__ZONEVERTEX = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Zone Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.EdgeImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TO = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Compare To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___COMPARE_TO__EDGE = 0;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl <em>Triple Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getTripleGrammar()
	 * @generated
	 */
	int TRIPLE_GRAMMAR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Alphabet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR__ALPHABET = 1;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR__TERMINALS = 2;

	/**
	 * The feature id for the '<em><b>Nonterminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR__NONTERMINALS = 3;

	/**
	 * The feature id for the '<em><b>Triple Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR__TRIPLE_RULES = 4;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR__INITIAL = 5;

	/**
	 * The number of structural features of the '<em>Triple Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Produce</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR___PRODUCE__TRIPLEGRAPH_DERIVATIONSTEP_BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Triple Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAMMAR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl <em>Triple Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getTripleRule()
	 * @generated
	 */
	int TRIPLE_RULE = 13;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Corr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE__CORR = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Ms</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE__MS = 3;

	/**
	 * The feature id for the '<em><b>Mt</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE__MT = 4;

	/**
	 * The number of structural features of the '<em>Triple Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Triple Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.TripleGraphImpl <em>Triple Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.TripleGraphImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getTripleGraph()
	 * @generated
	 */
	int TRIPLE_GRAPH = 14;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Corr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__CORR = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Ms</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__MS = 3;

	/**
	 * The feature id for the '<em><b>Mt</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH__MT = 4;

	/**
	 * The number of structural features of the '<em>Triple Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Inv Ms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH___INV_MS__VERTEX = 0;

	/**
	 * The operation id for the '<em>Inv Mt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH___INV_MT__VERTEX = 1;

	/**
	 * The number of operations of the '<em>Triple Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIPLE_GRAPH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexToVertexMapImpl <em>Vertex To Vertex Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.VertexToVertexMapImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertexToVertexMap()
	 * @generated
	 */
	int VERTEX_TO_VERTEX_MAP = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TO_VERTEX_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TO_VERTEX_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Vertex To Vertex Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TO_VERTEX_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Vertex To Vertex Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_TO_VERTEX_MAP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Grammar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getName()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.Grammar#getAlphabet <em>Alphabet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alphabet</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getAlphabet()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Alphabet();

	/**
	 * Returns the meta object for the reference list '{@link org.wbsilva.bence.graphgrammar.Grammar#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getTerminals()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Terminals();

	/**
	 * Returns the meta object for the reference list '{@link org.wbsilva.bence.graphgrammar.Grammar#getNonterminals <em>Nonterminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nonterminals</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getNonterminals()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Nonterminals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.Grammar#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getRules()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Rules();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bence.graphgrammar.Grammar#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getInitial()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Initial();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Grammar#derives(org.wbsilva.bence.graphgrammar.Graph, org.wbsilva.bence.graphgrammar.Graph, org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Graph) <em>Derives</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derives</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#derives(org.wbsilva.bence.graphgrammar.Graph, org.wbsilva.bence.graphgrammar.Graph, org.wbsilva.bence.graphgrammar.Vertex, org.wbsilva.bence.graphgrammar.Graph)
	 * @generated
	 */
	EOperation getGrammar__Derives__Graph_Graph_Vertex_Graph();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Rule#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule#getId()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.Rule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule#getLhs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.Rule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule#getRhs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Rhs();

	/**
	 * Returns the meta object for the map '{@link org.wbsilva.bence.graphgrammar.Rule#getEmbedding <em>Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Embedding</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule#getEmbedding()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Embedding();

	/**
	 * Returns the meta object for the reference list '{@link org.wbsilva.bence.graphgrammar.Rule#getPac <em>Pac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pac</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Rule#getPac()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Pac();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Rule#embed(org.wbsilva.bence.graphgrammar.Graph, org.eclipse.emf.common.util.EList) <em>Embed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Embed</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Rule#embed(org.wbsilva.bence.graphgrammar.Graph, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getRule__Embed__Graph_EList();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Rule#apply(org.wbsilva.bence.graphgrammar.Graph, org.wbsilva.bence.graphgrammar.Vertex) <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Rule#apply(org.wbsilva.bence.graphgrammar.Graph, org.wbsilva.bence.graphgrammar.Vertex)
	 * @generated
	 */
	EOperation getRule__Apply__Graph_Vertex();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.VertexLabelPair <em>Vertex Label Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex Label Pair</em>'.
	 * @see org.wbsilva.bence.graphgrammar.VertexLabelPair
	 * @generated
	 */
	EClass getVertexLabelPair();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bence.graphgrammar.VertexLabelPair#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vertex</em>'.
	 * @see org.wbsilva.bence.graphgrammar.VertexLabelPair#getVertex()
	 * @see #getVertexLabelPair()
	 * @generated
	 */
	EReference getVertexLabelPair_Vertex();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.VertexLabelPair#getEdgeLabel <em>Edge Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Edge Label</em>'.
	 * @see org.wbsilva.bence.graphgrammar.VertexLabelPair#getEdgeLabel()
	 * @see #getVertexLabelPair()
	 * @generated
	 */
	EReference getVertexLabelPair_EdgeLabel();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Vertex Label Pair To Symbol Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex Label Pair To Symbol Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.wbsilva.bence.graphgrammar.VertexLabelPair" keyContainment="true"
	 *        valueType="org.wbsilva.bence.graphgrammar.Symbol" valueContainment="true" valueMany="true" valueOrdered="false"
	 * @generated
	 */
	EClass getVertexLabelPairToSymbolMap();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVertexLabelPairToSymbolMap()
	 * @generated
	 */
	EReference getVertexLabelPairToSymbolMap_Key();

	/**
	 * Returns the meta object for the containment reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVertexLabelPairToSymbolMap()
	 * @generated
	 */
	EReference getVertexLabelPairToSymbolMap_Value();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Symbol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Symbol#getName()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Name();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.DerivationStep <em>Derivation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation Step</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep
	 * @generated
	 */
	EClass getDerivationStep();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep#getRule()
	 * @see #getDerivationStep()
	 * @generated
	 */
	EReference getDerivationStep_Rule();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertex</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep#getVertex()
	 * @see #getDerivationStep()
	 * @generated
	 */
	EReference getDerivationStep_Vertex();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Previous</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep#getPrevious()
	 * @see #getDerivationStep()
	 * @generated
	 */
	EReference getDerivationStep_Previous();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep#getNext()
	 * @see #getDerivationStep()
	 * @generated
	 */
	EReference getDerivationStep_Next();

	/**
	 * Returns the meta object for the map '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getUnifier <em>Unifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Unifier</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep#getUnifier()
	 * @see #getDerivationStep()
	 * @generated
	 */
	EReference getDerivationStep_Unifier();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Derivation
	 * @generated
	 */
	EClass getDerivation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.Derivation#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Derivation#getSteps()
	 * @see #getDerivation()
	 * @generated
	 */
	EReference getDerivation_Steps();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.ParsingTree <em>Parsing Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parsing Tree</em>'.
	 * @see org.wbsilva.bence.graphgrammar.ParsingTree
	 * @generated
	 */
	EClass getParsingTree();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.ParsingTree#getZoneVertex <em>Zone Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Zone Vertex</em>'.
	 * @see org.wbsilva.bence.graphgrammar.ParsingTree#getZoneVertex()
	 * @see #getParsingTree()
	 * @generated
	 */
	EReference getParsingTree_ZoneVertex();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.ParsingTree#getDerivationStep <em>Derivation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Derivation Step</em>'.
	 * @see org.wbsilva.bence.graphgrammar.ParsingTree#getDerivationStep()
	 * @see #getParsingTree()
	 * @generated
	 */
	EReference getParsingTree_DerivationStep();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.ParsingTree#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.wbsilva.bence.graphgrammar.ParsingTree#getChildren()
	 * @see #getParsingTree()
	 * @generated
	 */
	EReference getParsingTree_Children();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.ParsingTree#derivation() <em>Derivation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Derivation</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.ParsingTree#derivation()
	 * @generated
	 */
	EOperation getParsingTree__Derivation();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.Graph#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Graph#getVertices()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Vertices();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.Graph#getEdges <em>Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Edges</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Graph#getEdges()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Edges();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Graph#neighborhood(org.eclipse.emf.common.util.EList) <em>Neighborhood</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Neighborhood</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Graph#neighborhood(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGraph__Neighborhood__EList();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Graph#isomorphicTo(org.wbsilva.bence.graphgrammar.Graph) <em>Isomorphic To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Isomorphic To</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Graph#isomorphicTo(org.wbsilva.bence.graphgrammar.Graph)
	 * @generated
	 */
	EOperation getGraph__IsomorphicTo__Graph();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Graph#inEdges(org.wbsilva.bence.graphgrammar.Vertex) <em>In Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>In Edges</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Graph#inEdges(org.wbsilva.bence.graphgrammar.Vertex)
	 * @generated
	 */
	EOperation getGraph__InEdges__Vertex();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Graph#outEdges(org.wbsilva.bence.graphgrammar.Vertex) <em>Out Edges</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Out Edges</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Graph#outEdges(org.wbsilva.bence.graphgrammar.Vertex)
	 * @generated
	 */
	EOperation getGraph__OutEdges__Vertex();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Vertex#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Vertex#getId()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.Vertex#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Vertex#getLabel()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_Label();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.ZoneVertex <em>Zone Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zone Vertex</em>'.
	 * @see org.wbsilva.bence.graphgrammar.ZoneVertex
	 * @generated
	 */
	EClass getZoneVertex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.ZoneVertex#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see org.wbsilva.bence.graphgrammar.ZoneVertex#getVertices()
	 * @see #getZoneVertex()
	 * @generated
	 */
	EReference getZoneVertex_Vertices();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.ZoneVertex#equivalates(org.wbsilva.bence.graphgrammar.ZoneVertex) <em>Equivalates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equivalates</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.ZoneVertex#equivalates(org.wbsilva.bence.graphgrammar.ZoneVertex)
	 * @generated
	 */
	EOperation getZoneVertex__Equivalates__ZoneVertex();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bence.graphgrammar.Edge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Edge#getFrom()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_From();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bence.graphgrammar.Edge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Edge#getTo()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_To();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.Edge#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Edge#getLabel()
	 * @see #getEdge()
	 * @generated
	 */
	EReference getEdge_Label();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Edge#compareTo(org.wbsilva.bence.graphgrammar.Edge) <em>Compare To</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Compare To</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Edge#compareTo(org.wbsilva.bence.graphgrammar.Edge)
	 * @generated
	 */
	EOperation getEdge__CompareTo__Edge();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.TripleGrammar <em>Triple Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triple Grammar</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar
	 * @generated
	 */
	EClass getTripleGrammar();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#getName()
	 * @see #getTripleGrammar()
	 * @generated
	 */
	EAttribute getTripleGrammar_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#getAlphabet <em>Alphabet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alphabet</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#getAlphabet()
	 * @see #getTripleGrammar()
	 * @generated
	 */
	EReference getTripleGrammar_Alphabet();

	/**
	 * Returns the meta object for the reference list '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#getTerminals <em>Terminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Terminals</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#getTerminals()
	 * @see #getTripleGrammar()
	 * @generated
	 */
	EReference getTripleGrammar_Terminals();

	/**
	 * Returns the meta object for the reference list '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#getNonterminals <em>Nonterminals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Nonterminals</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#getNonterminals()
	 * @see #getTripleGrammar()
	 * @generated
	 */
	EReference getTripleGrammar_Nonterminals();

	/**
	 * Returns the meta object for the containment reference list '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#getTripleRules <em>Triple Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triple Rules</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#getTripleRules()
	 * @see #getTripleGrammar()
	 * @generated
	 */
	EReference getTripleGrammar_TripleRules();

	/**
	 * Returns the meta object for the reference '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#getInitial()
	 * @see #getTripleGrammar()
	 * @generated
	 */
	EReference getTripleGrammar_Initial();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.TripleGrammar#produce(org.wbsilva.bence.graphgrammar.TripleGraph, org.wbsilva.bence.graphgrammar.DerivationStep, boolean) <em>Produce</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Produce</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar#produce(org.wbsilva.bence.graphgrammar.TripleGraph, org.wbsilva.bence.graphgrammar.DerivationStep, boolean)
	 * @generated
	 */
	EOperation getTripleGrammar__Produce__TripleGraph_DerivationStep_boolean();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.TripleRule <em>Triple Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triple Rule</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule
	 * @generated
	 */
	EClass getTripleRule();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.TripleRule#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule#getSource()
	 * @see #getTripleRule()
	 * @generated
	 */
	EReference getTripleRule_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.TripleRule#getCorr <em>Corr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corr</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule#getCorr()
	 * @see #getTripleRule()
	 * @generated
	 */
	EReference getTripleRule_Corr();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.TripleRule#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule#getTarget()
	 * @see #getTripleRule()
	 * @generated
	 */
	EReference getTripleRule_Target();

	/**
	 * Returns the meta object for the map '{@link org.wbsilva.bence.graphgrammar.TripleRule#getMs <em>Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Ms</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule#getMs()
	 * @see #getTripleRule()
	 * @generated
	 */
	EReference getTripleRule_Ms();

	/**
	 * Returns the meta object for the map '{@link org.wbsilva.bence.graphgrammar.TripleRule#getMt <em>Mt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Mt</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule#getMt()
	 * @see #getTripleRule()
	 * @generated
	 */
	EReference getTripleRule_Mt();

	/**
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.TripleGraph <em>Triple Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triple Graph</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph
	 * @generated
	 */
	EClass getTripleGraph();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#getSource()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EReference getTripleGraph_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getCorr <em>Corr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Corr</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#getCorr()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EReference getTripleGraph_Corr();

	/**
	 * Returns the meta object for the containment reference '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#getTarget()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EReference getTripleGraph_Target();

	/**
	 * Returns the meta object for the map '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getMs <em>Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Ms</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#getMs()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EReference getTripleGraph_Ms();

	/**
	 * Returns the meta object for the map '{@link org.wbsilva.bence.graphgrammar.TripleGraph#getMt <em>Mt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Mt</em>'.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#getMt()
	 * @see #getTripleGraph()
	 * @generated
	 */
	EReference getTripleGraph_Mt();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.TripleGraph#invMs(org.wbsilva.bence.graphgrammar.Vertex) <em>Inv Ms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv Ms</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#invMs(org.wbsilva.bence.graphgrammar.Vertex)
	 * @generated
	 */
	EOperation getTripleGraph__InvMs__Vertex();

	/**
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.TripleGraph#invMt(org.wbsilva.bence.graphgrammar.Vertex) <em>Inv Mt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv Mt</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph#invMt(org.wbsilva.bence.graphgrammar.Vertex)
	 * @generated
	 */
	EOperation getTripleGraph__InvMt__Vertex();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Vertex To Vertex Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex To Vertex Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyType="org.wbsilva.bence.graphgrammar.Vertex"
	 *        valueType="org.wbsilva.bence.graphgrammar.Vertex"
	 * @generated
	 */
	EClass getVertexToVertexMap();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVertexToVertexMap()
	 * @generated
	 */
	EReference getVertexToVertexMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getVertexToVertexMap()
	 * @generated
	 */
	EReference getVertexToVertexMap_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphgrammarFactory getGraphgrammarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.GrammarImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__NAME = eINSTANCE.getGrammar_Name();
		/**
		 * The meta object literal for the '<em><b>Alphabet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__ALPHABET = eINSTANCE.getGrammar_Alphabet();
		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__TERMINALS = eINSTANCE.getGrammar_Terminals();
		/**
		 * The meta object literal for the '<em><b>Nonterminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__NONTERMINALS = eINSTANCE.getGrammar_Nonterminals();
		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__RULES = eINSTANCE.getGrammar_Rules();
		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__INITIAL = eINSTANCE.getGrammar_Initial();
		/**
		 * The meta object literal for the '<em><b>Derives</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAMMAR___DERIVES__GRAPH_GRAPH_VERTEX_GRAPH = eINSTANCE
				.getGrammar__Derives__Graph_Graph_Vertex_Graph();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.RuleImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID = eINSTANCE.getRule_Id();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();
		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LHS = eINSTANCE.getRule_Lhs();
		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RHS = eINSTANCE.getRule_Rhs();
		/**
		 * The meta object literal for the '<em><b>Embedding</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EMBEDDING = eINSTANCE.getRule_Embedding();
		/**
		 * The meta object literal for the '<em><b>Pac</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PAC = eINSTANCE.getRule_Pac();
		/**
		 * The meta object literal for the '<em><b>Embed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___EMBED__GRAPH_ELIST = eINSTANCE.getRule__Embed__Graph_EList();
		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RULE___APPLY__GRAPH_VERTEX = eINSTANCE.getRule__Apply__Graph_Vertex();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairImpl <em>Vertex Label Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.VertexLabelPairImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertexLabelPair()
		 * @generated
		 */
		EClass VERTEX_LABEL_PAIR = eINSTANCE.getVertexLabelPair();
		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_LABEL_PAIR__VERTEX = eINSTANCE.getVertexLabelPair_Vertex();
		/**
		 * The meta object literal for the '<em><b>Edge Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_LABEL_PAIR__EDGE_LABEL = eINSTANCE.getVertexLabelPair_EdgeLabel();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairToSymbolMapImpl <em>Vertex Label Pair To Symbol Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.VertexLabelPairToSymbolMapImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertexLabelPairToSymbolMap()
		 * @generated
		 */
		EClass VERTEX_LABEL_PAIR_TO_SYMBOL_MAP = eINSTANCE.getVertexLabelPairToSymbolMap();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY = eINSTANCE.getVertexLabelPairToSymbolMap_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE = eINSTANCE.getVertexLabelPairToSymbolMap_Value();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.SymbolImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl <em>Derivation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.DerivationStepImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getDerivationStep()
		 * @generated
		 */
		EClass DERIVATION_STEP = eINSTANCE.getDerivationStep();
		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_STEP__RULE = eINSTANCE.getDerivationStep_Rule();
		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_STEP__VERTEX = eINSTANCE.getDerivationStep_Vertex();
		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_STEP__PREVIOUS = eINSTANCE.getDerivationStep_Previous();
		/**
		 * The meta object literal for the '<em><b>Next</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_STEP__NEXT = eINSTANCE.getDerivationStep_Next();
		/**
		 * The meta object literal for the '<em><b>Unifier</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION_STEP__UNIFIER = eINSTANCE.getDerivationStep_Unifier();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.DerivationImpl <em>Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.DerivationImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getDerivation()
		 * @generated
		 */
		EClass DERIVATION = eINSTANCE.getDerivation();
		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__STEPS = eINSTANCE.getDerivation_Steps();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl <em>Parsing Tree</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.ParsingTreeImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getParsingTree()
		 * @generated
		 */
		EClass PARSING_TREE = eINSTANCE.getParsingTree();
		/**
		 * The meta object literal for the '<em><b>Zone Vertex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSING_TREE__ZONE_VERTEX = eINSTANCE.getParsingTree_ZoneVertex();
		/**
		 * The meta object literal for the '<em><b>Derivation Step</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSING_TREE__DERIVATION_STEP = eINSTANCE.getParsingTree_DerivationStep();
		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARSING_TREE__CHILDREN = eINSTANCE.getParsingTree_Children();
		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PARSING_TREE___DERIVATION = eINSTANCE.getParsingTree__Derivation();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();
		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__VERTICES = eINSTANCE.getGraph_Vertices();
		/**
		 * The meta object literal for the '<em><b>Edges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__EDGES = eINSTANCE.getGraph_Edges();
		/**
		 * The meta object literal for the '<em><b>Neighborhood</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___NEIGHBORHOOD__ELIST = eINSTANCE.getGraph__Neighborhood__EList();
		/**
		 * The meta object literal for the '<em><b>Isomorphic To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ISOMORPHIC_TO__GRAPH = eINSTANCE.getGraph__IsomorphicTo__Graph();
		/**
		 * The meta object literal for the '<em><b>In Edges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___IN_EDGES__VERTEX = eINSTANCE.getGraph__InEdges__Vertex();
		/**
		 * The meta object literal for the '<em><b>Out Edges</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___OUT_EDGES__VERTEX = eINSTANCE.getGraph__OutEdges__Vertex();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.VertexImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__ID = eINSTANCE.getVertex_Id();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__LABEL = eINSTANCE.getVertex_Label();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.ZoneVertexImpl <em>Zone Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.ZoneVertexImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getZoneVertex()
		 * @generated
		 */
		EClass ZONE_VERTEX = eINSTANCE.getZoneVertex();
		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZONE_VERTEX__VERTICES = eINSTANCE.getZoneVertex_Vertices();
		/**
		 * The meta object literal for the '<em><b>Equivalates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ZONE_VERTEX___EQUIVALATES__ZONEVERTEX = eINSTANCE.getZoneVertex__Equivalates__ZoneVertex();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.EdgeImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();
		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__FROM = eINSTANCE.getEdge_From();
		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__TO = eINSTANCE.getEdge_To();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDGE__LABEL = eINSTANCE.getEdge_Label();
		/**
		 * The meta object literal for the '<em><b>Compare To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EDGE___COMPARE_TO__EDGE = eINSTANCE.getEdge__CompareTo__Edge();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl <em>Triple Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getTripleGrammar()
		 * @generated
		 */
		EClass TRIPLE_GRAMMAR = eINSTANCE.getTripleGrammar();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIPLE_GRAMMAR__NAME = eINSTANCE.getTripleGrammar_Name();
		/**
		 * The meta object literal for the '<em><b>Alphabet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAMMAR__ALPHABET = eINSTANCE.getTripleGrammar_Alphabet();
		/**
		 * The meta object literal for the '<em><b>Terminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAMMAR__TERMINALS = eINSTANCE.getTripleGrammar_Terminals();
		/**
		 * The meta object literal for the '<em><b>Nonterminals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAMMAR__NONTERMINALS = eINSTANCE.getTripleGrammar_Nonterminals();
		/**
		 * The meta object literal for the '<em><b>Triple Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAMMAR__TRIPLE_RULES = eINSTANCE.getTripleGrammar_TripleRules();
		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAMMAR__INITIAL = eINSTANCE.getTripleGrammar_Initial();
		/**
		 * The meta object literal for the '<em><b>Produce</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIPLE_GRAMMAR___PRODUCE__TRIPLEGRAPH_DERIVATIONSTEP_BOOLEAN = eINSTANCE
				.getTripleGrammar__Produce__TripleGraph_DerivationStep_boolean();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl <em>Triple Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.TripleRuleImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getTripleRule()
		 * @generated
		 */
		EClass TRIPLE_RULE = eINSTANCE.getTripleRule();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_RULE__SOURCE = eINSTANCE.getTripleRule_Source();
		/**
		 * The meta object literal for the '<em><b>Corr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_RULE__CORR = eINSTANCE.getTripleRule_Corr();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_RULE__TARGET = eINSTANCE.getTripleRule_Target();
		/**
		 * The meta object literal for the '<em><b>Ms</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_RULE__MS = eINSTANCE.getTripleRule_Ms();
		/**
		 * The meta object literal for the '<em><b>Mt</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_RULE__MT = eINSTANCE.getTripleRule_Mt();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.TripleGraphImpl <em>Triple Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.TripleGraphImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getTripleGraph()
		 * @generated
		 */
		EClass TRIPLE_GRAPH = eINSTANCE.getTripleGraph();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAPH__SOURCE = eINSTANCE.getTripleGraph_Source();
		/**
		 * The meta object literal for the '<em><b>Corr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAPH__CORR = eINSTANCE.getTripleGraph_Corr();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAPH__TARGET = eINSTANCE.getTripleGraph_Target();
		/**
		 * The meta object literal for the '<em><b>Ms</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAPH__MS = eINSTANCE.getTripleGraph_Ms();
		/**
		 * The meta object literal for the '<em><b>Mt</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIPLE_GRAPH__MT = eINSTANCE.getTripleGraph_Mt();
		/**
		 * The meta object literal for the '<em><b>Inv Ms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIPLE_GRAPH___INV_MS__VERTEX = eINSTANCE.getTripleGraph__InvMs__Vertex();
		/**
		 * The meta object literal for the '<em><b>Inv Mt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRIPLE_GRAPH___INV_MT__VERTEX = eINSTANCE.getTripleGraph__InvMt__Vertex();
		/**
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexToVertexMapImpl <em>Vertex To Vertex Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.VertexToVertexMapImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertexToVertexMap()
		 * @generated
		 */
		EClass VERTEX_TO_VERTEX_MAP = eINSTANCE.getVertexToVertexMap();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TO_VERTEX_MAP__KEY = eINSTANCE.getVertexToVertexMap_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX_TO_VERTEX_MAP__VALUE = eINSTANCE.getVertexToVertexMap_Value();

	}

} //GraphgrammarPackage
