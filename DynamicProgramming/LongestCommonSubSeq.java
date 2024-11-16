import java.util.*;

public class LongestCommonSubSeq {

    public static int lcs(int n, int m, String s1, String s2) {
        int[][] dp = new int[n + 1][m + 1];
        //Empty String always dp[0], we are assuming dp[1] = s.charAt(0) ...
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    //previous character same add 1
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    // remove character from one string and other from second string take max
                    
                }
            }
        }

        return dp[n][m];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n = s1.length();
        int m = s2.length();

        System.out.print(lcs(n, m, s1, s2));

        sc.close();
    }
}
