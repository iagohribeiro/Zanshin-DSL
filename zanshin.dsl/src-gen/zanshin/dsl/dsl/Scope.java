/**
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zanshin.dsl.dsl.Scope#getProject <em>Project</em>}</li>
 *   <li>{@link zanshin.dsl.dsl.Scope#getSimulation <em>Simulation</em>}</li>
 *   <li>{@link zanshin.dsl.dsl.Scope#getName <em>Name</em>}</li>
 *   <li>{@link zanshin.dsl.dsl.Scope#getLength <em>Length</em>}</li>
 *   <li>{@link zanshin.dsl.dsl.Scope#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see zanshin.dsl.dsl.DslPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Project</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Project</em>' containment reference.
   * @see #setProject(Project)
   * @see zanshin.dsl.dsl.DslPackage#getScope_Project()
   * @model containment="true"
   * @generated
   */
  Project getProject();

  /**
   * Sets the value of the '{@link zanshin.dsl.dsl.Scope#getProject <em>Project</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Project</em>' containment reference.
   * @see #getProject()
   * @generated
   */
  void setProject(Project value);

  /**
   * Returns the value of the '<em><b>Simulation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Simulation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simulation</em>' attribute list.
   * @see zanshin.dsl.dsl.DslPackage#getScope_Simulation()
   * @model unique="false"
   * @generated
   */
  EList<String> getSimulation();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see zanshin.dsl.dsl.DslPackage#getScope_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>Length</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Length</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Length</em>' attribute list.
   * @see zanshin.dsl.dsl.DslPackage#getScope_Length()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getLength();

  /**
   * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
   * The list contents are of type {@link zanshin.dsl.dsl.commandBlock}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Commands</em>' containment reference list.
   * @see zanshin.dsl.dsl.DslPackage#getScope_Commands()
   * @model containment="true"
   * @generated
   */
  EList<commandBlock> getCommands();

} // Scope
