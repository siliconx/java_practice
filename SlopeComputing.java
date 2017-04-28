/**
 * Created by island on 17-3-29.
 */
import java.util.Scanner;

public class SlopeComputing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        in.close();
        if (x1 == x2) {
            System.out.println("INF");
        } else {
            System.out.println((y1 - y2) / (x1 - x2));
        }
    }
}
