import java.util.*;

public class LongestSubArrayGivenSum {
    private static void longestSubArrayGivenSum(int[] arr, int n, int sum) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int pre_sum = 0;
        int res = 0;

        for (int i = 0; i < n; i++) {
            pre_sum += arr[i];

            if (pre_sum == sum) {
                res = Math.max(res, i + 1);
            }
            if (mp.containsKey(pre_sum - sum)) {
                res = Math.max(res, i - mp.get(pre_sum - sum));
            }
            if (!mp.containsKey(pre_sum)) {
                mp.put(pre_sum, i);
            }

        }

        System.out.println(res);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        longestSubArrayGivenSum(a, n, sum);

        sc.close();
    }
}
