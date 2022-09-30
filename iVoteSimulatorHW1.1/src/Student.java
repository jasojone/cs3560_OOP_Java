import java.util.ArrayList;
import java.util.UUID;

public class Student {
    // member variables of the class
    private final UUID uniqueId;
    private ArrayList<QuestionRecord> records = new ArrayList<QuestionRecord>();

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
    public ArrayList<QuestionRecord> getRecords() {
        return records;
    }

}
