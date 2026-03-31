// defining the interface for discounts
interface Discountable {
    // applying a discount percentage
    double applyDiscount(double amount, double percent);
    
    // getting discount details
    void getDiscountDetails();
}

// defining the abstract class FoodItem
abstract class FoodItem {
    // restricting access to fields using encapsulation
    private String itemName;
    private double price;
    private int quantity;

    // initializing the food item details
    FoodItem(String itemName, double price, int quantity) {
        this.itemName= itemName;
        this.price= price;
        this.quantity= quantity;
    }

    // getting the item name
    public String getItemName() {
        return itemName;
    }

    // getting the price
    public double getPrice() {
        return price;
    }

    // getting the quantity
    public int getQuantity() {
        return quantity;
    }

    // calculating total price abstractly
    abstract double calculateTotalPrice();

    // displaying item details concrete method
    void getItemDetails() {
        System.out.println("Item: "+ itemName);
        System.out.println("Price per unit: $"+ price);
        System.out.println("Quantity: "+ quantity);
    }
}

// extending for Veg items implementing Discountable
class VegItem extends FoodItem implements Discountable {
    VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double amount, double percent) {
        return amount - (amount * (percent / 100));
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: Seasonal Veg Discount Available");
    }
}

// extending for NonVeg items
class NonVegItem extends FoodItem implements Discountable {
    // adding specific surcharge for packaging
    private double packagingCharge = 5.0;

    NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    double calculateTotalPrice() {
        // adding packaging charge to total
        return (getPrice()* getQuantity()) + packagingCharge;
    }

    @Override
    public double applyDiscount(double amount, double percent) {
        // offering strictly less discount for premium items
        return amount -(amount * ((percent - 2) / 100));
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount: Standard Non-Veg Discount");
    }
}

public class FoodDeliverySystem {
    
    // processing the order using polymorphism
    static void processOrder(FoodItem item) {
        System.out.println("--- Order Details ---");
        item.getItemDetails();
        double total= item.calculateTotalPrice();
        System.out.println("Total Cost: $"+ total);

        // checking if item allows discounts
        if (item instanceof Discountable) {
            Discountable d = (Discountable) item;
            d.getDiscountDetails();

            double discountedPrice = d.applyDiscount(total, 10);
            System.out.println("Price after Discount: $" + discountedPrice);
        }
    }

    public static void main(String[] args) {
        // creating different food objects
        VegItem salad = new VegItem("Greek Salad", 12.0, 2);
        NonVegItem chicken = new NonVegItem("Grilled Chicken", 25.0, 1);

        processOrder(salad);
        processOrder(chicken);
    }
}