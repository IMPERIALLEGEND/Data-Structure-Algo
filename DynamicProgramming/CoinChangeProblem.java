import java.util.Scanner;

public class CoinChangeProblem {

    public static int navieSol(int[] coins, int n, int amount){
        if(amount == 0) return 1;
        else if(amount < 0) return 0;
        else if(n <= 0) return 0;
        
        return navieSol(coins, n, amount-coins[n-1]) + navieSol(coins, n-1, amount);
    }

    public static int numberOfWays(int[] coins, int n, int amount){
        int[][] dp = new int[n+1][amount+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=amount;j++){
                dp[i][j] = dp[i-1][j];

                if(coins[i-1] <= j){
                    dp[i][j] += dp[i][j - coins[i-1]];
                }
            }
        }

        return dp[n][amount];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amount = sc.nextInt();
        int[] coins = new int[n];

        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }

        System.out.println(navieSol(coins,n,amount));
        System.out.println(numberOfWays(coins,n,amount));
        
        sc.close();

    }
}
