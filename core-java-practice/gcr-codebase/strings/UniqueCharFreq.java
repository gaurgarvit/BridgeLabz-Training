import java.util.*;
public class UniqueCharFreq {
    // method to find unique characters
    public static char[] getUniqueChars(String text) {
        String temp = "";

        // loop to find unique characters
        for(int i=0; i<text.length(); i++){
            // check if character is already in temp
            boolean isDuplicate= false;

            // inner loop to check for duplicates
            for(int j=0;j<i;j++){
                if(text.charAt(i)== text.charAt(j)){
                    isDuplicate= true;
                    break;
                }
            }

            // if not duplicate, add to temp
            if(!isDuplicate){
                temp+= text.charAt(i);
            }
        }

        return temp.toCharArray();
    }

    // method to find frequency of unique characters
    public static String[][] getUniqueFreq(String text) {
        // array to store frequency
        int[] freq= new int[256];
        
        // loop to find frequency
        for(int i=0;i<text.length();i++){
            freq[text.charAt(i)]++;
        }

        // call uniqueCharacters method
        char[] unique= getUniqueChars(text);

        // 2D array to store unique chars and frequencies
        String[][] result= new String[unique.length][2];

        // loop through unique chars to store data
        for(int i=0;i<unique.length;i++){
            result[i][0]= String.valueOf(unique[i]);
            result[i][1]= String.valueOf(freq[unique[i]]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking text as input
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to get unique frequencies
        String[][] data= getUniqueFreq(text);

        // displaying result
        System.out.println("Unique Char     Freq");
        System.out.println("--------------------");

        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+"               "+data[i][1]);
        }
    }
}