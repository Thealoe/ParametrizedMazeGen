/**
 */
package Maze.impl;

import Maze.DecisionsRate;
import Maze.EndPoint;
import Maze.MazeBodyGenerator;
import Maze.MazePackage;
import Maze.SolutionPathGenerator;
import Maze.StartPoint;
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
 * An implementation of the model object '<em><b>Solution Path Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getMbg <em>Mbg</em>}</li>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getSr <em>Sr</em>}</li>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getDr <em>Dr</em>}</li>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getSp <em>Sp</em>}</li>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getEp <em>Ep</em>}</li>
 *   <li>{@link Maze.impl.SolutionPathGeneratorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SolutionPathGeneratorImpl extends EObjectImpl implements SolutionPathGenerator {
	/**
	 * The cached value of the '{@link #getMbg() <em>Mbg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbg()
	 * @generated
	 * @ordered
	 */
	protected MazeBodyGenerator mbg;

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
	 * The cached value of the '{@link #getSr() <em>Sr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSr()
	 * @generated
	 * @ordered
	 */
	protected StraightRate sr;

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
	 * The cached value of the '{@link #getSp() <em>Sp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSp()
	 * @generated
	 * @ordered
	 */
	protected StartPoint sp;

	/**
	 * The cached value of the '{@link #getEp() <em>Ep</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEp()
	 * @generated
	 * @ordered
	 */
	protected EndPoint ep;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SPGen";

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
	protected SolutionPathGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MazePackage.Literals.SOLUTION_PATH_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MazeBodyGenerator getMbg() {
		if (mbg != null && mbg.eIsProxy()) {
			InternalEObject oldMbg = (InternalEObject)mbg;
			mbg = (MazeBodyGenerator)eResolveProxy(oldMbg);
			if (mbg != oldMbg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MazePackage.SOLUTION_PATH_GENERATOR__MBG, oldMbg, mbg));
			}
		}
		return mbg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MazeBodyGenerator basicGetMbg() {
		return mbg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMbg(MazeBodyGenerator newMbg) {
		MazeBodyGenerator oldMbg = mbg;
		mbg = newMbg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__MBG, oldMbg, mbg));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__TR, oldTr, newTr);
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
				msgs = ((InternalEObject)tr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__TR, null, msgs);
			if (newTr != null)
				msgs = ((InternalEObject)newTr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__TR, null, msgs);
			msgs = basicSetTr(newTr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__TR, newTr, newTr));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__SR, oldSr, newSr);
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
				msgs = ((InternalEObject)sr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__SR, null, msgs);
			if (newSr != null)
				msgs = ((InternalEObject)newSr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__SR, null, msgs);
			msgs = basicSetSr(newSr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__SR, newSr, newSr));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__DR, oldDr, newDr);
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
				msgs = ((InternalEObject)dr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__DR, null, msgs);
			if (newDr != null)
				msgs = ((InternalEObject)newDr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__DR, null, msgs);
			msgs = basicSetDr(newDr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__DR, newDr, newDr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StartPoint getSp() {
		return sp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSp(StartPoint newSp, NotificationChain msgs) {
		StartPoint oldSp = sp;
		sp = newSp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__SP, oldSp, newSp);
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
	public void setSp(StartPoint newSp) {
		if (newSp != sp) {
			NotificationChain msgs = null;
			if (sp != null)
				msgs = ((InternalEObject)sp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__SP, null, msgs);
			if (newSp != null)
				msgs = ((InternalEObject)newSp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__SP, null, msgs);
			msgs = basicSetSp(newSp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__SP, newSp, newSp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EndPoint getEp() {
		return ep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEp(EndPoint newEp, NotificationChain msgs) {
		EndPoint oldEp = ep;
		ep = newEp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__EP, oldEp, newEp);
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
	public void setEp(EndPoint newEp) {
		if (newEp != ep) {
			NotificationChain msgs = null;
			if (ep != null)
				msgs = ((InternalEObject)ep).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__EP, null, msgs);
			if (newEp != null)
				msgs = ((InternalEObject)newEp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.SOLUTION_PATH_GENERATOR__EP, null, msgs);
			msgs = basicSetEp(newEp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.SOLUTION_PATH_GENERATOR__EP, newEp, newEp));
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
			case MazePackage.SOLUTION_PATH_GENERATOR__TR:
				return basicSetTr(null, msgs);
			case MazePackage.SOLUTION_PATH_GENERATOR__SR:
				return basicSetSr(null, msgs);
			case MazePackage.SOLUTION_PATH_GENERATOR__DR:
				return basicSetDr(null, msgs);
			case MazePackage.SOLUTION_PATH_GENERATOR__SP:
				return basicSetSp(null, msgs);
			case MazePackage.SOLUTION_PATH_GENERATOR__EP:
				return basicSetEp(null, msgs);
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
			case MazePackage.SOLUTION_PATH_GENERATOR__MBG:
				if (resolve) return getMbg();
				return basicGetMbg();
			case MazePackage.SOLUTION_PATH_GENERATOR__TR:
				return getTr();
			case MazePackage.SOLUTION_PATH_GENERATOR__SR:
				return getSr();
			case MazePackage.SOLUTION_PATH_GENERATOR__DR:
				return getDr();
			case MazePackage.SOLUTION_PATH_GENERATOR__SP:
				return getSp();
			case MazePackage.SOLUTION_PATH_GENERATOR__EP:
				return getEp();
			case MazePackage.SOLUTION_PATH_GENERATOR__NAME:
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
			case MazePackage.SOLUTION_PATH_GENERATOR__MBG:
				setMbg((MazeBodyGenerator)newValue);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__TR:
				setTr((TurnRate)newValue);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__SR:
				setSr((StraightRate)newValue);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__DR:
				setDr((DecisionsRate)newValue);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__SP:
				setSp((StartPoint)newValue);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__EP:
				setEp((EndPoint)newValue);
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
			case MazePackage.SOLUTION_PATH_GENERATOR__MBG:
				setMbg((MazeBodyGenerator)null);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__TR:
				setTr((TurnRate)null);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__SR:
				setSr((StraightRate)null);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__DR:
				setDr((DecisionsRate)null);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__SP:
				setSp((StartPoint)null);
				return;
			case MazePackage.SOLUTION_PATH_GENERATOR__EP:
				setEp((EndPoint)null);
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
			case MazePackage.SOLUTION_PATH_GENERATOR__MBG:
				return mbg != null;
			case MazePackage.SOLUTION_PATH_GENERATOR__TR:
				return tr != null;
			case MazePackage.SOLUTION_PATH_GENERATOR__SR:
				return sr != null;
			case MazePackage.SOLUTION_PATH_GENERATOR__DR:
				return dr != null;
			case MazePackage.SOLUTION_PATH_GENERATOR__SP:
				return sp != null;
			case MazePackage.SOLUTION_PATH_GENERATOR__EP:
				return ep != null;
			case MazePackage.SOLUTION_PATH_GENERATOR__NAME:
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

} //SolutionPathGeneratorImpl
