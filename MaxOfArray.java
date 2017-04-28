/**
 * Created by island on 17-3-27.
 */
import java.util.Scanner;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        int max = nums[0];
        int index = 0;
        for (int i=0;i<n;i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.printf("%d %d%n", max, index);
    }
}
