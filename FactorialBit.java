/**
 * Created by island on 17-3-28.
 */
import java.util.Scanner;

public class FactorialBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int product = 1;
        in.close();
        for (int i=n;i>1;i--) {
            product *= i;
            while (product % 10 == 0) {
                product /= 10;
            }
            if (product / 100 > 0) {
                product %= 100;
            }
        }
        System.out.println(product % 10);
    }
}
