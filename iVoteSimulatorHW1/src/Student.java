import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Student {
    // member variables of the class
    private final UUID uniqueId;
    private List<String> answers;

    // constructors
    public Student(){
        this.uniqueId = UUID.randomUUID();
        this.answers = new LinkedList<String>();
    }
    
    
    /** 
     * @return UUID
     */
    public UUID getUniqueId() {
        return uniqueId;
    }

    
    /** 
     * @return List<String>
     */
    public List<String> getAnswersUI() {
        return answers;
    }

    
    /** 
     * @param answers
     */
    public void setAnswersUI(List<String> answers) {
        this.answers = answers;
    }

}
