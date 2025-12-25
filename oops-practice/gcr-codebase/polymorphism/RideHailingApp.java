// defining the GPS interface
interface GPS {
    // getting current location coordinates
    String getCurrentLocation();
    
    // updating the location
    void updateLocation(String newLoc);
}

// defining the abstract Vehicle class
abstract class Vehicle {
    // encapsulating vehicle details
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId= vehicleId;
        this.driverName= driverName;
        this.ratePerKm= ratePerKm;
    }

    // getting the rate
    public double getRatePerKm() {
        return ratePerKm;
    }

    // calculating fare abstractly
    abstract double calculateFare(double distance);

    // displaying vehicle details
    void getVehicleDetails() {
        System.out.println("Vehicle ID: "+ vehicleId+ ", Driver: "+ driverName);
    }
}

// extending for Car
class Car extends Vehicle implements GPS {
    String currentLocation= "Garage";

    Car(String id, String driver) {
        super(id, driver, 15.0);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLoc) {
        this.currentLocation = newLoc;
        System.out.println("Car moved to: "+ newLoc);
    }
}

// extending for Auto
class Auto extends Vehicle {
    Auto(String id, String driver) {
        super(id, driver, 10.0);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// extending for Bike
class Bike extends Vehicle {
    Bike(String id, String driver) {
        super(id, driver, 5.0);
    }

    @Override
    double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

// executing the ride application
public class RideHailingApp {
    // demonstrating polymorphism
    static void bookRide(Vehicle v, double distance) {
        v.getVehicleDetails();
        double fare= v.calculateFare(distance);
        System.out.println("Distance: "+ distance+ " km");
        System.out.println("Total Fare: $"+ fare);
        
        // checking for GPS capability
        if (v instanceof GPS) {
            ((GPS) v).updateLocation("Customer Pickup Point");
        }

        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        // creating vehicles
        Car car = new Car("CAR-123", "Mike");
        Auto auto = new Auto("AUTO-456", "Raj");
        Bike bike = new Bike("BIKE-789", "Sam");

        bookRide(car, 10.5);
        bookRide(auto, 5.0);
        bookRide(bike, 3.2);
    }
}