import java.util.Scanner;

public class ClipRun {
    static int step = 0;
    static int m, n;
    static int[][] matrix;
    static boolean[][] traversedElement;
    static int stepM = 1, stepN = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        m = input.nextInt();
        n = input.nextInt();
        step = m * n;
        matrix = new int[m][n];
        traversedElement = new boolean[m][n];
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        input.close();
        m = n = 0;
        for (int i = 0; i < step; i++) {
            System.out.print(matrix[m][n]);
            if (i < step - 1) {
                System.out.print(" ");
            } else {
                System.out.println();
            }
            traversedElement[m][n] = true;
            if (!hasNextStep()) {
                trunLeft();
            }
            m += stepM;
            n += stepN;
        }
    }

    private static void trunLeft() {
        if (stepM == 1 && stepN == 0) {
            stepM = 0;
            stepN = 1;
        } else if (stepM == 0 && stepN == 1) {
             stepM = -1;
             stepN = 0;
        } else if (stepM == -1 && stepN == 0) {
            stepM = 0;
            stepN = -1;
        } else if (stepM == 0 && stepN == -1) {
            stepM = 1;
            stepN = 0;
        }
    }

    private static boolean hasNextStep() {
        try {
            boolean temp = traversedElement[m + stepM][n + stepN];
            return !temp;
        } catch (IndexOutOfBoundsException e) {
            return false;
        }
    }
}
