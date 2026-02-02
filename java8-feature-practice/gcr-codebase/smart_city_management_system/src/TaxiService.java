public class TaxiService implements TransportService{
    private String route;
    private double fare;
    private String time;

    public TaxiService(String route, double fare, String time){
        this.route= route;
        this.fare= fare;
        this.time= time;
    }

    @Override
    public String getServiceName() {
        return "";
    }

    @Override
    public String getRoute() {
        return "";
    }

    @Override
    public double getFare() {
        return 0;
    }

    @Override
    public String getDepartureTime() {
        return "";
    }
}
