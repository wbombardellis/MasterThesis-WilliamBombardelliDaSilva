/**
 */
package org.wbsilva.bence.graphgrammar.util;

import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.wbsilva.bence.graphgrammar.*;

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
 * @see org.wbsilva.bence.graphgrammar.GraphgrammarPackage
 * @generated
 */
public class GraphgrammarSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphgrammarPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphgrammarSwitch() {
		if (modelPackage == null) {
			modelPackage = GraphgrammarPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case GraphgrammarPackage.GRAMMAR: {
			Grammar grammar = (Grammar) theEObject;
			T result = caseGrammar(grammar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.RULE: {
			Rule rule = (Rule) theEObject;
			T result = caseRule(rule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.SYMBOL_SYMBOLS_PAIR: {
			SymbolSymbolsPair symbolSymbolsPair = (SymbolSymbolsPair) theEObject;
			T result = caseSymbolSymbolsPair(symbolSymbolsPair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.VERTEX_TO_SYMBOL_SYMBOLS_PAIR_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<Vertex, EList<SymbolSymbolsPair>> vertexToSymbolSymbolsPairMap = (Map.Entry<Vertex, EList<SymbolSymbolsPair>>) theEObject;
			T result = caseVertexToSymbolSymbolsPairMap(vertexToSymbolSymbolsPairMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.SYMBOL: {
			Symbol symbol = (Symbol) theEObject;
			T result = caseSymbol(symbol);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.DERIVATION_STEP: {
			DerivationStep derivationStep = (DerivationStep) theEObject;
			T result = caseDerivationStep(derivationStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.DERIVATION: {
			Derivation derivation = (Derivation) theEObject;
			T result = caseDerivation(derivation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.PARSING_TREE: {
			ParsingTree parsingTree = (ParsingTree) theEObject;
			T result = caseParsingTree(parsingTree);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.RESOLUTION_STEP: {
			ResolutionStep resolutionStep = (ResolutionStep) theEObject;
			T result = caseResolutionStep(resolutionStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.RESOLUTION: {
			Resolution resolution = (Resolution) theEObject;
			T result = caseResolution(resolution);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.GRAPH: {
			Graph graph = (Graph) theEObject;
			T result = caseGraph(graph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.VERTEX: {
			Vertex vertex = (Vertex) theEObject;
			T result = caseVertex(vertex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.ZONE_VERTEX: {
			ZoneVertex zoneVertex = (ZoneVertex) theEObject;
			T result = caseZoneVertex(zoneVertex);
			if (result == null)
				result = caseVertex(zoneVertex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.EDGE: {
			Edge edge = (Edge) theEObject;
			T result = caseEdge(edge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.TRIPLE_GRAMMAR: {
			TripleGrammar tripleGrammar = (TripleGrammar) theEObject;
			T result = caseTripleGrammar(tripleGrammar);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.TRIPLE_RULE: {
			TripleRule tripleRule = (TripleRule) theEObject;
			T result = caseTripleRule(tripleRule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.TRIPLE_GRAPH: {
			TripleGraph tripleGraph = (TripleGraph) theEObject;
			T result = caseTripleGraph(tripleGraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.VERTEX_TO_VERTEX_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<Vertex, Vertex> vertexToVertexMap = (Map.Entry<Vertex, Vertex>) theEObject;
			T result = caseVertexToVertexMap(vertexToVertexMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.VERTEX_TO_STRING_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<Vertex, String> vertexToStringMap = (Map.Entry<Vertex, String>) theEObject;
			T result = caseVertexToStringMap(vertexToStringMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case GraphgrammarPackage.STRING_TO_VERTEX_MAP: {
			@SuppressWarnings("unchecked")
			Map.Entry<String, Vertex> stringToVertexMap = (Map.Entry<String, Vertex>) theEObject;
			T result = caseStringToVertexMap(stringToVertexMap);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grammar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrammar(Grammar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Symbols Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Symbols Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbolSymbolsPair(SymbolSymbolsPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex To Symbol Symbols Pair Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex To Symbol Symbols Pair Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertexToSymbolSymbolsPairMap(Map.Entry<Vertex, EList<SymbolSymbolsPair>> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSymbol(Symbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivationStep(DerivationStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivation(Derivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parsing Tree</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parsing Tree</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParsingTree(ParsingTree object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolutionStep(ResolutionStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resolution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResolution(Resolution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGraph(Graph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zone Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zone Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZoneVertex(ZoneVertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Edge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEdge(Edge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triple Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triple Grammar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripleGrammar(TripleGrammar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triple Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triple Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripleRule(TripleRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triple Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triple Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTripleGraph(TripleGraph object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex To Vertex Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex To Vertex Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertexToVertexMap(Map.Entry<Vertex, Vertex> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex To String Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex To String Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertexToStringMap(Map.Entry<Vertex, String> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Vertex Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Vertex Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToVertexMap(Map.Entry<String, Vertex> object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GraphgrammarSwitch
