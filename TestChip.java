package lanqiao;
import java.util.Scanner;

public class TestChip {
    static int n;
    static int[][] matrix;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        for (int i = 0; i < n; i++) {
            if (!broken(i)) {
                System.out.print(i + 1 + " ");
            }
        }
    }
   

    private static boolean broken(int i) {
        int count = 0;
        for (int j = 0; j < n; j++) {
            if (matrix[j][i] == 1) {
                count++;
            }
        }
        return !(count >= ((n + 1) / 2));
    }
}
