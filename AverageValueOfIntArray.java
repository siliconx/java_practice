/**
 * Created by island on 17-3-29.
 */
import java.util.Scanner;

public class AverageValueOfIntArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i=0;i<n;i++) {
            sum += in.nextInt();
        }
        in.close();
        System.out.println(sum / n);
    }
}
