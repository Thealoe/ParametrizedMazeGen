/**
 */
package Maze;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Maze.MazePackage
 * @generated
 */
public interface MazeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MazeFactory eINSTANCE = Maze.impl.MazeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram</em>'.
	 * @generated
	 */
	MazeDiagram createMazeDiagram();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Count</em>'.
	 * @generated
	 */
	Count createCount();

	/**
	 * Returns a new object of class '<em>Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rate</em>'.
	 * @generated
	 */
	Rate createRate();

	/**
	 * Returns a new object of class '<em>Start Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Point</em>'.
	 * @generated
	 */
	StartPoint createStartPoint();

	/**
	 * Returns a new object of class '<em>End Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Point</em>'.
	 * @generated
	 */
	EndPoint createEndPoint();

	/**
	 * Returns a new object of class '<em>Rectangle Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rectangle Generator</em>'.
	 * @generated
	 */
	RectangleGenerator createRectangleGenerator();

	/**
	 * Returns a new object of class '<em>Solution Path Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Solution Path Generator</em>'.
	 * @generated
	 */
	SolutionPathGenerator createSolutionPathGenerator();

	/**
	 * Returns a new object of class '<em>Stack Maze Body Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stack Maze Body Generator</em>'.
	 * @generated
	 */
	StackMazeBodyGenerator createStackMazeBodyGenerator();

	/**
	 * Returns a new object of class '<em>Random Maze Body Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Maze Body Generator</em>'.
	 * @generated
	 */
	RandomMazeBodyGenerator createRandomMazeBodyGenerator();

	/**
	 * Returns a new object of class '<em>Turn Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn Rate</em>'.
	 * @generated
	 */
	TurnRate createTurnRate();

	/**
	 * Returns a new object of class '<em>Straight Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Straight Rate</em>'.
	 * @generated
	 */
	StraightRate createStraightRate();

	/**
	 * Returns a new object of class '<em>Decisions Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decisions Rate</em>'.
	 * @generated
	 */
	DecisionsRate createDecisionsRate();

	/**
	 * Returns a new object of class '<em>End Rate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End Rate</em>'.
	 * @generated
	 */
	EndRate createEndRate();

	/**
	 * Returns a new object of class '<em>Column Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Column Count</em>'.
	 * @generated
	 */
	ColumnCount createColumnCount();

	/**
	 * Returns a new object of class '<em>Row Count</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row Count</em>'.
	 * @generated
	 */
	RowCount createRowCount();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MazePackage getMazePackage();

} //MazeFactory
