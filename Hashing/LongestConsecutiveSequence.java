import java.util.*;

/*
 Algorithm:

Create an empty hash.
Insert all array elements to hash.
Do following for every element arr[i]
Check if this element is the starting point of a subsequence. To check this, simply look for arr[i] - 1 in the hash, if not found, then this is the first element a subsequence.
If this element is the first element, then count the number of elements in the consecutive starting with this element. Iterate from arr[i] + 1 till the last element that can be found.
If the count is more than the previous longest subsequence found, then update this.

 */
class LongestConsecutiveSequence {
    private static void longestConsecutiveSequence(int[] arr, int n) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        int ans = 1;
        for (Integer a : hs) {
            // if current element is the starting
            // element of a sequence
            if (hs.contains(a - 1) == false) {
                int curr = 1;
                // Then check for next elements
                // in the sequence
                while (hs.contains(a + curr))
                    curr++;

                // update optimal length if
                // this length is more

                ans = Math.max(ans, curr);
            }
        }

        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        longestConsecutiveSequence(a, n);

        sc.close();
    }
}