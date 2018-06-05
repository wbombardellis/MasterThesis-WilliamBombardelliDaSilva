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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR:
			return createVertexLabelPair();
		case GraphgrammarPackage.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP:
			return (EObject) createVertexLabelPairToSymbolMap();
		case GraphgrammarPackage.SYMBOL:
			return createSymbol();
		case GraphgrammarPackage.DERIVATION_STEP:
			return createDerivationStep();
		case GraphgrammarPackage.DERIVATION:
			return createDerivation();
		case GraphgrammarPackage.GRAPH:
			return createGraph();
		case GraphgrammarPackage.VERTEX:
			return createVertex();
		case GraphgrammarPackage.ZONE_VERTEX:
			return createZoneVertex();
		case GraphgrammarPackage.EDGE:
			return createEdge();
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
	public VertexLabelPair createVertexLabelPair() {
		VertexLabelPairImpl vertexLabelPair = new VertexLabelPairImpl();
		return vertexLabelPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<VertexLabelPair, EList<Symbol>> createVertexLabelPairToSymbolMap() {
		VertexLabelPairToSymbolMapImpl vertexLabelPairToSymbolMap = new VertexLabelPairToSymbolMapImpl();
		return vertexLabelPairToSymbolMap;
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
