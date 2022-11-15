public class DistanceConverter extends TemperatureConverter {
    private double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }
    public double getDistance() {
        return distance;
    }

    public void kmToMiles(double distance) {
        this.distance = distance * .62137119;
    }
    public void milesToKM(double distance) {
        this.distance = distance / .62137119;
    }
}
