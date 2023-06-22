import java.util.*;

class SimpleRecursion{

    public static void simpleRecursion(int n){
        
        if(n == 0){

            return ;
        }
        System.out.println(n);

        simpleRecursion(n-1);

        System.out.println(n);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        simpleRecursion(n);

        sc.close();
        
    }
}