import java.util.*;
public class GrayToBinary {


    private static void graytoBinary(int n) {

        int res = n;
        while(res > 0){

            res = res >> 1;

            n = n ^ res;
        }

        System.out.println(n);
        
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        graytoBinary(n);

        sc.close();
    }

}
