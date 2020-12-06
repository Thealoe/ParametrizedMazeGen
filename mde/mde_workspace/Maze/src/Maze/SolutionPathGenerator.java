/**
 */
package Maze;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solution Path Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Maze.SolutionPathGenerator#getMbg <em>Mbg</em>}</li>
 *   <li>{@link Maze.SolutionPathGenerator#getTr <em>Tr</em>}</li>
 *   <li>{@link Maze.SolutionPathGenerator#getSr <em>Sr</em>}</li>
 *   <li>{@link Maze.SolutionPathGenerator#getDr <em>Dr</em>}</li>
 *   <li>{@link Maze.SolutionPathGenerator#getSp <em>Sp</em>}</li>
 *   <li>{@link Maze.SolutionPathGenerator#getEp <em>Ep</em>}</li>
 *   <li>{@link Maze.SolutionPathGenerator#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Maze.MazePackage#getSolutionPathGenerator()
 * @model annotation="gmf.node color='128,159,255' figure='rectangle' label.icon='false' label='name' size='100,40'"
 * @generated
 */
public interface SolutionPathGenerator extends EObject {
	/**
	 * Returns the value of the '<em><b>Mbg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mbg</em>' reference.
	 * @see #setMbg(MazeBodyGenerator)
	 * @see Maze.MazePackage#getSolutionPathGenerator_Mbg()
	 * @model required="true"
	 *        annotation="gmf.link target.decoration='arrow' source.decoration='none' style='solid' color='0,0,0'"
	 * @generated
	 */
	MazeBodyGenerator getMbg();

	/**
	 * Sets the value of the '{@link Maze.SolutionPathGenerator#getMbg <em>Mbg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mbg</em>' reference.
	 * @see #getMbg()
	 * @generated
	 */
	void setMbg(MazeBodyGenerator value);

	/**
	 * Returns the value of the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tr</em>' containment reference.
	 * @see #setTr(TurnRate)
	 * @see Maze.MazePackage#getSolutionPathGenerator_Tr()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	TurnRate getTr();

	/**
	 * Sets the value of the '{@link Maze.SolutionPathGenerator#getTr <em>Tr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tr</em>' containment reference.
	 * @see #getTr()
	 * @generated
	 */
	void setTr(TurnRate value);

	/**
	 * Returns the value of the '<em><b>Sr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sr</em>' containment reference.
	 * @see #setSr(StraightRate)
	 * @see Maze.MazePackage#getSolutionPathGenerator_Sr()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	StraightRate getSr();

	/**
	 * Sets the value of the '{@link Maze.SolutionPathGenerator#getSr <em>Sr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sr</em>' containment reference.
	 * @see #getSr()
	 * @generated
	 */
	void setSr(StraightRate value);

	/**
	 * Returns the value of the '<em><b>Dr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dr</em>' containment reference.
	 * @see #setDr(DecisionsRate)
	 * @see Maze.MazePackage#getSolutionPathGenerator_Dr()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	DecisionsRate getDr();

	/**
	 * Sets the value of the '{@link Maze.SolutionPathGenerator#getDr <em>Dr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dr</em>' containment reference.
	 * @see #getDr()
	 * @generated
	 */
	void setDr(DecisionsRate value);

	/**
	 * Returns the value of the '<em><b>Sp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sp</em>' containment reference.
	 * @see #setSp(StartPoint)
	 * @see Maze.MazePackage#getSolutionPathGenerator_Sp()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	StartPoint getSp();

	/**
	 * Sets the value of the '{@link Maze.SolutionPathGenerator#getSp <em>Sp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sp</em>' containment reference.
	 * @see #getSp()
	 * @generated
	 */
	void setSp(StartPoint value);

	/**
	 * Returns the value of the '<em><b>Ep</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ep</em>' containment reference.
	 * @see #setEp(EndPoint)
	 * @see Maze.MazePackage#getSolutionPathGenerator_Ep()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment"
	 * @generated
	 */
	EndPoint getEp();

	/**
	 * Sets the value of the '{@link Maze.SolutionPathGenerator#getEp <em>Ep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ep</em>' containment reference.
	 * @see #getEp()
	 * @generated
	 */
	void setEp(EndPoint value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SPGen"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see Maze.MazePackage#getSolutionPathGenerator_Name()
	 * @model default="SPGen" id="true" changeable="false"
	 * @generated
	 */
	String getName();

} // SolutionPathGenerator
