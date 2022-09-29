import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import QuestionAndAnswers.Question;


public class Test {
    private ArrayList<Question> questions = new ArrayList<Question>();


    private Map<String, Integer> results = new HashMap<String,Integer>();

    public Test(){
   //Answers ans1  = new Answers(answers, correct)  A STRUCTURE OF TESTS AND TEST CONTAINS  A STRUCTURE OF ANS AND A STRUCTURE OF QSA LIST OF QS AND AS
    
    }

    public Map<String, Integer> getResults() {
        return results;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void printQuestion(){
        System.out.println(Arrays.toString(questions.toArray()));
    }
    
}