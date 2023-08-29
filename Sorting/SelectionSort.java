import java.util.Scanner;

public class SelectionSort {
    private static void selectionSort(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            for (int j = i + 1; j < n; j++) {

                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();
        }

        selectionSort(a, n);

        sc.close();
    }
}
