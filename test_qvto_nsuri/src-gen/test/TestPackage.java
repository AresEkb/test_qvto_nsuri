/**
 */
package test;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.com";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link test.impl.MyClassImpl <em>My Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see test.impl.MyClassImpl
	 * @see test.impl.TestPackageImpl#getMyClass()
	 * @generated
	 */
	int MY_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Ref1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CLASS__REF1 = 0;

	/**
	 * The feature id for the '<em><b>Ref2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CLASS__REF2 = 1;

	/**
	 * The number of structural features of the '<em>My Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>My Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MY_CLASS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link test.MyClass <em>My Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>My Class</em>'.
	 * @see test.MyClass
	 * @generated
	 */
	EClass getMyClass();

	/**
	 * Returns the meta object for the reference '{@link test.MyClass#getRef1 <em>Ref1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref1</em>'.
	 * @see test.MyClass#getRef1()
	 * @see #getMyClass()
	 * @generated
	 */
	EReference getMyClass_Ref1();

	/**
	 * Returns the meta object for the reference '{@link test.MyClass#getRef2 <em>Ref2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ref2</em>'.
	 * @see test.MyClass#getRef2()
	 * @see #getMyClass()
	 * @generated
	 */
	EReference getMyClass_Ref2();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link test.impl.MyClassImpl <em>My Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see test.impl.MyClassImpl
		 * @see test.impl.TestPackageImpl#getMyClass()
		 * @generated
		 */
		EClass MY_CLASS = eINSTANCE.getMyClass();

		/**
		 * The meta object literal for the '<em><b>Ref1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_CLASS__REF1 = eINSTANCE.getMyClass_Ref1();

		/**
		 * The meta object literal for the '<em><b>Ref2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MY_CLASS__REF2 = eINSTANCE.getMyClass_Ref2();

	}

} //TestPackage
