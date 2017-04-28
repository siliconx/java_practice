/**
 * Created by island on 17-3-15.
 */
import java.util.Scanner;

public class BigNumMutiple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        int len = a.length() > b.length() ? b.length() : a.length();
        int longer = a.length() > b.length() ? a.length() : b.length();
        int carrier = 0;
        String result = "";
        for (int i=0;i<len;i++) {
            int intA = Integer.parseInt(a.charAt(a.length() - 1 - i) + "");
            int intB = Integer.parseInt(b.charAt(b.length() - 1 - i) + "");
            int product = intA * intB + carrier;
            int left = product % 10;
            carrier = product / 10;
            result += left;
        }
//        if (carrier != 0){
//            if (len == longer) {
//                result += carrier;
//            } else if () {
//
//            }
//        }
        System.out.println(result);
    }
}
