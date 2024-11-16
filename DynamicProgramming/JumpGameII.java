import java.util.Scanner;

public class JumpGameII {

    public static int jump(int[] nums) {
        int jumps = 1; // no of jumps
        int max_dis = nums[0]; // max dis can reach
        int end = nums[0]; // end ele of from that ele 

        for (int i = 1; i < nums.length - 1; i++) {
            max_dis = Math.max(max_dis, i + nums[i]);

            if (i == end) {
                end = max_dis;
                jumps++;
                // we reach to it's limit
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(jump(nums));
        sc.close();
    }
}