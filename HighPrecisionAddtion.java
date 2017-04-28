import java.util.Scanner;

public class HighPrecisionAddtion {
    public static void main(String[] args) {
        int[] A = new int[100];
        int[] B = new int[100];
        int[] C = new int[101];
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        input.close();

        for (int i = a.length() - 1, j = 0; i >= 0; i--, j++) {
            String bit = a.charAt(i) + "";
            A[j] = Integer.parseInt(bit);
        }

        for (int i = b.length() - 1, j = 0; i >= 0; i--, j++) {
            String bit = b.charAt(i) + "";
            B[j] = Integer.parseInt(bit);
        }

        int carryBit = 0;
        int i;
        for (i = 0; i < 100; i++) {
            int sum = A[i] + B[i] + carryBit;
            C[i] = sum % 10;
            carryBit = sum / 10;
        }
        if (carryBit != 0) {
            C[99] = carryBit % 10;
            C[100] = carryBit / 10;
        }

        boolean flag = false;
        if (C[100] != 0) {
            flag = true;
        }
        for (i = 100; i >= 0; i--) {
            if (flag) {
                System.out.print(C[i]);
            } else if (i > 0 && C[i - 1] != 0) {
                flag = true;
            }
        }
    }
}
