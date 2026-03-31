public class VolumeOfEarth {
    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm= 6378;
        
        // Calculate Volume in Cubic Kilometers
        // Volume of a sphere = (4/3) * π * r^3
        double volumeKm= (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // Converting radius to miles (1 km= 0.621371 miles)
        double radiusMiles= radiusKm / 1.6;
        double volumeMiles= (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("Volume of earth in cubic kilometers is " + volumeKm);
        System.out.println("Volume of earth in cubic miles is " + volumeMiles);
    }
}
