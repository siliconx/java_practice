/**
 * Created by island on 17-3-29.
 */
import java.util.Scanner;

public class FilterNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int[] ints = new int[n];
        for (int i=0;i<n;i++) {
            ints[i] = i + 1;
        }
        int step  = 0;
        int size = n;
        for (int i=0;;i++) {
            if (i == n) {
                i = 0;
            }
            if (ints[i] != 0) {
                step++;
            } else {
                continue;
            }
            if (step % 3 == 0) {
                ints[i] = 0;
                size--;
                step = 0;
            }
            if (size <= 1) {
                break;
            }
        }

        for (int e : ints) {
            if (e != 0) {
                System.out.println(e);
                return;
            }
        }
    }
}
