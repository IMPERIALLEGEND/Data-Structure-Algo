import java.util.Arrays;
import java.util.Scanner;

public class CaseSenSort {
    private static String caseSort(String s, int n) {

        int lc = 0;
        int uc = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                uc++;
            } else {
                lc++;
            }
        }

        char[] lowerArr = new char[lc];
        char[] upperArr = new char[uc];
        int l = 0, u = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upperArr[u++] = c;
            } else {
                lowerArr[l++] = c;
            }
        }

        Arrays.sort(lowerArr);
        Arrays.sort(upperArr);
        
        StringBuilder ans = new StringBuilder();
        l=0;
        u=0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                ans.append(upperArr[u++]);
            } else {
                ans.append(lowerArr[l++]);
            }
        }
        

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        String ans = caseSort(s, n);

        System.out.println(ans);

        sc.close();

    }
}
