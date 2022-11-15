public class TemperatureConverter extends Main {

    private double temperature;

    public void celsiusToF(double temperature) {
        this.temperature =(temperature*5/9) + 32;
    }
    public void fahrenheitToC(double temperature) {
        this.temperature = (temperature-32) * 5/9;
    }
    public void fahrenheitToK(double temperature) {
        this.temperature = (temperature-32) * 5/9 + 273.15;
    }
    public void kelvinToF(double temperature) {
        this.temperature = (temperature-273.15) * 5/9 + 32;
    }
    public void celsiusToK(double temperature) {
        this.temperature = temperature+273.15;
    }
    public void kelvinToC(double temperature) {
        this.temperature = temperature-273.15 ;
    }

    public void setTemp(double temperature) {
        this.temperature = temperature;
    }
    public double getTemp() {
        return temperature;
    }
}
