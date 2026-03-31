
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter The String= ");
        
        String str= s.next();
        String reverse= "";

        // Loop from last character to first
        for(int i= str.length() - 1; i >= 0; i--) {
            reverse+= str.charAt(i);   // Add each character to reversed string
        }

        System.out.println("Original= " + str);
        System.out.println("Reversed= " + reverse);
    }
}
