import java.util.*;
public class StringComparison {
    // method to compare two strings using charAt
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

        // taking two string inputs from user
        System.out.print("Enter first string: ");
        String str1= s.next();
        System.out.print("Enter second string: ");
        String str2= s.next();

        // comparing strings using compare method
        boolean result= compare(str1, str2);

        // comparing strings using built-in method
        boolean builtInResult= str1.equals(str2);

        // checking if results are same and displaying
        if(result== builtInResult){
            System.out.println("Both methods are giving the same result: " + result);
        }
        else{
            System.out.println("Results are different");
        }
    }
}