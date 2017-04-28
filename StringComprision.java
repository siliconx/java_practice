package lanqiao;
import java.util.Scanner;

public class StringComprision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        if (a.length() != b.length()) {
            System.out.println(1);
        } else if (a.equals(b)) {
            System.out.println(2);
        } else if (a.equalsIgnoreCase(b)) {
            System.out.println(3);
        } else if (! a.equalsIgnoreCase(b)) {
            System.out.println(4);
        }
    }
}
