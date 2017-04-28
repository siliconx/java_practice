package lanqiao;
import java.util.ArrayList;
import java.util.Scanner;

public class FeeOfHuffman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();
        int n = input.nextInt();
        int fee = 0;
        for (int i = 0; i < n; i++) {
            integers.add(input.nextInt());
        }
        input.close();
        integers.sort(null);;
        while (integers.size() > 1) {
            int sum = integers.get(0) + integers.get(1);
            fee += sum;
            integers.remove(0);
            integers.remove(0);
            integers.add(sum);
            integers.sort(null);
        }
        System.out.println(fee);
    }
}
