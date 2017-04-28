/**
 * Created by island on 17-2-27.
 */
import java.util.Scanner;

public class SelectionSort {
    static int[] array;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        array = new int[n];
        for (int i=0;i<array.length;i++) {
            array[i] = in.nextInt();
        }
        in.close();
        sort();
//        for (int e : array) {
//            System.out.printf("%d ", e);
//        }
    }

    public static void sort() {
        for (int i=0;i<array.length;i++) {
            int min = array[i];
            int position = i;
            for (int j=i;j<array.length;j++) {
                if (min > array[j]) {
                    min = array[j];
                    position = j;
                }
            }
            swap(i, position);
        }
    }

    public static void sort(int i) {
        if (i <= 1) {
            return;
        }

    }

    public static void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        output(a, b);
    }

    public static void output(int a, int b) {
        System.out.printf("swap(a[%d], a[%d]):", a, b);
        for (int e : array) {
            System.out.printf("%d ", e);
        }
        System.out.println();
    }
}
