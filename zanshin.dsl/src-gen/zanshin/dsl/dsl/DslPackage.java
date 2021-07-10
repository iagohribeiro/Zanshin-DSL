/**
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.dsl;

import org.eclipse.emf.ecore.EAttribute;
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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see zanshin.dsl.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.dsl.zanshin/Dsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DslPackage eINSTANCE = zanshin.dsl.dsl.impl.DslPackageImpl.init();

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.ModelImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Dsl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DSL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.ProjectImpl <em>Project</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.ProjectImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getProject()
   * @generated
   */
  int PROJECT = 1;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Project</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.TestTypeImpl <em>Test Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.TestTypeImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getTestType()
   * @generated
   */
  int TEST_TYPE = 2;

  /**
   * The feature id for the '<em><b>Simulation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TYPE__SIMULATION_TYPE = 0;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TYPE__ARRAY = 1;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TYPE__LENGTH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TYPE__NAME = 3;

  /**
   * The number of structural features of the '<em>Test Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.SuccessImpl <em>Success</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.SuccessImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getSuccess()
   * @generated
   */
  int SUCCESS = 3;

  /**
   * The feature id for the '<em><b>Simulation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUCCESS__SIMULATION_TYPE = TEST_TYPE__SIMULATION_TYPE;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUCCESS__ARRAY = TEST_TYPE__ARRAY;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUCCESS__LENGTH = TEST_TYPE__LENGTH;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUCCESS__NAME = TEST_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Success</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUCCESS_FEATURE_COUNT = TEST_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.FailureImpl <em>Failure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.FailureImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getFailure()
   * @generated
   */
  int FAILURE = 4;

  /**
   * The feature id for the '<em><b>Simulation Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAILURE__SIMULATION_TYPE = TEST_TYPE__SIMULATION_TYPE;

  /**
   * The feature id for the '<em><b>Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAILURE__ARRAY = TEST_TYPE__ARRAY;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAILURE__LENGTH = TEST_TYPE__LENGTH;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAILURE__NAME = TEST_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Failure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAILURE_FEATURE_COUNT = TEST_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.TestQuantityImpl <em>Test Quantity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.TestQuantityImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getTestQuantity()
   * @generated
   */
  int TEST_QUANTITY = 5;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_QUANTITY__NUMBER = 0;

  /**
   * The number of structural features of the '<em>Test Quantity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_QUANTITY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.LogImpl <em>Log</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.LogImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getLog()
   * @generated
   */
  int LOG = 6;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG__MESSAGE = 0;

  /**
   * The number of structural features of the '<em>Log</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.ScopeImpl <em>Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.ScopeImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getScope()
   * @generated
   */
  int SCOPE = 7;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__PROJECT = 0;

  /**
   * The feature id for the '<em><b>Simulation</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__SIMULATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__NAME = 2;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__LENGTH = 3;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE__COMMANDS = 4;

  /**
   * The number of structural features of the '<em>Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPE_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link zanshin.dsl.dsl.impl.CommandsImpl <em>Commands</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see zanshin.dsl.dsl.impl.CommandsImpl
   * @see zanshin.dsl.dsl.impl.DslPackageImpl#getCommands()
   * @generated
   */
  int COMMANDS = 8;

  /**
   * The feature id for the '<em><b>Testquantity</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__TESTQUANTITY = 0;

  /**
   * The feature id for the '<em><b>Testtype</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__TESTTYPE = 1;

  /**
   * The feature id for the '<em><b>Message</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS__MESSAGE = 2;

  /**
   * The number of structural features of the '<em>Commands</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMANDS_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see zanshin.dsl.dsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link zanshin.dsl.dsl.Model#getDsl <em>Dsl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dsl</em>'.
   * @see zanshin.dsl.dsl.Model#getDsl()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Dsl();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Project <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Project</em>'.
   * @see zanshin.dsl.dsl.Project
   * @generated
   */
  EClass getProject();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.Project#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see zanshin.dsl.dsl.Project#getImportedNamespace()
   * @see #getProject()
   * @generated
   */
  EAttribute getProject_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.TestType <em>Test Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Type</em>'.
   * @see zanshin.dsl.dsl.TestType
   * @generated
   */
  EClass getTestType();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.TestType#getSimulationType <em>Simulation Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simulation Type</em>'.
   * @see zanshin.dsl.dsl.TestType#getSimulationType()
   * @see #getTestType()
   * @generated
   */
  EAttribute getTestType_SimulationType();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.TestType#isArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Array</em>'.
   * @see zanshin.dsl.dsl.TestType#isArray()
   * @see #getTestType()
   * @generated
   */
  EAttribute getTestType_Array();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.TestType#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see zanshin.dsl.dsl.TestType#getLength()
   * @see #getTestType()
   * @generated
   */
  EAttribute getTestType_Length();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.TestType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see zanshin.dsl.dsl.TestType#getName()
   * @see #getTestType()
   * @generated
   */
  EAttribute getTestType_Name();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Success <em>Success</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Success</em>'.
   * @see zanshin.dsl.dsl.Success
   * @generated
   */
  EClass getSuccess();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Failure <em>Failure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Failure</em>'.
   * @see zanshin.dsl.dsl.Failure
   * @generated
   */
  EClass getFailure();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.TestQuantity <em>Test Quantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Quantity</em>'.
   * @see zanshin.dsl.dsl.TestQuantity
   * @generated
   */
  EClass getTestQuantity();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.TestQuantity#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see zanshin.dsl.dsl.TestQuantity#getNumber()
   * @see #getTestQuantity()
   * @generated
   */
  EAttribute getTestQuantity_Number();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Log <em>Log</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Log</em>'.
   * @see zanshin.dsl.dsl.Log
   * @generated
   */
  EClass getLog();

  /**
   * Returns the meta object for the attribute '{@link zanshin.dsl.dsl.Log#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see zanshin.dsl.dsl.Log#getMessage()
   * @see #getLog()
   * @generated
   */
  EAttribute getLog_Message();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Scope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scope</em>'.
   * @see zanshin.dsl.dsl.Scope
   * @generated
   */
  EClass getScope();

  /**
   * Returns the meta object for the containment reference '{@link zanshin.dsl.dsl.Scope#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see zanshin.dsl.dsl.Scope#getProject()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Project();

  /**
   * Returns the meta object for the attribute list '{@link zanshin.dsl.dsl.Scope#getSimulation <em>Simulation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Simulation</em>'.
   * @see zanshin.dsl.dsl.Scope#getSimulation()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Simulation();

  /**
   * Returns the meta object for the attribute list '{@link zanshin.dsl.dsl.Scope#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see zanshin.dsl.dsl.Scope#getName()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Name();

  /**
   * Returns the meta object for the attribute list '{@link zanshin.dsl.dsl.Scope#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Length</em>'.
   * @see zanshin.dsl.dsl.Scope#getLength()
   * @see #getScope()
   * @generated
   */
  EAttribute getScope_Length();

  /**
   * Returns the meta object for the containment reference list '{@link zanshin.dsl.dsl.Scope#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see zanshin.dsl.dsl.Scope#getCommands()
   * @see #getScope()
   * @generated
   */
  EReference getScope_Commands();

  /**
   * Returns the meta object for class '{@link zanshin.dsl.dsl.Commands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Commands</em>'.
   * @see zanshin.dsl.dsl.Commands
   * @generated
   */
  EClass getCommands();

  /**
   * Returns the meta object for the containment reference list '{@link zanshin.dsl.dsl.Commands#getTestquantity <em>Testquantity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Testquantity</em>'.
   * @see zanshin.dsl.dsl.Commands#getTestquantity()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_Testquantity();

  /**
   * Returns the meta object for the containment reference list '{@link zanshin.dsl.dsl.Commands#getTesttype <em>Testtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Testtype</em>'.
   * @see zanshin.dsl.dsl.Commands#getTesttype()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_Testtype();

  /**
   * Returns the meta object for the containment reference list '{@link zanshin.dsl.dsl.Commands#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Message</em>'.
   * @see zanshin.dsl.dsl.Commands#getMessage()
   * @see #getCommands()
   * @generated
   */
  EReference getCommands_Message();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DslFactory getDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.ModelImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Dsl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DSL = eINSTANCE.getModel_Dsl();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.ProjectImpl <em>Project</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.ProjectImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getProject()
     * @generated
     */
    EClass PROJECT = eINSTANCE.getProject();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECT__IMPORTED_NAMESPACE = eINSTANCE.getProject_ImportedNamespace();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.TestTypeImpl <em>Test Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.TestTypeImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getTestType()
     * @generated
     */
    EClass TEST_TYPE = eINSTANCE.getTestType();

    /**
     * The meta object literal for the '<em><b>Simulation Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_TYPE__SIMULATION_TYPE = eINSTANCE.getTestType_SimulationType();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_TYPE__ARRAY = eINSTANCE.getTestType_Array();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_TYPE__LENGTH = eINSTANCE.getTestType_Length();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_TYPE__NAME = eINSTANCE.getTestType_Name();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.SuccessImpl <em>Success</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.SuccessImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getSuccess()
     * @generated
     */
    EClass SUCCESS = eINSTANCE.getSuccess();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.FailureImpl <em>Failure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.FailureImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getFailure()
     * @generated
     */
    EClass FAILURE = eINSTANCE.getFailure();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.TestQuantityImpl <em>Test Quantity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.TestQuantityImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getTestQuantity()
     * @generated
     */
    EClass TEST_QUANTITY = eINSTANCE.getTestQuantity();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_QUANTITY__NUMBER = eINSTANCE.getTestQuantity_Number();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.LogImpl <em>Log</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.LogImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getLog()
     * @generated
     */
    EClass LOG = eINSTANCE.getLog();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOG__MESSAGE = eINSTANCE.getLog_Message();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.ScopeImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getScope()
     * @generated
     */
    EClass SCOPE = eINSTANCE.getScope();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__PROJECT = eINSTANCE.getScope_Project();

    /**
     * The meta object literal for the '<em><b>Simulation</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__SIMULATION = eINSTANCE.getScope_Simulation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__NAME = eINSTANCE.getScope_Name();

    /**
     * The meta object literal for the '<em><b>Length</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPE__LENGTH = eINSTANCE.getScope_Length();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPE__COMMANDS = eINSTANCE.getScope_Commands();

    /**
     * The meta object literal for the '{@link zanshin.dsl.dsl.impl.CommandsImpl <em>Commands</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see zanshin.dsl.dsl.impl.CommandsImpl
     * @see zanshin.dsl.dsl.impl.DslPackageImpl#getCommands()
     * @generated
     */
    EClass COMMANDS = eINSTANCE.getCommands();

    /**
     * The meta object literal for the '<em><b>Testquantity</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__TESTQUANTITY = eINSTANCE.getCommands_Testquantity();

    /**
     * The meta object literal for the '<em><b>Testtype</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__TESTTYPE = eINSTANCE.getCommands_Testtype();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMANDS__MESSAGE = eINSTANCE.getCommands_Message();

  }

} //DslPackage
