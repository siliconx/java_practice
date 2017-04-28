/**
 * Created by island on 17-3-25.
 */
public class EightQueenProblem {
    static int[][] m;
    static int sum;
    static int n;
    public static void main(String[] args) {
        m = new int[8][8];
        solve(1);
        System.out.println(sum);
    }


    static boolean check(int row, int column) {
        if (row == 1) {
            return true;
        }
        int i, j;
        for (i=0;i<=row-2;i++) {
            if (m[i][column-1] == 1) {
                return false;
            }
        }

        i = row - 2;
        j = i - (row - column);
        while (i >= 0 && j >= 0) {
            if (m[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        i = row-2;
        j = row+column-i-2;
        while(i >= 0 && j <= 7) {
            if(m[i][j]==1){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    static void solve(int row) {
        int j;
        //考虑在第row行的各列放置皇后
        for (j=0;j<8;j++) {
            //在其中一列放置皇后
            m[row-1][j] = 1;
            //检查在该列放置皇后是否可行
            if (check(row,j+1)) {
                //若该列可放置皇后，且该列为最后一列，则找到一可行解，输出
                if(row==8) {
                    sum++;
                    output();
                    System.out.println();
                } else {  //若该列可放置皇后，则向下一行，继续搜索、求解
                    solve(row + 1);
                }
            }
            //取出该列的皇后，进行回溯，在其他列放置皇后
            m[row-1][j] = 0;
        }
    }

    static void output() {
        for (int i=0;i<8;i++) {
            for (int j=0;j<8;j++) {
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
    }
}
