import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] cards = new int[N];
        int i = 0;
        while (sc.hasNext()) {
            cards[i++] = sc.nextInt();
        }

        int[] counts = new int[100000];
        for (int k = 1; k <= 99999; k++) {
            counts[k] = 0;
        }
        for (int j : cards) {
            System.out.println("cards: " + j);
            counts[j] += 1;
        }

        long answer = 0;
        for (int m = 1; m <= 49999; m++) {
            answer += counts[m] * counts[100000 - m];
        }
        answer += counts[50000] * (counts[50000] - 1) / 2;

        System.out.println(answer);
    }
}
