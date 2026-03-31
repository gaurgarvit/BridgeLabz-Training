public class BrickTransport extends GoodsTransport {

    private float brickSize;
    private int brickQuantity;
    private float brickPrice;

    public BrickTransport(String transportId, String transportDate, int transportRating,
                          float brickSize, int brickQuantity, float brickPrice) {
        super(transportId, transportDate, transportRating);
        this.brickSize = brickSize;
        this.brickQuantity = brickQuantity;
        this.brickPrice = brickPrice;
    }

    // selecting vehicle based on brick quantity
    public String vehicleSelection() {
        if (brickQuantity < 300) {
            return "Truck";
        } else if (brickQuantity <= 500) {
            return "Lorry";
        } else {
            return "MonsterLorry";
        }
    }

    // calculating total charge for brick transport
    public float calculateTotalCharge() {

        // calculating base price
        float price = brickPrice * brickQuantity;

        // calculating tax amount
        float tax = price * 0.30f;

        // calculating discount based on rating
        float discount = 0;
        if (transportRating == 5) {
            discount = price * 0.20f;
        } else if (transportRating == 3 || transportRating == 4) {
            discount = price * 0.10f;
        }

        // determining vehicle cost
        float vehicleCost = 0;
        String vehicle = vehicleSelection().toLowerCase();
        if (vehicle.equals("truck")) {
            vehicleCost = 1000;
        } else if (vehicle.equals("lorry")) {
            vehicleCost = 1700;
        } else {
            vehicleCost = 3000;
        }

        // returning final total charge
        return (price + tax + vehicleCost) - discount;
    }

    // providing getter for brickQuantity
    public int getBrickQuantity() {
        return brickQuantity;
    }

    // providing getter for brickPrice
    public float getBrickPrice() {
        return brickPrice;
    }
}
