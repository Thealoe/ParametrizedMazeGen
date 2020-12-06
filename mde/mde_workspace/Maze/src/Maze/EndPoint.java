/**
 */
package Maze;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.EndPoint#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getEndPoint()
 * @model annotation="gmf.node color='245,197,66' figure='rounded' label.icon='false' label='name' size='40,40'"
 * @generated
 */
public interface EndPoint extends Point {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"EP"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getEndPoint_Name()
	 * @model default="EP" id="true" changeable="false"
	 * @generated
	 */
	String getName();

} // EndPoint
