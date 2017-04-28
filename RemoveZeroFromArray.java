/**
 * Created by island on 17-3-19.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveZeroFromArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> ints = new ArrayList<>();
        for (int i=0;i<n;i++) {
            ints.add(in.nextInt());
        }
        in.close();
        while (ints.contains(0)) {
            for (int i=0;i<ints.size();i++) {
                if (ints.get(i) == 0) {
                    ints.remove(i);
                    break;
                }
            }
        }

        System.out.println(ints.size());
        for (int e : ints) {
            System.out.printf("%d ", e);
        }
    }
}
