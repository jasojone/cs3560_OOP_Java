import java.util.HashMap;
import java.util.Map;
import QuestionAndAnswers.Question;
/**
 * Holds the questions and the results
 */
public class VotingService {
    private Question[] questions;
    private Map<Integer, Integer> results = new HashMap<Integer, Integer>();

    public VotingService(Question[] questions) {
        this.questions = questions;
    }

    /**
     * @return Map<String, Integer>
     */
    public Map<Integer, Integer> getResults() {
        return results;
    }

    /**
     * @return Question[]
     */
    public Question[] getQuestions() {
        return questions;
    }

}