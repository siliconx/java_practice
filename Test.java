package lanqiao;

import java.util.Scanner;
import java.util.HashSet;

public class Test {

    static Scanner input = new Scanner(System.in);
    static String[][] data = new String[3][3];
    static HashSet<Character> realCoins = new HashSet<>();
    static HashSet<Character> lightCoins = new HashSet<>();
    static HashSet<Character> heavyCoins = new HashSet<>();
    static char counterfeitCoin;

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                data[i][j] = input.next();
            }
        }
        input.close();
        
        for (int i = 0; i < 3; i++) {
            switch(data[i][2]) {
                case "up": {
                    addCharToSet(lightCoins, data[i][1]);
                    addCharToSet(heavyCoins, data[i][0]);
                    break;
                }

                case "down": {
                    addCharToSet(lightCoins, data[i][0]);
                    addCharToSet(heavyCoins, data[i][1]);
                    break;
                }

                case "even": {
                    String tempRealCoins = data[i][0] + data[i][1];
                    addCharToSet(realCoins, tempRealCoins);
                    break;
                }

                default: {
                    System.out.println("Invalid input.");
                    return;
                }
            }
        }

        for (char c : realCoins) {
            lightCoins.remove(c);
            heavyCoins.remove(c);
        }

        if (lightCoins.isEmpty()) {
            for (char c : heavyCoins) {
                counterfeitCoin = c;
            }
            System.out.println(counterfeitCoin + " is the counterfeit coin and it is heavy.");
        } else {
            for (char c : lightCoins) {
                counterfeitCoin = c;
            }
            System.out.println(counterfeitCoin + " is the counterfeit coin and it is light.");

        }

    }

    private static void addCharToSet(HashSet<Character> set, String str) {
        for (char c : str.toCharArray()) {
            set.add(c);
        }
    }
}
