/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.wbsilva.bence.graphgrammar.Edge;
import org.wbsilva.bence.graphgrammar.Graph;
import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.util.GraphgrammarUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GraphImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GraphImpl#getVertices <em>Vertices</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.GraphImpl#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = "";
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
	 * The cached value of the '{@link #getVertices() <em>Vertices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertices()
	 * @generated
	 * @ordered
	 */
	protected EList<Vertex> vertices;
	/**
	 * The cached value of the '{@link #getEdges() <em>Edges</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdges()
	 * @generated
	 * @ordered
	 */
	protected EList<Edge> edges;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.GRAPH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.GRAPH__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vertex> getVertices() {
		if (vertices == null) {
			vertices = new EObjectContainmentEList<Vertex>(Vertex.class, this, GraphgrammarPackage.GRAPH__VERTICES);
		}
		return vertices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Edge> getEdges() {
		if (edges == null) {
			edges = new EObjectContainmentEList<Edge>(Edge.class, this, GraphgrammarPackage.GRAPH__EDGES);
		}
		return edges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Vertex> neighbors(EList<Vertex> vertices) {
		//TODO: Assure graph is valid
		final Function<Vertex, Set<Vertex>> neigh = (Vertex v) -> {
			Set<Vertex> out = this.getEdges().stream().filter(e -> e.getFrom().getId().equals(v.getId()))
					.map(e -> e.getTo()).distinct().collect(Collectors.toSet());

			Set<Vertex> in = this.getEdges().stream().filter(e -> e.getTo().getId().equals(v.getId()))
					.map(e -> e.getFrom()).distinct().collect(Collectors.toSet());

			out.addAll(in);
			return out;
		};

		return new BasicEList<Vertex>(vertices.stream().map(neigh).reduce((a, b) -> {
			a.retainAll(b);
			return a;
		}).orElse(new HashSet<Vertex>(0)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isomorphicTo(Graph other) {
		//TODO: assertions
		//Candidates for a mapping's image of each vertex of this 
		final List<Set<Vertex>> candidates = this.getVertices().stream()
				.map(v -> other.getVertices().stream()
						.filter(w -> EcoreUtil.equals(v.getLabel(), w.getLabel())
								&& GraphgrammarUtil.isomorphicEdges(this.inEdges(v), other.inEdges(w))
								&& GraphgrammarUtil.isomorphicEdges(this.outEdges(v), other.outEdges(w)))
						.collect(Collectors.toSet()))
				.collect(Collectors.toList());

		//TODO: For optimization order the candidate sets by size increasingly
		//candidates.sort();

		return GraphgrammarUtil.anyBijectiveMapping(candidates);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Edge> inEdges(Vertex vertex) {
		//TODO: add assertions
		return new BasicEList<>(
				this.getEdges().stream().filter(e -> e.getTo().equals(vertex)).collect(Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Edge> outEdges(Vertex vertex) {
		//TODO: add assertions
		return new BasicEList<>(
				this.getEdges().stream().filter(e -> e.getFrom().equals(vertex)).collect(Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.GRAPH__VERTICES:
			return ((InternalEList<?>) getVertices()).basicRemove(otherEnd, msgs);
		case GraphgrammarPackage.GRAPH__EDGES:
			return ((InternalEList<?>) getEdges()).basicRemove(otherEnd, msgs);
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
		case GraphgrammarPackage.GRAPH__ID:
			return getId();
		case GraphgrammarPackage.GRAPH__VERTICES:
			return getVertices();
		case GraphgrammarPackage.GRAPH__EDGES:
			return getEdges();
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
		case GraphgrammarPackage.GRAPH__ID:
			setId((String) newValue);
			return;
		case GraphgrammarPackage.GRAPH__VERTICES:
			getVertices().clear();
			getVertices().addAll((Collection<? extends Vertex>) newValue);
			return;
		case GraphgrammarPackage.GRAPH__EDGES:
			getEdges().clear();
			getEdges().addAll((Collection<? extends Edge>) newValue);
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
		case GraphgrammarPackage.GRAPH__ID:
			setId(ID_EDEFAULT);
			return;
		case GraphgrammarPackage.GRAPH__VERTICES:
			getVertices().clear();
			return;
		case GraphgrammarPackage.GRAPH__EDGES:
			getEdges().clear();
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
		case GraphgrammarPackage.GRAPH__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case GraphgrammarPackage.GRAPH__VERTICES:
			return vertices != null && !vertices.isEmpty();
		case GraphgrammarPackage.GRAPH__EDGES:
			return edges != null && !edges.isEmpty();
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
		case GraphgrammarPackage.GRAPH___NEIGHBORS__ELIST:
			return neighbors((EList<Vertex>) arguments.get(0));
		case GraphgrammarPackage.GRAPH___ISOMORPHIC_TO__GRAPH:
			return isomorphicTo((Graph) arguments.get(0));
		case GraphgrammarPackage.GRAPH___IN_EDGES__VERTEX:
			return inEdges((Vertex) arguments.get(0));
		case GraphgrammarPackage.GRAPH___OUT_EDGES__VERTEX:
			return outEdges((Vertex) arguments.get(0));
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
		result.append(')');
		return result.toString();
	}

} //GraphImpl
