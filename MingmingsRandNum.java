/**
 * Created by island on 17-3-11.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MingmingsRandNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] randNums = new int[N];
        ArrayList<Integer> sortedNum = new ArrayList<>();
        int count = 1;
        for (int i=0;i<N;i++) {
            randNums[i] = in.nextInt();
        }
        in.close();

        Arrays.sort(randNums);

        int pre = randNums[0];
        sortedNum.add(pre);
        for (int i=1;i<N;i++) {
            if (pre != randNums[i]) {
                sortedNum.add(randNums[i]);
                count++;
            }
            pre = randNums[i];
        }

        System.out.println(count);
        for (int e : sortedNum) {
            System.out.printf("%d ", e);
        }
    }
}
