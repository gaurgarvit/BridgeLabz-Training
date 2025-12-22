import java.util.*;
public class NullPointerDemo {
    // method to generate the exception
    public static void generateException() {
        String text= null;

        // accessing method on null variable
        System.out.println(text.length());
    }

    // method to handle the exception
    public static void handleException() {
        String text= null;

        try{
            // accessing method on null variable
            System.out.println(text.length());
        }
        catch(NullPointerException e){
            System.out.println("Exception caught: "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // calling method to generate exception
        // generateException();

        // calling method to handle runtime exception
        handleException();
    }
}