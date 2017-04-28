package lanqiao;
import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] triangle = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = input.nextInt();
            }
        }
        input.close();
        // calculate
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                triangle[i - 1][j] += Math.max(triangle[i][j], triangle[i][j + 1]); 
            }
        }
        System.out.println(triangle[0][0]);
    }
}
