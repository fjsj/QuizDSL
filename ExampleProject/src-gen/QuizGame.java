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
	
	public static void main(String[] args) {
		QuizGame gm = new QuizGame("TheBeatlesQuiz", "fjsj_ncs");
		Quiz q = null;
		q = new Quiz("What is the name of the first Beatles album?", 300);
		q.addChoice(new Choice("Let it be", false));
		q.addChoice(new Choice("Please Please Me", true));
		q.addChoice(new Choice("With The Beatles", false));
		gm.addQuiz(q);
		q = new Quiz("Which of these names are of past Beatles members?", 100);
		q.addChoice(new Choice("Stuart Sutcliffe", true));
		q.addChoice(new Choice("Pete Best", true));
		q.addChoice(new Choice("George Harrison", false));
		q.addChoice(new Choice("Brian Epstein", false));
		gm.addQuiz(q);
		q = new Quiz("Who is considered the best Beatles producer?", 100);
		q.addChoice(new Choice("George Martin", true));
		q.addChoice(new Choice("Bert Kaempfert", false));
		q.addChoice(new Choice("Neil Aspinall", false));
		q.addChoice(new Choice("Phil Spector", false));
		gm.addQuiz(q);
		q = new Quiz("Which was the year of the last Beatles live performance?", 100);
		q.addChoice(new Choice("1965", false));
		q.addChoice(new Choice("1966", false));
		q.addChoice(new Choice("1967", false));
		q.addChoice(new Choice("1968", false));
		q.addChoice(new Choice("1969", true));
		gm.addQuiz(q);
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
	}
}

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
