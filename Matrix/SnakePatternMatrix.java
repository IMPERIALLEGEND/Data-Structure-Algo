import java.util.Scanner;

public class SnakePatternMatrix {

    private static void snakePatternMatrix(int[][] a){
        int r = a.length;

        for(int i=0;i<r;i++){

            if(i % 2 == 0)
            {
            for(int j=0;j<a[i].length;j++){

                System.out.print(a[i][j]+" ");
            }
            }
            else{
                for(int j=a[i].length-1;j>=0;j--){

                System.out.print(a[i][j]+" ");
            }
            }

            System.out.println();


        }
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

        snakePatternMatrix(a);
        sc.close();
    }
}
