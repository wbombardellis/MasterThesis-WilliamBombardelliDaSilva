/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarFactory;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Rule;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.VertexLabelPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl#getLhs <em>Lhs</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl#getRhs <em>Rhs</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl#getEmbedding <em>Embedding</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.RuleImpl#getPac <em>Pac</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
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
	 * The cached value of the '{@link #getLhs() <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLhs()
	 * @generated
	 * @ordered
	 */
	protected Symbol lhs;

	/**
	 * The cached value of the '{@link #getRhs() <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRhs()
	 * @generated
	 * @ordered
	 */
	protected Graph rhs;

	/**
	 * The cached value of the '{@link #getEmbedding() <em>Embedding</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbedding()
	 * @generated
	 * @ordered
	 */
	protected EMap<VertexLabelPair, EList<Symbol>> embedding;

	/**
	 * The cached value of the '{@link #getPac() <em>Pac</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPac()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> pac;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.RULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.RULE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getLhs() {
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLhs(Symbol newLhs, NotificationChain msgs) {
		Symbol oldLhs = lhs;
		lhs = newLhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.RULE__LHS, oldLhs, newLhs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLhs(Symbol newLhs) {
		if (newLhs != lhs) {
			NotificationChain msgs = null;
			if (lhs != null)
				msgs = ((InternalEObject) lhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.RULE__LHS, null, msgs);
			if (newLhs != null)
				msgs = ((InternalEObject) newLhs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.RULE__LHS, null, msgs);
			msgs = basicSetLhs(newLhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.RULE__LHS, newLhs, newLhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getRhs() {
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRhs(Graph newRhs, NotificationChain msgs) {
		Graph oldRhs = rhs;
		rhs = newRhs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.RULE__RHS, oldRhs, newRhs);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRhs(Graph newRhs) {
		if (newRhs != rhs) {
			NotificationChain msgs = null;
			if (rhs != null)
				msgs = ((InternalEObject) rhs).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.RULE__RHS, null, msgs);
			if (newRhs != null)
				msgs = ((InternalEObject) newRhs).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.RULE__RHS, null, msgs);
			msgs = basicSetRhs(newRhs, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.RULE__RHS, newRhs, newRhs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<VertexLabelPair, EList<Symbol>> getEmbedding() {
		if (embedding == null) {
			embedding = new EcoreEMap<VertexLabelPair, EList<Symbol>>(
					GraphgrammarPackage.Literals.VERTEX_LABEL_PAIR_TO_SYMBOL_MAP, VertexLabelPairToSymbolMapImpl.class,
					this, GraphgrammarPackage.RULE__EMBEDDING);
		}
		return embedding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getPac() {
		if (pac == null) {
			pac = new EObjectResolvingEList<Vertex>(Vertex.class, this, GraphgrammarPackage.RULE__PAC);
		}
		return pac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Edge> embed(Graph graph, EList<Edge> edges) {
		return new BasicEList<Edge>(edges.stream()
				.flatMap(e -> {
					//Vertices that should receive an incoming edge 
					Stream<Vertex> toVs = graph.getVertices().stream()
							.filter(v -> {
								VertexLabelPair k = GraphgrammarFactory.eINSTANCE.createVertexLabelPair();
								k.setVertex(v);
								k.setEdgeLabel(e.getLabel());
								return embedding.get(k).contains(e.getFrom().getLabel());
							});
					//Vertices that should receive an outgoing edge
					Stream<Vertex> fromVs = graph.getVertices().stream()
							.filter(v -> {
								VertexLabelPair k = GraphgrammarFactory.eINSTANCE.createVertexLabelPair();
								k.setVertex(v);
								k.setEdgeLabel(e.getLabel());
								return embedding.get(k).contains(e.getTo().getLabel());
							});
					//create incoming edges
					Set<Edge> es = toVs.map((Vertex v) -> {
								Edge newE = GraphgrammarFactory.eINSTANCE.createEdge();
								newE.setFrom(e.getFrom());
								newE.setTo(v);
								return newE;
							})
							.collect(Collectors.toSet());
					//create outgoing edges
					es.addAll(fromVs.map((Vertex v) -> {
								Edge newE = GraphgrammarFactory.eINSTANCE.createEdge();
								newE.setFrom(v);
								newE.setTo(e.getTo());
								return newE;
							})
							.collect(Collectors.toSet()));
					return es.stream();
				})
				.collect(Collectors.toSet()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.RULE__LHS:
			return basicSetLhs(null, msgs);
		case GraphgrammarPackage.RULE__RHS:
			return basicSetRhs(null, msgs);
		case GraphgrammarPackage.RULE__EMBEDDING:
			return ((InternalEList<?>) getEmbedding()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.RULE__ID:
			return getId();
		case GraphgrammarPackage.RULE__NAME:
			return getName();
		case GraphgrammarPackage.RULE__LHS:
			return getLhs();
		case GraphgrammarPackage.RULE__RHS:
			return getRhs();
		case GraphgrammarPackage.RULE__EMBEDDING:
			if (coreType)
				return getEmbedding();
			else
				return getEmbedding().map();
		case GraphgrammarPackage.RULE__PAC:
			return getPac();
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
		case GraphgrammarPackage.RULE__ID:
			setId((String) newValue);
			return;
		case GraphgrammarPackage.RULE__NAME:
			setName((String) newValue);
			return;
		case GraphgrammarPackage.RULE__LHS:
			setLhs((Symbol) newValue);
			return;
		case GraphgrammarPackage.RULE__RHS:
			setRhs((Graph) newValue);
			return;
		case GraphgrammarPackage.RULE__EMBEDDING:
			((EStructuralFeature.Setting) getEmbedding()).set(newValue);
			return;
		case GraphgrammarPackage.RULE__PAC:
			getPac().clear();
			getPac().addAll((Collection<? extends Vertex>) newValue);
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
		case GraphgrammarPackage.RULE__ID:
			setId(ID_EDEFAULT);
			return;
		case GraphgrammarPackage.RULE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case GraphgrammarPackage.RULE__LHS:
			setLhs((Symbol) null);
			return;
		case GraphgrammarPackage.RULE__RHS:
			setRhs((Graph) null);
			return;
		case GraphgrammarPackage.RULE__EMBEDDING:
			getEmbedding().clear();
			return;
		case GraphgrammarPackage.RULE__PAC:
			getPac().clear();
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
		case GraphgrammarPackage.RULE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphgrammarPackage.RULE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case GraphgrammarPackage.RULE__LHS:
			return lhs != null;
		case GraphgrammarPackage.RULE__RHS:
			return rhs != null;
		case GraphgrammarPackage.RULE__EMBEDDING:
			return embedding != null && !embedding.isEmpty();
		case GraphgrammarPackage.RULE__PAC:
			return pac != null && !pac.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case GraphgrammarPackage.RULE___EMBED__GRAPH_ELIST:
			return embed((Graph) arguments.get(0), (EList<Edge>) arguments.get(1));
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

} //RuleImpl