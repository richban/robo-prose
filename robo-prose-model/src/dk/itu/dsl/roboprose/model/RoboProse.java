/**
 */
package dk.itu.dsl.roboprose.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robo Prose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.RoboProse#getMain <em>Main</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.RoboProse#getListeners <em>Listeners</em>}</li>
 * </ul>
 *
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getRoboProse()
 * @model
 * @generated
 */
public interface RoboProse extends EObject {
	/**
	 * Returns the value of the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main</em>' containment reference.
	 * @see #setMain(Main)
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getRoboProse_Main()
	 * @model containment="true"
	 * @generated
	 */
	Main getMain();

	/**
	 * Sets the value of the '{@link dk.itu.dsl.roboprose.model.RoboProse#getMain <em>Main</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main</em>' containment reference.
	 * @see #getMain()
	 * @generated
	 */
	void setMain(Main value);

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link dk.itu.dsl.roboprose.model.EventListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getRoboProse_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventListener> getListeners();

} // RoboProse
