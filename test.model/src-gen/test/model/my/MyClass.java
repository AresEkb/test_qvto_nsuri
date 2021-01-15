/**
 */
package test.model.my;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.pivot.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link test.model.my.MyClass#getRef1 <em>Ref1</em>}</li>
 * </ul>
 *
 * @see test.model.my.MyPackage#getMyClass()
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
	 * @see test.model.my.MyPackage#getMyClass_Ref1()
	 * @model
	 * @generated
	 */
	State getRef1();

	/**
	 * Sets the value of the '{@link test.model.my.MyClass#getRef1 <em>Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref1</em>' reference.
	 * @see #getRef1()
	 * @generated
	 */
	void setRef1(State value);

} // MyClass
