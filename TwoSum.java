package lanqiao;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int x = 1;
        int result = 0;
        
        while (x != 0) {
            int tail = x % 10;
            System.out.println("1: " + result);
            result = (int) (result * 10 + tail);
            x /= 10;
            System.out.println("2: " + result);
        }
        int i = 974632435;
        System.out.println(i);
        System.out.println(i * 4);
    }
}
