import java.util.*;

public class SparseOrNot {
    private static void sparseOrNot(int n) {

        if((n & (n << 1)) == 0){

            System.out.println(1);

        }

        else {
            System.out.println(0);;
        }
        
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        

        sparseOrNot(n);

        sc.close();
    }

}
