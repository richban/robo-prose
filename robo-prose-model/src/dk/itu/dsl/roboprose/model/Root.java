/**
 */
package dk.itu.dsl.roboprose.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.Root#getRobots <em>Robots</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.Root#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getRoot()
 * @model
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Robots</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.dsl.roboprose.model.RoboProse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Robots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Robots</em>' containment reference list.
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getRoot_Robots()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<RoboProse> getRobots();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.dsl.roboprose.model.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getRoot_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // Root
