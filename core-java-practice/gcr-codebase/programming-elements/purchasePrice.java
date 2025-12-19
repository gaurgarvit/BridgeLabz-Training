import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // taking unit price as input
        System.out.print("Enter the unit price (INR): ");
        double unitPrice= s.nextDouble();

        // taking quantity as input
        System.out.print("Enter the quantity: ");
        int quantity= s.nextInt();

        // calculation of total purchase price
        double totalPrice= unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + 
                           " and unit price is INR " + unitPrice);
    }
}