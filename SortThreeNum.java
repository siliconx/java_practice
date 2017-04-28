/**
 * Created by island on 17-3-24.
 */
import java.util.Arrays;
import java.util.Scanner;

public class SortThreeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        for (int i=0;i<array.length;i++) {
            array[i] = in.nextInt() * -1;
        }
        in.close();
        Arrays.sort(array);
        for (int e : array) {
            System.out.print((e * -1) + " ");
        }
    }
}
