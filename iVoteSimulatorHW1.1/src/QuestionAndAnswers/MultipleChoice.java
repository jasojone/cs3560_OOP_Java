package QuestionAndAnswers;

import java.util.ArrayList;
/** 
 * extends from 
 * diff
 * holds the logic for multiple choice question answers
 * 
 */
public class MultipleChoice extends Question {

    public MultipleChoice(String question, ArrayList<String> potentialAnswers, int[] answers) {
        super(question, potentialAnswers, answers);
    }
//todo fix logic and implement correct answers statistics.
    /**
     * @param input
     * @return boolean
     */
    public boolean isCorrect(int[] input) {
        for (int i : input) {
            if (!containsAnswer(i)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param input
     * @return boolean
     */
    private boolean containsAnswer(int input) {
        boolean result = false;
        for (int i : answers) {
            if (input == answers[i]) {
                return true;
            }
        }
        return result;
    }

}
