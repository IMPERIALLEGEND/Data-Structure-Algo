import java.util.Scanner;

public class RepeatingElementArr {

    private static void repeatingElementArr(int[] a, int n){

        int slow = 0;
        int fast = 0;

        do{
            slow = a[slow];
            fast = a[a[fast]];
        }while(slow != fast);

        slow = 0;
        while(slow != fast){
            slow = a[slow];
            fast = a[fast];
        }

        System.out.println(slow);
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        repeatingElementArr(a,n);

        sc.close();
    }
}
