/**
 */
package Maze;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Force Pattern Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.ForcePatternGenerator#getSpg <em>Spg</em>}</li>
 *   <li>{@link Maze.ForcePatternGenerator#getMazeCells <em>Maze Cells</em>}</li>
 *   <li>{@link Maze.ForcePatternGenerator#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getForcePatternGenerator()
 * @model annotation="gmf.node color='128,159,255' figure='rectangle' label.icon='false' label='name' size='100,40'"
 * @generated
 */
public interface ForcePatternGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Spg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spg</em>' reference.
	 * @see #setSpg(SolutionPathGenerator)
	 * @see Maze.MazePackage#getForcePatternGenerator_Spg()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='solid' color='0,0,0'"
	 * @generated
	 */
	SolutionPathGenerator getSpg();

	/**
	 * Sets the value of the '{@link Maze.ForcePatternGenerator#getSpg <em>Spg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spg</em>' reference.
	 * @see #getSpg()
	 * @generated
	 */
	void setSpg(SolutionPathGenerator value);

	/**
	 * Returns the value of the '<em><b>Maze Cells</b></em>' containment reference list.
	 * The list contents are of type {@link Maze.MazeCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maze Cells</em>' containment reference list.
	 * @see Maze.MazePackage#getForcePatternGenerator_MazeCells()
	 * @model containment="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EList<MazeCell> getMazeCells();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"FPGen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getForcePatternGenerator_Name()
	 * @model default="FPGen" id="true" changeable="false"
	 * @generated
	 */
	String getName();

} // ForcePatternGenerator
