/**
 * Created by island on 17-3-22.
 */
import java.util.Scanner;

public class OneTwoTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Dot[] dots = new Dot[3];
        double xSum = 0, ySum = 0;
        for (int i=0;i<3;i++) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            xSum += x;
            ySum += y;
            dots[i] = new Dot(x, y);
        }
        in.close();

        double a = getDistance(dots[0], dots[1]);
        double b = getDistance(dots[1], dots[2]);
        double c = getDistance(dots[0], dots[2]);

        // 周长
        System.out.printf("%.2f%n", a + b + c);

        // 面积, 海伦公式
        double L = (a + b + c) / 2;
        double s = Math.sqrt(L * (L - a) * (L - b) * (L -c));
        System.out.printf("%.2f%n", s);

        // 外心
        Circumcenter(dots);


        // 重心
        System.out.printf("%.2f %.2f%n", xSum / 3, ySum / 3);
    }

    static double getDistance(Dot a, Dot b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    static void Circumcenter(Dot[] dots){
        //外接圆,圆心到三个顶点的距离相等列方程,可解出(x,y)
        double denominator,delta_x,delta_y;
        denominator = 2*(dots[1].x - dots[0].x)*(dots[2].y - dots[0].y) - 2*(dots[1].y - dots[0].y)*(dots[2].x - dots[0].x);
        delta_x = (dots[2].y - dots[0].y)*(dots[1].x*dots[1].x + dots[1].y*dots[1].y - dots[0].x*dots[0].x - dots[0].y*dots[0].y)
                -(dots[1].y - dots[0].y)*(dots[2].x*dots[2].x + dots[2].y*dots[2].y - dots[0].x*dots[0].x - dots[0].y*dots[0].y);
        delta_y = (dots[1].x - dots[0].x)*(dots[2].x*dots[2].x + dots[2].y*dots[2].y - dots[0].x*dots[0].x - dots[0].y*dots[0].y)
                -(dots[2].x - dots[0].x)*(dots[1].x*dots[1].x + dots[1].y*dots[1].y - dots[0].x*dots[0].x - dots[0].y*dots[0].y);
        System.out.printf("%.2f %.2f%n",delta_x/denominator,delta_y/denominator);
    }
}

class Dot {
    double x, y;
    public Dot(double x, double y) {
        this.x = x;
        this.y = y;
    }
}