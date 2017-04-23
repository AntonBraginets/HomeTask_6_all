package Task2;

class Data {
    private double rate = 0;
    private double initialCurrency = 0;
    private double finalCurrency = 0;

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setInitialCurrency(double initialCurrency) {
        this.initialCurrency = initialCurrency;
    }

    public double getFinalCurrency() {
        return finalCurrency = rate * initialCurrency;
    }
}
