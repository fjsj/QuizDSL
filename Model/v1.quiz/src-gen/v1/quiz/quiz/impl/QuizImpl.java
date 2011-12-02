/**
 * <copyright>
 * </copyright>
 *

 */
package v1.quiz.quiz.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import v1.quiz.quiz.Choice;
import v1.quiz.quiz.Quiz;
import v1.quiz.quiz.QuizPackage;
import v1.quiz.quiz.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link v1.quiz.quiz.impl.QuizImpl#getType <em>Type</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizImpl#getName <em>Name</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizImpl#getText <em>Text</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizImpl#getScore <em>Score</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizImpl#getHint <em>Hint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuizImpl extends MinimalEObjectImpl.Container implements Quiz
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final Type TYPE_EDEFAULT = Type.MULTI_CHOICE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected static final String TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getText()
   * @generated
   * @ordered
   */
  protected String text = TEXT_EDEFAULT;

  /**
   * The default value of the '{@link #getScore() <em>Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScore()
   * @generated
   * @ordered
   */
  protected static final int SCORE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getScore() <em>Score</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScore()
   * @generated
   * @ordered
   */
  protected int score = SCORE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Choice> elements;

  /**
   * The default value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected static final String HINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHint() <em>Hint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHint()
   * @generated
   * @ordered
   */
  protected String hint = HINT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuizImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QuizPackage.Literals.QUIZ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    Type oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getText()
  {
    return text;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setText(String newText)
  {
    String oldText = text;
    text = newText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getScore()
  {
    return score;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScore(int newScore)
  {
    int oldScore = score;
    score = newScore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ__SCORE, oldScore, score));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Choice> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Choice>(Choice.class, this, QuizPackage.QUIZ__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHint()
  {
    return hint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHint(String newHint)
  {
    String oldHint = hint;
    hint = newHint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ__HINT, oldHint, hint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QuizPackage.QUIZ__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QuizPackage.QUIZ__TYPE:
        return getType();
      case QuizPackage.QUIZ__NAME:
        return getName();
      case QuizPackage.QUIZ__TEXT:
        return getText();
      case QuizPackage.QUIZ__SCORE:
        return getScore();
      case QuizPackage.QUIZ__ELEMENTS:
        return getElements();
      case QuizPackage.QUIZ__HINT:
        return getHint();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuizPackage.QUIZ__TYPE:
        setType((Type)newValue);
        return;
      case QuizPackage.QUIZ__NAME:
        setName((String)newValue);
        return;
      case QuizPackage.QUIZ__TEXT:
        setText((String)newValue);
        return;
      case QuizPackage.QUIZ__SCORE:
        setScore((Integer)newValue);
        return;
      case QuizPackage.QUIZ__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Choice>)newValue);
        return;
      case QuizPackage.QUIZ__HINT:
        setHint((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QuizPackage.QUIZ__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case QuizPackage.QUIZ__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QuizPackage.QUIZ__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case QuizPackage.QUIZ__SCORE:
        setScore(SCORE_EDEFAULT);
        return;
      case QuizPackage.QUIZ__ELEMENTS:
        getElements().clear();
        return;
      case QuizPackage.QUIZ__HINT:
        setHint(HINT_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QuizPackage.QUIZ__TYPE:
        return type != TYPE_EDEFAULT;
      case QuizPackage.QUIZ__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QuizPackage.QUIZ__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case QuizPackage.QUIZ__SCORE:
        return score != SCORE_EDEFAULT;
      case QuizPackage.QUIZ__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case QuizPackage.QUIZ__HINT:
        return HINT_EDEFAULT == null ? hint != null : !HINT_EDEFAULT.equals(hint);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(", text: ");
    result.append(text);
    result.append(", score: ");
    result.append(score);
    result.append(", hint: ");
    result.append(hint);
    result.append(')');
    return result.toString();
  }

} //QuizImpl
