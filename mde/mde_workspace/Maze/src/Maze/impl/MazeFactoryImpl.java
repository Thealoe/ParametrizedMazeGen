/**
 */
package Maze.impl;

import Maze.*;

import org.eclipse.emf.ecore.EClass;
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
public class MazeFactoryImpl extends EFactoryImpl implements MazeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MazeFactory init() {
		try {
			MazeFactory theMazeFactory = (MazeFactory)EPackage.Registry.INSTANCE.getEFactory(MazePackage.eNS_URI);
			if (theMazeFactory != null) {
				return theMazeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MazeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MazeFactoryImpl() {
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
			case MazePackage.MAZE_DIAGRAM: return createMazeDiagram();
			case MazePackage.POINT: return createPoint();
			case MazePackage.COUNT: return createCount();
			case MazePackage.RATE: return createRate();
			case MazePackage.START_POINT: return createStartPoint();
			case MazePackage.END_POINT: return createEndPoint();
			case MazePackage.COLUMN_COUNT: return createColumnCount();
			case MazePackage.ROW_COUNT: return createRowCount();
			case MazePackage.RECTANGLE_GENERATOR: return createRectangleGenerator();
			case MazePackage.SOLUTION_PATH_GENERATOR: return createSolutionPathGenerator();
			case MazePackage.STACK_MAZE_BODY_GENERATOR: return createStackMazeBodyGenerator();
			case MazePackage.RANDOM_MAZE_BODY_GENERATOR: return createRandomMazeBodyGenerator();
			case MazePackage.TURN_RATE: return createTurnRate();
			case MazePackage.STRAIGHT_RATE: return createStraightRate();
			case MazePackage.DECISIONS_RATE: return createDecisionsRate();
			case MazePackage.END_RATE: return createEndRate();
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
	public MazeDiagram createMazeDiagram() {
		MazeDiagramImpl mazeDiagram = new MazeDiagramImpl();
		return mazeDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Count createCount() {
		CountImpl count = new CountImpl();
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rate createRate() {
		RateImpl rate = new RateImpl();
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartPoint createStartPoint() {
		StartPointImpl startPoint = new StartPointImpl();
		return startPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndPoint createEndPoint() {
		EndPointImpl endPoint = new EndPointImpl();
		return endPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleGenerator createRectangleGenerator() {
		RectangleGeneratorImpl rectangleGenerator = new RectangleGeneratorImpl();
		return rectangleGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolutionPathGenerator createSolutionPathGenerator() {
		SolutionPathGeneratorImpl solutionPathGenerator = new SolutionPathGeneratorImpl();
		return solutionPathGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StackMazeBodyGenerator createStackMazeBodyGenerator() {
		StackMazeBodyGeneratorImpl stackMazeBodyGenerator = new StackMazeBodyGeneratorImpl();
		return stackMazeBodyGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RandomMazeBodyGenerator createRandomMazeBodyGenerator() {
		RandomMazeBodyGeneratorImpl randomMazeBodyGenerator = new RandomMazeBodyGeneratorImpl();
		return randomMazeBodyGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurnRate createTurnRate() {
		TurnRateImpl turnRate = new TurnRateImpl();
		return turnRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StraightRate createStraightRate() {
		StraightRateImpl straightRate = new StraightRateImpl();
		return straightRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionsRate createDecisionsRate() {
		DecisionsRateImpl decisionsRate = new DecisionsRateImpl();
		return decisionsRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndRate createEndRate() {
		EndRateImpl endRate = new EndRateImpl();
		return endRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ColumnCount createColumnCount() {
		ColumnCountImpl columnCount = new ColumnCountImpl();
		return columnCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowCount createRowCount() {
		RowCountImpl rowCount = new RowCountImpl();
		return rowCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MazePackage getMazePackage() {
		return (MazePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MazePackage getPackage() {
		return MazePackage.eINSTANCE;
	}

} //MazeFactoryImpl
