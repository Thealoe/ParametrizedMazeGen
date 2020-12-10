/**
 */
package Maze.util;

import Maze.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Maze.MazePackage
 * @generated
 */
public class MazeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MazePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MazeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MazePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MazeSwitch<Adapter> modelSwitch =
		new MazeSwitch<Adapter>() {
			@Override
			public Adapter caseMazeDiagram(MazeDiagram object) {
				return createMazeDiagramAdapter();
			}
			@Override
			public Adapter casePoint(Point object) {
				return createPointAdapter();
			}
			@Override
			public Adapter caseCount(Count object) {
				return createCountAdapter();
			}
			@Override
			public Adapter caseRate(Rate object) {
				return createRateAdapter();
			}
			@Override
			public Adapter caseMazeCell(MazeCell object) {
				return createMazeCellAdapter();
			}
			@Override
			public Adapter caseStartPoint(StartPoint object) {
				return createStartPointAdapter();
			}
			@Override
			public Adapter caseEndPoint(EndPoint object) {
				return createEndPointAdapter();
			}
			@Override
			public Adapter caseCellPoint(CellPoint object) {
				return createCellPointAdapter();
			}
			@Override
			public Adapter caseColumnCount(ColumnCount object) {
				return createColumnCountAdapter();
			}
			@Override
			public Adapter caseRowCount(RowCount object) {
				return createRowCountAdapter();
			}
			@Override
			public Adapter caseRectangleGenerator(RectangleGenerator object) {
				return createRectangleGeneratorAdapter();
			}
			@Override
			public Adapter caseForcePatternGenerator(ForcePatternGenerator object) {
				return createForcePatternGeneratorAdapter();
			}
			@Override
			public Adapter caseSolutionPathGenerator(SolutionPathGenerator object) {
				return createSolutionPathGeneratorAdapter();
			}
			@Override
			public Adapter caseMazeBodyGenerator(MazeBodyGenerator object) {
				return createMazeBodyGeneratorAdapter();
			}
			@Override
			public Adapter caseTurnRate(TurnRate object) {
				return createTurnRateAdapter();
			}
			@Override
			public Adapter caseStraightRate(StraightRate object) {
				return createStraightRateAdapter();
			}
			@Override
			public Adapter caseDecisionsRate(DecisionsRate object) {
				return createDecisionsRateAdapter();
			}
			@Override
			public Adapter caseEndRate(EndRate object) {
				return createEndRateAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Maze.MazeDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.MazeDiagram
	 * @generated
	 */
	public Adapter createMazeDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.Point
	 * @generated
	 */
	public Adapter createPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.Count
	 * @generated
	 */
	public Adapter createCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.Rate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.Rate
	 * @generated
	 */
	public Adapter createRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.MazeCell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.MazeCell
	 * @generated
	 */
	public Adapter createMazeCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.StartPoint <em>Start Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.StartPoint
	 * @generated
	 */
	public Adapter createStartPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.EndPoint <em>End Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.EndPoint
	 * @generated
	 */
	public Adapter createEndPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.CellPoint <em>Cell Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.CellPoint
	 * @generated
	 */
	public Adapter createCellPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.RectangleGenerator <em>Rectangle Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.RectangleGenerator
	 * @generated
	 */
	public Adapter createRectangleGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.ForcePatternGenerator <em>Force Pattern Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.ForcePatternGenerator
	 * @generated
	 */
	public Adapter createForcePatternGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.SolutionPathGenerator <em>Solution Path Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.SolutionPathGenerator
	 * @generated
	 */
	public Adapter createSolutionPathGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.MazeBodyGenerator <em>Body Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.MazeBodyGenerator
	 * @generated
	 */
	public Adapter createMazeBodyGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.TurnRate <em>Turn Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.TurnRate
	 * @generated
	 */
	public Adapter createTurnRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.StraightRate <em>Straight Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.StraightRate
	 * @generated
	 */
	public Adapter createStraightRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.DecisionsRate <em>Decisions Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.DecisionsRate
	 * @generated
	 */
	public Adapter createDecisionsRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.EndRate <em>End Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.EndRate
	 * @generated
	 */
	public Adapter createEndRateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.ColumnCount <em>Column Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.ColumnCount
	 * @generated
	 */
	public Adapter createColumnCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Maze.RowCount <em>Row Count</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Maze.RowCount
	 * @generated
	 */
	public Adapter createRowCountAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MazeAdapterFactory
