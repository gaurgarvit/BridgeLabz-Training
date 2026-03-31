// defining the Taxable interface
interface Taxable {
    // calculating tax amount
    double calculateTax(double price);
    
    // getting tax details
    String getTaxDetails();
}

// defining the abstract Product class
abstract class Product {
    // encapsulating product details
    private String productId;
    private String name;
    private double price;

    Product(String productId, String name, double price) {
        this.productId= productId;
        this.name= name;
        this.price= price;
    }

    // accessing price securely
    public double getPrice() {
        return price;
    }
    
    // accessing name securely
    public String getName() {
        return name;
    }

    // calculating discount abstractly
    abstract double calculateDiscount();
}

// extending for Electronics
class Electronics extends Product implements Taxable {
    Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax(double price) {
        return price * 0.18; // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "18% Electronics Tax";
    }
}

// extending for Clothing
class Clothing extends Product implements Taxable {
    Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax(double price) {
        return price * 0.05; // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "5% Clothing Tax";
    }
}

// extending for Groceries
class Groceries extends Product {
    Groceries(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        // creating product list
        Product[] cart= {
            new Electronics("E001", "Smartphone", 800.0),
            new Clothing("C001", "Jeans", 50.0),
            new Groceries("G001", "Rice Bag", 20.0)
        };

        // iterating through cart using polymorphism
        for(Product p: cart){
            double price= p.getPrice();
            double discount= p.calculateDiscount();
            double tax= 0;

            // checking taxability
            if (p instanceof Taxable) {
                tax= ((Taxable) p).calculateTax(price);
            }

            double finalPrice= price + tax - discount;

            System.out.println("Product: "+ p.getName());
            System.out.println("Base Price: $"+ price);
            System.out.println("Discount: -$"+ discount);
            System.out.println("Tax: +$"+ tax);
            System.out.println("Final Price: $"+ finalPrice);
            System.out.println("-------------------");
        }
    }
}