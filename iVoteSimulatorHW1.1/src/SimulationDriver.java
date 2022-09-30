import java.util.Random;
import QuestionAndAnswers.*;

public class SimulationDriver {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        VotingService t1 = new VotingService(new MockData().getMockData(1));
        Student[] students = studentGenerator();
        Random rand = new Random();
        String answer;

        for (Question q : t1.getQuestions()) {
            for (Student student : students) {
                answer = String.valueOf(rand.nextInt(4));
                q.getFrequency().merge(answer, 1, Integer::sum);
                t1.getResults().merge(answer, 1, Integer::sum);
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

    }

    
    /** 
     * @return Student[]
     */
    public static Student[] studentGenerator() {
        Student[] s = new Student[20];
        for (int i = 0; i > s.length; i++) {
            s[i] = new Student();
        }
        return s;
    }

}