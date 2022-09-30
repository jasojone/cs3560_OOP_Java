import java.util.Random;
import QuestionAndAnswers.*;

/**
 * SimulationDriver will run the simulation. In order for the simulation to work 
 * we must first create the mock data, then set the type of question.
 * then the simulation begins by creating a new VotingService object
 * Students are then generated. Question, answers, and correct answers 
 * are gathered from mockData. Then we iterate through the questions and 
 * have each student submit their randomly generated answers. The student UUID and 
 * answers are stored in the student objects. 
 */
public class SimulationDriver {

    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        MockData data = new MockData();
        int typeOfQuestion = 0; // 0 for multi 1 for single
        System.out.println(typeOfQuestion == 1 ? "Single Choice Questions\n" : "Multiple Choice Questions\n");
        VotingService simulation = new VotingService(data.getMockData(typeOfQuestion));
        Student[] students = data.studentGenerator();
        Random rand = new Random();
        Integer[] answer;
        // for each given question type have each student submit their answer/s
        // if we have a single choice return the final answer
        // if we have a multiple choice return a random number of given potential answers
        // count statistics and store student answer data. 
        for (Question q : simulation.getQuestions()) {
            for (Student student : students) {
                if (typeOfQuestion == 0) {
                    int answerCount = rand.nextInt(q.getPotentialAnswers().size());
                    answer = data.getMockMultipleAnswers(answerCount, q.getPotentialAnswers().size());
                    for (Integer ans : answer) {
                        q.getFrequency().merge(ans, 1, Integer::sum);
                        simulation.getResults().merge(ans, 1, Integer::sum);
                    }

                    student.getRecords().add(new QuestionRecord(q, answer));
                } else {
                    answer = data.getMockSingleAnswer(q.getPotentialAnswers().size());
                    for (Integer ans : answer) {
                        q.getFrequency().merge(ans, 1, Integer::sum);
                        simulation.getResults().merge(ans, 1, Integer::sum);
                    }

                    student.getRecords().add(new QuestionRecord(q, answer));
                }
            }

        }

        for (Question q : simulation.getQuestions()) {
            q.printQuestion();
            System.out.println();
            q.printPotentialAnswers();
            System.out.println();
            System.out.println(q.getFrequency() + "\n");
        }

        System.out.println("The Total Test Frequency");
        System.out.println(simulation.getResults() + "\n Student Answers Data\n");
        printStudentRecords(students);
        System.out.println("\n\n\n");
    }

    /**
     * prints the students answer data stored in QuestionRecord object
     * @param students
     */
    public static void printStudentRecords(Student[] students) {
        for (Student student : students) {
            for (QuestionRecord qr : student.getRecords()) {
                System.out.println("Student ID: " + student.getUniqueId());
                System.out.println(qr.toString());
            }
        }
    }

}