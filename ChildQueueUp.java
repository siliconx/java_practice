/**
 * Created by island on 17-3-4.
 */
import java.util.Scanner;

public class ChildQueueUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        child[] childs = new child[n];
        for (int i=0;i<n;i++) {
            int height = in.nextInt();
            childs[i] = new child(height);
        }
        in.close();
        for (int i=0;i<n;i++) {
            for (int j=0;j<n-1;j++) {
                if (childs[j].height > childs[j + 1].height) {
                    childs[j].changePostion();
                    childs[j+1].changePostion();
                    child temp = childs[j];
                    childs[j] = childs[j + 1];
                    childs[j+1] = temp;
                }
            }
        }
        long sum = 0;
        for (int i=0;i<n;i++) {
            sum += childs[i].unhappeness;
        }
        System.out.println(sum);
    }
}

class child {
    int height;
    int unhappeness;
    int times;

    public child(int height) {
        this.height = height;
        this.unhappeness = 0;
        this.times = 0;
    }

    public void changePostion() {
        times++;
        unhappeness += times;
    }
}
