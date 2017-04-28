/**
 * Created by island on 17-4-3.
 */
import java.util.Scanner;

public class PutTiles {
    static int n;
    static int times = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.close();
        put(0);
        System.out.println(times);
    }

    static void put(int from) {
        if (from == n) {
            times++;
            return;
        }
        if (from > n) {
            return;
        }
        if (from + 1 <= n) {
            put(from + 1);
        }
        if (from + 2 <= n) {
            put(from + 2);
        }
    }
}
