import java.util.HashMap;
import java.util.Scanner;

public class CountOfDistinctWinK {
    private static void countOfDistinctWinK(int[] arr, int n, int k) {
        /*
        https://practice.geeksforgeeks.org/batch/dsa-4/track/DSASP-Hashing/article/NzYzOA%3D%3D
         Idea
            1. Create hashmap
            2. add element and freq for first window k
            3. start with next with window and decrease frequency previous window elem i-k but freq is 1 then remove
            4. add new ele in map and it's freq
            
         */
        if (k == 0)
            return;
        HashMap<Integer, Integer> mp = new HashMap<>();

        // Traverse the first window and store count
        // of every element in hash map
        for (int i = 0; i < k; i++) {
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
        }
        // Print count of first window
        System.out.print(mp.size() + " ");

        // Traverse through the remaining array
        for (int i = k; i < n; i++) {

            // Remove first element of previous window
            // If there was only one occurrence
            if (mp.get(arr[i - k]) == 1) {
                mp.remove(arr[i - k]);
            } else {
                // reduce count of the removed element
                mp.put(arr[i - k], mp.get(arr[i - k]) - 1);
            }

            // Add new element of current window
            // If this element appears first time,
            // set its count as 1,
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);

            // Print count of current window
            System.out.print(mp.size() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        countOfDistinctWinK(a, n, k);

        sc.close();
    }
}
