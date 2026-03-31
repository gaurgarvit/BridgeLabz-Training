import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to The Ravi's Cafe!");

        // loop to allow multiple orders until user decides to exit
        while (true) {
            System.out.println("-----------------------------------");
            System.out.print("Which coffee would you like to order (Espresso/Latte/Cappuccino/Mocha/Iced Coffee) or type 'exit' to quit: ");
            String coffeeType = s.nextLine().trim();

            // exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for visiting The Ravi's Cafe! Have a great day!");
                break;
            }

            double price = 0;
            String displayName = "";

            // determine price based on coffee type
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    displayName = "Espresso";
                    break;
                case "latte":
                    price = 120;
                    displayName = "Latte";
                    break;
                case "cappuccino":
                    price = 130;
                    displayName = "Cappuccino";
                    break;
                case "mocha":
                    price = 140;
                    displayName = "Mocha";
                    break;
                case "iced coffee":
                    price = 110;
                    displayName = "Iced Coffee";
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            // get quantity from user
            System.out.print("Enter the number of " + displayName + " cups: ");
            int quantity = s.nextInt();
            s.nextLine(); // consume the newline character to avoid invalid error

            // calculate total cost and GST
            double total = quantity * price;
            System.out.println("Total cost for " + quantity + " " + displayName + " cup(s): " + total);

            double gst = total * 0.18;
            System.out.println("GST (18%): " + gst);

            // calculate final amount including GST
            double finalAmount = total + gst;
            System.out.println("Final amount after including 18% GST: " + finalAmount);
        }
    }
}
