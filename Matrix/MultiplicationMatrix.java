import java.util.Scanner;

public class MultiplicationMatrix {
    private static int[][] matrixMultiplication1(int[][] A, int[][] B) {

        int[][] c = new int[A.length][B[0].length];
        if (A[0].length != B.length) {

            int[][] res = new int[1][1];
            res[0][0] = -1;
            return res;

        }

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < B[0].length; j++) {

                for (int k = 0; k < B.length; k++) {
                    c[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] b = new int[r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] ans = matrixMultiplication1(a, b);

        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}
