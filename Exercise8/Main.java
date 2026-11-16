import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int courseType = sc.nextInt();
        double courseFee = sc.nextDouble();

        Course course;
        if (courseType == 1) {
            course = new ProgrammingCourse(courseFee);
        } else if (courseType == 2) {
            course = new DataScienceCourse(courseFee);
        } else {
            course = new CloudCourse(courseFee);
        }

        System.out.println("Course Type: " + course.getCourseType());
        System.out.printf("Discount: %.2f%n", course.calculateDiscount());
        System.out.printf("Final Fee: %.2f%n", course.calculateFinalFee());
        sc.close();
    }
}
