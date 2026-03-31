import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // reading input string
        System.out.println("Enter a string:");
        String input= s.nextLine();

        String reversed = "";

        // storing each char from end to a new string reversed
        for(int i=input.length()-1;i>=0;i--){
            reversed+= input.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
