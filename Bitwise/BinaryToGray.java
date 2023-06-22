import java.util.*;

public class BinaryToGray {

    private static void binaryToGray(int n) {

        System.out.println((n ^ (n >> 1)));
        
    }

    public static void main(String[] args) {

        

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        binaryToGray(n);

        sc.close();
    }

}
