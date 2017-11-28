/**
 */
package dk.itu.dsl.roboprose.model.impl;

import dk.itu.dsl.roboprose.model.Action;
import dk.itu.dsl.roboprose.model.Event;
import dk.itu.dsl.roboprose.model.EventListener;
import dk.itu.dsl.roboprose.model.Main;
import dk.itu.dsl.roboprose.model.Move;
import dk.itu.dsl.roboprose.model.Obstacle;
import dk.itu.dsl.roboprose.model.RoboProse;
import dk.itu.dsl.roboprose.model.RoboproseFactory;
import dk.itu.dsl.roboprose.model.RoboprosePackage;
import dk.itu.dsl.roboprose.model.Root;

import dk.itu.dsl.roboprose.model.RotorAction;
import dk.itu.dsl.roboprose.model.Stop;
import dk.itu.dsl.roboprose.model.Tapped;
import dk.itu.dsl.roboprose.model.Turn;
import dk.itu.dsl.roboprose.model.hasDuration;
import dk.itu.dsl.roboprose.model.randomizable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoboprosePackageImpl extends EPackageImpl implements RoboprosePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roboProseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hasDurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomizableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tappedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum movE_DIRECTIONEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum turN_DIRECTIONEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum randomEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.itu.dsl.roboprose.model.RoboprosePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RoboprosePackageImpl() {
		super(eNS_URI, RoboproseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RoboprosePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RoboprosePackage init() {
		if (isInited) return (RoboprosePackage)EPackage.Registry.INSTANCE.getEPackage(RoboprosePackage.eNS_URI);

		// Obtain or create and register package
		RoboprosePackageImpl theRoboprosePackage = (RoboprosePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RoboprosePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RoboprosePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRoboprosePackage.createPackageContents();

		// Initialize created meta-data
		theRoboprosePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRoboprosePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RoboprosePackage.eNS_URI, theRoboprosePackage);
		return theRoboprosePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoot() {
		return rootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Robots() {
		return (EReference)rootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoot_Events() {
		return (EReference)rootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoboProse() {
		return roboProseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoboProse_Main() {
		return (EReference)roboProseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoboProse_Listeners() {
		return (EReference)roboProseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMain() {
		return mainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMain_Actions() {
		return (EReference)mainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventListener() {
		return eventListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListener_Event() {
		return (EReference)eventListenerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListener_Actions() {
		return (EReference)eventListenerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventListener_Sublisteners() {
		return (EReference)eventListenerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMove() {
		return moveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMove_Direction() {
		return (EAttribute)moveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurn() {
		return turnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Degrees() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurn_Direction() {
		return (EAttribute)turnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gethasDuration() {
		return hasDurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gethasDuration_Duration() {
		return (EAttribute)hasDurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrandomizable() {
		return randomizableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getrandomizable_IsRandom() {
		return (EAttribute)randomizableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStop() {
		return stopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotorAction() {
		return rotorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacle() {
		return obstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTapped() {
		return tappedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMOVE_DIRECTION() {
		return movE_DIRECTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTURN_DIRECTION() {
		return turN_DIRECTIONEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRANDOM() {
		return randomEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboproseFactory getRoboproseFactory() {
		return (RoboproseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		rootEClass = createEClass(ROOT);
		createEReference(rootEClass, ROOT__ROBOTS);
		createEReference(rootEClass, ROOT__EVENTS);

		roboProseEClass = createEClass(ROBO_PROSE);
		createEReference(roboProseEClass, ROBO_PROSE__MAIN);
		createEReference(roboProseEClass, ROBO_PROSE__LISTENERS);

		mainEClass = createEClass(MAIN);
		createEReference(mainEClass, MAIN__ACTIONS);

		eventListenerEClass = createEClass(EVENT_LISTENER);
		createEReference(eventListenerEClass, EVENT_LISTENER__EVENT);
		createEReference(eventListenerEClass, EVENT_LISTENER__ACTIONS);
		createEReference(eventListenerEClass, EVENT_LISTENER__SUBLISTENERS);

		eventEClass = createEClass(EVENT);

		actionEClass = createEClass(ACTION);

		moveEClass = createEClass(MOVE);
		createEAttribute(moveEClass, MOVE__DIRECTION);

		turnEClass = createEClass(TURN);
		createEAttribute(turnEClass, TURN__DEGREES);
		createEAttribute(turnEClass, TURN__DIRECTION);

		stopEClass = createEClass(STOP);

		rotorActionEClass = createEClass(ROTOR_ACTION);

		obstacleEClass = createEClass(OBSTACLE);

		tappedEClass = createEClass(TAPPED);

		hasDurationEClass = createEClass(HAS_DURATION);
		createEAttribute(hasDurationEClass, HAS_DURATION__DURATION);

		randomizableEClass = createEClass(RANDOMIZABLE);
		createEAttribute(randomizableEClass, RANDOMIZABLE__IS_RANDOM);

		// Create enums
		movE_DIRECTIONEEnum = createEEnum(MOVE_DIRECTION);
		turN_DIRECTIONEEnum = createEEnum(TURN_DIRECTION);
		randomEEnum = createEEnum(RANDOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		moveEClass.getESuperTypes().add(this.getRotorAction());
		moveEClass.getESuperTypes().add(this.gethasDuration());
		moveEClass.getESuperTypes().add(this.getrandomizable());
		turnEClass.getESuperTypes().add(this.getRotorAction());
		turnEClass.getESuperTypes().add(this.gethasDuration());
		turnEClass.getESuperTypes().add(this.getrandomizable());
		stopEClass.getESuperTypes().add(this.getAction());
		stopEClass.getESuperTypes().add(this.gethasDuration());
		rotorActionEClass.getESuperTypes().add(this.getAction());
		obstacleEClass.getESuperTypes().add(this.getEvent());
		tappedEClass.getESuperTypes().add(this.getEvent());

		// Initialize classes, features, and operations; add parameters
		initEClass(rootEClass, Root.class, "Root", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoot_Robots(), this.getRoboProse(), null, "robots", null, 1, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoot_Events(), this.getEvent(), null, "events", null, 0, -1, Root.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roboProseEClass, RoboProse.class, "RoboProse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoboProse_Main(), this.getMain(), null, "main", null, 0, 1, RoboProse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoboProse_Listeners(), this.getEventListener(), null, "listeners", null, 0, -1, RoboProse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainEClass, Main.class, "Main", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMain_Actions(), this.getAction(), null, "actions", null, 1, -1, Main.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventListenerEClass, EventListener.class, "EventListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventListener_Event(), this.getEvent(), null, "event", null, 1, 1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventListener_Actions(), this.getAction(), null, "actions", null, 0, -1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventListener_Sublisteners(), this.getEventListener(), null, "sublisteners", null, 0, -1, EventListener.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moveEClass, Move.class, "Move", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMove_Direction(), this.getMOVE_DIRECTION(), "direction", "forwards", 1, 1, Move.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnEClass, Turn.class, "Turn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurn_Degrees(), ecorePackage.getEFloat(), "degrees", "90.0", 0, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTurn_Direction(), this.getTURN_DIRECTION(), "direction", "left", 1, 1, Turn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stopEClass, Stop.class, "Stop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotorActionEClass, RotorAction.class, "RotorAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obstacleEClass, Obstacle.class, "Obstacle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tappedEClass, Tapped.class, "Tapped", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hasDurationEClass, hasDuration.class, "hasDuration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gethasDuration_Duration(), ecorePackage.getEFloat(), "duration", "1.0", 0, 1, hasDuration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomizableEClass, randomizable.class, "randomizable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getrandomizable_IsRandom(), this.getRANDOM(), "isRandom", "notRandom", 0, 1, randomizable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(movE_DIRECTIONEEnum, dk.itu.dsl.roboprose.model.MOVE_DIRECTION.class, "MOVE_DIRECTION");
		addEEnumLiteral(movE_DIRECTIONEEnum, dk.itu.dsl.roboprose.model.MOVE_DIRECTION.FORWARDS);
		addEEnumLiteral(movE_DIRECTIONEEnum, dk.itu.dsl.roboprose.model.MOVE_DIRECTION.BACKWARDS);

		initEEnum(turN_DIRECTIONEEnum, dk.itu.dsl.roboprose.model.TURN_DIRECTION.class, "TURN_DIRECTION");
		addEEnumLiteral(turN_DIRECTIONEEnum, dk.itu.dsl.roboprose.model.TURN_DIRECTION.LEFT);
		addEEnumLiteral(turN_DIRECTIONEEnum, dk.itu.dsl.roboprose.model.TURN_DIRECTION.RIGHT);

		initEEnum(randomEEnum, dk.itu.dsl.roboprose.model.RANDOM.class, "RANDOM");
		addEEnumLiteral(randomEEnum, dk.itu.dsl.roboprose.model.RANDOM.RANDOM);
		addEEnumLiteral(randomEEnum, dk.itu.dsl.roboprose.model.RANDOM.NOT_RANDOM);

		// Create resource
		createResource(eNS_URI);
	}

} //RoboprosePackageImpl
