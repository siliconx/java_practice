package lanqiao;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        int average;
        for (int i = 0; i < n; i++) {
            sum += input.nextInt();
        }
        average = sum / n;
        System.out.printf("%d %d\n", sum, average);
    }
}
