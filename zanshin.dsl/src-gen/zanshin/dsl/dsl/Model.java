/**
 * generated by Xtext 2.10.0
 */
package zanshin.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link zanshin.dsl.dsl.Model#getDsl <em>Dsl</em>}</li>
 * </ul>
 *
 * @see zanshin.dsl.dsl.DslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Dsl</b></em>' containment reference list.
   * The list contents are of type {@link zanshin.dsl.dsl.Scope}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dsl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dsl</em>' containment reference list.
   * @see zanshin.dsl.dsl.DslPackage#getModel_Dsl()
   * @model containment="true"
   * @generated
   */
  EList<Scope> getDsl();

} // Model
