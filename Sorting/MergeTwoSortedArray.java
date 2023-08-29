import java.util.Scanner;

public class MergeTwoSortedArray {

    private static void mergedTwoSortedArray(int[] a1, int n1, int[] a2, int n2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[n1 + n2];

        while (i < n1 && j < n2) {

            if (a1[i] <= a2[j]) {
                ans[k] = a1[i];
                i++;
                k++;
            } else{
                ans[k] = a2[j];
                j++;
                k++;
            } 
        }
        if (i < n1) {
            while (i < n1) {
                ans[k] = a1[i];
                k++;
                i++;
            }
        } else {
            while (j < n2) {
                ans[k] = a2[j];
                k++;
                j++;
            }
        }

        for (int l = 0; l < n1+n2; l++) {
            System.out.print(ans[l] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int[] a1 = new int[n1];

        for (int i = 0; i < n1; i++) {

            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();

        int[] a2 = new int[n2];

        for (int i = 0; i < n2; i++) {

            a2[i] = sc.nextInt();
        }
        mergedTwoSortedArray(a1, n1, a2, n2);

        sc.close();
    }

}
