import java.util.Scanner;

public class PrintPattern {

    public static void naviePrintPattern(int n, int m, boolean flag){

        System.out.print(m +" ");

        if(flag == false && n == m){

            return;
        }

        if(flag == true){

            if(m - 5 > 0){

                naviePrintPattern(n,m-5,true);
            }

            else{

                naviePrintPattern(n,m-5,false);
            }
        }

        else{
        naviePrintPattern(n, m+5, false);
        }
        
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        naviePrintPattern(N,N,true);
    }
}
