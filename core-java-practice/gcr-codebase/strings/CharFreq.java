import java.util.*;
public class CharFreq {
    // method to find frequency and return 2D array
    public static String[][] getFrequencies(String text) {
        // array to store frequency of characters
        int[] freq= new int[256];

        // loop to find frequency of characters
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }

        // array to store characters and their frequencies
        String[][] result= new String[text.length()][2];

        // loop to store chars and freq in 2D array
        for(int i=0;i<text.length();i++){
            result[i][0]= String.valueOf(text.charAt(i));
            result[i][1]= String.valueOf(freq[text.charAt(i)]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking text as input
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to get frequencies
        String[][] data= getFrequencies(text);

        // displaying result
        System.out.println("Char    Freq");
        System.out.println("------------");

        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}