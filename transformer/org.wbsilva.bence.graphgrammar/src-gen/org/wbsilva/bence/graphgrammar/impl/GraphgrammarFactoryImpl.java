/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.wbsilva.bence.graphgrammar.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphgrammarFactoryImpl extends EFactoryImpl implements GraphgrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphgrammarFactory init() {
		try {
			GraphgrammarFactory theGraphgrammarFactory = (GraphgrammarFactory) EPackage.Registry.INSTANCE
					.getEFactory(GraphgrammarPackage.eNS_URI);
			if (theGraphgrammarFactory != null) {
				return theGraphgrammarFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphgrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgrammarFactoryImpl() {
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
		case GraphgrammarPackage.GRAMMAR:
			return createGrammar();
		case GraphgrammarPackage.RULE:
			return createRule();
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR:
			return createSymbolSymbolsPair();
		case GraphgrammarPackage.VERTEX_TO_SYMBOL_SYMBOLS_PAIR_MAP:
			return (EObject) createVertexToSymbolSymbolsPairMap();
		case GraphgrammarPackage.SYMBOL:
			return createSymbol();
		case GraphgrammarPackage.DERIVATION_STEP:
			return createDerivationStep();
		case GraphgrammarPackage.DERIVATION:
			return createDerivation();
		case GraphgrammarPackage.PARSING_TREE:
			return createParsingTree();
		case GraphgrammarPackage.RESOLUTION_STEP:
			return createResolutionStep();
		case GraphgrammarPackage.RESOLUTION:
			return createResolution();
		case GraphgrammarPackage.GRAPH:
			return createGraph();
		case GraphgrammarPackage.VERTEX:
			return createVertex();
		case GraphgrammarPackage.ZONE_VERTEX:
			return createZoneVertex();
		case GraphgrammarPackage.EDGE:
			return createEdge();
		case GraphgrammarPackage.TRIPLE_GRAMMAR:
			return createTripleGrammar();
		case GraphgrammarPackage.TRIPLE_RULE:
			return createTripleRule();
		case GraphgrammarPackage.TRIPLE_GRAPH:
			return createTripleGraph();
		case GraphgrammarPackage.VERTEX_TO_VERTEX_MAP:
			return (EObject) createVertexToVertexMap();
		case GraphgrammarPackage.VERTEX_TO_STRING_MAP:
			return (EObject) createVertexToStringMap();
		case GraphgrammarPackage.STRING_TO_VERTEX_MAP:
			return (EObject) createStringToVertexMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolSymbolsPair createSymbolSymbolsPair() {
		SymbolSymbolsPairImpl symbolSymbolsPair = new SymbolSymbolsPairImpl();
		return symbolSymbolsPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Vertex, EList<SymbolSymbolsPair>> createVertexToSymbolSymbolsPairMap() {
		VertexToSymbolSymbolsPairMapImpl vertexToSymbolSymbolsPairMap = new VertexToSymbolSymbolsPairMapImpl();
		return vertexToSymbolSymbolsPairMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol createSymbol() {
		SymbolImpl symbol = new SymbolImpl();
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivationStep createDerivationStep() {
		DerivationStepImpl derivationStep = new DerivationStepImpl();
		return derivationStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Derivation createDerivation() {
		DerivationImpl derivation = new DerivationImpl();
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParsingTree createParsingTree() {
		ParsingTreeImpl parsingTree = new ParsingTreeImpl();
		return parsingTree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResolutionStep createResolutionStep() {
		ResolutionStepImpl resolutionStep = new ResolutionStepImpl();
		return resolutionStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resolution createResolution() {
		ResolutionImpl resolution = new ResolutionImpl();
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZoneVertex createZoneVertex() {
		ZoneVertexImpl zoneVertex = new ZoneVertexImpl();
		return zoneVertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleGrammar createTripleGrammar() {
		TripleGrammarImpl tripleGrammar = new TripleGrammarImpl();
		return tripleGrammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleRule createTripleRule() {
		TripleRuleImpl tripleRule = new TripleRuleImpl();
		return tripleRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TripleGraph createTripleGraph() {
		TripleGraphImpl tripleGraph = new TripleGraphImpl();
		return tripleGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Vertex, Vertex> createVertexToVertexMap() {
		VertexToVertexMapImpl vertexToVertexMap = new VertexToVertexMapImpl();
		return vertexToVertexMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<Vertex, String> createVertexToStringMap() {
		VertexToStringMapImpl vertexToStringMap = new VertexToStringMapImpl();
		return vertexToStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Vertex> createStringToVertexMap() {
		StringToVertexMapImpl stringToVertexMap = new StringToVertexMapImpl();
		return stringToVertexMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgrammarPackage getGraphgrammarPackage() {
		return (GraphgrammarPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphgrammarPackage getPackage() {
		return GraphgrammarPackage.eINSTANCE;
	}

} //GraphgrammarFactoryImpl
