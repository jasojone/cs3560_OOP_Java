package QuestionAndAnswers;

import java.util.ArrayList;

public class SingleChoice extends Question {

    public SingleChoice(String question, ArrayList<String> potentialAnswers, int[] answers) {
        super(question, potentialAnswers, answers);

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
