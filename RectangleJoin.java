/**
 * Created by island on 17-3-13.
 */
import java.util.Arrays;
import java.util.Scanner;

public class RectangleJoin {
    static double x1, y1, x2, y2, x3, y3, x4, y4;
    static double area = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        x1 = in.nextDouble();
        y1 = in.nextDouble();
        x2 = in.nextDouble();
        y2 = in.nextDouble();
        x3 = in.nextDouble();
        y3 = in.nextDouble();
        x4 = in.nextDouble();
        y4 = in.nextDouble();
        replace();
        if (!isJoin()) {
            area = 0;
        } else {
            double[] horizontal = {x1, x2, x3, x4};
            double[] vertical = {y1, y2, y3, y4};
            Arrays.sort(horizontal);
            Arrays.sort(vertical);
            double width = horizontal[2] - horizontal[1];
            double height = vertical[2] - vertical[1];
            area = width * height;
        }
        System.out.printf("%.2f", area);
    }

    public static void replace() {  // 将坐标统一成从左下角指向右上角
        if (x1 > x2) {
            double temp = x1;
            x1 = x2;
            x2 = temp;
        }
        if (y1 > y2) {
            double temp = y1;
            y1 = y2;
            y2 = temp;
        }
        if (x3 > x4) {
            double temp = x3;
            x3 = x4;
            x4 = temp;
        }
        if (y3 > y4) {
            double temp = y3;
            y3 = y4;
            y4 = temp;
        }
    }

    public static boolean isJoin() {
        if (x3 >= x2 || x4 <= x1) {
            return false;
        }
        if (y1 >= y4 || y3 >= y2) {
            return false;
        }
        return true;
    }
}
