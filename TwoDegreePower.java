/**
 * Created by island on 17-3-26.
 */
import java.util.Scanner;

public class TwoDegreePower {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        String result = twoDegreePowerOfNum(n);
        while (!isPure(result)) {
            for (int i=0;i<result.length();i++) {
                char ch = result.charAt(i);
                if (! (ch == '2' || ch == '0' || ch == '(' || ch == ')' || ch == '+' || ch == ' ')) {
                    String num = ch + "";
                    int count = i;
                    while (Character.isDigit(result.charAt(count + 1))) {
                        num += result.charAt(count + 1);
                        count++;
                    }
                    result = result.substring(0, i) + twoDegreePowerOfNum(Integer.parseInt(num)) + result.substring(count + 1, result.length());
                    i = count;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    static String twoDegreePowerOfNum(int n) {
        String binary = Integer.toBinaryString(n);
        String temp = "";
        int len = binary.length();
        for (int i=0;i<len;i++) {
            if (binary.charAt(i) == '1') {
                if (len - i - 1 == 1) {
                    temp += "2+";
                } else {
                    temp += String.format("2(%d)+", len - i - 1);
                }
            }
        }
        return temp.substring(0, temp.length() - 1);
    }

    static boolean isPure(String string) {
        for (int i=0;i<string.length();i++) {
            char ch = string.charAt(i);
            if (! (ch == '2' || ch == '0' || ch == '(' || ch == ')' || ch == '+' || ch == ' ')) {
                return false;
            }
        }
        return true;
    }
}
