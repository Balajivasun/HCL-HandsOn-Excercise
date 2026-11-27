import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountType = sc.nextInt();
        int accountNumber = sc.nextInt();
        double balance = sc.nextDouble();
        double value = sc.nextDouble();

        BankAccount account;
        if (accountType == 1) {
            account = new SavingsAccount(accountNumber, balance, value);
        } else {
            account = new CurrentAccount(accountNumber, balance, value);
        }

        System.out.printf("%.2f%n", account.calculateFinalBalance());
        sc.close();
    }
}
