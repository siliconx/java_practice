package lanqiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PaliNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> paliNums = new ArrayList<>();
        
        // 5 digitial
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if ((a + b) * 2 + c == n) {
                        String strValue = String.format("%d%d%d%d%d", a, b, c, b, a);
                        paliNums.add(Integer.parseInt(strValue));
                    }
                }
            }
        }
        
        // 6 digitial
        for (int a = 1; a <= 9; a++) {
            for (int b = 0; b <= 9; b++) {
                for (int c = 0; c <= 9; c++) {
                    if ((a + b + c) * 2 == n) {
                        String strValue = String.format("%d%d%d%d%d%d", a, b, c, c, b, a);
                        paliNums.add(Integer.parseInt(strValue));
                    }
                }
            }
        }
        int[] list = new int[paliNums.size()];
        for (int i = 0; i < paliNums.size(); i++) {
            list[i] = paliNums.get(i);
        }
        // sort the array
        Arrays.sort(list);
        for (int e : list) {
            System.out.println(e);
        }
    }
}
