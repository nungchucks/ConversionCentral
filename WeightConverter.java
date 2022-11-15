public class WeightConverter extends TemperatureConverter{
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }

    public void lbsToKG(double weight) {
        this.weight = weight * .454;
    }
    public void kgToLbs(double weight) {
        this.weight = weight / .454;
    }
}
