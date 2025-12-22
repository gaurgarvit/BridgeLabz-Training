import java.util.*;
public class CharArray {
    // method to return characters without toCharArray
    public static char[] getChars(String text) {
        char[] chars= new char[text.length()];

        // filling char array one by one
        for(int i=0;i<text.length();i++){
            chars[i]= text.charAt(i);
        }

        return chars;
    }

    // method to compare two char arrays
    public static boolean compare(char[] arr1, char[] arr2) {
        // checking length first
        if(arr1.length!= arr2.length) {
            return false;
        }

        // comparing elements one by one
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking text input from user
        System.out.print("Enter text: ");
        String text= s.next();

        // getting char array using getChars method
        char[] arr= getChars(text);

        // getting char array using built-in method
        char[] builtInArr= text.toCharArray();

        // comparing the two arrays and displaying result
        boolean result= compare(arr, builtInArr);
        System.out.println("Arrays match: " + result);
    }
}