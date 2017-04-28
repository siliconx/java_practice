package lanqiao;
import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = 0;
        int min = 0;
        long sum = 0;
        int in;
        for (int i = 0; i < n; i++) {
            in = input.nextInt();
            if (i == 0) {
                max = min = in;
            }

            if (in > max) {
                max = in;
            }
            if (in < min) {
                min = in;
            }
            sum += in;
        }
        System.out.printf("%d\n%d\n%d\n", max, min, sum);
    }
}
