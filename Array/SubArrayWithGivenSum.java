import java.util.Scanner;

import javax.swing.text.GlyphView;

class SubArrayWithGivenSum{
    private static void subArrayWithGivenSum(int[] a, int n,int sum_given){

        int i = 0;
        int curr_sum = 0;
        for(int j = 0;j<n;j++){

            curr_sum += a[j];

            if(curr_sum > sum_given){

                while(curr_sum > sum_given){
                    curr_sum -= a[i];
                    i++;
                }
            }

            if(curr_sum == sum_given){
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        int sum = sc.nextInt();

        for(int i = 0;i < n;i++){
            
            a[i] = sc.nextInt();
        }

        subArrayWithGivenSum(a,n,sum);
    }
}

/*
 * 
 
    Create two variables, start=0, currentSum = arr[0]
    Traverse the array from index 1 to end.
    Update the variable currentSum by adding current element, currentSum = currentSum + arr[i]
    If the currentSum is greater than the given sum, update the variable currentSum as currentSum = currentSum – arr[start],
    and update start as, start++.
    If the currentSum is equal to given sum, print the subarray and break the loop.
  
 */