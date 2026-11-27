public class DataScienceCourse extends Course {
    public DataScienceCourse(double courseFee) {
        super(courseFee);
    }

    public double calculateDiscount() {
        return courseFee * 15 / 100;
    }

    public String getCourseType() {
        return "Data Science";
    }
}
