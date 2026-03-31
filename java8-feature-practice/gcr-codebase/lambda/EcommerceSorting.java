import java.util.ArrayList;
import java.util.List;

class Product {
    String name;
    double price;
    double rating;
    int discountPercent;

    public Product(String name, double price, double rating, int discountPercent) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discountPercent = discountPercent;
    }

    @Override
    public String toString() {
        return String.format("%-15s | $%-6.2f | %.1f/5.0 | %d%% Off", name, price, rating, discountPercent);
    }
}

public class EcommerceSorting {
    public static void main(String[] args) {
        
        // creating the list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.00, 4.8, 10));
        products.add(new Product("Headphones", 150.00, 4.2, 25));
        products.add(new Product("Smart Watch", 299.00, 4.5, 5));
        products.add(new Product("Phone Case", 19.99, 3.9, 0));

        System.out.println("--- Original List ---");
        // printing original list
        products.forEach(p -> System.out.println(p));

        System.out.println("\n--- Sorted by Price (Low to High) ---");
        // sorting using lambda comparing prices
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        // displaying results
        products.forEach(p -> System.out.println(p));

        System.out.println("\n--- Sorted by Rating (High to Low) ---");
        // sorting using lambda comparing ratings descending
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        // displaying results
        products.forEach(p -> System.out.println(p));

        System.out.println("\n--- Sorted by Discount (High to Low) ---");
        // sorting using lambda comparing discount percentages
        products.sort((p1, p2) -> Integer.compare(p2.discountPercent, p1.discountPercent));
        // displaying results
        products.forEach(p -> System.out.println(p));
    }
}