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
        VotingService t1 = new VotingService(data.getMockData(1));
        Student[] students = studentGenerator();
        Random rand = new Random();
        Integer[] answer;

        for (Question q : t1.getQuestions()) {
            for (Student student : students) {
                int answerCount = rand.nextInt(q.getPotentialAnswers().size());
                answer = data.getMockAnswers(answerCount, q.getPotentialAnswers().size());
                for (Integer ans : answer) {
                    q.getFrequency().merge(ans, 1, Integer::sum);
                    t1.getResults().merge(ans, 1, Integer::sum);
                }
                student.getRecords().add(new QuestionRecord(q, answer));
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
        System.out.println(t1.getResults());
        printStudentRecords(students);
    }
    /** 
     * @return Student[]
     */
    public static Student[] studentGenerator() {
        Student[] s = new Student[20];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
        }
        return s;
    }

    public static void printStudentRecords(Student[] students){
        for (Student student : students) {
            for (QuestionRecord qr : student.getRecords()) {
                System.out.println("Student ID: " + student.getUniqueId());
                System.out.println(qr.toString());
            }
        }
    }
    
}