import java.lang.reflect.Array;
import java.util.*;

public class LongestSubStringDistinct {

    private static boolean countDistinct(String s, int i, int j) {
        boolean[] visited = new boolean[256];
        for (int k = i; k <= j; k++) {
            if (visited[s.charAt(k)] == true) {
                return false;
            }
            visited[s.charAt(k)] = true;
        }

        return true;
    }

    private static int bflongestSubStringDistinct(String s) {
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

                if (countDistinct(s, i, j)) {
                    result = Math.max(result, j - i + 1);
                }
            }
        }
        return result;
    }

    private static int oplongestSubStringDistinct(String s) {

        int result = 0;
        int i = 0;
        int n = s.length();
        int[] prev = new int[256];
        Arrays.fill(prev, -1);

        for (int j = 0; j < n; j++) {
            i = Math.max(i, prev[s.charAt(j)] + 1);
            int max_end_j = j - i + 1;
            result = Math.max(max_end_j, result);
            prev[s.charAt(j)] = j;

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(bflongestSubStringDistinct(s));
        System.out.println(oplongestSubStringDistinct(s));

        sc.close();
    }
}
