import java.util.Scanner;

public class FractionTrouble {

    public static void fractionTrouble(int n,int d){

        int max_num = -1;
        int max_deno = 1;

        for(int q = 10000;q>1;q--){

            int p = (n * q - 1) / d;

            if((gcd(p,q) == 1) && (max_num * q <= max_deno * p)){

                max_num = p ;
                max_deno = q;
            }
        }


        System.out.println(max_num + " "+ max_deno);
    }

    public static int gcd(int n1,int n2){

        if(n2 == 0){

            return n1;
        }

        return gcd(n2, n1%n2);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();


        fractionTrouble(n,d);


        sc.close();
    }
}
