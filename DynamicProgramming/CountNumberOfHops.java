import java.util.Scanner;

public class CountNumberOfHops {
    public static int countWays(int n){
        if(n < 3) return n;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for(int i=4;i<=n;i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        return dp[n];
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(countWays(n));
        sc.close();
    }
}
