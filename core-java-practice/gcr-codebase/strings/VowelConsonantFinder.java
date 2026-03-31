import java.util.*;
public class VowelConsonantFinder {
    // method to check char type using ASCII for case conversion
    public static String checkCharType(char ch) {
        // converting uppercase to lowercase using ASCII
        if(ch>= 'A' && ch<= 'Z'){
            ch= (char)(ch + 32);
        }
        
        // checking if character is a letter
        if((ch< 'a' || ch> 'z')){
            return "Not a Letter";
        }
        
        // checking for vowel
        if(ch== 'a' || ch== 'e' || ch== 'i' || ch== 'o' || ch== 'u'){
            return "Vowel";
        }
        
        return "Consonant";
    }

    // method to find vowels/consonants and return 2D array
    public static String[][] findVowelsConsonants(String text) {
        String[][] results= new String[text.length()][2];
        
        for(int i=0;i<text.length();i++){
            char ch= text.charAt(i);
            String type= checkCharType(ch);
            
            // storing character and its type
            results[i][0]= String.valueOf(ch);
            results[i][1]= type;
        }
        return results;
    }

    // method to display 2D array in tabular format
    public static void displayArr(String[][] data) {

        System.out.println("Char     Type");
        System.out.println("-------------");


        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0]+ "     " + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking user input
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to process string
        String[][] result= findVowelsConsonants(text);

        // calling method to display results
        displayArr(result);
    }
}