import java.lang.reflect.Method;

class Task {
    // simulating a heavy task
    public void heavyWork() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Work complete.");
    }
}

public class TimeMeasurer {
    public static void main(String[] args) throws Exception {
        Task task = new Task();
        Method m = Task.class.getMethod("heavyWork");

        // recording the start time
        long start = System.currentTimeMillis();
        
        // invoking the method dynamically
        m.invoke(task);
        
        // calculating the total duration
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: " + (end - start) + "ms");
    }
}