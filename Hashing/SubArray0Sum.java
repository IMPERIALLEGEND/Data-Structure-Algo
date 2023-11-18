import java.util.*;

public class SubArray0Sum {
/*
Declare a variable sum, to store the sum of prefix elements
Traverse the array and at each index, add the element into the sum and check if this sum exists earlier. If the sum exists, then return true
Also, insert every prefix sum into a map, so that later on it can be found whether the current sum is seen before or not
At the end return false, as no such subarray is found
 */
    private static void subArray0Sum(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();

        int prefix_sum = 0;
        for (int i = 0; i < n; i++) {
            prefix_sum += arr[i];

            if (set.contains(prefix_sum)) {
                System.out.println("True");
                return;
            } else if (prefix_sum == 0) {
                System.out.println("True");
                return;
            }

            set.add(prefix_sum);
        }

        System.out.println("False");

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        subArray0Sum(a, n);

        sc.close();
    }

}
