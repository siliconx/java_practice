/**
 * Created by island on 17-3-27.
 */
import java.util.Scanner;

public class TorrysConfusion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        in.close();
        long result = 1;
        long count = 0;
        long i = 2;
        while (count < n) {
            if (isPrime(i)) {
                count++;
                result = (result * i) % 50000;
            }
            i++;
        }
        System.out.println(result);
    }

    static boolean isPrime(long n) {
        for (long i=2;i<n;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
}
