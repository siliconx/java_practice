package lanqiao;
import java.util.Scanner;


public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int lcm = a * b / gcd(a, b);
        System.out.println(lcm);
    }
    
    private static int gcd(int a, int b) {
        if (a < b) {
            int c = b;
            b = a;
            a = c;
        }

        while (a % b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return b;
    }
}
