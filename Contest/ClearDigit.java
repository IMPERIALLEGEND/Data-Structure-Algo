import java.util.Scanner;

public class ClearDigit {

    private static String clearDigit(String s){
        int n = s.length();
        
        StringBuilder sb = new StringBuilder();
        
        
        
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                if(sb.length() != 0){
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
            else{
                sb.append(c);
            }
        }
        
        return sb.length() == 0 ? "" : sb.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(clearDigit(s));
        sc.close();
    }
}
