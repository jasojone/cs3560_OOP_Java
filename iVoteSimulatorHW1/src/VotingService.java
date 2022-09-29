
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import QuestionTypes.Questions;

public class VotingService {
    // member variable of questions
    Questions vQuestions;

    private Map<String, Integer> studentAnsFreq = new HashMap<String, Integer>();

    public VotingService(Questions q, Student[] s) {
        this.vQuestions = q;
    }

    /** 
     * @param student_answers
     * @param choices
     * @param answer
     */
    //public void checkAnswers(Map<String, String> student_answers, List<String> choices, List<String> answer){
    public void checkAnswers(Student[]){
    // compare the correct answer to the answer given by each student
    int right = 0;
    int wrong = 0;

    for (Map.Entry<String, String> string : student_answers.entrySet()) {
        if(studentAnsFreq.containsKey(string)){
            System.out.println("Adding: " + string);
            studentAnsFreq.put(string, studentAnsFreq.get(string)+1);
        }
        else{
            System.out.println("Adding: " + string);
            studentAnsFreq.put(string, 1);
        }
    }
    
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
    System.out.println(studentAnsFreq.toString());
    System.out.println("Correct answer: " + answer.toString() + " Students that answered correctly: " + right);
    System.out.println("wrong answers: " + wrong);
    }

    public void checkMultipleAnswers(Map<String, String> student_answers, List<String> choices, List<String> answer){
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
            // System.out.println("Question: " + );
            // System.out.println("correct answer: " + answer.toString() + "Students that answered correctly: "  right);
            // System.out.println("wrong answers: " + wrong);
        }

}
