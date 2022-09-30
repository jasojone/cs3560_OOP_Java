import java.util.HashMap;
import java.util.Map;
import QuestionAndAnswers.Question;

public class VotingService {
    private Question[] questions;
    private Map<String, Integer> results = new HashMap<String, Integer>();

    public VotingService(Question[] questions) {
        this.questions = questions;
    }

    public Map<String, Integer> getResults() {
        return results;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public int correctCount() {
        int result = 0;
        for (Question question : questions) {
            if (question.isCorrect(null))
                ;
        }
        return result;
    }

}