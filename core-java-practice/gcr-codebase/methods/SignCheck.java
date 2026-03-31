import java.util.*;
public class SignCheck {

    // method to return status of number
    public static int checkNumber(int num) {
        if(num< 0){
            return -1;
        } 
        if(num > 0){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking number as input
        System.out.print("Enter a number: ");
        int num= s.nextInt();

        // getting status
        int result= checkNumber(num);

        // printing result based on status
        if(result== 1){
            System.out.println("Positive");
        }
        else if(result== -1){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}