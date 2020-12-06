/**
 */
package Maze;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.MazeBodyGenerator#getDr <em>Dr</em>}</li>
 *   <li>{@link Maze.MazeBodyGenerator#getSr <em>Sr</em>}</li>
 *   <li>{@link Maze.MazeBodyGenerator#getTr <em>Tr</em>}</li>
 *   <li>{@link Maze.MazeBodyGenerator#getEr <em>Er</em>}</li>
 *   <li>{@link Maze.MazeBodyGenerator#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getMazeBodyGenerator()
 * @model abstract="true"
 *        annotation="gmf.node color='128,159,255' figure='rectangle' label.icon='false' label='name' size='100,40'"
 * @generated
 */
public interface MazeBodyGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Dr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr</em>' containment reference.
	 * @see #setDr(DecisionsRate)
	 * @see Maze.MazePackage#getMazeBodyGenerator_Dr()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	DecisionsRate getDr();

	/**
	 * Sets the value of the '{@link Maze.MazeBodyGenerator#getDr <em>Dr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dr</em>' containment reference.
	 * @see #getDr()
	 * @generated
	 */
	void setDr(DecisionsRate value);

	/**
	 * Returns the value of the '<em><b>Sr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr</em>' containment reference.
	 * @see #setSr(StraightRate)
	 * @see Maze.MazePackage#getMazeBodyGenerator_Sr()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	StraightRate getSr();

	/**
	 * Sets the value of the '{@link Maze.MazeBodyGenerator#getSr <em>Sr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr</em>' containment reference.
	 * @see #getSr()
	 * @generated
	 */
	void setSr(StraightRate value);

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference.
	 * @see #setTr(TurnRate)
	 * @see Maze.MazePackage#getMazeBodyGenerator_Tr()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	TurnRate getTr();

	/**
	 * Sets the value of the '{@link Maze.MazeBodyGenerator#getTr <em>Tr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr</em>' containment reference.
	 * @see #getTr()
	 * @generated
	 */
	void setTr(TurnRate value);

	/**
	 * Returns the value of the '<em><b>Er</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Er</em>' containment reference.
	 * @see #setEr(EndRate)
	 * @see Maze.MazePackage#getMazeBodyGenerator_Er()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EndRate getEr();

	/**
	 * Sets the value of the '{@link Maze.MazeBodyGenerator#getEr <em>Er</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Er</em>' containment reference.
	 * @see #getEr()
	 * @generated
	 */
	void setEr(EndRate value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"MBGen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getMazeBodyGenerator_Name()
	 * @model default="MBGen" id="true" changeable="false"
	 * @generated
	 */
	String getName();

} // MazeBodyGenerator
