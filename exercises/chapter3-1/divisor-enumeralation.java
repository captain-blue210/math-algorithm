import java.util.Scanner;

/**
 * divisor-enumeralation
 */
class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      long N = scanner.nextLong();

      for (long i = 1; i * i <= N; i++) {
         if (N % i == 0) {
            System.out.println(i);
            System.out.println(N / i);
         }
      }
   }
}
