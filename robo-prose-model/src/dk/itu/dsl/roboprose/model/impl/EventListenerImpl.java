/**
 */
package dk.itu.dsl.roboprose.model.impl;

import dk.itu.dsl.roboprose.model.Action;
import dk.itu.dsl.roboprose.model.Ending;
import dk.itu.dsl.roboprose.model.Event;
import dk.itu.dsl.roboprose.model.EventListener;
import dk.itu.dsl.roboprose.model.RoboprosePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Listener</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.EventListenerImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.EventListenerImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.EventListenerImpl#getEnding <em>Ending</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.EventListenerImpl#getSublisteners <em>Sublisteners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventListenerImpl extends MinimalEObjectImpl.Container implements EventListener {
	/**
	 * The cached value of the '{@link #getEvent() <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvent()
	 * @generated
	 * @ordered
	 */
	protected Event event;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getEnding() <em>Ending</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnding()
	 * @generated
	 * @ordered
	 */
	protected Ending ending;

	/**
	 * The cached value of the '{@link #getSublisteners() <em>Sublisteners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSublisteners()
	 * @generated
	 * @ordered
	 */
	protected EList<EventListener> sublisteners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboprosePackage.Literals.EVENT_LISTENER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getEvent() {
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvent(Event newEvent, NotificationChain msgs) {
		Event oldEvent = event;
		event = newEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboprosePackage.EVENT_LISTENER__EVENT, oldEvent, newEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(Event newEvent) {
		if (newEvent != event) {
			NotificationChain msgs = null;
			if (event != null)
				msgs = ((InternalEObject)event).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboprosePackage.EVENT_LISTENER__EVENT, null, msgs);
			if (newEvent != null)
				msgs = ((InternalEObject)newEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboprosePackage.EVENT_LISTENER__EVENT, null, msgs);
			msgs = basicSetEvent(newEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboprosePackage.EVENT_LISTENER__EVENT, newEvent, newEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, RoboprosePackage.EVENT_LISTENER__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ending getEnding() {
		return ending;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnding(Ending newEnding, NotificationChain msgs) {
		Ending oldEnding = ending;
		ending = newEnding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RoboprosePackage.EVENT_LISTENER__ENDING, oldEnding, newEnding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnding(Ending newEnding) {
		if (newEnding != ending) {
			NotificationChain msgs = null;
			if (ending != null)
				msgs = ((InternalEObject)ending).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RoboprosePackage.EVENT_LISTENER__ENDING, null, msgs);
			if (newEnding != null)
				msgs = ((InternalEObject)newEnding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RoboprosePackage.EVENT_LISTENER__ENDING, null, msgs);
			msgs = basicSetEnding(newEnding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboprosePackage.EVENT_LISTENER__ENDING, newEnding, newEnding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventListener> getSublisteners() {
		if (sublisteners == null) {
			sublisteners = new EObjectContainmentEList<EventListener>(EventListener.class, this, RoboprosePackage.EVENT_LISTENER__SUBLISTENERS);
		}
		return sublisteners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RoboprosePackage.EVENT_LISTENER__EVENT:
				return basicSetEvent(null, msgs);
			case RoboprosePackage.EVENT_LISTENER__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case RoboprosePackage.EVENT_LISTENER__ENDING:
				return basicSetEnding(null, msgs);
			case RoboprosePackage.EVENT_LISTENER__SUBLISTENERS:
				return ((InternalEList<?>)getSublisteners()).basicRemove(otherEnd, msgs);
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
			case RoboprosePackage.EVENT_LISTENER__EVENT:
				return getEvent();
			case RoboprosePackage.EVENT_LISTENER__ACTIONS:
				return getActions();
			case RoboprosePackage.EVENT_LISTENER__ENDING:
				return getEnding();
			case RoboprosePackage.EVENT_LISTENER__SUBLISTENERS:
				return getSublisteners();
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
			case RoboprosePackage.EVENT_LISTENER__EVENT:
				setEvent((Event)newValue);
				return;
			case RoboprosePackage.EVENT_LISTENER__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case RoboprosePackage.EVENT_LISTENER__ENDING:
				setEnding((Ending)newValue);
				return;
			case RoboprosePackage.EVENT_LISTENER__SUBLISTENERS:
				getSublisteners().clear();
				getSublisteners().addAll((Collection<? extends EventListener>)newValue);
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
			case RoboprosePackage.EVENT_LISTENER__EVENT:
				setEvent((Event)null);
				return;
			case RoboprosePackage.EVENT_LISTENER__ACTIONS:
				getActions().clear();
				return;
			case RoboprosePackage.EVENT_LISTENER__ENDING:
				setEnding((Ending)null);
				return;
			case RoboprosePackage.EVENT_LISTENER__SUBLISTENERS:
				getSublisteners().clear();
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
			case RoboprosePackage.EVENT_LISTENER__EVENT:
				return event != null;
			case RoboprosePackage.EVENT_LISTENER__ACTIONS:
				return actions != null && !actions.isEmpty();
			case RoboprosePackage.EVENT_LISTENER__ENDING:
				return ending != null;
			case RoboprosePackage.EVENT_LISTENER__SUBLISTENERS:
				return sublisteners != null && !sublisteners.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventListenerImpl
