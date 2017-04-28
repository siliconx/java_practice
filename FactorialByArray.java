package lanqiao;
import java.util.Scanner;

public class FactorialByArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        int[] array = new int[10000];
        array[0] = 1;
        int i, j;
        int count = 1;
        for (i = 1; i <= number; i++) {
            for (j = 0; j < array.length; j++) {
                array[j] = array[j] * i;
            }
            for (j = 0; j < array.length; j++) {
                if (array[j] > 9) {
                    array[j + 1] = array[j + 1] + array[j] / 10;
                    array[j] = array[j] % 10;
                }
                if (array[j] > 0) {
                    count = j + 1;
                }
            }
        }
        for (i = count - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
