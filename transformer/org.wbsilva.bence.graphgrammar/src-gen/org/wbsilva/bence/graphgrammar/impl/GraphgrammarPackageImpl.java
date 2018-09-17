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
import org.wbsilva.bence.graphgrammar.ParsingTree;
import org.wbsilva.bence.graphgrammar.Resolution;
import org.wbsilva.bence.graphgrammar.ResolutionStep;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.SymbolSymbolsPair;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleGraph;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;
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
	private EClass symbolSymbolsPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexToSymbolSymbolsPairMapEClass = null;

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
	private EClass parsingTreeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resolutionEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripleGrammarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripleRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripleGraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexToVertexMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexToStringMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringToVertexMapEClass = null;

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
	public EAttribute getGrammar_Name() {
		return (EAttribute) grammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Alphabet() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Terminals() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Nonterminals() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Rules() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Initial() {
		return (EReference) grammarEClass.getEStructuralFeatures().get(5);
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
	public EOperation getRule__Embed__Graph_Vertex_EList_EMap_boolean() {
		return ruleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRule__Apply__Graph_Vertex_boolean() {
		return ruleEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRule__Derive__Graph_Vertex() {
		return ruleEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRule__Produce__Graph_Vertex() {
		return ruleEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymbolSymbolsPair() {
		return symbolSymbolsPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolSymbolsPair_EdgeLabel() {
		return (EReference) symbolSymbolsPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSymbolSymbolsPair_VertexLabels() {
		return (EReference) symbolSymbolsPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexToSymbolSymbolsPairMap() {
		return vertexToSymbolSymbolsPairMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexToSymbolSymbolsPairMap_Key() {
		return (EReference) vertexToSymbolSymbolsPairMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexToSymbolSymbolsPairMap_Value() {
		return (EReference) vertexToSymbolSymbolsPairMapEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getSymbol_Subscript() {
		return (EAttribute) symbolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSymbol_Superscript() {
		return (EAttribute) symbolEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymbol__Equivalates__Symbol() {
		return symbolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymbol__CompareTo__Symbol() {
		return symbolEClass.getEOperations().get(1);
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
	public EReference getDerivationStep_Rule() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationStep_Vertex() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationStep_Previous() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationStep_Next() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivationStep_Unifier() {
		return (EReference) derivationStepEClass.getEStructuralFeatures().get(4);
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
	public EReference getDerivation_Steps() {
		return (EReference) derivationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParsingTree() {
		return parsingTreeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParsingTree_ZoneVertex() {
		return (EReference) parsingTreeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParsingTree_DerivationStep() {
		return (EReference) parsingTreeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParsingTree_Children() {
		return (EReference) parsingTreeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParsingTree__Derivation() {
		return parsingTreeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolutionStep() {
		return resolutionStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolutionStep_Pac() {
		return (EReference) resolutionStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResolution() {
		return resolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolution_ReferenceIds() {
		return (EReference) resolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResolution_Steps() {
		return (EReference) resolutionEClass.getEStructuralFeatures().get(1);
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
	public EReference getGraph_Vertices() {
		return (EReference) graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraph_Edges() {
		return (EReference) graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Neighborhood__EList() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Neighborhood__Vertex() {
		return graphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__IsomorphicTo__Graph() {
		return graphEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Isomorphism__Graph() {
		return graphEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__InEdges__Vertex() {
		return graphEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__OutEdges__Vertex() {
		return graphEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGraph__Edges__Vertex() {
		return graphEClass.getEOperations().get(6);
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
	public EOperation getVertex__Equivalates__Vertex() {
		return vertexEClass.getEOperations().get(0);
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
	public EReference getZoneVertex_Pac() {
		return (EReference) zoneVertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getZoneVertex__Equivalates__ZoneVertex() {
		return zoneVertexEClass.getEOperations().get(0);
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
	public EReference getEdge_From() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_To() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEdge_Label() {
		return (EReference) edgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__CompareTo__Edge() {
		return edgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripleGrammar() {
		return tripleGrammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTripleGrammar_Name() {
		return (EAttribute) tripleGrammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGrammar_Alphabet() {
		return (EReference) tripleGrammarEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGrammar_Terminals() {
		return (EReference) tripleGrammarEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGrammar_Nonterminals() {
		return (EReference) tripleGrammarEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGrammar_TripleRules() {
		return (EReference) tripleGrammarEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGrammar_Initial() {
		return (EReference) tripleGrammarEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTripleGrammar__Produce__TripleGraph_DerivationStep_boolean_Resolution() {
		return tripleGrammarEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTripleGrammar__Resolve__TripleGraph_Resolution_ResolutionStep_boolean() {
		return tripleGrammarEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripleRule() {
		return tripleRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleRule_Source() {
		return (EReference) tripleRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleRule_Corr() {
		return (EReference) tripleRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleRule_Target() {
		return (EReference) tripleRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleRule_Ms() {
		return (EReference) tripleRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleRule_Mt() {
		return (EReference) tripleRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTripleGraph() {
		return tripleGraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGraph_Source() {
		return (EReference) tripleGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGraph_Corr() {
		return (EReference) tripleGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGraph_Target() {
		return (EReference) tripleGraphEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGraph_Ms() {
		return (EReference) tripleGraphEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTripleGraph_Mt() {
		return (EReference) tripleGraphEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTripleGraph__InvMs__Vertex() {
		return tripleGraphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTripleGraph__InvMt__Vertex() {
		return tripleGraphEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexToVertexMap() {
		return vertexToVertexMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexToVertexMap_Key() {
		return (EReference) vertexToVertexMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexToVertexMap_Value() {
		return (EReference) vertexToVertexMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertexToStringMap() {
		return vertexToStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertexToStringMap_Key() {
		return (EReference) vertexToStringMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVertexToStringMap_Value() {
		return (EAttribute) vertexToStringMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringToVertexMap() {
		return stringToVertexMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringToVertexMap_Key() {
		return (EAttribute) stringToVertexMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringToVertexMap_Value() {
		return (EReference) stringToVertexMapEClass.getEStructuralFeatures().get(1);
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
		createEOperation(ruleEClass, RULE___EMBED__GRAPH_VERTEX_ELIST_EMAP_BOOLEAN);
		createEOperation(ruleEClass, RULE___APPLY__GRAPH_VERTEX_BOOLEAN);
		createEOperation(ruleEClass, RULE___DERIVE__GRAPH_VERTEX);
		createEOperation(ruleEClass, RULE___PRODUCE__GRAPH_VERTEX);

		symbolSymbolsPairEClass = createEClass(SYMBOL_SYMBOLS_PAIR);
		createEReference(symbolSymbolsPairEClass, SYMBOL_SYMBOLS_PAIR__EDGE_LABEL);
		createEReference(symbolSymbolsPairEClass, SYMBOL_SYMBOLS_PAIR__VERTEX_LABELS);

		vertexToSymbolSymbolsPairMapEClass = createEClass(VERTEX_TO_SYMBOL_SYMBOLS_PAIR_MAP);
		createEReference(vertexToSymbolSymbolsPairMapEClass, VERTEX_TO_SYMBOL_SYMBOLS_PAIR_MAP__KEY);
		createEReference(vertexToSymbolSymbolsPairMapEClass, VERTEX_TO_SYMBOL_SYMBOLS_PAIR_MAP__VALUE);

		symbolEClass = createEClass(SYMBOL);
		createEAttribute(symbolEClass, SYMBOL__NAME);
		createEAttribute(symbolEClass, SYMBOL__SUBSCRIPT);
		createEAttribute(symbolEClass, SYMBOL__SUPERSCRIPT);
		createEOperation(symbolEClass, SYMBOL___EQUIVALATES__SYMBOL);
		createEOperation(symbolEClass, SYMBOL___COMPARE_TO__SYMBOL);

		derivationStepEClass = createEClass(DERIVATION_STEP);
		createEReference(derivationStepEClass, DERIVATION_STEP__RULE);
		createEReference(derivationStepEClass, DERIVATION_STEP__VERTEX);
		createEReference(derivationStepEClass, DERIVATION_STEP__PREVIOUS);
		createEReference(derivationStepEClass, DERIVATION_STEP__NEXT);
		createEReference(derivationStepEClass, DERIVATION_STEP__UNIFIER);

		derivationEClass = createEClass(DERIVATION);
		createEReference(derivationEClass, DERIVATION__STEPS);

		parsingTreeEClass = createEClass(PARSING_TREE);
		createEReference(parsingTreeEClass, PARSING_TREE__ZONE_VERTEX);
		createEReference(parsingTreeEClass, PARSING_TREE__DERIVATION_STEP);
		createEReference(parsingTreeEClass, PARSING_TREE__CHILDREN);
		createEOperation(parsingTreeEClass, PARSING_TREE___DERIVATION);

		resolutionStepEClass = createEClass(RESOLUTION_STEP);
		createEReference(resolutionStepEClass, RESOLUTION_STEP__PAC);

		resolutionEClass = createEClass(RESOLUTION);
		createEReference(resolutionEClass, RESOLUTION__REFERENCE_IDS);
		createEReference(resolutionEClass, RESOLUTION__STEPS);

		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__VERTICES);
		createEReference(graphEClass, GRAPH__EDGES);
		createEOperation(graphEClass, GRAPH___NEIGHBORHOOD__ELIST);
		createEOperation(graphEClass, GRAPH___NEIGHBORHOOD__VERTEX);
		createEOperation(graphEClass, GRAPH___ISOMORPHIC_TO__GRAPH);
		createEOperation(graphEClass, GRAPH___ISOMORPHISM__GRAPH);
		createEOperation(graphEClass, GRAPH___IN_EDGES__VERTEX);
		createEOperation(graphEClass, GRAPH___OUT_EDGES__VERTEX);
		createEOperation(graphEClass, GRAPH___EDGES__VERTEX);

		vertexEClass = createEClass(VERTEX);
		createEAttribute(vertexEClass, VERTEX__ID);
		createEReference(vertexEClass, VERTEX__LABEL);
		createEOperation(vertexEClass, VERTEX___EQUIVALATES__VERTEX);

		zoneVertexEClass = createEClass(ZONE_VERTEX);
		createEReference(zoneVertexEClass, ZONE_VERTEX__VERTICES);
		createEReference(zoneVertexEClass, ZONE_VERTEX__PAC);
		createEOperation(zoneVertexEClass, ZONE_VERTEX___EQUIVALATES__ZONEVERTEX);

		edgeEClass = createEClass(EDGE);
		createEReference(edgeEClass, EDGE__FROM);
		createEReference(edgeEClass, EDGE__TO);
		createEReference(edgeEClass, EDGE__LABEL);
		createEOperation(edgeEClass, EDGE___COMPARE_TO__EDGE);

		tripleGrammarEClass = createEClass(TRIPLE_GRAMMAR);
		createEAttribute(tripleGrammarEClass, TRIPLE_GRAMMAR__NAME);
		createEReference(tripleGrammarEClass, TRIPLE_GRAMMAR__ALPHABET);
		createEReference(tripleGrammarEClass, TRIPLE_GRAMMAR__TERMINALS);
		createEReference(tripleGrammarEClass, TRIPLE_GRAMMAR__NONTERMINALS);
		createEReference(tripleGrammarEClass, TRIPLE_GRAMMAR__TRIPLE_RULES);
		createEReference(tripleGrammarEClass, TRIPLE_GRAMMAR__INITIAL);
		createEOperation(tripleGrammarEClass, TRIPLE_GRAMMAR___PRODUCE__TRIPLEGRAPH_DERIVATIONSTEP_BOOLEAN_RESOLUTION);
		createEOperation(tripleGrammarEClass, TRIPLE_GRAMMAR___RESOLVE__TRIPLEGRAPH_RESOLUTION_RESOLUTIONSTEP_BOOLEAN);

		tripleRuleEClass = createEClass(TRIPLE_RULE);
		createEReference(tripleRuleEClass, TRIPLE_RULE__SOURCE);
		createEReference(tripleRuleEClass, TRIPLE_RULE__CORR);
		createEReference(tripleRuleEClass, TRIPLE_RULE__TARGET);
		createEReference(tripleRuleEClass, TRIPLE_RULE__MS);
		createEReference(tripleRuleEClass, TRIPLE_RULE__MT);

		tripleGraphEClass = createEClass(TRIPLE_GRAPH);
		createEReference(tripleGraphEClass, TRIPLE_GRAPH__SOURCE);
		createEReference(tripleGraphEClass, TRIPLE_GRAPH__CORR);
		createEReference(tripleGraphEClass, TRIPLE_GRAPH__TARGET);
		createEReference(tripleGraphEClass, TRIPLE_GRAPH__MS);
		createEReference(tripleGraphEClass, TRIPLE_GRAPH__MT);
		createEOperation(tripleGraphEClass, TRIPLE_GRAPH___INV_MS__VERTEX);
		createEOperation(tripleGraphEClass, TRIPLE_GRAPH___INV_MT__VERTEX);

		vertexToVertexMapEClass = createEClass(VERTEX_TO_VERTEX_MAP);
		createEReference(vertexToVertexMapEClass, VERTEX_TO_VERTEX_MAP__KEY);
		createEReference(vertexToVertexMapEClass, VERTEX_TO_VERTEX_MAP__VALUE);

		vertexToStringMapEClass = createEClass(VERTEX_TO_STRING_MAP);
		createEReference(vertexToStringMapEClass, VERTEX_TO_STRING_MAP__KEY);
		createEAttribute(vertexToStringMapEClass, VERTEX_TO_STRING_MAP__VALUE);

		stringToVertexMapEClass = createEClass(STRING_TO_VERTEX_MAP);
		createEAttribute(stringToVertexMapEClass, STRING_TO_VERTEX_MAP__KEY);
		createEReference(stringToVertexMapEClass, STRING_TO_VERTEX_MAP__VALUE);
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

		EOperation op = initEOperation(getGrammar__Derives__Graph_Graph_Vertex_Graph(), this.getDerivationStep(),
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
		initEReference(getRule_Embedding(), this.getVertexToSymbolSymbolsPairMap(), null, "embedding", null, 0, -1,
				Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Pac(), this.getVertex(), null, "pac", null, 0, -1, Rule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getRule__Embed__Graph_Vertex_EList_EMap_boolean(), this.getEdge(), "embed", 0, -1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEdge(), "edges", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertexToVertexMap(), "unifier", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "pacs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRule__Apply__Graph_Vertex_boolean(), this.getVertexToVertexMap(), "apply", 0, -1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "pacs", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRule__Derive__Graph_Vertex(), this.getVertexToVertexMap(), "derive", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRule__Produce__Graph_Vertex(), this.getVertexToVertexMap(), "produce", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getGraph(), "graph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(symbolSymbolsPairEClass, SymbolSymbolsPair.class, "SymbolSymbolsPair", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSymbolSymbolsPair_EdgeLabel(), this.getSymbol(), null, "edgeLabel", null, 0, 1,
				SymbolSymbolsPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSymbolSymbolsPair_VertexLabels(), this.getSymbol(), null, "vertexLabels", null, 0, -1,
				SymbolSymbolsPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(vertexToSymbolSymbolsPairMapEClass, Map.Entry.class, "VertexToSymbolSymbolsPairMap", !IS_ABSTRACT,
				!IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertexToSymbolSymbolsPairMap_Key(), this.getVertex(), null, "key", null, 0, 1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertexToSymbolSymbolsPairMap_Value(), this.getSymbolSymbolsPair(), null, "value", null, 0, -1,
				Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSymbol_Subscript(), ecorePackage.getEString(), "subscript", null, 0, -1, Symbol.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSymbol_Superscript(), ecorePackage.getEString(), "superscript", null, 0, -1, Symbol.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getSymbol__Equivalates__Symbol(), ecorePackage.getEBoolean(), "equivalates", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSymbol(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymbol__CompareTo__Symbol(), ecorePackage.getEInt(), "compareTo", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getSymbol(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(derivationStepEClass, DerivationStep.class, "DerivationStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivationStep_Rule(), this.getRule(), null, "rule", null, 0, 1, DerivationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationStep_Vertex(), this.getVertex(), null, "vertex", null, 0, 1, DerivationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationStep_Previous(), this.getGraph(), null, "previous", null, 0, 1,
				DerivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationStep_Next(), this.getGraph(), null, "next", null, 0, 1, DerivationStep.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDerivationStep_Unifier(), this.getVertexToVertexMap(), null, "unifier", null, 0, -1,
				DerivationStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(derivationEClass, Derivation.class, "Derivation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivation_Steps(), this.getDerivationStep(), null, "steps", null, 0, -1, Derivation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parsingTreeEClass, ParsingTree.class, "ParsingTree", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParsingTree_ZoneVertex(), this.getZoneVertex(), null, "zoneVertex", null, 0, 1,
				ParsingTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParsingTree_DerivationStep(), this.getDerivationStep(), null, "derivationStep", null, 0, 1,
				ParsingTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParsingTree_Children(), this.getParsingTree(), null, "children", null, 0, -1,
				ParsingTree.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getParsingTree__Derivation(), this.getDerivation(), "derivation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(resolutionStepEClass, ResolutionStep.class, "ResolutionStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolutionStep_Pac(), this.getVertexToStringMap(), null, "pac", null, 0, -1,
				ResolutionStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(resolutionEClass, Resolution.class, "Resolution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResolution_ReferenceIds(), this.getStringToVertexMap(), null, "referenceIds", null, 0, -1,
				Resolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResolution_Steps(), this.getResolutionStep(), null, "steps", null, 0, -1, Resolution.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEReference(getGraph_Edges(), this.getEdge(), null, "edges", null, 0, -1, Graph.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getGraph__Neighborhood__EList(), this.getVertex(), "neighborhood", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertices", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGraph__Neighborhood__Vertex(), this.getVertex(), "neighborhood", 0, -1, IS_UNIQUE,
				!IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__IsomorphicTo__Graph(), ecorePackage.getEBoolean(), "isomorphicTo", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraph(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__Isomorphism__Graph(), this.getVertexToVertexMap(), "isomorphism", 0, -1,
				IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getGraph(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__InEdges__Vertex(), this.getEdge(), "inEdges", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__OutEdges__Vertex(), this.getEdge(), "outEdges", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGraph__Edges__Vertex(), this.getEdge(), "edges", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "vertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVertex_Id(), ecorePackage.getEString(), "id", null, 0, 1, Vertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertex_Label(), this.getSymbol(), null, "label", null, 0, 1, Vertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getVertex__Equivalates__Vertex(), ecorePackage.getEBoolean(), "equivalates", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVertex(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(zoneVertexEClass, ZoneVertex.class, "ZoneVertex", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZoneVertex_Vertices(), this.getVertex(), null, "vertices", null, 0, -1, ZoneVertex.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZoneVertex_Pac(), this.getVertex(), null, "pac", null, 0, -1, ZoneVertex.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		op = initEOperation(getZoneVertex__Equivalates__ZoneVertex(), ecorePackage.getEBoolean(), "equivalates", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getZoneVertex(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEdge_From(), this.getVertex(), null, "from", null, 0, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEdge_To(), this.getVertex(), null, "to", null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEdge_Label(), this.getSymbol(), null, "label", null, 0, 1, Edge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getEdge__CompareTo__Edge(), ecorePackage.getEInt(), "compareTo", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getEdge(), "other", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tripleGrammarEClass, TripleGrammar.class, "TripleGrammar", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTripleGrammar_Name(), ecorePackage.getEString(), "name", null, 0, 1, TripleGrammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleGrammar_Alphabet(), this.getSymbol(), null, "alphabet", null, 0, -1,
				TripleGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTripleGrammar_Terminals(), this.getSymbol(), null, "terminals", null, 0, -1,
				TripleGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTripleGrammar_Nonterminals(), this.getSymbol(), null, "nonterminals", null, 0, -1,
				TripleGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTripleGrammar_TripleRules(), this.getTripleRule(), null, "tripleRules", null, 0, -1,
				TripleGrammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTripleGrammar_Initial(), this.getSymbol(), null, "initial", null, 0, 1, TripleGrammar.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTripleGrammar__Produce__TripleGraph_DerivationStep_boolean_Resolution(),
				this.getResolutionStep(), "produce", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTripleGraph(), "tripleGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDerivationStep(), "derivationStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "forward", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResolution(), "resolution", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTripleGrammar__Resolve__TripleGraph_Resolution_ResolutionStep_boolean(), null, "resolve",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTripleGraph(), "tripleGraph", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResolution(), "resolution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getResolutionStep(), "resolutionStep", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tripleRuleEClass, TripleRule.class, "TripleRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripleRule_Source(), this.getRule(), null, "source", null, 0, 1, TripleRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleRule_Corr(), this.getRule(), null, "corr", null, 0, 1, TripleRule.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getTripleRule_Target(), this.getRule(), null, "target", null, 0, 1, TripleRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleRule_Ms(), this.getVertexToVertexMap(), null, "ms", null, 0, -1, TripleRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTripleRule_Mt(), this.getVertexToVertexMap(), null, "mt", null, 0, -1, TripleRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tripleGraphEClass, TripleGraph.class, "TripleGraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTripleGraph_Source(), this.getGraph(), null, "source", null, 0, 1, TripleGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleGraph_Corr(), this.getGraph(), null, "corr", null, 0, 1, TripleGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleGraph_Target(), this.getGraph(), null, "target", null, 0, 1, TripleGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleGraph_Ms(), this.getVertexToVertexMap(), null, "ms", null, 0, -1, TripleGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTripleGraph_Mt(), this.getVertexToVertexMap(), null, "mt", null, 0, -1, TripleGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTripleGraph__InvMs__Vertex(), this.getVertex(), "invMs", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "sourceVertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTripleGraph__InvMt__Vertex(), this.getVertex(), "invMt", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getVertex(), "targetVertex", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexToVertexMapEClass, Map.Entry.class, "VertexToVertexMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertexToVertexMap_Key(), this.getVertex(), null, "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVertexToVertexMap_Value(), this.getVertex(), null, "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vertexToStringMapEClass, Map.Entry.class, "VertexToStringMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertexToStringMap_Key(), this.getVertex(), null, "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVertexToStringMap_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringToVertexMapEClass, Map.Entry.class, "StringToVertexMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringToVertexMap_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStringToVertexMap_Value(), this.getVertex(), null, "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GraphgrammarPackageImpl
