import java.lang.reflect.Field;

class Person {
    // defining a private field to hide data
    private int age = 20;
}

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        // retrieving the field object by name
        Field field = Person.class.getDeclaredField("age");
        
        // breaking the private encapsulation
        field.setAccessible(true);
        
        // modifying the private value
        field.set(p, 30);
        
        // accessing the updated value
        System.out.println("Updated Age: " + field.get(p));
    }
}