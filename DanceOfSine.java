/**
 * Created by island on 17-3-23.
 */
import java.util.Scanner;

public class DanceOfSine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
//        System.out.println(An(n));
        System.out.println(Sn(n));
    }

    static String An(int n) {
        String temp = "sin(" + n + ")";
        char signal;
        while (n > 1) {
            if ((n - 1) % 2 == 1) {
                signal = '-';
            } else {
                signal = '+';
            }
            temp = String.format("sin(%d%c%s)", n - 1, signal, temp);
            n--;
        }
        return temp;
    }

    static String Sn(int n) {
        String temp = An(1) + "+" + n;
        int i = 1;
        while (n > 1) {
            temp = String.format("(%s)%s+%d", temp, An(++i), --n);
        }
        return temp;

    }
}
