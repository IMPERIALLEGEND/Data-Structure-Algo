import java.util.Scanner;

public class CheckRotateEqual {

    private static boolean bruteForceCheckRotationEqual(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int no_rotation = 0;
        for (int i = 0; i < n2; i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                
                s1 = rotate(s1, n1);
                no_rotation++;
                i=0;
                if(no_rotation == n1){
                    return false;
                }
            }
            if(i == (n2-1)){
                return true;
            }
        }

        
        return false;
    }

    private static String rotate(String s, int n) {
        String temp = "" + s.charAt(n - 1);

        for (int i = 0; i < n - 1; i++) {
            temp += s.charAt(i);
        }
        return temp;
    }

    private static boolean optimalCheckRotationEqual(String s1, String s2){
        
        String s1_s1 = s1 + s1;

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(bruteForceCheckRotationEqual(s1, s2));
        System.out.println(optimalCheckRotationEqual(s1,s2));

        sc.close();

    }
}
