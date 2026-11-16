public class CloudCourse extends Course {
    public CloudCourse(double courseFee) {
        super(courseFee);
    }

    public double calculateDiscount() {
        return courseFee * 5 / 100;
    }

    public String getCourseType() {
        return "Cloud";
    }
}
