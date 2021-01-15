/**
 */
package test.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.ocl.pivot.State;

import org.eclipse.sirius.viewpoint.DModel;

import test.MyClass;
import test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link test.impl.MyClassImpl#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link test.impl.MyClassImpl#getRef2 <em>Ref2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MyClassImpl extends MinimalEObjectImpl.Container implements MyClass {
	/**
	 * The cached value of the '{@link #getRef1() <em>Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef1()
	 * @generated
	 * @ordered
	 */
	protected State ref1;

	/**
	 * The cached value of the '{@link #getRef2() <em>Ref2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef2()
	 * @generated
	 * @ordered
	 */
	protected DModel ref2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MyClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.MY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State getRef1() {
		if (ref1 != null && ref1.eIsProxy()) {
			InternalEObject oldRef1 = (InternalEObject)ref1;
			ref1 = (State)eResolveProxy(oldRef1);
			if (ref1 != oldRef1) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.MY_CLASS__REF1, oldRef1, ref1));
			}
		}
		return ref1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetRef1() {
		return ref1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef1(State newRef1) {
		State oldRef1 = ref1;
		ref1 = newRef1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MY_CLASS__REF1, oldRef1, ref1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DModel getRef2() {
		if (ref2 != null && ref2.eIsProxy()) {
			InternalEObject oldRef2 = (InternalEObject)ref2;
			ref2 = (DModel)eResolveProxy(oldRef2);
			if (ref2 != oldRef2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestPackage.MY_CLASS__REF2, oldRef2, ref2));
			}
		}
		return ref2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DModel basicGetRef2() {
		return ref2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef2(DModel newRef2) {
		DModel oldRef2 = ref2;
		ref2 = newRef2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestPackage.MY_CLASS__REF2, oldRef2, ref2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.MY_CLASS__REF1:
				if (resolve) return getRef1();
				return basicGetRef1();
			case TestPackage.MY_CLASS__REF2:
				if (resolve) return getRef2();
				return basicGetRef2();
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
			case TestPackage.MY_CLASS__REF1:
				setRef1((State)newValue);
				return;
			case TestPackage.MY_CLASS__REF2:
				setRef2((DModel)newValue);
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
			case TestPackage.MY_CLASS__REF1:
				setRef1((State)null);
				return;
			case TestPackage.MY_CLASS__REF2:
				setRef2((DModel)null);
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
			case TestPackage.MY_CLASS__REF1:
				return ref1 != null;
			case TestPackage.MY_CLASS__REF2:
				return ref2 != null;
		}
		return super.eIsSet(featureID);
	}

} //MyClassImpl
