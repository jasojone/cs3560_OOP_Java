import QuestionAndAnswers.Question;

public class QuestionRecord {

    private Question query;
    private Integer[] answers;

    public QuestionRecord(Question query, Integer[] answers) {
        this.query = query;
        this.answers = answers;
    }
    public Question getQuery() {
        return query;
    }

    public Integer[] getAnswers() {
        return answers;
    }
    public String toString(){
        String result = "";
        result += "Question: " + query.getQuestion() + "\n";
        for (Integer answer : answers) {
            result += answer.toString() + " ";
        }
        return result;
    }
}
