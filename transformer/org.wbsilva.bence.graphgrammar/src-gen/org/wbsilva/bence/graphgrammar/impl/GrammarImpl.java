/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wbsilva.bence.graphgrammar.DerivationStep;
import org.wbsilva.bence.graphgrammar.Grammar;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl#getAlphabet <em>Alphabet</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl#getNonterminals <em>Nonterminals</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GrammarImpl#getInitial <em>Initial</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GrammarImpl extends MinimalEObjectImpl.Container implements Grammar {
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
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;
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
	protected GrammarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.GRAMMAR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.GRAMMAR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Symbol> getAlphabet() {
		if (alphabet == null) {
			alphabet = new EObjectContainmentEList<Symbol>(Symbol.class, this, GraphgrammarPackage.GRAMMAR__ALPHABET);
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
			terminals = new EObjectResolvingEList<Symbol>(Symbol.class, this, GraphgrammarPackage.GRAMMAR__TERMINALS);
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
					GraphgrammarPackage.GRAMMAR__NONTERMINALS);
		}
		return nonterminals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, GraphgrammarPackage.GRAMMAR__RULES);
		}
		return rules;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GraphgrammarPackage.GRAMMAR__INITIAL,
							oldInitial, initial));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.GRAMMAR__INITIAL, oldInitial,
					initial));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DerivationStep derives(Graph prev, Graph next, Vertex vertex, Graph rhs) {
		assert GraphgrammarUtil.isValidGrammar(this);
		assert GraphgrammarUtil.isValidGraph(prev);
		assert GraphgrammarUtil.isValidGraph(next);
		assert vertex != null && vertex.getLabel() != null;
		assert GraphgrammarUtil.isValidGraph(rhs);

		final Set<Rule> rules = this.getRules().stream()
				.filter(r -> r.getLhs().equivalates(vertex.getLabel()) && r.getRhs().isomorphicTo(rhs))
				.collect(Collectors.toSet());

		for (Rule rule : rules) {
			final Set<Vertex> possibleVertices = prev.getVertices().stream()
					.filter(v -> v.getLabel().equivalates(vertex.getLabel())).collect(Collectors.toSet());

			for (Vertex v : possibleVertices) {
				final Graph g = EcoreUtil.copy(prev);
				final Graph n = EcoreUtil.copy(next);
				final Rule r = EcoreUtil.copy(rule);

				final EMap<Vertex, Vertex> r2gUnifier = r.derive(g, v);
				assert GraphgrammarUtil.isValidGraph(g);

				//If result of rule application is isomorphic to next, then success
				final EMap<Vertex, Vertex> g2nextIsomorphism = g.isomorphism(n);
				if (r2gUnifier != null && g2nextIsomorphism != null) {
					//assert !g2nextIsomorphism.isEmpty();
					assert r2gUnifier.size() == r.getRhs().getVertices().size();
					assert r2gUnifier.values().stream().distinct().count() == r.getRhs().getVertices().size();
					assert r.getRhs().getVertices().stream().allMatch(w -> g.getVertices().contains(r2gUnifier.get(w)));

					//Adjust unifier to map from rule to next
					final EMap<Vertex, Vertex> r2rhsUnifier = r.getRhs().isomorphism(rhs);
					assert r2gUnifier.size() == r2rhsUnifier.size();

					final EMap<Vertex, Vertex> r2nUnifier = new BasicEMap<Vertex, Vertex>(r2rhsUnifier.size());
					r2rhsUnifier.stream().forEach(r2rhs -> {
						r2nUnifier.put(r2rhs.getKey(), n.getVertices().stream()
								.filter(w -> w.getId().equals(r2rhs.getValue().getId())).findAny().orElse(null));
					});
					assert r2nUnifier.size() == r2gUnifier.size();
					assert r.getRhs().getVertices().stream().allMatch(w -> n.getVertices().contains(r2nUnifier.get(w)));

					/*final EMap<Vertex, Vertex> r2nUnifier = new BasicEMap<Vertex, Vertex>(r2gUnifier.size());
					r2gUnifier.stream().forEach(r2g -> {
						r2nUnifier.put(r2g.getKey(), g2nextIsomorphism.get(r2g.getValue()));
					});*/

					final DerivationStep newDS = GraphgrammarFactory.eINSTANCE.createDerivationStep();
					newDS.setVertex(EcoreUtil.copy(v));
					newDS.setRule(r);
					newDS.setPrevious(prev);
					newDS.setNext(n);
					newDS.getUnifier().putAll(r2nUnifier);

					return newDS;
				}
			}
		}
		return null;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.GRAMMAR__ALPHABET:
			return ((InternalEList<?>) getAlphabet()).basicRemove(otherEnd, msgs);
		case GraphgrammarPackage.GRAMMAR__RULES:
			return ((InternalEList<?>) getRules()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.GRAMMAR__NAME:
			return getName();
		case GraphgrammarPackage.GRAMMAR__ALPHABET:
			return getAlphabet();
		case GraphgrammarPackage.GRAMMAR__TERMINALS:
			return getTerminals();
		case GraphgrammarPackage.GRAMMAR__NONTERMINALS:
			return getNonterminals();
		case GraphgrammarPackage.GRAMMAR__RULES:
			return getRules();
		case GraphgrammarPackage.GRAMMAR__INITIAL:
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
		case GraphgrammarPackage.GRAMMAR__NAME:
			setName((String) newValue);
			return;
		case GraphgrammarPackage.GRAMMAR__ALPHABET:
			getAlphabet().clear();
			getAlphabet().addAll((Collection<? extends Symbol>) newValue);
			return;
		case GraphgrammarPackage.GRAMMAR__TERMINALS:
			getTerminals().clear();
			getTerminals().addAll((Collection<? extends Symbol>) newValue);
			return;
		case GraphgrammarPackage.GRAMMAR__NONTERMINALS:
			getNonterminals().clear();
			getNonterminals().addAll((Collection<? extends Symbol>) newValue);
			return;
		case GraphgrammarPackage.GRAMMAR__RULES:
			getRules().clear();
			getRules().addAll((Collection<? extends Rule>) newValue);
			return;
		case GraphgrammarPackage.GRAMMAR__INITIAL:
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
		case GraphgrammarPackage.GRAMMAR__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GraphgrammarPackage.GRAMMAR__ALPHABET:
			getAlphabet().clear();
			return;
		case GraphgrammarPackage.GRAMMAR__TERMINALS:
			getTerminals().clear();
			return;
		case GraphgrammarPackage.GRAMMAR__NONTERMINALS:
			getNonterminals().clear();
			return;
		case GraphgrammarPackage.GRAMMAR__RULES:
			getRules().clear();
			return;
		case GraphgrammarPackage.GRAMMAR__INITIAL:
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
		case GraphgrammarPackage.GRAMMAR__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GraphgrammarPackage.GRAMMAR__ALPHABET:
			return alphabet != null && !alphabet.isEmpty();
		case GraphgrammarPackage.GRAMMAR__TERMINALS:
			return terminals != null && !terminals.isEmpty();
		case GraphgrammarPackage.GRAMMAR__NONTERMINALS:
			return nonterminals != null && !nonterminals.isEmpty();
		case GraphgrammarPackage.GRAMMAR__RULES:
			return rules != null && !rules.isEmpty();
		case GraphgrammarPackage.GRAMMAR__INITIAL:
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
		case GraphgrammarPackage.GRAMMAR___DERIVES__GRAPH_GRAPH_VERTEX_GRAPH:
			return derives((Graph) arguments.get(0), (Graph) arguments.get(1), (Vertex) arguments.get(2),
					(Graph) arguments.get(3));
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GrammarImpl
