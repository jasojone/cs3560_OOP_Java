import QuestionAndAnswers.Question;

public class QuestionRecord {

    private Question query;
    private Integer[] answers;

    public QuestionRecord(Question query, Integer[] answers) {
        this.query = query;
        this.answers = answers;
    }

    /**
     * @return Question
     */
    public Question getQuery() {
        return query;
    }

    /**
     * @return Integer[]
     */
    public Integer[] getAnswers() {
        return answers;
    }

    /**
     * @return String
     */
    public String toString() {
        String result = "";
        result += "Question: " + query.getQuestion() + "\n";
        for (Integer answer : answers) {
            result += answer.toString() + " ";
        }
        return result;
    }
}
