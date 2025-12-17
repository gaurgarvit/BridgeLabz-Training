import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= s.nextInt();

        int org= n;  // original number
        int sum= 0;

        while(n> 0){
            int digit= n % 10;    // taking out the last digit
            sum+= digit * digit * digit;  // cube of digits
            n/= 10;
        }

        if(sum== org){
            System.out.println(org + " is an Armstrong Number");
        }
        else{
            System.out.println(org + " is NOT an Armstrong Number");
        }
    }
}
