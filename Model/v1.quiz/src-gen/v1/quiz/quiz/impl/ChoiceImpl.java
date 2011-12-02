/**
 * <copyright>
 * </copyright>
 *

 */
package v1.quiz.quiz.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import v1.quiz.quiz.Choice;
import v1.quiz.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link v1.quiz.quiz.impl.ChoiceImpl#getText <em>Text</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.ChoiceImpl#getCorrect <em>Correct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChoiceImpl extends MinimalEObjectImpl.Container implements Choice
{
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
   * The default value of the '{@link #getCorrect() <em>Correct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrect()
   * @generated
   * @ordered
   */
  protected static final String CORRECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCorrect() <em>Correct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrect()
   * @generated
   * @ordered
   */
  protected String correct = CORRECT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChoiceImpl()
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
    return QuizPackage.Literals.CHOICE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.CHOICE__TEXT, oldText, text));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCorrect()
  {
    return correct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorrect(String newCorrect)
  {
    String oldCorrect = correct;
    correct = newCorrect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.CHOICE__CORRECT, oldCorrect, correct));
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
      case QuizPackage.CHOICE__TEXT:
        return getText();
      case QuizPackage.CHOICE__CORRECT:
        return getCorrect();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QuizPackage.CHOICE__TEXT:
        setText((String)newValue);
        return;
      case QuizPackage.CHOICE__CORRECT:
        setCorrect((String)newValue);
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
      case QuizPackage.CHOICE__TEXT:
        setText(TEXT_EDEFAULT);
        return;
      case QuizPackage.CHOICE__CORRECT:
        setCorrect(CORRECT_EDEFAULT);
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
      case QuizPackage.CHOICE__TEXT:
        return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
      case QuizPackage.CHOICE__CORRECT:
        return CORRECT_EDEFAULT == null ? correct != null : !CORRECT_EDEFAULT.equals(correct);
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
    result.append(" (text: ");
    result.append(text);
    result.append(", correct: ");
    result.append(correct);
    result.append(')');
    return result.toString();
  }

} //ChoiceImpl
