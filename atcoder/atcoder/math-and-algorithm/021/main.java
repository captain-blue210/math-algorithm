import java.util.Scanner;

class Main {

    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long r = sc.nextLong();

        long nFactrial = factorial(n);
        long rFactrial = factorial(r);
        long nrFactrial = factorial(n - r);

        System.out.println(nFactrial / (rFactrial * nrFactrial));
    }

    static long factorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
