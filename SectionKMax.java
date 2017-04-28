package lanqiao;
import java.util.Arrays;
import java.util.Scanner;

public class SectionKMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int l = input.nextInt();
            int r = input.nextInt();
            int k = input.nextInt();
            int[] temp = Arrays.copyOfRange(seq, l - 1, r);
            Arrays.sort(temp);
            result[i] = temp[temp.length - k];
        }
        
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
            System.out.println("test");
        }
    }
}
