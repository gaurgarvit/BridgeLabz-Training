import java.util.*;

public class FirstNonRepeating {
    // method to find first non-repeating char
    public static char firstUnique(String text) {
        // array to store frequency (256 ASCII chars)
        int[] freq= new int[256];

        // loop to find frequency of characters
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }

        // loop to find the first character with frequency 1
        for(int i=0;i<text.length();i++){
            if(freq[text.charAt(i)]== 1){
                return text.charAt(i);
            }
        }
        
        // return null char if no unique found
        return '\0'; 
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking text as input
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to find first non-repeating character
        char result= firstUnique(text);

        // displaying result
        if(result!= '\0'){
            System.out.println("First non-repeating character: " + result);
        } 
        else{
            System.out.println("No non-repeating character found.");
        }
    }
}