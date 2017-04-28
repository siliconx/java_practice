package lanqiao;

public class PaliNum2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.printf("%d%d%d%d\n", i, j, j, i);
            }
        }
    }
}
