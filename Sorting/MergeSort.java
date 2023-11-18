import java.util.Scanner;

public class MergeSort {
    private static void merge(int[] a, int n, int l, int m, int r) {
        /*
                // Merges two subarrays of arr[].
                // First subarray is arr[l..m]
                // Second subarray is arr[m+1..r]
         */
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = a[l+i];

        }

        for(int i=0;i<n2;i++){
            R[i] = a[m+1+i];
        }

        int i=0;
        int j=0;
        int k = l;
        while(i<n1 && j<n2){

            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
                k++;
            }
            else{
                a[k] = R[j];
                k++;
                j++;
            }
        }

        while(i<n1){
            a[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = R[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] a, int n, int l, int r) {
        if (r > l) {
            int m = l + (r - l) / 2;

            mergeSort(a, n, l, m);
            mergeSort(a, n, m + 1, r);

            merge(a, n, l, m, r);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        mergeSort(a, n, l, r);

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

}
