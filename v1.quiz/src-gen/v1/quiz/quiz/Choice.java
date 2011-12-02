/**
 * <copyright>
 * </copyright>
 *

 */
package v1.quiz.quiz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link v1.quiz.quiz.Choice#getText <em>Text</em>}</li>
 *   <li>{@link v1.quiz.quiz.Choice#getCorrect <em>Correct</em>}</li>
 * </ul>
 * </p>
 *
 * @see v1.quiz.quiz.QuizPackage#getChoice()
 * @model
 * @generated
 */
public interface Choice extends EObject
{
  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see v1.quiz.quiz.QuizPackage#getChoice_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Choice#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Correct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Correct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Correct</em>' attribute.
   * @see #setCorrect(String)
   * @see v1.quiz.quiz.QuizPackage#getChoice_Correct()
   * @model
   * @generated
   */
  String getCorrect();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Choice#getCorrect <em>Correct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Correct</em>' attribute.
   * @see #getCorrect()
   * @generated
   */
  void setCorrect(String value);

} // Choice
