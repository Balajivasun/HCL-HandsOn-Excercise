import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paymentType = sc.nextInt();
        double paymentAmount = sc.nextDouble();

        Payment payment;
        if (paymentType == 1) {
            payment = new CreditCardPayment();
        } else if (paymentType == 2) {
            payment = new UpiPayment();
        } else {
            payment = new WalletPayment();
        }

        double fee = payment.calculateFee(paymentAmount);
        double finalAmount = paymentAmount + fee;

        System.out.printf("Payment Amount: %.2f%n", paymentAmount);
        System.out.printf("Transaction Fee: %.2f%n", fee);
        System.out.printf("Final Amount: %.2f%n", finalAmount);
        sc.close();
    }
}
