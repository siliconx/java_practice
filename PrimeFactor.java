package lanqiao;
import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        for (int i = a; i <= b; i++) {
            System.out.println(factor(i));
        }
    }
    
    private static String factor(int n) {
        if (n < 2) {
            return "1=1";
        } else {
            String temp = n + "=";
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    temp += (i + "*");
                    n /= i;
                    i--;
                }
            }
            temp = temp.substring(0, temp.length() - 1);
            return temp;
        }
    }
}
