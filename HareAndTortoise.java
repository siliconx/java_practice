package lanqiao;
import java.util.Scanner;

public class HareAndTortoise {
    static int tortoise = 0;
    static int hare = 0;
    static int l;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tortoise = 0;
        hare = 0;
        int v1 = input.nextInt();
        int v2 = input.nextInt();
        int t = input.nextInt();
        int s = input.nextInt();
        l = input.nextInt();
        input.close();
        int seconds = 0;
        int sleepFrom = 0;
        boolean sleep = false;
        while (!theEnd()) {
            tortoise += v2;
            if (sleep) {
                if (seconds - sleepFrom >= s) {
                    sleep = false;
                }
            } else {
                hare += v1;
                if (hare - tortoise >= t) {
                    sleepFrom = seconds;
                    sleep = true;
                }
            }
            seconds++;
        }
        if (hare > tortoise) {
            System.out.println("R");
        } else if (hare < tortoise) {
            System.out.println("T");
        } else {
            System.out.println("D");
        }
        System.out.println(seconds);
    }
    
    private static boolean theEnd() {
        return (tortoise >= l || hare >= l);
    }
}
