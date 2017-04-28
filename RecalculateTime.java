package lanqiao;
import java.util.Scanner;

public class RecalculateTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seconds = input.nextInt();

        int hours = seconds / 3600;
        seconds %= 3600;
        int min = seconds / 60;

        int sec = seconds % 60;

        System.out.printf("%d:%d:%d", hours, min, sec);
    }
}
