/**
 */
package Maze;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangle Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.RectangleGenerator#getFpg <em>Fpg</em>}</li>
 *   <li>{@link Maze.RectangleGenerator#getRc <em>Rc</em>}</li>
 *   <li>{@link Maze.RectangleGenerator#getCc <em>Cc</em>}</li>
 *   <li>{@link Maze.RectangleGenerator#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getRectangleGenerator()
 * @model annotation="gmf.node color='128,159,255' figure='rectangle' label.icon='false' label='name' size='100,40'"
 * @generated
 */
public interface RectangleGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Fpg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fpg</em>' reference.
	 * @see #setFpg(ForcePatternGenerator)
	 * @see Maze.MazePackage#getRectangleGenerator_Fpg()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='solid' color='0,0,0'"
	 * @generated
	 */
	ForcePatternGenerator getFpg();

	/**
	 * Sets the value of the '{@link Maze.RectangleGenerator#getFpg <em>Fpg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpg</em>' reference.
	 * @see #getFpg()
	 * @generated
	 */
	void setFpg(ForcePatternGenerator value);

	/**
	 * Returns the value of the '<em><b>Rc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rc</em>' containment reference.
	 * @see #setRc(RowCount)
	 * @see Maze.MazePackage#getRectangleGenerator_Rc()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	RowCount getRc();

	/**
	 * Sets the value of the '{@link Maze.RectangleGenerator#getRc <em>Rc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rc</em>' containment reference.
	 * @see #getRc()
	 * @generated
	 */
	void setRc(RowCount value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"RGen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getRectangleGenerator_Name()
	 * @model default="RGen" id="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Cc</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cc</em>' containment reference.
	 * @see #setCc(ColumnCount)
	 * @see Maze.MazePackage#getRectangleGenerator_Cc()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	ColumnCount getCc();

	/**
	 * Sets the value of the '{@link Maze.RectangleGenerator#getCc <em>Cc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cc</em>' containment reference.
	 * @see #getCc()
	 * @generated
	 */
	void setCc(ColumnCount value);

} // RectangleGenerator
