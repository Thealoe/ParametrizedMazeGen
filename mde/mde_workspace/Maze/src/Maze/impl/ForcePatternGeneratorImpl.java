/**
 */
package Maze.impl;

import Maze.ForcePatternGenerator;
import Maze.MazeCell;
import Maze.MazePackage;
import Maze.SolutionPathGenerator;

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
 * An implementation of the model object '<em><b>Force Pattern Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Maze.impl.ForcePatternGeneratorImpl#getSpg <em>Spg</em>}</li>
 *   <li>{@link Maze.impl.ForcePatternGeneratorImpl#getMazeCells <em>Maze Cells</em>}</li>
 *   <li>{@link Maze.impl.ForcePatternGeneratorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForcePatternGeneratorImpl extends EObjectImpl implements ForcePatternGenerator {
	/**
	 * The cached value of the '{@link #getSpg() <em>Spg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpg()
	 * @generated
	 * @ordered
	 */
	protected SolutionPathGenerator spg;

	/**
	 * The cached value of the '{@link #getMazeCells() <em>Maze Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMazeCells()
	 * @generated
	 * @ordered
	 */
	protected EList<MazeCell> mazeCells;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "FPGen";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForcePatternGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MazePackage.Literals.FORCE_PATTERN_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SolutionPathGenerator getSpg() {
		if (spg != null && spg.eIsProxy()) {
			InternalEObject oldSpg = (InternalEObject)spg;
			spg = (SolutionPathGenerator)eResolveProxy(oldSpg);
			if (spg != oldSpg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MazePackage.FORCE_PATTERN_GENERATOR__SPG, oldSpg, spg));
			}
		}
		return spg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolutionPathGenerator basicGetSpg() {
		return spg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpg(SolutionPathGenerator newSpg) {
		SolutionPathGenerator oldSpg = spg;
		spg = newSpg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.FORCE_PATTERN_GENERATOR__SPG, oldSpg, spg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MazeCell> getMazeCells() {
		if (mazeCells == null) {
			mazeCells = new EObjectContainmentEList<MazeCell>(MazeCell.class, this, MazePackage.FORCE_PATTERN_GENERATOR__MAZE_CELLS);
		}
		return mazeCells;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MazePackage.FORCE_PATTERN_GENERATOR__MAZE_CELLS:
				return ((InternalEList<?>)getMazeCells()).basicRemove(otherEnd, msgs);
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
			case MazePackage.FORCE_PATTERN_GENERATOR__SPG:
				if (resolve) return getSpg();
				return basicGetSpg();
			case MazePackage.FORCE_PATTERN_GENERATOR__MAZE_CELLS:
				return getMazeCells();
			case MazePackage.FORCE_PATTERN_GENERATOR__NAME:
				return getName();
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
			case MazePackage.FORCE_PATTERN_GENERATOR__SPG:
				setSpg((SolutionPathGenerator)newValue);
				return;
			case MazePackage.FORCE_PATTERN_GENERATOR__MAZE_CELLS:
				getMazeCells().clear();
				getMazeCells().addAll((Collection<? extends MazeCell>)newValue);
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
			case MazePackage.FORCE_PATTERN_GENERATOR__SPG:
				setSpg((SolutionPathGenerator)null);
				return;
			case MazePackage.FORCE_PATTERN_GENERATOR__MAZE_CELLS:
				getMazeCells().clear();
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
			case MazePackage.FORCE_PATTERN_GENERATOR__SPG:
				return spg != null;
			case MazePackage.FORCE_PATTERN_GENERATOR__MAZE_CELLS:
				return mazeCells != null && !mazeCells.isEmpty();
			case MazePackage.FORCE_PATTERN_GENERATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ForcePatternGeneratorImpl
