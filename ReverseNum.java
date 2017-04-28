/**
 * Created by island on 17-3-28.
 */
import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int sum = reversNumber(a) + reversNumber(b);
        System.out.println(reversNumber(sum));
    }

    static int reversNumber(int n) {
        String num = new StringBuilder(n + "").reverse().toString();
        return Integer.parseInt(num);
    }
}
