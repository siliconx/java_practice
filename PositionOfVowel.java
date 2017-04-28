/**
 * Created by island on 17-3-29.
 */
import java.util.Scanner;

public class PositionOfVowel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        String vowel = "aeiou";
        for (int i=0;i<str.length();i++) {
            if (vowel.contains(str.charAt(i) + "")) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(0);
    }
}
