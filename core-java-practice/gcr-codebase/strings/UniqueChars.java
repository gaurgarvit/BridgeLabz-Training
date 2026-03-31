import java.util.*;
public class UniqueChars {
    // method to find length without using length() method
    public static int getCustomLength(String text){
        int count= 0;

        // iterating to count characters using for-each loop
        for(char ch: text.toCharArray()){
            count++;
        }

        return count;
    }

    // method to find unique characters using charAt
    public static char[] findUnique(String text) {
        int len= getCustomLength(text);

        // temporary array to store unique characters
        char[] temp= new char[len];
        int count= 0;

        // loop to find unique characters
        for(int i=0;i<len;i++){
            boolean isDuplicate = false;

            // inner loop to check with previous characters
            for(int j=0;j<i;j++){
                if(text.charAt(i)== text.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            
            // if unique, store in result array
            if(!isDuplicate){
                temp[count]= text.charAt(i);
                count++;
            }
        }

        // create new array to store exact number of unique chars
        char[] result= new char[count];
        for(int k=0; k<count; k++){
            result[k] = temp[k];
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking user input
        System.out.print("Enter a string: ");
        String text= s.next();

        // calling method to find unique characters
        char[] unique= findUnique(text);

        // displaying the result
        System.out.print("Unique characters: ");
        for(int i=0;i<unique.length;i++){
            System.out.print(unique[i]+" ");
        }
        
        System.out.println();
    }
}