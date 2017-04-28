/**
 * Created by island on 17-3-12.
 */
import java.util.Scanner;

public class ComplexOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        double e = 0, f = 0;
        char operator;
        a = in.nextInt();
        b = in.nextInt();
        operator = in.next().charAt(0);
        c = in.nextInt();
        d = in.nextInt();
        boolean can = true;

        switch (operator) {
            case '+': {
                e =  (a + c);
                f =  (b + d);
                break;
            }
            case '-': {
                e =  (a - c);
                f =  (b - d);
                break;
            }
            case '*': {
                e =  (a * c - b * d);
                f =  (a * d + b * c);
                break;
            }
            case '/': {
                double denominator =  (Math.pow(c, 2) + Math.pow(d, 2));
                if (Math.abs(denominator) < 0.0001) {
                    can = false;
                } else {
                    e =  ((a * c + b * d) / denominator);
                    f =  ((b * c - a * d) / denominator);
                }
                break;
            }
            default:
                break;
        }

        if (can) {
            double testA = Math.abs(e), testB = Math.abs(f);
            String formator;
            if ((testA - (int) testA) > 0 && testB - (int) testB > 0) {
                formator = "%.1f%+.1fi%n";
                System.out.printf(formator, e, f);
            } else if ((testA - (int) testA) > 0 ) {
                formator = "%.1f%+di%n";
                System.out.printf(formator, e, (int) f);
            } else if (testB - (int) testB > 0) {
                formator = "%d%+.1fi%n";
                System.out.printf(formator, (int) e, f);
            } else {
                System.out.printf("%d%+di%n", (int) e, (int) f);
            }
        } else {
            System.out.println("error");
        }
    }
}
