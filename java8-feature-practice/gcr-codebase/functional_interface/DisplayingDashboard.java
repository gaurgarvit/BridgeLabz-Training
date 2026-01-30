interface Dashboard {
    void displaySpeed();
    
    // Default method for EV specific feature
    default void displayBattery() {
        // Do nothing by default for gas cars
    }
}

class PetrolCar implements Dashboard {
    public void displaySpeed() {
        System.out.println("Speed: 80 km/h");
    }
}

class ElectricCar implements Dashboard {
    public void displaySpeed() {
        System.out.println("Speed: 90 km/h");
    }
    
    @Override
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class DisplayingDashboard {
    public static void main(String[] args) {
        Dashboard tesla = new ElectricCar();
        tesla.displaySpeed();
        tesla.displayBattery();
    }
}