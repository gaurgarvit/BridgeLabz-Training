import java.util.Scanner;

public class FindLongestWordInSentence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a sentence:");

        // reading the entire line as input
        String sentence= s.nextLine();

        // splitting the sentence into words
        String[] words= sentence.split("\\s+");
        String longestWord= "";

        // finding the longest word
        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord= word;
            }
        }

        System.out.println("Longest word: " + longestWord);
    }
}
