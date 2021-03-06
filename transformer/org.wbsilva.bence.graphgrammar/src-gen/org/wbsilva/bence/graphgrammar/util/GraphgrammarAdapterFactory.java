/**
 */
package org.wbsilva.bence.graphgrammar.util;

import java.util.Map;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.wbsilva.bence.graphgrammar.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage
 * @generated
 */
public class GraphgrammarAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphgrammarPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgrammarAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GraphgrammarPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphgrammarSwitch<Adapter> modelSwitch = new GraphgrammarSwitch<Adapter>() {
		@Override
		public Adapter caseGrammar(Grammar object) {
			return createGrammarAdapter();
		}

		@Override
		public Adapter caseRule(Rule object) {
			return createRuleAdapter();
		}

		@Override
		public Adapter caseSymbolSymbolsPair(SymbolSymbolsPair object) {
			return createSymbolSymbolsPairAdapter();
		}

		@Override
		public Adapter caseVertexToSymbolSymbolsPairMap(Map.Entry<Vertex, EList<SymbolSymbolsPair>> object) {
			return createVertexToSymbolSymbolsPairMapAdapter();
		}

		@Override
		public Adapter caseSymbol(Symbol object) {
			return createSymbolAdapter();
		}

		@Override
		public Adapter caseDerivationStep(DerivationStep object) {
			return createDerivationStepAdapter();
		}

		@Override
		public Adapter caseDerivation(Derivation object) {
			return createDerivationAdapter();
		}

		@Override
		public Adapter caseParsingTree(ParsingTree object) {
			return createParsingTreeAdapter();
		}

		@Override
		public Adapter caseResolutionStep(ResolutionStep object) {
			return createResolutionStepAdapter();
		}

		@Override
		public Adapter caseResolution(Resolution object) {
			return createResolutionAdapter();
		}

		@Override
		public Adapter caseGraph(Graph object) {
			return createGraphAdapter();
		}

		@Override
		public Adapter caseVertex(Vertex object) {
			return createVertexAdapter();
		}

		@Override
		public Adapter caseZoneVertex(ZoneVertex object) {
			return createZoneVertexAdapter();
		}

		@Override
		public Adapter caseEdge(Edge object) {
			return createEdgeAdapter();
		}

		@Override
		public Adapter caseTripleGrammar(TripleGrammar object) {
			return createTripleGrammarAdapter();
		}

		@Override
		public Adapter caseTripleRule(TripleRule object) {
			return createTripleRuleAdapter();
		}

		@Override
		public Adapter caseTripleGraph(TripleGraph object) {
			return createTripleGraphAdapter();
		}

		@Override
		public Adapter caseVertexToVertexMap(Map.Entry<Vertex, Vertex> object) {
			return createVertexToVertexMapAdapter();
		}

		@Override
		public Adapter caseVertexToStringMap(Map.Entry<Vertex, String> object) {
			return createVertexToStringMapAdapter();
		}

		@Override
		public Adapter caseStringToVertexMap(Map.Entry<String, Vertex> object) {
			return createStringToVertexMapAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Grammar
	 * @generated
	 */
	public Adapter createGrammarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.SymbolSymbolsPair <em>Symbol Symbols Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.SymbolSymbolsPair
	 * @generated
	 */
	public Adapter createSymbolSymbolsPairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Vertex To Symbol Symbols Pair Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createVertexToSymbolSymbolsPairMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Symbol
	 * @generated
	 */
	public Adapter createSymbolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.DerivationStep <em>Derivation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.DerivationStep
	 * @generated
	 */
	public Adapter createDerivationStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Derivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Derivation
	 * @generated
	 */
	public Adapter createDerivationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.ParsingTree <em>Parsing Tree</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.ParsingTree
	 * @generated
	 */
	public Adapter createParsingTreeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.ResolutionStep <em>Resolution Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.ResolutionStep
	 * @generated
	 */
	public Adapter createResolutionStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Resolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Resolution
	 * @generated
	 */
	public Adapter createResolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Graph
	 * @generated
	 */
	public Adapter createGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.ZoneVertex <em>Zone Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.ZoneVertex
	 * @generated
	 */
	public Adapter createZoneVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.Edge
	 * @generated
	 */
	public Adapter createEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.TripleGrammar <em>Triple Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.TripleGrammar
	 * @generated
	 */
	public Adapter createTripleGrammarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.TripleRule <em>Triple Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.TripleRule
	 * @generated
	 */
	public Adapter createTripleRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.wbsilva.bence.graphgrammar.TripleGraph <em>Triple Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.wbsilva.bence.graphgrammar.TripleGraph
	 * @generated
	 */
	public Adapter createTripleGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Vertex To Vertex Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createVertexToVertexMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Vertex To String Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createVertexToStringMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String To Vertex Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createStringToVertexMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GraphgrammarAdapterFactory
