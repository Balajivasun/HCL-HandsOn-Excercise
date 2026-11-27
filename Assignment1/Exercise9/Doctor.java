public abstract class Doctor {
    protected double consultationCharge;

    public Doctor(double consultationCharge) {
        this.consultationCharge = consultationCharge;
    }

    public abstract String getDoctorType();

    public double calculateTotalBill(double testCharges) {
        return consultationCharge;
    }

    public double getConsultationCharge() {
        return consultationCharge;
    }
}
