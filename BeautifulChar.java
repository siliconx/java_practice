//package lanqiao;
import java.util.Scanner;

public class BeautifulChar {
    public static void main(String[] args) {
        System.out.println("Enter two integer.");
        Scanner input = new Scanner(System.in);
        int r, c;
        r = input.nextInt();
        c = input.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sub = Math.abs(i - j);
                char character = (char) ('A' + sub);
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
