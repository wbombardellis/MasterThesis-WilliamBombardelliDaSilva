/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.TripleGrammar;
import org.wbsilva.bence.graphgrammar.TripleGraph;
import org.wbsilva.bence.graphgrammar.TripleRule;
import org.wbsilva.bence.graphgrammar.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triple Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getAlphabet <em>Alphabet</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getNonterminals <em>Nonterminals</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getTripleRules <em>Triple Rules</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.TripleGrammarImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TripleGrammarImpl extends MinimalEObjectImpl.Container implements TripleGrammar {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlphabet() <em>Alphabet</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlphabet()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> alphabet;

	/**
	 * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> terminals;

	/**
	 * The cached value of the '{@link #getNonterminals() <em>Nonterminals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonterminals()
	 * @generated
	 * @ordered
	 */
	protected EList<Symbol> nonterminals;

	/**
	 * The cached value of the '{@link #getTripleRules() <em>Triple Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTripleRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TripleRule> tripleRules;

	/**
	 * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitial()
	 * @generated
	 * @ordered
	 */
	protected Symbol initial;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TripleGrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.TRIPLE_GRAMMAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.TRIPLE_GRAMMAR__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.TRIPLE_GRAMMAR__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getAlphabet() {
		if (alphabet == null) {
			alphabet = new EObjectContainmentEList<Symbol>(Symbol.class, this,
					GraphgrammarPackage.TRIPLE_GRAMMAR__ALPHABET);
		}
		return alphabet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getTerminals() {
		if (terminals == null) {
			terminals = new EObjectResolvingEList<Symbol>(Symbol.class, this,
					GraphgrammarPackage.TRIPLE_GRAMMAR__TERMINALS);
		}
		return terminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getNonterminals() {
		if (nonterminals == null) {
			nonterminals = new EObjectResolvingEList<Symbol>(Symbol.class, this,
					GraphgrammarPackage.TRIPLE_GRAMMAR__NONTERMINALS);
		}
		return nonterminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TripleRule> getTripleRules() {
		if (tripleRules == null) {
			tripleRules = new EObjectContainmentEList<TripleRule>(TripleRule.class, this,
					GraphgrammarPackage.TRIPLE_GRAMMAR__TRIPLE_RULES);
		}
		return tripleRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getInitial() {
		if (initial != null && initial.eIsProxy()) {
			InternalEObject oldInitial = (InternalEObject) initial;
			initial = (Symbol) eResolveProxy(oldInitial);
			if (initial != oldInitial) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GraphgrammarPackage.TRIPLE_GRAMMAR__INITIAL, oldInitial, initial));
			}
		}
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol basicGetInitial() {
		return initial;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitial(Symbol newInitial) {
		Symbol oldInitial = initial;
		initial = newInitial;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.TRIPLE_GRAMMAR__INITIAL,
					oldInitial, initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void produce(TripleGraph tripleGraph, DerivationStep derivationStep, boolean forward) {

		final TripleRule tripleRule = this.getTripleRules().parallelStream()
				.filter(tr -> forward ? tr.getSource().getId().equals(derivationStep.getRule().getId())
						: tr.getTarget().getId().equals(derivationStep.getRule().getId()))
				.findAny().orElse(null);
		assert tripleRule != null;

		//TODO: Assure derivationStep.prev == inputgraph

		final Graph inputGraph = forward ? tripleGraph.getSource() : tripleGraph.getTarget();
		final Graph outputGraph = forward ? tripleGraph.getTarget() : tripleGraph.getSource();
		final Rule inputRule = derivationStep.getRule();
		final Rule outputRule = forward ? tripleRule.getTarget() : tripleRule.getSource();
		final EMap<Vertex, Vertex> inputMorphism = forward ? tripleGraph.getMs() : tripleGraph.getMt();
		final EMap<Vertex, Vertex> outputMorphism = forward ? tripleGraph.getMt() : tripleGraph.getMs();

		//TODO: assert unique ids

		//The vertex of the input graph used as LHS in this derivation step
		final Vertex inputVertex = inputGraph.getVertices().parallelStream()
				.filter(v -> v.getId().equals(derivationStep.getVertex().getId())).findAny().orElse(null);
		assert inputVertex != null;

		//The correspondence vertex for the input vertex
		final Vertex corrVertex = tripleGraph.getCorr().getVertices().parallelStream()
				.filter(v -> this.getNonterminals().parallelStream()
						.anyMatch(s -> s.getName().equals(v.getLabel().getName()))) //TODO: Assert there is one
				.filter(v -> forward ? tripleGraph.invMs(inputVertex).contains(v)
						: tripleGraph.invMt(inputVertex).contains(v))
				.findAny().orElse(null);
		assert corrVertex != null;

		//The output vertex for it, which is already at the output graph 
		final Vertex outputVertex = outputGraph.getVertices().parallelStream()
				.filter(v -> v == outputMorphism.get(corrVertex)).findAny().orElse(null);
		assert corrVertex != null;

		//Generate next input graph by copying the one in the derivation step
		inputGraph.getEdges().clear();
		inputGraph.getEdges().addAll(EcoreUtil.copyAll(derivationStep.getNext().getEdges()));
		inputGraph.getVertices().clear();
		inputGraph.getVertices().addAll(EcoreUtil.copyAll(derivationStep.getNext().getVertices()));
		final EMap<Vertex, Vertex> inputUnifier = derivationStep.getUnifier();

		//Generate next output graph using output vertex as LHS for the output rule application 
		final EMap<Vertex, Vertex> outputUnifier = outputRule.apply(outputGraph, outputVertex);

		//Generate next correspondence graph using correspondence vertex as LHS for the output rule application
		final EMap<Vertex, Vertex> corrUnifier = tripleRule.getCorr().apply(tripleGraph.getCorr(), corrVertex);

		//Adjust correspondence morphism ms and mt of the tripleGraph according to the tripleRule
		inputMorphism.removeKey(corrVertex);
		outputMorphism.removeKey(corrVertex);

		for (Vertex corrV : tripleRule.getCorr().getRhs().getVertices()) {
			final Vertex newCorrV = corrUnifier.get(corrV);

			final EMap<Vertex, Vertex> ruleOutputMorphism = forward ? tripleRule.getMt() : tripleRule.getMs();
			final EMap<Vertex, Vertex> ruleInputMorphism = forward ? tripleRule.getMs() : tripleRule.getMt();

			//TODO: Add assertions for the morphism  and for the vertices below (can they be empty?)

			//Get vertex object of the just added output part
			final Vertex outputV = ruleOutputMorphism.get(corrV);
			final Vertex newOutputV = outputUnifier.get(outputV);

			//Get vertex object of the input part
			final Vertex inputV = ruleInputMorphism.get(corrV);
			final Vertex newInputV = inputUnifier.get(inputRule.getRhs().getVertices().parallelStream()
					.filter(w -> w.getId().equals(inputV.getId())).findAny().orElse(null));

			inputMorphism.put(newCorrV, newInputV);
			outputMorphism.put(newCorrV, newOutputV);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ALPHABET:
			return ((InternalEList<?>) getAlphabet()).basicRemove(otherEnd, msgs);
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TRIPLE_RULES:
			return ((InternalEList<?>) getTripleRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ID:
			return getId();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NAME:
			return getName();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ALPHABET:
			return getAlphabet();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TERMINALS:
			return getTerminals();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NONTERMINALS:
			return getNonterminals();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TRIPLE_RULES:
			return getTripleRules();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__INITIAL:
			if (resolve)
				return getInitial();
			return basicGetInitial();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ID:
			setId((String) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NAME:
			setName((String) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ALPHABET:
			getAlphabet().clear();
			getAlphabet().addAll((Collection<? extends Symbol>) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TERMINALS:
			getTerminals().clear();
			getTerminals().addAll((Collection<? extends Symbol>) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NONTERMINALS:
			getNonterminals().clear();
			getNonterminals().addAll((Collection<? extends Symbol>) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TRIPLE_RULES:
			getTripleRules().clear();
			getTripleRules().addAll((Collection<? extends TripleRule>) newValue);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__INITIAL:
			setInitial((Symbol) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ID:
			setId(ID_EDEFAULT);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ALPHABET:
			getAlphabet().clear();
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TERMINALS:
			getTerminals().clear();
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NONTERMINALS:
			getNonterminals().clear();
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TRIPLE_RULES:
			getTripleRules().clear();
			return;
		case GraphgrammarPackage.TRIPLE_GRAMMAR__INITIAL:
			setInitial((Symbol) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GraphgrammarPackage.TRIPLE_GRAMMAR__ALPHABET:
			return alphabet != null && !alphabet.isEmpty();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TERMINALS:
			return terminals != null && !terminals.isEmpty();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__NONTERMINALS:
			return nonterminals != null && !nonterminals.isEmpty();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__TRIPLE_RULES:
			return tripleRules != null && !tripleRules.isEmpty();
		case GraphgrammarPackage.TRIPLE_GRAMMAR__INITIAL:
			return initial != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GraphgrammarPackage.TRIPLE_GRAMMAR___PRODUCE__TRIPLEGRAPH_DERIVATIONSTEP_BOOLEAN:
			produce((TripleGraph) arguments.get(0), (DerivationStep) arguments.get(1), (Boolean) arguments.get(2));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TripleGrammarImpl
