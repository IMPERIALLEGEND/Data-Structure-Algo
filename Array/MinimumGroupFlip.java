import java.util.Scanner;

public class MinimumGroupFlip {

    public static void minimumGroupFlip(int a[], int n){

        /*
         An Efficient Solution is based on the below facts : 

There are only two types of groups (groups of 0s and groups of 1s)
Either the counts of both groups are same or the difference between counts is at most 1. For example, in {1, 1, 0, 1, 0, 0} there are two groups of 0s and two groups of 1s.  
In example, {1, 1, 0, 0, 0, 1, 0, 0, 1, 1}, count of groups of 1 is one more than the counts of 0s.
Based on the above facts, we can conclude that if we always flip the second group and 
other groups that of the same type as the second group, we always get the correct answer.  
In the first case, when group counts are the same, it does not matter which group type we flip as both will lead to the correct answer.  In the second case, when there is one extra, 
by ignoring the first group and starting from the second group, we convert this case to first case (for subarray beginning from the second group) and get the correct answer.
         */

        for(int i=1;i<n;i++){

            if(a[i] != a[i-1]){

                if(a[i] !=  a[0]){

                    System.out.println("Starting From " + i);
                }

                else{

                    System.out.println("Ending it "+ (i-1));
                }
            }
        }

        if(a[n-1] != a[0]){

            System.out.println("Ending it "+(n-1));
        }
    }
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        minimumGroupFlip(arr,n);
    }
}
