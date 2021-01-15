/**
 */
package test;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.pivot.State;

import org.eclipse.sirius.viewpoint.DModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.MyClass#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link test.MyClass#getRef2 <em>Ref2</em>}</li>
 * </ul>
 *
 * @see test.TestPackage#getMyClass()
 * @model
 * @generated
 */
public interface MyClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref1</em>' reference.
	 * @see #setRef1(State)
	 * @see test.TestPackage#getMyClass_Ref1()
	 * @model
	 * @generated
	 */
	State getRef1();

	/**
	 * Sets the value of the '{@link test.MyClass#getRef1 <em>Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref1</em>' reference.
	 * @see #getRef1()
	 * @generated
	 */
	void setRef1(State value);

	/**
	 * Returns the value of the '<em><b>Ref2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref2</em>' reference.
	 * @see #setRef2(DModel)
	 * @see test.TestPackage#getMyClass_Ref2()
	 * @model
	 * @generated
	 */
	DModel getRef2();

	/**
	 * Sets the value of the '{@link test.MyClass#getRef2 <em>Ref2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref2</em>' reference.
	 * @see #getRef2()
	 * @generated
	 */
	void setRef2(DModel value);

} // MyClass
