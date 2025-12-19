import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        // taking student fee
        System.out.print("Enter the Student Fee: ");
        double fee = s.nextDouble();
        
        // taking discount percentage
        System.out.print("Enter the University Discount Percentage: ");
        double discountPerc= s.nextDouble();
        
        // calculating discount amount
        double discountAmount= (discountPerc / 100)* fee;
        
        // calculation of final fees after discount
        double finalFee= fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
