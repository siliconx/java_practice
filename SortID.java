/**
 * Created by island on 17-2-27.
 */
import java.util.Scanner;

public class SortID {
    static String[] ids;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ids = new String[n];
        for (int i=0;i<n;i++) {
            ids[i] = in.nextLine();
        }
        in.close();
        sort();
//        System.out.println(ids.length);
        for (String e : ids) {
            System.out.println(e);
        }
    }

    public static void sort() {
        String birthA, birthB;
        for (int i=0;i<ids.length;i++) {
            birthA = ids[i].substring(6, 14);
            for (int j=0;j<ids.length;j++) {
                birthB = ids[j].substring(6, 14);
                int cmp = birthA.compareTo(birthB);
                if (cmp > 0) {
                    String temp = ids[i];
                    ids[i] = ids[j];
                    ids[j] = temp;
                } else if (cmp == 0) {
                    cmp = ids[i].compareTo(ids[j]);
                    if (cmp > 0) {
                        String temp = ids[i];
                        ids[i] = ids[j];
                        ids[j] = temp;
                    }
                }
            }
        }
    }
}

class IDBirth {
    String id;
}