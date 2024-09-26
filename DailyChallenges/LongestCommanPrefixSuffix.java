import java.util.Scanner;

public class LongestCommanPrefixSuffix {
    public static int lps(String s){
        int i = 1;
        int len = 0;
        int n = s.length();
        int[] storeLength = new int[n];
        while(i < n){
            if(s.charAt(i) == s.charAt(len)){
                storeLength[i] = len;
                i++;
                len++;
            }
            else{
                if(len == 0){
                    i++;
                }
                else{
                    len = storeLength[len-1];
                }
            }
        }
        return storeLength[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(lps(s));

        sc.close();
    }
}
