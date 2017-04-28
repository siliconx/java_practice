package lanqiao;
import java.util.Scanner;

public class FJString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println(FJ(n));
    }
    
    private static String FJ(int n) {
        if (n == 1) {
            return "A";
        }
        char character = (char) ('A' + n - 1);
        String temp = FJ(n - 1);
        return temp + character + temp;
    }
}
