import java.util.Scanner;

public class SlidingWindowTech {
    
    private static void findMaximumWindowSum(int[] a, int n, int k) {
        if (n < k) {
            System.out.println("INVALID  ");
            
        }

        int max_sum = Integer.MIN_VALUE;
        /*
         
        I/P: [1, 8, 30, -5, 20, 7]


        Applying sliding window technique :

        We compute the sum of first k elements out of n terms using a linear loop and store the sum in variable window_sum.
        Then we will graze linearly over the array till it reaches the end and simultaneously keep track of maximum sum.
        To get the current sum of block of k elements just subtract the first element from the previous block and add the last element of the current block .
        
*/

        int curr_sum = 0;
         for(int i = 0 ;i<k;i++){

            curr_sum += a[i];
         }

        for(int i=k;i<n;i++){

            curr_sum += a[i] - a[i-k];
            max_sum = Math.max(max_sum, curr_sum);
        }

        System.out.println(max_sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0;i<n;i++){

            a[i] = sc.nextInt();
        }

        findMaximumWindowSum(a,n,k);
    }


}
