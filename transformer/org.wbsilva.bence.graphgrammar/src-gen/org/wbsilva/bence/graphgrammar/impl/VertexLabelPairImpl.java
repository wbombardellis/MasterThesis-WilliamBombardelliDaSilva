/**
 */
package org.wbsilva.bence.graphgrammar.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.wbsilva.bence.graphgrammar.GraphgrammarPackage;
import org.wbsilva.bence.graphgrammar.Symbol;
import org.wbsilva.bence.graphgrammar.Vertex;
import org.wbsilva.bence.graphgrammar.VertexLabelPair;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex Label Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairImpl#getVertex <em>Vertex</em>}</li>
 *   <li>{@link org.wbsilva.bence.graphgrammar.impl.VertexLabelPairImpl#getEdgeLabel <em>Edge Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VertexLabelPairImpl extends MinimalEObjectImpl.Container implements VertexLabelPair {
	/**
	 * The cached value of the '{@link #getVertex() <em>Vertex</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVertex()
	 * @generated
	 * @ordered
	 */
	protected Vertex vertex;

	/**
	 * The cached value of the '{@link #getEdgeLabel() <em>Edge Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdgeLabel()
	 * @generated
	 * @ordered
	 */
	protected Symbol edgeLabel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexLabelPairImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphgrammarPackage.Literals.VERTEX_LABEL_PAIR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getVertex() {
		if (vertex != null && vertex.eIsProxy()) {
			InternalEObject oldVertex = (InternalEObject) vertex;
			vertex = (Vertex) eResolveProxy(oldVertex);
			if (vertex != oldVertex) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GraphgrammarPackage.VERTEX_LABEL_PAIR__VERTEX, oldVertex, vertex));
			}
		}
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetVertex() {
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVertex(Vertex newVertex) {
		Vertex oldVertex = vertex;
		vertex = newVertex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.VERTEX_LABEL_PAIR__VERTEX,
					oldVertex, vertex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symbol getEdgeLabel() {
		return edgeLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEdgeLabel(Symbol newEdgeLabel, NotificationChain msgs) {
		Symbol oldEdgeLabel = edgeLabel;
		edgeLabel = newEdgeLabel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL, oldEdgeLabel, newEdgeLabel);
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
	public void setEdgeLabel(Symbol newEdgeLabel) {
		if (newEdgeLabel != edgeLabel) {
			NotificationChain msgs = null;
			if (edgeLabel != null)
				msgs = ((InternalEObject) edgeLabel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL, null, msgs);
			if (newEdgeLabel != null)
				msgs = ((InternalEObject) newEdgeLabel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL, null, msgs);
			msgs = basicSetEdgeLabel(newEdgeLabel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL,
					newEdgeLabel, newEdgeLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL:
			return basicSetEdgeLabel(null, msgs);
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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__VERTEX:
			if (resolve)
				return getVertex();
			return basicGetVertex();
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL:
			return getEdgeLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__VERTEX:
			setVertex((Vertex) newValue);
			return;
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL:
			setEdgeLabel((Symbol) newValue);
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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__VERTEX:
			setVertex((Vertex) null);
			return;
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL:
			setEdgeLabel((Symbol) null);
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
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__VERTEX:
			return vertex != null;
		case GraphgrammarPackage.VERTEX_LABEL_PAIR__EDGE_LABEL:
			return edgeLabel != null;
		}
		return super.eIsSet(featureID);
	}

} //VertexLabelPairImpl
