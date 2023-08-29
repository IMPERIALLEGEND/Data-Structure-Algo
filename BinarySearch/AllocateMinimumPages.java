import java.util.Scanner;

public class AllocateMinimumPages {

    private static void allocateMinimumPages(int[] a, int n, int k) {
        //https://www.geeksforgeeks.org/allocate-minimum-number-pages/
        
        int max = Integer.MIN_VALUE; // max of A
        for(int i = 0;i<n;i++){
            max = Math.max(max,a[i]);
        }

        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }

        int min_pages = max; 
        int max_pages = sum;
        int mid = 0;
        while(min_pages <= max_pages){

            mid = min_pages + (max_pages - min_pages)/2;

            if(isPossible(a,n,mid,k)){
                max_pages = mid -1;
            }
            else{
                min_pages = mid + 1;
            }
        }

        System.out.println(mid);

    }

    private static boolean isPossible(int[] a, int n, int mid,int k) {

        int students = 1;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(sum+a[i] > mid){
                students++;
                sum = a[i];
            }
            else{
                sum += a[i];
            }

        }
        return students <= k;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        allocateMinimumPages(a,n,k);
        sc.close();

    }
}
