import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Todo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}

class ProjectModule {
    // assigning a task to John
    @Todo(task = "Fix NullPointer in Auth", assignedTo = "John", priority = "HIGH")
    public void login() {}

    // assigning a task to Sarah
    @Todo(task = "Implement Dark Mode", assignedTo = "Sarah")
    public void uiSettings() {}
}

public class TodoScanner {
    public static void main(String[] args) {
        // scanning methods for pending tasks
        for (Method m : ProjectModule.class.getDeclaredMethods()) {
            if (m.isAnnotationPresent(Todo.class)) {
                Todo t = m.getAnnotation(Todo.class);
                System.out.println("Task: " + t.task() + " | Assignee: " + t.assignedTo());
            }
        }
    }
}