/**
 */
package Maze;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.MazeDiagram#getRectangleGen <em>Rectangle Gen</em>}</li>
 *   <li>{@link Maze.MazeDiagram#getForcePatternGen <em>Force Pattern Gen</em>}</li>
 *   <li>{@link Maze.MazeDiagram#getSolutionPathGen <em>Solution Path Gen</em>}</li>
 *   <li>{@link Maze.MazeDiagram#getMazeBodyGen <em>Maze Body Gen</em>}</li>
 *   <li>{@link Maze.MazeDiagram#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getMazeDiagram()
 * @model annotation="gmf.diagram model.extension='mz'"
 * @generated
 */
public interface MazeDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Rectangle Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangle Gen</em>' containment reference.
	 * @see #setRectangleGen(RectangleGenerator)
	 * @see Maze.MazePackage#getMazeDiagram_RectangleGen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RectangleGenerator getRectangleGen();

	/**
	 * Sets the value of the '{@link Maze.MazeDiagram#getRectangleGen <em>Rectangle Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangle Gen</em>' containment reference.
	 * @see #getRectangleGen()
	 * @generated
	 */
	void setRectangleGen(RectangleGenerator value);

	/**
	 * Returns the value of the '<em><b>Force Pattern Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Pattern Gen</em>' containment reference.
	 * @see #setForcePatternGen(ForcePatternGenerator)
	 * @see Maze.MazePackage#getMazeDiagram_ForcePatternGen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ForcePatternGenerator getForcePatternGen();

	/**
	 * Sets the value of the '{@link Maze.MazeDiagram#getForcePatternGen <em>Force Pattern Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Pattern Gen</em>' containment reference.
	 * @see #getForcePatternGen()
	 * @generated
	 */
	void setForcePatternGen(ForcePatternGenerator value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MDiagram"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getMazeDiagram_Name()
	 * @model default="MDiagram" id="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Solution Path Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solution Path Gen</em>' containment reference.
	 * @see #setSolutionPathGen(SolutionPathGenerator)
	 * @see Maze.MazePackage#getMazeDiagram_SolutionPathGen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SolutionPathGenerator getSolutionPathGen();

	/**
	 * Sets the value of the '{@link Maze.MazeDiagram#getSolutionPathGen <em>Solution Path Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solution Path Gen</em>' containment reference.
	 * @see #getSolutionPathGen()
	 * @generated
	 */
	void setSolutionPathGen(SolutionPathGenerator value);

	/**
	 * Returns the value of the '<em><b>Maze Body Gen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maze Body Gen</em>' containment reference.
	 * @see #setMazeBodyGen(MazeBodyGenerator)
	 * @see Maze.MazePackage#getMazeDiagram_MazeBodyGen()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MazeBodyGenerator getMazeBodyGen();

	/**
	 * Sets the value of the '{@link Maze.MazeDiagram#getMazeBodyGen <em>Maze Body Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maze Body Gen</em>' containment reference.
	 * @see #getMazeBodyGen()
	 * @generated
	 */
	void setMazeBodyGen(MazeBodyGenerator value);

} // MazeDiagram
