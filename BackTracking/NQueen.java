import java.util.*;

public class NQueen {
    static boolean[][] board;

    public static boolean isSafe(int row, int col, int n){

        for(int i=0; i<col; i++){
            if(board[row][i]){
                return false;
            }
        }
        for(int i = row, j = col; i>=0 && j >=0; i--, j--){
            if(board[i][j]){
                return false;
            }
        }
        for(int i = row, j = col; i<n && j >=0; i++, j--){
            if(board[i][j]){
                return false;
            }
        }

        return true;
    }

    public static void nQueenUtils(int col, int n, ArrayList<Integer> sol, ArrayList<ArrayList<Integer>> ans){
        if(col == n){
            ans.add(new ArrayList<Integer>(sol));
            
        }

        for(int i=0; i<n; i++){
            if(isSafe(i, col, n)){
                board[i][col] = true;
                sol.add(i+1);
                nQueenUtils(col+1, n, sol, ans);
                sol.remove(sol.size()-1);
                board[i][col] = false;
            }
        }

        
    }

    public static ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        board = new boolean[n][n];
        
        nQueenUtils(0, n, new ArrayList<Integer>(), ans);
        
        

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = nQueen(n);

        for (ArrayList<Integer> ele : ans) {
            System.out.println(ele);
        }
        sc.close();
    }
}
