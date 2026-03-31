import java.util.*;
public class NestedLoopFreq {
    // method to find frequency using nested loops
    public static String[] getFrequencyManual(String text) {
        // array to store chars
        char[] chars= text.toCharArray();
        int[] freq= new int[text.length()];
        
        // loop to find frequency
        for(int i=0;i<text.length();i++){
            freq[i]= 1;

            // inner loop to check for duplicates
            for(int j=i+1;j<text.length();j++){
                if(chars[i]== chars[j]){
                    freq[i]++;

                    // set duplicate to '0' to avoid counting again
                    chars[j] = '0';
                }
            }
        }

        // counting valid entries for result array size
        int count = 0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]!= '0'){
                count++;
            }
        }

        // 1D String array to store characters and frequencies
        String[] result= new String[count];
        int index= 0;
        
        for(int i=0;i<chars.length;i++){
            if(chars[i]!= '0'){
                result[index]= chars[i] + " : " + freq[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking text as input
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to get frequencies
        String[] result= getFrequencyManual(text);

        // displaying result
        System.out.println("Frequencies: ");

        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}