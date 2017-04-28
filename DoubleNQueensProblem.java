/**
 * Created by island on 17-4-7.
 */
import java.util.Scanner;

public class DoubleNQueensProblem {
    // 白皇后 2, 黑皇后 3
    static int white = 2;
    static int black = 3;
    static int sum = 0;
    static int n;
    static int[][] matrix;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        matrix = new int[n][n];
        // 输入棋盘
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        in.close();
        // 先放置白皇后
        placeWihte(0);
        System.out.println(sum);
    }

    static boolean canPlace(int chess, int row, int col) {
        if (matrix[row][col] != 1) {  // 该位置值不为1, 不可放置
            return false;
        }
        // 以下部分检查各个方向是否有相同的皇后
        // 上下
        int i, j;
        for (i=0;i<n;i++) {
            if (matrix[i][col] == chess) {
                return false;
            }
        }

        // 左右
        for (j=0;j<n;j++) {
            if (matrix[row][j] == chess) {
                return false;
            }
        }

        // 左上
        for (i=row, j=col;i>=0 && j>=0;i--, j--) {
            if (matrix[i][j] == chess) {
                return false;
            }
        }

        // 右上
        for (i=row, j=col;i<n && j>=0; i++, j--) {
            if (matrix[i][j] == chess) {
                return false;
            }
        }

        // 左下
        for (i=row, j=col;i>=0 && j<n;i--, j++) {
            if (matrix[i][j] == chess) {
                return false;
            }
        }

        // 右下
        for (i=row, j=col;i<n && j<n;i++, j++) {
            if (matrix[i][j] == chess) {
                return false;
            }
        }
        return true;
    }

    static void placeWihte(int row) {
        // 摆放白皇后
        for (int j=0;j<n;j++) {
            if (canPlace(white, row, j)) {
                matrix[row][j] = white;
                if (row == n - 1) {
                    // 白皇后已摆放好
                    // 开始摆放黑皇后
                    placeBlack(0);
                } else {
                    placeWihte(row + 1);
                }
                // 回溯，取回该列的皇后，向下一列进行搜索求解
                matrix[row][j] = 1;
            }
        }
    }

    static void placeBlack(int row) {
        // 摆放黑皇后
        for (int j=0;j<n;j++) {
            if (canPlace(black, row, j)) {
                matrix[row][j] = black;
                if (row == n - 1) {
                    // 黑皇后摆放好
                    // 解加一
                    sum++;
                } else {
                    placeBlack(row + 1);
                }
                // 回溯，取回该列的皇后，向下一列进行搜索求解
                matrix[row][j] = 1;
            }
        }
    }
}
