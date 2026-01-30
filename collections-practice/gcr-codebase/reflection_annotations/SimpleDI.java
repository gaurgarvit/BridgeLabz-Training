import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@interface Inject {}

class Service {
    public void run() { System.out.println("Service is running..."); }
}

class Client {
    // marking the field for automatic injection
    @Inject
    private Service service;

    public void start() { service.run(); }
}

public class SimpleDI {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        // scanning fields for the @Inject annotation
        for (Field f : client.getClass().getDeclaredFields()) {
            if (f.isAnnotationPresent(Inject.class)) {
                f.setAccessible(true);
                // injecting a new instance of the required type
                f.set(client, f.getType().getDeclaredConstructor().newInstance());
            }
        }
        // starting the client with its new dependency
        client.start();
    }
}