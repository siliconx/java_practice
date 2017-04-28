package lanqiao;

public class SpecialNum {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            String str = Integer.toString(i);
            int digOne = Integer.parseInt(str.charAt(0) + "");
            int digTwo = Integer.parseInt(str.charAt(1) + "");
            int digThree = Integer.parseInt(str.charAt(2) + "");
            int specialSum = (int) (Math.pow(digOne, 3) + Math.pow(digTwo, 3) + Math.pow(digThree, 3));
            if (specialSum == i) {
                System.out.println(i);
            }
        }
    }
}
