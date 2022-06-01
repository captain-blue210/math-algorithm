import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      long A = scanner.nextLong();
      long B = scanner.nextLong();

      while (true) {
         if (A == 0) {
            System.out.println(B);
            break;
         }
         if (B == 0) {
            System.out.println(A);
            break;
         }

         if (A > B) {
            A %= B;
         } else {
            B %= A;
         }
      }
   }
}
