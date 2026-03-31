import java.io.Serializable;

// Implements Serializable (Marker Interface - no methods)
class UserSettings implements Serializable {
    String theme = "Dark Mode";
}

public class SerializingBackups {
    public static void main(String[] args) {
        UserSettings settings = new UserSettings();
        
        // Simulating a check before backup
        if (settings instanceof Serializable) {
            System.out.println("Object is safe for serialization (Backup allowed).");
        } 
        else {
            System.out.println("Object cannot be serialized.");
        }
    }
}