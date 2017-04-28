package lanqiao;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        if (h <= 0) {
            return;
        }
        
        System.out.println(1);  // first line

        long s;
        for (int i = 2; i <= h;i++) {
            s = 1;
            System.out.print("1 ");
            for (int j = 1; j <= i - 2; j++) {
                s = (i - j) * s / j;
                System.out.print(s + " ");
            }
            System.out.println("1");
        }
    }
}
