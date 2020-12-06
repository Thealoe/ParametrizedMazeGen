/**
 */
package Maze.impl;

import Maze.ColumnCount;
import Maze.DecisionsRate;
import Maze.MazeBodyGenerator;
import Maze.MazeDiagram;
import Maze.MazePackage;
import Maze.RectangleGenerator;

import Maze.RowCount;
import Maze.SolutionPathGenerator;
import Maze.StraightRate;
import Maze.TurnRate;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Maze.impl.MazeDiagramImpl#getRectangleGen <em>Rectangle Gen</em>}</li>
 *   <li>{@link Maze.impl.MazeDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link Maze.impl.MazeDiagramImpl#getSolutionPathGen <em>Solution Path Gen</em>}</li>
 *   <li>{@link Maze.impl.MazeDiagramImpl#getMazeBodyGen <em>Maze Body Gen</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MazeDiagramImpl extends EObjectImpl implements MazeDiagram {
	/**
	 * The cached value of the '{@link #getRectangleGen() <em>Rectangle Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectangleGen()
	 * @generated
	 * @ordered
	 */
	protected RectangleGenerator rectangleGen;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MDiagram";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSolutionPathGen() <em>Solution Path Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolutionPathGen()
	 * @generated
	 * @ordered
	 */
	protected SolutionPathGenerator solutionPathGen;

	/**
	 * The cached value of the '{@link #getMazeBodyGen() <em>Maze Body Gen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMazeBodyGen()
	 * @generated
	 * @ordered
	 */
	protected MazeBodyGenerator mazeBodyGen;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MazeDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MazePackage.Literals.MAZE_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RectangleGenerator getRectangleGen() {
		return rectangleGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRectangleGen(RectangleGenerator newRectangleGen, NotificationChain msgs) {
		RectangleGenerator oldRectangleGen = rectangleGen;
		rectangleGen = newRectangleGen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN, oldRectangleGen, newRectangleGen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRectangleGen(RectangleGenerator newRectangleGen) {
		if (newRectangleGen != rectangleGen) {
			NotificationChain msgs = null;
			if (rectangleGen != null)
				msgs = ((InternalEObject)rectangleGen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN, null, msgs);
			if (newRectangleGen != null)
				msgs = ((InternalEObject)newRectangleGen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN, null, msgs);
			msgs = basicSetRectangleGen(newRectangleGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN, newRectangleGen, newRectangleGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolutionPathGenerator getSolutionPathGen() {
		return solutionPathGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolutionPathGen(SolutionPathGenerator newSolutionPathGen, NotificationChain msgs) {
		SolutionPathGenerator oldSolutionPathGen = solutionPathGen;
		solutionPathGen = newSolutionPathGen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN, oldSolutionPathGen, newSolutionPathGen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSolutionPathGen(SolutionPathGenerator newSolutionPathGen) {
		if (newSolutionPathGen != solutionPathGen) {
			NotificationChain msgs = null;
			if (solutionPathGen != null)
				msgs = ((InternalEObject)solutionPathGen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN, null, msgs);
			if (newSolutionPathGen != null)
				msgs = ((InternalEObject)newSolutionPathGen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN, null, msgs);
			msgs = basicSetSolutionPathGen(newSolutionPathGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN, newSolutionPathGen, newSolutionPathGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MazeBodyGenerator getMazeBodyGen() {
		return mazeBodyGen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMazeBodyGen(MazeBodyGenerator newMazeBodyGen, NotificationChain msgs) {
		MazeBodyGenerator oldMazeBodyGen = mazeBodyGen;
		mazeBodyGen = newMazeBodyGen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN, oldMazeBodyGen, newMazeBodyGen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMazeBodyGen(MazeBodyGenerator newMazeBodyGen) {
		if (newMazeBodyGen != mazeBodyGen) {
			NotificationChain msgs = null;
			if (mazeBodyGen != null)
				msgs = ((InternalEObject)mazeBodyGen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN, null, msgs);
			if (newMazeBodyGen != null)
				msgs = ((InternalEObject)newMazeBodyGen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN, null, msgs);
			msgs = basicSetMazeBodyGen(newMazeBodyGen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN, newMazeBodyGen, newMazeBodyGen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN:
				return basicSetRectangleGen(null, msgs);
			case MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN:
				return basicSetSolutionPathGen(null, msgs);
			case MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN:
				return basicSetMazeBodyGen(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN:
				return getRectangleGen();
			case MazePackage.MAZE_DIAGRAM__NAME:
				return getName();
			case MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN:
				return getSolutionPathGen();
			case MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN:
				return getMazeBodyGen();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN:
				setRectangleGen((RectangleGenerator)newValue);
				return;
			case MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN:
				setSolutionPathGen((SolutionPathGenerator)newValue);
				return;
			case MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN:
				setMazeBodyGen((MazeBodyGenerator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN:
				setRectangleGen((RectangleGenerator)null);
				return;
			case MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN:
				setSolutionPathGen((SolutionPathGenerator)null);
				return;
			case MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN:
				setMazeBodyGen((MazeBodyGenerator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MazePackage.MAZE_DIAGRAM__RECTANGLE_GEN:
				return rectangleGen != null;
			case MazePackage.MAZE_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MazePackage.MAZE_DIAGRAM__SOLUTION_PATH_GEN:
				return solutionPathGen != null;
			case MazePackage.MAZE_DIAGRAM__MAZE_BODY_GEN:
				return mazeBodyGen != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MazeDiagramImpl
