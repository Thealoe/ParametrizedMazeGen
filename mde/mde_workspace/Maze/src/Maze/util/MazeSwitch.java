/**
 */
package Maze.util;

import Maze.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Maze.MazePackage
 * @generated
 */
public class MazeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MazePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MazeSwitch() {
		if (modelPackage == null) {
			modelPackage = MazePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MazePackage.MAZE_DIAGRAM: {
				MazeDiagram mazeDiagram = (MazeDiagram)theEObject;
				T result = caseMazeDiagram(mazeDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.POINT: {
				Point point = (Point)theEObject;
				T result = casePoint(point);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.COUNT: {
				Count count = (Count)theEObject;
				T result = caseCount(count);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.RATE: {
				Rate rate = (Rate)theEObject;
				T result = caseRate(rate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.START_POINT: {
				StartPoint startPoint = (StartPoint)theEObject;
				T result = caseStartPoint(startPoint);
				if (result == null) result = casePoint(startPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.END_POINT: {
				EndPoint endPoint = (EndPoint)theEObject;
				T result = caseEndPoint(endPoint);
				if (result == null) result = casePoint(endPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.COLUMN_COUNT: {
				ColumnCount columnCount = (ColumnCount)theEObject;
				T result = caseColumnCount(columnCount);
				if (result == null) result = caseCount(columnCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.ROW_COUNT: {
				RowCount rowCount = (RowCount)theEObject;
				T result = caseRowCount(rowCount);
				if (result == null) result = caseCount(rowCount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.RECTANGLE_GENERATOR: {
				RectangleGenerator rectangleGenerator = (RectangleGenerator)theEObject;
				T result = caseRectangleGenerator(rectangleGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.SOLUTION_PATH_GENERATOR: {
				SolutionPathGenerator solutionPathGenerator = (SolutionPathGenerator)theEObject;
				T result = caseSolutionPathGenerator(solutionPathGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.MAZE_BODY_GENERATOR: {
				MazeBodyGenerator mazeBodyGenerator = (MazeBodyGenerator)theEObject;
				T result = caseMazeBodyGenerator(mazeBodyGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.STACK_MAZE_BODY_GENERATOR: {
				StackMazeBodyGenerator stackMazeBodyGenerator = (StackMazeBodyGenerator)theEObject;
				T result = caseStackMazeBodyGenerator(stackMazeBodyGenerator);
				if (result == null) result = caseMazeBodyGenerator(stackMazeBodyGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.RANDOM_MAZE_BODY_GENERATOR: {
				RandomMazeBodyGenerator randomMazeBodyGenerator = (RandomMazeBodyGenerator)theEObject;
				T result = caseRandomMazeBodyGenerator(randomMazeBodyGenerator);
				if (result == null) result = caseMazeBodyGenerator(randomMazeBodyGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.TURN_RATE: {
				TurnRate turnRate = (TurnRate)theEObject;
				T result = caseTurnRate(turnRate);
				if (result == null) result = caseRate(turnRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.STRAIGHT_RATE: {
				StraightRate straightRate = (StraightRate)theEObject;
				T result = caseStraightRate(straightRate);
				if (result == null) result = caseRate(straightRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.DECISIONS_RATE: {
				DecisionsRate decisionsRate = (DecisionsRate)theEObject;
				T result = caseDecisionsRate(decisionsRate);
				if (result == null) result = caseRate(decisionsRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MazePackage.END_RATE: {
				EndRate endRate = (EndRate)theEObject;
				T result = caseEndRate(endRate);
				if (result == null) result = caseRate(endRate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMazeDiagram(MazeDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoint(Point object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCount(Count object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRate(Rate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartPoint(StartPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndPoint(EndPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rectangle Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rectangle Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRectangleGenerator(RectangleGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solution Path Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solution Path Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSolutionPathGenerator(SolutionPathGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMazeBodyGenerator(MazeBodyGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stack Maze Body Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stack Maze Body Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStackMazeBodyGenerator(StackMazeBodyGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Maze Body Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Maze Body Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomMazeBodyGenerator(RandomMazeBodyGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurnRate(TurnRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Straight Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Straight Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStraightRate(StraightRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decisions Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decisions Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionsRate(DecisionsRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End Rate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End Rate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndRate(EndRate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Column Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Column Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColumnCount(ColumnCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Count</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Count</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowCount(RowCount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MazeSwitch
