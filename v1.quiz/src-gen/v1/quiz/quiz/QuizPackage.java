/**
 * <copyright>
 * </copyright>
 *

 */
package v1.quiz.quiz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see v1.quiz.quiz.QuizFactory
 * @model kind="package"
 * @generated
 */
public interface QuizPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "quiz";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.quiz.v1/Quiz";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "quiz";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  QuizPackage eINSTANCE = v1.quiz.quiz.impl.QuizPackageImpl.init();

  /**
   * The meta object id for the '{@link v1.quiz.quiz.impl.QuizGameImpl <em>Game</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see v1.quiz.quiz.impl.QuizGameImpl
   * @see v1.quiz.quiz.impl.QuizPackageImpl#getQuizGame()
   * @generated
   */
  int QUIZ_GAME = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ_GAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Author</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ_GAME__AUTHOR = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ_GAME__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Game</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ_GAME_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link v1.quiz.quiz.impl.QuizImpl <em>Quiz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see v1.quiz.quiz.impl.QuizImpl
   * @see v1.quiz.quiz.impl.QuizPackageImpl#getQuiz()
   * @generated
   */
  int QUIZ = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ__NAME = 1;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ__TEXT = 2;

  /**
   * The feature id for the '<em><b>Score</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ__SCORE = 3;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ__ELEMENTS = 4;

  /**
   * The feature id for the '<em><b>Hint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ__HINT = 5;

  /**
   * The number of structural features of the '<em>Quiz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUIZ_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link v1.quiz.quiz.impl.ChoiceImpl <em>Choice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see v1.quiz.quiz.impl.ChoiceImpl
   * @see v1.quiz.quiz.impl.QuizPackageImpl#getChoice()
   * @generated
   */
  int CHOICE = 2;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__TEXT = 0;

  /**
   * The feature id for the '<em><b>Correct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE__CORRECT = 1;

  /**
   * The number of structural features of the '<em>Choice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link v1.quiz.quiz.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see v1.quiz.quiz.Type
   * @see v1.quiz.quiz.impl.QuizPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;


  /**
   * Returns the meta object for class '{@link v1.quiz.quiz.QuizGame <em>Game</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Game</em>'.
   * @see v1.quiz.quiz.QuizGame
   * @generated
   */
  EClass getQuizGame();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.QuizGame#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see v1.quiz.quiz.QuizGame#getName()
   * @see #getQuizGame()
   * @generated
   */
  EAttribute getQuizGame_Name();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.QuizGame#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Author</em>'.
   * @see v1.quiz.quiz.QuizGame#getAuthor()
   * @see #getQuizGame()
   * @generated
   */
  EAttribute getQuizGame_Author();

  /**
   * Returns the meta object for the containment reference list '{@link v1.quiz.quiz.QuizGame#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see v1.quiz.quiz.QuizGame#getElements()
   * @see #getQuizGame()
   * @generated
   */
  EReference getQuizGame_Elements();

  /**
   * Returns the meta object for class '{@link v1.quiz.quiz.Quiz <em>Quiz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Quiz</em>'.
   * @see v1.quiz.quiz.Quiz
   * @generated
   */
  EClass getQuiz();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Quiz#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see v1.quiz.quiz.Quiz#getType()
   * @see #getQuiz()
   * @generated
   */
  EAttribute getQuiz_Type();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Quiz#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see v1.quiz.quiz.Quiz#getName()
   * @see #getQuiz()
   * @generated
   */
  EAttribute getQuiz_Name();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Quiz#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see v1.quiz.quiz.Quiz#getText()
   * @see #getQuiz()
   * @generated
   */
  EAttribute getQuiz_Text();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Quiz#getScore <em>Score</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Score</em>'.
   * @see v1.quiz.quiz.Quiz#getScore()
   * @see #getQuiz()
   * @generated
   */
  EAttribute getQuiz_Score();

  /**
   * Returns the meta object for the containment reference list '{@link v1.quiz.quiz.Quiz#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see v1.quiz.quiz.Quiz#getElements()
   * @see #getQuiz()
   * @generated
   */
  EReference getQuiz_Elements();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Quiz#getHint <em>Hint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hint</em>'.
   * @see v1.quiz.quiz.Quiz#getHint()
   * @see #getQuiz()
   * @generated
   */
  EAttribute getQuiz_Hint();

  /**
   * Returns the meta object for class '{@link v1.quiz.quiz.Choice <em>Choice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice</em>'.
   * @see v1.quiz.quiz.Choice
   * @generated
   */
  EClass getChoice();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Choice#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see v1.quiz.quiz.Choice#getText()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Text();

  /**
   * Returns the meta object for the attribute '{@link v1.quiz.quiz.Choice#getCorrect <em>Correct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Correct</em>'.
   * @see v1.quiz.quiz.Choice#getCorrect()
   * @see #getChoice()
   * @generated
   */
  EAttribute getChoice_Correct();

  /**
   * Returns the meta object for enum '{@link v1.quiz.quiz.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see v1.quiz.quiz.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  QuizFactory getQuizFactory();

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
     * The meta object literal for the '{@link v1.quiz.quiz.impl.QuizGameImpl <em>Game</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see v1.quiz.quiz.impl.QuizGameImpl
     * @see v1.quiz.quiz.impl.QuizPackageImpl#getQuizGame()
     * @generated
     */
    EClass QUIZ_GAME = eINSTANCE.getQuizGame();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ_GAME__NAME = eINSTANCE.getQuizGame_Name();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ_GAME__AUTHOR = eINSTANCE.getQuizGame_Author();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUIZ_GAME__ELEMENTS = eINSTANCE.getQuizGame_Elements();

    /**
     * The meta object literal for the '{@link v1.quiz.quiz.impl.QuizImpl <em>Quiz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see v1.quiz.quiz.impl.QuizImpl
     * @see v1.quiz.quiz.impl.QuizPackageImpl#getQuiz()
     * @generated
     */
    EClass QUIZ = eINSTANCE.getQuiz();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ__TYPE = eINSTANCE.getQuiz_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ__NAME = eINSTANCE.getQuiz_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ__TEXT = eINSTANCE.getQuiz_Text();

    /**
     * The meta object literal for the '<em><b>Score</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ__SCORE = eINSTANCE.getQuiz_Score();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference QUIZ__ELEMENTS = eINSTANCE.getQuiz_Elements();

    /**
     * The meta object literal for the '<em><b>Hint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUIZ__HINT = eINSTANCE.getQuiz_Hint();

    /**
     * The meta object literal for the '{@link v1.quiz.quiz.impl.ChoiceImpl <em>Choice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see v1.quiz.quiz.impl.ChoiceImpl
     * @see v1.quiz.quiz.impl.QuizPackageImpl#getChoice()
     * @generated
     */
    EClass CHOICE = eINSTANCE.getChoice();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__TEXT = eINSTANCE.getChoice_Text();

    /**
     * The meta object literal for the '<em><b>Correct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHOICE__CORRECT = eINSTANCE.getChoice_Correct();

    /**
     * The meta object literal for the '{@link v1.quiz.quiz.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see v1.quiz.quiz.Type
     * @see v1.quiz.quiz.impl.QuizPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

  }

} //QuizPackage
