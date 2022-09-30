import java.util.ArrayList;
import java.util.Arrays;
import QuestionAndAnswers.MultipleChoice;
import QuestionAndAnswers.Question;
import QuestionAndAnswers.SingleChoice;

public class MockData {

    public MockData() {

    }

    public Question[] getMockData(int typeOfQuestion) {
        if (typeOfQuestion == 0) {
            return getMultipleChoiceMockData();
        } else {
            return getSingleChoiceMockData();
        }
    }

    private Question[] getSingleChoiceMockData() {

        return new SingleChoice[] {
                new SingleChoice(
                        "In an array - exactly one number is duplicate how do you find it? ",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Use a Set, if the /insert is false you have a collision",
                                        "Sort the array then compare the adjacent values in a for loop",
                                        "Use a nested for loop and compare every index of i to the index of j",
                                        "Correct answers not evident")),
                        new int[] { 0 }),
                new SingleChoice(
                        "Hi there ",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Use ",
                                        "Sort ",
                                        "Use ",
                                        "Correct answers not evident")),
                        new int[] { 0 }),

        };
    }

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
                        "Hi there ",
                        new ArrayList<String>(
                                Arrays.asList(
                                        "Use ",
                                        "Sort ",
                                        "Use ",
                                        "Correct answers not evident")),
                        new int[] { 0, 1 }),

        };
    }

}

// ArrayList<String> answers = new ArrayList<String>();
// Collections.addAll(answers,
// "Use a Set, if the /insert is false you have a collision",
// "Sort the array then compare the adjacent values in a for loop",
// "Use a nested for loop and compare every index of i to the index of j",
// "Correct answers not evident");

// MultipleChoice mChoice = new MultipleChoice(
// "In an array - exactly one number is duplicate how do you find it? ",
// answers,
// new int[]{0,1,2});

// ArrayList<String> answers2 = new ArrayList<String>();
// Collections.addAll(answers2,
// "Use a Set, if the /insert is false you have a collision",
// "Sort the array then compare the adjacent values in a for loop",
// "Use a nested for loop and compare every index of i to the index of j",
// "Correct answers not evident");

// MultipleChoice mChoice2 = new MultipleChoice(
// "In an array - exactly one number is duplicate how do you find it? ",
// answers,
// new int[]{0,1,2});

// return new MultipleChoice[]{mChoice, mChoice2};