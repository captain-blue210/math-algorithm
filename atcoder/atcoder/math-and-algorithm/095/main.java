import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] C = new long[(int)(N)];
        long[] P = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            C[i] = sc.nextLong();
            P[i] = sc.nextLong();
        }
        long Q;
        Q = sc.nextLong();
        long[] L = new long[(int)(Q)];
        long[] R = new long[(int)(Q)];
        for(int i = 0 ; i < Q ; i++){
            L[i] = sc.nextLong();
            R[i] = sc.nextLong();
        }
        solve(N, C, P, Q, L, R);
    }

    static void solve(long N, long[] C, long[] P, long Q, long[] L, long[] R){

    }
}
