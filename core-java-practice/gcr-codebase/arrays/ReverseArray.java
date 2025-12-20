import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input to reverse
        System.out.print("Enter a number to reverse: ");
        int n= s.nextInt();

        // temporary variable to hold the number
        int tempNum= n;

        // finding number of digits
        int count= 0;
        while(tempNum> 0){
            tempNum/= 10;
            count++;
        }

        // finding and storing digits
        int[] originalDigits= new int[count];
        tempNum= n; // reset tempNum to original number
        
        // store digits in originalDigits array in reverse order
        for(int i=0;i<count;i++){
            originalDigits[i]= tempNum % 10;
            tempNum/= 10;
        }

        // reversing the array 
        int[] reverseArray= new int[count];

        // printing the reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < count; i++) {
            // determining reverse position
            reverseArray[i]= originalDigits[i];
            System.out.print(reverseArray[i]);
        }
    }
}