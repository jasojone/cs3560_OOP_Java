package QuestionAndAnswers;

import java.util.ArrayList;

public class SingleChoice extends Question {

    public SingleChoice(String question, ArrayList<String> potentialAnswers, int[] answers) {
        super(question, potentialAnswers, answers);
        if (answers.length > 1) {
            throw new IllegalArgumentException("Only accepts one answer...");
        }
    }

    
    /** 
     * @param input
     * @return boolean
     */
    public boolean isCorrect(int[] input) {
        for (int i : answers) {
            if (input[i] == answers[i]) {
                return true;
            }
        }
        return false;
    }

}
