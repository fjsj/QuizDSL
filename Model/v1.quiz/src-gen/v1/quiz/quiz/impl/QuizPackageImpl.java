/**
 * <copyright>
 * </copyright>
 *

 */
package v1.quiz.quiz.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import v1.quiz.quiz.Choice;
import v1.quiz.quiz.Quiz;
import v1.quiz.quiz.QuizFactory;
import v1.quiz.quiz.QuizGame;
import v1.quiz.quiz.QuizPackage;
import v1.quiz.quiz.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizPackageImpl extends EPackageImpl implements QuizPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quizGameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quizEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see v1.quiz.quiz.QuizPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private QuizPackageImpl()
  {
    super(eNS_URI, QuizFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link QuizPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static QuizPackage init()
  {
    if (isInited) return (QuizPackage)EPackage.Registry.INSTANCE.getEPackage(QuizPackage.eNS_URI);

    // Obtain or create and register package
    QuizPackageImpl theQuizPackage = (QuizPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuizPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuizPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theQuizPackage.createPackageContents();

    // Initialize created meta-data
    theQuizPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theQuizPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(QuizPackage.eNS_URI, theQuizPackage);
    return theQuizPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuizGame()
  {
    return quizGameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuizGame_Name()
  {
    return (EAttribute)quizGameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuizGame_Author()
  {
    return (EAttribute)quizGameEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuizGame_Elements()
  {
    return (EReference)quizGameEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuiz()
  {
    return quizEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuiz_Type()
  {
    return (EAttribute)quizEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuiz_Name()
  {
    return (EAttribute)quizEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuiz_Text()
  {
    return (EAttribute)quizEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuiz_Score()
  {
    return (EAttribute)quizEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuiz_Elements()
  {
    return (EReference)quizEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuiz_Hint()
  {
    return (EAttribute)quizEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoice()
  {
    return choiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoice_Text()
  {
    return (EAttribute)choiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoice_Correct()
  {
    return (EAttribute)choiceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuizFactory getQuizFactory()
  {
    return (QuizFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    quizGameEClass = createEClass(QUIZ_GAME);
    createEAttribute(quizGameEClass, QUIZ_GAME__NAME);
    createEAttribute(quizGameEClass, QUIZ_GAME__AUTHOR);
    createEReference(quizGameEClass, QUIZ_GAME__ELEMENTS);

    quizEClass = createEClass(QUIZ);
    createEAttribute(quizEClass, QUIZ__TYPE);
    createEAttribute(quizEClass, QUIZ__NAME);
    createEAttribute(quizEClass, QUIZ__TEXT);
    createEAttribute(quizEClass, QUIZ__SCORE);
    createEReference(quizEClass, QUIZ__ELEMENTS);
    createEAttribute(quizEClass, QUIZ__HINT);

    choiceEClass = createEClass(CHOICE);
    createEAttribute(choiceEClass, CHOICE__TEXT);
    createEAttribute(choiceEClass, CHOICE__CORRECT);

    // Create enums
    typeEEnum = createEEnum(TYPE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(quizGameEClass, QuizGame.class, "QuizGame", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuizGame_Name(), ecorePackage.getEString(), "name", null, 0, 1, QuizGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuizGame_Author(), ecorePackage.getEString(), "author", null, 0, 1, QuizGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuizGame_Elements(), this.getQuiz(), null, "elements", null, 0, -1, QuizGame.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quizEClass, Quiz.class, "Quiz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuiz_Type(), this.getType(), "type", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuiz_Name(), ecorePackage.getEString(), "name", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuiz_Text(), ecorePackage.getEString(), "text", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuiz_Score(), ecorePackage.getEInt(), "score", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQuiz_Elements(), this.getChoice(), null, "elements", null, 0, -1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuiz_Hint(), ecorePackage.getEString(), "hint", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(choiceEClass, Choice.class, "Choice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getChoice_Text(), ecorePackage.getEString(), "text", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getChoice_Correct(), ecorePackage.getEString(), "correct", null, 0, 1, Choice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.MULTI_CHOICE);
    addEEnumLiteral(typeEEnum, Type.SINGLE_CHOICE);

    // Create resource
    createResource(eNS_URI);
  }

} //QuizPackageImpl
