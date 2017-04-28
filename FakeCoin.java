package lanqiao;

import java.util.Scanner;

public class FakeCoin {
    // 以二维数组的形式存放输入
    static String[][] data = new String[3][3];
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = input.next();
            }
        }
        input.close();

        // 从'A'到'L'遍历硬币
        for (char c = 'A'; c <= 'L'; c++) {
            if (isLight(c)) {
                System.out.println(c + " is the counterfeit coin and it is light.");
                return;
            } else if (isHeavy(c)) {
                System.out.println(c + " is the counterfeit coin and it is heavy.");
                return;
            }
        }
    }

    // 判断硬币是否为轻
    private static boolean isLight(char c) {
        for (int i = 0; i < 3; i++) {
            switch (data[i][2]) {

                case "up": {
                    if (!inRight(i, c))
                        return false;
                    break;
                }

                case "down": {
                    if (!inLeft(i, c))
                        return false;
                    break;
                }

                case "even": {
                    if (inRight(i, c) || inLeft(i, c))
                        return false;
                    break;
                }

                default: {
                    System.out.println("Invalid input.");
                    System.exit(0);
                }
            }
        }
        return true;
    }

    // 判断硬币是否为重
    private static boolean isHeavy(char c) {
        for (int i = 0; i < 3; i++) {
            switch (data[i][2]) {

                case "up": {
                    if (!inLeft(i, c))
                        return false;
                    break;
                }

                case "down": {
                    if (!inRight(i, c))
                        return false;
                    break;
                }

                case "even": {
                    if (inRight(i, c) || inLeft(i, c))
                        return false;
                    break;
                }

                default: {
                    System.out.println("Invalid input.");
                    System.exit(0);
                }
            }
        }
        return true;
    }

    // 判断硬币是否在左边
    private static boolean inLeft(int i, char c) {
        return data[i][0].contains(c + "");
    }

    // 判断硬币是否在右边
    private static boolean inRight(int i, char c) {
        return data[i][1].contains(c + "");
    }
}
