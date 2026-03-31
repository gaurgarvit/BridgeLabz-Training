class Engine {

    private String fuelType;
    Engine(String fuelType) {
        this.fuelType = fuelType;
    }

    void type() {
        System.out.println("Engine is of: " + fuelType);
    }
}

class Car {
    private Engine engine;

    Car(String fuelType) {
        this.engine = new Engine(fuelType);
    }

    void fuelType() {
        System.out.println("Car is starting!!");
        engine.type();
    }
}

public class Composition {

    public static void main(String[] args) {

        Car car = new Car("Petrol");
        car.fuelType();
    }
}
