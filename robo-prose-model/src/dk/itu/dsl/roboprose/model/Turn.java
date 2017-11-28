/**
 */
package dk.itu.dsl.roboprose.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.Turn#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.Turn#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends RotorAction, hasDuration, randomizable {
	/**
	 * Returns the value of the '<em><b>Degrees</b></em>' attribute.
	 * The default value is <code>"90.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degrees</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degrees</em>' attribute.
	 * @see #setDegrees(float)
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getTurn_Degrees()
	 * @model default="90.0"
	 * @generated
	 */
	float getDegrees();

	/**
	 * Sets the value of the '{@link dk.itu.dsl.roboprose.model.Turn#getDegrees <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degrees</em>' attribute.
	 * @see #getDegrees()
	 * @generated
	 */
	void setDegrees(float value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"left"</code>.
	 * The literals are from the enumeration {@link dk.itu.dsl.roboprose.model.TURN_DIRECTION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see dk.itu.dsl.roboprose.model.TURN_DIRECTION
	 * @see #setDirection(TURN_DIRECTION)
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#getTurn_Direction()
	 * @model default="left" required="true"
	 * @generated
	 */
	TURN_DIRECTION getDirection();

	/**
	 * Sets the value of the '{@link dk.itu.dsl.roboprose.model.Turn#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see dk.itu.dsl.roboprose.model.TURN_DIRECTION
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(TURN_DIRECTION value);

} // Turn
