public class GeneralPhysician extends Doctor {
    public GeneralPhysician() {
        super(500.0);
    }

    @Override
    public String getDoctorType() {
        return "General Physician";
    }
}
