import java.util.Arrays;
import java.util.Scanner;

public class FindTripletZeroSum {
    private static void findTripletZeroSum(int[] arr, int n) {

        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                if (arr[i] + arr[l] + arr[r] == 0) {
                    System.out.println("Found");
                    return;
                } else if (arr[i] + arr[l] + arr[r] > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }

        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        findTripletZeroSum(a, n);
        sc.close();
    }

}
