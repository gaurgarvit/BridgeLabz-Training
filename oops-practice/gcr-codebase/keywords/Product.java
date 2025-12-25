public class Product {
    // sharing a discount percentage across all products
    static double discount= 5.0;
    
    // ensuring the product ID remains constant
    final int productID;
    
    // storing the product name, price and qunatity
    String productName;
    double price;
    int quantity;

    // initializing productName, price, and quantity using 'this'
    Product(int productID, String productName, double price, int quantity) {
        this.productID= productID;
        this.productName= productName;
        this.price= price;
        this.quantity= quantity;
    }

    // modifying the static discount percentage
    static void updateDiscount(double newDiscount) {
        discount= newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // processing and displaying product details
    void displayProduct() {
        System.out.println("ID: "+ productID);
        System.out.println("Product: "+ productName);
        System.out.println("Price: $"+ price);
        System.out.println("Quantity: "+ quantity);
        System.out.println("Applied Discount: "+ discount + "%");
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        // creating a product object
        Product p1= new Product(1001, "Laptop", 1200.00, 1);

        // validating whether p1 is an instance of Product
        if (p1 instanceof Product) {
            p1.displayProduct();
        }

        // updating the discount for all products
        Product.updateDiscount(10.0);

        // creating another product object to see the new discount
        Product p2= new Product(1002, "Mouse", 25.00, 2);

        // validating whether p2 is an instance of Product
        if (p2 instanceof Product) {
            p2.displayProduct();
        }
    }
}