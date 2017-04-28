/**
 * Created by island on 17-3-23.
 */
import java.util.Scanner;

public class NQueen {
    static Scanner in;
    static int n;
    static int sum;
    static int[][] martrix;  // 0表示不能放, 1表示可以放
    public static void main(String[] args) {
        in = new Scanner(System.in);
        n = 8;// in.nextInt();
        martrix = new int[n][n];
        init();
        solve(1);
        System.out.println(sum);
        in.close();
    }

    static void init() {
        sum = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                martrix[i][j] = 1;  // in.nextInt();;
            }
        }
    }

    // 在第row - 1行放置皇后后，测试第row行的各列测试是否可行
    static void solve(int row) {
        for (int i=0;i<n;i++) {
            martrix[row - 1][i] = 0;
            if (check(row, i + 1)) {
                if (row == 8) {
                    sum++;
                } else {
                    solve(row + 1);
                }
            }
            // 取出该列的皇后，进行回溯，在其他列放置皇后
            martrix[row - 1][i] = 1;
        }
    }

    // 检查该位置是否可以放置皇后
    static boolean check(int row, int column) {
        if (row == 1) {
            return true;
        }
        int i, j;
        // 一行只能有一个
        for (j=0;j<n;j++) {
            if (martrix[row][j] == 0) {
                return false;
            }
        }

        // 一列只能有一个
        for (i=0;i<n;i++) {
            if (martrix[i][column] == 0) {
                return false;
            }
        }

        // 左上至右下只能有一个

        // 左上
        i = row;
        j = column;
        while (i >= 0 && j >= 0) {
            if (martrix[i][j] == 0) {
                return false;
            }
            i--;
            j--;
        }

        // 右下
        i = row;
        j = column;
        while (i < n && j < n) {
            if (martrix[i][j] == 0) {
                return false;
            }
            i++;
            j++;
        }

        // 左下至右上只能有一个

        // 左下
        i = row;
        j = column;
        while (i >= 0 && j < n) {
            if (martrix[i][j] == 0) {
                return false;
            }
            i--;
            j++;
        }

        // 右上
        i = row;
        j = column;
        while (i < n && j >= 0) {
            if (martrix[i][j] == 0) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
