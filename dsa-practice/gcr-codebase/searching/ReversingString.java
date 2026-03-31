import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking string as input
        System.out.print("Enter a string: ");
        String input= s.nextLine();

        // creating a StringBuilder object with the input string
        StringBuilder sb= new StringBuilder(input);

        // using the reverse() method to reverse the string
        sb.reverse();

        // converting back to string and printing
        String reversed= sb.toString();
        System.out.println("Reversed string: "+ reversed);
    }
}