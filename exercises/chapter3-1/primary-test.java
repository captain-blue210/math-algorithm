import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      long N = scanner.nextLong();
      if (isPrime(N)) {
         System.out.println("Yes");
      } else {
         System.out.println("No");
      }
   }

   static boolean isPrime(long input) {
      for (long i = 2; i * i <= input; i++) {
         if (input % i == 0) {
            return false;
         }
      }
      return true;
   }
}
