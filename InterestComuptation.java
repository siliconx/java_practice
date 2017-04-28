/**
 * Created by island on 17-2-27.
 */
import java.util.Scanner;

public class InterestComuptation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double money = in.nextDouble();
        double rate = in.nextDouble() * 0.01;
        double sum = money + money * rate * 0.8;
        System.out.printf("%.2f", sum);
    }
}
