public class SalesEmployee extends Employee {
    private double salesAmount;

    public SalesEmployee(String employeeName, double salesAmount) {
        super(employeeName);
        this.salesAmount = salesAmount;
    }

    @Override
    public double calculateBonus() {
        return salesAmount * 3 / 100;
    }

    @Override
    public double calculateBonus(double amount) {
        return amount * 3 / 100;
    }

    public double getTotalEarnings() {
        return salesAmount + calculateBonus();
    }
}
