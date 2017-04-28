/**
 * Created by island on 17-3-19.
 */
import java.util.Scanner;

public class S01String {

    static String s01 = "0";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        for (int i=0;i<n;i++) {
            change();
        }
        System.out.println(s01);
    }

    static void change() {
        StringBuilder temp = new StringBuilder();
        for (int i=0;i<s01.length();i++) {
            if (s01.charAt(i) == '0') {
                temp.append("1");
            } else {
                temp.append("01");
            }
        }
        s01 = temp.toString();
    }
}
