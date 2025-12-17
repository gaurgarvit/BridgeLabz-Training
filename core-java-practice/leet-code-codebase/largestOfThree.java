import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= s.nextInt();

        System.out.print("Enter second number: ");
        int b= s.nextInt();

        System.out.print("Enter third number: ");
        int c= s.nextInt();

        int temp= a;

        if(b> temp){
            temp= b;
        }
        if(c> temp){
            temp= c;
        }

        System.out.println("Largest number = " + temp);
    }
}
