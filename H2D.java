package lanqiao;

import java.util.Scanner;

public class H2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String hexStrValue = input.next();
        input.close();
        StringBuilder binStrValue = new StringBuilder();

        // make hex to bin in `binStrValue`
        for (int i = 0; i < hexStrValue.length(); i++) {
            int tempInt = Integer.parseInt(hexStrValue.charAt(i) + "", 16);
            String tempBin = Integer.toBinaryString(tempInt);

            // fill the binary string
            while (tempBin.length() < 4) {
                tempBin = "0" + tempBin;
            }
            binStrValue.append(tempBin);
        }

        int digital = binStrValue.length();
        long decValue = 0;
        for (int j = 0; j < digital; j++) {
            long muti = (long) Math.pow(2, digital - j - 1);
            int bin = Integer.parseInt(binStrValue.charAt(j) + "", 2);
            decValue += (muti * bin);
        }
        System.out.println(decValue);
    }
}
