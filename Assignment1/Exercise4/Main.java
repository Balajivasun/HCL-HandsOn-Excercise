import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehicleType = sc.nextInt();
        int rentalDays = sc.nextInt();

        Vehicle vehicle;
        if (vehicleType == 1) {
            vehicle = new Car();
        } else if (vehicleType == 2) {
            vehicle = new Bike();
        } else {
            vehicle = new Truck();
        }

        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.printf("Rental Charge: %.2f%n", vehicle.calculateRentalCharge(rentalDays));
        sc.close();
    }
}
