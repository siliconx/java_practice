import java.util.Scanner;

public class D2H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decValue = input.nextInt();
        input.close();
        String hexStrValue = String.format("%h", decValue);
        System.out.println(hexStrValue.toUpperCase());
    }
}
