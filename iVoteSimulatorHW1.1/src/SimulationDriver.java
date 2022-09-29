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

        Test t1 = new Test();
        t1.getQuestions().add(mChoice);
        Student[] students = studentGenerator();
        Random rand = new Random();
        String answer;

        for (Student student : students) {
            for (Question q : t1.getQuestions()) {
                //todo bool method with verbose mode
                answer = String.valueOf(rand.nextInt(4));
                System.out.println("Question: \n" + q.getQuestion());
                System.out.println("Answers: " + answer);
                //student.getAnswers().add(answer);
                t1.getResults().merge(answer, 1, Integer::sum);
                
            }
        }
        System.out.println(t1.getResults().toString()); 
 

        


    }

    public static Student[] studentGenerator(){
        Student[] s = new Student[20];
        for (int i = 0; i > s.length; i++) {
            s[i] = new Student(); 
        }
        return s;
    }


    
}

    // put("In an array - exactly one number is duplicate how do you find it? ", 
    // new Answers(new ArrayList<String>(Arrays.asList(
    //     "Use a Set, if the add/insert is false you have a collision", 
    //     "Sort the array then compare the adjacent values in a for loop", 
    //     "Use a nested for loop and compare every index of i to the index of j", 
    //     "Correct answers not evident")), new int[]{0,1,2}));

        // "In an array - exactly one number is duplicate how do you find it? "
    // put("How do you find the second highest number in an integer array? ", "1");
    // put("How do you find middle element of a linked list in a single pass?", "1");
    // put("How to find all pairs in an array of integers whose sum is equal to the given number? ", "1");
    // put("How do you find the rd element from last in a single pass? ", "1");
    // put("How to remove duplicate elements from the array in Java? ", "1");
    // put("How do you find if there is any loop in a singly linked list? How do you find the start of the loop? ", "1");
    // put("How to find the largest and smallest number in an array? ", "1");
    // put("How do you reverse a singly linked list? ", "1");
    // put("How to find the top two maximum number in an array? ", "1");
    // put("Difference between a linked list and array data structure? ", "1");
    // put("How do you find the depth of a binary tree? ", "1");
    // put("Why String is final in Java? ", "1");
    // put("Print out all leaf node of a binary tree? ", "1");
    // put("How to check if a tree is balanced or not in Java? ", "1");
    // put("How is a binary search tree implemented? ", "1");
    // put("How do you perform pre order traversal in a given binary tree? ", "1");
    // put("How do you sort Java objects using a Comparator? ", "1");
    // put("How do you traverse a given binary tree in pre order without recursion? ", "1");
    // put("How do you print all nodes of a given binary tree using in order traversal without recursion? ", "1");
    // put("How do you implement a post order traversal algorithm? ", "1");
    // put("How do you traverse a binary tree in post order traversal without recursion? ", "1");
    // put("How are all leaves of a binary search tree printed? ", "1");
    // put("How to Split String in Java? ", "1");
    // put("Print all permutation of String both iterative and Recursive way? ", "1");
    // put("How to check if a number is binary? ", "1");
    // put("How to reverse an integer in Java? ", "1");
    // put("How to count a number of set bits in given integer? ", "1");
    // put("How to find the sum of digits of a number using recursion? ", "1");
    // put("Design an algorithm to find the frequency of occurrence of a word in an article? ", "1");
    // put("How to swap two numbers without using temp variable? ", "1");
    // put("How to find the largest of three integers in Java? ", "1");
    // put("How to add two integers without using arithmetic operator? ", "1");
    // put("Why Char array is preferred over String for storing password? ", "1");
    // put("How do you count a number of leaf nodes in a given binary tree? ", "1");
    // put("How do you perform a binary search in a given array? ", "1");
    // put("How to find the first non repeated character of a given String? ", "1");
    // put("How to count the occurrence of a given character in a String? ", "1");
    // put("General Programming Interview Questions", "1");
    // put("How to check if two String are Anagram? ", "1");
    // put("How to convert numeric String to int in Java? ", "1");