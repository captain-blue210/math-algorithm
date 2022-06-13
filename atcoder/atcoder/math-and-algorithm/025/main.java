import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      final Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      double[] A = new double[N];
      for (int i = 0; i < N; i++) {
         A[i] = sc.nextDouble();
      }
      double[] B = new double[N];
      for (int i = 0; i < N; i++) {
         B[i] = sc.nextDouble();
      }

      double result = 0.0;
      for (int i = 0; i < N; i++) {
         result += (A[i] + 2 * B[i]) / 3;
      }
      System.out.println(result);
   }
}
