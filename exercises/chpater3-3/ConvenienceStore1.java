import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      try (Scanner scanner = new Scanner(System.in)) {
         scanner.nextInt();

         int countOf100 = 0;
         int countOf200 = 0;
         int countOf300 = 0;
         int countOf400 = 0;
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
