package lanqiao;
import java.util.Scanner;

public class ComplexNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operator = input.next().charAt(0);
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double a2 = input.nextDouble();
        double b2 = input.nextDouble();
        double a = 0, b = 0;
        switch (operator) {
            case '+':
                a = a1 + a2;
                b = b1 + b2;
                break;
            case '-':
                a = a1 - a2;
                b = b1 - b2;
                break;
            case '*':
                a = a1 * a2 - b1 * b2;
                b = a1 * b2 + a2 * b1;
                break;
            case '/':
                double denominator = Math.pow(a2, 2) + Math.pow(b2, 2);
                a = (a1 * a2 + b1 * b2) / denominator;
                b = (b1 * a2 - a1 * b2) / denominator;
                break;
            default:
                break;
        }
        System.out.printf("%.2f+%.2fi", a, b);
    }
}
