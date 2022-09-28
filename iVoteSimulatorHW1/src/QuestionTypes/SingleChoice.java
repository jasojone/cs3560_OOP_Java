package QuestionTypes;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SingleChoice extends Questions{

    
    /** 
     * @param answers
     */
    @Override
    // param all possible answers 
    public void setAnswers(List<String> answers) {
        // seed the random number gen
        Random rand = new Random();
        // set the range
        int randAns = rand.nextInt(answers.size());
        // get the random answer within the range
        String ans = answers.get(randAns);
        // sets the list of the possible answers
        this.answers = Arrays.asList(ans);
    }
}
