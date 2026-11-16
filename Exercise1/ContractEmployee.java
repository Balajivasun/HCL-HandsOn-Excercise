public class ContractEmployee extends Employee {
    private int workingDays;
    private double dailyRate;

    public ContractEmployee(int employeeId, String employeeName, int workingDays, double dailyRate) {
        super(employeeId, employeeName);
        this.workingDays = workingDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateSalary() {
        return workingDays * dailyRate;
    }
}
