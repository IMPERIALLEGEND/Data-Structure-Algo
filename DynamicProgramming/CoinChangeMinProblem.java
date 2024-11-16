import java.util.Scanner;

public class CoinChangeMinProblem {
        public static int numberOfWays(int[] coins, int n, int amount){
            int[][] dp = new int[n+1][amount+1];
            
            for(int i=0;i<=n;i++){
                for(int j=0;j<=amount;j++){
                    if(j == 0) continue;
                    else if(i==0) dp[i][j] = Integer.MAX_VALUE - 1;
                    else if(coins[i-1] > j)
                        dp[i][j] = dp[i-1][j];
    
                    else{
                        dp[i][j] = Math.min(dp[i-1][j],1+dp[i][j - coins[i-1]]) ;
                    }
                }
            }
    
            return dp[n][amount] != 1 + Integer.MAX_VALUE ? dp[n][amount] : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = sc.nextInt();
        int[] coins = new int[n];

        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        System.out.print(numberOfWays(coins,n,amount));
        
        sc.close();

    }
}
