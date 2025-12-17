import java.util.Scanner;

public class prime{

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter number: ");
        int n= s.nextInt();

        if(n<= 1){
            System.out.println("Not a Prime Number");
            return;
        }

        int flag= 0;

        // Checking only till square root
        for(int i=2;i*i<=n;i++) {
            if(n % i== 0){
                flag= 1;
                break;
            }
        }

        if(flag== 0){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }
}
