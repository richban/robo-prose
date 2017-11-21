/**
 */
package dk.itu.dsl.roboprose.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.Move#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getMove()
 * @model
 * @generated
 */
public interface Move extends RotorAction, hasDuration {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"forwards"</code>.
	 * The literals are from the enumeration {@link dk.itu.dsl.roboprose.model.MOVE_DIRECTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see dk.itu.dsl.roboprose.model.MOVE_DIRECTION
	 * @see #setDirection(MOVE_DIRECTION)
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getMove_Direction()
	 * @model default="forwards" required="true"
	 * @generated
	 */
	MOVE_DIRECTION getDirection();

	/**
	 * Sets the value of the '{@link dk.itu.dsl.roboprose.model.Move#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see dk.itu.dsl.roboprose.model.MOVE_DIRECTION
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(MOVE_DIRECTION value);

} // Move
