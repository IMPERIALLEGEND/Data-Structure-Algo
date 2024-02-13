import java.util.Scanner;

public class Anagram {
    public static boolean checkAnagram(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if (n1 != n2)
            return false;

        int[] count = new int[256];
        int j = 0;

        for (int i = 0; i < n1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            count[c1] ++;
            count[c2] --;

        }

        for(int i=0;i<256;i++){
            if(count[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(checkAnagram(s1, s2));

        sc.close();
    }
}
