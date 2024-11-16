import java.util.Scanner;
/*
Catlan Numbers are
 n = 0, 1, 2, 3, …
 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …

 c0 = 1
 c1 = 1
 c2 = c0*c1 + c1*c0
 c3 = c0*c2 + c1*c1 + c2*c0
 */
public class NthCaltanNumber {

    public static int findCatalan(int n) {
        int mod = 1000000007;
        long[] dp = new long[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i] = (dp[i] + (dp[j] * dp[i-j-1]) % mod) %mod;
            }
        }
        return (int)dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(findCatalan(n));

        sc.close();
    }
}
