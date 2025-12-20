import java.util.Scanner;

public class DigitAnalysisFixed {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking a large number as input
        System.out.print("Enter a large number: ");
        long n= s.nextLong();

        // defining an array to hold digits (max 10 digits)
        int maxDigit= 10;
        int[] digits= new int[maxDigit];
        int index= 0;

        // extracting digits and storing in array
        while(n>0){
            // checking if we reached array limit
            if(index== maxDigit){
                System.out.println("Array limit reached (10 digits). Stopping extraction");
                break;
            }

            // removing last digit and storing
            digits[index]= (int)(n % 10);
            n= n / 10;
            index++;
        }

        // variables to track largest and second largest digits
        int largest= -1;
        int secondLargest= -1;

        // finding largest and second largest digits
        for(int i=0;i<index;i++){
            if(digits[i]>largest){
                secondLargest= largest;
                largest= digits[i];
            } 

            else if(digits[i]> secondLargest && digits[i]!= largest){
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}