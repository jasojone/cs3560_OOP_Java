package QuestionAndAnswers;

import java.util.ArrayList;

public class MultipleChoice extends Question{

    public MultipleChoice(String question, ArrayList<String> potentialAnswers, int[] answers) {
        super(question, potentialAnswers, answers);
    }

    public boolean isCorrect(int[] input){
        for (int i : input) {
            if(!containsAnswer(i)){
                return false;
            }
        }
        //todo logic to check answers that are passed in are correct does the array of input
        return true;
    }
    //todo createa logic to determine corectness of each student, a score or grade.
    private boolean containsAnswer(int input){
        boolean result = false;
        for (int i : answers) {
            if(input == answers[i]){
                return true;
            }
        }
        return result;
    }
    

}
