import java.util.Scanner;

public class ReplaceSpaces {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the text to replace multiple spaces : ");

        // taking text input
        String text=s.nextLine();

        // regular Expression for replacing multiple spaces with single space
        String regex="\\s+";

        // replacing multiple spaces with single space
        String result=text.replaceAll(regex, " ");
        System.out.println("Text after replacing multiple spaces : "+ result);
        
    }
    
}