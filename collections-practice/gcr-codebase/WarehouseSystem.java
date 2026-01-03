import java.util.ArrayList;
import java.util.List;

// defining the abstract base class for all warehouse items
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name= name;
    }

    public String toString() {
        return name;
    }
}

// extending the base class for electronics
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

// extending the base class for groceries
class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

// extending the base class for furniture
class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

// implementing a generic class to store specific types of items
class Storage<T extends WarehouseItem> {
    private List<T> items= new ArrayList<>();

    // adding an item to the storage list
    public void addItem(T item) {
        items.add(item);
        System.out.println("Stored: "+ item);
    }

    // retrieving the list of items
    public List<T> getItems() {
        return items;
    }
}

public class WarehouseSystem {
    
    // implementing a wildcard method to display items of any warehouse type
    public static void displayInventory(List<? extends WarehouseItem> items) {
        for (WarehouseItem item: items) {
            System.out.println("Item in inventory: "+ item);
        }
    }

    public static void main(String[] args) {
        // creating storage specifically for electronics
        Storage<Electronics> eStorage= new Storage<>();
        eStorage.addItem(new Electronics("Laptop"));
        eStorage.addItem(new Electronics("Smartphone"));

        // creating storage specifically for groceries
        Storage<Groceries> gStorage = new Storage<>();
        gStorage.addItem(new Groceries("Rice"));
        gStorage.addItem(new Groceries("Wheat"));

        System.out.println("--- All Inventory ---");
        
        // displaying items using the wildcard method
        displayInventory(eStorage.getItems());
        displayInventory(gStorage.getItems());
    }
}