package Task1;

class Data {
    private double initialDebt = 700;
    private double monthlyPaymentBasic = 100;
    private double monthlyPaymentActual = 0;
    private double currentDebt = 700;

    Data(double _initialDebt, double _monthlyPaymentBasic) {
        initialDebt = _initialDebt;
        monthlyPaymentBasic = _monthlyPaymentBasic;
    }

    public double getInitialDebt() {
        return initialDebt;
    }

    public double getMonthlyPaymentBasic() {
        return monthlyPaymentBasic;
    }

    public void setMonthlyPaymentActual(double monthlyPaymentActual) {
        this.monthlyPaymentActual = monthlyPaymentActual;
    }

    public void setCurrentDebt(double currentDebt) {
        this.currentDebt = currentDebt;
    }

    public double getCurrentDebt() {
        return currentDebt;
    }
}