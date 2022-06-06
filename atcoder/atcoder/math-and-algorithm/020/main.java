import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] cards = new long[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextLong();
        }

        long count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    for (int l = k + 1; l < N; l++) {
                        for (int m = l + 1; m < N; m++) {
                            if (cards[i] + cards[j] + cards[k] + cards[l] + cards[m] == 1000)
                                count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
