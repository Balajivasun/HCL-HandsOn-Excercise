public class Specialist extends Doctor {
    public Specialist() {
        super(1000.0);
    }

    @Override
    public String getDoctorType() {
        return "Specialist";
    }
}
