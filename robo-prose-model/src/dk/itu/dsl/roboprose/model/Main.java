/**
 */
package dk.itu.dsl.roboprose.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.Main#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getMain()
 * @model
 * @generated
 */
public interface Main extends EObject {
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
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getMain_Actions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Action> getActions();

} // Main
