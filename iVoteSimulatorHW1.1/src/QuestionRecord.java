import QuestionAndAnswers.Question;
/**
 * The question record object that will create a record of the questions for easy
 * access to the question and answer data.  
 */
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
     * print syntax cleaner
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
