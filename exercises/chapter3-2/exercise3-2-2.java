import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         int N = scanner.nextInt();

         long currentGCD = scanner.nextLong();
         while (scanner.hasNext()) {
            currentGCD = calcGCD(currentGCD, scanner.nextLong());
         }
         System.out.println(currentGCD);
      }
   }

   static long calcGCD(long A, long B) {
      while (true) {
         if (A == 0) {
            return B;
         }
         if (B == 0) {
            return A;
         }

         if (A > B) {
            A %= B;
         } else {
            B %= A;
         }
      }
   }
}
