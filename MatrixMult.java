package lanqiao;
import java.util.Scanner;

public class MatrixMult {
    static int m, a;
    static int[][] matrixRaw, matrixResult;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        a = input.nextInt();
        matrixRaw = new int[m][m];
        matrixResult = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int element = input.nextInt();
                matrixRaw[i][j] = element;
                matrixResult[i][j] = element;
            }
        }
        input.close();
        
        if (a == 0) {
            // 一个矩阵的0次方为单位矩阵
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (i == j) {
                        matrixResult[i][j] = 1;
                    } else {
                        matrixResult[i][j] = 0;
                    }
                }
            }
        } else {
            for (int i = 0; i < a - 1; i++) {
                mutiple();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    private static void mutiple() {
        int[][] temp = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for (int a = 0; a < m; a++) {
                    // 行乘列
                    sum += (matrixResult[i][a] * matrixRaw[a][j]);
                }
                temp[i][j] = sum;
            }
        }
        matrixResult = temp;
    }
}
