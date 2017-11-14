/**
 */
package dk.itu.dsl.roboprose.model;

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
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.Root <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.Root
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
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_FEATURE_COUNT = 1;

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
	int EVENT_LISTENER = 3;

	/**
	 * The feature id for the '<em><b>Event</b></em>' reference.
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
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.EventImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 4;

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
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.impl.ActionImpl
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

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
	 * The meta object id for the '{@link dk.itu.dsl.roboprose.model.NewEnum1 <em>New Enum1</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.itu.dsl.roboprose.model.NewEnum1
	 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getNewEnum1()
	 * @generated
	 */
	int NEW_ENUM1 = 6;


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
	 * Returns the meta object for the reference '{@link dk.itu.dsl.roboprose.model.EventListener#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event</em>'.
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
	 * Returns the meta object for enum '{@link dk.itu.dsl.roboprose.model.NewEnum1 <em>New Enum1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>New Enum1</em>'.
	 * @see dk.itu.dsl.roboprose.model.NewEnum1
	 * @generated
	 */
	EEnum getNewEnum1();

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
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.Root <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.Root
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
		 * The meta object literal for the '<em><b>Event</b></em>' reference feature.
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
		 * The meta object literal for the '{@link dk.itu.dsl.roboprose.model.NewEnum1 <em>New Enum1</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.itu.dsl.roboprose.model.NewEnum1
		 * @see dk.itu.dsl.roboprose.model.impl.RoboprosePackageImpl#getNewEnum1()
		 * @generated
		 */
		EEnum NEW_ENUM1 = eINSTANCE.getNewEnum1();

	}

} //RoboprosePackage
