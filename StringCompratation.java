/**
 * Created by island on 17-3-30.
 */
import java.util.Scanner;

public class StringCompratation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        int minLen = a.length() < b.length() ? a.length() : b.length();
        int i;
        for (i=0;i<minLen;i++) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);
            if (aChar != bChar) {
                System.out.println(aChar - bChar);
                return;
            }
        }
        if (a.length() > b.length()) {
            System.out.println((int) a.charAt(i));
        } else if (a.length() < b.length()) {
            System.out.println((int) b.charAt(i));
        } else {
            System.out.println(0);
        }
    }
}
