public class EmergencyDoctor extends Doctor {
    public EmergencyDoctor() {
        super(1500.0);
    }

    @Override
    public String getDoctorType() {
        return "Emergency Doctor";
    }

    @Override
    public double calculateTotalBill(double testCharges) {
        return consultationCharge + testCharges;
    }
}
