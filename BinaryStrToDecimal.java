/**
 * Created by island on 17-3-28.
 */
import java.util.Scanner;

public class BinaryStrToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String binary = in.next();
        in.close();
        System.out.println(Integer.parseInt(binary, 2));
    }
}
