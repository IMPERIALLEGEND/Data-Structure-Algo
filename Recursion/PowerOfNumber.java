
import java.util.*;

class PowerOfNumber{

    static int powerOfNumber(int n,int r){


        if(r == 0) return 1;

        if(r == 1) return n;

        int temp = powerOfNumber(n, r/2);
        if(temp % 2 == 0) return temp * temp;

        else return n * temp * temp;


        /*
         * 
         2 ^ 8 = 2 ^ 4 * 2 ^ 4
         just need caluclate 2 ^ 4 using recursion

         if 2 ^ 9 = 2 ^ 1 + 2 ^ 4 + 2 ^ 4
         beacuse 9 is odd
         * 
         */

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int r = sc.nextInt();


        int ans = powerOfNumber(n,r);

        System.out.println(ans);

        sc.close();
        
    }
}