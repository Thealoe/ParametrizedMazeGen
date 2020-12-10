/**
 */
package Maze.impl;

import Maze.ColumnCount;
import Maze.ForcePatternGenerator;
import Maze.MazePackage;
import Maze.RectangleGenerator;

import Maze.RowCount;
import Maze.SolutionPathGenerator;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangle Generator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Maze.impl.RectangleGeneratorImpl#getFpg <em>Fpg</em>}</li>
 *   <li>{@link Maze.impl.RectangleGeneratorImpl#getRc <em>Rc</em>}</li>
 *   <li>{@link Maze.impl.RectangleGeneratorImpl#getCc <em>Cc</em>}</li>
 *   <li>{@link Maze.impl.RectangleGeneratorImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangleGeneratorImpl extends EObjectImpl implements RectangleGenerator {
	/**
	 * The cached value of the '{@link #getFpg() <em>Fpg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpg()
	 * @generated
	 * @ordered
	 */
	protected ForcePatternGenerator fpg;

	/**
	 * The cached value of the '{@link #getRc() <em>Rc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRc()
	 * @generated
	 * @ordered
	 */
	protected RowCount rc;

	/**
	 * The cached value of the '{@link #getCc() <em>Cc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCc()
	 * @generated
	 * @ordered
	 */
	protected ColumnCount cc;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "RGen";

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
	protected RectangleGeneratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MazePackage.Literals.RECTANGLE_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ForcePatternGenerator getFpg() {
		if (fpg != null && fpg.eIsProxy()) {
			InternalEObject oldFpg = (InternalEObject)fpg;
			fpg = (ForcePatternGenerator)eResolveProxy(oldFpg);
			if (fpg != oldFpg) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MazePackage.RECTANGLE_GENERATOR__FPG, oldFpg, fpg));
			}
		}
		return fpg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForcePatternGenerator basicGetFpg() {
		return fpg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFpg(ForcePatternGenerator newFpg) {
		ForcePatternGenerator oldFpg = fpg;
		fpg = newFpg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.RECTANGLE_GENERATOR__FPG, oldFpg, fpg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RowCount getRc() {
		return rc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRc(RowCount newRc, NotificationChain msgs) {
		RowCount oldRc = rc;
		rc = newRc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.RECTANGLE_GENERATOR__RC, oldRc, newRc);
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
	public void setRc(RowCount newRc) {
		if (newRc != rc) {
			NotificationChain msgs = null;
			if (rc != null)
				msgs = ((InternalEObject)rc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.RECTANGLE_GENERATOR__RC, null, msgs);
			if (newRc != null)
				msgs = ((InternalEObject)newRc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.RECTANGLE_GENERATOR__RC, null, msgs);
			msgs = basicSetRc(newRc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.RECTANGLE_GENERATOR__RC, newRc, newRc));
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
	public ColumnCount getCc() {
		return cc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCc(ColumnCount newCc, NotificationChain msgs) {
		ColumnCount oldCc = cc;
		cc = newCc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MazePackage.RECTANGLE_GENERATOR__CC, oldCc, newCc);
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
	public void setCc(ColumnCount newCc) {
		if (newCc != cc) {
			NotificationChain msgs = null;
			if (cc != null)
				msgs = ((InternalEObject)cc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MazePackage.RECTANGLE_GENERATOR__CC, null, msgs);
			if (newCc != null)
				msgs = ((InternalEObject)newCc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MazePackage.RECTANGLE_GENERATOR__CC, null, msgs);
			msgs = basicSetCc(newCc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MazePackage.RECTANGLE_GENERATOR__CC, newCc, newCc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MazePackage.RECTANGLE_GENERATOR__RC:
				return basicSetRc(null, msgs);
			case MazePackage.RECTANGLE_GENERATOR__CC:
				return basicSetCc(null, msgs);
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
			case MazePackage.RECTANGLE_GENERATOR__FPG:
				if (resolve) return getFpg();
				return basicGetFpg();
			case MazePackage.RECTANGLE_GENERATOR__RC:
				return getRc();
			case MazePackage.RECTANGLE_GENERATOR__CC:
				return getCc();
			case MazePackage.RECTANGLE_GENERATOR__NAME:
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
			case MazePackage.RECTANGLE_GENERATOR__FPG:
				setFpg((ForcePatternGenerator)newValue);
				return;
			case MazePackage.RECTANGLE_GENERATOR__RC:
				setRc((RowCount)newValue);
				return;
			case MazePackage.RECTANGLE_GENERATOR__CC:
				setCc((ColumnCount)newValue);
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
			case MazePackage.RECTANGLE_GENERATOR__FPG:
				setFpg((ForcePatternGenerator)null);
				return;
			case MazePackage.RECTANGLE_GENERATOR__RC:
				setRc((RowCount)null);
				return;
			case MazePackage.RECTANGLE_GENERATOR__CC:
				setCc((ColumnCount)null);
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
			case MazePackage.RECTANGLE_GENERATOR__FPG:
				return fpg != null;
			case MazePackage.RECTANGLE_GENERATOR__RC:
				return rc != null;
			case MazePackage.RECTANGLE_GENERATOR__CC:
				return cc != null;
			case MazePackage.RECTANGLE_GENERATOR__NAME:
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

} //RectangleGeneratorImpl
