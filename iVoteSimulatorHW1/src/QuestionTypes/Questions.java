package QuestionTypes;

import java.util.List;

public abstract class Questions {
    // members
    private String questions;
    // can be changed form any classes or sub classes within the package
    protected List<String> answers;
    // can only be changed within the class with getters and setters
    private List<String> choices;
    
    /** 
     * @return String
     */
    // access method
    public String getQuestions() {
        return questions;
    }

    
    /** 
     * @param questions
     */
    public void setQuestions(String questions) {
        this.questions = questions;
    }
    
    /** 
     * @return List<String>
     */
    public List<String> getChoices() {
        return choices;
    }
    
    /** 
     * @param choices
     */
    public void setChoices(List<String> choices) {
        this.choices = choices;
    }
    
    /** 
     * @return List<String>
     */
    public List<String> getAnswers() {
        return answers;
    }
    public abstract void setAnswers(List<String> answers);
}
