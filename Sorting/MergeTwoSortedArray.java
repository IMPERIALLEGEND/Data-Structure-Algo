import java.util.*;
/*
 Merged Two Sorted Array without extra space

n = 4, arr1[] = [1 3 5 7] 
m = 5, arr2[] = [0 2 6 8 9]
Output: 
arr1[] = [0 1 2 3]
arr2[] = [5 6 7 8 9]

Solution
a1 = 1 3 5 7
           |
           left
a2 = 0 2 6 8 9
     | 
     right

a1[left] > a2[right] then a1[left] always in a2 array if not then break beacuse after this will have all the correct element
swap(a1[left], a2[right])
then we will get

a1 = 1 3 2 0 
a2 = 7 5 6 8 9

Then we just need to sort both arrays

 */
public class MergeTwoSortedArray {

    private static void mergedTwoSortedArrayWithoutSpace(int[] a1, int n1, int[] a2, int n2) {
        int left = n1 - 1;
        int right = 0;

        while (left >= 0 && right < n2) {

            if (a1[left] > a2[right]) {
                int temp = a1[left];
                a1[left] = a2[right];
                a2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println();
        for (int l = 0; l < n1; l++) {
            System.out.print(a1[l] + " ");
        }
        System.out.println();
        for (int l = 0; l < n2; l++) {
            System.out.print(a2[l] + " ");
        }

    }

    private static void mergedTwoSortedArrayWithSpace(int[] a1, int n1, int[] a2, int n2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[n1 + n2];

        while (i < n1 && j < n2) {

            if (a1[i] <= a2[j]) {
                ans[k] = a1[i];
                i++;
                k++;
            } else {
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

        for (int l = 0; l < n1 + n2; l++) {
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
        mergedTwoSortedArrayWithSpace(a1, n1, a2, n2);
        mergedTwoSortedArrayWithoutSpace(a1, n1, a2, n2);

        sc.close();
    }

}
