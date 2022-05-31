import java.util.Scanner;

/**
 * exercise3-1-2
 */
class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      long N = scanner.nextLong();
      for (long i = 2; i * i <= N; i++) {
         while (N % i == 0) {
            System.out.print(i + " ");
            N /= i;
         }
      }

      if (N >= 2) {
         System.out.print(N);
      }
   }
}
