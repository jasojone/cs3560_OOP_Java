import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import QuestionTypes.MultipleChoice;
import QuestionTypes.Questions;
import QuestionTypes.SingleChoice;

public class SimulationDriver {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Questions q = new SingleChoice();
        Questions mcq = new MultipleChoice();
        
        q.setQuestions("What is a book made of");
        q.setChoices(Arrays.asList("Paper", "Metal", "Plastic", "Foam"));
        List<String> choices = q.getChoices();
        q.setAnswers(Arrays.asList("Paper"));
        List<String> answer = q.getAnswers();
        // creates an array of size 20 * the size of the student object in the heap
        Student[] s = new Student[20];
        Random rand = new Random();
        //for(int i = 0; i < s.length; i++){
        //     s[i];
        // System.out.println("Student ID: " + s[i].getUniqueId() + " Choice: " + s[i].getAnswersUI());
        // }
        Map<String, String> student_answers = new HashMap<String, String>();
        for (Student student : s) {
            int randChoice = rand.nextInt(q.getChoices().size());
            List<String> choiceUI = Arrays.asList(q.getChoices().get(randChoice));
            //System.out.println(choiceUI);
             student = new Student(); 
             student.setAnswersUI(choiceUI);
             String studentID = student.getUniqueId().toString();
             String studentAns = student.getAnswersUI().toString();
             student_answers.put(studentID,studentAns);
             System.out.println(student_answers.toString());
             //System.out.println("Student ID: " + student.getUniqueId() + " Choice: " + student.getAnswersUI());
        }
        VotingService v = new VotingService(q, s);
        v.checkAnswers(student_answers, choices, answer);


    }
}
