package lanqiao;
import java.util.Scanner;

public class SimpleFind {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = input.nextInt();
        }
        int target = input.nextInt();
        for (int i = 0; i < n; i++) {
            if (target == list[i]) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
