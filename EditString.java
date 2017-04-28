/**
 * Created by island on 17-3-30.
 */
import java.util.Scanner;

public class EditString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder(in.nextLine());
        char command = in.next().charAt(0);
        char target = in.next().charAt(0);
        int i;
        boolean found = false;
        switch (command) {
            case 'D': {
                for (i=0;i<str.length();i++) {
                    if (str.charAt(i) == target) {
                        str.delete(i, i + 1);
                        found = true;
                        break;
                    }
                }
                break;
            }
            case 'I': {
                char insert = in.next().charAt(0);
                int index = 0;
                for (i=0;i<str.length();i++) {
                    if (str.charAt(i) == target) {
                        index = i;
                        found = true;
                    }
                }
                if (found) {
                    str.insert(index, insert);
                }
                break;
            }
            case 'R': {
                char replace = in.next().charAt(0);
                for (i=0;i<str.length();i++) {
                    if (str.charAt(i) == target) {
                        found = true;
                        str.replace(i, i + 1, replace + "");
                    }
                }
                break;
            }
        }
        in.close();
        if (found) {
            System.out.println(str.toString());
        } else {
            System.out.println("Not Found!");
        }
    }
}
