/**
 * Created by island on 17-3-31.
 */
import java.util.Scanner;

public class UnfoldString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p1 = in.nextInt();
        int p2 = in.nextInt();
        int p3 = in.nextInt();
        String str = in.next();
        in.close();
        switch (p1) {
            case 1: {
                // 对于字母子串，填充小写字母
                break;
            }
            case 2: {
                // 对于字母子串，填充大写字母
                break;
            }
            case 3: {
                // 论是字母子串还是数字字串，都用与要填充的字母个数相同的星号“*”来填充
                break;
            }
        }
    }
}
