// defining the parent animal class
class Animal {
    // creating a method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// extending the parent class
class Dog extends Animal {
    
    // overriding the parent method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// running the program using a custom class name
public class ZooKeeper {
    // executing the main logic
    public static void main(String[] args) {
        // instantiating the dog object
        Dog myDog = new Dog();

        // calling the overridden sound method
        myDog.makeSound();
    }
}