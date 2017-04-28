/**
 * Created by island on 17-3-24.
 */
import java.util.Scanner;

public class MultiplicationOfMartrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ai = in.nextInt();
        int aj = in.nextInt();
        long[][] aMartrix = new long[ai][aj];
        for (int i=0;i<ai;i++) {
            for (int j=0;j<aj;j++) {
                aMartrix[i][j] = in.nextInt();
            }
        }

        int bi = in.nextInt();
        int bj = in.nextInt();
        long[][] bMartrix = new long[bi][bj];
        for (int i=0;i<bi;i++) {
            for (int j=0;j<bj;j++) {
                bMartrix[i][j] = in.nextInt();
            }
        }
        in.close();

        // Multiplication
        long[][] product = new long[ai][bj];
        for (int i=0;i<ai;i++) {
            for (int j=0;j<bj;j++) {
                long sum = 0;
                for (int k=0;k<aj;k++) {
                    if (aMartrix[i][k] == 0 || bMartrix[k][j] == 0) {
                        // pass
                    } else {
                        sum += aMartrix[i][k] * bMartrix[k][j];
                    }
                }
                product[i][j] = sum;
            }
        }

        for (int i=0;i<ai;i++) {
            for (int j=0;j<bj;j++) {
                System.out.printf("%d ", product[i][j]);
            }
            System.out.println();
        }
    }
}
