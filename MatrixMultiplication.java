/**
 * Created by island on 17-3-6.
 */
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, s, n;
        m = in.nextInt();
        s = in.nextInt();
        n = in.nextInt();
        int[][] a = new int[m][s];
        int[][] b = new int[s][n];
        int[][] result = new int[m][n];
        // enter matrix a
        for (int i=0;i<m;i++) {
            for (int j=0;j<s;j++) {
                a[i][j] = in.nextInt();
            }
        }

        // enter matrix b
        for (int i=0;i<s;i++) {
            for (int j=0;j<n;j++) {
                b[i][j] = in.nextInt();
            }
        }
        in.close();

        // multiplication
        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                int elem = 0;
                for (int k=0;k<s;k++) {
                    elem += a[i][k] * b[k][j];
                }
                result[i][j] = elem;
            }
        }

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                System.out.printf("%d ", result[i][j]);
            }
            System.out.println();
        }

    }
}
