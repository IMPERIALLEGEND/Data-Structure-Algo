import java.util.*;

public class CheckStringRotate {
    /*
     * anticlock
     * a = amazon
     * i
     * b = azonam
     * j
     * 
     * clockvise
     * a = amazon
     * b = onamaz
     */
    private static void checkStringRotate(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        boolean isClockwise = true;
        boolean isAntiClockwise = true;
        if (n1 != n2) {
            System.out.print(false);
            return;
        }

        for (int i = 0; i < n1; i++) {
            if (s2.charAt(i) != s1.charAt((i + 2) % n1)) {

                isAntiClockwise = false;
                break;
            }
        }

        for (int i = 0; i < n1; i++) {
            if (s1.charAt(i) != s2.charAt((i + 2) % n1)) {

                isClockwise = false;
                break;

            }
        }

        System.out.println(isAntiClockwise || isClockwise);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        checkStringRotate(s1, s2);

        sc.close();
    }
}
