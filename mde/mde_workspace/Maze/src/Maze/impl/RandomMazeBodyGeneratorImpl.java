/**
 */
package Maze.impl;

import Maze.MazePackage;
import Maze.RandomMazeBodyGenerator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random Maze Body Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Maze.impl.RandomMazeBodyGeneratorImpl#getType_name <em>Type name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RandomMazeBodyGeneratorImpl extends MazeBodyGeneratorImpl implements RandomMazeBodyGenerator {
	/**
	 * The default value of the '{@link #getType_name() <em>Type name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_name()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = "RMBGen";

	/**
	 * The cached value of the '{@link #getType_name() <em>Type name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_name()
	 * @generated
	 * @ordered
	 */
	protected String type_name = TYPE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RandomMazeBodyGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MazePackage.Literals.RANDOM_MAZE_BODY_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType_name() {
		return type_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MazePackage.RANDOM_MAZE_BODY_GENERATOR__TYPE_NAME:
				return getType_name();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MazePackage.RANDOM_MAZE_BODY_GENERATOR__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? type_name != null : !TYPE_NAME_EDEFAULT.equals(type_name);
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
		result.append(" (type_name: ");
		result.append(type_name);
		result.append(')');
		return result.toString();
	}

} //RandomMazeBodyGeneratorImpl
