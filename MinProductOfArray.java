/**
 * Created by island on 17-3-27.
 */
import java.util.Arrays;
import java.util.Scanner;

public class MinProductOfArray {
    static Scanner in;
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int T = in.nextInt();
        int[] result = new int[T];
        for (int i=0;i<T;i++) {
            result[i] = getResult();
        }
        in.close();

        for (int e : result) {
            System.out.println(e);
        }
    }

    static int getResult() {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int result = 0;
        for (int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }
        for (int i=0;i<n;i++) {
            b[i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i=0;i<n;i++) {
            result += a[i] * b[n - i - 1];
        }
        return result;
    }
}
