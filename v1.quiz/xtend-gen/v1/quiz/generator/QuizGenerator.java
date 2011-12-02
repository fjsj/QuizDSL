package v1.quiz.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import v1.quiz.quiz.Choice;
import v1.quiz.quiz.Quiz;
import v1.quiz.quiz.QuizGame;

@SuppressWarnings("all")
public class QuizGenerator implements IGenerator {
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    StringConcatenation _javaCode = this.toJavaCode(((QuizGame) _head));
    fsa.generateFile("QuizGame.java", _javaCode);
  }
  
  public StringConcatenation toJavaCode(final QuizGame gm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.append("import java.util.ArrayList;");
    _builder.newLine();
    _builder.append("import java.util.Scanner;");
    _builder.newLine();
    _builder.append("import java.util.Collections;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class QuizGame {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String author;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Quiz> quizes;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public QuizGame(String name, String author) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.name = name;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.author = author;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.quizes = new ArrayList<Quiz>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addQuiz(Quiz q) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("quizes.add(q);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getName() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getAuthor() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return author;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Quiz> getQuizes() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return quizes;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getTotalScore() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("int score = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (Quiz q : quizes) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("score += q.getScore();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return score;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    StringConcatenation _generateMain = this.generateMain(gm);
    _builder.append(_generateMain, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    EList<Quiz> _elements = gm.getElements();
    Quiz _get = _elements.get(0);
    StringConcatenation _generateQuizClass = this.generateQuizClass(_get);
    _builder.append(_generateQuizClass, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generateQuizClass(final Quiz q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Quiz { ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private int score;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private List<Choice> choices;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Quiz(String text, int score) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.text = text;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.score = score;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.choices = new ArrayList<Choice>();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void addChoice(Choice c) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("choices.add(c);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getText() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int getScore() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return score;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Choice> getChoices() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return choices;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public List<Integer> getCorrectChoices() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("List<Integer> correctOnes = new ArrayList<Integer>();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("for (int i = 0; i < choices.size(); i++) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (choices.get(i).isCorrect()) {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("correctOnes.add(i);");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return correctOnes;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    EList<Choice> _elements = q.getElements();
    Choice _get = _elements.get(0);
    StringConcatenation _generateChoiceClass = this.generateChoiceClass(_get);
    _builder.append(_generateChoiceClass, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public StringConcatenation generateChoiceClass(final Choice c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("class Choice {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private boolean isCorrect;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Choice(String text, boolean isCorrect) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.text = text;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.isCorrect = isCorrect;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public String getText() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return text;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public boolean isCorrect() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return isCorrect;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateMain(final QuizGame gm) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("QuizGame gm = new QuizGame(\"");
    String _name = gm.getName();
    _builder.append(_name, "	");
    _builder.append("\", \"");
    String _author = gm.getAuthor();
    _builder.append(_author, "	");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Quiz q = null;");
    _builder.newLine();
    {
      EList<Quiz> _elements = gm.getElements();
      for(final Quiz quiz : _elements) {
        _builder.append("\t");
        _builder.append("q = new Quiz(\"");
        String _text = quiz.getText();
        _builder.append(_text, "	");
        _builder.append("\", ");
        int _score = quiz.getScore();
        _builder.append(_score, "	");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        {
          EList<Choice> _elements_1 = quiz.getElements();
          for(final Choice choice : _elements_1) {
            _builder.append("\t");
            _builder.append("q.addChoice(new Choice(\"");
            String _text_1 = choice.getText();
            _builder.append(_text_1, "	");
            _builder.append("\", ");
            String _correct = choice.getCorrect();
            _builder.append(_correct, "	");
            _builder.append("));");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("gm.addQuiz(q);");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    StringConcatenation _generateGameLogic = this.generateGameLogic();
    _builder.append(_generateGameLogic, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public StringConcatenation generateGameLogic() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("System.out.println(String.format(\"Quiz Game %s by %s\",");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("gm.getName(), gm.getAuthor()));");
    _builder.newLine();
    _builder.append("Scanner input = new Scanner(System.in);");
    _builder.newLine();
    _builder.append("int totalScore = gm.getTotalScore();");
    _builder.newLine();
    _builder.append("int userScore = 0;");
    _builder.newLine();
    _builder.append("for (Quiz quiz : gm.getQuizes()) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(quiz.getText());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("List<Choice> choices = quiz.getChoices();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("for (int i = 0; i < choices.size(); i++) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("System.out.println(i + \" \" + choices.get(i).getText());");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("String choosenStr = input.next();");
    _builder.newLine();
    _builder.append("List<Integer> choosen = new ArrayList<Integer>();");
    _builder.newLine();
    _builder.append("for (String s : choosenStr.split(\",\")) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("choosen.add(Integer.parseInt(s));");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("Collections.sort(choosen); //sort to ignore ordering");
    _builder.newLine();
    _builder.append("if (choosen.equals(quiz.getCorrectChoices())) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"Right answer!\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("userScore += quiz.getScore();");
    _builder.newLine();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("System.out.println(\"Wrong answer!\");");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("System.out.println(String.format(\"You got %d%% of the total score.\",");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("(100 * userScore) / totalScore));");
    _builder.newLine();
    return _builder;
  }
}