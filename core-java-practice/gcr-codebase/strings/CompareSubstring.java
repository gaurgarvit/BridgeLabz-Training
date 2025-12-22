import java.util.*;
public class CompareSubstring {
    // method to create substring using charAt
    public static String createSubstring(String text, int start, int end) {
        String sub= "";

        // building substring character by character
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

        // comparing characters one by one
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!= str2.charAt(i)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking string , start index and end index as input
        System.out.print("Enter text: ");
        String text= s.next();
        System.out.print("Enter start index: ");
        int start= s.nextInt();
        System.out.print("Enter end index: ");
        int end= s.nextInt();

        // creating substring using createSubstring method
        String Sub= createSubstring(text, start, end);

        // creating substring using built-in method
        String builtInSub= text.substring(start, end);

        // comparing the two substrings
        boolean result= compare(Sub, builtInSub);
        System.out.println("Substrings match: " + result);
    }
}