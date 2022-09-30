package QuestionAndAnswers;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Question {
    // members
    protected String question;
    protected List<String> potentialAnswers = new ArrayList<String>();
    protected int[] answers;
    private Map<String, Integer> frequency = new HashMap<String, Integer>();
    private int correctCount = 0;

    public Question(String question, List<String> potentialAnswers, int[] answers) {
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
     * @return List<String>
     */
    public List<String> getPotentialAnswers() {
        return potentialAnswers;
    }

    
    /** 
     * @return Map<String, Integer>
     */
    public Map<String, Integer> getFrequency() {
        return frequency;
    }

    
    /** 
     * @return int
     */
    public int getCorrectCount() {
        return correctCount;
    }

    
    /** 
     * @param correctCount
     */
    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    /**
     * @param questions
     */
    public void printQuestion() {
        System.out.println(question);
    }

    public void printPotentialAnswers() {
        for (int i = 0; i < potentialAnswers.size(); i++) {
            System.out.println(i + " " + potentialAnswers.get(i));
        }

    }

    public abstract boolean isCorrect(int[] input);
}
