import java.util.Random;
import QuestionAndAnswers.*;

public class SimulationDriver {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        MockData data = new MockData();
        // 0 for multi 1 for single
        int typeOfQuestion = 0;
        System.out.println(typeOfQuestion == 1 ? "Single Choice Questions\n" : "Multiple Choice Questions\n");
        VotingService t1 = new VotingService(data.getMockData(typeOfQuestion));
        Student[] students = data.studentGenerator();
        Random rand = new Random();
        Integer[] answer;

        for (Question q : t1.getQuestions()) {
            for (Student student : students) {
                if (typeOfQuestion == 0) {
                    int answerCount = rand.nextInt(q.getPotentialAnswers().size());
                    answer = data.getMockMultipleAnswers(answerCount, q.getPotentialAnswers().size());
                    for (Integer ans : answer) {
                        q.getFrequency().merge(ans, 1, Integer::sum);
                        t1.getResults().merge(ans, 1, Integer::sum);
                    }
                    student.getRecords().add(new QuestionRecord(q, answer));
                } else {
                    answer = data.getMockSingleAnswer(q.getPotentialAnswers().size());
                    for (Integer ans : answer) {
                        q.getFrequency().merge(ans, 1, Integer::sum);
                        t1.getResults().merge(ans, 1, Integer::sum);
                    }
                    student.getRecords().add(new QuestionRecord(q, answer));
                }
            }

        }
        for (Question q : t1.getQuestions()) {
            q.printQuestion();
            System.out.println();
            q.printPotentialAnswers();
            System.out.println();
            System.out.println(q.getFrequency() + "\n");
        }

        System.out.println("The Total Test Frequency");
        System.out.println(t1.getResults() + "\n Student Answers Data\n");
        printStudentRecords(students);
        System.out.println("\n\n\n");
    }

    /**
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