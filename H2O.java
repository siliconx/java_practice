package lanqiao;

import java.util.Scanner;

public class H2O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] numStr = new String[n];
        for (int i = 0; i < n; i++) {
            numStr[i] = input.next();
        }
        input.close();
        for (int j = 0; j < n; j++) {
          String strValue = numStr[j];
          StringBuilder binStrValue = new StringBuilder();
          for (int k = 0; k < strValue.length(); k++) {
              int temp = Integer.parseInt(strValue.charAt(k) + "", 16);
              String tempBin = Integer.toBinaryString(temp);
              while (tempBin.length() < 4) {
                  tempBin = "0" + tempBin;
              }
              binStrValue.append(tempBin);
          }
              
          // to fill the length of binStrValue by insert `0`
          int leftLength = binStrValue.length() % 3;
          if (leftLength != 0) {
              int fillLength = 3 - leftLength;
              while (fillLength != 0) {
                  binStrValue.insert(0, "0");
                  fillLength--;
              }
          }
          
          // output the bin value to oct
          if (binStrValue.substring(0, 3).equals("000")) {
              binStrValue.delete(0, 3);
          }
          
          for (int step = 0; step < binStrValue.length() - 2; step+=3) {
              int octValue = Integer.parseInt(binStrValue.substring(step, step + 3), 2);
              System.out.print(octValue + "");
          }
          System.out.println();
        }
    }
}