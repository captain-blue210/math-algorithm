import java.io.*;
import java.util.*;

class Main {

    // Generated by 2.12.0 https://github.com/kyuridenamida/atcoder-tools  (tips: You use the default template now. You can remove this line by using your custom template)
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        long N;
        N = sc.nextLong();
        long[] B = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            B[i] = sc.nextLong();
        }
        long[] R = new long[(int)(N)];
        for(int i = 0 ; i < N ; i++){
            R[i] = sc.nextLong();
        }
        solve(N, B, R);
    }

    static void solve(long N, long[] B, long[] R){

    }
}