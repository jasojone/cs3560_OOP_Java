import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.ArrayList;
import QuestionAndAnswers.*;


public class SimulationDriver {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // Question singleChoice = new SingleChoice(question, potentialAnswers, answers);
        ArrayList<String> answers = new ArrayList<String>();
        Collections.addAll(answers,
            "Use a Set, if the /insert is false you have a collision",
            "Sort the array then compare the adjacent values in a for loop", 
            "Use a nested for loop and compare every index of i to the index of j", 
            "Correct answers not evident");
    
        MultipleChoice mChoice = new MultipleChoice(
            "In an array - exactly one number is duplicate how do you find it? ", 
            answers,
            new int[]{0,1,2});

        ArrayList<String> answers2 = new ArrayList<String>();
        Collections.addAll(answers2,
            "Use a Set, if the /insert is false you have a collision",
            "Sort the array then compare the adjacent values in a for loop", 
            "Use a nested for loop and compare every index of i to the index of j", 
            "Correct answers not evident");
    
        MultipleChoice mChoice2 = new MultipleChoice(
            "In an array - exactly one number is duplicate how do you find it? ", 
            answers,
            new int[]{0,1,2});

        Test t1 = new Test();
        t1.getQuestions().add(mChoice);
        t1.getQuestions().add(mChoice2);
        Student[] students = studentGenerator();
        Random rand = new Random();
        String answer;
        // todo get the print statements to properly print, add to class?
        // or change the loop structure to have the question in the outer loop and the students 
        // simulation in the inner loop.
        // for (Student student : students) {
        //     //for (Question q : t1.getQuestions()) 
        //     for (int j = 0; j > t1.getQuestions().size(); j++){
        //         //todo bool method with verbose mode
        //         answer = String.valueOf(rand.nextInt(4));
        //         //System.out.println("Question: \n" + q.getQuestion());
        //         //System.out.println("Answers: " + answer);
        //         //student.getAnswers().add(answer);
        //         t1.getResults().merge(answer, 1, Integer::sum);
        //     }
        //     //System.out.println("Question: \n" + mChoice);
        // }
        // System.out.println(t1.getResults().toString()); 
        // System.out.println(mChoice);

        for (int j = 0; j < t1.getQuestions().size(); j++) {
            System.out.println();
            for (Student student : students) {
                answer = String.valueOf(rand.nextInt(4));
                t1.getResults().merge(answer, 1, Integer::sum);
            }
            t1.printQuestion();
            //mChoice.printQuestion();
            System.out.println(t1.getResults().toString()); 
            
            
        }

    }

    public static Student[] studentGenerator(){
        Student[] s = new Student[20];
        for (int i = 0; i > s.length; i++) {
            s[i] = new Student(); 
        }
        return s;
    }

}