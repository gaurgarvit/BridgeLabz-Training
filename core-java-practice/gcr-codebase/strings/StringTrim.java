import java.util.*;

public class StringTrim {
    // method to find start and end indices for trimming
    public static int[] getIndiceTrim(String text) {
        int start= 0;
        int end= text.length();

        // loop to find first non-space character
        while(start< end && text.charAt(start)== ' '){
            start++;
        }

        // loop to find last non-space character
        while(end> start && text.charAt(end-1)== ' '){
            end--;
        }

        return new int[]{start, end};
    }

    // method to create substring using charAt
    public static String createSubstring(String text, int start, int end) {
        String sub = "";

        for(int i=start;i<end;i++){
            sub= sub + text.charAt(i);
        }

        return sub;
    }

    // method to compare two strings
    public static boolean compare(String str1, String str2) {
        if(str1.length()!= str2.length()){
            return false;
        }

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!= str2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking user input (using nextLine to capture spaces)
        System.out.print("Enter a string with spaces: ");
        String text= s.nextLine();

        // getting indices to trim
        int[] indices= getIndiceTrim(text);

        // creating trimmed string using createSubstring method
        String trim= createSubstring(text, indices[0], indices[1]);

        // using built-in trim method
        String builtInTrim= text.trim();

        // comparing results
        boolean isSame= compare(trim, builtInTrim);

        System.out.println("Original: '"+text+"'");
        System.out.println("Custom Trimmed: '"+trim +"'");
        System.out.println("Matches built-in trim: "+ isSame);
    }
}