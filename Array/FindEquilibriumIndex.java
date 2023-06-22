public class FindEquilibriumIndex {

    private static void niveSolution(int[] A){

        for(int i=0;i<A.length;i++){

            int left_sum = 0;
            int right_sum = 0;

            for(int j=0;j<i;j++){
                left_sum += A[j];
            }

            for(int j=i+1;j<A.length;j++){
                right_sum += A[j];
            }

            if(left_sum == right_sum) System.out.println(i);
        }
    }

    private static void optimisedSolution(int[] A){

        int sum = 0;
        int n = A.length;
        int left_sum = 0;
        for(int i=0;i<n;i++){

            sum += A[i];
        }

        for(int i=0;i<n;i++){

            sum -=A[i];
            
            if(left_sum == sum){
                System.out.println(i);
            }
            left_sum +=A[i];
        }
        
    }

    public static void main(String[] args) {
        
        int[] A = {-7,1,5,2,-4,3,0};

        niveSolution(A);
        optimisedSolution(A);
    }
}
