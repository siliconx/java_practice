package lanqiao;
import java.util.HashMap;
import java.util.Scanner;


public class TimeHelper {
    static HashMap<Integer, String> map = new HashMap<>();
    public static void main(String[] args) {
        init();
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        if (m == 0) {
            String time = num2str(h) + " o'clock";
            System.out.println(time);
        } else {
            String hourStr = num2str(h);
            String minStr = num2str(m);
            System.out.println(hourStr + " " + minStr);
        }
    }
    
    private static void init() {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
        map.put(13, "thirteen");
        map.put(14, "fourteen");
        map.put(15, "fifteen");
        map.put(16, "sixteen");
        map.put(17, "seventeen");
        map.put(18, "eighteen");
        map.put(19, "nineteen");
        map.put(20, "twenty");
        map.put(30, "thirty");
        map.put(40, "forty");
        map.put(50, "fifty");
    }
    
    private static String num2str(int n) {
        if (n <= 20) {
//            return map.get(n);
        } else if (n < 30) {
            int a = n % 20;
            return map.get(20) + " " + map.get(a);
        } else if (n == 30) {
//            return map.get(30);
        } else if (n < 40) {
            int a = n % 30;
            return map.get(30) + " " + map.get(a);
        } else if (n == 40) {
//            return 
        } else if (n < 50) {
            int a = n % 40;
            return map.get(40) + " " + map.get(a);
        } else if (n == 50) {
        } else {
            int a = n % 50;
            return map.get(50) + " " + map.get(a);
        }
        return map.get(n);
    }
}
