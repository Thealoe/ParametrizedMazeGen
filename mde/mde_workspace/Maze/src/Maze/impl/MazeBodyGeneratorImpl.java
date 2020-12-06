/**
 */
package Maze.impl;

import Maze.DecisionsRate;
import Maze.EndRate;
import Maze.MazeBodyGenerator;
import Maze.MazePackage;
import Maze.StraightRate;
import Maze.TurnRate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Maze.impl.MazeBodyGeneratorImpl#getDr <em>Dr</em>}</li>
 *   <li>{@link Maze.impl.MazeBodyGeneratorImpl#getSr <em>Sr</em>}</li>
 *   <li>{@link Maze.impl.MazeBodyGeneratorImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link Maze.impl.MazeBodyGeneratorImpl#getEr <em>Er</em>}</li>
 *   <li>{@link Maze.impl.MazeBodyGeneratorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MazeBodyGeneratorImpl extends EObjectImpl implements MazeBodyGenerator {
	/**
	 * The cached value of the '{@link #getDr() <em>Dr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDr()
	 * @generated
	 * @ordered
	 */
	protected DecisionsRate dr;

	/**
	 * The cached value of the '{@link #getSr() <em>Sr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSr()
	 * @generated
	 * @ordered
	 */
	protected StraightRate sr;

	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected TurnRate tr;

	/**
	 * The cached value of the '{@link #getEr() <em>Er</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEr()
	 * @generated
	 * @ordered
	 */
	protected EndRate er;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "MBGen";

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
	protected MazeBodyGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MazePackage.Literals.MAZE_BODY_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DecisionsRate getDr() {
		return dr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDr(DecisionsRate newDr, NotificationChain msgs) {
		DecisionsRate oldDr = dr;
		dr = newDr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__DR, oldDr, newDr);
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
	public void setDr(DecisionsRate newDr) {
		if (newDr != dr) {
			NotificationChain msgs = null;
			if (dr != null)
				msgs = ((InternalEObject)dr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__DR, null, msgs);
			if (newDr != null)
				msgs = ((InternalEObject)newDr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__DR, null, msgs);
			msgs = basicSetDr(newDr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__DR, newDr, newDr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StraightRate getSr() {
		return sr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSr(StraightRate newSr, NotificationChain msgs) {
		StraightRate oldSr = sr;
		sr = newSr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__SR, oldSr, newSr);
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
	public void setSr(StraightRate newSr) {
		if (newSr != sr) {
			NotificationChain msgs = null;
			if (sr != null)
				msgs = ((InternalEObject)sr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__SR, null, msgs);
			if (newSr != null)
				msgs = ((InternalEObject)newSr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__SR, null, msgs);
			msgs = basicSetSr(newSr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__SR, newSr, newSr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TurnRate getTr() {
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTr(TurnRate newTr, NotificationChain msgs) {
		TurnRate oldTr = tr;
		tr = newTr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__TR, oldTr, newTr);
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
	public void setTr(TurnRate newTr) {
		if (newTr != tr) {
			NotificationChain msgs = null;
			if (tr != null)
				msgs = ((InternalEObject)tr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__TR, null, msgs);
			if (newTr != null)
				msgs = ((InternalEObject)newTr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__TR, null, msgs);
			msgs = basicSetTr(newTr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__TR, newTr, newTr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndRate getEr() {
		return er;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEr(EndRate newEr, NotificationChain msgs) {
		EndRate oldEr = er;
		er = newEr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__ER, oldEr, newEr);
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
	public void setEr(EndRate newEr) {
		if (newEr != er) {
			NotificationChain msgs = null;
			if (er != null)
				msgs = ((InternalEObject)er).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__ER, null, msgs);
			if (newEr != null)
				msgs = ((InternalEObject)newEr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.MAZE_BODY_GENERATOR__ER, null, msgs);
			msgs = basicSetEr(newEr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.MAZE_BODY_GENERATOR__ER, newEr, newEr));
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
			case MazePackage.MAZE_BODY_GENERATOR__DR:
				return basicSetDr(null, msgs);
			case MazePackage.MAZE_BODY_GENERATOR__SR:
				return basicSetSr(null, msgs);
			case MazePackage.MAZE_BODY_GENERATOR__TR:
				return basicSetTr(null, msgs);
			case MazePackage.MAZE_BODY_GENERATOR__ER:
				return basicSetEr(null, msgs);
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
			case MazePackage.MAZE_BODY_GENERATOR__DR:
				return getDr();
			case MazePackage.MAZE_BODY_GENERATOR__SR:
				return getSr();
			case MazePackage.MAZE_BODY_GENERATOR__TR:
				return getTr();
			case MazePackage.MAZE_BODY_GENERATOR__ER:
				return getEr();
			case MazePackage.MAZE_BODY_GENERATOR__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MazePackage.MAZE_BODY_GENERATOR__DR:
				setDr((DecisionsRate)newValue);
				return;
			case MazePackage.MAZE_BODY_GENERATOR__SR:
				setSr((StraightRate)newValue);
				return;
			case MazePackage.MAZE_BODY_GENERATOR__TR:
				setTr((TurnRate)newValue);
				return;
			case MazePackage.MAZE_BODY_GENERATOR__ER:
				setEr((EndRate)newValue);
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
			case MazePackage.MAZE_BODY_GENERATOR__DR:
				setDr((DecisionsRate)null);
				return;
			case MazePackage.MAZE_BODY_GENERATOR__SR:
				setSr((StraightRate)null);
				return;
			case MazePackage.MAZE_BODY_GENERATOR__TR:
				setTr((TurnRate)null);
				return;
			case MazePackage.MAZE_BODY_GENERATOR__ER:
				setEr((EndRate)null);
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
			case MazePackage.MAZE_BODY_GENERATOR__DR:
				return dr != null;
			case MazePackage.MAZE_BODY_GENERATOR__SR:
				return sr != null;
			case MazePackage.MAZE_BODY_GENERATOR__TR:
				return tr != null;
			case MazePackage.MAZE_BODY_GENERATOR__ER:
				return er != null;
			case MazePackage.MAZE_BODY_GENERATOR__NAME:
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

} //MazeBodyGeneratorImpl
