package QuestionAndAnswers;
import java.util.List;
import java.util.ArrayList;

public class Answers {

    public List<String> potentialAnswers = new ArrayList<String>();

    int[] correctAnswer = {-1,-1,-1,-1};

    public Answers(List<String> answers, int[] correct){
        this.potentialAnswers = answers;
        this.correctAnswer  = correct;
    }
        
}