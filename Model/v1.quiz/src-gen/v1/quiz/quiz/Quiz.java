/**
 * <copyright>
 * </copyright>
 *

 */
package v1.quiz.quiz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link v1.quiz.quiz.Quiz#getType <em>Type</em>}</li>
 *   <li>{@link v1.quiz.quiz.Quiz#getName <em>Name</em>}</li>
 *   <li>{@link v1.quiz.quiz.Quiz#getText <em>Text</em>}</li>
 *   <li>{@link v1.quiz.quiz.Quiz#getScore <em>Score</em>}</li>
 *   <li>{@link v1.quiz.quiz.Quiz#getElements <em>Elements</em>}</li>
 *   <li>{@link v1.quiz.quiz.Quiz#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @see v1.quiz.quiz.QuizPackage#getQuiz()
 * @model
 * @generated
 */
public interface Quiz extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link v1.quiz.quiz.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see v1.quiz.quiz.Type
   * @see #setType(Type)
   * @see v1.quiz.quiz.QuizPackage#getQuiz_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Quiz#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see v1.quiz.quiz.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see v1.quiz.quiz.QuizPackage#getQuiz_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Quiz#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see v1.quiz.quiz.QuizPackage#getQuiz_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Quiz#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

  /**
   * Returns the value of the '<em><b>Score</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Score</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Score</em>' attribute.
   * @see #setScore(int)
   * @see v1.quiz.quiz.QuizPackage#getQuiz_Score()
   * @model
   * @generated
   */
  int getScore();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Quiz#getScore <em>Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Score</em>' attribute.
   * @see #getScore()
   * @generated
   */
  void setScore(int value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link v1.quiz.quiz.Choice}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see v1.quiz.quiz.QuizPackage#getQuiz_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Choice> getElements();

  /**
   * Returns the value of the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hint</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hint</em>' attribute.
   * @see #setHint(String)
   * @see v1.quiz.quiz.QuizPackage#getQuiz_Hint()
   * @model
   * @generated
   */
  String getHint();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.Quiz#getHint <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hint</em>' attribute.
   * @see #getHint()
   * @generated
   */
  void setHint(String value);

} // Quiz
