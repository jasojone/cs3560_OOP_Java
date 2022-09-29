package QuestionAndAnswers;
import java.util.List;
import java.util.ArrayList;

public abstract class Question {
    // members
    protected String question;
    protected List<String> potentialAnswers = new ArrayList<String>();
    protected int[] answers;

    public Question(String question, List<String> potentialAnswers, int[] answers){
        this.question = question;
        this.potentialAnswers = potentialAnswers;
        this.answers = answers;
    }
    /**
     * @return String
     */
    // access method
    public String getQuestion() {
        return question;
    }
    /**
     * @param questions
     */
    public void setQuestion(String question) {
        this.question = question;
    }
       /**
     * @param questions
     */
    public void printQuestion(String question) {
        System.out.println(question);
    }

    public abstract boolean isCorrect(int[] input);
}
