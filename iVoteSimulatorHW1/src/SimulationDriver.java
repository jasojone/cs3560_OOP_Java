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
        voteSimLogic(q);
    }
    
    public static void voteSimLogic(Questions q){
        q.setQuestions("What is a book made of");
        q.setChoices(Arrays.asList("Paper", "Metal", "Plastic", "Foam"));
        //List<String> choices = q.getChoices();
        q.setAnswers(Arrays.asList("Paper"));
        //List<String> answer = q.getAnswers();
        // creates an array of size 20 * the size of the student object in the heap
        Student[] s = new Student[20];
        Random rand = new Random();
        //Map<String, String> student_answers = new HashMap<String, String>();
        for (Student student : s) {
            int randChoice = rand.nextInt(q.getChoices().size());
            List<String> choiceUI = Arrays.asList(q.getChoices().get(randChoice));
             student = new Student(); 
             student.setAnswersUI(choiceUI);
             //String studentID = student.getUniqueId().toString();
             //String studentAns = student.getAnswersUI().toString();
             //student_answers.put(student.getUniqueId().toString(),student.getAnswersUI().toString());
             //System.out.println(student_answers.toString());
             //System.out.println("Student ID: " + student.getUniqueId() + " Choice: " + student.getAnswersUI());
        }
        VotingService v = new VotingService(q, s);
        System.out.println("Question: " + q.getQuestions());
        v.checkAnswers(Student[]);
    }
}
