import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      scanner.nextInt();

      long currentLCM = scanner.nextLong();
      while (scanner.hasNext()) {
         long B = scanner.nextLong();
         long currentGCD = calcGCD(currentLCM, B);
         currentLCM = calcLCM(currentLCM, B, currentGCD);
      }
      System.out.println(currentLCM);
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

   static long calcLCM(long A, long B, long currentGCD) {
      return (A * B) / currentGCD;
   }
}
