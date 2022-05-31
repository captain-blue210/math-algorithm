import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int sum = 0;
      while (sc.hasNext()) {
         sum += Integer.parseInt(sc.next());
      }
      System.out.print(sum % 100);
   }
}
