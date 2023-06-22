import java.util.ArrayList;
import java.util.Scanner;

public class FindSumInGivenRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        

        for(int i=0;i<n;i++){
            
            a[i] = sc.nextInt();
            
        }

        int q = sc.nextInt();

        int[] prefix_sum = new int[n];

        prefix_sum[0] = a[0];

        for(int i=1;i<=n-1;i++){

            prefix_sum[i] = prefix_sum[i-1] + a[i];
        }

        
         
        for(int i=0;i<q;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            /*
             1, 2, 3, 4, 5
             1, 3, 6, 10, 15
             */

             if( l == 0){

                System.out.println(prefix_sum[r-1]);
             }
             else{
                System.out.println(prefix_sum[r-1] - prefix_sum[l-1]);
             }

        }
        
        


        sc.close();



        
    }
}
