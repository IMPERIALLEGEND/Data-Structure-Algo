import java.util.*;

public class MaximumAndValue {

    private static int countCheckBits(int patt, int[] a, int n){

        int count = 0;
        for(int i=0;i<n;i++){

            if((a[i] & patt) == patt){

                count++;
            }
        }

        return count;
    }

    private static void efficientSolution(int[] a, int n){

        int res = 0;
        int count=0;

        for(int i = 31; i>=0 ; i--){

            count = countCheckBits(res|(1<<i), a, n);

            if(count >= 2){

                res = res | (1<<i);
            }
        }

        System.out.println(res);
    }

    private static void maximumAndValue(int[] a, int n) {

        int max = 0;

        for(int i=0; i<n-1; i++){

            for(int j=i+1;j<n;j++){

                int ans = a[i] & a[j];

                max = Math.max(max, ans);
            }
        }

        System.out.println(max);

        
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        int[] a = new int[n];

        for(int i =0;i<n;i++){

            a[i] = sc.nextInt();
        }

        maximumAndValue(a,n);
        efficientSolution(a, n);
    }


}