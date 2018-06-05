/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.wbsilva.bence.graphgrammar.Derivation;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.VertexLabelPair;
import org.wbsilva.bence.graphgrammar.ZoneVertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphgrammarPackageImpl extends EPackageImpl implements GraphgrammarPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexLabelPairEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexLabelPairToSymbolMapEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symbolEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationStepEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoneVertexEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphgrammarPackageImpl() {
		super(eNS_URI, GraphgrammarFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GraphgrammarPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphgrammarPackage init() {
		if (isInited)
			return (GraphgrammarPackage) EPackage.Registry.INSTANCE.getEPackage(GraphgrammarPackage.eNS_URI);

		// Obtain or create and register package
		GraphgrammarPackageImpl theGraphgrammarPackage = (GraphgrammarPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof GraphgrammarPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new GraphgrammarPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theGraphgrammarPackage.createPackageContents();

		// Initialize created meta-data
		theGraphgrammarPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphgrammarPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphgrammarPackage.eNS_URI, theGraphgrammarPackage);
		return theGraphgrammarPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrammar() {
		return grammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammar_Id() {
		return (EAttribute) grammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammar_Name() {
		return (EAttribute) grammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Alphabet() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Terminals() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Nonterminals() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Rules() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Initial() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGrammar__Derives__Graph_Graph_Vertex_Graph() {
		return grammarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Id() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Name() {
		return (EAttribute) ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Lhs() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Rhs() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Embedding() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Pac() {
		return (EReference) ruleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexLabelPair() {
		return vertexLabelPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexLabelPair_Vertex() {
		return (EReference) vertexLabelPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexLabelPair_EdgeLabel() {
		return (EReference) vertexLabelPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexLabelPairToSymbolMap() {
		return vertexLabelPairToSymbolMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexLabelPairToSymbolMap_Key() {
		return (EReference) vertexLabelPairToSymbolMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexLabelPairToSymbolMap_Value() {
		return (EReference) vertexLabelPairToSymbolMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbol() {
		return symbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbol_Name() {
		return (EAttribute) symbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivationStep() {
		return derivationStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivationStep_Id() {
		return (EAttribute) derivationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationStep_Rule() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationStep_Vertex() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivation() {
		return derivationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDerivation_Id() {
		return (EAttribute) derivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivation_Steps() {
		return (EReference) derivationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraph_Id() {
		return (EAttribute) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Vertices() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Edges() {
		return (EReference) graphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Neighbors__EList() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertex_Id() {
		return (EAttribute) vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Label() {
		return (EReference) vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoneVertex() {
		return zoneVertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getZoneVertex_Vertices() {
		return (EReference) zoneVertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Id() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_From() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_To() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Label() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgrammarFactory getGraphgrammarFactory() {
		return (GraphgrammarFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		grammarEClass = createEClass(GRAMMAR);
		createEAttribute(grammarEClass, GRAMMAR__ID);
		createEAttribute(grammarEClass, GRAMMAR__NAME);
		createEReference(grammarEClass, GRAMMAR__ALPHABET);
		createEReference(grammarEClass, GRAMMAR__TERMINALS);
		createEReference(grammarEClass, GRAMMAR__NONTERMINALS);
		createEReference(grammarEClass, GRAMMAR__RULES);
		createEReference(grammarEClass, GRAMMAR__INITIAL);
		createEOperation(grammarEClass, GRAMMAR___DERIVES__GRAPH_GRAPH_VERTEX_GRAPH);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__ID);
		createEAttribute(ruleEClass, RULE__NAME);
		createEReference(ruleEClass, RULE__LHS);
		createEReference(ruleEClass, RULE__RHS);
		createEReference(ruleEClass, RULE__EMBEDDING);
		createEReference(ruleEClass, RULE__PAC);

		vertexLabelPairEClass = createEClass(VERTEX_LABEL_PAIR);
		createEReference(vertexLabelPairEClass, VERTEX_LABEL_PAIR__VERTEX);
		createEReference(vertexLabelPairEClass, VERTEX_LABEL_PAIR__EDGE_LABEL);

		vertexLabelPairToSymbolMapEClass = createEClass(VERTEX_LABEL_PAIR_TO_SYMBOL_MAP);
		createEReference(vertexLabelPairToSymbolMapEClass, VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__KEY);
		createEReference(vertexLabelPairToSymbolMapEClass, VERTEX_LABEL_PAIR_TO_SYMBOL_MAP__VALUE);

		symbolEClass = createEClass(SYMBOL);
		createEAttribute(symbolEClass, SYMBOL__NAME);

		derivationStepEClass = createEClass(DERIVATION_STEP);
		createEAttribute(derivationStepEClass, DERIVATION_STEP__ID);
		createEReference(derivationStepEClass, DERIVATION_STEP__RULE);
		createEReference(derivationStepEClass, DERIVATION_STEP__VERTEX);

		derivationEClass = createEClass(DERIVATION);
		createEAttribute(derivationEClass, DERIVATION__ID);
		createEReference(derivationEClass, DERIVATION__STEPS);

		graphEClass = createEClass(GRAPH);
		createEAttribute(graphEClass, GRAPH__ID);
		createEReference(graphEClass, GRAPH__VERTICES);
		createEReference(graphEClass, GRAPH__EDGES);
		createEOperation(graphEClass, GRAPH___NEIGHBORS__ELIST);

		vertexEClass = createEClass(VERTEX);
		createEAttribute(vertexEClass, VERTEX__ID);
		createEReference(vertexEClass, VERTEX__LABEL);

		zoneVertexEClass = createEClass(ZONE_VERTEX);
		createEReference(zoneVertexEClass, ZONE_VERTEX__VERTICES);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__ID);
		createEReference(edgeEClass, EDGE__FROM);
		createEReference(edgeEClass, EDGE__TO);
		createEReference(edgeEClass, EDGE__LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		zoneVertexEClass.getESuperTypes().add(this.getVertex());

		// Initialize classes, features, and operations; add parameters
		initEClass(grammarEClass, Grammar.class, "Grammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrammar_Id(), ecorePackage.getEString(), "id", "", 0, 1, Grammar.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGrammar_Name(), ecorePackage.getEString(), "name", null, 0, 1, Grammar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammar_Alphabet(), this.getSymbol(), null, "alphabet", null, 0, -1, Grammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGrammar_Terminals(), this.getSymbol(), null, "terminals", null, 0, -1, Grammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGrammar_Nonterminals(), this.getSymbol(), null, "nonterminals", null, 0, -1, Grammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGrammar_Rules(), this.getRule(), null, "rules", null, 0, -1, Grammar.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getGrammar_Initial(), this.getSymbol(), null, "initial", null, 0, 1, Grammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGrammar__Derives__Graph_Graph_Vertex_Graph(), ecorePackage.getEBoolean(),
				"derives", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "prev", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "next", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "rhs", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Id(), ecorePackage.getEString(), "id", null, 0, 1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Lhs(), this.getSymbol(), null, "lhs", null, 0, 1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRule_Rhs(), this.getGraph(), null, "rhs", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Embedding(), this.getVertexLabelPairToSymbolMap(), null, "embedding", null, 0, -1,
				Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pac(), this.getVertex(), null, "pac", null, 0, -1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(vertexLabelPairEClass, VertexLabelPair.class, "VertexLabelPair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertexLabelPair_Vertex(), this.getVertex(), null, "vertex", null, 0, 1, VertexLabelPair.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertexLabelPair_EdgeLabel(), this.getSymbol(), null, "edgeLabel", null, 0, 1,
				VertexLabelPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertexLabelPairToSymbolMapEClass, Map.Entry.class, "VertexLabelPairToSymbolMap", !IS_ABSTRACT,
				!IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertexLabelPairToSymbolMap_Key(), this.getVertexLabelPair(), null, "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertexLabelPairToSymbolMap_Value(), this.getSymbol(), null, "value", null, 0, -1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivationStepEClass, DerivationStep.class, "DerivationStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivationStep_Id(), ecorePackage.getEString(), "id", null, 0, 1, DerivationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationStep_Rule(), this.getRule(), null, "rule", null, 0, 1, DerivationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationStep_Vertex(), this.getVertex(), null, "vertex", null, 0, 1, DerivationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivationEClass, Derivation.class, "Derivation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDerivation_Id(), ecorePackage.getEString(), "id", null, 0, 1, Derivation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivation_Steps(), this.getDerivationStep(), null, "steps", null, 0, -1, Derivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraph_Id(), ecorePackage.getEString(), "id", null, 0, 1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getGraph_Edges(), this.getEdge(), null, "edges", null, 0, -1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getGraph__Neighbors__EList(), this.getVertex(), "neighbors", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertices", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertex_Id(), ecorePackage.getEString(), "id", null, 0, 1, Vertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_Label(), this.getSymbol(), null, "label", null, 0, 1, Vertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(zoneVertexEClass, ZoneVertex.class, "ZoneVertex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneVertex_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, ZoneVertex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Id(), ecorePackage.getEString(), "id", null, 0, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_From(), this.getVertex(), null, "from", null, 0, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEdge_To(), this.getVertex(), null, "to", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Label(), this.getSymbol(), null, "label", null, 0, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphgrammarPackageImpl
