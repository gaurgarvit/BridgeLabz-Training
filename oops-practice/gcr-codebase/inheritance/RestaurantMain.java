// defining the Person superclass
class Person {
    String name;
    int id;

    // initializing person details
    Person(String name, int id) {
        this.name= name;
        this.id= id;
    }
}

// defining the Worker interface
interface Worker {
    void performDuties();
}

// creating Chef class inheriting Person and implementing Worker
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty= specialty;
    }

    // implementing the duties for a chef
    public void performDuties() {
        System.out.println("Chef "+ name +" is cooking "+ specialty+ " dishes");
    }
}

// creating Waiter class inheriting Person and implementing Worker
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned= tablesAssigned;
    }

    // implementing the duties for a waiter
    public void performDuties() {
        System.out.println("Waiter "+ name+ " is serving "+ tablesAssigned+ " tables.");
    }
}

public class RestaurantMain {
    public static void main(String[] args) {
        // creating chef and waiter objects
        Chef chef= new Chef("Gordon", 1, "Italian");
        Waiter waiter= new Waiter("Harry", 2, 5);

        chef.performDuties();
        waiter.performDuties();
    }
}