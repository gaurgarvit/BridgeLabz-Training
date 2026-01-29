public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    // selecting vehicle based on timber area
    public String vehicleSelection() {

        // calculating timber area
        double area = 2 * 3.147 * timberRadius * timberLength;

        if (area < 250) {
            return "Truck";
        }
        else if (area <= 400) {
            return "Lorry";
        }
        else {
            return "MonsterLorry";
        }
    }

    // calculating total charge for timber transport
    public float calculateTotalCharge() {

        // calculating timber volume
        double volume = 3.147 * timberRadius * timberRadius * timberLength;

        // calculating base price using timber type
        double price;
        if (timberType.equalsIgnoreCase("Premium")) {
            price = volume * timberPrice * 0.25;
        }
        else {
            price = volume * timberPrice * 0.15;
        }

        // calculating tax
        double tax = price * 0.30;

        // calculating discount based on rating
        double discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20;
        }
        else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.10;
        }

        // determining vehicle cost
        double vehicleCost;
        String vehicle = vehicleSelection().toLowerCase();
        if (vehicle.equals("truck")) {
            vehicleCost = 1000;
        }
        else if (vehicle.equals("lorry")) {
            vehicleCost = 1700;
        }
        else {
            vehicleCost = 3000;
        }

        // returning final total charge
        return (float) ((price + tax + vehicleCost) - discount);
    }

    // providing getter for timberType
    public String getTimberType() {
        return timberType;
    }

    // providing getter for timberPrice
    public float getTimberPrice() {
        return timberPrice;
    }
}
