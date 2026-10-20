import java.util.Random;
public class Main {
    public static void main(String[] args) {
        final int N = 10;
        int[] v = new int[N];
        Random n = new Random();
        for (int i = 0; i < N; i++) {
            v[i] = n.nextInt(100);
        }
        for (int i = 0; i < N; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}