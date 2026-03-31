import java.lang.reflect.Field;

class Configuration {
    // defining a private static constant-like field
    private static String API_KEY = "DEFAULT_KEY";
}

public class StaticFieldModifier {
    public static void main(String[] args) throws Exception {
        // fetching the static field from the class
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        
        // updating the static field (null is used for static members)
        field.set(null, "NEW_SECURE_KEY_2026");
        
        // reading the updated static value
        System.out.println("Modified API Key: " + field.get(null));
    }
}