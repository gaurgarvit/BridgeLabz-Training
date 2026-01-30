interface RentalVehicle {
    void rent(int days);
    void returnVehicle();
}

class Car implements RentalVehicle {
    public void rent(int days) {
        System.out.println("Car rented for " + days + " days. Cost: $" + (days * 50));
    }
    public void returnVehicle() {
        System.out.println("Car returned. Inspection pending.");
    }
}

class Bike implements RentalVehicle {
    public void rent(int days) {
        System.out.println("Bike rented for " + days + " days. Cost: $" + (days * 15));
    }
    public void returnVehicle() {
        System.out.println("Bike returned.");
    }
}

public class RentingVehicles {
    public static void main(String[] args) {
        RentalVehicle myRide = new Car();
        myRide.rent(3);
        myRide.returnVehicle();
        
        myRide = new Bike(); // Switching implementation
        myRide.rent(1);
    }
}