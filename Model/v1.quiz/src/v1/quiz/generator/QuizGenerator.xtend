package v1.quiz.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import v1.quiz.quiz.QuizGame
import v1.quiz.quiz.Quiz
import v1.quiz.quiz.Choice

class QuizGenerator implements IGenerator {
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		fsa.generateFile(
			"QuizGame.java",
			toJavaCode(resource.contents.head as QuizGame)
		)
	}
		
	def toJavaCode(QuizGame gm) '''
	import java.util.List;
	import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.Collections;

	public class QuizGame {
		private String name;
		private String author;
		private List<Quiz> quizes;
		
		public QuizGame(String name, String author) {
			this.name = name;
			this.author = author;
			this.quizes = new ArrayList<Quiz>();
		}
		
		public void addQuiz(Quiz q) {
			quizes.add(q);
		}
		
		public String getName() {
			return name;
		}
		
		public String getAuthor() {
			return author;
		}

		public List<Quiz> getQuizes() {
			return quizes;
		}	
		
		public int getTotalScore() {
			int score = 0;
			for (Quiz q : quizes) {
				score += q.getScore();
			}
			return score;
		}
		
		«gm.generateMain»
	}
	
	«gm.elements.get(0).generateQuizClass»
	'''
	
	def generateQuizClass(Quiz q) '''
	class Quiz { 
		private String text;
		private int score;
		private List<Choice> choices;
		
		public Quiz(String text, int score) {
			this.text = text;
			this.score = score;
			this.choices = new ArrayList<Choice>();
		} 
		
		public void addChoice(Choice c) {
			choices.add(c);
		}
		
		public String getText() {
			return text;
		}
		
		public int getScore() {
			return score;
		} 
		
		public List<Choice> getChoices() {
			return choices;
		}
		
		public List<Integer> getCorrectChoices() {
			List<Integer> correctOnes = new ArrayList<Integer>();
			for (int i = 0; i < choices.size(); i++) {
				if (choices.get(i).isCorrect()) {
					correctOnes.add(i);
				}
			}
			return correctOnes;
		}
	}
	
	«q.elements.get(0).generateChoiceClass»
	'''
	
	def generateChoiceClass(Choice c) '''
	class Choice {
		private String text;
		private boolean isCorrect;
		
		public Choice(String text, boolean isCorrect) {
			this.text = text;
			this.isCorrect = isCorrect;
		}
		
		public String getText() {
			return text;
		} 
		
		public boolean isCorrect() {
			return isCorrect;
		}
	}
	'''
	
	def generateMain(QuizGame gm) '''
		public static void main(String[] args) {
			QuizGame gm = new QuizGame("«gm.name»", "«gm.author»");
			Quiz q = null;
			«FOR quiz : gm.elements»
				q = new Quiz("«quiz.text»", «quiz.score»);
				«FOR choice : quiz.elements»
					q.addChoice(new Choice("«choice.text»", «choice.correct»));
				«ENDFOR»
				gm.addQuiz(q);
			«ENDFOR»
			«generateGameLogic»
		}
	'''
	
	def generateGameLogic() '''
		System.out.println(String.format("Quiz Game %s by %s",
				gm.getName(), gm.getAuthor()));
		Scanner input = new Scanner(System.in);
		int totalScore = gm.getTotalScore();
		int userScore = 0;
		for (Quiz quiz : gm.getQuizes()) {
			System.out.println(quiz.getText());
			List<Choice> choices = quiz.getChoices();
			for (int i = 0; i < choices.size(); i++) {
				System.out.println(i + " " + choices.get(i).getText());
			}

		String choosenStr = input.next();
		List<Integer> choosen = new ArrayList<Integer>();
		for (String s : choosenStr.split(",")) {
			choosen.add(Integer.parseInt(s));
		}
		Collections.sort(choosen); //sort to ignore ordering
		if (choosen.equals(quiz.getCorrectChoices())) {
			System.out.println("Right answer!");
			userScore += quiz.getScore();
		} else {
			System.out.println("Wrong answer!");
		}

		}
		System.out.println(String.format("You got %d%% of the total score.",
				(100 * userScore) / totalScore));
	'''
}
