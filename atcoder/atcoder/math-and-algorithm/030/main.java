import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long W;
        W = sc.nextLong();
        long[] w = new long[(int)(N)];
        long[] v = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        solve(N, W, w, v);
    }

    static void solve(long N, long W, long[] w, long[] v){

    }
}