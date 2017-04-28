package lanqiao;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] array = new Integer[3];
        for (int i = 0; i < 3; i++) {
            array[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(array, Collections.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
