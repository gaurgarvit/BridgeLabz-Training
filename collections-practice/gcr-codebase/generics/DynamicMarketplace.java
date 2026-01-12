abstract class Category {
    abstract String getCategoryName();
}

// concrete category for books
class BookCategory extends Category {
    @Override
    String getCategoryName(){ 
        return "Books"; 
    }
}

// concrete category for clothing
class ClothingCategory extends Category {
    @Override
    String getCategoryName() { 
        return "Clothing"; 
    }
}

// concrete category for gadgets
class GadgetCategory extends Category {
    @Override
    String getCategoryName() { 
        return "Gadgets"; 
    }
}

// generic class Product restricted to types that extend Category
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name= name;
        this.price= price;
        this.category= category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price= price;
    }

    // method to display product details
    public void displayInfo() {
        System.out.println("Product: "+ name+ " | Category: "+ category.getCategoryName()+ " | Price: $"+ price);
    }
}

public class DynamicMarketplace {

    // generic method to apply discount to any product type
    // <T extends Category> ensures type safety
    public static <T extends Category> void applyDiscount(Product<T> product, double percentage) {
        double currentPrice= product.getPrice();
        double newPrice= currentPrice - (currentPrice * (percentage / 100));
        product.setPrice(newPrice);
        System.out.println("Applied "+ percentage+ "% discount.");
    }

    public static void main(String[] args) {
        // creating specific categories
        BookCategory bookCat= new BookCategory();
        GadgetCategory gadgetCat= new GadgetCategory();

        // creating products with specific categories
        Product<BookCategory> book= new Product<>("Java Programming", 50.00, bookCat);
        Product<GadgetCategory> phone= new Product<>("Smart Phone", 800.00, gadgetCat);

        // displaying initial info
        book.displayInfo();
        phone.displayInfo();

        System.out.println("--- Applying Discounts ---");

        // applying discounts dynamically
        applyDiscount(book, 10); // 10% off
        applyDiscount(phone, 5); // 5% off

        // displaying info after discount
        book.displayInfo();
        phone.displayInfo();
    }
}