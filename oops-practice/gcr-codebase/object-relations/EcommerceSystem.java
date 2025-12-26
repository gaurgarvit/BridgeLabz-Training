import java.util.ArrayList;
import java.util.List;

// defining the product class
class Product {
    private String name;
    private double price;

    // initializing product details
    public Product(String name, double price) {
        this.name= name;
        this.price= price;
    }

    // returning product info for display
    public String toString() {
        return name+ " ($" + price + ")";
    }

    // returning the price
    public double getPrice() {
        return price;
    }
}

// defining the order class which aggregates products
class Order {
    private int orderId;
    private List<Product> products;

    // initializing the order
    public Order(int orderId) {
        this.orderId= orderId;
        this.products= new ArrayList<>();
    }

    // adding a product to the order (aggregation)
    public void addProduct(Product p) {
        products.add(p);
    }

    // displaying the order summary
    public void showOrderDetails() {
        System.out.println("Order ID: "+ orderId);
        double total= 0;
        for (Product p: products) {
            System.out.println("- " + p);
            total+= p.getPrice();
        }

        System.out.println("Total Amount: $" + total);
    }
}

// defining the customer class
class CustomerUser {
    private String name;

    // initializing the customer
    public CustomerUser(String name) {
        this.name= name;
    }

    // placing an order containing products
    public void placeOrder(Order order) {
        System.out.println("\nCustomer "+ name+" placed an order:");
        order.showOrderDetails();
    }
}

// running the main class for the e-commerce system
public class EcommerceSystem {
    public static void main(String[] args) {
        // creating products
        Product p1= new Product("Laptop", 1200.00);
        Product p2= new Product("Mouse", 25.50);
        Product p3= new Product("Keyboard", 45.00);

        // creating an order and adding products
        Order myOrder= new Order(5501);
        myOrder.addProduct(p1);
        myOrder.addProduct(p2);
        myOrder.addProduct(p3);

        // creating a customer and placing the order
        CustomerUser customer= new CustomerUser("Sarah Connor");
        customer.placeOrder(myOrder);
    }
}