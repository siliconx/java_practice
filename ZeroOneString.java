package lanqiao;

public class ZeroOneString {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            String binStr = Integer.toBinaryString(i);
            while (binStr.length() < 5) {
                binStr = "0" + binStr;
            }
            System.out.println(binStr);
        }
    }
}
