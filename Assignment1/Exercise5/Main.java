import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int employeeType = sc.nextInt();
        String employeeName = sc.next();

        Employee employee;
        double totalEarnings;

        if (employeeType == 1) {
            double basicSalary = sc.nextDouble();
            int rating = sc.nextInt();
            TechnicalEmployee technical = new TechnicalEmployee(employeeName, basicSalary, rating);
            employee = technical;
            totalEarnings = basicSalary + employee.calculateBonus();
        } else {
            double salesAmount = sc.nextDouble();
            SalesEmployee sales = new SalesEmployee(employeeName, salesAmount);
            employee = sales;
            totalEarnings = salesAmount + employee.calculateBonus();
        }

        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.printf("Bonus: %.2f%n", employee.calculateBonus());
        System.out.printf("Total Earnings: %.2f%n", totalEarnings);
        sc.close();
    }
}
