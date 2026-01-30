import java.util.ArrayList;

public class SupressExample {
    // suppressing unchecked warnings for raw type usage
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // creating a list without generics
        ArrayList list = new ArrayList();
        // adding elements to a raw list
        list.add("Java");
        list.add(2026);

        // printing elements without compiler complaints
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}