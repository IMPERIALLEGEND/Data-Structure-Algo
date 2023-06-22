import java.util.*;

class MaximumIndex {

    public static int naiveSolution(int[] a,int n){

        int max_diff = 0;

        for(int i=0; i<n-1 ;i++){

            int curr_diff = 0;

            for(int j=1;j < n; j++){

                if(a[i] <= a[j]){

                    curr_diff = j - i;
                }
            }

            max_diff = Math.max(max_diff, curr_diff);
        }

        return max_diff;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){

            a[i] = sc.nextInt();

        }
        System.out.println(naiveSolution(a,n));
        
    }
}