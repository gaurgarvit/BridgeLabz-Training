public class kmToMiles {
    public static void main(String[] args) {
        // distance in kilometers
        double km = 10.8;
        double conversionFactor = 1.6;
        
        // Calculating miles
        double miles = km * conversionFactor;
        System.out.println("The distance " + km + " km in miles is " + miles);
    }
}