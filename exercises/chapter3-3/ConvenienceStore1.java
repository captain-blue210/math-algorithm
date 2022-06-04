import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         scanner.nextInt();

         long countOf100 = 0;
         long countOf200 = 0;
         long countOf300 = 0;
         long countOf400 = 0;
         while (scanner.hasNext()) {
            switch (scanner.nextInt()) {
               case 100:
                  countOf100++;
                  break;
               case 200:
                  countOf200++;
                  break;
               case 300:
                  countOf300++;
                  break;
               case 400:
                  countOf400++;
                  break;
            }
         }
         System.out.println((countOf100 * countOf400) + (countOf200 * countOf300));
      }
   }
}
