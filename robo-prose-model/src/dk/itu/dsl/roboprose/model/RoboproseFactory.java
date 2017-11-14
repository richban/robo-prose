/**
 */
package dk.itu.dsl.roboprose.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage
 * @generated
 */
public interface RoboproseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboproseFactory eINSTANCE = dk.itu.dsl.roboprose.model.impl.RoboproseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Robo Prose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robo Prose</em>'.
	 * @generated
	 */
	RoboProse createRoboProse();

	/**
	 * Returns a new object of class '<em>Main</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Main</em>'.
	 * @generated
	 */
	Main createMain();

	/**
	 * Returns a new object of class '<em>Event Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Listener</em>'.
	 * @generated
	 */
	EventListener createEventListener();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RoboprosePackage getRoboprosePackage();

} //RoboproseFactory
