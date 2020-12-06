/**
 */
package Maze;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Maze.MazeFactory
 * @model kind="package"
 * @generated
 */
public interface MazePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Maze";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "geodes.sms.maze";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MazePackage eINSTANCE = Maze.impl.MazePackageImpl.init();

	/**
	 * The meta object id for the '{@link Maze.impl.MazeDiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.MazeDiagramImpl
	 * @see Maze.impl.MazePackageImpl#getMazeDiagram()
	 * @generated
	 */
	int MAZE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Rectangle Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_DIAGRAM__RECTANGLE_GEN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_DIAGRAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Solution Path Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_DIAGRAM__SOLUTION_PATH_GEN = 2;

	/**
	 * The feature id for the '<em><b>Maze Body Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_DIAGRAM__MAZE_BODY_GEN = 3;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link Maze.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.CountImpl
	 * @see Maze.impl.MazePackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Maze.impl.RateImpl <em>Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.RateImpl
	 * @see Maze.impl.MazePackageImpl#getRate()
	 * @generated
	 */
	int RATE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link Maze.impl.RectangleGeneratorImpl <em>Rectangle Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.RectangleGeneratorImpl
	 * @see Maze.impl.MazePackageImpl#getRectangleGenerator()
	 * @generated
	 */
	int RECTANGLE_GENERATOR = 5;

	/**
	 * The meta object id for the '{@link Maze.impl.SolutionPathGeneratorImpl <em>Solution Path Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.SolutionPathGeneratorImpl
	 * @see Maze.impl.MazePackageImpl#getSolutionPathGenerator()
	 * @generated
	 */
	int SOLUTION_PATH_GENERATOR = 6;

	/**
	 * The meta object id for the '{@link Maze.impl.MazeBodyGeneratorImpl <em>Body Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.MazeBodyGeneratorImpl
	 * @see Maze.impl.MazePackageImpl#getMazeBodyGenerator()
	 * @generated
	 */
	int MAZE_BODY_GENERATOR = 7;

	/**
	 * The meta object id for the '{@link Maze.impl.StackMazeBodyGeneratorImpl <em>Stack Maze Body Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.StackMazeBodyGeneratorImpl
	 * @see Maze.impl.MazePackageImpl#getStackMazeBodyGenerator()
	 * @generated
	 */
	int STACK_MAZE_BODY_GENERATOR = 8;

	/**
	 * The meta object id for the '{@link Maze.impl.RandomMazeBodyGeneratorImpl <em>Random Maze Body Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.RandomMazeBodyGeneratorImpl
	 * @see Maze.impl.MazePackageImpl#getRandomMazeBodyGenerator()
	 * @generated
	 */
	int RANDOM_MAZE_BODY_GENERATOR = 9;

	/**
	 * The meta object id for the '{@link Maze.impl.TurnRateImpl <em>Turn Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.TurnRateImpl
	 * @see Maze.impl.MazePackageImpl#getTurnRate()
	 * @generated
	 */
	int TURN_RATE = 10;

	/**
	 * The meta object id for the '{@link Maze.impl.StraightRateImpl <em>Straight Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.StraightRateImpl
	 * @see Maze.impl.MazePackageImpl#getStraightRate()
	 * @generated
	 */
	int STRAIGHT_RATE = 11;

	/**
	 * The meta object id for the '{@link Maze.impl.DecisionsRateImpl <em>Decisions Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.DecisionsRateImpl
	 * @see Maze.impl.MazePackageImpl#getDecisionsRate()
	 * @generated
	 */
	int DECISIONS_RATE = 12;

	/**
	 * The meta object id for the '{@link Maze.impl.ColumnCountImpl <em>Column Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.ColumnCountImpl
	 * @see Maze.impl.MazePackageImpl#getColumnCount()
	 * @generated
	 */
	int COLUMN_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_COUNT__VALUE = COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_COUNT__NAME = COUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Column Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_COUNT_FEATURE_COUNT = COUNT_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link Maze.impl.RowCountImpl <em>Row Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.RowCountImpl
	 * @see Maze.impl.MazePackageImpl#getRowCount()
	 * @generated
	 */
	int ROW_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT__VALUE = COUNT__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT__NAME = COUNT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Row Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_COUNT_FEATURE_COUNT = COUNT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Spg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_GENERATOR__SPG = 0;

	/**
	 * The feature id for the '<em><b>Rc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_GENERATOR__RC = 1;

	/**
	 * The feature id for the '<em><b>Cc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_GENERATOR__CC = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_GENERATOR__NAME = 3;

	/**
	 * The number of structural features of the '<em>Rectangle Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_GENERATOR_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Mbg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PATH_GENERATOR__MBG = 0;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PATH_GENERATOR__TR = 1;

	/**
	 * The feature id for the '<em><b>Sr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PATH_GENERATOR__SR = 2;

	/**
	 * The feature id for the '<em><b>Dr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PATH_GENERATOR__DR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PATH_GENERATOR__NAME = 4;

	/**
	 * The number of structural features of the '<em>Solution Path Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLUTION_PATH_GENERATOR_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Dr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_BODY_GENERATOR__DR = 0;

	/**
	 * The feature id for the '<em><b>Sr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_BODY_GENERATOR__SR = 1;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_BODY_GENERATOR__TR = 2;

	/**
	 * The feature id for the '<em><b>Er</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_BODY_GENERATOR__ER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_BODY_GENERATOR__NAME = 4;

	/**
	 * The number of structural features of the '<em>Body Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAZE_BODY_GENERATOR_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Dr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR__DR = MAZE_BODY_GENERATOR__DR;

	/**
	 * The feature id for the '<em><b>Sr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR__SR = MAZE_BODY_GENERATOR__SR;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR__TR = MAZE_BODY_GENERATOR__TR;

	/**
	 * The feature id for the '<em><b>Er</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR__ER = MAZE_BODY_GENERATOR__ER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR__NAME = MAZE_BODY_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR__TYPE_NAME = MAZE_BODY_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Stack Maze Body Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_MAZE_BODY_GENERATOR_FEATURE_COUNT = MAZE_BODY_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR__DR = MAZE_BODY_GENERATOR__DR;

	/**
	 * The feature id for the '<em><b>Sr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR__SR = MAZE_BODY_GENERATOR__SR;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR__TR = MAZE_BODY_GENERATOR__TR;

	/**
	 * The feature id for the '<em><b>Er</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR__ER = MAZE_BODY_GENERATOR__ER;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR__NAME = MAZE_BODY_GENERATOR__NAME;

	/**
	 * The feature id for the '<em><b>Type name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR__TYPE_NAME = MAZE_BODY_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Random Maze Body Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_MAZE_BODY_GENERATOR_FEATURE_COUNT = MAZE_BODY_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RATE__VALUE = RATE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RATE__NAME = RATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_RATE_FEATURE_COUNT = RATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_RATE__VALUE = RATE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_RATE__NAME = RATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Straight Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRAIGHT_RATE_FEATURE_COUNT = RATE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISIONS_RATE__VALUE = RATE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISIONS_RATE__NAME = RATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decisions Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISIONS_RATE_FEATURE_COUNT = RATE_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link Maze.impl.EndRateImpl <em>End Rate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Maze.impl.EndRateImpl
	 * @see Maze.impl.MazePackageImpl#getEndRate()
	 * @generated
	 */
	int END_RATE = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_RATE__VALUE = RATE__VALUE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_RATE__NAME = RATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End Rate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_RATE_FEATURE_COUNT = RATE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link Maze.MazeDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see Maze.MazeDiagram
	 * @generated
	 */
	EClass getMazeDiagram();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeDiagram#getRectangleGen <em>Rectangle Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rectangle Gen</em>'.
	 * @see Maze.MazeDiagram#getRectangleGen()
	 * @see #getMazeDiagram()
	 * @generated
	 */
	EReference getMazeDiagram_RectangleGen();

	/**
	 * Returns the meta object for the attribute '{@link Maze.MazeDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.MazeDiagram#getName()
	 * @see #getMazeDiagram()
	 * @generated
	 */
	EAttribute getMazeDiagram_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeDiagram#getSolutionPathGen <em>Solution Path Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solution Path Gen</em>'.
	 * @see Maze.MazeDiagram#getSolutionPathGen()
	 * @see #getMazeDiagram()
	 * @generated
	 */
	EReference getMazeDiagram_SolutionPathGen();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeDiagram#getMazeBodyGen <em>Maze Body Gen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maze Body Gen</em>'.
	 * @see Maze.MazeDiagram#getMazeBodyGen()
	 * @see #getMazeDiagram()
	 * @generated
	 */
	EReference getMazeDiagram_MazeBodyGen();

	/**
	 * Returns the meta object for class '{@link Maze.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see Maze.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for the attribute '{@link Maze.Count#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Maze.Count#getValue()
	 * @see #getCount()
	 * @generated
	 */
	EAttribute getCount_Value();

	/**
	 * Returns the meta object for class '{@link Maze.Rate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rate</em>'.
	 * @see Maze.Rate
	 * @generated
	 */
	EClass getRate();

	/**
	 * Returns the meta object for the attribute '{@link Maze.Rate#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Maze.Rate#getValue()
	 * @see #getRate()
	 * @generated
	 */
	EAttribute getRate_Value();

	/**
	 * Returns the meta object for class '{@link Maze.RectangleGenerator <em>Rectangle Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle Generator</em>'.
	 * @see Maze.RectangleGenerator
	 * @generated
	 */
	EClass getRectangleGenerator();

	/**
	 * Returns the meta object for the reference '{@link Maze.RectangleGenerator#getSpg <em>Spg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Spg</em>'.
	 * @see Maze.RectangleGenerator#getSpg()
	 * @see #getRectangleGenerator()
	 * @generated
	 */
	EReference getRectangleGenerator_Spg();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.RectangleGenerator#getRc <em>Rc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rc</em>'.
	 * @see Maze.RectangleGenerator#getRc()
	 * @see #getRectangleGenerator()
	 * @generated
	 */
	EReference getRectangleGenerator_Rc();

	/**
	 * Returns the meta object for the attribute '{@link Maze.RectangleGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.RectangleGenerator#getName()
	 * @see #getRectangleGenerator()
	 * @generated
	 */
	EAttribute getRectangleGenerator_Name();

	/**
	 * Returns the meta object for class '{@link Maze.SolutionPathGenerator <em>Solution Path Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solution Path Generator</em>'.
	 * @see Maze.SolutionPathGenerator
	 * @generated
	 */
	EClass getSolutionPathGenerator();

	/**
	 * Returns the meta object for the reference '{@link Maze.SolutionPathGenerator#getMbg <em>Mbg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mbg</em>'.
	 * @see Maze.SolutionPathGenerator#getMbg()
	 * @see #getSolutionPathGenerator()
	 * @generated
	 */
	EReference getSolutionPathGenerator_Mbg();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.SolutionPathGenerator#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tr</em>'.
	 * @see Maze.SolutionPathGenerator#getTr()
	 * @see #getSolutionPathGenerator()
	 * @generated
	 */
	EReference getSolutionPathGenerator_Tr();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.SolutionPathGenerator#getSr <em>Sr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sr</em>'.
	 * @see Maze.SolutionPathGenerator#getSr()
	 * @see #getSolutionPathGenerator()
	 * @generated
	 */
	EReference getSolutionPathGenerator_Sr();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.SolutionPathGenerator#getDr <em>Dr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dr</em>'.
	 * @see Maze.SolutionPathGenerator#getDr()
	 * @see #getSolutionPathGenerator()
	 * @generated
	 */
	EReference getSolutionPathGenerator_Dr();

	/**
	 * Returns the meta object for the attribute '{@link Maze.SolutionPathGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.SolutionPathGenerator#getName()
	 * @see #getSolutionPathGenerator()
	 * @generated
	 */
	EAttribute getSolutionPathGenerator_Name();

	/**
	 * Returns the meta object for class '{@link Maze.MazeBodyGenerator <em>Body Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Generator</em>'.
	 * @see Maze.MazeBodyGenerator
	 * @generated
	 */
	EClass getMazeBodyGenerator();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeBodyGenerator#getDr <em>Dr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dr</em>'.
	 * @see Maze.MazeBodyGenerator#getDr()
	 * @see #getMazeBodyGenerator()
	 * @generated
	 */
	EReference getMazeBodyGenerator_Dr();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeBodyGenerator#getSr <em>Sr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sr</em>'.
	 * @see Maze.MazeBodyGenerator#getSr()
	 * @see #getMazeBodyGenerator()
	 * @generated
	 */
	EReference getMazeBodyGenerator_Sr();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeBodyGenerator#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tr</em>'.
	 * @see Maze.MazeBodyGenerator#getTr()
	 * @see #getMazeBodyGenerator()
	 * @generated
	 */
	EReference getMazeBodyGenerator_Tr();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.MazeBodyGenerator#getEr <em>Er</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Er</em>'.
	 * @see Maze.MazeBodyGenerator#getEr()
	 * @see #getMazeBodyGenerator()
	 * @generated
	 */
	EReference getMazeBodyGenerator_Er();

	/**
	 * Returns the meta object for the attribute '{@link Maze.MazeBodyGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.MazeBodyGenerator#getName()
	 * @see #getMazeBodyGenerator()
	 * @generated
	 */
	EAttribute getMazeBodyGenerator_Name();

	/**
	 * Returns the meta object for class '{@link Maze.StackMazeBodyGenerator <em>Stack Maze Body Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Maze Body Generator</em>'.
	 * @see Maze.StackMazeBodyGenerator
	 * @generated
	 */
	EClass getStackMazeBodyGenerator();

	/**
	 * Returns the meta object for the attribute '{@link Maze.StackMazeBodyGenerator#getType_name <em>Type name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type name</em>'.
	 * @see Maze.StackMazeBodyGenerator#getType_name()
	 * @see #getStackMazeBodyGenerator()
	 * @generated
	 */
	EAttribute getStackMazeBodyGenerator_Type_name();

	/**
	 * Returns the meta object for class '{@link Maze.RandomMazeBodyGenerator <em>Random Maze Body Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Maze Body Generator</em>'.
	 * @see Maze.RandomMazeBodyGenerator
	 * @generated
	 */
	EClass getRandomMazeBodyGenerator();

	/**
	 * Returns the meta object for the attribute '{@link Maze.RandomMazeBodyGenerator#getType_name <em>Type name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type name</em>'.
	 * @see Maze.RandomMazeBodyGenerator#getType_name()
	 * @see #getRandomMazeBodyGenerator()
	 * @generated
	 */
	EAttribute getRandomMazeBodyGenerator_Type_name();

	/**
	 * Returns the meta object for class '{@link Maze.TurnRate <em>Turn Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn Rate</em>'.
	 * @see Maze.TurnRate
	 * @generated
	 */
	EClass getTurnRate();

	/**
	 * Returns the meta object for the attribute '{@link Maze.TurnRate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.TurnRate#getName()
	 * @see #getTurnRate()
	 * @generated
	 */
	EAttribute getTurnRate_Name();

	/**
	 * Returns the meta object for class '{@link Maze.StraightRate <em>Straight Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Straight Rate</em>'.
	 * @see Maze.StraightRate
	 * @generated
	 */
	EClass getStraightRate();

	/**
	 * Returns the meta object for the attribute '{@link Maze.StraightRate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.StraightRate#getName()
	 * @see #getStraightRate()
	 * @generated
	 */
	EAttribute getStraightRate_Name();

	/**
	 * Returns the meta object for class '{@link Maze.DecisionsRate <em>Decisions Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decisions Rate</em>'.
	 * @see Maze.DecisionsRate
	 * @generated
	 */
	EClass getDecisionsRate();

	/**
	 * Returns the meta object for the attribute '{@link Maze.DecisionsRate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.DecisionsRate#getName()
	 * @see #getDecisionsRate()
	 * @generated
	 */
	EAttribute getDecisionsRate_Name();

	/**
	 * Returns the meta object for class '{@link Maze.EndRate <em>End Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Rate</em>'.
	 * @see Maze.EndRate
	 * @generated
	 */
	EClass getEndRate();

	/**
	 * Returns the meta object for the attribute '{@link Maze.EndRate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.EndRate#getName()
	 * @see #getEndRate()
	 * @generated
	 */
	EAttribute getEndRate_Name();

	/**
	 * Returns the meta object for the containment reference '{@link Maze.RectangleGenerator#getCc <em>Cc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cc</em>'.
	 * @see Maze.RectangleGenerator#getCc()
	 * @see #getRectangleGenerator()
	 * @generated
	 */
	EReference getRectangleGenerator_Cc();

	/**
	 * Returns the meta object for class '{@link Maze.ColumnCount <em>Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column Count</em>'.
	 * @see Maze.ColumnCount
	 * @generated
	 */
	EClass getColumnCount();

	/**
	 * Returns the meta object for the attribute '{@link Maze.ColumnCount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.ColumnCount#getName()
	 * @see #getColumnCount()
	 * @generated
	 */
	EAttribute getColumnCount_Name();

	/**
	 * Returns the meta object for class '{@link Maze.RowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Count</em>'.
	 * @see Maze.RowCount
	 * @generated
	 */
	EClass getRowCount();

	/**
	 * Returns the meta object for the attribute '{@link Maze.RowCount#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Maze.RowCount#getName()
	 * @see #getRowCount()
	 * @generated
	 */
	EAttribute getRowCount_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MazeFactory getMazeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Maze.impl.MazeDiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.MazeDiagramImpl
		 * @see Maze.impl.MazePackageImpl#getMazeDiagram()
		 * @generated
		 */
		EClass MAZE_DIAGRAM = eINSTANCE.getMazeDiagram();

		/**
		 * The meta object literal for the '<em><b>Rectangle Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_DIAGRAM__RECTANGLE_GEN = eINSTANCE.getMazeDiagram_RectangleGen();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAZE_DIAGRAM__NAME = eINSTANCE.getMazeDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Solution Path Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_DIAGRAM__SOLUTION_PATH_GEN = eINSTANCE.getMazeDiagram_SolutionPathGen();

		/**
		 * The meta object literal for the '<em><b>Maze Body Gen</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_DIAGRAM__MAZE_BODY_GEN = eINSTANCE.getMazeDiagram_MazeBodyGen();

		/**
		 * The meta object literal for the '{@link Maze.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.CountImpl
		 * @see Maze.impl.MazePackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNT__VALUE = eINSTANCE.getCount_Value();

		/**
		 * The meta object literal for the '{@link Maze.impl.RateImpl <em>Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.RateImpl
		 * @see Maze.impl.MazePackageImpl#getRate()
		 * @generated
		 */
		EClass RATE = eINSTANCE.getRate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATE__VALUE = eINSTANCE.getRate_Value();

		/**
		 * The meta object literal for the '{@link Maze.impl.RectangleGeneratorImpl <em>Rectangle Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.RectangleGeneratorImpl
		 * @see Maze.impl.MazePackageImpl#getRectangleGenerator()
		 * @generated
		 */
		EClass RECTANGLE_GENERATOR = eINSTANCE.getRectangleGenerator();

		/**
		 * The meta object literal for the '<em><b>Spg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_GENERATOR__SPG = eINSTANCE.getRectangleGenerator_Spg();

		/**
		 * The meta object literal for the '<em><b>Rc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_GENERATOR__RC = eINSTANCE.getRectangleGenerator_Rc();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE_GENERATOR__NAME = eINSTANCE.getRectangleGenerator_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.SolutionPathGeneratorImpl <em>Solution Path Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.SolutionPathGeneratorImpl
		 * @see Maze.impl.MazePackageImpl#getSolutionPathGenerator()
		 * @generated
		 */
		EClass SOLUTION_PATH_GENERATOR = eINSTANCE.getSolutionPathGenerator();

		/**
		 * The meta object literal for the '<em><b>Mbg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_PATH_GENERATOR__MBG = eINSTANCE.getSolutionPathGenerator_Mbg();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_PATH_GENERATOR__TR = eINSTANCE.getSolutionPathGenerator_Tr();

		/**
		 * The meta object literal for the '<em><b>Sr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_PATH_GENERATOR__SR = eINSTANCE.getSolutionPathGenerator_Sr();

		/**
		 * The meta object literal for the '<em><b>Dr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLUTION_PATH_GENERATOR__DR = eINSTANCE.getSolutionPathGenerator_Dr();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLUTION_PATH_GENERATOR__NAME = eINSTANCE.getSolutionPathGenerator_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.MazeBodyGeneratorImpl <em>Body Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.MazeBodyGeneratorImpl
		 * @see Maze.impl.MazePackageImpl#getMazeBodyGenerator()
		 * @generated
		 */
		EClass MAZE_BODY_GENERATOR = eINSTANCE.getMazeBodyGenerator();

		/**
		 * The meta object literal for the '<em><b>Dr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_BODY_GENERATOR__DR = eINSTANCE.getMazeBodyGenerator_Dr();

		/**
		 * The meta object literal for the '<em><b>Sr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_BODY_GENERATOR__SR = eINSTANCE.getMazeBodyGenerator_Sr();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_BODY_GENERATOR__TR = eINSTANCE.getMazeBodyGenerator_Tr();

		/**
		 * The meta object literal for the '<em><b>Er</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAZE_BODY_GENERATOR__ER = eINSTANCE.getMazeBodyGenerator_Er();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAZE_BODY_GENERATOR__NAME = eINSTANCE.getMazeBodyGenerator_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.StackMazeBodyGeneratorImpl <em>Stack Maze Body Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.StackMazeBodyGeneratorImpl
		 * @see Maze.impl.MazePackageImpl#getStackMazeBodyGenerator()
		 * @generated
		 */
		EClass STACK_MAZE_BODY_GENERATOR = eINSTANCE.getStackMazeBodyGenerator();

		/**
		 * The meta object literal for the '<em><b>Type name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_MAZE_BODY_GENERATOR__TYPE_NAME = eINSTANCE.getStackMazeBodyGenerator_Type_name();

		/**
		 * The meta object literal for the '{@link Maze.impl.RandomMazeBodyGeneratorImpl <em>Random Maze Body Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.RandomMazeBodyGeneratorImpl
		 * @see Maze.impl.MazePackageImpl#getRandomMazeBodyGenerator()
		 * @generated
		 */
		EClass RANDOM_MAZE_BODY_GENERATOR = eINSTANCE.getRandomMazeBodyGenerator();

		/**
		 * The meta object literal for the '<em><b>Type name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_MAZE_BODY_GENERATOR__TYPE_NAME = eINSTANCE.getRandomMazeBodyGenerator_Type_name();

		/**
		 * The meta object literal for the '{@link Maze.impl.TurnRateImpl <em>Turn Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.TurnRateImpl
		 * @see Maze.impl.MazePackageImpl#getTurnRate()
		 * @generated
		 */
		EClass TURN_RATE = eINSTANCE.getTurnRate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURN_RATE__NAME = eINSTANCE.getTurnRate_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.StraightRateImpl <em>Straight Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.StraightRateImpl
		 * @see Maze.impl.MazePackageImpl#getStraightRate()
		 * @generated
		 */
		EClass STRAIGHT_RATE = eINSTANCE.getStraightRate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRAIGHT_RATE__NAME = eINSTANCE.getStraightRate_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.DecisionsRateImpl <em>Decisions Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.DecisionsRateImpl
		 * @see Maze.impl.MazePackageImpl#getDecisionsRate()
		 * @generated
		 */
		EClass DECISIONS_RATE = eINSTANCE.getDecisionsRate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISIONS_RATE__NAME = eINSTANCE.getDecisionsRate_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.EndRateImpl <em>End Rate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.EndRateImpl
		 * @see Maze.impl.MazePackageImpl#getEndRate()
		 * @generated
		 */
		EClass END_RATE = eINSTANCE.getEndRate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_RATE__NAME = eINSTANCE.getEndRate_Name();

		/**
		 * The meta object literal for the '<em><b>Cc</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECTANGLE_GENERATOR__CC = eINSTANCE.getRectangleGenerator_Cc();

		/**
		 * The meta object literal for the '{@link Maze.impl.ColumnCountImpl <em>Column Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.ColumnCountImpl
		 * @see Maze.impl.MazePackageImpl#getColumnCount()
		 * @generated
		 */
		EClass COLUMN_COUNT = eINSTANCE.getColumnCount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLUMN_COUNT__NAME = eINSTANCE.getColumnCount_Name();

		/**
		 * The meta object literal for the '{@link Maze.impl.RowCountImpl <em>Row Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Maze.impl.RowCountImpl
		 * @see Maze.impl.MazePackageImpl#getRowCount()
		 * @generated
		 */
		EClass ROW_COUNT = eINSTANCE.getRowCount();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW_COUNT__NAME = eINSTANCE.getRowCount_Name();

	}

} //MazePackage
