/**
 * Created by island on 17-3-17.
 */
import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-i-1;j++) {
                System.out.print(' ');
            }
            for (int k=0;k < 2 * i + 1;k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
