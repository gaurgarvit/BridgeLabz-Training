import java.util.Scanner;

class PalindromeChecker {
    private String text;

    // initializing the text using a constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // checking whether the given text is a palindrome
    public boolean isPalindrome() {
        // removing spaces and converting text to lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        // reversing the cleaned string
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // displaying the palindrome check result
    public void displayResult() {
        if(isPalindrome()){
            System.out.println("\"" + text + "\" is a palindrome.");
        }

        else{
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class Palindrome {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking a string input from the user
        System.out.print("Enter a string to check: ");
        String text= s.nextLine();

        // creating a PalindromeChecker object
        PalindromeChecker checker= new PalindromeChecker(text);
        checker.displayResult();
    }
}
