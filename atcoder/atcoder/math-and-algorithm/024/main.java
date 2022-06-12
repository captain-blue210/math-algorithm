import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
   public static void main(String[] args) {
      final Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      double result = IntStream.rangeClosed(1, N).mapToDouble((value) -> {
         double P = sc.nextDouble();
         double Q = sc.nextDouble();
         return Q / P;
      }).sum();

      System.out.println(result);
   }
}
