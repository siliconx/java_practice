/**
 * Created by island on 17-3-22.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SubstringStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        String str = in.next();
        in.close();
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        while (L <= str.length()) {
            for (int i=0;i<=str.length() - L;i++) {
                String subString = str.substring(i, i + L);
                if (set.contains(subString)) {
                    map.put(subString, map.get(subString) + 1);
                } else {
                    set.add(subString);
                    map.put(subString, 1);
                }
            }
            L++;
        }

        int max = 1;
        for (String e : set) {
            if (map.get(e) > max) {
                max = map.get(e);
            }
        }

        ArrayList<String> maxTimesString = new ArrayList<>();
        for (String e : set) {
            if (map.get(e) == max) {
                maxTimesString.add(e);
            }
        }


        if (maxTimesString.size() == 1) {
            System.out.println(maxTimesString.get(0));
        } else {
            String temp = maxTimesString.get(0);
            for (String e : maxTimesString) {
                if (temp.length() < e.length()) {
                    temp = e;
                }
            }

        }
    }
}
