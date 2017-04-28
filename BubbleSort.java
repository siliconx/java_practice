/**
 * Created by island on 17-2-27.
 */
import java.util.Scanner;

public class BubbleSort {
    static int[] array;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        array = new int[10];
        for (int i=0;i<array.length;i++) {
            array[i] = in.nextInt();
        }
        in.close();
        sort();
        for (int e : array) {
            System.out.printf("%d ", e);
        }
    }

    public static void sort() {
        for (int i=0;i<array.length-1;i++) {
            for (int j=0;j<array.length-1;j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
