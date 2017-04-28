/**
 * Created by island on 17-3-28.
 */
import java.util.Arrays;
import java.util.Scanner;

public class MiWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int len = 2 * n - 1;
        char[][] matrix = new char[len][len];
        for (char[] row : matrix) {
            Arrays.fill(row, '.');
        }
        in.close();
        char center = (char) ('A' + n - 1);
        matrix[len / 2][len / 2] = center;

        for (int i=1;i<n;i++) {
            char temp = (char) (center - i);
            matrix[n - i - 1][n - 1] = matrix[n + i - 1][n - 1] = temp;  // vertical
            matrix[n - 1][n - i - 1] = matrix[n - 1][n + i - 1] = temp;  // horizontal
            matrix[n - i - 1][n - i - 1] = matrix[n + i - 1][n + i - 1] = temp;
            matrix[n + i - 1][n - i - 1] = matrix[n - i - 1][n + i - 1] = temp;
        }

        for (int i=0;i<2 * n - 1;i++) {
            for (int j=0;j<2 * n - 1;j++) {
                System.out.printf("%c", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
