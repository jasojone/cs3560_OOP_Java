import java.util.ArrayList;
import java.util.UUID;

public class Student {
    // member variables of the class
    private final UUID uniqueId;
    private ArrayList<String> answers = new ArrayList<String>();

    // constructors
    public Student() {
        this.uniqueId = UUID.randomUUID();
    }

    /**
     * @return UUID
     */
    public UUID getUniqueId() {
        return uniqueId;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getAnswers() {
        return answers;
    }

}
