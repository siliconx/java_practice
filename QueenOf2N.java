package lanqiao;
import java.util.Scanner;

public class QueenOf2N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] chessboard = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessboard[i][j] = input.nextInt();
            }
        }
        input.close();
        
    }
}
