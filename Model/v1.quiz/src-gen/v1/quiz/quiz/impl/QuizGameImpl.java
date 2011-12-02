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

import v1.quiz.quiz.Quiz;
import v1.quiz.quiz.QuizGame;
import v1.quiz.quiz.QuizPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link v1.quiz.quiz.impl.QuizGameImpl#getName <em>Name</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizGameImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link v1.quiz.quiz.impl.QuizGameImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuizGameImpl extends MinimalEObjectImpl.Container implements QuizGame
{
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
   * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected static final String AUTHOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected String author = AUTHOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Quiz> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QuizGameImpl()
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
    return QuizPackage.Literals.QUIZ_GAME;
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
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ_GAME__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(String newAuthor)
  {
    String oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.QUIZ_GAME__AUTHOR, oldAuthor, author));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Quiz> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Quiz>(Quiz.class, this, QuizPackage.QUIZ_GAME__ELEMENTS);
    }
    return elements;
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
      case QuizPackage.QUIZ_GAME__ELEMENTS:
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
      case QuizPackage.QUIZ_GAME__NAME:
        return getName();
      case QuizPackage.QUIZ_GAME__AUTHOR:
        return getAuthor();
      case QuizPackage.QUIZ_GAME__ELEMENTS:
        return getElements();
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
      case QuizPackage.QUIZ_GAME__NAME:
        setName((String)newValue);
        return;
      case QuizPackage.QUIZ_GAME__AUTHOR:
        setAuthor((String)newValue);
        return;
      case QuizPackage.QUIZ_GAME__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Quiz>)newValue);
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
      case QuizPackage.QUIZ_GAME__NAME:
        setName(NAME_EDEFAULT);
        return;
      case QuizPackage.QUIZ_GAME__AUTHOR:
        setAuthor(AUTHOR_EDEFAULT);
        return;
      case QuizPackage.QUIZ_GAME__ELEMENTS:
        getElements().clear();
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
      case QuizPackage.QUIZ_GAME__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case QuizPackage.QUIZ_GAME__AUTHOR:
        return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
      case QuizPackage.QUIZ_GAME__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", author: ");
    result.append(author);
    result.append(')');
    return result.toString();
  }

} //QuizGameImpl
