import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

// defining the annotation with a retention policy for runtime access
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

class WorkFlow {
    // marking this as highly important
    @ImportantMethod(level = "CRITICAL")
    public void processPayment() {}

    // marking this with the default level
    @ImportantMethod
    public void sendEmail() {}

    public void logActivity() {}
}

public class ReflectionTest {
    public static void main(String[] args) {
        // reflecting over the WorkFlow class methods
        Method[] methods = WorkFlow.class.getDeclaredMethods();
        for (Method m : methods) {
            // checking if the annotation is present
            if (m.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod anno = m.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + m.getName() + " | Priority: " + anno.level());
            }
        }
    }
}