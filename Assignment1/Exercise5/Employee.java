public class Employee {
    protected String employeeName;

    public Employee(String employeeName) {
        this.employeeName = employeeName;
    }

    public double calculateBonus() {
        return 0.0;
    }

    public double calculateBonus(double amount) {
        return 0.0;
    }

    public String getEmployeeName() {
        return employeeName;
    }
}
