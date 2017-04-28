/**
 * Created by island on 17-3-27.
 */
import java.util.Scanner;

public class HightestFrequencyNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 0) {
            return;
        }
        int[] nums = new int[n];
        for (int i=0;i<n;i++) {
            nums[i] = in.nextInt();
        }
        in.close();
//        for (int e : nums) {
//            System.out.printf("%d ", e);
//        }
//        System.out.println();
        int count = 1, temp = 1;
        int num = nums[0];
        for (int i=1;i<nums.length;i++) {
            if (nums[i] == nums[i - 1]) {
                temp++;
                if (temp > count) {
                    count = temp;
                    num = nums[i];
//                    System.out.printf("i: %d, temp: %d, count: %d, num: %d%n", i, temp, count, num);
                }
            } else {
                temp = 1;
            }
        }
        System.out.println(num);
    }
}
