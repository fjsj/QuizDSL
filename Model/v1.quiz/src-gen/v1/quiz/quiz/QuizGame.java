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
 * A representation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link v1.quiz.quiz.QuizGame#getName <em>Name</em>}</li>
 *   <li>{@link v1.quiz.quiz.QuizGame#getAuthor <em>Author</em>}</li>
 *   <li>{@link v1.quiz.quiz.QuizGame#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see v1.quiz.quiz.QuizPackage#getQuizGame()
 * @model
 * @generated
 */
public interface QuizGame extends EObject
{
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
   * @see v1.quiz.quiz.QuizPackage#getQuizGame_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.QuizGame#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' attribute.
   * @see #setAuthor(String)
   * @see v1.quiz.quiz.QuizPackage#getQuizGame_Author()
   * @model
   * @generated
   */
  String getAuthor();

  /**
   * Sets the value of the '{@link v1.quiz.quiz.QuizGame#getAuthor <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' attribute.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link v1.quiz.quiz.Quiz}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see v1.quiz.quiz.QuizPackage#getQuizGame_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Quiz> getElements();

} // QuizGame
