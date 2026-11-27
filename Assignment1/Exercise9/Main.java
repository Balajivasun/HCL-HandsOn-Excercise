import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int doctorType = sc.nextInt();
        double testCharges = sc.nextDouble();

        Doctor doctor;
        if (doctorType == 1) {
            doctor = new GeneralPhysician();
        } else if (doctorType == 2) {
            doctor = new Specialist();
        } else {
            doctor = new EmergencyDoctor();
        }

        System.out.println("Doctor Type: " + doctor.getDoctorType());
        System.out.printf("Consultation Charge: %.2f%n", doctor.getConsultationCharge());
        System.out.printf("Test Charges: %.2f%n", testCharges);
        System.out.printf("Total Bill: %.2f%n", doctor.calculateTotalBill(testCharges));
        sc.close();
    }
}
