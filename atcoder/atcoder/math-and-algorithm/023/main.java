import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] B = new long[(int) (N)];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextLong();
        }
        long[] R = new long[(int) (N)];
        for (int i = 0; i < N; i++) {
            R[i] = sc.nextLong();
        }

        System.out.println(calcExpectedValue(B) + calcExpectedValue(R));
    }

    static double calcExpectedValue(long[] dice) {
        return Double.valueOf(Arrays.stream(dice).sum()) / Double.valueOf(dice.length);
    }
}
