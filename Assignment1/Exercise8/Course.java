public abstract class Course {
    protected double courseFee;

    public Course(double courseFee) {
        this.courseFee = courseFee;
    }

    public abstract double calculateDiscount();
    public abstract String getCourseType();

    public double calculateFinalFee() {
        return courseFee - calculateDiscount();
    }
}
