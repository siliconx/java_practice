package lanqiao;
import java.util.Scanner;

public class Binomial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(binomial(n, m));
    }
    
    private static int binomial(int k, int n) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k > n) {
            return -1;
        }
        int result = binomial(k, n - 1) + binomial(k - 1, n - 1);
        return result;
    }
}
