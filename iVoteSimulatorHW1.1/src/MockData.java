import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import QuestionAndAnswers.MultipleChoice;
import QuestionAndAnswers.Question;
import QuestionAndAnswers.SingleChoice;

public class MockData {

    public MockData() {

    }

    /** 
     * @param typeOfQuestion
     * @return Question[]
     */
    public Question[] getMockData(int typeOfQuestion) {
        if (typeOfQuestion == 0) {
            return getMultipleChoiceMockData();
        } else {
            return getSingleChoiceMockData();
        }
    }

    /** 
     * @return Question[]
     */
    private Question[] getSingleChoiceMockData() {

        return new SingleChoice[] {
                new SingleChoice(
                        "How do you find middle element of a linked list in a single pass?",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Traverse the list until you get to the tail, store each number in an array, use a counter, return the counter/2 ",
                                        "In a while loop set one counter to next and another to next next when you hit a null the first counter will be the middle",
                                        "Print the contents to the screen and count them",
                                        "Correct answers not evident")),
                        new int[] { 1 }),
                new SingleChoice(
                        "How do you find the second lowest number in an integer array? ",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Sort the array and return the last element ",
                                        "Print it out and fin id with your eyes",
                                        "Google the solution and copy paste",
                                        "Correct answers not evident")),
                        new int[] { 0 }),

        };
    }

    /** 
     * @return MultipleChoice[]
     */
    public MultipleChoice[] getMultipleChoiceMockData() {

        return new MultipleChoice[] {
                new MultipleChoice(
                        "In an array - exactly one number is duplicate how do you find it? ",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Use a Set, if the /insert is false you have a collision",
                                        "Sort the array then compare the adjacent values in a for loop",
                                        "Use a nested for loop and compare every index of i to the index of j",
                                        "Correct answers not evident")),
                        new int[] { 0, 1, 2 }),
                new MultipleChoice(
                        "How do you find the depth of a binary tree?",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Recursively do a DFS",
                                        "Recursively do a BFS",
                                        "Traverse the tree in level order traversal starting from root",
                                        "Correct answers not evident")),
                        new int[] { 0, 2 }),

        };
    }

    /** 
     * @param answerCounts
     * @param possibleAnswers
     * @return Integer[]
     */
    public Integer[] getMockMultipleAnswers(int answerCounts, int possibleAnswers){
        Integer[] result = new Integer[answerCounts];
        var rand = new Random();
        var answers = new ArrayList<Integer>();
        for(int i = 0; i < possibleAnswers; i++){
                answers.add(i);
        }

        for(int i = 0; i < answerCounts; i++){
                int randAnswers = rand.nextInt(0, answers.size());
                result[i] = answers.get(randAnswers);
                answers.remove(randAnswers);

        }
        return result;
    }

    /** 
     * @param possibleAnswers
     * @return Integer[]
     */
    public Integer[] getMockSingleAnswer(int possibleAnswers){
        Integer[] result = new Integer[1];
        var rand = new Random();
        result[0] = rand.nextInt(possibleAnswers);
        return result;
    }
    
    /** 
     * @return Student[]
     */
    public Student[] studentGenerator() {
        Student[] s = new Student[20];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
        }
        return s;
    }
}
