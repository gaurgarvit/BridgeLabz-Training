import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter the limit number: ");
        int n= s.nextInt();

        if(n>0){
            // iterating from 1 to the input number
            for (int i = 1; i <= n; i++) {

                // checking if the number is divisible by 2 (even)
                if(i % 2== 0){
                    System.out.println(i + " is even");
                }
                else{
                    System.out.println(i + " is odd");
                }
            }
        }
    }
}