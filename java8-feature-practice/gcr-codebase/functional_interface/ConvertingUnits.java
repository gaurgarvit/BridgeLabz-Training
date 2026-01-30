interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }
}

public class ConvertingUnits {
    public static void main(String[] args) {
        double distKm = 100;
        double weightKg = 50;

        System.out.println(distKm + " km is " + UnitConverter.kmToMiles(distKm) + " miles.");
        System.out.println(weightKg + " kg is " + UnitConverter.kgToLbs(weightKg) + " lbs.");
    }
}