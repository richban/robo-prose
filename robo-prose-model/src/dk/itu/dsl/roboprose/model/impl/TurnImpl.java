/**
 */
package dk.itu.dsl.roboprose.model.impl;

import dk.itu.dsl.roboprose.model.RoboprosePackage;
import dk.itu.dsl.roboprose.model.TURN_DIRECTION;
import dk.itu.dsl.roboprose.model.Turn;
import dk.itu.dsl.roboprose.model.hasDuration;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.TurnImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.TurnImpl#getDegrees <em>Degrees</em>}</li>
 *   <li>{@link dk.itu.dsl.roboprose.model.impl.TurnImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurnImpl extends RotorActionImpl implements Turn {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final float DURATION_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected float duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected static final float DEGREES_EDEFAULT = 90.0F;

	/**
	 * The cached value of the '{@link #getDegrees() <em>Degrees</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegrees()
	 * @generated
	 * @ordered
	 */
	protected float degrees = DEGREES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TURN_DIRECTION DIRECTION_EDEFAULT = TURN_DIRECTION.LEFT;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected TURN_DIRECTION direction = DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TurnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RoboprosePackage.Literals.TURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(float newDuration) {
		float oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboprosePackage.TURN__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDegrees() {
		return degrees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDegrees(float newDegrees) {
		float oldDegrees = degrees;
		degrees = newDegrees;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboprosePackage.TURN__DEGREES, oldDegrees, degrees));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TURN_DIRECTION getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(TURN_DIRECTION newDirection) {
		TURN_DIRECTION oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RoboprosePackage.TURN__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RoboprosePackage.TURN__DURATION:
				return getDuration();
			case RoboprosePackage.TURN__DEGREES:
				return getDegrees();
			case RoboprosePackage.TURN__DIRECTION:
				return getDirection();
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
			case RoboprosePackage.TURN__DURATION:
				setDuration((Float)newValue);
				return;
			case RoboprosePackage.TURN__DEGREES:
				setDegrees((Float)newValue);
				return;
			case RoboprosePackage.TURN__DIRECTION:
				setDirection((TURN_DIRECTION)newValue);
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
			case RoboprosePackage.TURN__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case RoboprosePackage.TURN__DEGREES:
				setDegrees(DEGREES_EDEFAULT);
				return;
			case RoboprosePackage.TURN__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
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
			case RoboprosePackage.TURN__DURATION:
				return duration != DURATION_EDEFAULT;
			case RoboprosePackage.TURN__DEGREES:
				return degrees != DEGREES_EDEFAULT;
			case RoboprosePackage.TURN__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == hasDuration.class) {
			switch (derivedFeatureID) {
				case RoboprosePackage.TURN__DURATION: return RoboprosePackage.HAS_DURATION__DURATION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == hasDuration.class) {
			switch (baseFeatureID) {
				case RoboprosePackage.HAS_DURATION__DURATION: return RoboprosePackage.TURN__DURATION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (duration: ");
		result.append(duration);
		result.append(", degrees: ");
		result.append(degrees);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //TurnImpl
