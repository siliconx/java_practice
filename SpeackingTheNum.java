/**
 * Created by island on 17-3-13.
 */
import java.util.Scanner;

public class SpeackingTheNum {
    static String n;
    static String[] nums = {"ling ", "yi ", "er ", "san ", "si ", "wu ", "liu ", "qi ", "ba ", "jiu "};
    static String[] units = {"qian ", "bai ", "shi ", ""};
    static String[] order = {"", "wan ", "yi "};
    static char[] chars;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextLine();
        chars = n.toCharArray();
        int index = 0;
        int len = n.length();
        int rest = len % 4;
        String speaking = "";
        while (rest != 0 && rest < 4) {
            n = '0' + n;
            rest++;
            len++;
        }
        int whichOrder = (len - 1) / 4;
        while (whichOrder >= 0) {
            boolean orderInMid = false;
            if (whichOrder == 1 && len > 8) {
                orderInMid = true;
            }
            speaking += getSpeaking(n.substring(index, index + 4), orderInMid);
            speaking += order[whichOrder];
            whichOrder--;
            index += 4;
        }
        System.out.println(speaking);
    }

    public static String getSpeaking(String num, boolean inMiddle) {
        if (inMiddle && num.equals("0000")) {
            return "ling";
        }
        int index = 0;
        String specking = "";
        if (num.charAt(index) == '0') {
            while (index < 4 && num.charAt(index) == '0') {
                index++;
            }
        }
        while (index < 4) {
            char digit = num.charAt(index);
            if (index == 3 && digit == '0') {
                // pass
            } else {
                if (digit == '0' && num.charAt(index - 1) == '0') {
                    // pass
                } else if (digit == '0' && allDigitAreZero(num.substring(index, 4))) {
                } else if (num.substring(0, 2).equals("00") && num.charAt(2) == '1' && index == 2) {
                    // pass
                }
                else {
                    specking += nums[Character.getNumericValue(digit)];
                }
            }
            if (index < 3 && digit == '0') {
                // pass
            } else {
               specking += units[index];
            }
            index++;
        }
        return specking;
    }

    public static boolean allDigitAreZero(String n) {
        switch (n.length()) {
            case 1: {
                return n.equals("0");
            }
            case 2: {
                return n.equals("00");
            }
            case 3: {
                return n.equals("000");
            }
        }
        return false;
    }
}
