import java.util.Scanner;

public class CountOnlyRepeatedSoretedCons {

    private static void findRepeating(int[] a,int n){

        /*
         
        Logic:

        using binary search, i=0, j=n-1, mid=(i+j)/2.
        suppose the arr is [1,2,3,4,4], mid = (0+4)/2=2. arr[mid]=3, 
        which is equal to arr[0]+mid. This means, repeating element is in the 2nd half of the arr, we increase i.
        if the above condition is false, e.g. arr = [1,2,2,3,4], arr[mid]=2 which is less than arr[0]+mid, so repeating element in the first half. This is how we find the repeating element.
        

        Frequency: We know numbers are in the range of n, so we can simply subtract arr[n-1] from arr[0] to find the range & the subtract n from this to find the freq of the repeating element,
        if this freq==1, we simply return -1.

         */
        int start = 0;
        int end = n-1;
        
        if(n == 0){
            System.out.println(0);
            return;
        }
        
        if(n - (a[n-1] - a[0] + 1) == 0){
           System.out.println(-1);
           return;
        }
        
        while(start < end){
            int mid = start + (end - start) / 2;
            
            if(a[mid] >= a[0] + mid){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        }

        System.out.println(a[start]);
        System.out.println(n - (a[n-1] - a[0]));

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        findRepeating(a,n);

        sc.close();
    }
}
