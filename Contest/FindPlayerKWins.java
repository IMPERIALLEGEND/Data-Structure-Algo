import java.util.ArrayDeque;

public class FindPlayerKWins {

    public static int findPlayerKWins(int[] skills, int k){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int player_1 = 0;
        int player_2 = 1;
        int n = skills.length;
        while(player_1 < n && player_2 < n){
            if(skills[player_1] > skills[player_2]){
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] skills = {4,2,6,3,9};
        int k = 2;


        System.out.println(findPlayerKWins(skills, k));

    }
}
