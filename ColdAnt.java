/**
 * Created by island on 17-3-11.
 */
import java.util.Arrays;
import java.util.Scanner;

public class ColdAnt {
    static Ant[] ants;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        ants = new Ant[n];
        int distance, absDistance;
        distance = in.nextInt();
        absDistance =  Math.abs(distance);
        ants[0] = new Ant(distance, distance / absDistance, true);
        for (int i=1;i<n;i++) {
            distance = in.nextInt();
            absDistance = Math.abs(distance);
            ants[i] = new Ant(distance, distance / absDistance);
        }
        in.close();

        Arrays.sort(ants);
        while (!allOut()) {
            infect();
            nextStep();
        }
        System.out.println(howManyColdAnt());
    }

    public static void nextStep() {
        for (int i=0;i<n;i++) {
            ants[i].distance += ants[i].direct;
        }
    }

    public static boolean allOut() {
        for (Ant e : ants) {
            if (e.direct < 0) {
                if (e.distance > 0)
                    return false;
            } else{
                if (e.distance < 100) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int howManyColdAnt() {
        int sum = 0;
        for (Ant e : ants) {
            if (e.cold) {
                sum++;
            }
        }
        return sum;
    }

    public static void infect() {
        for (int i = 0; i < n - 1; i++) {
            Ant current = ants[i];
            Ant next = ants[i + 1];
            if (current.distance == next.distance && current.direct != next.direct) {
                if (current.cold || next.cold) {
                    current.cold = next.cold = true;
                }
                current.direct *= -1;
                next.direct *= -1;
            }
        }
    }
}


class Ant implements Comparable<Ant> {
    public int distance;
    public int direct;
    public boolean cold;

    public Ant(int distance, int direct) {
        this.distance = distance;
        this.direct = direct;
        this.cold = false;
    }

    public Ant(int distance, int direct, boolean cold) {
        this.distance = distance;
        this.direct = direct;
        this.cold = cold;
    }

    @Override
    public int compareTo(Ant o) {
        if (this.distance > o.distance) {
            return 1;
        } else if (this.distance < o.distance) {
            return -1;
        } else {
            return 0;
        }
    }
}
