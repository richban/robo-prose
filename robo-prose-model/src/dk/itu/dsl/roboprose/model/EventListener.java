/**
 */
package dk.itu.dsl.roboprose.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.EventListener#getEvent <em>Event</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.EventListener#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.EventListener#getSublisteners <em>Sublisteners</em>}</li>
 * </ul>
 *
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getEventListener()
 * @model
 * @generated
 */
public interface EventListener extends EObject {
	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getEventListener_Event()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link dk.itu.dsl.roboprose.model.EventListener#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.dsl.roboprose.model.Action}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getEventListener_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Sublisteners</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.dsl.roboprose.model.EventListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sublisteners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sublisteners</em>' containment reference list.
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getEventListener_Sublisteners()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventListener> getSublisteners();

} // EventListener
