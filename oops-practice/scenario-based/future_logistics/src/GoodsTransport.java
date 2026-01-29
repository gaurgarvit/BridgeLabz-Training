public abstract class GoodsTransport {

    protected String transportId;
    protected String transportDate;
    protected int transportRating;

    public GoodsTransport(String transportId, String transportDate, int transportRating) {
        this.transportId = transportId;
        this.transportDate = transportDate;
        this.transportRating = transportRating;
    }

    public String getTransportId() {
        return transportId;
    }

    public void setTransportId(String transportId) {
        this.transportId = transportId;
    }

    public String getTransportDate() {
        return transportDate;
    }

    public void setTransportDate(String transportDate) {
        this.transportDate = transportDate;
    }

    public int getTransportRating() {
        return transportRating;
    }

    public void setTransportRating(int transportRating) {
        this.transportRating = transportRating;
    }

    // declaring abstract method for vehicle selection
    public abstract String vehicleSelection();

    // declaring abstract method for total charge calculation
    public abstract float calculateTotalCharge();
}
