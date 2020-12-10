/**
 */
package Maze;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.MazeCell#getType <em>Type</em>}</li>
 *   <li>{@link Maze.MazeCell#getName <em>Name</em>}</li>
 *   <li>{@link Maze.MazeCell#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getMazeCell()
 * @model annotation="gmf.node color='245,197,66' figure='rounded' label.icon='false' label='type' size='40,40'"
 * @generated
 */
public interface MazeCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see Maze.MazePackage#getMazeCell_Type()
	 * @model
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link Maze.MazeCell#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MC"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getMazeCell_Name()
	 * @model default="MC" id="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point</em>' containment reference.
	 * @see #setPoint(CellPoint)
	 * @see Maze.MazePackage#getMazeCell_Point()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	CellPoint getPoint();

	/**
	 * Sets the value of the '{@link Maze.MazeCell#getPoint <em>Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point</em>' containment reference.
	 * @see #getPoint()
	 * @generated
	 */
	void setPoint(CellPoint value);

} // MazeCell
