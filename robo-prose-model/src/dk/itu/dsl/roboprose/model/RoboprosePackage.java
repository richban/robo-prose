/**
 */
package dk.itu.dsl.roboprose.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.itu.dsl.roboprose.model.RoboproseFactory
 * @model kind="package"
 * @generated
 */
public interface RoboprosePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.itu.dk/dsl/roboprose";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "roboprose";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RoboprosePackage eINSTANCE = dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.RootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.RootImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRoot()
	 * @generated
	 */
	int ROOT = 0;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__ROBOTS = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT__EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.RoboProseImpl <em>Robo Prose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.RoboProseImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRoboProse()
	 * @generated
	 */
	int ROBO_PROSE = 1;

	/**
	 * The feature id for the '<em><b>Main</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBO_PROSE__MAIN = 0;

	/**
	 * The feature id for the '<em><b>Listeners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBO_PROSE__LISTENERS = 1;

	/**
	 * The number of structural features of the '<em>Robo Prose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBO_PROSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Robo Prose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBO_PROSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.MainImpl <em>Main</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.MainImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getMain()
	 * @generated
	 */
	int MAIN = 2;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN__ACTIONS = 0;

	/**
	 * The number of structural features of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Main</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.EventListenerImpl <em>Event Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.EventListenerImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getEventListener()
	 * @generated
	 */
	int EVENT_LISTENER = 9;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.EventImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.ActionImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 3;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.RotorActionImpl <em>Rotor Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.RotorActionImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRotorAction()
	 * @generated
	 */
	int ROTOR_ACTION = 4;

	/**
	 * The number of structural features of the '<em>Rotor Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTOR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rotor Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROTOR_ACTION_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.MoveImpl <em>Move</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.MoveImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getMove()
	 * @generated
	 */
	int MOVE = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DURATION = ROTOR_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__IS_RANDOM = ROTOR_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE__DIRECTION = ROTOR_ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_FEATURE_COUNT = ROTOR_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Move</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_OPERATION_COUNT = ROTOR_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.TurnImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__DURATION = ROTOR_ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__IS_RANDOM = ROTOR_ACTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Degrees</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__DEGREES = ROTOR_ACTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__DIRECTION = ROTOR_ACTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = ROTOR_ACTION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = ROTOR_ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.RepeatImpl <em>Repeat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.RepeatImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRepeat()
	 * @generated
	 */
	int REPEAT = 8;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.hasDurationImpl <em>has Duration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.hasDurationImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#gethasDuration()
	 * @generated
	 */
	int HAS_DURATION = 13;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.randomizableImpl <em>randomizable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.randomizableImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getrandomizable()
	 * @generated
	 */
	int RANDOMIZABLE = 14;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.StopImpl <em>Stop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.StopImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getStop()
	 * @generated
	 */
	int STOP = 7;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP__DURATION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Stop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Should Repeat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT__SHOULD_REPEAT = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Repeat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPEAT_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__EVENT = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Sublisteners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER__SUBLISTENERS = 2;

	/**
	 * The number of structural features of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Event Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_LISTENER_OPERATION_COUNT = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.ObstacleImpl <em>Obstacle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.ObstacleImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getObstacle()
	 * @generated
	 */
	int OBSTACLE = 11;

	/**
	 * The number of structural features of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Obstacle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSTACLE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.TappedImpl <em>Tapped</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.TappedImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getTapped()
	 * @generated
	 */
	int TAPPED = 12;

	/**
	 * The number of structural features of the '<em>Tapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPED_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tapped</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAPPED_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DURATION__DURATION = 0;

	/**
	 * The number of structural features of the '<em>has Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DURATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>has Duration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAS_DURATION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Is Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZABLE__IS_RANDOM = 0;

	/**
	 * The number of structural features of the '<em>randomizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>randomizable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOMIZABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.MOVE_DIRECTION <em>MOVE DIRECTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.MOVE_DIRECTION
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getMOVE_DIRECTION()
	 * @generated
	 */
	int MOVE_DIRECTION = 15;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.TURN_DIRECTION <em>TURN DIRECTION</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.TURN_DIRECTION
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getTURN_DIRECTION()
	 * @generated
	 */
	int TURN_DIRECTION = 16;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.SHOULD_REPEAT <em>SHOULD REPEAT</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.SHOULD_REPEAT
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getSHOULD_REPEAT()
	 * @generated
	 */
	int SHOULD_REPEAT = 17;

	/**
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.RANDOM <em>RANDOM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.RANDOM
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRANDOM()
	 * @generated
	 */
	int RANDOM = 18;

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Root <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see dk.itu.dsl.roboprose.model.Root
	 * @generated
	 */
	EClass getRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.dsl.roboprose.model.Root#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots</em>'.
	 * @see dk.itu.dsl.roboprose.model.Root#getRobots()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Robots();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.dsl.roboprose.model.Root#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see dk.itu.dsl.roboprose.model.Root#getEvents()
	 * @see #getRoot()
	 * @generated
	 */
	EReference getRoot_Events();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.RoboProse <em>Robo Prose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robo Prose</em>'.
	 * @see dk.itu.dsl.roboprose.model.RoboProse
	 * @generated
	 */
	EClass getRoboProse();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.dsl.roboprose.model.RoboProse#getMain <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main</em>'.
	 * @see dk.itu.dsl.roboprose.model.RoboProse#getMain()
	 * @see #getRoboProse()
	 * @generated
	 */
	EReference getRoboProse_Main();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.dsl.roboprose.model.RoboProse#getListeners <em>Listeners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listeners</em>'.
	 * @see dk.itu.dsl.roboprose.model.RoboProse#getListeners()
	 * @see #getRoboProse()
	 * @generated
	 */
	EReference getRoboProse_Listeners();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Main <em>Main</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main</em>'.
	 * @see dk.itu.dsl.roboprose.model.Main
	 * @generated
	 */
	EClass getMain();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.dsl.roboprose.model.Main#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see dk.itu.dsl.roboprose.model.Main#getActions()
	 * @see #getMain()
	 * @generated
	 */
	EReference getMain_Actions();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.EventListener <em>Event Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Listener</em>'.
	 * @see dk.itu.dsl.roboprose.model.EventListener
	 * @generated
	 */
	EClass getEventListener();

	/**
	 * Returns the meta object for the containment reference '{@link dk.itu.dsl.roboprose.model.EventListener#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see dk.itu.dsl.roboprose.model.EventListener#getEvent()
	 * @see #getEventListener()
	 * @generated
	 */
	EReference getEventListener_Event();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.dsl.roboprose.model.EventListener#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see dk.itu.dsl.roboprose.model.EventListener#getActions()
	 * @see #getEventListener()
	 * @generated
	 */
	EReference getEventListener_Actions();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.itu.dsl.roboprose.model.EventListener#getSublisteners <em>Sublisteners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sublisteners</em>'.
	 * @see dk.itu.dsl.roboprose.model.EventListener#getSublisteners()
	 * @see #getEventListener()
	 * @generated
	 */
	EReference getEventListener_Sublisteners();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see dk.itu.dsl.roboprose.model.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dk.itu.dsl.roboprose.model.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Move <em>Move</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move</em>'.
	 * @see dk.itu.dsl.roboprose.model.Move
	 * @generated
	 */
	EClass getMove();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.dsl.roboprose.model.Move#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see dk.itu.dsl.roboprose.model.Move#getDirection()
	 * @see #getMove()
	 * @generated
	 */
	EAttribute getMove_Direction();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see dk.itu.dsl.roboprose.model.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.dsl.roboprose.model.Turn#getDegrees <em>Degrees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Degrees</em>'.
	 * @see dk.itu.dsl.roboprose.model.Turn#getDegrees()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Degrees();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.dsl.roboprose.model.Turn#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see dk.itu.dsl.roboprose.model.Turn#getDirection()
	 * @see #getTurn()
	 * @generated
	 */
	EAttribute getTurn_Direction();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Repeat <em>Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repeat</em>'.
	 * @see dk.itu.dsl.roboprose.model.Repeat
	 * @generated
	 */
	EClass getRepeat();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.dsl.roboprose.model.Repeat#getShouldRepeat <em>Should Repeat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Should Repeat</em>'.
	 * @see dk.itu.dsl.roboprose.model.Repeat#getShouldRepeat()
	 * @see #getRepeat()
	 * @generated
	 */
	EAttribute getRepeat_ShouldRepeat();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.hasDuration <em>has Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>has Duration</em>'.
	 * @see dk.itu.dsl.roboprose.model.hasDuration
	 * @generated
	 */
	EClass gethasDuration();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.dsl.roboprose.model.hasDuration#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see dk.itu.dsl.roboprose.model.hasDuration#getDuration()
	 * @see #gethasDuration()
	 * @generated
	 */
	EAttribute gethasDuration_Duration();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.randomizable <em>randomizable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>randomizable</em>'.
	 * @see dk.itu.dsl.roboprose.model.randomizable
	 * @generated
	 */
	EClass getrandomizable();

	/**
	 * Returns the meta object for the attribute '{@link dk.itu.dsl.roboprose.model.randomizable#getIsRandom <em>Is Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Random</em>'.
	 * @see dk.itu.dsl.roboprose.model.randomizable#getIsRandom()
	 * @see #getrandomizable()
	 * @generated
	 */
	EAttribute getrandomizable_IsRandom();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Stop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop</em>'.
	 * @see dk.itu.dsl.roboprose.model.Stop
	 * @generated
	 */
	EClass getStop();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.RotorAction <em>Rotor Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rotor Action</em>'.
	 * @see dk.itu.dsl.roboprose.model.RotorAction
	 * @generated
	 */
	EClass getRotorAction();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obstacle</em>'.
	 * @see dk.itu.dsl.roboprose.model.Obstacle
	 * @generated
	 */
	EClass getObstacle();

	/**
	 * Returns the meta object for class '{@link dk.itu.dsl.roboprose.model.Tapped <em>Tapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tapped</em>'.
	 * @see dk.itu.dsl.roboprose.model.Tapped
	 * @generated
	 */
	EClass getTapped();

	/**
	 * Returns the meta object for enum '{@link dk.itu.dsl.roboprose.model.MOVE_DIRECTION <em>MOVE DIRECTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>MOVE DIRECTION</em>'.
	 * @see dk.itu.dsl.roboprose.model.MOVE_DIRECTION
	 * @generated
	 */
	EEnum getMOVE_DIRECTION();

	/**
	 * Returns the meta object for enum '{@link dk.itu.dsl.roboprose.model.TURN_DIRECTION <em>TURN DIRECTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TURN DIRECTION</em>'.
	 * @see dk.itu.dsl.roboprose.model.TURN_DIRECTION
	 * @generated
	 */
	EEnum getTURN_DIRECTION();

	/**
	 * Returns the meta object for enum '{@link dk.itu.dsl.roboprose.model.SHOULD_REPEAT <em>SHOULD REPEAT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SHOULD REPEAT</em>'.
	 * @see dk.itu.dsl.roboprose.model.SHOULD_REPEAT
	 * @generated
	 */
	EEnum getSHOULD_REPEAT();

	/**
	 * Returns the meta object for enum '{@link dk.itu.dsl.roboprose.model.RANDOM <em>RANDOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>RANDOM</em>'.
	 * @see dk.itu.dsl.roboprose.model.RANDOM
	 * @generated
	 */
	EEnum getRANDOM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RoboproseFactory getRoboproseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.RootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.RootImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRoot()
		 * @generated
		 */
		EClass ROOT = eINSTANCE.getRoot();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__ROBOTS = eINSTANCE.getRoot_Robots();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOT__EVENTS = eINSTANCE.getRoot_Events();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.RoboProseImpl <em>Robo Prose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.RoboProseImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRoboProse()
		 * @generated
		 */
		EClass ROBO_PROSE = eINSTANCE.getRoboProse();

		/**
		 * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBO_PROSE__MAIN = eINSTANCE.getRoboProse_Main();

		/**
		 * The meta object literal for the '<em><b>Listeners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROBO_PROSE__LISTENERS = eINSTANCE.getRoboProse_Listeners();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.MainImpl <em>Main</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.MainImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getMain()
		 * @generated
		 */
		EClass MAIN = eINSTANCE.getMain();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN__ACTIONS = eINSTANCE.getMain_Actions();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.EventListenerImpl <em>Event Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.EventListenerImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getEventListener()
		 * @generated
		 */
		EClass EVENT_LISTENER = eINSTANCE.getEventListener();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENER__EVENT = eINSTANCE.getEventListener_Event();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENER__ACTIONS = eINSTANCE.getEventListener_Actions();

		/**
		 * The meta object literal for the '<em><b>Sublisteners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_LISTENER__SUBLISTENERS = eINSTANCE.getEventListener_Sublisteners();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.EventImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.ActionImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.MoveImpl <em>Move</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.MoveImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getMove()
		 * @generated
		 */
		EClass MOVE = eINSTANCE.getMove();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE__DIRECTION = eINSTANCE.getMove_Direction();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.TurnImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Degrees</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__DEGREES = eINSTANCE.getTurn_Degrees();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN__DIRECTION = eINSTANCE.getTurn_Direction();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.RepeatImpl <em>Repeat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.RepeatImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRepeat()
		 * @generated
		 */
		EClass REPEAT = eINSTANCE.getRepeat();

		/**
		 * The meta object literal for the '<em><b>Should Repeat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPEAT__SHOULD_REPEAT = eINSTANCE.getRepeat_ShouldRepeat();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.hasDurationImpl <em>has Duration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.hasDurationImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#gethasDuration()
		 * @generated
		 */
		EClass HAS_DURATION = eINSTANCE.gethasDuration();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAS_DURATION__DURATION = eINSTANCE.gethasDuration_Duration();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.randomizableImpl <em>randomizable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.randomizableImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getrandomizable()
		 * @generated
		 */
		EClass RANDOMIZABLE = eINSTANCE.getrandomizable();

		/**
		 * The meta object literal for the '<em><b>Is Random</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOMIZABLE__IS_RANDOM = eINSTANCE.getrandomizable_IsRandom();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.StopImpl <em>Stop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.StopImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getStop()
		 * @generated
		 */
		EClass STOP = eINSTANCE.getStop();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.RotorActionImpl <em>Rotor Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.RotorActionImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRotorAction()
		 * @generated
		 */
		EClass ROTOR_ACTION = eINSTANCE.getRotorAction();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.ObstacleImpl <em>Obstacle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.ObstacleImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getObstacle()
		 * @generated
		 */
		EClass OBSTACLE = eINSTANCE.getObstacle();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.impl.TappedImpl <em>Tapped</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.impl.TappedImpl
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getTapped()
		 * @generated
		 */
		EClass TAPPED = eINSTANCE.getTapped();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.MOVE_DIRECTION <em>MOVE DIRECTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.MOVE_DIRECTION
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getMOVE_DIRECTION()
		 * @generated
		 */
		EEnum MOVE_DIRECTION = eINSTANCE.getMOVE_DIRECTION();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.TURN_DIRECTION <em>TURN DIRECTION</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.TURN_DIRECTION
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getTURN_DIRECTION()
		 * @generated
		 */
		EEnum TURN_DIRECTION = eINSTANCE.getTURN_DIRECTION();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.SHOULD_REPEAT <em>SHOULD REPEAT</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.SHOULD_REPEAT
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getSHOULD_REPEAT()
		 * @generated
		 */
		EEnum SHOULD_REPEAT = eINSTANCE.getSHOULD_REPEAT();

		/**
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.RANDOM <em>RANDOM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.RANDOM
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getRANDOM()
		 * @generated
		 */
		EEnum RANDOM = eINSTANCE.getRANDOM();

	}

} //RoboprosePackage
