/**
 */
package Maze.impl;

import Maze.ColumnCount;
import Maze.Count;
import Maze.DecisionsRate;
import Maze.EndPoint;
import Maze.EndRate;
import Maze.MazeBodyGenerator;
import Maze.MazeDiagram;
import Maze.MazeFactory;
import Maze.MazePackage;
import Maze.Point;
import Maze.RandomMazeBodyGenerator;
import Maze.Rate;
import Maze.RectangleGenerator;

import Maze.RowCount;
import Maze.SolutionPathGenerator;
import Maze.StackMazeBodyGenerator;
import Maze.StartPoint;
import Maze.StraightRate;
import Maze.TurnRate;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MazePackageImpl extends EPackageImpl implements MazePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mazeDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectangleGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solutionPathGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mazeBodyGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stackMazeBodyGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass randomMazeBodyGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass straightRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionsRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endRateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnCountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowCountEClass = null;

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
	 * @see Maze.MazePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MazePackageImpl() {
		super(eNS_URI, MazeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MazePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MazePackage init() {
		if (isInited) return (MazePackage)EPackage.Registry.INSTANCE.getEPackage(MazePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMazePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MazePackageImpl theMazePackage = registeredMazePackage instanceof MazePackageImpl ? (MazePackageImpl)registeredMazePackage : new MazePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMazePackage.createPackageContents();

		// Initialize created meta-data
		theMazePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMazePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MazePackage.eNS_URI, theMazePackage);
		return theMazePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMazeDiagram() {
		return mazeDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeDiagram_RectangleGen() {
		return (EReference)mazeDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMazeDiagram_Name() {
		return (EAttribute)mazeDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeDiagram_SolutionPathGen() {
		return (EReference)mazeDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeDiagram_MazeBodyGen() {
		return (EReference)mazeDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCount() {
		return countEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCount_Value() {
		return (EAttribute)countEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRate() {
		return rateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRate_Value() {
		return (EAttribute)rateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStartPoint() {
		return startPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStartPoint_Name() {
		return (EAttribute)startPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndPoint() {
		return endPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndPoint_Name() {
		return (EAttribute)endPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRectangleGenerator() {
		return rectangleGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRectangleGenerator_Spg() {
		return (EReference)rectangleGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRectangleGenerator_Rc() {
		return (EReference)rectangleGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRectangleGenerator_Name() {
		return (EAttribute)rectangleGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolutionPathGenerator() {
		return solutionPathGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionPathGenerator_Mbg() {
		return (EReference)solutionPathGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionPathGenerator_Tr() {
		return (EReference)solutionPathGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionPathGenerator_Sr() {
		return (EReference)solutionPathGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionPathGenerator_Dr() {
		return (EReference)solutionPathGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionPathGenerator_Sp() {
		return (EReference)solutionPathGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolutionPathGenerator_Ep() {
		return (EReference)solutionPathGeneratorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSolutionPathGenerator_Name() {
		return (EAttribute)solutionPathGeneratorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMazeBodyGenerator() {
		return mazeBodyGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeBodyGenerator_Dr() {
		return (EReference)mazeBodyGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeBodyGenerator_Sr() {
		return (EReference)mazeBodyGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeBodyGenerator_Tr() {
		return (EReference)mazeBodyGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMazeBodyGenerator_Er() {
		return (EReference)mazeBodyGeneratorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMazeBodyGenerator_Name() {
		return (EAttribute)mazeBodyGeneratorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStackMazeBodyGenerator() {
		return stackMazeBodyGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStackMazeBodyGenerator_Type_name() {
		return (EAttribute)stackMazeBodyGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRandomMazeBodyGenerator() {
		return randomMazeBodyGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRandomMazeBodyGenerator_Type_name() {
		return (EAttribute)randomMazeBodyGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTurnRate() {
		return turnRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTurnRate_Name() {
		return (EAttribute)turnRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStraightRate() {
		return straightRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStraightRate_Name() {
		return (EAttribute)straightRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDecisionsRate() {
		return decisionsRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDecisionsRate_Name() {
		return (EAttribute)decisionsRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEndRate() {
		return endRateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEndRate_Name() {
		return (EAttribute)endRateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRectangleGenerator_Cc() {
		return (EReference)rectangleGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getColumnCount() {
		return columnCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getColumnCount_Name() {
		return (EAttribute)columnCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRowCount() {
		return rowCountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRowCount_Name() {
		return (EAttribute)rowCountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MazeFactory getMazeFactory() {
		return (MazeFactory)getEFactoryInstance();
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
		mazeDiagramEClass = createEClass(MAZE_DIAGRAM);
		createEReference(mazeDiagramEClass, MAZE_DIAGRAM__RECTANGLE_GEN);
		createEAttribute(mazeDiagramEClass, MAZE_DIAGRAM__NAME);
		createEReference(mazeDiagramEClass, MAZE_DIAGRAM__SOLUTION_PATH_GEN);
		createEReference(mazeDiagramEClass, MAZE_DIAGRAM__MAZE_BODY_GEN);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);

		countEClass = createEClass(COUNT);
		createEAttribute(countEClass, COUNT__VALUE);

		rateEClass = createEClass(RATE);
		createEAttribute(rateEClass, RATE__VALUE);

		startPointEClass = createEClass(START_POINT);
		createEAttribute(startPointEClass, START_POINT__NAME);

		endPointEClass = createEClass(END_POINT);
		createEAttribute(endPointEClass, END_POINT__NAME);

		columnCountEClass = createEClass(COLUMN_COUNT);
		createEAttribute(columnCountEClass, COLUMN_COUNT__NAME);

		rowCountEClass = createEClass(ROW_COUNT);
		createEAttribute(rowCountEClass, ROW_COUNT__NAME);

		rectangleGeneratorEClass = createEClass(RECTANGLE_GENERATOR);
		createEReference(rectangleGeneratorEClass, RECTANGLE_GENERATOR__SPG);
		createEReference(rectangleGeneratorEClass, RECTANGLE_GENERATOR__RC);
		createEReference(rectangleGeneratorEClass, RECTANGLE_GENERATOR__CC);
		createEAttribute(rectangleGeneratorEClass, RECTANGLE_GENERATOR__NAME);

		solutionPathGeneratorEClass = createEClass(SOLUTION_PATH_GENERATOR);
		createEReference(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__MBG);
		createEReference(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__TR);
		createEReference(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__SR);
		createEReference(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__DR);
		createEReference(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__SP);
		createEReference(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__EP);
		createEAttribute(solutionPathGeneratorEClass, SOLUTION_PATH_GENERATOR__NAME);

		mazeBodyGeneratorEClass = createEClass(MAZE_BODY_GENERATOR);
		createEReference(mazeBodyGeneratorEClass, MAZE_BODY_GENERATOR__DR);
		createEReference(mazeBodyGeneratorEClass, MAZE_BODY_GENERATOR__SR);
		createEReference(mazeBodyGeneratorEClass, MAZE_BODY_GENERATOR__TR);
		createEReference(mazeBodyGeneratorEClass, MAZE_BODY_GENERATOR__ER);
		createEAttribute(mazeBodyGeneratorEClass, MAZE_BODY_GENERATOR__NAME);

		stackMazeBodyGeneratorEClass = createEClass(STACK_MAZE_BODY_GENERATOR);
		createEAttribute(stackMazeBodyGeneratorEClass, STACK_MAZE_BODY_GENERATOR__TYPE_NAME);

		randomMazeBodyGeneratorEClass = createEClass(RANDOM_MAZE_BODY_GENERATOR);
		createEAttribute(randomMazeBodyGeneratorEClass, RANDOM_MAZE_BODY_GENERATOR__TYPE_NAME);

		turnRateEClass = createEClass(TURN_RATE);
		createEAttribute(turnRateEClass, TURN_RATE__NAME);

		straightRateEClass = createEClass(STRAIGHT_RATE);
		createEAttribute(straightRateEClass, STRAIGHT_RATE__NAME);

		decisionsRateEClass = createEClass(DECISIONS_RATE);
		createEAttribute(decisionsRateEClass, DECISIONS_RATE__NAME);

		endRateEClass = createEClass(END_RATE);
		createEAttribute(endRateEClass, END_RATE__NAME);
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
		startPointEClass.getESuperTypes().add(this.getPoint());
		endPointEClass.getESuperTypes().add(this.getPoint());
		columnCountEClass.getESuperTypes().add(this.getCount());
		rowCountEClass.getESuperTypes().add(this.getCount());
		stackMazeBodyGeneratorEClass.getESuperTypes().add(this.getMazeBodyGenerator());
		randomMazeBodyGeneratorEClass.getESuperTypes().add(this.getMazeBodyGenerator());
		turnRateEClass.getESuperTypes().add(this.getRate());
		straightRateEClass.getESuperTypes().add(this.getRate());
		decisionsRateEClass.getESuperTypes().add(this.getRate());
		endRateEClass.getESuperTypes().add(this.getRate());

		// Initialize classes and features; add operations and parameters
		initEClass(mazeDiagramEClass, MazeDiagram.class, "MazeDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMazeDiagram_RectangleGen(), this.getRectangleGenerator(), null, "rectangleGen", null, 1, 1, MazeDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMazeDiagram_Name(), ecorePackage.getEString(), "name", "MDiagram", 0, 1, MazeDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMazeDiagram_SolutionPathGen(), this.getSolutionPathGenerator(), null, "solutionPathGen", null, 1, 1, MazeDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMazeDiagram_MazeBodyGen(), this.getMazeBodyGenerator(), null, "mazeBodyGen", null, 1, 1, MazeDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEInt(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(countEClass, Count.class, "Count", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCount_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Count.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rateEClass, Rate.class, "Rate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRate_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Rate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(startPointEClass, StartPoint.class, "StartPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStartPoint_Name(), ecorePackage.getEString(), "name", "SP", 0, 1, StartPoint.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endPointEClass, EndPoint.class, "EndPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndPoint_Name(), ecorePackage.getEString(), "name", "EP", 0, 1, EndPoint.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnCountEClass, ColumnCount.class, "ColumnCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColumnCount_Name(), ecorePackage.getEString(), "name", "CC", 0, 1, ColumnCount.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowCountEClass, RowCount.class, "RowCount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRowCount_Name(), ecorePackage.getEString(), "name", "RC", 0, 1, RowCount.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rectangleGeneratorEClass, RectangleGenerator.class, "RectangleGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRectangleGenerator_Spg(), this.getSolutionPathGenerator(), null, "spg", null, 1, 1, RectangleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangleGenerator_Rc(), this.getRowCount(), null, "rc", null, 1, 1, RectangleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRectangleGenerator_Cc(), this.getColumnCount(), null, "cc", null, 1, 1, RectangleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRectangleGenerator_Name(), ecorePackage.getEString(), "name", "RGen", 0, 1, RectangleGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solutionPathGeneratorEClass, SolutionPathGenerator.class, "SolutionPathGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolutionPathGenerator_Mbg(), this.getMazeBodyGenerator(), null, "mbg", null, 1, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionPathGenerator_Tr(), this.getTurnRate(), null, "tr", null, 1, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionPathGenerator_Sr(), this.getStraightRate(), null, "sr", null, 1, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionPathGenerator_Dr(), this.getDecisionsRate(), null, "dr", null, 1, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionPathGenerator_Sp(), this.getStartPoint(), null, "sp", null, 1, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolutionPathGenerator_Ep(), this.getEndPoint(), null, "ep", null, 1, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolutionPathGenerator_Name(), ecorePackage.getEString(), "name", "SPGen", 0, 1, SolutionPathGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mazeBodyGeneratorEClass, MazeBodyGenerator.class, "MazeBodyGenerator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMazeBodyGenerator_Dr(), this.getDecisionsRate(), null, "dr", null, 1, 1, MazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMazeBodyGenerator_Sr(), this.getStraightRate(), null, "sr", null, 1, 1, MazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMazeBodyGenerator_Tr(), this.getTurnRate(), null, "tr", null, 1, 1, MazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMazeBodyGenerator_Er(), this.getEndRate(), null, "er", null, 1, 1, MazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMazeBodyGenerator_Name(), ecorePackage.getEString(), "name", "MBGen", 0, 1, MazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stackMazeBodyGeneratorEClass, StackMazeBodyGenerator.class, "StackMazeBodyGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStackMazeBodyGenerator_Type_name(), ecorePackage.getEString(), "type_name", "SMBGen", 0, 1, StackMazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(randomMazeBodyGeneratorEClass, RandomMazeBodyGenerator.class, "RandomMazeBodyGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRandomMazeBodyGenerator_Type_name(), ecorePackage.getEString(), "type_name", "RMBGen", 0, 1, RandomMazeBodyGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turnRateEClass, TurnRate.class, "TurnRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTurnRate_Name(), ecorePackage.getEString(), "name", "TR", 0, 1, TurnRate.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(straightRateEClass, StraightRate.class, "StraightRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStraightRate_Name(), ecorePackage.getEString(), "name", "SR", 0, 1, StraightRate.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decisionsRateEClass, DecisionsRate.class, "DecisionsRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecisionsRate_Name(), ecorePackage.getEString(), "name", "DR", 0, 1, DecisionsRate.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endRateEClass, EndRate.class, "EndRate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEndRate_Name(), ecorePackage.getEString(), "name", "ER", 0, 1, EndRate.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (mazeDiagramEClass,
		   source,
		   new String[] {
			   "model.extension", "mz"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (startPointEClass,
		   source,
		   new String[] {
			   "color", "245,197,66",
			   "figure", "rounded",
			   "label.icon", "false",
			   "label", "name",
			   "size", "40,40"
		   });
		addAnnotation
		  (endPointEClass,
		   source,
		   new String[] {
			   "color", "245,197,66",
			   "figure", "rounded",
			   "label.icon", "false",
			   "label", "name",
			   "size", "40,40"
		   });
		addAnnotation
		  (columnCountEClass,
		   source,
		   new String[] {
			   "color", "255,102,102",
			   "figure", "rounded",
			   "label.icon", "false",
			   "label", "name",
			   "size", "40,40"
		   });
		addAnnotation
		  (rowCountEClass,
		   source,
		   new String[] {
			   "color", "255,102,102",
			   "figure", "rounded",
			   "label.icon", "false",
			   "label", "name",
			   "size", "40,40"
		   });
		addAnnotation
		  (rectangleGeneratorEClass,
		   source,
		   new String[] {
			   "color", "128,159,255",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label", "name",
			   "size", "100,40"
		   });
		addAnnotation
		  (solutionPathGeneratorEClass,
		   source,
		   new String[] {
			   "color", "128,159,255",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label", "name",
			   "size", "100,40"
		   });
		addAnnotation
		  (mazeBodyGeneratorEClass,
		   source,
		   new String[] {
			   "color", "128,159,255",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label", "name",
			   "size", "100,40"
		   });
		addAnnotation
		  (stackMazeBodyGeneratorEClass,
		   source,
		   new String[] {
			   "color", "128,159,255",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label", "type_name",
			   "size", "100,40"
		   });
		addAnnotation
		  (randomMazeBodyGeneratorEClass,
		   source,
		   new String[] {
			   "color", "128,159,255",
			   "figure", "rectangle",
			   "label.icon", "false",
			   "label", "type_name",
			   "size", "100,40"
		   });
		addAnnotation
		  (turnRateEClass,
		   source,
		   new String[] {
			   "color", "33,224,133",
			   "figure", "ellipse",
			   "label.icon", "false",
			   "label", "name",
			   "size", "50,50"
		   });
		addAnnotation
		  (straightRateEClass,
		   source,
		   new String[] {
			   "color", "33,224,133",
			   "figure", "ellipse",
			   "label.icon", "false",
			   "label", "name",
			   "size", "50,50"
		   });
		addAnnotation
		  (decisionsRateEClass,
		   source,
		   new String[] {
			   "color", "33,224,133",
			   "figure", "ellipse",
			   "label.icon", "false",
			   "label", "name",
			   "size", "50,50"
		   });
		addAnnotation
		  (endRateEClass,
		   source,
		   new String[] {
			   "color", "33,224,133",
			   "figure", "ellipse",
			   "label.icon", "false",
			   "label", "name",
			   "size", "50,50"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (getRectangleGenerator_Spg(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "source.decoration", "none",
			   "style", "solid",
			   "color", "0,0,0"
		   });
		addAnnotation
		  (getSolutionPathGenerator_Mbg(),
		   source,
		   new String[] {
			   "target.decoration", "arrow",
			   "source.decoration", "none",
			   "style", "solid",
			   "color", "0,0,0"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getRectangleGenerator_Rc(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getRectangleGenerator_Cc(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSolutionPathGenerator_Tr(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSolutionPathGenerator_Sr(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSolutionPathGenerator_Dr(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSolutionPathGenerator_Sp(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getSolutionPathGenerator_Ep(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMazeBodyGenerator_Dr(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMazeBodyGenerator_Sr(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMazeBodyGenerator_Tr(),
		   source,
		   new String[] {
		   });
		addAnnotation
		  (getMazeBodyGenerator_Er(),
		   source,
		   new String[] {
		   });
	}

} //MazePackageImpl
