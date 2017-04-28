package lanqiao;
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    static ArrayList<Integer> fibonacci = new ArrayList<>();
    static int n, m, p;
    public static void main(String[] args) {
        fibonacci.add(1);
        fibonacci.add(1);
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        m = input.nextInt();
        p = input.nextInt();
        input.close();
        System.out.println(element(5));
    }
    
    private static int element(int i) {
        int max = i > m ? i : m;
        if (max < fibonacci.size()) {
        } else {
            while (max >= fibonacci.size()) {
                int size = fibonacci.size();
                int sum = fibonacci.get(size - 1) + fibonacci.get(size - 2);
                fibonacci.add(sum);
            }
        }
        return fibonacci.get(i);
    }
}
