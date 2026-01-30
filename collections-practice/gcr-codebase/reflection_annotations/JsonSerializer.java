import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
    String name();
}

class User {
    // mapping the Java field 'name' to 'user_name' in JSON
    @JsonField(name = "user_name")
    private String name;

    // mapping the Java field 'age' to 'user_age'
    @JsonField(name = "user_age")
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class JsonSerializer {
    // converting an object to a JSON-like string
    public static String convertToJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            // extracting the custom name from the annotation
            if (f.isAnnotationPresent(JsonField.class)) {
                JsonField jf = f.getAnnotation(JsonField.class);
                sb.append("\"").append(jf.name()).append("\": \"")
                  .append(f.get(obj)).append("\", ");
            }
        }
        return sb.toString().replaceAll(", $", "") + "}";
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Alice", 25);
        // printing the serialized output
        System.out.println(convertToJson(user));
    }
}