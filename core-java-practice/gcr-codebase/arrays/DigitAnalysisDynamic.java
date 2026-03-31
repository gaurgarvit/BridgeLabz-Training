import java.util.Scanner;

public class DigitAnalysisDynamic {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking a large number as input
        System.out.print("Enter a very large number: ");
        long n= s.nextLong();

        // defining an array to hold digits with dynamic resizing
        int maxDigit= 10;
        int[] digits= new int[maxDigit];
        int index= 0;

        while(n>0){
            // checking if we reached array limit
            if(index== maxDigit){
                // increase array size by 10
                maxDigit+= 10;
                
                // creating a new temporary array with the new size
                int[] temp= new int[maxDigit];
                
                // copying old values to the new array
                for(int i=0;i<digits.length;i++){
                    temp[i]= digits[i];
                }
                
                // assigning the new array back to digits
                digits= temp;
                System.out.println("Array resized to: " + maxDigit);
            }

            // removing last digit and storing
            digits[index]= (int)(n % 10);
            n= n / 10;
            index++;
        }

        int largest= -1;
        int secondLargest= -1;

        // iterating through the digits to find largest and second largest
        for(int i=0;i<index;i++){
            if(digits[i]> largest){
                secondLargest = largest;
                largest = digits[i];
            } 
            else if(digits[i]> secondLargest && digits[i]!= largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}