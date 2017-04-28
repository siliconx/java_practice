/**
 * Created by island on 17-4-6.
 */
import java.util.Scanner;

public class PowerComputing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int m = in.nextInt();
        in.close();
        int reuslt = (int) Math.pow(a, 2) % m;
        System.out.println(reuslt);
    }
}
