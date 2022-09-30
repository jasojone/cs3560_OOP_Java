package QuestionAndAnswers;

import java.util.ArrayList;
/** 
 * extends from 
 * diff
 * holds the logic for single choice question answers
 * 
 */
public class SingleChoice extends Question {

    public SingleChoice(String question, ArrayList<String> potentialAnswers, int[] answers) {
        super(question, potentialAnswers, answers);

    }
//todo finish the correct answer count 
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
