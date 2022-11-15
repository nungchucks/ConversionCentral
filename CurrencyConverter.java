public class CurrencyConverter {
    private double amount;
    public void usdToEUR(double amount) {
        this.amount = amount * 0.9585799;
    }
    public void eurToUSD(double amount) {
        this.amount = amount / 0.9585799;
    }
    public void usdToYEN(double amount) {
        this.amount = amount*138.63008;
    }
    public void yenToUSD(double amount) {
        this.amount = amount/138.63008;
    }
    public void eurToYEN(double amount) {
        this.amount = amount*144.65463;
    }
    public void yenToEUR(double amount) {
        this.amount = amount/144.65463;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return this.amount;
    }
}
