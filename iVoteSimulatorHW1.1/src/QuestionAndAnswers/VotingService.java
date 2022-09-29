package QuestionAndAnswers;
import java.util.List;
import java.util.Map;



public class VotingService {
    // member variable of questions
    Question vQuestions;

    public VotingService(Question q) {
        this.vQuestions = q;
        
    }

 /**
  * 
  * @param student_answers
  * @param choices
  * @param answer
  */
    public void checkAnswers(Map<String, String> student_answers, List<String> choices, List<String> answer){
    // compare the correct answer to the answer given by each student
    int right = 0;
    int wrong = 0;
    for (Map.Entry<String, String> entry : student_answers.entrySet()){
        // System.out.println("Answers: " + entry.getValue().toString());
        // System.out.println("Answer: " + answer.toString());
        // System.out.println("\n");
        if (entry.getValue().toString().equals(answer.toString())){
            right++;
        }
        // else if(entry.getValue().toString.equals()){

        // }
        else
        wrong++;
    }
        System.out.println("correct answers: " + right);
        System.out.println("wrong answers: " + wrong);
    }

    public void checkMultiAnswers(Map<String, String> student_answers, List<String> choices, List<String> answer){
        // compare the correct answer to the answer given by each student
        int right = 0;
        int wrong = 0;
        for (Map.Entry<String, String> entry : student_answers.entrySet()){
            // System.out.println("Answers: " + entry.getValue().toString());
            // System.out.println("Answer: " + answer.toString());
            // System.out.println("\n");
            if (entry.getValue().toString().equals(answer.toString())){
                right++;
            }
            else
            wrong++;
        }
            System.out.println("correct answers: " + right);
            System.out.println("wrong answers: " + wrong);
        }

}
