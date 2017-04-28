/**
 * Created by island on 17-3-28.
 */
import java.util.*;

public class StringStatistic {
    static ArrayList<SubStr> subStrs;
    static int number;  // 字串出现的序号
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        String str = in.next();
        in.close();
        subStrs = new ArrayList<>();
        int len = str.length();
        for (;L<=len;L++) {
            for (int i=0;i<=len - L;i++) {
                String subString = str.substring(i, i + L);
                SubStr temp = search(subString);
                if (temp != null) {
                    temp.count++;
                } else {
                    subStrs.add(new SubStr(subString, number));
                    number++;
                }
            }
        }
        SubStr top = getTop();
        System.out.println(top.str);
    }

    static SubStr search(String subString) {
        for (SubStr e : subStrs) {
            if (subString.equals(e.str)) {
                return e;
            }
        }
        return null;
    }

    static SubStr getTop() {
        Collections.sort(subStrs);
        SubStr top = subStrs.get(subStrs.size() - 1);
        return top;
    }
}

class SubStr implements Comparable<SubStr> {
    String str;
    int count;
    int number;

    SubStr(String str, int number) {
        this.str = str;
        this.count = 1;
        this.number = number;
    }

    public void add() {
        this.count++;
    }

    public int compareTo(SubStr e) {
        if (e.count == this.count) {
            if (e.str.length() == this.str.length()) {
                if (e.number > this.number) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (e.str.length() < this.str.length()) {
                return 1;
            } else {
                return -1;
            }
        } else if (e.count > this.count) {
            return -1;
        } else {
            return 1;
        }
    }
}
