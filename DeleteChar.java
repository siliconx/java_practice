/**
 * Created by island on 17-3-28.
 */
import java.util.Scanner;

public class DeleteChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String next = in.nextLine();
        in.close();
        if (str.length() <= 0) {
            System.out.println();
            return;
        }
        if (next.length() <= 0) {
            System.out.println(str);
            return;
        }
        char target = next.charAt(0);
        StringBuilder stringBuilder = new StringBuilder(str);
        while (true) {
            int i;
            for (i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i) == target) {
                    stringBuilder.delete(i, i + 1);
                    break;
                }
            }
            if (i > stringBuilder.length() - 1) {
                break;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
