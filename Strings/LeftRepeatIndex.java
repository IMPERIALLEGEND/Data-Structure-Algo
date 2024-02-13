import java.util.Arrays;
import java.util.Scanner;

public class LeftRepeatIndex {

    private static int bestleftRepeatIndex(String s, int n) {
        int[] alpha = new int[256];
        Arrays.fill(alpha, -1);
        int min_idx = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (alpha[s.charAt(i)] != -1) {
                min_idx = Math.min(min_idx, alpha[s.charAt(i)]);
            } else {
                alpha[s.charAt(i)] = i;
            }

        }

        return min_idx == Integer.MAX_VALUE ? -1 : min_idx;
    }

    private static int betterleftRepeatIndex(String s, int n) {
        boolean[] alpha = new boolean[256];

        int visited = -1;

        for(int i=n-1;i >= 0;i--){

            if(alpha[s.charAt(i)] == true){
                visited = i;
            }
            else{
                alpha[s.charAt(i)] = true;
            }
        }

        return visited;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        // int index = bestleftRepeatIndex(s, n);

        int index = betterleftRepeatIndex(s, n);

        System.out.println(index);

        sc.close();

    }
}
