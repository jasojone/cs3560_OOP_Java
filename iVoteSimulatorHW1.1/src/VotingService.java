import java.util.HashMap;
import java.util.Map;
import QuestionAndAnswers.Question;

public class VotingService {
    private Question[] questions;
    private Map<String, Integer> results = new HashMap<String, Integer>();

    public VotingService(Question[] questions) {
        this.questions = questions;
    }

    /**
     * @return Map<String, Integer>
     */
    public Map<String, Integer> getResults() {
        return results;
    }

    /**
     * @return Question[]
     */
    public Question[] getQuestions() {
        return questions;
    }

}