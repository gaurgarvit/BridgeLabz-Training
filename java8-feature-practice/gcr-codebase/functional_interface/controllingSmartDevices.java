
interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is now ON.");
    }
    public void turnOff() {
        System.out.println("Light is now OFF.");
    }
}

class AirConditioner implements SmartDevice {
    public void turnOn() {
        System.out.println("AC is cooling the room.");
    }
    public void turnOff() {
        System.out.println("AC is shut down.");
    }
}

public class controllingSmartDevices {
    public static void main(String[] args) {
        // Polymorphism: Using interface reference
        SmartDevice bulb = new Light();
        SmartDevice ac = new AirConditioner();

        bulb.turnOn();
        ac.turnOn();
        bulb.turnOff();
    }
}