import java.util.*;
public class IndexOutOfBound {
    // method to generate the exception
    public static void generateException(String text) {
        // accessing index beyond length
        System.out.println(text.charAt(100));
    }

    // method to handle the exception
    public static void handleException(String text) {
        try{
            // accessing index beyond length
            System.out.println(text.charAt(100));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking string input from user
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to generate exception (commented out to run safe version)
        // generateException(text);

        // calling method to handle runtime exception
        handleException(text);
    }
}