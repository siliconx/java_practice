/**
 * Created by island on 17-3-21.
 */
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double time = in.nextDouble();
        double salaryPerHour = in.nextDouble();
        in.close();
        double salary = 0;
        if (time <= 40) {
            salary = salaryPerHour * time;
        } else if (time > 40 && time <= 50) {
            salary = salaryPerHour * 40;
            salary += 1.5 * salaryPerHour * (time - 40);
        } else {
            salary = salaryPerHour * 40;
            salary += 1.5 * salaryPerHour * 10;
            salary += 2 * salaryPerHour * (time - 50);
        }
        System.out.printf("%.2f",salary);
    }
}
