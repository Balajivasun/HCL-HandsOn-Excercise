public class ProgrammingCourse extends Course {
    public ProgrammingCourse(double courseFee) {
        super(courseFee);
    }

    public double calculateDiscount() {
        return courseFee * 10 / 100;
    }

    public String getCourseType() {
        return "Programming";
    }
}
