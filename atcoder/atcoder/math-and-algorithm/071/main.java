import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] a = new long[(int)(N)];
        long[] b = new long[(int)(N)];
        long[] c = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
            c[i] = sc.nextLong();
        }
        solve(N, a, b, c);
    }

    static void solve(long N, long[] a, long[] b, long[] c){

    }
}
