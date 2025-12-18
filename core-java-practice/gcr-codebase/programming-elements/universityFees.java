import java.util.Scanner;

public class universityFees {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking student fee
        System.out.print("Enter the Student Fee: ");
        double fee = s.nextDouble();

        // taking the discount percentage
        System.out.print("Enter the University Discount Percentage: ");
        double discountPercent = s.nextDouble();

        // calculation of discount amount
        double discountAmount = (discountPercent / 100) * fee;

        // calculation of final fees after discount
        double finalDiscountedFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + 
                           " and final discounted fee is INR " + finalDiscountedFee);
    }
}