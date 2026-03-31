import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // reading two strings
        System.out.println("Enter first string:");
        String str1 = s.nextLine();
        System.out.println("Enter second string:");
        String str2 = s.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
            return;
        }

        // converting strings to char arrays and sorting
        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // comparing sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The strings are anagrams.");
        }
        else{
            System.out.println("The strings are not anagrams.");
        }
    }
}
