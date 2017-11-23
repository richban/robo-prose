/**
 */
package dk.itu.dsl.roboprose.model.impl;

import dk.itu.dsl.roboprose.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboproseFactoryImpl extends EFactoryImpl implements RoboproseFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RoboproseFactory init() {
		try {
			RoboproseFactory theRoboproseFactory = (RoboproseFactory)EPackage.Registry.INSTANCE.getEFactory(RoboprosePackage.eNS_URI);
			if (theRoboproseFactory != null) {
				return theRoboproseFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RoboproseFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboproseFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RoboprosePackage.ROOT: return createRoot();
			case RoboprosePackage.ROBO_PROSE: return createRoboProse();
			case RoboprosePackage.MAIN: return createMain();
			case RoboprosePackage.EVENT_LISTENER: return createEventListener();
			case RoboprosePackage.MOVE: return createMove();
			case RoboprosePackage.TURN: return createTurn();
			case RoboprosePackage.STOP: return createStop();
			case RoboprosePackage.OBSTACLE: return createObstacle();
			case RoboprosePackage.TAPPED: return createTapped();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RoboprosePackage.MOVE_DIRECTION:
				return createMOVE_DIRECTIONFromString(eDataType, initialValue);
			case RoboprosePackage.TURN_DIRECTION:
				return createTURN_DIRECTIONFromString(eDataType, initialValue);
			case RoboprosePackage.RANDOM:
				return createRANDOMFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RoboprosePackage.MOVE_DIRECTION:
				return convertMOVE_DIRECTIONToString(eDataType, instanceValue);
			case RoboprosePackage.TURN_DIRECTION:
				return convertTURN_DIRECTIONToString(eDataType, instanceValue);
			case RoboprosePackage.RANDOM:
				return convertRANDOMToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboProse createRoboProse() {
		RoboProseImpl roboProse = new RoboProseImpl();
		return roboProse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Main createMain() {
		MainImpl main = new MainImpl();
		return main;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventListener createEventListener() {
		EventListenerImpl eventListener = new EventListenerImpl();
		return eventListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Move createMove() {
		MoveImpl move = new MoveImpl();
		return move;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stop createStop() {
		StopImpl stop = new StopImpl();
		return stop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle createObstacle() {
		ObstacleImpl obstacle = new ObstacleImpl();
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tapped createTapped() {
		TappedImpl tapped = new TappedImpl();
		return tapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MOVE_DIRECTION createMOVE_DIRECTIONFromString(EDataType eDataType, String initialValue) {
		MOVE_DIRECTION result = MOVE_DIRECTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMOVE_DIRECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TURN_DIRECTION createTURN_DIRECTIONFromString(EDataType eDataType, String initialValue) {
		TURN_DIRECTION result = TURN_DIRECTION.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTURN_DIRECTIONToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RANDOM createRANDOMFromString(EDataType eDataType, String initialValue) {
		RANDOM result = RANDOM.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRANDOMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboprosePackage getRoboprosePackage() {
		return (RoboprosePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RoboprosePackage getPackage() {
		return RoboprosePackage.eINSTANCE;
	}

} //RoboproseFactoryImpl
