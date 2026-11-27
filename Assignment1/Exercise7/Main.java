import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roleType = sc.nextInt();
        int requiredLevel = sc.nextInt();

        AccessControl access;
        if (roleType == 1) {
            access = new Developer();
        } else if (roleType == 2) {
            access = new Manager();
        } else {
            access = new Administrator();
        }

        System.out.println("Role: " + access.getRole());
        System.out.println("Access Level: " + access.getAccessLevel());
        System.out.println("Can Access: " + access.canAccess(requiredLevel));
        sc.close();
    }
}
