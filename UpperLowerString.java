package lanqiao;
import java.util.Scanner;

public class UpperLowerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String str = input.next();
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isUpperCase(temp)) {
                temp = Character.toLowerCase(temp);
            } else {
                temp = Character.toUpperCase(temp);
            }
            stringBuilder.append(temp);
        }
        System.out.println(stringBuilder);
    }
}
