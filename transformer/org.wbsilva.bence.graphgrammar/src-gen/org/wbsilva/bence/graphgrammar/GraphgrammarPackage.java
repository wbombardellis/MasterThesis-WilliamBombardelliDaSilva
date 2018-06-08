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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NAME = 1;

	/**
	 * The feature id for the '<em><b>Alphabet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__ALPHABET = 2;

	/**
	 * The feature id for the '<em><b>Terminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__TERMINALS = 3;

	/**
	 * The feature id for the '<em><b>Nonterminals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NONTERMINALS = 4;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULES = 5;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__INITIAL = 6;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 7;

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
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__ID = 0;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__RULE = 1;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP__VERTEX = 2;

	/**
	 * The number of structural features of the '<em>Derivation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_STEP_FEATURE_COUNT = 3;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION__STEPS = 1;

	/**
	 * The number of structural features of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Derivation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__VERTICES = 1;

	/**
	 * The feature id for the '<em><b>Edges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__EDGES = 2;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Neighbors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___NEIGHBORS__ELIST = 0;

	/**
	 * The operation id for the '<em>Isomorphic To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___ISOMORPHIC_TO__GRAPH = 1;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.VertexImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 8;

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
	int ZONE_VERTEX = 9;

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
	 * The number of operations of the '<em>Zone Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZONE_VERTEX_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.wbsilva.bence.graphgrammar.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.wbsilva.bence.graphgrammar.impl.EdgeImpl
	 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TO = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = 0;

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
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Grammar#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Grammar#getId()
	 * @see #getGrammar()
	 * @generated
	 */
	EAttribute getGrammar_Id();

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
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.DerivationStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep#getId()
	 * @see #getDerivationStep()
	 * @generated
	 */
	EAttribute getDerivationStep_Id();

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
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derivation</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Derivation
	 * @generated
	 */
	EClass getDerivation();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Derivation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Derivation#getId()
	 * @see #getDerivation()
	 * @generated
	 */
	EAttribute getDerivation_Id();

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
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Graph#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Graph#getId()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_Id();

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
	 * Returns the meta object for the '{@link org.wbsilva.bence.graphgrammar.Graph#neighbors(org.eclipse.emf.common.util.EList) <em>Neighbors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Neighbors</em>' operation.
	 * @see org.wbsilva.bence.graphgrammar.Graph#neighbors(org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getGraph__Neighbors__EList();

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
	 * Returns the meta object for class '{@link org.wbsilva.bence.graphgrammar.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link org.wbsilva.bence.graphgrammar.Edge#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.wbsilva.bence.graphgrammar.Edge#getId()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Id();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR__ID = eINSTANCE.getGrammar_Id();
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION_STEP__ID = eINSTANCE.getDerivationStep_Id();
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
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.DerivationImpl <em>Derivation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.DerivationImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getDerivation()
		 * @generated
		 */
		EClass DERIVATION = eINSTANCE.getDerivation();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DERIVATION__ID = eINSTANCE.getDerivation_Id();
		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVATION__STEPS = eINSTANCE.getDerivation_Steps();
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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__ID = eINSTANCE.getGraph_Id();
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
		 * The meta object literal for the '<em><b>Neighbors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___NEIGHBORS__ELIST = eINSTANCE.getGraph__Neighbors__EList();
		/**
		 * The meta object literal for the '<em><b>Isomorphic To</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___ISOMORPHIC_TO__GRAPH = eINSTANCE.getGraph__IsomorphicTo__Graph();
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
		 * The meta object literal for the '{@link org.wbsilva.bence.graphgrammar.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.wbsilva.bence.graphgrammar.impl.EdgeImpl
		 * @see org.wbsilva.bence.graphgrammar.impl.GraphgrammarPackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__ID = eINSTANCE.getEdge_Id();
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

	}

} //GraphgrammarPackage
