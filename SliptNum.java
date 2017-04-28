/**
 * Created by island on 17-3-27.
 */
import java.util.Scanner;

public class SliptNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        in.close();
        for (int i=0;i<num.length();i++) {
            System.out.print(num.charAt(i) + " ");
        }
    }
}
