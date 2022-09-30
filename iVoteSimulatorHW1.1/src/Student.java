import java.util.ArrayList;
import java.util.UUID;
/**
 * object for the students information, the unique id and the students answer records
 */
public class Student {
    private final UUID uniqueId;
    private ArrayList<QuestionRecord> records = new ArrayList<QuestionRecord>();

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
